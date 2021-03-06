/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : gimselin
 * @version : 1.0
 *
 */
public class Car3 {
	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 255;
	private int price = 50000000;
	
	public Car3(){
		
	}
	
	public Car3(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice){
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	public Car3(String newCompany, String newModel, String newColor, int newMaxSpeed){
		this(newCompany,newModel,newColor,newMaxSpeed,0);
	}
	public Car3(String newCompany, String newModel, String newColor){
		this(newCompany,newModel,newColor,0,0);	
	}
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;	
	}
	public int getMaxSpeed(){
		return maxSpeed;	
	}
	public int getPrice(){
		return price;	
	}

}
