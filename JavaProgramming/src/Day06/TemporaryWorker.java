package Day06;

public class TemporaryWorker extends Employee {//임시직
	public TemporaryWorker(int num, String name, double pay) {
		super(num, name, pay);
	}
	
	public void ShowEmployeeInfo() {
		super.ShowEmployeeInfo();
		System.out.println("연봉 : " + pay);
	}
	
	public double getMonthPay() {
		System.out.println("이름 : " + name);
		System.out.println("월급 : " + pay / 12);
		return pay / 12;
	}
	
	
}