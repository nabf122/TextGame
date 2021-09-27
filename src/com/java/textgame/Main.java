package com.java.textgame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	// 플레이어 정보 변수 선언
	public static String playerName;	// 플레이어 이름
	public static String playerClass;	// 클래스
	public static String playerDoit;
	public static int level;	// 레벨
	public static int xp;	// 경험치
	public static int maxHp;	// 최대 체력
	public static int crrHp;	// 현재 체력
	public static int ad;	// 공격력
	public static int df;	// 방어력
	public static int gold;	// 보유 골드
	
	// 몬스터 정보 변수 선언
	public static String monName;
	public static int monMaxHp;
	public static int monRealHp;
	public static int monAd;
	public static int monDf;
	public static int giveXp;
	public static int giveGold;
	
	public static String yn;
	
	static Scanner scan = new Scanner(System.in);
	static Random random = new Random();
	static PlayerStatus pstatus = new PlayerStatus();
	
	private static void fight() {
		
		BuildMonster monster = new BuildMonster();
		
		System.out.println();
		System.out.println("어떤 던전을 입장할까요?\n-------");
		System.out.println("슬라임 평원(1)");
		System.out.println("골렘 슾지(2)");
		System.out.println("용들의 협곡(3)");
		System.out.println("뒤로 가기(4)");
			
		playerDoit = scan.nextLine();
		
		// 잘못된 알파벳 입력 시 반복하기
		while(playerDoit.charAt(0) != '1' && playerDoit.charAt(0) != '2' &&
				playerDoit.charAt(0) != '3' && playerDoit.charAt(0) != '4')
		{
			System.out.println();
			System.out.println("어떤 던전을 입장할까요?\n-------");
			System.out.println("슬라임 평원(1)");
			System.out.println("골렘 슾지(2)");
			System.out.println("용들의 협곡(3)");
			System.out.println("뒤로 가기(4)");
				
			playerDoit = scan.nextLine();
		}
			
			
		// 1 입력 시
		if(playerDoit.charAt(0) == '1')
		{
			System.out.println("==========================");
			System.out.println("슬라임 평원에 입장하셨습니다.");
			System.out.println("==========================");
			
			// 슬라임 생성
			monster.BuildMonster(1);
		}
		if(playerDoit.charAt(0) == '2')
		{
			System.out.println("==========================");
			System.out.println("골렘 슾지에 입장하셨습니다.");
			System.out.println("==========================");
			
			// 골렘 생성
			monster.BuildMonster(2);
			
		}
		// 3 입력 시
		if(playerDoit.charAt(0) == '3')
		{
			System.out.println("==========================");
			System.out.println("용들의 계곡에 입장하셨습니다.");
			System.out.println("==========================");
			
			monster.BuildMonster(3);
		}
		// 4 입력 시
		if(playerDoit.charAt(0) == '4')
		{
			return;
		}
			
			
		// 플레이어 정보 가져오기
		xp = pstatus.getXp();
		maxHp = pstatus.getMaxHp();
		crrHp = pstatus.getCrrHp();
		ad = pstatus.getAd();
		df = pstatus.getDf();
		gold = pstatus.getGold();
			
		// 몬스터 정보 가져오기
		monName = monster.getMonName();
		monMaxHp = monster.getMonMaxHp();
		monRealHp = monster.getMonRealHp();
		monAd = monster.getMonAd();
		monDf = monster.getMonDf();
		giveXp = monster.getGiveXp();
		giveGold = monster.getGiveGlod();
				
		String battle_messege;
				
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
				num = random.nextInt(ad)+1 - monDf;
				// 위 계산을 진행 후 0이하의 값이 나온다면!
				if(num < 0) {
					System.out.println("==========================");
					System.out.println(monName+"에게 유효한 공격을 하지 못했습니다");
					System.out.println("==========================");
					// 몬스터의 공격 턴
					if(monRealHp > 0) {
						num = 0;
						num = random.nextInt(monAd)+1 - df;
						// 위 계산을 진행 후 0이하의 값이 나온다면!
						if(num < 0) {
							System.out.println("==========================");
							System.out.println(monName+"은(는) 유효한 공격을 하지 못했습니다");
							System.out.println("==========================");
						}
						else {
							// 몬스터의 공격 계산
							crrHp -= num;
							
							// playerStatus의 현재 체력 변수에 반영
							pstatus.setCrrHp(crrHp);
							
							if(crrHp > 0) {
								System.out.println("==========================");
								System.out.println(monName+"으로부터 "+num+"의 데미지를 입었습니다\n남은 체력은 "+crrHp+"입니다");
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
					monRealHp -= num;
	
					if(monRealHp > 0) {
						System.out.println("==========================");
						System.out.println(monName+"에게 "+num+"의 데미지를 입혔습니다\n"+ monName +"의 남은 체력은 "+monRealHp+"입니다");
						System.out.println("==========================");
						num = 0;
						num = random.nextInt(monAd)+1 - df;
						// 위 계산을 진행 후 0이하의 값이 나온다면!
						if(num < 0) {
							System.out.println("==========================");
							System.out.println(monName+"은(는) 유효한 공격을 하지 못했습니다");
							System.out.println("==========================");
						}
						else {
						// 몬스터의 공격 계산
						crrHp -= num;
							
							// playerStatus의 현재 체력 변수에 반영
							pstatus.setCrrHp(crrHp);
							
							if(crrHp > 0) {
								System.out.println("==========================");
								System.out.println(monName+"으로부터 "+num+"의 데미지를 입었습니다\n남은 체력은 "+crrHp+"입니다");
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
						System.out.println(monName+"에게 "+num+"의 데미지를 입혔습니다\n"+ monName +"의 남은 체력은 0입니다");
						System.out.println("==========================");
						System.out.println(monName+"과의 전투에서 승리하였습니다!!\n경험치"+ giveXp +"을 획득하였습니다\n골드"+ giveGold +"을 획득하였습니다");
						System.out.println("==========================");
						xp += giveXp;
						gold += giveGold;
						
						// 획득한 경험치와 골드 playerStatus의 변수에 저장
						pstatus.setXp(xp);
						pstatus.setGold(gold);
						
						// 플레이어 레벨업 체크
						pstatus.levelUpChk();
					}
				}
			}
			if(battle_messege.charAt(0) == 'i')
			{
				pstatus.playerStatus();
				System.out.println();
				System.out.println("몬스터 정보\n-------");
				System.out.println(monName+"\n-------"
							+"\n현재 체력 : "+monRealHp+"\n공격력 : "+monAd+"\n방어력 : "+monDf
							+ "\n-------");
			}
			if(battle_messege.charAt(0) == 'r')
			{
				return;
			}
		}
	}
	
	public static void main(String[] args)
	{
		BuildClass buildclass = new BuildClass();
				
		// 게임 시작
		System.out.println("던전 모험에 어서오세요");
		
		// 플레이어 이름 생성하기
		System.out.println("당신의 이름은 무엇인가요?");
		playerName = scan.nextLine();
		
		System.out.println("당신의 이름은 "+playerName+"이 맞나요(y/n)");
		yn = scan.nextLine();
		
		while(yn.charAt(0) != 'y' && yn.charAt(0) != 'Y')
		{
			System.out.println("당신의 이름을 다시 입력해주세요");
			playerName = scan.nextLine();
				
			System.out.println("당신의 이름은 "+playerName+"이 맞나요(y/n)");
			yn = scan.nextLine();
		}
		
		// 직업 생성하기
		if(yn.charAt(0) == 'y' || yn.charAt(0) == 'Y') {
			
			System.out.println("직업을 선택하세요");
			System.out.println("전사(w)");
			System.out.println("궁수(a)");
			System.out.println("마법사(m)");
			playerClass = scan.nextLine();
		
			while(playerClass.charAt(0) != 'w' && playerClass.charAt(0) != 'W' && 
					playerClass.charAt(0) != 'a' && playerClass.charAt(0) != 'A' && 
					playerClass.charAt(0) != 'm' && playerClass.charAt(0) != 'M') {
				System.out.println("잘못 입력하셨습니다");
				System.out.println("직업을 선택하세요");
				System.out.println("전사(w)");
				System.out.println("궁수(a)");
				System.out.println("마법사(m)");
				playerClass = scan.nextLine();
			}
			
			if(playerClass.charAt(0) == 'w' || playerClass.charAt(0) == 'W') {
				//전사 직업 값 입력 받기
				buildclass.BuildWarrior();
				
				pstatus.setPlayerName(playerName);
				pstatus.setPlayerClass(buildclass.getplayerClass());
		        pstatus.setLevel(buildclass.getLevel());
		        pstatus.setXp(0);
		        pstatus.setMaxHp(buildclass.getMaxHp());
		        pstatus.setCrrHp(buildclass.getCrrHp());
		        pstatus.setAd(buildclass.getAd());
		        pstatus.setDf(buildclass.getDf());
		        pstatus.setGold(0);
		        
		        pstatus.playerStatus();
			}
			if(playerClass.charAt(0) == 'a' || playerClass.charAt(0) == 'A') {
				//궁수 직업 값 입력 받기
				buildclass.BuildArcher();
		        
				pstatus.setPlayerName(playerName);
				pstatus.setPlayerClass(buildclass.getplayerClass());
			    pstatus.setLevel(buildclass.getLevel());
			    pstatus.setXp(0);
			    pstatus.setMaxHp(buildclass.getMaxHp());
			    pstatus.setCrrHp(buildclass.getCrrHp());
			    pstatus.setAd(buildclass.getAd());
			    pstatus.setDf(buildclass.getDf());
			    pstatus.setGold(0);
			      
			    pstatus.playerStatus();
			}
			if(playerClass.charAt(0) == 'm' || playerClass.charAt(0) == 'M') {
				//마법사 직업 값 입력 받기
				buildclass.BuildMagician();
		        
				pstatus.setPlayerName(playerName);
				pstatus.setPlayerClass(buildclass.getplayerClass());
			    pstatus.setLevel(buildclass.getLevel());
			    pstatus.setXp(0);
			    pstatus.setMaxHp(buildclass.getMaxHp());
			    pstatus.setCrrHp(buildclass.getCrrHp());
			    pstatus.setAd(buildclass.getAd());
			    pstatus.setDf(buildclass.getDf());
			    pstatus.setGold(0);
			      
			    pstatus.playerStatus();
			}
		}
		// -- 플레이어, 직업 생성 완료!
		// 인게임 시작
		while(true) {
			//
			System.out.println();
			System.out.println("무엇을 할까요?\n-------");
			System.out.println("던전 진입(d)");
			System.out.println("내 정보 확인(s)");
			System.out.println("내 장비 확인(i)");
			System.out.println("상점 출입(m)");
			System.out.println("게임 종료(e)");
			playerDoit = scan.nextLine();
			
			// 잘못된 알파벳 입력 시 반복하기
			while(playerDoit.charAt(0) != 'd' && playerDoit.charAt(0) != 'D' && playerDoit.charAt(0) != 's' && playerDoit.charAt(0) != 'S' &&
					playerDoit.charAt(0) != 'i' && playerDoit.charAt(0) != 'I' && playerDoit.charAt(0) != 'm' && playerDoit.charAt(0) != 'M')
			{
				System.out.println();
				System.out.println("무엇을 할까요?\n-------");
				System.out.println("던전 진입(d)");
				System.out.println("내 정보 확인(s)");
				System.out.println("내 장비 확인(i)");
				System.out.println("상점 출입(m)");
				System.out.println("게임 종료(e)");
				playerDoit = scan.nextLine();
			}
			
			// 던전 진입(d)
			if(playerDoit.charAt(0) == 'd' || playerDoit.charAt(0) == 'D') {
				fight();
				
				System.out.println();
				System.out.println("한 판 더 하시겠습니까?\n(y or n)");
				playerDoit = scan.nextLine();
				if(playerDoit.charAt(0) == 'y' || playerDoit.charAt(0) == 'Y') {
					fight();
				}else {
					return;
				}
			}
			// 내 정보 확인(s)
			if(playerDoit.charAt(0) == 's' || playerDoit.charAt(0) == 'S') {
				System.out.println();
				pstatus.playerStatus();
			}
			
			// 내 장비 확인(i)
			if(playerDoit.charAt(0) == 'i' || playerDoit.charAt(0) == 'I') {
				System.out.println();
				System.out.println("-------");
				System.out.println("준 비 중\n-------");
			}
			
			// 상점 출입(m)
			if(playerDoit.charAt(0) == 'm' || playerDoit.charAt(0) == 'M') {
				System.out.println();
				System.out.println("-------");
				System.out.println("준 비 중\n-------");
			}
			
			// 게임 종료(e)
			if(playerDoit.charAt(0) == 'e' || playerDoit.charAt(0) == 'E') {
					System.out.println();
					System.out.println("-------");
					System.out.println("게 임 종 료\n-------");
					break;
			}
		}
	}
}
