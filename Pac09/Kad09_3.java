//**********************************
// 課題名 : Kad09_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/22
//**********************************
import java.util.*;
class Kad09_3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("円の面積と円周を求めます。");
		System.out.print("半径の長さを入力してください[m]：");
		try{
			double radius = Double.parseDouble(sc.next());
			Circle cir = new Circle(radius);
			System.out.print("円の面積：" + cir.getArea() + "㎡ \n");
			System.out.print("円の円周：" + cir.getRound() + "㎡");
		}catch(NumberFormatException e){
			System.out.print("入力値が不正です。\n");
		}
	}
}