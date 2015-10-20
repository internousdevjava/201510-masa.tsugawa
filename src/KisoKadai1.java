import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai1 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("100段までの掛け算表(x*y)を表示します\n101を入力すると終了します");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.print("xの値を入力してください: ");
			try {

				String buf = br.readLine();
				x = Integer.parseInt(buf);
			} catch (Exception e) {
				x = 0;
			}
			if (x == 101) {
				flag = false;
				System.out.println("さようならー");
				break;
			}
			if (x > 100) {
				System.out.println("100以下の数値を入力してください");
				continue;
			} else if (x == 0 || x < 0) {
				System.out.println("1~100の整数を入力してください");
				continue;
			}
			boolean flagy = true;
			while (flagy) {
				System.out.print("yの値を入力してください: ");
				try {
					String buf2 = br.readLine();
					y = Integer.parseInt(buf2);
				} catch (Exception e2) {
					y = 0;
				}
				if (y > 100) {
					System.out.println("100以下の数値を入力してください");
					continue;
				} else if (y == 0 || y < 0) {
					System.out.println("1~100の数値を入力してください");
					continue;
				}

				System.out.println("掛け算表");
				int kuku[][] = new int[100][100];
				for (int i = 1; i <= x; i++) {
					for (int j = 1; j <= y; j++) {
						System.out.print(i * j + " ");
					}
					System.out.println();
					flagy = false;
				}

			}
		}
	}
}
