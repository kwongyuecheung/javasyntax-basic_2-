//**********************************
// �ۑ薼 : Kad08_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/20
//**********************************
import java.util.*;
class Kad08_3{
	public static void main(String[]args){
		int[]inNums = new int[4];
		Random rng = new Random();
		Scanner sc = new Scanner(System.in);
		int inCount = rng.nextInt(3) + 2;
		System.out.println(inCount + "�񐮐�����͂��Đς����߂܂��B");
		for(int i = 0; i < inCount; i++){
			System.out.print("����" + (i+1) + "����́F");
			try{
				inNums[i] = Integer.parseInt(sc.next());
			}catch(NumberFormatException e){
			System.out.print("���͒l���s���ł��B\n");
			System.exit(0);
			}
		}
		Calculate calc = new Calculate();
		switch(inCount){
			case 2:
			System.out.println("�ρF" + calc.mul(inNums[0],inNums[1]));
			break;
			case 3:
			System.out.println("�ρF" + calc.mul(inNums[0],inNums[1],inNums[2]));
			break;
			case 4:
			System.out.println("�ρF" + calc.mul(inNums[0],inNums[1],inNums[2],inNums[3]));
			break;
		}
	}
}