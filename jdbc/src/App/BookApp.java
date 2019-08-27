package App;

import service.BookService;

public class BookApp {
	public static void main(String[] args) {

		 BookService service = null;
		 
		// service.addBook(vo)
		
		 service.bookList().forEach(i->System.out.println(i));
		
	}
}
