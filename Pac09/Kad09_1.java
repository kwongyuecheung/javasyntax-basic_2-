//**********************************
// 課題名 : Kad09_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/22
//**********************************
import java.util.*;
class Kad09_1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("正方形の面積を求めます。");
		System.out.print("一辺の長さを入力してください[m]：");
		try{
			double side = Double.parseDouble(sc.next());
			Square sq = new Square(side);
			System.out.print("正方形の面積：" + sq.getArea() + "㎡");
		}catch(NumberFormatException e){
			System.out.print("入力値が不正です。\n");
		}
	}
}