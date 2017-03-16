/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *  |_ Loop
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 *
 * @author : gimselin
 * @version : 1.0
 *
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		int attack = 100;
		String[] ch = {"마법사", "영주", "기사", "농민"};
		 do {
			 System.out.println("--------------------");
			 System.out.println("<< 게임메뉴 >>");
			 System.out.println("1. 공격력 증가");
			 System.out.println("2. 공격력 감소");
			 System.out.println("3. 캐릭터 설정");
			 System.out.println("9. 종료");
			 System.out.println("--------------------");
			 System.out.print("메뉴 입력=> ");	 
			 choice = scanner.nextInt();
			 
			 switch(choice) {
			 case 1 : 
				 attack = attack+10;
				 System.out.println("공격력이 증가되었습니다.현재 공격력 : "+attack); 
				 break;
			 case 2 : 
				 attack = attack-10;
				 System.out.println("공격력이 감되었습니다.현재 공격력 : "+attack); 
				 break;
			 case 3 : 
				 int ran = new Random().nextInt(4) + 1;
				 System.out.println(ch[ran]+"(으)로 설되었습니다."); 
				 break;
			 case 9 : 
				 System.out.println("이제 공부하세요!");
				 break;
			 default : 
				 System.out.println("없는 메뉴입니다!!");
				 break;
			 }	
		 }
		 while(choice!=9);
	}

}
