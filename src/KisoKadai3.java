import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class KisoKadai3 {

	public static void main(String[] args) throws IOException {
//スタート
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b = 0;
		boolean z = true;
		boolean z1 = true;
		boolean z2 = true;
		String str,str1;
		String str2,str3;
		FileWriter  fw;
		PrintWriter pw;

		while(z){
		System.out.println("文字入力スペース");
		str = br.readLine();
//分岐
		System.out.println("今の記述を保存しますか？");
			while(z1){
				System.out.println("該当する数字を入力して下さい 1.保存しない 2.新規フォルダ・ファイルの作成、保存"
				+ " 3.既存のフォルダ・ファイルに保存 4.ファイルの参照 5.文字入力");

				try{str1 = br.readLine();
				a = Integer.parseInt(str1);}
				catch(NumberFormatException nfe){continue;}

			if(a == 1){//保存しない場合
					System.out.println("テキストファイルを終了しますか？ 1.いいえ 2.はい");
					try{str2 = br.readLine();
					b = Integer.parseInt(str2);}
					catch(NumberFormatException nfe){continue;}
						if(b == 1){continue;}//メニュー選択にとばす　まだ出来ていない。
						else{}break;}//テキスト終了　○

			else if(a == 2){//新規ファイル・フォルダの作成
				System.out.println("新規フォルダ・ファイルの作成をします");
				//フォルダ
					System.out.println("フォルダ名を指定して下さい 「c:\\\\」は不要");
					 str2 = br.readLine();
					 File f = new File("c:\\\\" + str2);
					 	if(!f .exists()){f .mkdirs();
					 		System.out.println("フォルダを作成しました"+"\n"+"ファイル名を指定してください 「ｃ:\\\\」「.txt」は不要");
					 	}else{System.out.println("フォルダは既に存在します"+"\n"+"新しいファイル名を指定してください 「ｃ:\\\\」「.txt」は不要");}
					 		try{str3 = br.readLine();
							File newfile = new File("c:\\\\" + str2 + "\\\\" + str3 + ".txt");
								if(newfile.createNewFile()){
								try{fw = new FileWriter("c:\\\\" + str2 + "\\\\" + str3 + ".txt");
									pw = new PrintWriter(new BufferedWriter(fw));
									pw.println(str);
									pw.close();}
								catch (IOException ex) {ex.printStackTrace();break;}
								System.out.println("ファイルを作成し、書き込みました"+"\n"+"Enterを押して下さい");z2 = false;
								}else{System.out.println("ファイルは既に存在しています");continue;}
							}catch (IOException e){System.out.println(e);}
						 }

			else if(a == 3){//既存のフォルダ・ファイルに保存
				System.out.println("保存するフォルダ名を入力してください 「c:\\\\」は不要");
				str2 = br.readLine();
				 File f = new File("c:\\\\" + str2);
				 	while(z2){
				 if(f .exists()){
				 		System.out.println("フォルダは存在します"+"\n"+"追加と上書きどちらにしますか？ 1.追加 2.上書き");break;}
				 	else{System.out.println("フォルダは存在しません");}}
				 	if(b == 1){//追加
						try{str2 = br.readLine();
						b = Integer.parseInt(str2);}
						catch(NumberFormatException nfe){continue;}
						System.out.println("ファイル名を指定して下さい 「ｃ:\\\\」「.txt」は不要");
						try{str3 = br.readLine();
						fw = new FileWriter("c:\\\\"+ str2 +"\\\\"+ str3 +".txt",true);
						pw = new PrintWriter(new BufferedWriter(fw));
						pw.println(str);
						pw.close();
						if(f.exists()){
						System.out.println("ファイルに追加しました");}
						else{System.out.println("ファイルは存在しません");}
						}catch (IOException e){System.out.println(e);}
					}else{//上書き
						System.out.println("ファイル名を指定して下さい");}
						try{str2 = br.readLine();
						fw = new FileWriter("c:\\\\"+ str2 +"\\\\"+".txt",false);
						pw = new PrintWriter(new BufferedWriter(fw));
						pw.println(str);
						pw.close();
						if(f.exists()){
						System.out.println("ファイルを上書きしました");}
						else{System.out.println("ファイルは存在しません");}
						}catch (IOException e){System.out.println(e);}
			}

			else if(a == 4){//ファイルの参照
				System.out.println("参照したいファイルのフォルダ名を入力して下さい 「c:\\\\」は不要");
				str2 = br.readLine();
				 File f = new File("c:\\\\" + str2);
				 	if(f.exists()){
				 		System.out.println("フォルダは存在します"+"\n"+"参照したいファイル名を入力して下さい 「ｃ:\\\\」「.txt」は不要");}
				 	else{System.out.println("フォルダは存在しません");}
					str3 = br.readLine();
					try{FileReader fr = new FileReader("c:\\\\"+ str2 +"\\\\"+ str3 +".txt");
					br = new BufferedReader(fr);
					String line;
					int count = 0;
					while((line = br.readLine()) != null){System.out.println(++count +"行目:" + line);}
					br.close();
					fr.close();}
					catch (IOException ex2){ex2.printStackTrace();
					System.out.println("フォルダは存在しません");}
			}

			else{//文字入力
				break;
			}

			System.out.println("プログラムを終了しますか？ 1. いいえ 2.はい");
			try{str = br.readLine();
			a = Integer.parseInt(str);}
			catch(NumberFormatException nfe){continue;}
				if(a == 1){continue;}//メニュー選択にとばす　まだ出来ていない。
				else{}break;}break;}
			}

			}

