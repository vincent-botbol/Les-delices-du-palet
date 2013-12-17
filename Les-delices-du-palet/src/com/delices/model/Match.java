package com.delices.model;

import java.util.Date;

public class Match {

	String id;
	int journee;
	Date date;
	String team1, team2;
	int score1, score2;
	
	public Match (String id, Date date, String team1, String team2, int score1, int score2) {
		this.id = id;
		this.date = date;
		this.team1 = team1;
		this.team2 = team2;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	public void toHtml () {
		System.out.println(team1 + " - " + team2);
	}
	
}
