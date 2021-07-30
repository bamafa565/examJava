public class DakarDistribution {
    public static void main(String[] args) throws Exception {
        Employe tab[] = {

                new Ingenieur("Ndiaye", "mamy", 1, 12, 45, 10,47),
                new Manager("FAM", "bamafa", 2, 12, 50, 15,50),
                new Ingenieur("Sall", "Massamba", 3, 400, 47, 13,40),
                new Ingenieur("Diallo", "fatou", 4, 400, 57, 13, 13),
                new Manager("FAM", "bamafa", 5, 400, 52, 13, 13),
                new Ingenieur("FAM", "bamafa", 6, 400, 48, 13, 15)
        };

int Somme=0;


        for (Employe journalier : tab
             ) {

            Somme+=journalier.payHebdo();
            journalier.getClass();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("le salaire Hebdomadaire de tout les Employer est:");
System.out.println(Somme+"$");


    }
}
