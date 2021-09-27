package com.java.textgame;

// �÷��̾� ĳ���� ������ PlayerStatus�� ����
// playerStatus �޼ҵ带 ȣ���Ͽ� �÷��̾� ĳ���� ���� ������ Ȯ���� �� ����

class PlayerStatus {
	
	private String playerName;
	private String playerClass;	// �÷��̾� ����
	private int level;	// ����
	private int xp;		// ����ġ
	private int maxHp;	// �ִ� ü��
	private int crrHp;	// ���� ü��
	private int ad;	// ���ݷ�
	private int df; // ����
	private int gold; // ��� ������
	
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

	// �÷��̾� ���� üũ
	public void playerStatus(){
	
		System.out.println();
		System.out.println("�� ����\n-------");
		System.out.println(playerName+"\n-------\n"+playerClass
				+"\n���� : "+level+"\n����ġ : "+xp+"\n�ִ� ü�� : "+maxHp
				+"\n���� ü�� : "+crrHp+"\n���ݷ� : "+ad+"\n���� : "+df
				+"\n���� ��� : "+gold + "\n-------");
		
	}
	
	// �÷��̾� ������ üũ
	public void levelUpChk() {
		if(xp >= 10 && level == 1) {
			xp = xp-10;
			level = 2;
			System.out.println("�������� �Ͽ����ϴ�!");
			System.out.println("�ɷ�ġ�� ���� ����մϴ�.");
			if(playerClass.equals("����"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 1;
				
			}else if(playerClass.equals("�ü�")) {
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
			System.out.println("�������� �Ͽ����ϴ�!");
			System.out.println("�ɷ�ġ�� ���� ����մϴ�.");
			if(playerClass.equals("����"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 1;
				
			}else if(playerClass.equals("�ü�")) {
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
			System.out.println("�������� �Ͽ����ϴ�!");
			System.out.println("�ɷ�ġ�� ���� ����մϴ�.");
			if(playerClass.equals("����"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 1;
				
			}else if(playerClass.equals("�ü�")) {
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
			System.out.println("�������� �Ͽ����ϴ�!");
			System.out.println("�ɷ�ġ�� ���� ����մϴ�.");
			if(playerClass.equals("����"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 1;
				
			}else if(playerClass.equals("�ü�")) {
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
			System.out.println("�������� �Ͽ����ϴ�!");
			System.out.println("�ɷ�ġ�� ���� ����մϴ�.");
			if(playerClass.equals("����"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 2;
				
			}else if(playerClass.equals("�ü�")) {
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
			System.out.println("�������� �Ͽ����ϴ�!");
			System.out.println("�ɷ�ġ�� ���� ����մϴ�.");
			if(playerClass.equals("����"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 2;
				
			}else if(playerClass.equals("�ü�")) {
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
			System.out.println("�������� �Ͽ����ϴ�!");
			System.out.println("�ɷ�ġ�� ���� ����մϴ�.");
			if(playerClass.equals("����"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 2;
				
			}else if(playerClass.equals("�ü�")) {
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
			System.out.println("�������� �Ͽ����ϴ�!");
			System.out.println("�ɷ�ġ�� ���� ����մϴ�.");
			if(playerClass.equals("����"))
			{
				maxHp = maxHp + 5;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 2;
				
			}else if(playerClass.equals("�ü�")) {
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
			System.out.println("�������� �Ͽ����ϴ�!");
			System.out.println("�ɷ�ġ�� ���� ����մϴ�.");
			if(playerClass.equals("����"))
			{
				maxHp = maxHp + 10;
				crrHp = maxHp;
				ad = ad + 1;
				df = df + 2;
				
			}else if(playerClass.equals("�ü�")) {
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
