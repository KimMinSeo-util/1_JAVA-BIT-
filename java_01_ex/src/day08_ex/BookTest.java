package day08_ex;

public class BookTest {
	public static void main(String[] args) {
        BookMgr mgr = new BookMgr(5);
        mgr.addBook(new Book("JAVA",29000));
        mgr.addBook(new Book("DB",19000));
        mgr.addBook(new Book("SQL",9000));
        mgr.addBook(new Book("Html5",1700));
        mgr.addBook(new Book("JSP",39000));
        mgr.addBook(new Book("Spring",42000));
        
        
        //System.out.println(Arrays.toString(mgr.getBookList()));
        
        mgr.bookListPrint();
        System.out.println("총합계 : "+mgr.bookTotalPrice());
	}
}
