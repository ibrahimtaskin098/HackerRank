package calendarpractice;


import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalenderPractice {
       public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      cal.add(Calendar.DATE, 0);
           System.out.println(cal.getTime());
      SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-hh");
      String formatted = format1.format(cal.getTime());
           System.out.println(formatted);
    }
}
