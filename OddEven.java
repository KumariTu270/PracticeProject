package AkshaySir;

import java.util.Scanner;

class MyThread extends Thread{
    int flag;
    int number;
    MyThread(int n)
    {
        flag = n%2;
        number = n;
        start();
    }

    void odd(){
        System.out.println("\nODD NUMBERS ARE : ");
        for(int i = 1 ; i<=number ; i=i+2){
            System.out.println(i);
        }
    }

    void even(){
        System.out.println("\nEVEN NUMBERS ARE : ");
        for(int i = 2 ; i<= number ; i=i+2){
            System.out.println(i);
        }
    }

    @Override
    public void run() {
        if(flag==0){
            even();

        }
        else{
            odd();
        }

    }
}

public class OddEven {

    public static void main(String []args){


        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the number : ");
            int n = scanner.nextInt();
            MyThread thread1 = new MyThread(n);
            thread1.sleep(1000);
            MyThread thread2 = new MyThread(n-1);

            System.out.println("Number of Active Thread count : "+Thread.activeCount());
        }
        catch (Exception e)
        {
            System.out.println("Not a number ");
        }
    }

}
