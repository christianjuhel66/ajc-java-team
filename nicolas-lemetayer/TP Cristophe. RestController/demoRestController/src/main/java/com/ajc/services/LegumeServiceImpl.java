package com.ajc.services;

import com.ajc.dao.Dao;
import com.ajc.entities.Legume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LegumeServiceImpl implements LegumeServiceInterface {
    @Autowired
    private Dao dao;

    @Override
    public List<Legume> findAll() {
        return dao.FindAllLegumes();
    }

    @Override
    public Long save(Legume legume) {
        return dao.saveLegume(legume);
    }

    @Override
    public void delete(Legume legume) {
        dao.delete(legume);
    }
}
