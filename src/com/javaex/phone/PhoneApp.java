package com.javaex.phone;

import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//[시작 화면]
		System.out.println("*********************************************");
		System.out.println("*"+"              "+"전화번호 관리 프로그램"+"              "+"*");
		System.out.println("*********************************************");
		
		PhoneDao phoneDao = new PhoneDao();
		//List<PhoneVo> phoneList = new ArrayList<PhoneVo>();
		
		boolean flag = true;

		while(flag) {

			System.out.println();
			System.out.println(" [1.리스트]  [2.등록]  [3.수정]  [4.삭제]  [5.검색]  [6.종료]");
			System.out.println("-----------------------------------------------------");
			System.out.print(">메뉴번호: ");
			
			int num = sc.nextInt();
			
			switch(num) {
			
				case 1:
					System.out.println();
					System.out.println("<1.리스트>");
					System.out.println();
					
					List<PhoneVo> phoneList = phoneDao.personSelect();
					for(int i = 0; i<phoneList.size(); i++) {
						
						PhoneVo phoneVo = phoneList.get(i);
						System.out.println(phoneVo.getPersonId()+" | "+phoneVo.getName()+" | "+phoneVo.getHp()+" | "+phoneVo.getCompany());
						
					}
					
					break;
					
				case 2:
					System.out.println();
					System.out.println("<2.등록>");
					System.out.println();

					sc.nextLine();
					
					System.out.print("이름> ");
					String name = sc.nextLine();
					
					System.out.print("휴대전화> ");
					String hp = sc.nextLine();
					
					System.out.print("회사번호> ");
					String company = sc.nextLine();
					
					PhoneVo pi = new PhoneVo(name, hp, company);
					
					phoneDao.personInsert(pi);
					
					break;
					
				case 3:
					System.out.println();
					System.out.println("<3.수정>");
					System.out.println();
					
					sc.nextLine();
					
					System.out.print("번호> ");
					int personId = sc.nextInt();
					
					sc.nextLine();
					
					System.out.print("이름> ");
					String rname = sc.nextLine();
					
					System.out.print("휴대전화> ");
					String rhp = sc.nextLine();
					
					System.out.print("회사번호> ");
					String rcompany = sc.nextLine();
					
					PhoneVo pu = new PhoneVo(personId, rname, rhp, rcompany);
					
					phoneDao.personUpdate(pu);
					
					break;
					
				case 4:
					System.out.println();
					System.out.println("<4.삭제>");
					System.out.println();
					
					sc.nextLine();
					
					System.out.print("번호> ");
					int DpersonId = sc.nextInt();
					
					phoneDao.personDelete(DpersonId);
					
					break;
					
				case 5:
					System.out.println();
					System.out.println("<5.검색>");
					System.out.println();
					
					sc.nextLine();
					
					System.out.print("검색어> ");
					String keyword = sc.nextLine();
					
					List<PhoneVo> bookList = phoneDao.personSelect(keyword);
					
					for(int i = 0; i<bookList.size(); i++) {
							 
						PhoneVo phoneVo = bookList.get(i);
						System.out.println(phoneVo.getPersonId()+" | "+phoneVo.getName()+" | "+phoneVo.getHp()+" | "+phoneVo.getCompany());
						
					}
					
					break;
					
				case 6:
					System.out.println();
					System.out.println("<6.종료>");
					System.out.println();
					
					System.out.println("*********************************************");
					System.out.println("*"+"                  "+"감사합니다"+"                  "+"*");
					System.out.println("*********************************************");
					
					flag = false; //탈출
					break;
					
				default:
					System.out.println();
					System.out.println("[다시 입력해 주세요.]");
					System.out.println();
					
					break;
			
			}
			
		}//while(flag)
		
		sc.close();
		
	}//main

}//PhoneApp
