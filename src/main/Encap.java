package main;

class A
{
    private  int value;

    public void setdata(int x)
    {
        value = x;
    }
    public int getdata()
    {
        return value;
    }
}
class Encap
{
    public static void main(String[] args) {
        A a=new A();
        a.setdata(100);
        System.out.println(a.getdata());
    }
}