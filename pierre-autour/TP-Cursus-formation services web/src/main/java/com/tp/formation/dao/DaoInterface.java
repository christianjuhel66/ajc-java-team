package com.tp.formation.dao;

import com.tp.formation.entity.Cours;

import java.util.List;

public interface DaoInterface {
    List<Cours> findAll();

    Cours findById(int id);

    int save(Cours cours);

    void deleteById(int id);

}
