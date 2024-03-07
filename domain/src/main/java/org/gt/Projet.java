package org.gt;

import java.util.ArrayList;

public class Projet {

    private ArrayList<Tache> tache;
    private String name;

    public Projet() {
    }

    public Projet( String name,ArrayList<Tache> tache) {
        this.tache = tache;
        this.name = name;
    }

    public ArrayList<Tache> getTache() {
        return tache;
    }

    public String getName() {
        return name;
    }
}
