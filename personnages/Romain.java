package tp_m_chaudet.personnages;

public class Romain extends Personnage{
    public Romain(String coo , int ghd) {
        super(coo , ghd);
    }

    @Override
    protected String donnerAuteur() {
        return "romain";
    }
}


