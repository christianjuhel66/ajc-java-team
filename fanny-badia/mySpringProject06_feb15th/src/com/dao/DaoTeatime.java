package com.dao;

import com.entities.Teatime;

import java.util.List;

public interface DaoTeatime {
    public List<Teatime> findAll();

    public int create(Teatime teatime);

    public Teatime getOne(Integer idTeatime);

    public List<Teatime> getByFlavour(String flavour);

    public void deleteById(Integer idTeatime);

    public void delete(Teatime teatime);
}
