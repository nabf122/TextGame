package com.java.textgame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	// �÷��̾� ���� ���� ����
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
	
	// ���� ���� ���� ����
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
		System.out.println("� ������ �����ұ��?\n-------");
		System.out.println("������ ���(1)");
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
			System.out.println("������ ���(1)");
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
			
			// ������ ����
			monster.BuildMonster(1);
		}
		if(playerDoit.charAt(0) == '2')
		{
			System.out.println("==========================");
			System.out.println("�� ������ �����ϼ̽��ϴ�.");
			System.out.println("==========================");
			
			// �� ����
			monster.BuildMonster(2);
			
		}
		// 3 �Է� ��
		if(playerDoit.charAt(0) == '3')
		{
			System.out.println("==========================");
			System.out.println("����� �� �����ϼ̽��ϴ�.");
			System.out.println("==========================");
			
			monster.BuildMonster(3);
		}
		// 4 �Է� ��
		if(playerDoit.charAt(0) == '4')
		{
			return;
		}
			
			
		// �÷��̾� ���� ��������
		xp = pstatus.getXp();
		maxHp = pstatus.getMaxHp();
		crrHp = pstatus.getCrrHp();
		ad = pstatus.getAd();
		df = pstatus.getDf();
		gold = pstatus.getGold();
			
		// ���� ���� ��������
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
				num = random.nextInt(ad)+1 - monDf;
				// �� ����� ���� �� 0������ ���� ���´ٸ�!
				if(num < 0) {
					System.out.println("==========================");
					System.out.println(monName+"���� ��ȿ�� ������ ���� ���߽��ϴ�");
					System.out.println("==========================");
					// ������ ���� ��
					if(monRealHp > 0) {
						num = 0;
						num = random.nextInt(monAd)+1 - df;
						// �� ����� ���� �� 0������ ���� ���´ٸ�!
						if(num < 0) {
							System.out.println("==========================");
							System.out.println(monName+"��(��) ��ȿ�� ������ ���� ���߽��ϴ�");
							System.out.println("==========================");
						}
						else {
							// ������ ���� ���
							crrHp -= num;
							
							// playerStatus�� ���� ü�� ������ �ݿ�
							pstatus.setCrrHp(crrHp);
							
							if(crrHp > 0) {
								System.out.println("==========================");
								System.out.println(monName+"���κ��� "+num+"�� �������� �Ծ����ϴ�\n���� ü���� "+crrHp+"�Դϴ�");
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
					monRealHp -= num;
	
					if(monRealHp > 0) {
						System.out.println("==========================");
						System.out.println(monName+"���� "+num+"�� �������� �������ϴ�\n"+ monName +"�� ���� ü���� "+monRealHp+"�Դϴ�");
						System.out.println("==========================");
						num = 0;
						num = random.nextInt(monAd)+1 - df;
						// �� ����� ���� �� 0������ ���� ���´ٸ�!
						if(num < 0) {
							System.out.println("==========================");
							System.out.println(monName+"��(��) ��ȿ�� ������ ���� ���߽��ϴ�");
							System.out.println("==========================");
						}
						else {
						// ������ ���� ���
						crrHp -= num;
							
							// playerStatus�� ���� ü�� ������ �ݿ�
							pstatus.setCrrHp(crrHp);
							
							if(crrHp > 0) {
								System.out.println("==========================");
								System.out.println(monName+"���κ��� "+num+"�� �������� �Ծ����ϴ�\n���� ü���� "+crrHp+"�Դϴ�");
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
						System.out.println(monName+"���� "+num+"�� �������� �������ϴ�\n"+ monName +"�� ���� ü���� 0�Դϴ�");
						System.out.println("==========================");
						System.out.println(monName+"���� �������� �¸��Ͽ����ϴ�!!\n����ġ"+ giveXp +"�� ȹ���Ͽ����ϴ�\n���"+ giveGold +"�� ȹ���Ͽ����ϴ�");
						System.out.println("==========================");
						xp += giveXp;
						gold += giveGold;
						
						// ȹ���� ����ġ�� ��� playerStatus�� ������ ����
						pstatus.setXp(xp);
						pstatus.setGold(gold);
						
						// �÷��̾� ������ üũ
						pstatus.levelUpChk();
					}
				}
			}
			if(battle_messege.charAt(0) == 'i')
			{
				pstatus.playerStatus();
				System.out.println();
				System.out.println("���� ����\n-------");
				System.out.println(monName+"\n-------"
							+"\n���� ü�� : "+monRealHp+"\n���ݷ� : "+monAd+"\n���� : "+monDf
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
				
				System.out.println();
				System.out.println("�� �� �� �Ͻðڽ��ϱ�?\n(y or n)");
				playerDoit = scan.nextLine();
				if(playerDoit.charAt(0) == 'y' || playerDoit.charAt(0) == 'Y') {
					fight();
				}else {
					return;
				}
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
