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

	// 플레이어 상태 체크
	public void playerStatus(){
	
		System.out.println();
		System.out.println("내 정보\n-------");
		System.out.println(playerName+"\n-------\n"+playerClass
				+"\n레벨 : "+level+"\n경험치 : "+xp+"\n최대 체력 : "+maxHp
				+"\n현재 체력 : "+crrHp+"\n공격력 : "+ad+"\n방어력 : "+df
				+"\n보유 골드 : "+gold + "\n-------");
		
	}
	
	// 플레이어 레벨업 체크
	public void levelUpChk() {
		if(xp >= 10 && level == 1) {
			xp = xp-10;
			level = 2;
			System.out.println("레벨업을 하였습니다!");
			System.out.println("능력치가 소폭 상승합니다.");
			if(playerClass.equals("전사"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 1;
				
			}else if(playerClass.equals("궁수")) {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 3;
				df = df + 1;
			}else {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 2;
				df = df + 1;
			}
		}
		if(xp >= 15 && level == 2) {
			xp = xp-15;
			level = 3;
			System.out.println("레벨업을 하였습니다!");
			System.out.println("능력치가 소폭 상승합니다.");
			if(playerClass.equals("전사"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 1;
				
			}else if(playerClass.equals("궁수")) {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 3;
				df = df + 1;
			}else {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 2;
				df = df + 1;
			}
		}
		if(xp >= 20 && level == 3) {
			xp = xp-20;
			level = 4;
			System.out.println("레벨업을 하였습니다!");
			System.out.println("능력치가 소폭 상승합니다.");
			if(playerClass.equals("전사"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 1;
				
			}else if(playerClass.equals("궁수")) {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 3;
				df = df + 1;
			}else {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 2;
				df = df + 1;
			}
		}
		if(xp >= 25 && level == 4) {
			xp = xp-25;
			level = 5;
			System.out.println("레벨업을 하였습니다!");
			System.out.println("능력치가 소폭 상승합니다.");
			if(playerClass.equals("전사"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 1;
				
			}else if(playerClass.equals("궁수")) {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 3;
				df = df + 1;
			}else {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 2;
				df = df + 1;
			}
		}
		if(xp >= 30 && level == 5) {
			xp = xp-30;
			level = 6;
			System.out.println("레벨업을 하였습니다!");
			System.out.println("능력치가 소폭 상승합니다.");
			if(playerClass.equals("전사"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 2;
				
			}else if(playerClass.equals("궁수")) {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 3;
				df = df + 1;
			}else {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 2;
				df = df + 1;
			}
		}
		if(xp >= 40 && level == 6) {
			xp = xp-40;
			level = 7;
			System.out.println("레벨업을 하였습니다!");
			System.out.println("능력치가 소폭 상승합니다.");
			if(playerClass.equals("전사"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 2;
				
			}else if(playerClass.equals("궁수")) {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 3;
				df = df + 1;
			}else {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 2;
				df = df + 1;
			}
		}
		if(xp >= 50 && level == 7) {
			xp = xp-50;
			level = 8;
			System.out.println("레벨업을 하였습니다!");
			System.out.println("능력치가 소폭 상승합니다.");
			if(playerClass.equals("전사"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 2;
				
			}else if(playerClass.equals("궁수")) {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 3;
				df = df + 1;
			}else {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 2;
				df = df + 1;
			}
		}
		if(xp >= 60 && level == 8) {
			xp = xp-60;
			level = 9;
			System.out.println("레벨업을 하였습니다!");
			System.out.println("능력치가 소폭 상승합니다.");
			if(playerClass.equals("전사"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 2;
				
			}else if(playerClass.equals("궁수")) {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 3;
				df = df + 1;
			}else {
				maxHp = maxHp + 4;
				crrHp = maxHp;
				ad = ad + 2;
				df = df + 1;
			}
		}
		if(xp >= 70 && level == 9) {
			xp = xp-70;
			level = 10;
			System.out.println("레벨업을 하였습니다!");
			System.out.println("능력치가 소폭 상승합니다.");
			if(playerClass.equals("전사"))
			{
				maxHp = maxHp + 10;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 2;
				
			}else if(playerClass.equals("궁수")) {
				maxHp = maxHp + 8;
				crrHp = maxHp;
				ad = ad + 3;
				df = df + 1;
			}else {
				maxHp = maxHp + 8;
				crrHp = maxHp;
				ad = ad + 2;
				df = df + 1;
			}
		}
	}
	
}
