package tp_m_chaudet.personnages;

public class Gaulois extends Personnage{

    protected int force ;
    protected String nom;



    public Gaulois(){
        super();

    }
    /*public Gaulois(Gaulois gaugau){
        this.force = gaugau.force ;
        this.nom = gaugau.nom ;

    }*/


    public void frapper(Romain promain){
        System.out.println(nom+" Envoie un coup a "+promain.nom);
        promain.recevoirCoup(force/3);
    }

    @Override
    protected String donnerAuteur() {
        return "Le gaulois";
    }
}
