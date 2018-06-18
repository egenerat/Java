import java.util.ArrayList;

public class TypeInference {
    public static void main(String... args) {
        var list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        for (var i: list) {
            System.out.println(i);
        }

        // Correctly infers java.lang.String
        System.out.println(list.get(0).getClass().getName());
    }
}