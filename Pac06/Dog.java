//**********************************
// 課題名 : Dog
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/08
//**********************************
class Dog extends Animal{
	private String type = "Dog";
	
	Dog(){
	}
	public void type(){
		System.out.println("*****" + type + "*****\n");
	}
	public void cry(){
		System.out.println("ワンワン！");
	}
	Dog(String type, int height, int weight){
		super(height,weight);
		this.type = type;
	}
}