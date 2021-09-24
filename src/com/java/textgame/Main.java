package com.java.textgame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	// �÷��̾� ����
	public static String playerName;	// �÷��̾� �̸�
	public static String playerClass;	// Ŭ����
	public static String playerDoit;
	public static int level;	// ����
	public static int xp;	// ����ġ
	public static int maxHp;	// �ִ� ü��
	public static int crrHp;	// ���� ü��
	public static int ad;	// ���ݷ�
	public static int df;	// ����
	public static int gold;	// ���� ���
	
	public static String yn;
	
	static Scanner scan = new Scanner(System.in);
	
	private static void fight() {
		
		BuildMonster monster = new BuildMonster();
		BettleOfMonster bom = new BettleOfMonster();
		
		System.out.println();
		System.out.println("� ������ �����ұ��?\n-------");
		System.out.println("������ ����(1)");
		System.out.println("�� ����(2)");
		System.out.println("����� ����(3)");
		System.out.println("�ڷ� ����(4)");
			
		playerDoit = scan.nextLine();
			
		// �߸��� ���ĺ� �Է� �� �ݺ��ϱ�
		while(playerDoit.charAt(0) != '1' && playerDoit.charAt(0) != '2' &&
				playerDoit.charAt(0) != '3' && playerDoit.charAt(0) != '4')
		{
			System.out.println();
			System.out.println("� ������ �����ұ��?\n-------");
			System.out.println("������ ����(1)");
			System.out.println("�� ����(2)");
			System.out.println("����� ����(3)");
			System.out.println("�ڷ� ����(4)");
				
			playerDoit = scan.nextLine();
		}
			
			
		// 1 �Է� ��
		if(playerDoit.charAt(0) == '1')
		{
			System.out.println("==========================");
			System.out.println("������ ����� �����ϼ̽��ϴ�.");
			System.out.println("==========================");
			
			monster.BuildMonster(1);
			bom.Bettle();
				
		}
	
		if(playerDoit.charAt(0) == '2')
		{
			monster.BuildMonster(2);
			bom.Bettle();
		}
		// 3 �Է� ��
		if(playerDoit.charAt(0) == '3')
		{
			monster.BuildMonster(3);
			bom.Bettle();
		}
		// b �Է� ��
		if(playerDoit.charAt(0) == '4')
		{
			return;
		}
	}
	
	public static void main(String[] args)
	{
		BuildClass buildclass = new BuildClass();
		PlayerStatus pstatus = new PlayerStatus();
		
		
		// ���� ����
		System.out.println("���� ���迡 �������");
		
		// �÷��̾� �̸� �����ϱ�
		System.out.println("����� �̸��� �����ΰ���?");
		playerName = scan.nextLine();
		
		System.out.println("����� �̸��� "+playerName+"�� �³���(y/n)");
		yn = scan.nextLine();
		
		while(yn.charAt(0) != 'y' && yn.charAt(0) != 'Y')
		{
			System.out.println("����� �̸��� �ٽ� �Է����ּ���");
			playerName = scan.nextLine();
				
			System.out.println("����� �̸��� "+playerName+"�� �³���(y/n)");
			yn = scan.nextLine();
		}
		
		// ���� �����ϱ�
		if(yn.charAt(0) == 'y' || yn.charAt(0) == 'Y') {
			
			System.out.println("������ �����ϼ���");
			System.out.println("����(w)");
			System.out.println("�ü�(a)");
			System.out.println("������(m)");
			playerClass = scan.nextLine();
		
			while(playerClass.charAt(0) != 'w' && playerClass.charAt(0) != 'W' && 
					playerClass.charAt(0) != 'a' && playerClass.charAt(0) != 'A' && 
					playerClass.charAt(0) != 'm' && playerClass.charAt(0) != 'M') {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				System.out.println("������ �����ϼ���");
				System.out.println("����(w)");
				System.out.println("�ü�(a)");
				System.out.println("������(m)");
				playerClass = scan.nextLine();
			}
			
			if(playerClass.charAt(0) == 'w' || playerClass.charAt(0) == 'W') {
				//���� ���� �� �Է� �ޱ�
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
				//�ü� ���� �� �Է� �ޱ�
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
				//������ ���� �� �Է� �ޱ�
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
		// -- �÷��̾�, ���� ���� �Ϸ�!
		// �ΰ��� ����
		while(true) {
			//
			System.out.println();
			System.out.println("������ �ұ��?\n-------");
			System.out.println("���� ����(d)");
			System.out.println("�� ���� Ȯ��(s)");
			System.out.println("�� ��� Ȯ��(i)");
			System.out.println("���� ����(m)");
			System.out.println("���� ����(e)");
			playerDoit = scan.nextLine();
			
			// �߸��� ���ĺ� �Է� �� �ݺ��ϱ�
			while(playerDoit.charAt(0) != 'd' && playerDoit.charAt(0) != 'D' && playerDoit.charAt(0) != 's' && playerDoit.charAt(0) != 'S' &&
					playerDoit.charAt(0) != 'i' && playerDoit.charAt(0) != 'I' && playerDoit.charAt(0) != 'm' && playerDoit.charAt(0) != 'M')
			{
				System.out.println();
				System.out.println("������ �ұ��?\n-------");
				System.out.println("���� ����(d)");
				System.out.println("�� ���� Ȯ��(s)");
				System.out.println("�� ��� Ȯ��(i)");
				System.out.println("���� ����(m)");
				System.out.println("���� ����(e)");
				playerDoit = scan.nextLine();
			}
			
			// ���� ����(d)
			if(playerDoit.charAt(0) == 'd' || playerDoit.charAt(0) == 'D') {
				fight();							
			}
			// �� ���� Ȯ��(s)
			if(playerDoit.charAt(0) == 's' || playerDoit.charAt(0) == 'S') {
				System.out.println();
				pstatus.playerStatus();
			}
			
			// �� ��� Ȯ��(i)
			if(playerDoit.charAt(0) == 'i' || playerDoit.charAt(0) == 'I') {
				System.out.println();
				System.out.println("-------");
				System.out.println("�� �� ��\n-------");
			}
			
			// ���� ����(m)
			if(playerDoit.charAt(0) == 'm' || playerDoit.charAt(0) == 'M') {
				System.out.println();
				System.out.println("-------");
				System.out.println("�� �� ��\n-------");
			}
			
			// ���� ����(e)
			if(playerDoit.charAt(0) == 'e' || playerDoit.charAt(0) == 'E') {
					System.out.println();
					System.out.println("-------");
					System.out.println("�� �� �� ��\n-------");
					break;
			}
		}
	}
}
