package temp;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawImage extends Frame implements ActionListener {
	private Button openButton; // 버튼
	private Image image; // 이미지

	public DrawImage() {
		makeUI();
	}

	// UI 구성
	private void makeUI() {

		this.setTitle("Image Canvas");
		this.setLayout(new BorderLayout());
		this.setSize(500, 500);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {

				System.exit(0);

			}

		});

		// 이미지 불러오기 버튼

		openButton = new Button("Load Image");

		openButton.addActionListener(this);

		this.add(openButton, BorderLayout.NORTH);

		this.setVisible(true);

	}

	// 버튼 눌렸을 때 처리

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == openButton) {
			// 파일 선택 다이얼로그 생성
			FileDialog fd = new FileDialog(this);
			fd.setTitle("Select Image");
			fd.setSize(300, 100);
			fd.setVisible(true);

			// 파일 선택 후 이미지 불러오기
			loadImage(fd.getDirectory() + fd.getFile());
		}
	}

	// 이미지 불러오기

	private void loadImage(String filePath) {

		// 파일 다이얼로그로부터 선택된 파일 경로로 이미지 파일 생성
		Image img = Toolkit.getDefaultToolkit().getImage(filePath);

		// null이 아니면 전역 변수에 할당
		if (img != null)
			image = img;
		
		repaint();
	}

	// 그리는 메소드
	public void paint(Graphics g) {
		// 이미지가 null이 아니면 이미지 그리기
		if (image != null)
			// 파라미터: 이미지, X좌표, Y좌표, 이미지 관찰자(생략 가능)
			g.drawImage(image, 0, 50, this);

	}
	public static void main(String[] args) {
		new DrawImage();
	}
}
