package tp_m_chaudet.personnages;

public class Gaulois extends Personnage{


    public Gaulois(String coo , int ghd){
        super(coo, ghd);

    }

    /*public Gaulois(Gaulois gaugau){
        this.force = gaugau.force ;
        this.nom = gaugau.nom ;

    }*/



    @Override
    protected String donnerAuteur() {
        return "Le gaulois";
    }
}
