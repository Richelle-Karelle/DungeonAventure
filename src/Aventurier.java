class Aventurier {
    private int pointsDeVie;
    private int pointsDAttaque;
    private int flasquesEau;

    public Aventurier() {
        this.pointsDeVie = 50;
        this.pointsDAttaque = 10;
        this.flasquesEau = 0;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void utiliserFlasqueEau(Monstre monstre) {
        if (flasquesEau > 0) {
            int bonusDegats = flasquesEau * 2;
            monstre.subirAttaque(pointsDAttaque + bonusDegats);
            flasquesEau--;
        } else {
            System.out.println("Vous n'avez plus de flasques d'eau !");
        }
    }

    public void subirAttaque(int pointsDAttaque) {
        pointsDeVie -= pointsDAttaque;
    }

    public void utiliserEpee(Monstre monstre) {
    }
}







