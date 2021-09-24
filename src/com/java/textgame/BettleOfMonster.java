package com.java.textgame;

import java.util.Random;
import java.util.Scanner;

/*
 * ���Ϳ��� ���� ������ ���⼭ ó��
 * 
 */

class BettleOfMonster {
	
	// �÷��̾� ������ �ʿ��� ���� ��������
	private String playerName;
	private String playerClass;	// �÷��̾� ����
	private int level;	// ����
	private int xp;		// ����ġ
	private int maxHp;	// �ִ� ü��
	private int crrHp;	// ���� ü��
	private int ad;	// ���ݷ�
	private int df; // ����
	private int gold;
	
	// ���� ������ �ʿ��� ���� ��������
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

	// ��Ʋ ����
	public void Bettle(){
	
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		PlayerStatus pstatus = new PlayerStatus();
		BuildMonster bm = new BuildMonster();
		
		String battle_messege;
		
		// ���� ���� ���� ����
		this.monName = bm.getMonName();
		this.monRealHp = bm.getMonRealHp();
		this.monAd = bm.getMonAd();
		this.monDf = bm.getMonDf();
		this.giveXp = bm.getGiveXp();
		this.giveGlod = bm.getGiveGlod();
		
		// �÷��̾� ���� ���� ����
		this.playerName = pstatus.getPlayerName();
		this.level = pstatus.getLevel();
		this.xp = pstatus.getXp();
		this.maxHp = pstatus.getMaxHp();
		this.crrHp = pstatus.getCrrHp();
		this.ad = pstatus.getAd();
		this.df = pstatus.getDf();
		this.gold = pstatus.getGold();
		
		while(monRealHp > 0)
		{
			System.out.println("�����ϱ�(a)\n����Ȯ��(i)\n��������(r)");
			battle_messege = scan.nextLine();
			if(battle_messege.charAt(0) == 'a')
			{
				System.out.println("==========================");
				System.out.println("���� ����!!");
				System.out.println("==========================");
				
				// ������ ��� ���� num �ʱ�ȭ
				int num = 0;
				// �÷��̾��� ���� ��
				// �÷��̾� ���ݷ�(1~max) ���� - ���� ���� ���
				num = random.nextInt(this.ad)+1 - this.monDf;
				// �� ����� ���� �� 0������ ���� ���´ٸ�!
				if(num < 0) {
					System.out.println("==========================");
					System.out.println(this.monName+"���� ��ȿ�� ������ ���� ���߽��ϴ�");
					System.out.println("==========================");
					// ������ ���� ��
					if(this.monRealHp > 0) {
						num = 0;
						num = random.nextInt(this.monAd)+1 - df;
						// �� ����� ���� �� 0������ ���� ���´ٸ�!
						if(num < 0) {
							System.out.println("==========================");
							System.out.println(this.monName+"��(��) ��ȿ�� ������ ���� ���߽��ϴ�");
							System.out.println("==========================");
						}
						else {
							// ������ ���� ���
							this.crrHp -= num;
							pstatus.setCrrHp(this.crrHp);
							
							if(crrHp > 0) {
								System.out.println("==========================");
								System.out.println(this.monName+"���κ��� "+num+"�� �������� �Ծ����ϴ�\n���� ü���� "+this.crrHp+"�Դϴ�");
								System.out.println("==========================");
							}
							// ü���� 0�� �� ��� ���� ����
							else
							{
								System.out.println("==========================");
								System.out.println("���� ü���� 0�Դϴ�\n����� �׾����ϴ�\n���� ����");
								System.out.println("==========================");
								break;
							}
						}
						
					}
				} // �� ����� ���� �� 1�̻��� ���� ���´ٸ�!
				else {
					this.monRealHp -= num;
					
					bm.setMonRealHp(this.monRealHp);
					
					if(this.monRealHp > 0) {
						System.out.println("==========================");
						System.out.println(this.monName+"���� "+num+"�� �������� �������ϴ�\n"+ this.monName +"�� ���� ü���� "+this.monRealHp+"�Դϴ�");
						System.out.println("==========================");
						num = 0;
						num = random.nextInt(this.monAd)+1 - this.df;
						// �� ����� ���� �� 0������ ���� ���´ٸ�!
						if(num < 0) {
							System.out.println("==========================");
							System.out.println(this.monName+"��(��) ��ȿ�� ������ ���� ���߽��ϴ�");
								System.out.println("==========================");
						}
						else {
							// ������ ���� ���
							this.crrHp -= num;
							
							pstatus.setCrrHp(this.crrHp);
							
							if(this.crrHp > 0) {
								System.out.println("==========================");
								System.out.println(this.monName+"���κ��� "+num+"�� �������� �Ծ����ϴ�\n���� ü���� "+this.crrHp+"�Դϴ�");
								System.out.println("==========================");
							}
							// ü���� 0�� �� ��� ���� ����
							else
							{
								System.out.println("==========================");
								System.out.println("���� ü���� 0�Դϴ�\n����� �׾����ϴ�\n���� ����");
								System.out.println("==========================");
								break;
							}
						}
					}
					else 
					{
						System.out.println("==========================");
						System.out.println(this.monName+"���� "+num+"�� �������� �������ϴ�\n"+ this.monName +"�� ���� ü���� 0�Դϴ�");
						System.out.println("==========================");
						System.out.println(this.monName+"���� �������� �¸��Ͽ����ϴ�!!\n����ġ"+ this.giveXp +"�� ȹ���Ͽ����ϴ�\n���"+ this.giveGlod +"�� ȹ���Ͽ����ϴ�");
						System.out.println("==========================");
						this.xp += this.giveXp;
						this.gold += this.giveGlod;

					}
				}
			}
			if(battle_messege.charAt(0) == 'i')
				{
					pstatus.playerStatus();
				}
				if(battle_messege.charAt(0) == 'r')
				{
					return;
				}
		}
		
	}
	
}
