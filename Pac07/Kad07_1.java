//**********************************
// 課題名 : Kad07_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/15
//**********************************
import java.util.*;
class Kad07_1{
	public static void main(String[]args){
		Card card = new Card("孫悟天", 17, "ノーマル");
		Scanner sc = new Scanner(System.in);
		card.showInfo();
		System.out.print("購入金額：");
		try{
			card.addPoint(card.ascValue(sc.nextInt()));
			card.showInfo();
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。\n");
			sc.next();
		}
	}
}