package Day02;

public class _10_basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. int배열을 10개 생성해라.
 			 int배열에 3의 배수를 차례대로 저장해라.
 			 그리고 거꾸로 출력해라.*/
		int[] nums = new int[10];
		int num = 1;
		//배열의 인덱스
		int count = 0;
		
		while(true) {
			if(num % 3 == 0) {
				//index가 0 ~ 9까지 3의 배수 저장
				nums[count++] = num;
			}
			num++;
			
			if(count == 10) {
				//index가 10이 되면 반복문 종료
				break;
			}
		}
		
		//index가 9 ~ 0 거꾸로 출력
		for(int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
	}

}
