package Day02;

import java.util.Scanner;

public class _12_basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. int �迭�� 10���� ������ �����϶�
  		 	 1 ~ 10������ ������ ���� �����ϰ�
  			 Ȧ���� ��� ����϶�*/
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 10) + 1;
		}
		
		for(int num : nums) {
			//2�� ������ �� �������� 1�� �Ǹ� Ȧ��
			//2�� ������ �� �������� 0�� �Ǹ� ¦��
			if(num % 2 == 1) {
				System.out.println(num);
			}
		}
	}

}
