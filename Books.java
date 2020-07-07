package java8prj;

public class Books {
	int id;
    private String name;
	int pageno;
	Books(String bokname,int bookno,int pgno)
	{
		this.name=bokname;
		this.id=bookno;
		this.pageno=pgno;
		
	}
	public String getName()
	{
		return this.name;
	}
	@Override
	public String toString()
	{
		return "Books[booknme="+name+"book id="+id+"book pageno="+pageno+"]";
	}

}
