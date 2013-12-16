package com.delices;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class SubscribeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, connard");

		String s = req.getParameter("login");
		String pwd = req.getParameter("pwd");
		String mail = req.getParameter("mail");

		boolean should_continue = true;

		if (s.isEmpty()) {
			resp.getWriter().println("Pseudo vide");
			should_continue = false;
		}
		if (pwd.isEmpty()) {
			resp.getWriter().println("Pass vide");
			should_continue = false;
		}
		if (mail.isEmpty()) {
			resp.getWriter().println("Mail vide");
			should_continue = false;
		}

		if (!should_continue)
			return;
		
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();

		Key key = KeyFactory.createKey("Login", s);

		try {
			datastore.get(key);
			resp.getWriter().println("Utilisateur déjà inscrit");
			return;
		} catch (EntityNotFoundException e1) {
		}

		Entity e = new Entity(key);
		e.setProperty("password", pwd);
		e.setProperty("mail", mail);

		/*
		 * Login :
		 * clé primaire - s
		 * attributs : password - mail 
		 */
		
		datastore.put(e);

		resp.getWriter().println("Compte créé");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		this.doGet(req, resp);
	}
}
