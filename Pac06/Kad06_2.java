//**********************************
// 課題名 : Kad06_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/08
//**********************************
class Kad06_2{
	public static void main(String[]args){
		Dog dog = new Dog();
		Bird bird = new Bird();
		dog.type();
		System.out.print("鳴く：");
		dog.cry();
		System.out.print("寝る：");
		dog.sleep();
		bird.type();
		System.out.print("鳴く：");
		bird.cry();
		System.out.print("寝る：");
		bird.sleep();
	}
}