//**********************************
// 課題名 : Triangle
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/22
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
