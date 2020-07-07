package java8prj;

import java.util.ArrayList;
import java.util.List;

public class BookNm 
{
	public List<Books> getBooks()
	{
	List<Books> book=new ArrayList();
	book.add(new Books("java",1,1));
	book.add(new Books("angular",2,7));
	book.add(new Books("mongoDb",3,88));
	return book;
	}
}
