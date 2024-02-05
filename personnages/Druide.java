package tp_m_chaudet.personnages;
import java.security.SecureRandom;
public class Druide extends Gaulois{
    protected int quantitepotion ;
    protected int puissancepotion ;

    public Druide(String nom ,int quantitepotion ,int force){
        super(nom , force) ;
        this.puissancepotion = 0 ;
        this.quantitepotion = quantitepotion ;

    }


    public void fabriquerPotion(int quantitepotion  ){
        this.quantitepotion = this.quantitepotion + quantitepotion ;
        SecureRandom random = new SecureRandom();
        this.puissancepotion = random.nextInt(5) +2;
        System.out.println("Le "+donnerAuteur() + " "+getNom()+" : "+"J'ai concocté "+this.quantitepotion +" doses de potion magique. Elle a une force de "+this.puissancepotion);

    }
    public boolean donnerPotion(Gaulois gogo){
        if(gogo.nom == "Obélix"){
            System.out.println("Tu ne peux pas boire la potion Obélix!");
            return false ;
        }
        else if(this.quantitepotion == 0){
            System.out.println("Il ne reste pas une goutte de potion pour toi "+gogo.getNom());
            return false ;
        }
        else {
            System.out.println("Tiens "+gogo.nom +" un peu de potion magique.");
            this.quantitepotion = quantitepotion -1 ;
            gogo.sousPotion =true;
            gogo.force = gogo.force*(this.puissancepotion);
            return true ;
        }
    }


    @Override
    protected String donnerAuteur() {
        return "druide";
    }
}





