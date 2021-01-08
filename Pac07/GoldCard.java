//**********************************
// 課題名 : GoldCard
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/15
//**********************************
class GoldCard extends Card{
	private int border = 3000;
	private int bonusPoint = 200;
	GoldCard(String name, int age){
		super(name, age, "ゴールド");
	}
	public int discount(int money){
		return (int)(money * 0.9);
	}
	@Override
	public int ascValue(int money){
		int a = (int)(money * 0.2);
		if(money >= border){
			return (a + 200);
		}else{
			return a;
		}
	}
}