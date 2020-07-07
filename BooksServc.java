package java8prj;

import java.util.Collections;
import java.util.List;

public class BooksServc {
	
	static public List<Books> getbookInsort()
	{
	List<Books> bookname = new BookNm().getBooks();	
	Collections.sort(bookname, (obj1,obj2) ->obj2.getName().compareTo(obj1.getName()));
	return bookname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getbookInsort());
}
}

