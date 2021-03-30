package Oder;
import java.util.Random;
import time.time;
import DigitalVideoDisc.DigitalVideoDisc;
public class Oder {
    public static final int MAX_NUMBER_ODERED = 10;
    private DigitalVideoDisc [] itemOdered =new DigitalVideoDisc[MAX_NUMBER_ODERED];
    private int qtyOdered=0;
    private time dateOdered = new time();
    public final static int MAX_LIMITED_ODER = 5;
    private static int nbOders = 0;
    public int getQtyOdered(){
        return qtyOdered;
    }
    public void setQtyOdered(int qtyOdered){
        this.qtyOdered=qtyOdered;
    }
    private void addDigitalVideoDiscs(DigitalVideoDisc dia){
        if(qtyOdered<MAX_NUMBER_ODERED){
            itemOdered[qtyOdered]=dia;
            qtyOdered++;
        }
        else{
            System.out.println("Gio hang day toi da chi chua 10 DVD");
        }
    } 
    public void addDigitalVideoDisc(DigitalVideoDisc dia){
        if(qtyOdered<MAX_NUMBER_ODERED && nbOders<5){
            itemOdered[qtyOdered]=dia;
            qtyOdered++;
            nbOders++;
            dateOdered = new time();
        }
        else if(qtyOdered>=MAX_NUMBER_ODERED){
            System.out.println("Gio hang day toi da chi chua 10 DVD");
        }
        else if(nbOders>=5){
            System.out.println("Ban da order qua 5 lan trong mot gio hang");
        }

    } 
    public void addDigitalVideoDisc(DigitalVideoDisc [] disc){
        if((qtyOdered+disc.length)<MAX_NUMBER_ODERED && nbOders<5){
            for(int i=0;i<disc.length;i++){
                addDigitalVideoDiscs(disc[i]);
            }
            nbOders++;
            dateOdered=new time();
        }
        else if((MAX_NUMBER_ODERED-qtyOdered)<disc.length){
            for(int i=0;i<(MAX_NUMBER_ODERED-qtyOdered);i++){
                addDigitalVideoDiscs(disc[i]);
            }
            nbOders++;
            dateOdered = new time();
            System.out.println("Gio hang day.Mot so dia chua add:");
            for(int i=(MAX_NUMBER_ODERED-qtyOdered);i<disc.length;i++){
                System.out.println(disc[i].getTitle());
            }
        }
        else {
            System.out.println("Gio hang day.");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc1,DigitalVideoDisc disc2){
        if(qtyOdered<MAX_NUMBER_ODERED &&nbOders<5){
            addDigitalVideoDiscs(disc1);
        }
        else if(qtyOdered>=MAX_NUMBER_ODERED){
            System.out.println("item quantity has reached its limit.");
        }
        if(qtyOdered<MAX_NUMBER_ODERED){
            addDigitalVideoDiscs(disc2);
            nbOders++;
            dateOdered = new time();
        }
        else if(qtyOdered>=MAX_NUMBER_ODERED){
            System.out.println("The dvd"+disc2.getTitle()+ " could not be added");
        }
        
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc dia){
        for(int i=0;i<=qtyOdered;i++){
            if(dia == itemOdered[i]){
                for(int j=i;j<qtyOdered-1;j++){
                    itemOdered[j]=itemOdered[j+1];
                }
                qtyOdered--;
            }
        }
    }
    public float totalCost(){
        float tongTien =0.0f;
        for(int i=0;i<qtyOdered;i++){
            tongTien = tongTien + itemOdered[i].getCost();
        }
        return tongTien;
    }
    public void Odered_list(){
        System.out.println("***********Ordered***********");
        System.out.println(dateOdered.getTime());
        for(int i=0;i<qtyOdered;i++){
            System.out.println((i+1)+". DVD "+itemOdered[i].getTitle()+"  "+itemOdered[i].getCategory()+ "  "+ itemOdered[i].getDirector()+"  "+ itemOdered[i].getLength()+ ":"+ itemOdered[i].getCost());
        }
        System.out.println(totalCost());
    }
    public DigitalVideoDisc getAluckyItem(){
        Random ran = new Random();
        int value =ran.nextInt(qtyOdered)+1;
        System.out.println("Ban da duoc mien phi dia:"+itemOdered[value].getTitle());
        System.out.println("Tong so tien phai thanh toan:");
        for(int i=0;i<qtyOdered;i++){
            if(i==value){
                System.out.println((i+1)+". DVD"+itemOdered[i].getTitle()+" "+itemOdered[i].getCategory()+" "+ itemOdered[i].getDirector()+" "+itemOdered[i].getLength()+":"+ 0);
            }
            else {
                System.out.println((i+1)+". DVD"+itemOdered[i].getTitle()+" "+itemOdered[i].getCategory()+" "+ itemOdered[i].getDirector()+" "+itemOdered[i].getLength()+":"+ itemOdered[i].getCost());
            }
        }
        System.out.println("Tong so tien ban phai tra:"+(totalCost()-itemOdered[value].getCost()));
        return itemOdered[value];
    }
}
