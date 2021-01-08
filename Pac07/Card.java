//**********************************
// �ۑ薼 : Card
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/15
//**********************************
class Card{
	private String name;
	private int age;
	private String rank;
	private int point = 100;
	Card(){
	}
	Card(String name, int age, String rank){
		this.name = name;
		this.age = age;
		this.rank = rank;
	}
	public void showInfo(){
		System.out.println("*** �J�[�h��� ***");
		System.out.println("���O �F" + name);
		System.out.println("�N�� �F" + age);
		System.out.println("�K�� �F" + rank);
		System.out.println("Point�F" + point + " \n");
	}
	public int ascValue(int money){
		return (int)(money * 0.05);
	}
	public void addPoint(int point){
		this.point = this.point + point;
	}
}