package Ex9_5;

import java.util.GregorianCalendar;

public class Ex9_5 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(String.format("%d/%d/%d",
                                         calendar.get(GregorianCalendar.YEAR), calendar.get(GregorianCalendar.MONTH), calendar.get(GregorianCalendar.DAY_OF_MONTH)));
        calendar.setTimeInMillis(1234567898765L);
        System.out.println(String.format("%d/%d/%d",
                                         calendar.get(GregorianCalendar.YEAR), calendar.get(GregorianCalendar.MONTH), calendar.get(GregorianCalendar.DAY_OF_MONTH)));
    }
}
