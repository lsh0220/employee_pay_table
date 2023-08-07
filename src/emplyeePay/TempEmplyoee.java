package emplyeePay;
/*
 ​1) 임시직 사원을 나타내는 자식 클래스

2) 추가 hdept, temphour필드와 TempEmployee()생성자

3) 변수의 값을 연결한 문자열을 반환하는 toString()메소드

4) 월 근무시간 수에 3만원을 곱하여 급여액을 계산하는 erinings()메소드로 구성된다.
 */
public class TempEmplyoee extends Employee {

	String hdept;
	Long temphour;
	
	public TempEmplyoee(String ename, String esno, String hdept) {
		super(ename, esno);
		this.hdept=hdept;
	}

	public Long getTemphour() {
		return temphour;
	}

	public void setTemphour(Long temphour) {
		this.temphour = temphour;
	}

	@Override
	public String toString() {
		return super.toString()+ ", 부서 : " + hdept + ",";
	}

	@Override
	public long earnings() {
		return 3*temphour;
	}

}
