//**********************************
// 課題名 : Card
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/15
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
		System.out.println("*** カード情報 ***");
		System.out.println("名前 ：" + name);
		System.out.println("年齢 ：" + age);
		System.out.println("階級 ：" + rank);
		System.out.println("Point：" + point + " \n");
	}
	public int ascValue(int money){
		return (int)(money * 0.05);
	}
	public void addPoint(int point){
		this.point = this.point + point;
	}
}