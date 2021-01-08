//**********************************
// 課題名 : Kad06_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/08
//**********************************
class Kad06_3{
	public static void main(String[]args){
		Dog d1 = new Dog("柴犬",35 ,8);
		Dog d2 = new Dog("チワワ",23 ,3);
		Dog d3 = new Dog("ブルドッグ",45 ,25);
		Dog[] dog = {d1,d2,d3};
		for(Dog i : dog){
			i.type();
			System.out.print("鳴く：");
			i.cry();
			System.out.print("寝る：");
			i.sleep();
			System.out.println("体高："+ i.getHeight() + "cm");
			System.out.println("体重："+ i.getWeight() + "kg\n");
		}
	}
}