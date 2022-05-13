package com.haowei.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "08:00";
        String leaveTime = "11:00";
        //Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d = null;
        try {
            d = sdf.parse(enterTime);
        } catch (Exception e){
            System.out.println("Wrong Format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        try {
            Date d2 = sdf.parse(leaveTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            long ms = d2.getTime() - d.getTime();
            int minutes = (int)(ms/(1000*60));
            System.out.println(minutes);
        } catch (Exception e) {
            System.out.println("Wrong Format");
        }
        //Date d2 = new Date();
        //long a = 3*60*60*1000;
    }
}
