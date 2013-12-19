package com.delices.datastore;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import com.delices.utils.Logger;
import com.delices.utils.Timing;

//to thread?
public class RequestMaker {

	public static File makeRequest(URL url) throws IOException {

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

		try (ReadableByteChannel in = Channels.newChannel(con.getInputStream())) {
			
			//FileOutputStream fos = new FileOutputStream("data/requests_xml/"+Timing.getCurrentTime()+ "");
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			//Transformer transformer = transformerFactory.newTransformer();
			//DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("C:\\file.xml"));

		}

		return null;
	}

}
