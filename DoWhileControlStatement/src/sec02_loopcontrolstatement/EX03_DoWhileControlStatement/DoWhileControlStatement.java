package sec02_loopcontrolstatement.EX03_DoWhileControlStatement;

public class DoWhileControlStatement {
	public static void main (String[] args) {
		// �ݺ� Ƚ���� 0�� ��, do-while ���� while �� ��
		int a;
		a = 0;
		while(a < 0) { // ���� Ƚ�� 0��
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do { // ���� Ƚ�� 1��
			System.out.print(a + " ");
			a++;
		}while (a < 0);
		System.out.println();
		
		// �ݺ� Ƚ���� 1�� �� do-while ���� while �� ��
		a = 0;
		while(a < 1) { // ���� Ƚ�� 1��
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do { // ���� Ƚ�� 1��
			System.out.print(a + " ");
			a++;
		}while(a < 1);
		System.out.println();
		
		// �ݺ� Ƚ���� 10�� �� do-while ���� while �� ��
		a = 0;
		while(a < 10) { // ���� Ƚ�� 10��
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do { // ���� Ƚ�� 10��
			System.out.print(a + " ");
			a++;
		}while(a < 10);
	}
}
