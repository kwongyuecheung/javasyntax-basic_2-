//**********************************
// �ۑ薼 : Triangle
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/22
//**********************************
class Triangle extends Shape{
	private double side;
	Triangle(double side){
		this.side = side;
	}
	public double getArea(){
		return side * side * Math.sqrt(3) / 4;
	}
}
