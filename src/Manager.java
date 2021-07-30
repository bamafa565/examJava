public class Manager extends Employe {

    public int nombreHeureGolfe=0;

    public Manager(String nom, String prenom, int ID, float tHoraire, int nombredHeure, int salbase,int nombreHeureGolfe) {
        super(nom, prenom, ID, tHoraire, nombredHeure, salbase);
        this.nombreHeureGolfe=nombreHeureGolfe;
    }


    public void ajouterHeureGolfe(int nombreHeureGolfe){
         this.setNombredHeure(nombreHeureGolfe);
    }
}
