//**********************************
// �ۑ薼 : Kad10_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/27
//**********************************
import java.util.*;
class Kad10_3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Radio radio = new Radio();
		System.out.println("���W�I�𑀍삵�܂��B");
		int a = 1;
		do{
			System.out.print("�I��=0 �d�� ON/OFF=1 ���� UP=2 ���� DOWN=3:");
			try{
				a = Integer.parseInt(sc.next());
			}catch(NumberFormatException e){
				System.out.print("���͒l���s���ł��B\n");
			}
			if(a == 1){
				if(radio.isPower()){
					radio.powerOff();
					System.out.println("�d���FOFF");
				}else{
					radio.powerOn();
					System.out.println("�d���FON");
				}
			}else if(a == 2){
				if(radio.isPower()){
					radio.upVolume();
					System.out.println("����:" + radio.getVolume());
				}
			}else if(a == 3){
				if(radio.isPower()){
					radio.downVolume();
					System.out.println("����:" + radio.getVolume());
				}
			}
		}while(a != 0);
		System.out.println("�I�����܂��B");
	}
}