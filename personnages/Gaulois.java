package tp_m_chaudet.personnages;

public class Gaulois {

    protected int force ;
    protected String nom;



    public Gaulois(){
        this.force = 0 ;
        this.nom = "" ;

    }
    /*public Gaulois(Gaulois gaugau){
        this.force = gaugau.force ;
        this.nom = gaugau.nom ;

    }*/

    public String getNom() {
        return nom;
    }
    public int getForce(){
        return force ;
    }
    public void parler(String ph){
        System.out.println("Le gaulois "+this.nom+":"+ph);
    }
    public void frapper(Romain promain){
        System.out.println(nom+" Envoie un coup a "+promain.nom);
        promain.recevoirCoup(force/3);
    }


}
