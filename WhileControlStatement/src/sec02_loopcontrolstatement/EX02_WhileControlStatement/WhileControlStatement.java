package sec02_loopcontrolstatement.EX02_WhileControlStatement;

public class WhileControlStatement {
	public static void main (String[] args) {
		//While�� �⺻ ���� ����
		int a = 0;
		while(a < 10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		// for ������ ��ȯ
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int b = 10;
		while(b > 0) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();
	
		// for ������ ��ȯ
		for(int i = 10; i > 0; i--) {
			System.out.print(i + " " );
		}
		
		//while ������ ���� ���� ����
		/*
		 *while(true) {
		 	System.out.print("���� ����");
		 }
		 */
		System.out.println();
		
		// ���� ���� Ż��
		int c = 0;
		 while(true){
			 if(c > 10) {
				 break;
			 }
			 System.out.print(c + " ");
			 c++;
		 }
	}
}
