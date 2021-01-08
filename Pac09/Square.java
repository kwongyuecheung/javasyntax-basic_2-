//**********************************
// 課題名 : Square
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/22
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