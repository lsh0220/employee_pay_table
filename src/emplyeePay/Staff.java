package emplyeePay;
/*
 <Staff클래스>
1) Staff클래스는 Employee클래스의 name, sno 필드와 toString() 메소드를 상속 받는다.
2) 추가로 자신의 title와 staffpay변수를 갖으며 상속받는 2개의 변수와 자신의 변수를 초기화할 생성자를 갖는다.
3) 자식클래스의 생성자의 매개변수는 자신의 변수를 초기화하기 위한 2개의 매개변수뿐만 아니라 상속받는 2개의 변수를 초기화 하기 위한 매개변수도 나타내야 한다.
4) Employee 부모클래스의 name - > ename 매개변수의 값, sno - > esno 매개변수의 값을 가지고 온다.
5) 클래스의 각 변수의 값
출력할 형태로 연결된 문자열을 반환하는 toString()메소드
급여를 정하여 반환하는 earnings() 메소드
 */

//Staff클래스는 Employee의 name, sno 필드와 toString() 메서드를 상속받는다
public class Staff extends Employee {
	

	//추가로 자신의 title, staffpay 필드를 갖는다
	String title;
	Long staffpay;
	
	//부모가 가지고 있는 문자열 타입 이름, 사원번호에 직책을 추가한다.
	public Staff(String ename, String esno, String title) {
		//부모가 가지고 있는 것에 접근하는 super 예약어
		super(ename, esno);
		//나 자신의 title 변수와 필드가 같게 선언
		this.title= title;
		}
	//새롭게 추가한 staffpay의 생성자를 만든다
	public Long getStaffpay() {
		//반환되는 값은 staffpay 필드이다
		return staffpay;
	}
	// 새롭게 추가한 staffpay 생성자에 매개변수를 넣는다
	public void setStaffpay(Long staffpay) {
		//나 자신의 staffpay 변수와 필드가 같게 선언
		this.staffpay = staffpay;
	}
	//재정의한다
	@Override
	public String toString() {
		//부모의 값에 이어서 직책을 반환한다
		return super.toString()+ ", 직책 : " + title + "," ;
	}
	@Override
	public long earnings() {
		return staffpay+20;
	}
}
