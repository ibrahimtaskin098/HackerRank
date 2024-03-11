package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
    //Atributes
    Map<String,Book> bookCollection = new HashMap<>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;
    //Constructor
    public LibraryCatalogue(Map<String,Book> bookCollection) {
        this.bookCollection = bookCollection;
    }
    public LibraryCatalogue(Map<String,Book> bookCollection ,
    int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay){
        
    this.bookCollection = bookCollection;
    this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
    this.initialLateFee = initialLateFee;
    this.feePerLateDay = feePerLateDay;
}
    //getter
    public Map<String,Book> getBookCoollection(){
        return this.bookCollection;
    }
    public Book getBook(String bookTitle){
       return getBookCoollection().get(bookTitle);
    }
    public int getCurrentDay(){
        return this.currentDay;
    }
    public int getLengthOfCheckoutPeriod(){
        return this.lengthOfCheckoutPeriod;
    }
    public double getInitialLateFee(){
        return this.initialLateFee;
    }
    public double getFeePerLateDay(){
        return this.feePerLateDay;
    }
    //setters
     public void nextDay(){
         this.currentDay++;
     }
     public void setDay(int day){
         this.currentDay = day;
     }
    //Instance method;
     public void checkOutBook(String title){
       Book book = getBook(title);
       if(book.isCheckedOut){
           sorryBookAlreadyCheckedOut(book);
       }else{
           book.setIsCheckedOut(true, currentDay);
           System.out.println("You just checkeout "+title+
             ". It is on day "+(getCurrentDay()+ getLengthOfCheckoutPeriod())+".");
       }
     }
     
     public void returnBook(String title){
         Book book = getBook(title);
         int daysLate = currentDay - (book.getDayCheckedOut()+ getLengthOfCheckoutPeriod());
         if(daysLate>0){
             System.out.println("You owe the library $"
            + (getInitialLateFee()+ daysLate*getFeePerLateDay())+ " ,beause yor book is "+daysLate+" days overdue.");
         }else{ 
             System.out.println("Book return. Thank you.");
         }
         book.setIsCheckedOut(false, -1);
     }
    
    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry. "+book.getTitle()+" is already checkedout."
        +" It should be back on day "+ book.getDayCheckedOut()+getLengthOfCheckoutPeriod()+".");
    }
    
    public static void main(String[] args){
         Map<String,Book> bookCollection = new HashMap<>();
         Book harry = new Book("Harry Potter",123455, 99999);
         bookCollection.put("Harry Potter", harry);
         LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
         lib.checkOutBook("Harry Potter");
         lib.nextDay();
         lib.nextDay();
         lib.checkOutBook("Harry Potter");
         lib.setDay(17);
         lib.returnBook("Harry Potter");
         lib.checkOutBook("Harry Potter");
         lib.returnBook("Harry Potter");
         lib.sorryBookAlreadyCheckedOut(harry);
       
    }
    
    
}
