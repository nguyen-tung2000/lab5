package TestPassingParameter;

import DigitalVideoDisc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("jungle","Animation","Nguyen Thanh Tung",120,19.99f);
        DigitalVideoDisc Bo_GiaDVD= new DigitalVideoDisc("Bo_gia","family","Nguyen Thanh Tung",100,9.99f);
        swap(jungleDVD,Bo_GiaDVD);
        System.out.println("jungleDVD  title"+ jungleDVD.getTitle());
        System.out.println("Bo_GiaDVD title"+ Bo_GiaDVD.getTitle());
        changeTitle(jungleDVD,Bo_GiaDVD.getTitle());
        System.out.println("jugle DVD title"+jungleDVD.getTitle());
    }
    public static void swap(Object o1,Object o2){
       DigitalVideoDisc d1 = (DigitalVideoDisc)o1;
       DigitalVideoDisc d2 = (DigitalVideoDisc)o2;
       if(d1!=null && d2!=null){
           String tmp =d1.getTitle();
           d1.setTitle(d2.getTitle());
            d2.setTitle(tmp);
       }
       else if(d1==null&&d2!=null){
            d1.setTitle(d2.getTitle());
            d2.setTitle(null);
       }
       else if(d2==null&&d1!=null){
           d2.setTitle(d1.getTitle());
           d1.setTitle(null);
       }
       else {
           System.out.println("errol two variable is null");
       }
    }
    public static void changeTitle(DigitalVideoDisc dvd,String title){
        String oldTitle =dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
    
}
