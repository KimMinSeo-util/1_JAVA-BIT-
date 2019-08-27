package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dao.BookDAO;
import service.BookService;
import service.BookServiceImpl;
import vo.BookVO;

public class Test11_bookService {

	BookService service = null;
	
	@Before
	public void setUp() {
		System.out.println(" setUp() 수행 ");
		BookDAO dao = new BookDAO();
		service = new BookServiceImpl(dao);
	}
	
	@After
	public void tearDown() {
		service = null;
		System.out.println("======= tearDown() 호출  ======");
	}
	
	@Test
	public void list() {
		System.out.println("==========  Book List ===========");
		service.bookList().forEach(i -> System.out.println(i));
		System.out.println("=================================");
	}
	
	//@Test
	public void insert() {
		BookVO vo = new BookVO();
		vo.setBookid(6);
		vo.setBookname("~~~~~");
		vo.setPrice(-900);
		vo.setPublisher("영진출판사");
		int num=0;
		try {
			num = service.addBook(vo);
		} catch (Exception e) {

		}
		if(num > 0) System.out.println("등록 성공");
		else {
			System.out.println("등록 실패");
		}
	}

	//@Test
	public void update() {
		BookVO vo = new BookVO();
		vo.setBookid(6);
		vo.setPrice(9900);
		service.updateBook(vo);
	}
	//@Test
	public void delete() {
		service.deleteBook(6);
	}
}









