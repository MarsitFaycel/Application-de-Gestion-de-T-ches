package org.gt;

import java.util.Date;

public class Tache {

    private String description;
    private Date dateDebut;

    public Tache() {
    }

    public Tache(String description, Date dateDebut) {
        this.description = description;
        this.dateDebut = dateDebut;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }
}
