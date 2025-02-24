package main;
class  Table
{
    public synchronized void printTable(int n)
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(n*i);
        }
    }
}
class thread3 extends Thread
{
    Table t;
    thread3(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class thread2 extends Thread
{
    Table t;
    thread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(7);
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        Table t = new Table();
        thread3 t1 = new thread3(t);
        thread2 t2 = new thread2(t);

        t1.start();
        t2.start();
    }
}
