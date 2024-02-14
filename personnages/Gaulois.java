package tp_m_chaudet.personnages;

public class Gaulois extends Personnage {
    protected boolean sousPotion;
    protected double puissancePotion = 1;


    public Gaulois(String coo, int ghd) {
        super(coo, ghd);

    }

    /*public Gaulois(Gaulois gaugau){
        this.force = gaugau.force ;
        this.nom = gaugau.nom ;

    }*/

    @Override
    public void frapper(Personnage p) {
        System.out.println("Le " + donnerAuteur() + " " + nom + " " + "assène un coup de force " + (int)(this.force*this.puissancePotion) + " au " + p.donnerAuteur() + " " + p.nom + ".");
        p.recevoirCoup((int)(force*puissancePotion));
        if (puissancePotion >1) {
            this.puissancePotion = this.puissancePotion - 0.5;
        }

    }

    @Override
    protected String donnerAuteur() {
        return "gaulois";
    }

    protected void setSousPotion(boolean soupot) {
        this.sousPotion = soupot;
    }
    protected void setForce(int force){
        this.force = force ;
    }
    protected double getPuissancePotion(){
        return puissancePotion ;
    }
    protected boolean getSousPotion(){
        return sousPotion ;
    }
    protected int getForce(){
        return force;
    }
    protected void setPuissancePotion(double puissancePotion){
        this.puissancePotion = puissancePotion ;
    }
}
