//**********************************
// �ۑ薼 : Kad06_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/08
//**********************************
class Kad06_3{
	public static void main(String[]args){
		Dog d1 = new Dog("�Č�",35 ,8);
		Dog d2 = new Dog("�`����",23 ,3);
		Dog d3 = new Dog("�u���h�b�O",45 ,25);
		Dog[] dog = {d1,d2,d3};
		for(Dog i : dog){
			i.type();
			System.out.print("���F");
			i.cry();
			System.out.print("�Q��F");
			i.sleep();
			System.out.println("�̍��F"+ i.getHeight() + "cm");
			System.out.println("�̏d�F"+ i.getWeight() + "kg\n");
		}
	}
}