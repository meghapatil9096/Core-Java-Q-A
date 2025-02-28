package questionanswer;
// using StringBuffer And StringBuilder
public class ReverseString1 {
    public static void main(String[] args) {

        StringBuffer r = new StringBuffer("Learning Java");
        System.out.println("String Reverse Using StringBuffer is : "+r.reverse());

        StringBuilder r1 = new StringBuilder("Java is Simple Language");
        System.out.println("String Reverse Using StringBuilder is :"+r1.reverse());
    }
}
