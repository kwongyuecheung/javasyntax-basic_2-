//**********************************
// 課題名 : Circle
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/22
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