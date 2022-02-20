package com.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.DaoInterface;
import com.formation.entity.Cours;

@Service
@Transactional
public class CoursServiceImpl implements CoursServiceInterface {

	@Autowired
	private DaoInterface dao;

	@Override
	@Transactional
	public List<Cours> findAll() {

		return dao.findAll();

	}

	@Override
	@Transactional
	public Cours findById(int id) {

		return dao.findById(id);
	}

	@Override
	@Transactional
	public int save(Cours cours) {

		return dao.save(cours);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		System.out.println("--- service:  Cours to delete id = " + id);
		dao.deleteById(id);

	}

}
