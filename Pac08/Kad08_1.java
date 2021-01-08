//**********************************
// 課題名 : Kad08_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/20
//**********************************
import java.util.*;
class Kad08_1{
	public static void main(String[]args){
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		System.out.print("整数 1 を入力：");
		try{
			int a = Integer.parseInt(sc.next());
			System.out.print("整数 2 を入力：");
			int b = Integer.parseInt(sc.next());
			System.out.print("結果：" + calc.add(a,b)+ " \n");
		}catch(NumberFormatException e){
			System.out.print("入力値が不正です。\n");
		}
		System.out.print("文字列 1 を入力：");
		String c = sc.next();
		System.out.print("文字列 2 を入力：");
		String d = sc.next();
		System.out.print("結果：" + calc.add(c,d)+ " \n");
	}
}