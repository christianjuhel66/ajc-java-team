package com.ajc.services;

import com.ajc.dao.Dao;
import com.ajc.entities.Panier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanierServiceImpl implements PanierServiceInterface {
    @Autowired
    private Dao dao;

    @Override
    public Panier findById(Long id) {
        return dao.findPanier(id);
    }

    @Override
    public Long save(Panier panier) {
        return dao.savePanier(panier);
    }
}
