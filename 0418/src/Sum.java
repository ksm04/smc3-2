import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b=0;
		int sum=0;
		System.out.print("���� ����: ");
		a = scan.nextInt();
		System.out.print("������ ����: ");
		b = scan.nextInt();
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a+"���� "+b+"������ ���� "+ sum);
	}

}
