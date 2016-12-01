public class Book {
    private String author;
    private String title ;
    private int isbn;

    public book () {
	author = "Unknown";
	title = "Unknown";
	isbn = 0000000000;
    }

    public book (String aut, String tle, int num) {
	author = aut;
	title = tle;
	isbn = num;
    }

    public String  getAuthor () {
	return author;
    }

    public String getTitle () {
	return title;
    }

    public int getIsbn () {
	return isbn;
    }

    public boolean setAuthor (String aut) {
	author = aut;
	return true;
    }

    public boolean setTitle (String tle) {
	title = tle;
	return true;
    }

    public boolean setIsbn (int num) {
	isbn = num;
	return true;
    }

    public Stirng toString () {
	return ("" + getTitle() + ", " + getAuthor() + ", " + getIsbn())
	    }

    
	
}
