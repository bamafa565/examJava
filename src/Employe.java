public class Employe {
    private String nom;
    private String prenom;
    private int ID;
  private float tHoraire;
    private int nombredHeure;
    private int salbase;

    public Employe(String nom, String prenom, int ID, float tHoraire, int nombredHeure, int salbase) {
        this.nom = nom;
        this.prenom = prenom;
        this.ID = ID;
        this.tHoraire = tHoraire;
        this.nombredHeure = nombredHeure;
        this.salbase = salbase;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float gettHoraire() {
        return tHoraire;
    }

    public void settHoraire(float tHoraire) {
        this.tHoraire = tHoraire;
    }

    public int getNombredHeure() {
        return nombredHeure;
    }

    public void setNombredHeure(int nombredHeure) {
        this.nombredHeure = nombredHeure;
    }

    public int getSalbase() {
        return salbase;
    }

    public void setSalbase(int salbase) {
        this.salbase = salbase;
    }

    public float payHebdo() throws Exception {

        int heuremax = 60;
        float prime = 0;
        float prime1=0;
        float sal=0;
        int heurSup = nombredHeure - 40;

        if (salbase <= 8) throw new Exception("bokoul fi");
        if (nombredHeure > heuremax) throw new Exception("bokoul ");

        if (heurSup <= 0) {
            return this.nombredHeure * this.tHoraire;
        }else{
            for (int i = 0; i < heurSup; i++) {
                    prime = (float) ( (this.salbase * 1.5));
    
                }
                System.out.println("vous avez une de  prime "+(prime));
//           return prime;

                prime1 = this.nombredHeure * this.tHoraire;
            System.out.println("vous avez une salaire normal avec pre   "+(prime1+prime));
                return prime1+prime;
            }



    }
}
