package test1107;

import java.util.ArrayList;
import java.util.Scanner;

import test1107.Student;

public class GradeMenu {
	Scanner scan = new Scanner(System.in);
	Student sc = new Student();
	Grade gc = new Grade();
	private Object[] members;
	
//메뉴선택
	public void mainMenu(){
		while(true) {
			System.out.println();
			System.out.println("=======================");
			System.out.println("1. 회원정보 및 점수입력");
			System.out.println("2. login(출력은login되어야)");
			System.out.println("3. 학생정보 출력");
			System.out.println("4. 합계와 평균출력");
			System.out.println("5. logout");
			System.out.println("9. 프로그램종료");
			
			System.out.print("메뉴 번호 선택 : ");
			int num = scan.nextInt();
			scan.nextLine();
			
			switch(num) {
			case 1:
				insertStudent(); 
				break;
			case 2:
				loginMember();
				break;
			case 3:
				selectList();
				break;
			case 4:
				sumList();
				break;
			case 5:
				logoutMember();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	
	
//1.학생정보 및 점수입력
	private void insertStudent() {
		System.out.println();
		System.out.println("===== 새 학생 추가 =====");
		System.out.print("id 입력 : ");
		int id = scan.nextInt();
		System.out.print("이름 입력 : ");
		String name = scan.nextLine();
		System.out.print("비밀번호 입력");
		int password = scan.nextInt();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		System.out.print("국어점수 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = scan.nextInt();
		System.out.print("컴퓨터 점수 입력 : ");
		int com = scan.nextInt();
		System.out.print("수학점수 입력 : ");
		int math = scan.nextInt();
		//sc.insertStudent(new Student(id,name,password,age,kor,eng,com,math));
	}

//2. 로그인
	private void loginMember() {
	int student[] = {};
	
	System.out.print("id 입력 : ");
	int id = scan.nextInt();
	System.out.print("비밀번호 입력");
	int passeord = scan.nextInt();
	
	boolean stu = false;
	for(int i=0; i<student.length; i++) {
		if(id.equals(student[i])) {
			stu = true;
			break;
		}
	}
	if(stu)
		System.out.println("로그인되었습니다");
	else {
		System.out.println("ID 혹은 PASSWORD가 틀렸습니다");
		int count;
		count = count + 1;
		if(count>3) {
			System.out.println("비밀번호 3회 오류로 로그인 할수 없습니다.");
		}
	}
  }		
		
	
	
//3. 학생정보 출력
	private void selectList() {
		
		Student sc = new Student();
		System.out.println();
		System.out.println("===== 학생정보 출력 =====");
		ArrayList<Student> selectList = sc.selectList();
		if(selectList.isEmpty()) {
			System.out.println("학생이 없습니다");
		} else {
			for(Student student : selectList) {
				System.out.println("\t" + student);
			}
		}	
	}
	
	
	
//4. 합계와평균 출력
		private void sumList() {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("점수3개입력:");
			int kor, eng, com, math, sum;
			sum = gc.getKor() + gc.getEng() + gc.getCom() + gc.getMath();
			System.out.println("합계:" + sum);
			System.out.println("평균:" + sum/4.0); 
		}
		
	

//5. 로그아웃
		private void logoutMember() {
			boolean login (int id, int password) {
				if (id == id && password == password) {
					return true;
				}
				else {
					return false;
				}
			}
			void logout (int id) {
				System.out.println("로그아웃 되었습니다.");
			}
		}

	
	
	
	


}
