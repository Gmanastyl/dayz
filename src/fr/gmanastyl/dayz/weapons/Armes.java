package fr.gmanastyl.dayz.weapons;


// Création d'une classe abstraite
public abstract class Armes {
    protected String nom;
    protected int degats;

    public Armes(String nom, int degats) {
        this.nom = nom;
        this.degats = degats;
    }
    // Méthode abstraite pour l'attaque
    public abstract void attaquer();
}