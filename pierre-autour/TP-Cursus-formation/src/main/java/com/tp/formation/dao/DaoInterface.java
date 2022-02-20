package com.tp.formation.dao;

import com.tp.formation.entity.Cours;

import java.util.List;

public interface DaoInterface {
    public List<Cours> findAll();

    public Cours findById(int id);

    public int save(Cours cours);

    public void deleteById(int id);

}
