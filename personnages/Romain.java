package tp_m_chaudet.personnages;

public class Romain {
    protected int force ;
    protected String nom ;
    public Romain(){
        force = 0 ;
        nom = "" ;
    }
    public void parler(String ph){
        System.out.println("Le romain "+this.nom+":"+ph);
    }
    public void recevoirCoup(int value){
        force = force - value ;
        if (force >0 ){
            System.out.println("Aie! dit "+nom);
        }
        else{
            force = 0 ;
            System.out.println("J'abandonne! dit "+nom);
        }
    }

}
