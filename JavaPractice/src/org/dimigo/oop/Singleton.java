/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ Singleton
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 20.
 * </pre>
 *
 * @author : kimselin
 * @version : 1.0
 *
 */
public class Singleton {
	private static Singleton object;
	private Singleton(){
		
	}
	public static Singleton getObject(){
		if(object == null)
			object = new Singleton();
		return object;
	}
	
	//Test Data
	private int k;
	public int getData(){
		return k;
	}
	public void setData(int k){
		this.k = k;
	}
	
}
