package com.dao;

import com.entities.Cakes;

import java.util.List;

public interface DaoCakes {
    public List<Cakes> findAll();

    public int create(Cakes cakes);

    public Cakes getOne(int id);

    public List<Cakes> getByCakeName(String cakeName);

    public void deleteById(int id);

    public void delete(Cakes cakes);
}
