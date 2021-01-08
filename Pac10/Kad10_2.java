//**********************************
// 課題名 : Kad10_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/27
//**********************************
import java.util.*;
class Kad10_2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Radio radio = new Radio();
		System.out.println("ラジオを操作します。");
		int a = 1;
		do{
			System.out.print("終了=0 電源 ON/OFF=1:");
			try{
				a = Integer.parseInt(sc.next());
			}catch(NumberFormatException e){
				System.out.print("入力値が不正です。\n");
			}
			if(a == 1){
				if(radio.isPower()){
					radio.powerOff();
					System.out.println("電源：OFF");
				}else{
					radio.powerOn();
					System.out.println("電源：ON");
				}
			}
		}while(a != 0);
		System.out.println("終了します。");
	}
}