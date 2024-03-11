
package librarycatalogue;


public class Book {
    // Books attributes
    String title;
    int pageCount;
   long ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;
    // constructor 
    public Book(String bookTitle, int bookPageCount, int bookISBN){
    this.title = bookTitle;
    this.pageCount = bookPageCount;
    this.ISBN = bookISBN;
    this.isCheckedOut = false;
   
}
    // getters 
    public String getTitle(){
        return this.title;
    }
    public int getPageCount(){
        return this.pageCount;
    }
    public long getISBN(){
        return this.ISBN;
    }
    public boolean getIsCheckedOut(){
        return this.isCheckedOut;
    }
    public int getDayCheckedOut(){
        return this.dayCheckedOut;
    }
    
    // setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut){
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    private void setDayCheckedOut(int day){
        this.dayCheckedOut = day;
    }
    
}
