package Ex10_1;

public class Ex10_1 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000L);
        System.out.println(String.format("Time1 is %02d:%02d:%02d", t1.getHour(), t1.getMinute(), t1.getSecond()));
        System.out.println(String.format("Time2 is %02d:%02d:%02d", t2.getHour(), t2.getMinute(), t2.getSecond()));

    }
}
