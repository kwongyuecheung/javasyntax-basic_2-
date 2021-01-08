//**********************************
// 課題名 : SilverCard
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/15
//**********************************
class SilverCard extends Card{
	SilverCard(String name, int age){
		super(name, age, "シルバー");
	}
	@Override
	public int ascValue(int money){
		return (int)(money * 0.1);
	}
}