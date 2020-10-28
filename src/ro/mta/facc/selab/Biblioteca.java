package ro.mta.facc.selab;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> listaCarti;

    public Biblioteca() {
        listaCarti = new ArrayList<Carte>();
    }

    public void add(Carte c)
    {
        listaCarti.add(c);
    }

    public void sort()
    {
        Collections.sort(listaCarti);
    }

    public void removeBook(Carte c)
    {
        listaCarti.remove(c);
    }

    @Override
    public String toString() {
        StringBuilder builder;
        builder = new StringBuilder();
        builder.append("Biblioteca contine:\n");

        for (Carte c : listaCarti)
        {
            builder.append(c);
            builder.append("\n");
        }

        return builder.toString();
    }
}
