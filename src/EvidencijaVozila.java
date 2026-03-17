import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EvidencijaVozila {

    private List<Vozilo> listaVozila;

    public EvidencijaVozila() {
        this.listaVozila = new ArrayList<>();
    }

    public EvidencijaVozila(List<Vozilo> listaVozila) {
        this.listaVozila = listaVozila;
    }

    public void spremiPodatkeUDatoteku(String datoteka) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(datoteka, false));

            for(int i = 0; i < this.listaVozila.size(); i++) {
                writer.write(this.listaVozila.get(i).prikaziPodatke() + "\n");
            }

            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void ucitajPodatkeIzDatoteke(String datoteka) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(datoteka));

            String linija;

            while((linija = reader.readLine()) != null) {
                System.out.println(linija);
            }

            reader.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void setListaVozila(List<Vozilo> listaVozila) {
        this.listaVozila = listaVozila;
    }

    public List<Vozilo> getListaVozila() {
        return this.listaVozila;
    }

    public void dodajVozilo(Vozilo vozilo) {
        this.listaVozila.add(vozilo);
    }

}
