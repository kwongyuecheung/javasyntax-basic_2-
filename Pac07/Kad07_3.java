//**********************************
// �ۑ薼 : Kad07_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/15
//**********************************
import java.util.*;
class Kad07_3{
	public static void main(String[]args){
		GoldCard gcard = new GoldCard("�����", 47);
		Scanner sc = new Scanner(System.in);
		gcard.showInfo();
		System.out.print("�w�����z�F");
		try{
			gcard.addPoint(gcard.ascValue(gcard.discount(sc.nextInt())));
			gcard.showInfo();
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B\n");
			sc.next();
		}
	}
}