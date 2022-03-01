package com.ajc.services;

import com.ajc.dao.Dao;
import com.ajc.entities.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class FruitServiceImpl implements FruitServiceInterface {
    @Autowired
    private Dao dao;

    @Override
    @Transactional
    public List<Fruit> findAll() {
        return dao.findAll();
    }

    @Override
    public Long save(Fruit fruit) {
        return dao.save(fruit);
    }


    @Override
    public void delete(Fruit fruit) {
        dao.delete(fruit);
    }
}
