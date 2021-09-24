package com.java.textgame;

/* 	���͸� �� ������ ���� �ٸ� ������ ���� �ο�
�������� ������ �ִ� ������ ���ʷ� �ο� ����.
*/

class BuildMonster {
	
	private String monName;
	private int monMaxHp;
	private int monRealHp;
	private int monAd;
	private int monDf;
	private int giveXp;
	private int giveGlod;
	
	public int getGiveXp() {
		return giveXp;
	}

	public void setGiveXp(int giveXp) {
		this.giveXp = giveXp;
	}

	public int getGiveGlod() {
		return giveGlod;
	}

	public void setGiveGlod(int giveGlod) {
		this.giveGlod = giveGlod;
	}
	
	public String getMonName() {
		return monName;
	}

	public void setMonName(String monName) {
		this.monName = monName;
	}

	public int getMonMaxHp() {
		return monMaxHp;
	}

	public void setMonMaxHp(int monMaxHp) {
		this.monMaxHp = monMaxHp;
	}

	public int getMonRealHp() {
		return monRealHp;
	}

	public void setMonRealHp(int monRealHp) {
		this.monRealHp = monRealHp;
	}

	public int getMonAd() {
		return monAd;
	}

	public void setMonAd(int monAd) {
		this.monAd = monAd;
	}

	public int getMonDf() {
		return monDf;
	}

	public void setMonDf(int monDf) {
		this.monDf = monDf;
	}

	public void BuildMonster (int a) {
		// ���� ���� Ŭ����
		int d_flg = a;
		
		if(d_flg == 1) {
			this.monName = "������";
			this.monMaxHp = 10;
			this.monRealHp = 10;
			this.monAd = 5;
			this.monDf = 2;
			this.giveXp = 3;
			this.giveGlod = 20;
		}
		else if(d_flg == 2) {
			this.monName = "���� ��";
			this.monMaxHp = 30;
			this.monRealHp = 30;
			this.monAd = 10;
			this.monDf = 5;
			this.giveXp = 7;
			this.giveGlod = 50;
		}
		else if(d_flg == 3) {
			this.monName = "�巡��";
			this.monMaxHp = 100;
			this.monRealHp = 100;
			this.monAd = 20;
			this.monDf = 5;
			this.giveXp = 15;
			this.giveGlod = 100;
		}
	}
}
