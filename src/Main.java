import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
         // Déclaration du Dongeon
        DungeonAventure dungeonAventure = new DungeonAventure();

        // Déclaration de l'avanturier
        Aventurier aventurier = new Aventurier();

        // Déclaration du barbare
        Barbare barbare = new Barbare();

        // Déclaraton du magicien
        Magicien magicien = new Magicien();

        // Déclaraton des monstres
        Monstre monstre = new Monstre() {
            @Override
            public String getNom() {
                return super.getNom();
            }

            @Override
            public int getPointsDeVie() {
                return super.getPointsDeVie();
            }

            @Override
            public void attaquer(Aventurier aventurier) {
                super.attaquer(aventurier);
            }

            @Override
            public void subirAttaque(int i) {
                super.subirAttaque(i);
            }
        };

        // Déclaration des pièces
        Piece piece = new Piece();



        System.out.println("Hello world!");
    }
}
















