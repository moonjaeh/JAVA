package Day02;

import java.util.Scanner;

public class _16_middle02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. 0���� ū ������ �Է¹ް� �������� 16������ ����ϼ���*/
		Scanner sc = new Scanner(System.in);
		int num;
		//�Է¹��� ������ 2������ ��ȯ�Ǿ� ����� �迭
		//�迭�� ���̺��� ū ���� �Էµ� ��쿡�� �����迭
		//�����迭�� �迭�� ���̰� �������� �迭
		int[] twoNum = new int[100];
		
		while(true) {
			System.out.print("0���� ū ���� �Է��ϼ���.");
			num = sc.nextInt();
			if(num <= 0) {
				//���� �ڵ尡 ������� �ʰ� �ٽ� �ݺ������� ���ư�
				continue;
			} else {
				//0���� ū ������ �ԷµǸ� �ݺ��� ����
				break;
			}
		}
		
		//%x : ��簪���� ǥ��(16����)
		System.out.printf("16���� : 0x%x \n", num);
		
		//2������ ��ȯ�� ���� �迭�� �ϳ��� ����
		/*
		 * 2|13 ------ 1
		 * 2|6  ------ 0
		 * 2|3	------ 1
		 * 2|1  ------ 1
		 * 
		 * */
		for(int j = 0; j < twoNum.length; j++) {
			twoNum[j] = num % 2;
			num /= 2;
			if(num == 0) {
				break;
			}
		}
		
		System.out.print("2���� : ");
		//����� 2���� ���� �Ųٷ� ���
		//num == 13 -> 1101
		for (int i = 99; i >= 0; i--) {
			//�迭 ���� 1�� ������ ������ �����
			if (twoNum[i] == 1) {
				for (int j = i; j >= 0; j--) {
					System.out.print(twoNum[j]);
				}
				System.out.println(" ");
				break;
			}
		}
	}

}
