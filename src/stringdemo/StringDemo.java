package stringdemo;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("String length : "+str.length());
        System.out.println("5 number character in string : "+str.charAt(5));

        System.out.println("Substring form string starting to end index : "+str.substring(0,3));
        System.out.println("Substring form string : "+str.substring(5));

        System.out.println("String upper case : "+str.toUpperCase());
        System.out.println("String lower case : "+str.toLowerCase());

//        checking content boolean
        System.out.println("checking starting string is Java or not : "+str.startsWith("Java"));
        System.out.println("checking ending string is Programming or not : "+str.endsWith("Programming"));
        System.out.println("checking contain string : "+str.contains("ing"));

//        finding position
        System.out.println("finding position first occurrence a in string : "+str.indexOf("a"));
        System.out.println("finding position last occurrence a in string : "+str.lastIndexOf("a"));

        System.out.println("replace string a with o : "+str.replace("a","o"));

    }
}
