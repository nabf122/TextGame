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

	
	public void playerStatus(){
	
		System.out.println();
		System.out.println("�� ����\n-------");
		System.out.println(playerName+"\n-------\n"+playerClass
				+"\n���� : "+level+"\n����ġ : "+xp+"\n�ִ� ü�� : "+maxHp
				+"\n���� ü�� : "+crrHp+"\n���ݷ� : "+ad+"\n���� : "+df
				+"\n���� ��� : "+gold);
		
	}
	
}
