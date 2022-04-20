package main;

import entities.Enfant;
import entities.Mere;
import entities.Pere;
import entities.Personne;
import service.IPersonne;
import service.PersonneImpl;

public class Main {
    public static void main(String[] args) {
        Pere p=new Pere();
        p.saisire();
        p.afficher();
        Mere mere =new Mere();
        mere.saisire();
        mere.afficher();
        Enfant enfant=new Enfant(mere,p);
        enfant.saisire();
        enfant.afficher();
    }
}
