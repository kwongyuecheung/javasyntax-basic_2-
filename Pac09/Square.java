//**********************************
// �ۑ薼 : Square
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/22
//**********************************
class Square extends Shape{
	private double side;
	Square(double side){
		this.side = side;
	}
	public double getArea(){
		return side* side;
	}
}