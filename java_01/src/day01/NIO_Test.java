package day01;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ScatteringByteChannel;

//http://blog.naver.com/pions01?Redirect=Log&logNo=136524363
public class NIO_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("test.txt");
		ScatteringByteChannel channel = fi.getChannel();
		
		ByteBuffer header = ByteBuffer.allocateDirect(100);
		ByteBuffer body = ByteBuffer.allocateDirect(200);
		ByteBuffer[] buffers = {header,body};

		int readCount = (int) channel.read(buffers);
		channel.close();
		
		System.out.println("READ COUNT : "+readCount);
		header.flip();
		body.flip();
		byte[] b = new byte[100];
		header.get(b);
		System.out.println("HEADER : "+new String(b));
		System.out.println("=======================");
		byte[] bb = new byte[200];
		body.get(bb);
		System.out.println("BODY : "+new String(bb));

	}

}
