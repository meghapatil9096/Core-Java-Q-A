package main;
class All extends Thread
{
    public void run()
    {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Pooja ");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Thread1  {
    public static void main(String[] args)throws InterruptedException {
        All a = new All();
        a.start();

        for (int i=0; i<5;i++)
        {
            System.out.println("Pravin ");
            Thread.sleep(1000);
        }
    }
}
