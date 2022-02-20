package com.tp.formation.metier;

import com.tp.formation.dao.DaoInterface;
import com.tp.formation.entity.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CoursServiceImpl implements CoursServiceInterface{

    @Autowired
    private DaoInterface dao;

    @Override
    public List<Cours> findAll() {
        return dao.findAll();
    }

    @Override
    public Cours findById(int id) {
        return dao.findById(id);
    }

    @Override
    public int save(Cours cours) {
        return dao.save(cours);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
