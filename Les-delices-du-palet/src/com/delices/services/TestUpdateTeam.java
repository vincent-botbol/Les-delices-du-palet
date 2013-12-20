package com.delices.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delices.datastore.TeamDataUpdater;

@SuppressWarnings("serial")
public class TestUpdateTeam extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		new TeamDataUpdater().updateContent();
		resp.getWriter().println("done");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		this.doGet(req, resp);
	}
}
