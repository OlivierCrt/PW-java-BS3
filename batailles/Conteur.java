package tp_m_chaudet.batailles;

public class Conteur {
    private String nom ;





    //cons
    public Conteur(String nom){
        this.nom = nom ;
    }

    public void conterBataille (BatailleInterface bataille){
        System.out.println("Le conteur " + nom +" conte la bataille : " );
        bataille.preparerCombat();
        bataille.decrireCombat();
        bataille.donnerResultat();


    }
}
