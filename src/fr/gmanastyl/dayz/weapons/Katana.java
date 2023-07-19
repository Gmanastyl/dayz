package fr.gmanastyl.dayz.weapons;

public class Katana extends Armes {
    private int longueurLame;

    public Katana(String nom, int degats, int longueurLame) {
        super(nom, degats);
        this.longueurLame = longueurLame;
    }

    @Override
    public void attaquer() {
        System.out.println("Katana " + nom + " a une lame de " + longueurLame + " cm et inflige " + degats + " points de dégâts.");
    }
}
