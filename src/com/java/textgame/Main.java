package com.java.textgame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	// 플레이어 변수
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
	
	public static String yn;
	
	static Scanner scan = new Scanner(System.in);
	
	private static void fight() {
		
		BuildMonster monster = new BuildMonster();
		BettleOfMonster bom = new BettleOfMonster();
		
		System.out.println();
		System.out.println("어떤 던전을 입장할까요?\n-------");
		System.out.println("슬라임 던전(1)");
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
			System.out.println("슬라임 던전(1)");
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
			
			monster.BuildMonster(1);
			bom.Bettle();
				
		}
	
		if(playerDoit.charAt(0) == '2')
		{
			monster.BuildMonster(2);
			bom.Bettle();
		}
		// 3 입력 시
		if(playerDoit.charAt(0) == '3')
		{
			monster.BuildMonster(3);
			bom.Bettle();
		}
		// b 입력 시
		if(playerDoit.charAt(0) == '4')
		{
			return;
		}
	}
	
	public static void main(String[] args)
	{
		BuildClass buildclass = new BuildClass();
		PlayerStatus pstatus = new PlayerStatus();
		
		
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
