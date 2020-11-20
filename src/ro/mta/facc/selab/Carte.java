package ro.mta.facc.selab;
/**
 * Modeleaza un obiect de tip carte pentru a putea fi folosit intr-o alta clasa(Ex. {@link Biblioteca})
 * <p><b>Important:</b> Pentru stocare se va folosi un obiect de tip Container</p>
 *
 * <pre>Carte c = new Carte("Zece negri mititei", "Agatha Cristie", 1998, 719);</pre>
 *
 * @author dan.avram
 * @see Biblioteca
 * @see Utilizator
 */
public class Carte implements Comparable<Carte> {
    private String titlu;

    public String getTitlu() {
        return titlu;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    private String autor;

    public int getAnPublicatie() {
        return anPublicatie;
    }

    private int anPublicatie;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int compareTo(Carte o) {
        if (this.nrPagini < o.nrPagini)
            return -1;
        if (this.nrPagini > o.nrPagini)
            return 1;
        return 0;
    }



    private int nrPagini;

    public Carte(String titlu, String autor, int anPublicatie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicatie = anPublicatie;
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.titlu + " " + this.autor + ", aparuta in anul " + this.anPublicatie;
    }
}
