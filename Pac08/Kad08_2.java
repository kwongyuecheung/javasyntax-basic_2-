//**********************************
// �ۑ薼 : Kad08_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/20
//**********************************
import java.util.*;
class Kad08_2{
	public static void main(String[]args){
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 ����́F");
		try{
			double a = Double.parseDouble(sc.next());
			System.out.print("���� 2 ����́F");
			double b = Double.parseDouble(sc.next());
			System.out.print("���� 3 ����́F");
			double c = Double.parseDouble(sc.next());
			System.out.print("���� 1+2 �̕��ϒl�F" + calc.getAverage(a,b)+ " \n");
			System.out.print("���� 1+2+3 �̕��ϒl�F" + calc.getAverage(a,b,c)+ " \n");
		}catch(NumberFormatException e){
			System.out.print("���͒l���s���ł��B\n");
		}
	}
}