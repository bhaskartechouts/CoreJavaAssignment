package org.techouts.app.problem1;

import java.time.Year;

public class Employee {

	Year startingYear;
	Year ratingOfYear;
	String rating;


	public Employee(int year1, int year2, String rating) {
		super();
		startingYear = Year.of(year1);
		ratingOfYear = Year.of(year2);
		this.startingYear = startingYear;
		this.ratingOfYear = ratingOfYear;
		this.rating = rating;
	}
	public Year getratingOfYear() {
		return ratingOfYear;
	}
	public void setratingOfYear(int year) {
		ratingOfYear = Year.of(year);
		this.ratingOfYear = ratingOfYear;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Year getStartingYear() {
		return startingYear;
	}
	public void setStartingYear(int year) {
		startingYear = Year.of(year);
		this.startingYear = startingYear;
	}
	@Override
	public String toString() {
		return "Employee [startingYear=" + startingYear + ", ratingOfYear=" + ratingOfYear + ", rating=" + rating + "]";
	}


}
