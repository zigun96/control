package sec04_controlKeyword.EX01_BreakControlKeyword;

public class BreakControlKeyword {
	public static void main (String[] args) {
		// ���� �ݺ��� Ż��
		for(int i = 0; i <10; i++) {
			System.out.println(i);
			break;
		}
		
		for(int i = 0; i < 10; i++) {
			if( i == 5) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		// ���� �ݺ��� Ż��
		// @1���� �ݺ����� Ż���� ��
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 2) {
					break;
				}
				System.out.println(i + " , " + j);
			}
		}
		System.out.println();
		
		// @�������� ������ ���� �ݺ��� Ż��
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if( j == 2 ) {
					i = 100;
					break;
				}
				System.out.println(i + ", "+ j);
			}
		}
		System.out.println();
	}
}
