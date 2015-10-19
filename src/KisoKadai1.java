import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KisoKadai1 {
	public static void main(String[] args) {
		System.out.println("100段までの掛け算(x*y)表を表示します");
		boolean flag = true;
		while (flag) {
			int x = 0;
			System.out.print("xの値を入力してください: ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try {

				String buf = br.readLine();
				x = Integer.parseInt(buf);
			} catch (Exception e) {
				x = 0;
			}
			if (x > 100) {
				System.out.println("100以下の値をご入力下さい");
				continue;
			} else if (x == 0 || x < 0) {
				System.out.println("1〜100の整数を入れて下さい");
				continue;
			}

			int y;
			System.out.print("ｙの値を入力してください: ");
			InputStreamReader isry = new InputStreamReader(System.in);
			BufferedReader bry = new BufferedReader(isry);
			try {
				String buf2 = bry.readLine();
				y = Integer.parseInt(buf2);
			} catch (Exception e2) {
				y = 0;
			}
			if (y > 100) {
				System.out.println("1〜100の整数を入れて下さい\nxの入力に戻ります");
				continue;
			} else if (y == 0 || y < 0) {
				System.out.println("1〜100の整数を入れて下さい\nxの入力に戻ります");
				continue;
			}

			System.out.println("掛け算表");
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
