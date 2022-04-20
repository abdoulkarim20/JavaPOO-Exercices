package entities;

import java.util.Scanner;

public class Enfant extends Personne {
    private Mere mere;
    private Pere pere;
    private String niveauEtude;
    private String ecoleName;

    public Enfant(Mere mere, Pere pere){
        this.mere=mere;
        this.pere=pere;
    }

    public Enfant(String nom, String prenoms, int age, String niveauEtude, String ecoleName, Mere mere, Pere pere) {
        super(nom, prenoms, age);
        this.mere = mere;
        this.pere = pere;
        this.niveauEtude = niveauEtude;
        this.ecoleName = ecoleName;
    }

    public Mere getMere() {
        return mere;
    }

    public void setMere(Mere mere) {
        this.mere = mere;
    }

    public Pere getPere() {
        return pere;
    }

    public void setPere(Pere pere) {
        this.pere = pere;
    }

    public String getNiveauEtude() {
        return niveauEtude;
    }

    public void setNiveauEtude(String niveauEtude) {
        this.niveauEtude = niveauEtude;
    }

    public String getEcoleName() {
        return ecoleName;
    }

    public void setEcoleName(String ecoleName) {
        this.ecoleName = ecoleName;
    }

    @Override
    public void saisire() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Les information de l'enfants");
        super.saisire();
        System.out.println("Ecole de l'enfant");
        this.ecoleName=scanner.nextLine();
        System.out.println("Niveau d'etude de l'enfant");
        this.niveauEtude=scanner.nextLine();
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Nom complet du pere "+pere.getPrenoms()+" "+pere.getNom());
        System.out.println("Nom complet de la mere "+mere.getPrenoms()+" "+mere.getNom());
    }

    @Override
    public String toString() {
        return "Enfant["+super.toString()+" "+niveauEtude+" "+ecoleName+" "+pere+" "+mere+"]";
    }
}
