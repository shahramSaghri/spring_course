package com.luv2code.springdemo;

public class TrackCoach implements Coach {  

	private FortuneService fortuneService;

	//This is a no-arg constructor
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		/**
		 * Folloing we are modifying the original implementation of
		 * the getFortune method in class HaapyFortuneService which
		 * implements FortuneService interface.
		 * So this is in fact a custom implementation;
		 */ 
		return "Just Do it: " + fortuneService.getFortune();
	}
	
	//Add an init method
	public void doMyStartupStuff() {
		System.out.println("TracCoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

}
