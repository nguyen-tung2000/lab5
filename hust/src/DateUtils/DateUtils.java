package DateUtils;

import time.time;
public class DateUtils{
    public static int compareTime(time d1,time d2){
        int n;
        if(d1.getYear()>d2.getYear()){
            n=1;
        }
        else if(d1.getYear()<d2.getYear()){
            n=-1;
        }
        else{
            if(d1.getMonth()>d2.getMonth()){
                n=1;
            }
            else if(d1.getMonth()<d2.getMonth()){
                n=-1;
            }
            else{
                if(d1.getDay()>d2.getDay()){
                    n=1;
                }
                else if(d1.getDay()<d2.getDay()){
                    n=-1;
                }
                else{
                    n=0;
                }
            }
        }
        return n;
    }
    public static void swapTime(time a,time b){
        time c=new time();
        c.setDay(a.getDay());
        c.setMonth(a.getMonth());
        c.setYear(a.getYear());
        a.setDay(b.getDay());
        a.setMonth(b.getMonth());
        a.setYear(b.getYear());
        b.setDay(c.getDay());
        b.setYear(c.getYear());
        b.setMonth(c.getMonth());
    }
    public static void Sapxep(time [] tg){
        for(int i=0;i<tg.length-1;i++){
            for(int j=0;j<tg.length-i-1;j++){
                if(compareTime(tg[j],tg[j+1])>0){
                    swapTime(tg[j],tg[j+1]);
                }
            }
        }
    }
    public static void printArrayTime(time [] tg){
        for(int i=0;i<tg.length;i++){
            System.out.println(tg[i].getTime());
        }
    }

}