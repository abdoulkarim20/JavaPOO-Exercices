package entities;

import service.IPersonne;

import java.util.Scanner;

public class Personne implements IPersonne {
    private String nom;
    private String prenoms;
    private int age;
    public Personne(){

    }

    public Personne(String nom, String prenoms, int age) {
        this.nom = nom;
        this.prenoms = prenoms;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nom: "+nom+" Prenoms: "+prenoms+" Age: "+age;
    }

    @Override
    public void manger() {

    }

    @Override
    public void travailler() {

    }

    @Override
    public void saisire() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saisire le nom");
        this.nom= scanner.nextLine();
        System.out.println("Saisire le prenom");
        this.prenoms= scanner.nextLine();
        System.out.println("Saisir l'age");
        this.age= scanner.nextInt();
    }

    @Override
    public void afficher() {
        System.out.println("Nom "+nom);
        System.out.println("Perenoms "+prenoms);
        System.out.println("Age "+age);
    }
}
