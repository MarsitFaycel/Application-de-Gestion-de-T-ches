package org.gt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ProjetTest {

    @Test
    void shouldHaveTask() {
        String nom="Premier projet";
        Tache tache1 = new Tache();
        ArrayList<Tache> taches = new ArrayList<>();
        taches.add(tache1);

        Projet projet = new Projet(nom , taches);
        Assertions.assertEquals(projet.getTache().size(), 1);
        Assertions.assertEquals(projet.getName(), nom);
    }
 }
