abstract class Monstre {
        protected String nom;
        protected int pointsDeVie;
        protected int pointsDAttaque;

        public String getNom() {
            return nom;
        }

        public int getPointsDeVie() {
            return pointsDeVie;
        }

        public void attaquer(Aventurier aventurier) {
            aventurier.subirAttaque(pointsDAttaque);
        }

    public void subirAttaque(int i) {
    }
}

