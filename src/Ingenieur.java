public class Ingenieur extends Employe {
    public int HeureCom=0;

    public Ingenieur(String nom, String prenom, int ID, float tHoraire, int nombredHeure, int salbase,int HeureCom) {
        super(nom, prenom, ID, tHoraire, nombredHeure, salbase);
    }


    public void ajouterHeureCom(int HeureCom ){
        this.setNombredHeure(HeureCom);
    }
}
