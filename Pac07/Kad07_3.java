//**********************************
// 課題名 : Kad07_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/15
//**********************************
import java.util.*;
class Kad07_3{
	public static void main(String[]args){
		GoldCard gcard = new GoldCard("孫悟空", 47);
		Scanner sc = new Scanner(System.in);
		gcard.showInfo();
		System.out.print("購入金額：");
		try{
			gcard.addPoint(gcard.ascValue(gcard.discount(sc.nextInt())));
			gcard.showInfo();
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。\n");
			sc.next();
		}
	}
}