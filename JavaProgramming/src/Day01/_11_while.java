package Day01;

public class _11_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. while 반복문
		int sum = 0;
		int i = 0;
		
		//조건식이 true일 때 반복해서 실행
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1 ~ 100까지의 합은 " + sum);
	}

}
