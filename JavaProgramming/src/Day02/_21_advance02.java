package Day02;

import java.util.Scanner;

public class _21_advance02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. ���� ���� �� ������ ����ϴ�
   			 ��ǻ�ʹ� ������ �����ϰ� ����ڴ� ���ڿ��� �Է¹޽��ϴ�
   			 10�� �����ϰ� �� �� ��� �� ����ϼ���*/
		Scanner sc = new Scanner(System.in);
		String strNum = "";
		int num = 0;
		int randomNum = 0;
		
		for(int i = 0; i < 10; i++) {
			randomNum = (int)(Math.random() * 3);
			//0 : ����, 1 : ����, 2 : ��
			System.out.println(randomNum);
			
			System.out.print("����, ����, �� �� �ϳ� �Է�");
			strNum = sc.nextLine();
			
			if(strNum.equals("����")) {
				num = 0;
			} else if(strNum.equals("����")) {
				num = 1;
			} else if(strNum.equals("��")) {
				num = 2;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				//�߸� �Է� �� �� ȸ�� ���� �ٽ� ����
				i--;
				continue;
			}
			
			if(num == randomNum) {
				System.out.println("���");
			} else if(num == 0) {
				if(randomNum == 1) {
					System.out.println("��");
				} else {
					System.out.println("��");
				}
			} else if(num == 1) {
				if(randomNum == 2) {
					System.out.println("��");
				} else {
					System.out.println("��");
				}
			} else if(num == 2) {
				if(randomNum == 0) {
					System.out.println("��");
				} else {
					System.out.println("��");
				}
			}
		}
	}

}