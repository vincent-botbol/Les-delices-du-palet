package com.delices.model;

import java.util.Date;

public class Match {

	private String id;
	private int journee;
	private Date date;
	private String team1, team2;
	private int score1, score2;
	
	public Match (String id, Date date, String team1, String team2, int score1, int score2) {
		this.id = id;
		this.date = date;
		this.team1 = team1;
		this.team2 = team2;
		this.score1 = score1;
		this.score2 = score2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getJournee() {
		return journee;
	}

	public void setJournee(int journee) {
		this.journee = journee;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}
	
	
}
