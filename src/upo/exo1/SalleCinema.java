package upo.exo1;

/**
 * Définit le modele d'une salle de cinéma
 */
public final class SalleCinema {
    private double tarif;
    private int capacite;
    private String film;

    public SalleCinema(String film, int capacite, double tarif) {
        this.film = film;
        this.capacite = capacite;
        this.tarif = tarif;
    }

    public double getTarif() {
        return tarif;
    }

    public int getCapacite() {
        return capacite;
    }

    public String getFilm() {
        return film;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    @Override //permet de redefinir la methode de la classe mere
    public String toString() {
        final StringBuilder sb = new StringBuilder("SalleCinema{");
        sb.append("tarif=").append(tarif);
        sb.append(", capacite=").append(capacite);
        sb.append(", film='").append(film).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int vendrePlace(int capacite, double tarif, int place_a_vendre, boolean b, int tickets) {
        if (place_a_vendre > capacite) {
            if (b == true) {
                tickets = capacite - place_a_vendre;
                return (tickets);
            } else System.out.println("vente impossible !!!");

        }else return  (tickets);

    return tickets;
    }

    public double chiffreAffaires(double tarif,int capacite, double c_aff ){
        c_aff = tarif*capacite;
        return c_aff;
    }

    public double tauxRemplissage(double tickets , double Tx){
        Tx = tickets /10;
        return Tx;
    }

    public boolean estPleine(int tickets, int capacite){
        if(tickets == capacite) return true;
                else return false;
    }

    public int nbPlacesDisponibles(int nbdispo, int tickets ){
        nbdispo= capacite-tickets;
        return nbdispo;
    }//System.out.println("le nombre de place disponible est de :  " , nbdispo);
}



/*
public employe(int nbheures, double salaireBase) throws GestionExcpetion{
if (salaireBase < 10.7)
throw new GestionException("Salaire base illegale");
}

public static void main (String[]args) {
Employe e = new Emploe (60,8.4):
}catcth (GestionException ge) {
ge.printStackTrace();
}
*/
