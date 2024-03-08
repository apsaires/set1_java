import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }

        System.out.println("-----------------------");

        Set<String> set1 = new TreeSet<>();

        set1.add("Tv");
        set1.add("Tablet");
        set1.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p : set1) {
            System.out.println(p);
        }

        System.out.println("-----------------------");

        Set<String> set2 = new LinkedHashSet<>();

        set2.add("Tv");
        set2.add("Tablet");
        set2.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p : set2) {
            System.out.println(p);
        }

    }
}