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

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		String s = req.getParameter("login");
		String pwd = req.getParameter("pwd");

		boolean should_continue = true;

		if (s.isEmpty()) {
			resp.getWriter().println("pseudo vide");
			should_continue = false;
		}
		if (pwd.isEmpty()) {
			resp.getWriter().println("pass vide");
			should_continue = false;
		}

		if (!should_continue)
			return;

		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();

		Key k = KeyFactory.createKey("Login", s);

		Entity t = null;
		try {
			t = datastore.get(k);
		} catch (EntityNotFoundException e) {
			resp.getWriter().println("On t'a pas trouvé");
			return;
		}

		String stored_pass = (String) t.getProperty("password");
		if (stored_pass.equals(pwd)) {

			resp.getWriter().println("Bienvenue, ");
			resp.getWriter().println(t.getKey().getName());
			resp.getWriter().println(t.getProperty("password"));
			resp.getWriter().println(t.getProperty("mail"));

		} else {
			resp.getWriter().println(
					"Sécurité maximum, tu vas pas nous niquer!");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		this.doGet(req, resp);
	}
}
