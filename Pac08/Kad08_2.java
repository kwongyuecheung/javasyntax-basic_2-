//**********************************
// 課題名 : Kad08_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/20
//**********************************
import java.util.*;
class Kad08_2{
	public static void main(String[]args){
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		System.out.print("実数 1 を入力：");
		try{
			double a = Double.parseDouble(sc.next());
			System.out.print("実数 2 を入力：");
			double b = Double.parseDouble(sc.next());
			System.out.print("実数 3 を入力：");
			double c = Double.parseDouble(sc.next());
			System.out.print("実数 1+2 の平均値：" + calc.getAverage(a,b)+ " \n");
			System.out.print("実数 1+2+3 の平均値：" + calc.getAverage(a,b,c)+ " \n");
		}catch(NumberFormatException e){
			System.out.print("入力値が不正です。\n");
		}
	}
}