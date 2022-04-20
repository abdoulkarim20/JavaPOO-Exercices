package entities;

import java.util.Scanner;

public class Mere extends Personne {
    private boolean indo;
    public Mere(){
    }

    public Mere(String nom, String prenoms, int age, boolean indo) {
        super(nom, prenoms, age);
        this.indo = indo;
    }

    public boolean isIndo() {
        return indo;
    }

    public void setIndo(boolean indo) {
        this.indo = indo;
    }

    @Override
    public void saisire() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Donner les renseignement de la mere\n");
        super.saisire();
        System.out.println("Elle est senegalaise ?");
        this.indo=scanner.hasNextBoolean();
    }

    @Override
    public void afficher() {
        System.out.println("Les info de la mere");
        super.afficher();
        System.out.println("Est-elle senegalaise? "+indo);
    }

    @Override
    public String toString() {
        return "Mere ["+super.toString()+" est-elle indo: "+indo+"]";
    }
}
