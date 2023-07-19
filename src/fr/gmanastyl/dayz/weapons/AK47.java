package fr.gmanastyl.dayz.weapons;

public class AK47 extends Armes {
    private int cadenceTir;

    public AK47(String nom, int degats, int cadenceTir) {
        super(nom, degats);
        this.cadenceTir = cadenceTir;
    }

    @Override
    public void attaquer() {
        System.out.println("AK-47 " + nom + " tire à " + cadenceTir + " coups par minute et inflige " + degats + " points de dégâts.");
    }
}

