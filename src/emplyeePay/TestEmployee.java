package emplyeePay;

import java.util.Scanner;

/*
1. 입력 자료 수는main(String[] args) 이용하여 입력 받는다.
2. 사원번호, 이름을 입력
3. 사원의 근무유형은 관리직(1), 정규직(2), 임시직(3)으로 구분한다.
사원번호가 잘 못 입력되면 “근무유형 오류 재입력….”을 출력하고 다시 입력을 받는다.
4. 관리자 - 직책과 임금을 입력
정규직 - 부서, 업무, 임금을 입력
임시직 - 부서, 월 근무시간수
5. 직무 유형에 따라 수당
관리자 : 20만원 정규직 : 10만원을 더해서 급여액을 더하여 출력한다.
임시직 : 시간당 3만원으로 정하고 시간 수에 월급여액을 구해서 출력한다.
 */
public class TestEmployee {

	public static void main(String[] args) {
		// 필드선언시 클래스타입, 임시직, 정규직
		TempEmplyoee tp;
		RegEmployee rg;
		// 필드선언시 기본타입변수, String no,name
		String no, name;

		// main메서드 매개변수인 args를 배열 선언한다
		int n = Integer.parseInt(args[0]);
		Scanner scan = new Scanner(System.in);
		// 부모의 클래스를 입력하는 갯수로 배열 만든다.
		Employee[] emp = new Employee[n];

		System.out.println("입력 자료 수 : " + n);

		// 1. 입력 자료 수만큼 반복문 for
		for (int i = 0; i < n; i++) {
			System.out.print("사원번호, 이름...");
			name = scan.next();
			// 2. System.out.print("사원번호, 이름 ..);
			// 3. no, name에 사원번호와 이름을 넣는다.
			no = scan.next();

			// 4. System.out.print("사원의 근무유형 : (1: CED, 2: 정규직, 3:임시직)..."
			System.out.print("사원의 근무유형 : (1: CEO, 2: 정규직, 3: 임시직 : )...");
			int eno = scan.nextInt();

			// 6. 입력된 eno 1과 3 사이에 있어야한다. => if(eno<1 || eno>3) 근무유형 오류 재입력 ~ else
//			if (eno < 1 || eno > 3) {
//				;
//			} else {
//				continue;ㄲ
//			}
			// 7. switch(eno) {
			// 8. case 1 : Staff클래스 적용 /case 2 : regEmployee 클래스 적용 /case 3 : /default :
			// TempEmployee
			// 입력은 직책 title, 급여 pay 변수
			// Staff sa = new Staff(name, no, title, pay)
			// eno[i] =sa

			switch (eno) {
			case 1:
				System.out.print("직책, 월 임금...");
				String title = scan.next();
				Long pay = scan.nextLong();
				Staff sa = new Staff(name, no, title);
				sa.setStaffpay(pay);
				emp[i] = sa;
				break;
			case 2:
				System.out.print("부서, 담당업무, 월 임금...");
				String dept = scan.next();
				String regtitle=scan.next();
				long regpay = scan.nextLong();
				RegEmployee sa1 = new RegEmployee(name, no, dept,regtitle);
				sa1.setRegpay(regpay);
				emp[i] = sa1;
				break;
			case 3:
				System.out.print("부서, 월 근무시간 수...");
				String hdept = scan.next();
				Long temphour = scan.nextLong();
				TempEmplyoee sa2 = new TempEmplyoee(name, no, hdept);
				sa2.setTemphour(temphour);
				emp[i] = sa2;
				break;
			default:
				System.out.println("근무 유형 입력 오류");
				i -= 1;

			}
			// 급여보고서
			// 향상된 for(데이터타입 변수 : 배열 emp) { System.out.print(변수 + "급여액 + 변수.earnings() + "만
			// 원" }

		}

		System.out.println("급여보고서");
		for (Employee e : emp) {
			System.out.println(e + "급여액" + e.earnings() + "만 원");

		}
	}
}
