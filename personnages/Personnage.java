package tp_m_chaudet.personnages;

public abstract class Personnage {
    protected String nom ;
    protected int force ;

    public Personnage(String naa , int ff){
        nom = naa ;
        force = ff ;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String ph){
        System.out.println("Le "+donnerAuteur()+" "+this.nom+" dit :"+ph);
    }
    protected abstract String donnerAuteur();

    public void recevoirCoup(int fc){
        force = force - fc ;
        if (force >0){
            System.out.println("Le "+donnerAuteur() +" " +getNom()+" dit : Aie !");
        }
        else {
            System.out.println("Le "+donnerAuteur()+" "+nom+" dit : J'abandonne... ");
            force = 0 ;
        }

    }

    public void frapper(Personnage p){
        System.out.println("Le "+donnerAuteur()+" "+nom+" "+"assène un coup au "+p.donnerAuteur()+" "+p.nom+".");
        p.recevoirCoup(force/3);

    }
    public boolean estATerre() {
        if (force < 0) {
            return true;
        }
        return false;
    }


}
