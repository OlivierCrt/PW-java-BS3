package tp_m_chaudet.personnages;

public class Soldat extends Romain{
    private Grade grade ;

    public Soldat(String nom, int force, Grade grade) {
        super(nom,force);
        this.grade=grade;
    }
    public Grade getGrade() {
        return this.grade;
    }
    public void parler(String s){
        System.out.println("Le "+getGrade()+" "+getNom()+" dit :" + s);


    }



}
