//**********************************
// 課題名 : Animal
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/08
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
		System.out.println("スヤスヤ...zzz");
	}
}