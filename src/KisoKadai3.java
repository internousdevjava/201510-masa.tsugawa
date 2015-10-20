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
		while(true){
		try {
			System.out.println("ファイルの編集をします\nファイルまたはフォルダがない場合は新規作成します");
			System.out.println("下記の例にしたがってファイル名を記入してください");
			System.out.println("C:\\test\\test2\\text.txt");
			System.out.print("ファイル名:　");
			str = br.readLine();
		
		File file = new File(str);
		File dir = new File(file.getParent());
		if (!dir.exists()) {
			System.out.println("フォルダを作成します");
			dir.mkdirs();
			System.out.println("作成完了");
		}
		if (!file.exists()) {
			System.out.println("ファイルを作成します");
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("作成エラー");
				e.printStackTrace();
			}
			System.out.println("作成完了");
		}
		
		
		
		boolean flag = true;
		while (flag) {
			System.out.println("ファイルの編集方法を選択してください");
			System.out.println("1:読み込み　2:書き込み　3:ファイルの再指定　4:終了");

			try {
				slcm = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				System.out.println("入力ミス");
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
					System.out.print("�L��: ");
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
			case 3:flag=false;
				continue;
			case 4:
				System.out.println("お疲れ様でした");
				flag = false;
				break;
			default:
				System.out.println("1~4で入力してください");
				break;
			}
		}
		} catch (Exception e1) {
			System.out.println("入力ミス");
		}
	}
}}
