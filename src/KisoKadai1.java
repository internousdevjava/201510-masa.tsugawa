import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KisoKadai1 {
	public static void main(String[] args) {
		System.out.println("100�i�܂ł̊|���Z(x*y)�\��\�����܂�");
		boolean flag = true;
		while (flag) {
			int x = 0;
			System.out.print("x�̒l����͂��Ă�������: ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try {

				String buf = br.readLine();
				x = Integer.parseInt(buf);
			} catch (Exception e) {
				x = 0;
			}
			if (x > 100) {
				System.out.println("100�ȉ��̒l�������͉�����");
				continue;
			} else if (x == 0 || x < 0) {
				System.out.println("1�`100�̐��������ĉ�����");
				continue;
			}

			int y;
			System.out.print("���̒l����͂��Ă�������: ");
			InputStreamReader isry = new InputStreamReader(System.in);
			BufferedReader bry = new BufferedReader(isry);
			try {
				String buf2 = bry.readLine();
				y = Integer.parseInt(buf2);
			} catch (Exception e2) {
				y = 0;
			}
			if (y > 100) {
				System.out.println("1�`100�̐��������ĉ�����\nx�̓��͂ɖ߂�܂�");
				continue;
			} else if (y == 0 || y < 0) {
				System.out.println("1�`100�̐��������ĉ�����\nx�̓��͂ɖ߂�܂�");
				continue;
			}

			System.out.println("�|���Z�\");
			int kuku[][] = new int[100][100];
			for (int i = 1; i <= x; i++) {
				for (int j = 1; j <= y; j++) {
					System.out.print(i * j + " ");
				}
				System.out.println();
				flag = false;
			}

		}
	}
}
