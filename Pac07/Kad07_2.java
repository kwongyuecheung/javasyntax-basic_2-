//**********************************
// �ۑ薼 : Kad07_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/15
//**********************************
import java.util.*;
class Kad07_2{
	public static void main(String[]args){
		SilverCard scard = new SilverCard("�����", 27);
		Scanner sc = new Scanner(System.in);
		scard.showInfo();
		System.out.print("�w�����z�F");
		try{
			scard.addPoint(scard.ascValue(sc.nextInt()));
			scard.showInfo();
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B\n");
			sc.next();
		}
	}
}