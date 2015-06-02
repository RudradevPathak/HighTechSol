package com.rudra.oddeventhread;


public class OddEvenNumber {


public static synchronized void  main(String[] args) {
        EvenPrint ep = new EvenPrint();
        OddPrint op = new OddPrint();
        Thread te = new Thread(ep);
        Thread to = new Thread(op);
        to.start();
        te.start();
 
    
} 
}
class OddPrint implements Runnable {
	 
    public static boolean flag = true;
 
    public void run() { 
        for (int i = 1; i <= 99;) {
            if (flag) {
                System.out.println(i);
                flag = false;
                i = i + 2;
            } 
        } 
    } 
}

    class EvenPrint implements Runnable {
        public void run() { 
            for (int i = 2; i <= 100;) {
                if (!OddPrint.flag) {
                    System.out.println(i);
                    OddPrint.flag = true;
                    i = i + 2;
                } 
            } 
     
        } 

    }

