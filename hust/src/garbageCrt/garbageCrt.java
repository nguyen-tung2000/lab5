package garbageCrt;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

import java.io.FileNotFoundException;

public class garbageCrt {
  public static void main(String[ ] args) {

    File d = new File("nguyentung.txt");
    if (!d.exists())
    	d.mkdir();

     try {
        Formatter f = new Formatter("nguyentung.txt");
        f.format("Nguyen thanh tung\r\n");
        f.format("%s %s %s", "1","John", "Smith \r\n");
        f.format("%s %s %s", "2","Amy", "Brown");

	    f.close();

	} catch (FileNotFoundException e) {
	    System.out.println("Error");
	}

     try {
    	  File x = new File("C:\\xuanthulab.net\\test.txt");
    	  Scanner sc = new Scanner(x);
    	  String content = "";
    	  while(sc.hasNextLine()) {
    		  content += sc.nextLine()+"\r\n";
    	  }
  	      System.out.println(content);

    	  sc.close();
    	} catch (FileNotFoundException e) {
    	  System.out.println("Error");
    	}
  }
}