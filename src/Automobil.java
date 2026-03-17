public class Automobil extends Vozilo {

    private int brojVrata;

    public Automobil(String registarskiBroj, String marka, int godinaProizvodnje, int brojVrata) {
        super(registarskiBroj, marka, godinaProizvodnje);
        setBrojVrata(brojVrata);
    }

    @Override
    public String prikaziPodatke() {
        return super.prikaziPodatke() + ", broj vrata: " + this.brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        try {
            if (brojVrata < 1 || brojVrata > 10) {
                throw new NeispravniPodaciException("Automobil ima vrata između 1 i 10");
            }

            this.brojVrata = brojVrata;

        } catch (NeispravniPodaciException e) {
            throw new RuntimeException(e);
        }
    }

    public int getBrojVrata() {
        return this.brojVrata;
    }
}
