package com.delices.datastore;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.delices.datastore.jaxb.hierarchy.LeagueType;
import com.delices.utils.Logger;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class TeamDataUpdater extends DataUpdater<LeagueType> {

	/**
	 * Met à jour les équipes dans la table.
	 * 
	 * Key : (Teams, NHL)
	 * 
	 * contenu => entity.league
	 * 
	 */

	@Override
	public void updateContent() {
		URL s = null;
		try {
			s = UrlFactory.createLeagueHierarchyRequest(Infos.TEST_NHL_API_KEY);
		} catch (MalformedURLException e) {
			Logger.writeLog("URL mal formée : " + e.getMessage());
		}

		// try (InputStream in = RequestMaker.makeRequest(s)) {
		// temp test
		try (InputStream in = new FileInputStream("hierarchy.xml")) {
			if (in != null) {
				LeagueType league = super.unmarshallContent(in, "hierarchy");

				DatastoreService datastore = DatastoreServiceFactory
						.getDatastoreService();

				Key key = KeyFactory.createKey("Teams", "NHL");

				Entity e = new Entity(key);
				// Todo Faire marcher ça. (putain de google)
				e.setProperty("Team", league);
				datastore.put(e);

				Logger.writeLog("Equipes mise-à-jour avec succès");
			}
		} catch (IOException | JAXBException e) {
			Logger.writeLog("Impossible de mettre à jour le contenu de l'équipe : "
					+ e.getMessage());
		}

	}
}
