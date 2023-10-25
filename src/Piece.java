import java.util.Random;

class Piece {
    private Monstre monstre;

    public Piece() {
        Random random = new Random();
        int choixMonstre = random.nextInt(2);

        if (choixMonstre == 0) {
            this.monstre = new Magicien();
        } else {
            this.monstre = new Barbare();
        }
    }
    public Monstre getMonstre() {
        return monstre;
    }
}

