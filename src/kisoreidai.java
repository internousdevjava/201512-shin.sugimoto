import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class kisoreidai {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean t2 = true;
		String str,str2;
		String str3,str4;
		int a = 0;

		while(t2){
			System.out.println("書き込みをしたいファイルの、フォルダ名を入力して下さい 「c:\\\\」は不要");
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

		}

	}
}
