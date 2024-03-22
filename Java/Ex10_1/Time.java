package Ex10_1;

import java.util.Calendar;
import java.util.Date;

public class Time {
    private int hour, minute, second;
    public Time() {
        Date dt = new Date();
        Calendar cld = Calendar.getInstance();
        cld.setTime(dt);
        hour = cld.get(Calendar.HOUR);
        minute = cld.get(Calendar.MINUTE);
        second = cld.get(Calendar.SECOND);
    }
    public Time(long date) {
        Date dt = new Date(date);
        Calendar cld = Calendar.getInstance();
        cld.setTime(dt);
        hour = cld.get(Calendar.HOUR);
        minute = cld.get(Calendar.MINUTE);
        second = cld.get(Calendar.SECOND);
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setTime(long elapseTime) {
        elapseTime /= 1000;
        second = (int)(elapseTime % 60);
        elapseTime /= 60;
        minute = (int)(elapseTime % 60);
        elapseTime /= 60;
        hour = (int)(elapseTime % 24);
    }
    

}
