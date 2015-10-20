import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class KisoKadai2 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int ans = rnd.nextInt(100) + 1;
		int usans = 0;
		boolean flag = true;
		System.out.println("数当てゲームをします");
		while (flag) {
			System.out.print("数値は1~100までの整数です\n値を入力してください: ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();
				usans = Integer.parseInt(buf);
			} catch (Exception e) {
				usans=0;
			}
			if (usans==0||usans>100){
			System.out.println("1~100の整数です");
			}else if (ans==usans){
			System.out.println("Congratulations!");
			flag = false;
		}else if(ans < usans){
			System.out.println("大きすぎます");
		}else if(ans > usans){
			System.out.println("小さすぎます");
		}
		}
	}

}