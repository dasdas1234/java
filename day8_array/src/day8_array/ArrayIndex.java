package day8_array;

import java.util.Scanner;

public class ArrayIndex { //�迭�� ÷�� ���� �ڷ����� ������ ��Ƴ�����

	public static void main(String[] args) {
		// �迭�����
		int nums[] = new int[5];
		//�迭�� �ʱⰪ�� Ű����� ������ �Է��Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		int i =0;
		while(i<nums.length) {
			System.out.print("nums["+i+"]=");
			nums[i] =scan.nextInt();
			i++;
		}
		/*
		 * nums[0] =10; nums[1] =4; nums[2] =6;
		 */
		System.out.println("-------------------");
		for( i =0; i<nums.length; i++) {
			if(i%2==0)
				continue;
			System.out.println("nums["+i+"]=" +nums[i]);
		}
	}
}
