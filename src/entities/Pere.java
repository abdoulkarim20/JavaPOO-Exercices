package entities;

import java.util.Scanner;

public class Pere extends Personne {
    private float salaire;
    private int nombreEnfant;
    public Pere(){
    }

    public Pere(String nom, String prenoms, int age, float salaire, int nombreEnfant) {
        super(nom, prenoms, age);
        this.salaire = salaire;
        this.nombreEnfant = nombreEnfant;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public int getNombreEnfant() {
        return nombreEnfant;
    }

    public void setNombreEnfant(int nombreEnfant) {
        this.nombreEnfant = nombreEnfant;
    }

    @Override
    public void saisire() {
        System.out.println("Veuillez renseigner les informations du pere\n");
        super.saisire();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Le salaire");
        this.salaire=scanner.nextFloat();
        System.out.println("Le nombre d'enfant du pere");
        this.nombreEnfant=scanner.nextInt();
    }

    @Override
    public void afficher() {
        System.out.println("Les renseignements du pere");
        super.afficher();
        System.out.println("Salaire "+salaire);
        System.out.println("Nombre d'enfants "+nombreEnfant);
    }

    @Override
    public String toString() {
        return "Pere ["+super.toString()+" Salaire: "+salaire+" nombre d'enfants: "+nombreEnfant+"]";
    }
}
