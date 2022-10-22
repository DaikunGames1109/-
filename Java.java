import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		label:for(int i = 0; i <= 2; i++){
			System.out.println("巣窟のレベルを入力してください(数字のみ)");
			int L = scan.nextInt();
			System.out.println("マリオスの強化レベルを入力してください(数字のみ、持っていない場合は9と入力してください)");
			int G = scan.nextInt();
			System.out.println("狩猟集中を使う場合は0,使わない場合は1を入力してください");
			byte Shu = scan.nextByte();
			double Shuthu = 1;
			if (Shu == 0){
				Shuthu = 1;
			}else{
				Shuthu = 1.25;
			}
			int stamina = 1;
			double Y = 1.0;
			int S = 1;
			if (L < 8){
				stamina = 20;
				S = 2;
			}else if (L < 15){
				stamina = 25;
			S = 2;
			}else if (L < 22){
				stamina = 30;
				S = 3;
			}else if (L < 29){
				stamina = 35;
				S = 3;
			}else{
				stamina = 40;
				S = 4;
			}
			if (G == 6){
				Y = 18.75;
			}else if (G == 7){
				Y = 22.5;
			}else if (G == 9){
				Y = 0.0;
			}else if (G == 0){
				Y = 4.5;
			}else{
				Y = G*3.0;
			}
			System.out.println("通常のStamina:"+stamina+" マリオスによるスタミナ軽減率"+Y+"%");
			double a = (double)stamina/100;
			double b = 80-Y;
			double st = Math.floor(a*b*Shuthu);
			System.out.println("巣窟Lv."+L+" の必要スタミナ量は"+st+"("+st+")で、アイテム獲得数は"+S+"個です。");
			double PP = st*10;
			double ItemP = PP/S;
			System.out.println("アイテム1つあたりのスタミナ量は"+ItemP/10+"です。");
			System.out.println("このプログラムをもう一度やる場合は1,終了する場合は1以外を入力してください");
			int end = scan.nextInt();
			if (end == 1){
				i = 0;
				continue label;
			}else{
				i = 2;
			}
		}
	}
}