package exceptionhandling;

/* Throw keyword   - they are showing error of which Exception in thread "main"  in this way they are sow error */
public class Throw {
    public static void main(String[] args) {
//        System.out.println(10/0);

        throw new ArithmeticException("Arithmetic Error / by zero");
    }
}

