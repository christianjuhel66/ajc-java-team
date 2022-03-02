package com.formation.dao;

import java.util.List;

import com.formation.entity.Cours;

public interface DaoInterface {

	public List<Cours> findAll();

	public Cours findById(int id);

	public int save(Cours cours);

	public void deleteById(int id);

	// public List<Evaluation> findAllEval(Cours cours);

	// public Evaluation findByNum(int numEval);

	// public int save(Evaluation eval);

	// public void deleteByNum(int numEval);

}
