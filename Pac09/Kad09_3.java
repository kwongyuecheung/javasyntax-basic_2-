//**********************************
// �ۑ薼 : Kad09_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/22
//**********************************
import java.util.*;
class Kad09_3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�~�̖ʐςƉ~�������߂܂��B");
		System.out.print("���a�̒�������͂��Ă�������[m]�F");
		try{
			double radius = Double.parseDouble(sc.next());
			Circle cir = new Circle(radius);
			System.out.print("�~�̖ʐρF" + cir.getArea() + "�u \n");
			System.out.print("�~�̉~���F" + cir.getRound() + "�u");
		}catch(NumberFormatException e){
			System.out.print("���͒l���s���ł��B\n");
		}
	}
}