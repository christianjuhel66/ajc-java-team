package com.ajc.web;

import com.ajc.entities.Legume;
import com.ajc.entities.Panier;
import com.ajc.services.LegumeServiceInterface;
import com.ajc.services.PanierServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PanierRestController {
    @Autowired
    private PanierServiceInterface panierServiceInterface;

    @RequestMapping(value = "/panier/{id}", method = GET)
    public Panier getPanier(@PathVariable("id") long id) {
        return panierServiceInterface.findById(id);
    }
}
