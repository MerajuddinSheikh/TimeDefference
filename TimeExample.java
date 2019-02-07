package timeexample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeExample {
    public static void main(String[] args) throws Exception{

        String time1="23:30";
        String time="10:30";
        String time2 ="8:00";
        String time3="21:30";
        String time4="23:59";
        DateFormat forma = new SimpleDateFormat("hh:mm");
        Date dat1=forma.parse(time1);
        long diffHours = dat1.getTime()/ (60 * 60 * 1000)% 24;
        Date dat2 =forma.parse(time);
        long diff=dat2.getTime()/ (60 * 60 * 1000)% 24;
        Date dat3=forma.parse(time2);
        long deff3=dat3.getTime()/(60 * 60 * 1000)% 24;
        long diff4=diffHours -diff;
        System.out.println(diff4);



        if(diff4 >= deff3){
            System.out.println("yes");
        }else{

            System.out.println("no");
        }

        System.out.println(diff);

        System.out.println(diffHours);






    }
}
