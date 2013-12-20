package com.delices.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delices.datastore.jaxb.hierarchy.ConferenceType;
import com.delices.datastore.jaxb.hierarchy.DivisionType;
import com.delices.datastore.jaxb.hierarchy.LeagueType;
import com.delices.datastore.jaxb.hierarchy.TeamType;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class TestDisplayTeam extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

		Key key = KeyFactory.createKey("Teams", "NHL");

		Entity e;
		try {
			e = ds.get(key);
		} catch (EntityNotFoundException e1) {
			resp.getWriter().println(
					"Error - entity not found : " + e1.getMessage());
			return;
		}
		LeagueType l = (LeagueType)e.getProperty("Team");
		
		resp.getWriter().println(l.getName());
		for (ConferenceType c : l.getConference()){
			resp.getWriter().println("  Conference : " + c.getName());
			for (DivisionType d : c.getDivision()){
				resp.getWriter().println("    Division : " + d.getName());
				for (TeamType t : d.getTeam()){
					resp.getWriter().println("      Team : " + t.getName());
				}
			}
		}

		resp.getWriter().println("done");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		this.doGet(req, resp);
	}
}
