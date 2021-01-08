//**********************************
// 課題名 : Radio
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/27
//**********************************
class Radio implements Power, Volume{
	private boolean power;
	private int volume;
	private int MINVOLUME = 0;
	private int MAXVOLUME = 5;
	Radio(){
		this.power = false;
	}
	@Override
	public boolean isPower(){
		return this.power;
	}
	@Override
	public void powerOn(){
		this.volume = 3;
		this.power = true;
	}
	@Override
	public void powerOff(){
		this.power = false;
	}
	@Override
	public int getVolume(){
		return this.volume;
	}
	@Override
	public void upVolume(){
		if(volume < MAXVOLUME){
			this.volume++ ;
		}
	}
	@Override
	public void downVolume(){
		if(volume > MINVOLUME){
			this.volume-- ;
		}
	}
}