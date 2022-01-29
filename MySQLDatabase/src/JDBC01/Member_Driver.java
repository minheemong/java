package JDBC01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Member_Driver {

	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n--- 메뉴 선택 ---");
			System.out.printf("1. 데이터추가.");    		System.out.printf("  2. 데이터열람.");
			System.out.printf("  3. 데이터수정.");		System.out.printf("  4. 데이터삭제.");
			System.out.println("  5. 프로그램 종료.");	System.out.print(">>메뉴 선택 : ");			
			String choice = sc.nextLine();
			if( choice.equals("5")) break;	
			switch( choice ) {
				case "1": insert();		break;
				case "2": select();		break;
				case "3": update();		break;
				case "4": delete();		break;
				default : System.out.println("메뉴 선택이 잘못되었습니다");
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void delete() {
		Member_Dao mdao = Member_Dao.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 회원번호를 선택하세요: ");
		String num = sc.nextLine();			
		mdao.delete(num);	}

	private static void update() {
		Member_Dto newDto = new Member_Dto();
		Scanner sc = new Scanner(System.in);
		Member_Dao mdao = Member_Dao.getInstance();
		
		// 회원 번호 입력
		String membernum;
		while(true) {
			System.out.printf("수정할 회원번호를 입력하세요");
			membernum = sc.nextLine();
			if( membernum.equals("") ) System.out.println("회원번호 입력은 필수 입니다");
			else break;
		}
		Member_Dto oldDto = mdao.getMember(  Integer.parseInt( membernum ) );
		// 조회결과가 없으면 메서드 종료
		if( oldDto == null ) {
			System.out.println("해당 회원이 없습니다");
			return;
		}
		// 조회 결과가 있으면 newDto 에 회원 번호 저장
		newDto.setMembernum( Integer.parseInt( membernum ) );
		// 이름 입력
		System.out.printf("성명을 입력하세요 : ");
		String name = sc.nextLine();
		if( name.equals("") ) newDto.setName( oldDto.getName() );
		else newDto.setName( name );
		// 전화번호 입력
		System.out.printf("전화번호를 입력하세요 : ");
		String phone = sc.nextLine();
		if( name.equals("") ) newDto.setPhone( oldDto.getPhone() );
		else newDto.setPhone( phone );
		
		// 생일 입력 - 나이 자동 계산 수정
		System.out.print("생일을 입력하세요(YYYYMMDD) : ");
		String birth = sc.nextLine();
		String year = birth.substring(0,4);
		if( birth.equals("") ) newDto.setBirth( oldDto.getBirth() );
		else newDto.setBirth( birth );
		
		//나이는 계산
		Calendar today = Calendar.getInstance();
		int age = today.get(Calendar.YEAR) - Integer.parseInt(year) +1;
		newDto.setAge(age);
		
		// 나이는 입력 받지 않고 계산			
		
		// 성별 입력
		System.out.printf("성별을 입력하세요 : ");
		String gender = sc.nextLine();
		if( gender.equals("") ) newDto.setGender( oldDto.getGender() );
		else newDto.setGender( gender );
		
		// bpoint 입력
		System.out.printf("포인트를 입력하세요 : ");
		String bpoint = sc.nextLine();
		if( bpoint.equals("") ) newDto.setBpoint( oldDto.getBpoint() );
		else newDto.setBpoint( Integer.parseInt(bpoint) );
		// 모든 항목은 입력된 값이 있을때만 수정하며, 필드값 입력중 입력된 값이 없으면(엔터만 입력)
		// 이전 값(oldDto)을 유지 합니다
		
		newDto.setJoindate( oldDto.getJoindate() );
		
		mdao.update( newDto );
		
	}

	private static void select() {
		Member_Dao mdao = Member_Dao.getInstance();
		
		ArrayList<Member_Dto> list = mdao.select();
		System.out.println("번호\t 이름\t\t 전화\t\t\t생일\t\t\t포인트\t\t\t나이\t성별\t가입일");
		System.out.println("-----------------------------------------------------");
		for(Member_Dto dto : list) 
			System.out.printf("%d\t %s\t %s\t %s\t %6d\t %3d\t %s\t %s\n", dto.getMembernum(), 
				dto.getName(), dto.getPhone(), dto.getBirth(),dto.getBpoint(),dto.getAge(),
				dto.getGender(), dto.getJoindate());
		
	}

	private static void insert() {
		Member_Dao mdao = Member_Dao.getInstance();
		Scanner sc = new Scanner(System.in);
		Member_Dto mdto = new Member_Dto();
		
		System.out.print("이름을 입력하세요 : ");
		mdto.setName(sc.nextLine());
		
		System.out.print("전화번호를 입력하세요 : ");
		mdto.setPhone(sc.nextLine());
		
		System.out.print("생일을 입력하세요(YYYYMMDD) : ");
		String birth = sc.nextLine();
		String year = birth.substring(0,4);
		mdto.setBirth(birth);
		//나이는 계산
		Calendar today = Calendar.getInstance();
		int age = today.get(Calendar.YEAR) - Integer.parseInt(year) +1;
		mdto.setAge(age);
		
		System.out.print("성별을 입력하세요 : ");
		mdto.setGender(sc.nextLine());
		
		mdao.insert(mdto);
	}

}
