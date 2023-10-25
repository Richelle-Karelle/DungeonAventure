import java.util.Scanner;

public class DungeonAventure {
    public static void main(String[] args) {
        // Création du donjon avec 5 pièces
        Piece[] dungeon = new Piece[5];
        for (int i = 0; i < dungeon.length; i++) {
            dungeon[i] = new Piece();
        }

        // Création de l'aventurier
        Aventurier aventurier = new Aventurier();

        // Boucle principale du jeu
        for (int i = 0; i < dungeon.length; i++) {
            System.out.println("Vous entrez dans la pièce " + (i + 1));
            Monstre monstre = dungeon[i].getMonstre();
            System.out.println("Un " + monstre.getNom() + " apparaît !");

            // Combat entre l'aventurier et le monstre
            while (aventurier.getPointsDeVie() > 0 && monstre.getPointsDeVie() > 0) {
                System.out.println("Points de vie de l'aventurier : " + aventurier.getPointsDeVie());
                System.out.println("Points de vie du monstre : " + monstre.getPointsDeVie());
                System.out.println("Quelle arme voulez-vous utiliser ? (SWORD ou WATER_FLASK)");
                Scanner scanner = new Scanner(System.in);
                String arme = scanner.nextLine();

                if (arme.equals("SWORD")) {
                    aventurier.utiliserEpee(monstre);
                } else if (arme.equals("WATER_FLASK")) {
                    aventurier.utiliserFlasqueEau(monstre);
                } else {
                    System.out.println("Arme invalide !");
                    continue;
                }

                if (monstre.getPointsDeVie() > 0) {
                    monstre.attaquer(aventurier);
                }
            }

            if (aventurier.getPointsDeVie() <= 0) {
                System.out.println("Vous êtes mort !");
                break;
            } else {
                System.out.println("Vous avez vaincu le " + monstre.getNom() + " !");
                System.out.println("Vous passez à la pièce suivante.");
            }
        }

        if (aventurier.getPointsDeVie() > 0) {
            System.out.println("Félicitations ! Vous avez trouvé le trésor et gagné le jeu !");
        }
    }
}
