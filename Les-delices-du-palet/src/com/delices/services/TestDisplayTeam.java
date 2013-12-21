package com.delices.services;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delices.datastore.PMF;
import com.delices.datastore.contents.Team;

@SuppressWarnings("serial")
public class TestDisplayTeam extends HttpServlet {
	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		PersistenceManager pm = PMF.get().getPersistenceManager();

		pm.currentTransaction().begin();

		Query q = pm.newQuery(Team.class);
		for (Team t : (List<Team>) q.execute()) {
			resp.getWriter().println(t.getName());
		}

		pm.currentTransaction().commit();
		pm.close();

		resp.getWriter().println("done");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		this.doGet(req, resp);
	}
}
