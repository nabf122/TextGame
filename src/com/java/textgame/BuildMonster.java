package com.java.textgame;

/* 	몬스터를 각 던전에 따라 다른 조건의 값을 부여
직업마다 정해져 있는 스탯을 최초로 부여 받음.
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
		// 몬스터 생성 클래스
		int d_flg = a;
		
		if(d_flg == 1) {
			this.monName = "슬라임";
			this.monMaxHp = 10;
			this.monRealHp = 10;
			this.monAd = 5;
			this.monDf = 2;
			this.giveXp = 3;
			this.giveGlod = 20;
		}
		else if(d_flg == 2) {
			this.monName = "스톤 골렘";
			this.monMaxHp = 30;
			this.monRealHp = 30;
			this.monAd = 10;
			this.monDf = 5;
			this.giveXp = 7;
			this.giveGlod = 50;
		}
		else if(d_flg == 3) {
			this.monName = "드래곤";
			this.monMaxHp = 100;
			this.monRealHp = 100;
			this.monAd = 20;
			this.monDf = 5;
			this.giveXp = 15;
			this.giveGlod = 100;
		}
	}
}
