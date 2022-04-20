package service;

import entities.Enfant;
import entities.Mere;
import entities.Pere;

import java.util.Scanner;

public class PersonneImpl implements IPersonne {
    @Override
    public void manger() {

    }

    @Override
    public void travailler() {

    }

    @Override
    public void saisire() {
        afficher();
    }

    @Override
    public void afficher() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saisire le nom du pere");
        String nom= scanner.nextLine();
        System.out.println("Saisire le prenom du pere");
        String prenoms= scanner.nextLine();
        System.out.println("Le nombre d'enfant du pere");
        int nombreEnfant= scanner.nextInt();
        System.out.println("Age du pere");
        int age= scanner.nextInt();
        System.out.println("Le salaire du pere");
        float salaire=scanner.nextFloat();
        Pere pere=new Pere(nom,prenoms,age,salaire,nombreEnfant);
        scanner.nextLine();
        System.out.println("Saisire le nom de la mere");
        String nomMere= scanner.nextLine();
        System.out.println("Saisire prenom de la mere");
        String prenomsMere =scanner.nextLine();
        System.out.println("Age de la mere");
        int ageMere=scanner.nextInt();
        System.out.println("La mere est-elle belle ? si oui taper true sinon taper false");
        boolean indo =scanner.hasNextBoolean();
        scanner.nextLine();
        Mere mere=new Mere(nomMere,prenomsMere,ageMere,indo);
        scanner.nextLine();
        System.out.println("Saisire le nom de l'enfant");
        String nomEnfant= scanner.nextLine();
        System.out.println("Saisire prenom de l'enfant");
        String prenomsEnfant =scanner.nextLine();
        System.out.println("Age de l'enfant");
        int ageEnfant=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Saisire le niveau de l'enfant");
        String niveau=scanner.nextLine();
        System.out.println("Saisire l'ecole de l'enfant");
        String ecole=scanner.nextLine();
        Enfant enfant=new Enfant(nomEnfant,prenomsEnfant,ageEnfant,niveau,ecole,mere,pere);
        System.out.println(enfant);
    }
}
