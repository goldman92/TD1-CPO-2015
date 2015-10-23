package upo.exo1;

public final class Main {

    public static void main(String[] args) {
	// write your code here
        SalleCinema salleCinema = new SalleCinema("Star Wars 7",200,  15.0);
        System.out.println(salleCinema);

         salleCinema.vendrePlace(100, 7.5, 101, false,1);
        System.out.println(salleCinema);
    }

}
