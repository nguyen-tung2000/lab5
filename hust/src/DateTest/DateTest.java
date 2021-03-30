package DateTest;

import DateUtils.DateUtils;
import time.time;
public class DateTest {
    public static void main(String [] args){
          //test chuoi ngay thang ---->Ngay thang
          time Stime =new time("first","July","twenty nineteen");
          assert Stime.getDay()== 1 : "Ket qua sai";
          assert Stime.getMonth()==7:"Ket qua sai";
          assert Stime.getYear()==2019:"Ket qua sai";
          //test print :tra ve chuoi ngay hien tai
          // Stime.print();
          //Sap xep theo thu tu tang dan
          time t1 =new time();
          time t2 =new time("first","July","twenty twenty_four");
        //   System.out.println(t2.getTime());
          time t3 =new time("second","June","twenty ten"); 
          System.out.println(t3 instanceof time);
          time [] arr={t1,t2,t3};
          //test ham so sanh mang
          System.out.println(DateUtils.compareTime(t1, t2));// t1 = t2 tra ve 0, t1 <t2 tra ve -1, t1>t2 tra ve 1
          System.out.println(DateUtils.compareTime(t2,t3));
          System.out.println(t1.getTime());
          //test ham doi cho
          DateUtils.swapTime(t1, t2);
          System.out.println(t1.getTime());
          System.out.println(t2.getTime());
          //test ham sap xep mang
          System.out.println("Mang truoc khi sap xep:");
          DateUtils.printArrayTime(arr);
          System.out.println("mang sau khi sap xep:");
         DateUtils.Sapxep(arr);
         DateUtils.printArrayTime(arr);   
    }
}
