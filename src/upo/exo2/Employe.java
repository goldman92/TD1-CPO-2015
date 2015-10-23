package upo.exo2;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

/**
 * Created by marsiaka on 08/10/2015.
 */
public final class Employe {
    private String nomEmploye;
    private double salaireHoraire;
    private double nbHeuresEmploye;

    public Employe(int nbHeuresEmploye, double salaireHoraire, String nomEmploye) {
        this.nbHeuresEmploye = nbHeuresEmploye;
        this.salaireHoraire = salaireHoraire;
        this.nomEmploye = nomEmploye;
    }

    public Employe() {

    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public double getSalaireEmploye() {
        return salaireHoraire;
    }

    public int getNbHeuresEmploye() {
        return (int) nbHeuresEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public void salaireHoraire(double salaireHoraire) {
        this.salaireHoraire = salaireHoraire;
    }

    public void setNbHeuresEmploye(double nbHeuresEmploye) {
        this.nbHeuresEmploye = nbHeuresEmploye;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employe{");
        sb.append("nomEmploye='").append(nomEmploye).append('\'');
        sb.append(", salaireHoraire=").append(salaireHoraire);
        sb.append(", nbHeuresEmploye=").append(nbHeuresEmploye);
        sb.append('}');
        return sb.toString();
    }
    public int salaireHebdo (int nbHeuresEmploye, double salaireHoraire){
        int  salaireHebdomadaire = (int) (nbHeuresEmploye * salaireHoraire);
        return salaireHebdomadaire;
    }
}
