package exam04;

class Speaker {
	private int volumeRate;
	
	public void setVolumeRate(int vol) {
		this.volumeRate = vol;
	}
	
	public int getVolumeRate() {
		return volumeRate;
	}
	
	public void showCurrentState() {
		System.out.println("볼  륨 크기 : " + getVolumeRate());
	}
}