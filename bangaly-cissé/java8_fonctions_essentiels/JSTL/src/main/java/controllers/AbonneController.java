package controllers;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Abonne;
import models.Film;



public class AbonneController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Abonne abonne = new Abonne("Jacques", "Martin", 2, "56 rue de la Boustifaille 75012 PARIS");
		
		Film film = new Film("film0", "réalisateur0", 90, false);
		
		List<Film> films = new ArrayList<Film>();
		films.add(new Film("film0", "réalisateur0", 90, false));
		films.add(new Film("film1", "réalisateur1", 120, true));
		films.add(new Film("film2", "réalisateur2", 130, false));
		
		Abonne abonneDuo = new Abonne("Pierre", "Jean","10 rue faille 75012 PARIS" );
		
		abonne.setAbonneDuo(abonneDuo);
		abonne.setFilms(films);
		
		request.setAttribute("abonne", abonne);
		request.setAttribute("film", film);
		
		this.getServletContext()
			.getRequestDispatcher("/views/abonneVue.jsp")
			.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
