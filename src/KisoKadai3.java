import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai3 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		int slcm = 0;
		try {
			System.out.println("ファイルの読み取り、書き込みを行います\n存在しない場合は新規作成します");
			System.out.println("下記の例に従ってファイル名を入れて下さい");
			System.out.println("例）C:\\test\\test2\\testtext.txt");
			System.out.print("ファイル名:");
			str = br.readLine();
		} catch (IOException e1) {
			System.out.println("適切な入力ではありません");
			e1.printStackTrace();
		}
		File file = new File(str);
		File dir = new File(file.getParent());
		if (!dir.exists()) {
			System.out.println("フォルダを作成します");
			dir.mkdir();
		} 
		if (!file.exists()) {
			System.out.println("ファイルを作成します");

			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		boolean flag=true;
		while(flag){
		System.out.println("ファイルの作業を選択してください");
		System.out.println("1:読み取り　2：書き取り　3：終了");

		try {
			slcm = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

		switch (slcm) {
		case 1:
			try {
				FileReader filereader = new FileReader(file);
				int ch;

				while ((ch = filereader.read()) != -1) {
					System.out.print((char) ch);
				}
				filereader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			int slcw = 0;
			System.out.println("書き込み方法を選択してください\n1:追記　2:上書き");
			try {
				slcw = Integer.parseInt((br.readLine()));
				System.out.print("記入: ");
				if (slcw == 1) {
					FileWriter fwt = new FileWriter(file, true);
					String strfwt = "";
					strfwt = br.readLine();
					fwt.write(strfwt + "\r\n");
					fwt.close();
				} else if (slcw == 2) {
					FileWriter fwf = new FileWriter(file, false);
					String strfwf = "";
					strfwf = br.readLine();
					fwf.write(strfwf + "\r\n");
					fwf.close();
				}
			} catch (IOException e) {
				System.out.println(e);

			}
			break;
		case 3:System.out.println("お疲れ様でした");
			flag = false;
			break;
		default:System.out.println("1~3で記入してください");
		break;
		}
	}
	}
}
