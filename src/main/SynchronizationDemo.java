package main;
// Synchronized method in java
//class  Table
//{
//    public synchronized void printTable(int n)
//    {
//        for (int i = 0; i <= 10; i++)
//        {
//            System.out.println(n*i);
//        }
//    }
//}
//class thread3 extends Thread
//{
//    Table t;
//    thread3(Table t)
//    {
//        this.t=t;
//    }
//    public void run()
//    {
//        t.printTable(5);
//    }
//}
//class thread2 extends Thread
//{
//    Table t;
//    thread2(Table t)
//    {
//        this.t=t;
//    }
//    public void run()
//    {
//        t.printTable(7);
//    }
//}
//public class SynchronizationDemo {
//    public static void main(String[] args) {
//        Table t = new Table();
//        thread3 t1 = new thread3(t);
//        thread2 t2 = new thread2(t);
//
//        t1.start();
//        t2.start();
//    }
//}







//class evenOrodd
//{
//    public synchronized void printNum(int n)
//    {
//        if(n%2==0)
//        {
//            System.out.println("Even number");
//        }
//        else {
//            System.out.println("Odd number");
//        }
//    }
//}
//class thread11 extends Thread
//{
//    evenOrodd e;
//    thread11(evenOrodd e)
//    {
//        this.e = e;
//    }
//    public void run()
//    {
//        e.printNum(6);
//    }
//}
//class thread12 extends Thread
//{
//    evenOrodd e;
//    thread12(evenOrodd e)
//    {
//        this.e = e;
//    }
//    public void run()
//    {
//        e.printNum(7);
//    }
//}
//
//class  SynchronizationDemo {
//    public static void main(String[] args) {
//        evenOrodd e = new evenOrodd();
//        thread11 t1 = new thread11(e);
//        thread12 t2 = new thread12(e);
//        t1.start();
//        t2.start();
//    }
//}



/*  Synchronized block in java
class  msg
{
    public void show(String name)
    {
        ;;;;;;;;;;;
        synchronized (this)
        {
            for(int i=1; i<=3; i++)
            {
                System.out.println("How are you "+name);
            }
        }
        ;;;;;;;;;;;;;;;;;;
    }
}
class Thread11 extends Thread
{
    msg m;
    String name;
    Thread11(msg m, String name)
    {
        this.m = m;
        this.name = name;
    }
    public void run()
    {
        m.show(name);
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        msg m = new msg();
        Thread11 t1 = new Thread11(m, "Akhilesh");
        Thread11 t2 = new Thread11(m, "Abhishek");
        t1.start();
        t2.start();
    }
}
}
 */