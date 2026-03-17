public class Motocikl extends Vozilo{

    private String tipMotora;

    public Motocikl(String registarskiBroj, String marka, int godinaProizvodnje, String tipMotora) {
        super(registarskiBroj, marka, godinaProizvodnje);
        setTipMotora(tipMotora);
    }

    @Override
    public String prikaziPodatke() {
        return super.prikaziPodatke() + ", tip motora: " + this.tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }

    public String getTipMotora() {
        return this.tipMotora;
    }
}
