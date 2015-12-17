import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai1{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int x = 0,y = 0;
		boolean kuku = true;

	while(kuku){
		try{System.out.print("1~100の間の整数を入力して下さい: x = ");
		str = br.readLine();
		 x= Integer.parseInt(str);
		 if(x==0 || x >= 101){
			 System.out.println("やり直してください");continue;
		 }else{System.out.print("もうひとつ、1~100の間の整数を入力して下さい: y = ");}
		str = br.readLine();
		y= Integer.parseInt(str);
		if(y == 0 || y >= 101){
			System.out.println("やり直してください");
		}else{}break;}
		catch(NumberFormatException nfe){}}

		for(int i=1 ; i<=x; i++){
			for(int j =1; j<=y; j++){
				if(i*j <= 9){
				System.out.print("    ");
				}else if(i*j <= 99){
					System.out.print("   ");
				}else if(i*j <= 999){
					System.out.print("  ");
				}else if (i*j <= 9999){
					System.out.print(" ");
				}else{}

		System.out.print(i*j);}
		System.out.println("");}
	}
	}
