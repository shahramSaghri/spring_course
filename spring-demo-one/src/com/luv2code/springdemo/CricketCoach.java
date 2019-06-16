package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - SetEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - SetTeam");
		this.team = team;
	}
	
	

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	//Non-argument constructor
	//Spring need this constructor when it needs to make a 
	//reference to our bean
	public CricketCoach() {
		
	}
	
	//This setter method is used by spring for setter
	//injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - SetFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() { 
	
		return fortuneService.getFortune();
	}

}
