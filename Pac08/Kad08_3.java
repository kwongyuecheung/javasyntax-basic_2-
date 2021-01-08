//**********************************
// 課題名 : Kad08_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/20
//**********************************
import java.util.*;
class Kad08_3{
	public static void main(String[]args){
		int[]inNums = new int[4];
		Random rng = new Random();
		Scanner sc = new Scanner(System.in);
		int inCount = rng.nextInt(3) + 2;
		System.out.println(inCount + "回整数を入力して積を求めます。");
		for(int i = 0; i < inCount; i++){
			System.out.print("整数" + (i+1) + "を入力：");
			try{
				inNums[i] = Integer.parseInt(sc.next());
			}catch(NumberFormatException e){
			System.out.print("入力値が不正です。\n");
			System.exit(0);
			}
		}
		Calculate calc = new Calculate();
		switch(inCount){
			case 2:
			System.out.println("積：" + calc.mul(inNums[0],inNums[1]));
			break;
			case 3:
			System.out.println("積：" + calc.mul(inNums[0],inNums[1],inNums[2]));
			break;
			case 4:
			System.out.println("積：" + calc.mul(inNums[0],inNums[1],inNums[2],inNums[3]));
			break;
		}
	}
}