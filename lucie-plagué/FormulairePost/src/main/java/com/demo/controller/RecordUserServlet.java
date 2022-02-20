package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Personne;

public class RecordUserServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String nom = request.getParameter("nom");
        String age = request.getParameter("age");
        
        Personne user = new Personne();
        user.setNom(nom);
        user.setAge(age);
        
        request.setAttribute("user", user);
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vue/pageConfirmUser.jsp"
				 ).forward( request, response );
	}
}
