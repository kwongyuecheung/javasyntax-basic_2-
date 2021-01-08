//**********************************
// 課題名 : Kad10_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/27
//**********************************
class Kad10_1{
	public static void main(String[]args){
		Radio radio = new Radio();
		System.out.println("ラジオの電源を確認します。");
		if(radio.isPower()){
			System.out.println("電源：ON");
		}else{
			System.out.println("電源：OFF");
		}
	}
}