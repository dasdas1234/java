package day8_array;

public class ArrayString {

	public static void main(String[] args) {
		// ���ڿ� �迭 �����
		int arr[] = {1,2,3};
		String[] games = {"���׿��극����","�߷ζ�Ʈ","��Ʋ�׶���"};
		System.out.print("�����̸�:");
		for(int i =0; i<games.length; i++) {
			System.out.print(games[i]+" ");
		}
		System.out.println(" ");
		System.out.print("��   ��:");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
