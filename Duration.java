package designinghotel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Duration {
   Date startDate;
   Date endDate;

   public int totalDays(Date startDate , Date endDate){
       int diff = (int)(endDate.getTime() - startDate.getTime());
       int days = (diff / (1000*60*60*24));
       return  days;
   }
   public int weekendDays(Date startDate , Date endDate){
       DateFormat df = new SimpleDateFormat("E");
       String str2 = df.format(startDate);
       int days = totalDays(startDate , endDate);
       int weekends = 0;
       while(days>0) {
           if (str2.equalsIgnoreCase("Sat") || str2.equalsIgnoreCase("Sun")) {
               ++weekends;
           }
           days--;
       }
       return weekends;
   }

   public int weekDays(Date startDate , Date endDate){
       return totalDays(startDate , endDate) - weekendDays(startDate , endDate);

   }

    int[] getWeeekDayWeekendDay(String[] str) {
        int[] arr = new int[]{0, 0};
        Date date1 = null;
        for (int i = 0; i < str.length; i++) {
            try {
                date1 = new SimpleDateFormat("dd/MM/yyyy").parse(str[i]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            DateFormat df = new SimpleDateFormat("E");
            String str2 = df.format(date1);
            if (str2.equalsIgnoreCase("Sat") || str2.equalsIgnoreCase("Sun"))
                arr[1]++;
            else
                arr[0]++;
        }
        return arr;
    }

}
