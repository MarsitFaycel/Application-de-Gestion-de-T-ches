package org.gt;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

class TacheTest {
    @Test
    void name() {
        String description= "Premiere tache";
        Date dateDebut= Date.from(Instant.now());
        Tache tache= new Tache(description,dateDebut);
        Assertions.assertEquals(tache.getDescription(), description);
        Assertions.assertEquals(tache.getDateDebut(), dateDebut);
    }
}
