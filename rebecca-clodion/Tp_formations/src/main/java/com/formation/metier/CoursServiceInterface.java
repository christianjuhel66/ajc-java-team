package com.formation.metier;

import java.util.List;

import com.formation.entity.Cours;

public interface CoursServiceInterface {

	public List<Cours> findAll();

	public Cours findById(int id);

	public int save(Cours cours);

	public void deleteById(int id);
}
