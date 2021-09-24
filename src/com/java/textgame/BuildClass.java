package com.java.textgame;

/* 	플레이어 캐릭터의 직업을 최초로 선택.
	직업마다 정해져 있는 스탯을 최초로 부여 받음.
*/

class BuildClass {
	
	private String playerClass;	// 플레이어 직업
	private int level;	// 레벨
	private int maxHp;	// 최대 체력
	private int crrHp;	// 현재 체력
	private int ad;	// 공격력
	private int df; // 방어력
	
	public String getplayerClass() {
		return playerClass;
	}

	public void setplayerClass(String playerClass) {
		this.playerClass = playerClass;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getCrrHp() {
		return crrHp;
	}

	public void setCrrHp(int crrHp) {
		this.crrHp = crrHp;
	}

	public int getAd() {
		return ad;
	}

	public void setAd(int ad) {
		this.ad = ad;
	}

	public int getDf() {
		return df;
	}

	public void setDf(int df) {
		this.df = df;
	}
	
	public void BuildWarrior(){
		playerClass = "전사";
		level = 1;	// 레벨
		maxHp = 40;	// 최대 체력
		crrHp = 40;	// 현재 체력
		ad = 6;	// 공격력
		df = 3;	// 방어력
				
	}
	
	public void BuildArcher(){
		playerClass = "궁수";
		level = 1;	// 레벨
		maxHp = 20;	// 최대 체력
		crrHp = 20;	// 현재 체력
		ad = 10;	// 공격력
		df = 1;	// 방어력
				
	}
	
	public void BuildMagician(){
		playerClass = "마법사";
		level = 1;	// 레벨
		maxHp = 30;	// 최대 체력
		crrHp = 30;	// 현재 체력
		ad = 8;	// 공격력
		df = 1;	// 방어력
		
	}
	
}
