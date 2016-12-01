pubic class ReferenceBook extends LibraryBook {
    private String collection;

    public referencebook (String aut, String tle, int num, String call, String col){
	super.librarybook(aut, tle, num, call);
	collection = col;
    }

    public String getCollection () {
	return collection;
    }

    public boolean setCollection (String col) {
	collection = col;
	return true;
    }

    public void checkout () {
	return ("Patron CANNOT check out a REFERENCE book");
    }

    public void returned () {
	return ("reference book could NOT have been checked out -- return IMPOSSIBLE");
    }

    public String circulationStatus () {
	return ("non-circulating reference book");
    }

    public String toString () {
	return (super.toString +  ", " + getCollection());
	
    }
    
}
					 
