package com.java.textgame;

/* 	�÷��̾� ĳ������ ������ ���ʷ� ����.
	�������� ������ �ִ� ������ ���ʷ� �ο� ����.
*/

class BuildClass {
	
	private String playerClass;	// �÷��̾� ����
	private int level;	// ����
	private int maxHp;	// �ִ� ü��
	private int crrHp;	// ���� ü��
	private int ad;	// ���ݷ�
	private int df; // ����
	
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
		playerClass = "����";
		level = 1;	// ����
		maxHp = 40;	// �ִ� ü��
		crrHp = 40;	// ���� ü��
		ad = 6;	// ���ݷ�
		df = 3;	// ����
				
	}
	
	public void BuildArcher(){
		playerClass = "�ü�";
		level = 1;	// ����
		maxHp = 20;	// �ִ� ü��
		crrHp = 20;	// ���� ü��
		ad = 10;	// ���ݷ�
		df = 1;	// ����
				
	}
	
	public void BuildMagician(){
		playerClass = "������";
		level = 1;	// ����
		maxHp = 30;	// �ִ� ü��
		crrHp = 30;	// ���� ü��
		ad = 8;	// ���ݷ�
		df = 1;	// ����
		
	}
	
}
