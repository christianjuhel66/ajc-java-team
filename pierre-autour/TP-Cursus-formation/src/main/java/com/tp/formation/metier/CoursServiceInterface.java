package com.tp.formation.metier;

import com.tp.formation.entity.Cours;

import java.util.List;

public interface CoursServiceInterface {
    List<Cours> findAll();

    Cours findById(int id);

    int save(Cours cours);

    void deleteById(int id);
}
