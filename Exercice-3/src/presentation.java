import java.util.HashSet;
import java.util.Set;

public class presentation {
    public static void main(String[] args) {

        // Q1
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        // Q2
        groupeA.add("A1");
        groupeA.add("A2");
        groupeB.add("B1");
        groupeB.add("B2");
        groupeB.add("A1");

        // Q3
        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);

        System.out.println("Intersection: " + intersection);

        // Q4
        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);

        System.out.println("Union: " + union);

    }
}
