package day8_array;

public class Starbucks {
	
	public static void main(String[] args) {
		//int[] coffee =new int[7];
		//coffee[0] =12;
		
		int[] coffee = {12,33,44,55,66,77,88};
		//���Ǹ����� ����Ͻÿ�
		int sum =coffee[0]+coffee[1]+coffee[2]+coffee[3]+coffee[4]+coffee[5]+coffee[6];
		System.out.println("sum ="+sum+"��");
		for(int i =0; i<coffee.length;i++) {
			sum= sum+coffee[i];
		}
		System.out.println("sum ="+sum+"��");
		//�Ǹűݾ��� ����Ͻÿ�. ���ܴ� 2000���� ����մϴ�.
		sum =sum*2000;
		System.out.println("�ݾ� ="+sum+"��");
	}
}
