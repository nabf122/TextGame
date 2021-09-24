package com.java.textgame;

// 플레이어 캐릭터 정보를 PlayerStatus에 보관
// playerStatus 메소드를 호출하여 플레이어 캐릭터 현재 정보를 확인할 수 있음

class PlayerStatus {
	
	private String playerName;
	private String playerClass;	// 플레이어 직업
	private int level;	// 레벨
	private int xp;		// 경험치
	private int maxHp;	// 최대 체력
	private int crrHp;	// 현재 체력
	private int ad;	// 공격력
	private int df; // 방어력
	private int gold; // 골드 보유량
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public String getPlayerClass() {
		return playerClass;
	}

	public void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
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

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	
	public void playerStatus(){
	
		System.out.println();
		System.out.println("내 정보\n-------");
		System.out.println(playerName+"\n-------\n"+playerClass
				+"\n레벨 : "+level+"\n경험치 : "+xp+"\n최대 체력 : "+maxHp
				+"\n현재 체력 : "+crrHp+"\n공격력 : "+ad+"\n방어력 : "+df
				+"\n보유 골드 : "+gold);
		
	}
	
}
