public class LibraryBook extends Book{
    private String callnumber;

    public librarybook (String aut, String tle, int num,String call) {
	super.book(aut,tle,num)
	callnumber = call;
    }

    public String getCallNumber () {
	return callnumber;
	}

    public boolean setCallNumber (String call) {
	callnumber = call;
	return true;
    }
    
    abstract void checkout(String patron, String due){
    }
    
    abstract void returned(){
    }
    
    abstract String circulationStatus(){
    }

    public int compareTo (){
	return 1;
    }

    public String toString () {
	return (super.toString() + ", "circulationStatus() + ", " + getCallNumber());
	    }
	
}

    
