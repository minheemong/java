package prac_rent;

import java.util.ArrayList;
import java.util.Scanner;

public class Rent_Driver {

	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("데이터를 선택하세요");
			System.out.println("1. 데이터입력		2. 데이터열람		3. 데이터수정");
			System.out.println("4. 데이터삭제		5. 프로그램 종료");
			String choice = sc.nextLine();
			if(choice.equals("5")) {System.out.print("프로그램을 종료합니다"); break;}
			switch(choice) {
			case "1" : insert(); break;
			case "2" : select(); break;
			case "3" : update(); break;
			case "4" : delete(); break;
			default : System.out.print("데이터 선택이 잘못되었습니다");
			}
		}
	}

	private static void delete() {
		// TODO Auto-generated method stub
		
	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void select() {
		Rent_Dao rdao = Rent_Dao.getInstance();
		
		ArrayList<Rent_Dto> list = rdao.select();
		System.out.println("RENTDATE\t\t\tNUMSEQ\tBOOKNUM\tMEMBERNUM\tDISCOUNT");
		System.out.println("-----------------------------------------------------------------");
		for(Rent_Dto dto:list) 
			System.out.printf("%s\t\t\t%d\t%d\t%d\t%d\n",
					dto.getRentdate(),dto.getNumseq(),dto.getBooknum(),
					dto.getMembernum(),dto.getDiscount());
			
			
		}

	private static void insert() {
		// TODO Auto-generated method stub
		
	}
	

}
