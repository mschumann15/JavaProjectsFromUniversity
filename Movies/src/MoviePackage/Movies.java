package MoviePackage;

import java.text.DecimalFormat;
import java.util.Random;

public class Movies {
	
	public Movies(String title,String genre) {
		this.title = title;
		this.yearOfRelease = generateRandomYear();
		this.duration = generateDuration();
		this.genre = genre;
		this.rating = generatereviewRating();
	}
	
	//1980-2019
	public int generateRandomYear() {
		
		Random randomizer = new Random();
		int max = 2019;
		int min = 1980;
		int randomYear = 0; 
		
		while(randomYear == this.randomYear) {
			randomYear = randomizer.nextInt((max - min) + 1) + min;
		}
		
		this.randomYear = randomYear;
		
		return randomYear;
	}
	
	//0.1 - 10.0
	public double generatereviewRating() {
		
		Random randomizer = new Random();
		
		double max = 10.0;
		double min = 0.1;
		
		double random = randomizer.nextDouble();
		double randomReview = min + (random * (max - min));
		
		DecimalFormat numberFormat = new DecimalFormat("#.0");
		
		return Double.parseDouble(numberFormat.format(randomReview));
	}	
	
	//1 - 4 hours
	public int generateDuration() {
		
		Random randomizer = new Random();
		int max = 4;
		int min = 1;
		int randomtime = 0; 
		
		while(randomtime == this.randomTime) {
			randomtime = randomizer.nextInt((max - min) + 1) + min;
		}
		
		this.randomTime = randomTime;
		
		return randomTime;
	}
	
	private int randomYear;
	private int randomTime;
	private String title;
	private int yearOfRelease;
	private double duration;
	private String genre;
	private double rating;
}