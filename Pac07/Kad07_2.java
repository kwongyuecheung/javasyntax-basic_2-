//**********************************
// 課題名 : Kad07_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/15
//**********************************
import java.util.*;
class Kad07_2{
	public static void main(String[]args){
		SilverCard scard = new SilverCard("孫悟飯", 27);
		Scanner sc = new Scanner(System.in);
		scard.showInfo();
		System.out.print("購入金額：");
		try{
			scard.addPoint(scard.ascValue(sc.nextInt()));
			scard.showInfo();
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。\n");
			sc.next();
		}
	}
}