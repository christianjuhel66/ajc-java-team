package com.agencetravaux.entity;

import org.springframework.stereotype.Component;

@Component // j'annote mon interface pour que spring la détecte
public interface Artisan {
    // je prépare mes méthodes pour mon projet
    String decoupe();
    String faireUnDevis();
}
