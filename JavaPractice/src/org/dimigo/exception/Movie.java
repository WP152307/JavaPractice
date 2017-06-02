package org.dimigo.exception;

public class Movie {

	private String title;
	private int limitAge;

	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return this.title;
	}

	public int getLimitAage() {
		return this.limitAge;
	}

	public void buyTicket(int age) throws Exception{
		if(age<limitAge){
			throw new Exception(title + "은/는 " + limitAge + "세 이상 관람가입니다.");
		} else{
			System.out.println(title + " 즐감하세요.");
		}
		
	}
}
