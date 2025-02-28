package questionanswer;

public class ReverseString {
    public static void main(String[] args) {
        int l;
        String r="Learn Java";
        String r1="";
        l=r.length();

        for(int i=l-1; i>=0; i--)
        {
            r1=r1+r.charAt(i);
        }
        System.out.println(" After Reverse String is : "+r1);
    }
}
