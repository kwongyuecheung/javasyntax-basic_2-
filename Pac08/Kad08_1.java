//**********************************
// �ۑ薼 : Kad08_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/20
//**********************************
import java.util.*;
class Kad08_1{
	public static void main(String[]args){
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 ����́F");
		try{
			int a = Integer.parseInt(sc.next());
			System.out.print("���� 2 ����́F");
			int b = Integer.parseInt(sc.next());
			System.out.print("���ʁF" + calc.add(a,b)+ " \n");
		}catch(NumberFormatException e){
			System.out.print("���͒l���s���ł��B\n");
		}
		System.out.print("������ 1 ����́F");
		String c = sc.next();
		System.out.print("������ 2 ����́F");
		String d = sc.next();
		System.out.print("���ʁF" + calc.add(c,d)+ " \n");
	}
}