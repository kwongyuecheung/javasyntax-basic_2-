//**********************************
// �ۑ薼 : Dog
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/08
//**********************************
class Dog extends Animal{
	private String type = "Dog";
	
	Dog(){
	}
	public void type(){
		System.out.println("*****" + type + "*****\n");
	}
	public void cry(){
		System.out.println("���������I");
	}
	Dog(String type, int height, int weight){
		super(height,weight);
		this.type = type;
	}
}