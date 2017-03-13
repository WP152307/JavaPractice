/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *  |_ Operator
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author : gimselin
 * @version : 1.0
 *
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long pay = 1700000, store = 1500;
		int em = 3;
		long expense;
		expense = pay * 12 * em * store;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : "+String.format("%,d", pay)+"원");
		System.out.println("점포 내 직원 수 : "+em+"명");
		System.out.println("점포 수 : "+String.format("%,d", store)+"개");
		System.out.println("\n\n연간 인건비 : "+String.format("%,d", expense)+"원");

	}

}
