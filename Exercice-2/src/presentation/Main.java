package presentation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Q1
        Map<String, Double> notesHashMap = new HashMap<>();
        afficherNotes(notesHashMap, 1);

        // Q2
        notesHashMap.put("Etudiant1", 12.0);
        notesHashMap.put("Etudiant2", 14.0);
        notesHashMap.put("Etudiant3", 10.0);
        notesHashMap.put("Etudiant4", 20.0);
        afficherNotes(notesHashMap, 2);

        // Q3
        notesHashMap.replace("Etudiant1", notesHashMap.get("Etudiant1") + 1);
        afficherNotes(notesHashMap, 3);

        // Q4
        notesHashMap.remove("Etudiant1");
        afficherNotes(notesHashMap, 4);

        // Q5
        System.out.println("\n*************** Affichage Q5 ***************");
        System.out.println("Size :" + notesHashMap.size());


        // Q6
        System.out.println("\n*************** Affichage Q6 ***************");
        Collection<Double> values = notesHashMap.values();
        System.out.println("Max: " + Collections.max(values));
        System.out.println("Min: " + Collections.min(values));

        // Q7
        System.out.println("\n*************** Affichage Q7 ***************");
        System.out.println("Note 20 exists ? Answer -> " + (notesHashMap.containsValue(20.0) ? "Yes (^_^) " : "No :("));

    }

    public static void afficherNotes(Map<String, Double> notes, int q) {
        System.out.println("\n*************** Affichage Q" + q + " ***************");
        notes.forEach((key, value) -> System.out.println("Etudiant: " + key + ", Note: " + value));
    }

}
