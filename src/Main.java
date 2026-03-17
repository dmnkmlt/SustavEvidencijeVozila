public class Main {

    public static void main(String[] args) {

        Vozilo vozilo = new Vozilo("ZG1234AA", "Kia", 2026);

        Automobil auto = new Automobil("AS123AA", "nekamarka", 2024, 8);

        Motocikl motor = new Motocikl("NN123NA", "nekiMotorMarka", 1999, "jaki");

        System.out.println(vozilo);
        System.out.println(auto);
        System.out.println(motor);

        EvidencijaVozila evidencijaVozila = new EvidencijaVozila();

        evidencijaVozila.dodajVozilo(vozilo);
        evidencijaVozila.dodajVozilo(auto);
        evidencijaVozila.dodajVozilo(motor);

        evidencijaVozila.spremiPodatkeUDatoteku("moja_vozila.txt");
        evidencijaVozila.ucitajPodatkeIzDatoteke("moja_vozila.txt");

    }
}
