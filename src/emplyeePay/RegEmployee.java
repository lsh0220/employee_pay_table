package emplyeePay;
/*
 ​1) 정규직 사원을 나타내는 자식 클래스
2) 추가로 dept, regpay, regtitle 필드와 RegEmployee()생성자
3) 변수의 값을 연결한 문자열을 반환하는 toString()메소드
4) 월 임금에 10만원을 더하여 급여액을 계산하는 erinings()메소드로 구성된다.
 */
public class RegEmployee extends Employee {
	String dept;
	Long regpay;
	String regtitle;
	
	public RegEmployee(String name, String sno, String dept, String regtitle) {
		super(name, sno);
		this.dept = dept;
		this.regtitle=regtitle;
	}

	public Long getRegpay() {
		return regpay;
	}

	public void setRegpay(Long regpay) {
		this.regpay = regpay;
	}

	@Override
	public String toString() {
		return super.toString() + ", 부서 : " +dept + ",";
	}

	@Override
	public long earnings() {
		return regpay+10;
	}
	}
