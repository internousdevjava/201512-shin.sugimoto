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
		boolean t = true;
		boolean t2 = true;
		String str,str2;
		String str3,str4;
		int a = 0;


		while(t){
			System.out.println("該当する数字を入力して下さい  1.フォルダ・ファイルの新規作成 2.ファイルの読み込み 3.ファイルへの書き込み 4.終了");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{str = br.readLine();
		 a = Integer.parseInt(str);}
		 catch(NumberFormatException nfe){continue;}

		 switch(a){
		  case 1 :// 1.フォルダ・ファイルの新規作成
			   while(t2){
				  System.out.println("新規フォルダ・ファイルの作成をします"+"\n"+"1.新規フォルダ作成 2.既存ファイルに新規ファイルを作成");
				   try{str = br.readLine();
				   a = Integer.parseInt(str);}
				   catch(NumberFormatException nfe){continue;}
				   if(a == 1){
					   System.out.println("フォルダ名を指定して下さい 「c:\\\\」は不要");//新規フォルダ作成
					   str = br.readLine();
					   File f = new File("c:\\\\" + str);
					 		if(!f .exists()){f .mkdirs();
					 			System.out.println("フォルダを作成しました"+"\n"+"ファイル名を入力して下さい「ｃ:\\\\」「.txt」は不要");
					 		}else{System.out.println("フォルダは既に存在する為、失敗しました");continue;}
					 			try{str2 = br.readLine();
					 			File newfile = new File("c:\\\\" + str + "\\\\" + str2 + ".txt");
					 				if(newfile.createNewFile()){
					 					try{FileWriter fw  = new FileWriter("c:\\\\" + str + "\\\\" + str2 + ".txt");
					 					 PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
					 					 pw.println(str);
					 					 pw.close();}
					 					catch (IOException ex) {ex.printStackTrace();continue;}
					 					System.out.println("ファイルを作成し、書き込みました"+"\n"+"Enterを押して下さい");break;
								    }else{}
					 			}catch (IOException e){System.out.println(e);}
				  }

				   else if(a == 2){
					   System.out.println("既存のフォルダ名を指定して下さい 「c:\\\\」は不要");////新規ファイル作成
					   str = br.readLine();
					   File f = new File("c:\\\\" + str);
					 		if(!f .exists()){System.out.println("そのフォルダは存在しない為、失敗しました");continue;
					 		}else{System.out.println("フォルダは存在します。作成するファイル名を入力して下さい");}
					 		try{str2 = br.readLine();
				 			File newfile = new File("c:\\\\" + str + "\\\\" + str2 + ".txt");
				 				if(newfile.createNewFile()){
				 					try{FileWriter fw  = new FileWriter("c:\\\\" + str + "\\\\" + str2 + ".txt");
				 					 PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
				 					 pw.println(str);
				 					 pw.close();}
				 					catch (IOException ex) {ex.printStackTrace();continue;}
				 					System.out.println("ファイルを作成し、書き込みました");break;
							    }else{System.out.println("ファイルは既に存在している為、作成に失敗しました");}
				 			}catch (IOException e){System.out.println(e);}
				   	}
				}break;

		  case 2 ://2.ファイルの読み込み
			  while(t2){
					System.out.println("読み込みをしたいファイルの、フォルダ名を入力して下さい 「c:\\\\」は不要");
					br  = new BufferedReader(new InputStreamReader(System.in));
					str = br.readLine();
					 File f = new File("c:\\\\" + str);
					 	if(!f.exists()){
					 		System.out.println("フォルダは存在しませんでした");continue;}
					 	else{System.out.println("フォルダは存在します"+"\n"+"読み込みをしたいファイル名を入力して下さい 「ｃ:\\\\フォルダ名\\\\」「.txt」は不要");}
						str2 = br.readLine();
						 try{FileReader fr = new FileReader("c:\\\\"+ str +"\\\\"+ str2 +".txt");
						  br = new BufferedReader(fr);
						  String line;
						  int count = 0;
						  while((line = br.readLine()) != null){System.out.println(++count +"行目:" + line);}
						  br.close();
						  fr.close();break;
						  }catch (IOException e){e.printStackTrace();
						  System.out.println("ファイルが存在しない為、失敗しました");}

			}break;

		  case 3 ://3.ファイルへの書き込み
			  while(t2){
					System.out.println("書き込みをしたいファイルの、フォルダ名を入力して下さい 「c:\\\\」は不要");
					br  = new BufferedReader(new InputStreamReader(System.in));
					str = br.readLine();
					 File f = new File("c:\\\\" + str);
					 	if(!f.exists()){
					 		System.out.println("フォルダは存在しませんでした");continue;}
					 	else{System.out.println("フォルダは存在します"+"\n"+"書き込みをしたいファイル名を入力して下さい 「ｃ:\\\\フォルダ名\\\\」「.txt」は不要");}
						str2 = br.readLine();
						 try{FileReader fr = new FileReader("c:\\\\"+ str +"\\\\"+ str2 +".txt");
						  br = new BufferedReader(fr);
						  br.close();
						  fr.close();
						  System.out.println("ファイルは存在します 書き込む内容を入力して下さい");
						  }catch (IOException e){e.printStackTrace();
						  System.out.println("ファイルが存在しない為、失敗しました");continue;}

						 br  = new BufferedReader(new InputStreamReader(System.in));

						 str3 = br.readLine();
						 System.out.println("入力した内容はファイルにどう保存しますか？ 1.追記 2.上書き");
						  try{str4 = br.readLine();
						  a = Integer.parseInt(str4);}
						  catch(NumberFormatException nfe){continue;}
						  	if(a == 1){//追記
						  	 FileWriter fw = new FileWriter("c:\\\\"+ str +"\\\\"+ str2 +".txt",true);
						  	 PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
						  	 pw.println(str3);
						  	 pw.close();
						  	 System.out.println("ファイルに追加しました");break;
						  }else{//上書き
							  FileWriter fw = new FileWriter("c:\\\\"+ str +"\\\\"+ str2 +".txt",false);
							  PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
							  pw.println(str3);
							  pw.close();
							  System.out.println("ファイルを上書きしました");break;}

				}break;

		 default ://終了
			 t = false;
		 }

	   }
	}
}
