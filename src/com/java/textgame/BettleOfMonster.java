package com.java.textgame;

import java.util.Random;
import java.util.Scanner;

/*
 * 몬스터와의 전투 연산을 여기서 처리
 * 
 */

class BettleOfMonster {
	
	// 플레이어 전투에 필요한 정보 가져오기
	private String playerName;
	private String playerClass;	// 플레이어 직업
	private int level;	// 레벨
	private int xp;		// 경험치
	private int maxHp;	// 최대 체력
	private int crrHp;	// 현재 체력
	private int ad;	// 공격력
	private int df; // 방어력
	private int gold;
	
	// 몬스터 전투에 필요한 정보 가져오기
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

	// 배틀 시작
	public void Bettle(){
	
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		PlayerStatus pstatus = new PlayerStatus();
		BuildMonster bm = new BuildMonster();
		
		String battle_messege;
		
		// 몬스터 전투 정보 세팅
		this.monName = bm.getMonName();
		this.monRealHp = bm.getMonRealHp();
		this.monAd = bm.getMonAd();
		this.monDf = bm.getMonDf();
		this.giveXp = bm.getGiveXp();
		this.giveGlod = bm.getGiveGlod();
		
		// 플레이어 전투 정보 세팅
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
			System.out.println("공격하기(a)\n상태확인(i)\n도망가기(r)");
			battle_messege = scan.nextLine();
			if(battle_messege.charAt(0) == 'a')
			{
				System.out.println("==========================");
				System.out.println("전투 돌입!!");
				System.out.println("==========================");
				
				// 데미지 계산 변수 num 초기화
				int num = 0;
				// 플레이어의 공격 턴
				// 플레이어 공격력(1~max) 랜덤 - 몬스터 방어력 계산
				num = random.nextInt(this.ad)+1 - this.monDf;
				// 위 계산을 진행 후 0이하의 값이 나온다면!
				if(num < 0) {
					System.out.println("==========================");
					System.out.println(this.monName+"에게 유효한 공격을 하지 못했습니다");
					System.out.println("==========================");
					// 몬스터의 공격 턴
					if(this.monRealHp > 0) {
						num = 0;
						num = random.nextInt(this.monAd)+1 - df;
						// 위 계산을 진행 후 0이하의 값이 나온다면!
						if(num < 0) {
							System.out.println("==========================");
							System.out.println(this.monName+"은(는) 유효한 공격을 하지 못했습니다");
							System.out.println("==========================");
						}
						else {
							// 몬스터의 공격 계산
							this.crrHp -= num;
							pstatus.setCrrHp(this.crrHp);
							
							if(crrHp > 0) {
								System.out.println("==========================");
								System.out.println(this.monName+"으로부터 "+num+"의 데미지를 입었습니다\n남은 체력은 "+this.crrHp+"입니다");
								System.out.println("==========================");
							}
							// 체력이 0이 될 경우 게임 종료
							else
							{
								System.out.println("==========================");
								System.out.println("남은 체력은 0입니다\n당신은 죽었습니다\n게임 종료");
								System.out.println("==========================");
								break;
							}
						}
						
					}
				} // 위 계산을 진행 후 1이상의 값이 나온다면!
				else {
					this.monRealHp -= num;
					
					bm.setMonRealHp(this.monRealHp);
					
					if(this.monRealHp > 0) {
						System.out.println("==========================");
						System.out.println(this.monName+"에게 "+num+"의 데미지를 입혔습니다\n"+ this.monName +"의 남은 체력은 "+this.monRealHp+"입니다");
						System.out.println("==========================");
						num = 0;
						num = random.nextInt(this.monAd)+1 - this.df;
						// 위 계산을 진행 후 0이하의 값이 나온다면!
						if(num < 0) {
							System.out.println("==========================");
							System.out.println(this.monName+"은(는) 유효한 공격을 하지 못했습니다");
								System.out.println("==========================");
						}
						else {
							// 몬스터의 공격 계산
							this.crrHp -= num;
							
							pstatus.setCrrHp(this.crrHp);
							
							if(this.crrHp > 0) {
								System.out.println("==========================");
								System.out.println(this.monName+"으로부터 "+num+"의 데미지를 입었습니다\n남은 체력은 "+this.crrHp+"입니다");
								System.out.println("==========================");
							}
							// 체력이 0이 될 경우 게임 종료
							else
							{
								System.out.println("==========================");
								System.out.println("남은 체력은 0입니다\n당신은 죽었습니다\n게임 종료");
								System.out.println("==========================");
								break;
							}
						}
					}
					else 
					{
						System.out.println("==========================");
						System.out.println(this.monName+"에게 "+num+"의 데미지를 입혔습니다\n"+ this.monName +"의 남은 체력은 0입니다");
						System.out.println("==========================");
						System.out.println(this.monName+"과의 전투에서 승리하였습니다!!\n경험치"+ this.giveXp +"을 획득하였습니다\n골드"+ this.giveGlod +"을 획득하였습니다");
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
