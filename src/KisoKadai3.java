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
			System.out.println("�t�@�C���̓ǂݎ��A�������݂��s���܂�\n���݂��Ȃ��ꍇ�͐V�K�쐬���܂�");
			System.out.println("���L�̗�ɏ]���ăt�@�C���������ĉ�����");
			System.out.println("��jC:\\test\\test2\\testtext.txt");
			System.out.print("�t�@�C����:");
			str = br.readLine();
		} catch (IOException e1) {
			System.out.println("�K�؂ȓ��͂ł͂���܂���");
			e1.printStackTrace();
		}
		File file = new File(str);
		File dir = new File(file.getParent());
		if (!dir.exists()) {
			System.out.println("�t�H���_���쐬���܂�");
			dir.mkdir();
		} 
		if (!file.exists()) {
			System.out.println("�t�@�C�����쐬���܂�");

			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		boolean flag=true;
		while(flag){
		System.out.println("�t�@�C���̍�Ƃ�I�����Ă�������");
		System.out.println("1:�ǂݎ��@2�F�������@3�F�I��");

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
			System.out.println("�������ݕ��@��I�����Ă�������\n1:�ǋL�@2:�㏑��");
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
		case 3:System.out.println("�����l�ł���");
			flag = false;
			break;
		default:System.out.println("1~3�ŋL�����Ă�������");
		break;
		}
	}
	}
}
