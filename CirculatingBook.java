public class CirculationBook extends Librarybook {
    private String currentHolder;
    private String dueDate;
    
    public circulation (String aut, String tle, int mun, String call, String curr, Sting due) {
	super.librarybook (aut,tle,num,call);
	currentHolder = curr;
	dueDate = due;
    }

    public String getCurrentHolder () {
	return currentHolder;
    }

    public String getDueDate () {
	return dueDate;
    }

    public boolean setCurrentHolder (String curr) {
	currentHolder = curr;
	return true;
    }

    public boolean setDueDate (String due) {
	dueDate = due;
	return true;
    }

    public void checkout (String patron, String due) {
	setCurrentHolder (patron);
	setDueDate (due);
    }

    public void returned () {
	setCurrentHolder ("");
	setDueDate ("");
    }

    public String circulationStatus () {
	if (getCurrentHolder() == "") {
	    return ("Book is available on shelves!");
	}
	else {
	    return ("Current Holder: " + getCurrentHolder + "    DUE: " + getDueDate);
	}
    }
				      

    public String toString () {
	return (super.toString() + ", " + getCurrentHolder() + ", " + getDueDate);
    }

	
	
														    
    


    
}
