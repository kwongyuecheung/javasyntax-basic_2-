//**********************************
// �ۑ薼 : Kad09_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/22
//**********************************
import java.util.*;
class Kad09_1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����`�̖ʐς����߂܂��B");
		System.out.print("��ӂ̒�������͂��Ă�������[m]�F");
		try{
			double side = Double.parseDouble(sc.next());
			Square sq = new Square(side);
			System.out.print("�����`�̖ʐρF" + sq.getArea() + "�u");
		}catch(NumberFormatException e){
			System.out.print("���͒l���s���ł��B\n");
		}
	}
}