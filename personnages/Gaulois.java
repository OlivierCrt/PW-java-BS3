package tp_m_chaudet.personnages;

public class Gaulois extends Personnage{
    protected boolean sousPotion;


    public Gaulois(String coo , int ghd){
        super(coo, ghd);

    }

    /*public Gaulois(Gaulois gaugau){
        this.force = gaugau.force ;
        this.nom = gaugau.nom ;

    }*/

    @Override
    public void frapper(Personnage p){
        System.out.println("Le "+donnerAuteur()+" "+nom+" "+"assène un coup de force "+this.force+" au "+p.donnerAuteur()+" "+p.nom+".");
        p.recevoirCoup(force);
        if(sousPotion){
            this.force =  (float) (this.force - 0.5);
        }
        if(force == 1){
            sousPotion = false ;
        }


    }

    @Override
    protected String donnerAuteur() {
        return "gaulois";
    }
}
