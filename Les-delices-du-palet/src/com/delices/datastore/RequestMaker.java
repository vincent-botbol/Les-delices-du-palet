package com.delices.datastore;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.delices.utils.Logger;

//to thread?
public class RequestMaker {

	public static InputStream makeRequest(URL url) throws IOException {

		Logger.writeLog("Création d'une requête vers " + url);

		HttpURLConnection con = null;

		try {
			con = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			Logger.writeLog("Impossible d'ouvrir une connexion vers " + url);
			return null;
		}

		con.setRequestMethod("GET");

		// Headers
		con.setRequestProperty("User-agent", "Mozilla/5.0");
		con.setRequestProperty("Accept", "application/xml");

		Logger.writeLog("Envoi d'une requête 'GET' sur " + url);
		int respCode = con.getResponseCode();

		if (respCode != HttpURLConnection.HTTP_OK) {
			Logger.writeLog("Echec de la requête : " + url
					+ " - code de retour = " + respCode);
			return null;
		}

		return con.getInputStream();
	}

}
