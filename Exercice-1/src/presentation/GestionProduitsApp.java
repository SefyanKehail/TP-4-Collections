package presentation;

import metier.Produit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        // Ajouter Produits;
        List<Produit> produitList = new ArrayList<>();
        produitList.add(new Produit(0L, "NomProduit1", 259));
        produitList.add(new Produit(1L, "NomProduit2", 499));

        // Afficher Produits
        afficherProduits(produitList);

        // Supprimer produit par indice ( exemple 0 )
        produitList.remove(0);
        afficherProduits(produitList);

        // Modifier produit par indice
        Produit foundProductIndex0 = produitList.get(0);
        foundProductIndex0.setNom("foundProductIndex0");
        afficherProduits(produitList);

        // Rechercher par nom
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer nom: ");
        String nom = scanner.nextLine();

        for (Produit produit : produitList){
            if (produit.getNom().equals(nom)){
                System.out.println("Produit trouvé: "+ produit);
            }
        }
    }

    public static void afficherProduits(List<Produit> produitList){
        System.out.println("\n************* Affichage *************");

        for (Produit produit : produitList) {
            System.out.println(produit);
        }
    }
}
