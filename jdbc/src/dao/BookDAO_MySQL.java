package dao;

import java.util.ArrayList;
import java.util.List;

import vo.BookVO;

public class BookDAO_MySQL extends BookDAO {
	
 	public List<BookVO> getBookRec(){
 		System.out.println("BookDAO_MySQL getBookRec ");
 		List<BookVO> list = new ArrayList<BookVO>();

 		return list;
	}
	public int insertBook(BookVO vo) {
 		System.out.println("BookDAO_MySQL insertBook ");
		return 0;
	}
	public int deleteBook(int bookid) {
 		System.out.println("BookDAO_MySQL deleteBook ");
		return 0;
	}
	public int updateBook(BookVO vo) {
 		System.out.println("BookDAO_MySQL updateBook ");
		return 0;
	}
}
