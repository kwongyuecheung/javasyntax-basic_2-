//**********************************
// �ۑ薼 : SilverCard
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/15
//**********************************
class SilverCard extends Card{
	SilverCard(String name, int age){
		super(name, age, "�V���o�[");
	}
	@Override
	public int ascValue(int money){
		return (int)(money * 0.1);
	}
}