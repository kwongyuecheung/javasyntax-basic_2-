//**********************************
// �ۑ薼 : Animal
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/08
//**********************************
class Animal{
	private int height;
	private int weight;
	
	Animal(){
	}
	Animal(int height, int weight){
		this.height = height;
		this.weight = weight;
	}
	public int getHeight(){
		return height;
	}
	public int getWeight(){
		return weight;
	}
	public void sleep(){
		System.out.println("�X���X��...zzz");
	}
}