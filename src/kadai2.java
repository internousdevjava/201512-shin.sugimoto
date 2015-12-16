import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadai2 {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int myAns, cmpAns;
		int cnt = 0;
		boolean gamePlay = true;

		cmpAns = (int)(Math.random()*100 + 1);

		while(gamePlay){
			cnt++;
			try{System.out.print("1~100の間の整数を入力して下さい : ");
				str = br.readLine();
				myAns = Integer.parseInt(str);}
			catch(NumberFormatException nfe){continue;}

			if(myAns<1 || myAns>100){continue;}
			else if(myAns < cmpAns){
			System.out.println("答えは入力した数値より大きいです");}
			else if(myAns > cmpAns){
			System.out.println("答えは入力した数値より小さいです");}
			else if(myAns == cmpAns){gamePlay = false;}
		}

		System.out.println("おみごとです～" + cnt +"回目で正解ですね");
	}
}