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
        System.out.println(donnerAuteur()+" "+this.nom+" dit :"+ph);
    }
    protected abstract String donnerAuteur();

    public void recevoirCoup(int fc){
        force = force - fc ;
        if (force >0){
            System.out.println("Aie !");
        }
        else {
            System.out.println("J'abandonne... dit "+nom);
            force = 0 ;
        }

    }

    public void frapper(Personnage p){
        System.out.println(donnerAuteur()+" "+nom+" "+"assène un coup a :"+p.nom);
        p.recevoirCoup(force);

    }


}
