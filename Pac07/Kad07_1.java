//**********************************
// �ۑ薼 : Kad07_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/15
//**********************************
import java.util.*;
class Kad07_1{
	public static void main(String[]args){
		Card card = new Card("����V", 17, "�m�[�}��");
		Scanner sc = new Scanner(System.in);
		card.showInfo();
		System.out.print("�w�����z�F");
		try{
			card.addPoint(card.ascValue(sc.nextInt()));
			card.showInfo();
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B\n");
			sc.next();
		}
	}
}