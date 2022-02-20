package demo.unidirectionnel.dao;

import java.util.List;

import demo.unidirectionnel.entity.Utilisateur;

public interface UtilisateurDao {

	public void create(Utilisateur utilisateur);

	public void update(Utilisateur utilisateur);

	public Utilisateur getUserById(Long id);

	public List<Utilisateur> getAllUsers();
}
