/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ SingletonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 20.
 * </pre>
 *
 * @author : kimselin
 * @version : 1.0
 *
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton k=Singleton.getObject();
		Singleton b=Singleton.getObject();
		k.setData(1);
		System.out.println(b.getData());

	}

}
