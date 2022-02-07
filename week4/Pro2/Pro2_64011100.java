package Pro2;
import java.util.GregorianCalendar;

public class Pro2_64011100 {

    public static void main(String[] args) {
        
        GregorianCalendar Calendar1 = new GregorianCalendar();

        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + Calendar1.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + Calendar1.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + Calendar1.get(GregorianCalendar.DATE));
        System.out.println("Year of week is  " + Calendar1.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------");

        Calendar1.add(GregorianCalendar.DATE,1);
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + Calendar1.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + Calendar1.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + Calendar1.get(GregorianCalendar.DATE));
        System.out.println("Year of week is  " + Calendar1.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(Calendar1.getTime());

       
    }


    
}
