public class Vozilo {

    private String registarskiBroj;
    private String marka;
    private int godinaProizvodnje;

    public String ucitajPodatke(String registarskiBroj, String marka, int godinaProizvodnje) throws NeispravniPodaciException {

        setRegistarskiBroj(registarskiBroj);
        setMarka(marka);
        setGodinaProizvodnje(godinaProizvodnje);

        return this.prikaziPodatke();
    }

    public String prikaziPodatke() {
        return "Registracija: " + this.registarskiBroj + ", marka: " + this.marka + ", godina proizvodnje: " + this.godinaProizvodnje;
    }

    @Override
    public String toString() {
        return this.prikaziPodatke();
    }

    public Vozilo(String registarskiBroj, String marka, int godinaProizvodnje) {
        setRegistarskiBroj(registarskiBroj);
        setMarka(marka);
        setGodinaProizvodnje(godinaProizvodnje);
    }

    public void setRegistarskiBroj(String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        try {
            if (godinaProizvodnje > 2026 || godinaProizvodnje < 1850) {
                throw new NeispravniPodaciException("Godina ne smije biti veća od 2026 ili manja od 1850");
            }

            this.godinaProizvodnje = godinaProizvodnje;

        } catch (NeispravniPodaciException e) {
            throw new RuntimeException(e);
        }
    }

    public String getRegistarskiBroj() {
        return this.registarskiBroj;
    }

    public String getMarka() {
        return this.marka;
    }

    public int getGodinaProizvodnje() {
        return this.godinaProizvodnje;
    }
}
