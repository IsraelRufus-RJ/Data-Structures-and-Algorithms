package string;

public class StringFunctions {
    public static void main(String[] args) {
        String name = "Java Programming";

        System.out.println(System.identityHashCode(name) + "\n" + name.toLowerCase() + "\n" + name.toUpperCase());
        name="kl";
        name = new String("Java Programming");
        //name = "Java Programming";
        System.out.print(System.identityHashCode(name));
    }
}
