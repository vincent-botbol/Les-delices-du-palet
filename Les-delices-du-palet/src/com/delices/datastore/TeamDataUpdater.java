package com.delices.datastore;

import java.net.MalformedURLException;
import java.net.URL;

import com.delices.datastore.jaxb.hierarchy.LeagueType;
import com.delices.utils.Logger;

public class TeamDataUpdater implements DataUpdater<LeagueType> {

	private URL s;

	public TeamDataUpdater() {
		try {
			s = UrlFactory.createLeagueHierarchyRequest(Infos.TEST_NHL_API_KEY);
		} catch (MalformedURLException e) {
			Logger.writeLog("URL mal formée : " + e.getMessage());
			s = null;
		}
	}

	@Override
	public LeagueType fetchContent() {
		
		return null;
	}

	@Override
	public void storeContent(LeagueType content) {
		// TODO Auto-generated method stub

	}

}
