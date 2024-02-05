package tp_m_chaudet.personnages;

public class Romain extends Personnage{
    protected String[] equipement = new String[3] ;
    protected  int nombreequipement ;
    public Romain(String coo , int ghd) {
        super(coo , ghd);
    }

    @Override
    protected String donnerAuteur() {
        return "romain";
    }

    public Boolean equiperEquipement(String equip){
        for (int i =0 ; i< nombreequipement ; i++) {
            if (equipement[i] == equip || nombreequipement == 3) {
                System.out.println("Le " + donnerAuteur()+" "+getNom() + " porte déjà un" + equip);
                return false;
            }
        }
        equipement[nombreequipement] = equip ;
        nombreequipement++;
        System.out.println("Le "+donnerAuteur() + " "+getNom() +" s'équipe de l'équipement "+equip);
        return true;
        }
        @Override
    public void recevoirCoup(float fc){
        int reduction =0 ;
        for(int i =0 ; i<nombreequipement ; i++){
            if (equipement[i] == "casque" ){
                reduction = reduction + 2 ;
            }
            if (equipement[i]=="bouclier"){
                reduction = reduction + 3 ;
            }
            if (equipement[i] == "plastron"){
                reduction = reduction+3 ;
            }
        }
        if(fc-reduction < 0){
            super.recevoirCoup(0);
        }
        super.recevoirCoup(fc-reduction);

        }
    }





