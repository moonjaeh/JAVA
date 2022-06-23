package Day02;

import java.util.Scanner;

public class _12_basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. int 배열로 10개의 공간을 생성하라
  		 	 1 ~ 10까지의 임의의 수를 저장하고
  			 홀수만 골라서 출력하라*/
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 10) + 1;
		}
		
		for(int num : nums) {
			//2로 나눴을 때 나머지가 1이 되면 홀수
			//2로 나눴을 때 나머지가 0이 되면 짝수
			if(num % 2 == 1) {
				System.out.println(num);
			}
		}
	}

}
