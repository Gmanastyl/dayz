package fr.gmanastyl.dayz;

import fr.gmanastyl.dayz.weapons.AK47;
import fr.gmanastyl.dayz.weapons.Armes;
import fr.gmanastyl.dayz.weapons.Katana;

public class Main {
        public static void main(String[] args) {

            // Création des instances et définition de leurs attributs
            Armes ak47 = new AK47("AK-47", 30, 600);
            Armes katana = new Katana("Katana", 20, 60);

            ak47.attaquer();
            katana.attaquer();
        }
    }
