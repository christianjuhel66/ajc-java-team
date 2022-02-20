package com.demo.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Abonne;

public class execServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Abonne abonne = new Abonne("Jacques","Martin","56 rue de la Boustifaille 75012 PARIS",2);
		
		request.setAttribute("abo1", abonne);
		
		
		this.getServletContext().getRequestDispatcher("/jspExoAbo.jsp").forward(request, response);
	}
}
