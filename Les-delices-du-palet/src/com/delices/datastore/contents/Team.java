package com.delices.datastore.contents;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Team {

	@PrimaryKey
	@Persistent
	private Key key;

	@Persistent
	private String name;
	@Persistent
	private String alias;
	@Persistent
	private String market;

	// private Venue venue; => localisation
	@Persistent
	private String division;
	@Persistent
	private String conference;

	public Team(Key key, String name, String alias, String market,
			String division, String conference) {
		this.key = key;
		this.name = name;
		this.alias = alias;
		this.market = market;
		this.division = division;
		this.conference = conference;
	}

	public Key getId() {
		return key;
	}

	public String getName() {
		return name;
	}

	public String getAlias() {
		return alias;
	}

	public String getMarket() {
		return market;
	}

	public String getDivision() {
		return division;
	}

	public String getConference() {
		return conference;
	}

}
