package Day07;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			if(i == 0) {
				System.out.print(arr[i] + "\t");
			} else {
				int j = 0;
				while(true) {
					if(arr[i] != arr[j++]) {
						if(j == i) {
							System.out.print(arr[i] + "\t");
							break;
						}
					} else {
						i--;
						break;
					}
				}
			}
		}
	}

}
