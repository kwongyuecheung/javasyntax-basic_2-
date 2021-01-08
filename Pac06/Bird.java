//**********************************
// 課題名 : Bird
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/08
//**********************************
class Bird extends Animal{
	private String type = "Bird";
	public void type(){
		System.out.println("*****" + type + "*****\n");
	}
	public void cry(){
		System.out.println("チュンチュン！");
	}
}