package sec04_controlkeyword.EX02_ContinueControlKeyword;

public class ContinueControlKeyword {
	public static void main (String[] args) {
		// ���� �ݺ������� continue ���
		for(int i = 0; i < 10; i++) {
			continue;
			// System.out.print(i + " " ); �����߻�
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			continue;
		}
		System.out.println();
		
		for(int i = 0; i <10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		// ���� �ݺ������� continue ���
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					continue;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		POS1: for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					continue POS1;
				}
				System.out.println(i + ", " + j);
			}
		}
	}
}
