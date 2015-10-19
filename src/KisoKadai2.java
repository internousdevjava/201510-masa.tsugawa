import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class KisoKadai2 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int ans = rnd.nextInt(100) + 1;
		int usans = 0;
		boolean flag = true;
		System.out.println("”“–‚ÄƒQ[ƒ€‚ğ‚µ‚Ü‚·\n“š‚¦‚Í1`100‚Ì’l‚Å‚·");
		while (flag) {
			System.out.print("”’l‚ğ“ü‚ê‚Ä‰º‚³‚¢: ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();
				usans = Integer.parseInt(buf);
			} catch (Exception e) {
				usans=0;
			}
			if (usans==0||usans>100){
			System.out.println("1`100‚Ì®”‚Å‚·‚æ");
			}else if (ans==usans){
			System.out.println("Congratulations!");
			flag = false;
		}else if(ans < usans){
			System.out.println("‘å‚«‚·‚¬‚Ü‚·");
		}else if(ans > usans){
			System.out.println("¬‚³‚·‚¬‚Ü‚·");
		}
		}
	}

}