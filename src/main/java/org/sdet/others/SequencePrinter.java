package org.sdet.others;

public class SequencePrinter {
    private int count = 1;
    private final int limit;

    public SequencePrinter(int limit){
        this.limit = limit;
    }

    public synchronized void  printEven(){
        while(count <=limit){
            while(count%2 !=0 ){
                try {
                    wait();
                } catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            if(count <=limit){
                System.out.print(Thread.currentThread().getName());
                System.out.println(" :" + count);
                count++;
                notifyAll();
            }
        }

    }

    public synchronized void  printOdd(){
        while(count <=limit){
            while(count%2 ==0 ){
                try {
                    wait();
                } catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            if(count <=limit){
                System.out.print(Thread.currentThread().getName());
                System.out.println(" :" + count);
                count++;
                notifyAll();
            }
        }

    }
    public static void main(String[] args){
        SequencePrinter printer = new SequencePrinter(20);
        Thread even = new Thread(printer::printEven, "EvenThread");
        Thread odd = new Thread(printer::printOdd, "OddThread");
        even.start();
        odd.start();
    }
}
