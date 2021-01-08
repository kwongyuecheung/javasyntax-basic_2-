//**********************************
// �ۑ薼 : Circle
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/22
//**********************************
class Circle extends Shape{
	private double radius;
	Circle(double radius){
		this.radius = radius;
	}
	public double getArea(){
		return radius * radius * Math.PI;
	}
	public double getRound(){
		return radius * 2 * Math.PI;
	}
}