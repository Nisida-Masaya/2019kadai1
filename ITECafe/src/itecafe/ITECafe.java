/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecafe;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kbc19a25
 */
public class ITECafe {

    private static int Item;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item hotcoffee = new Item(1, "ホットコーヒー", 280);
        Item tea = new Item(2, "紅茶", 260);
        Item icecoffee = new Item(3, "アイスコーヒー", 200);
        Item icetea = new Item(4, "アイスティー", 260);
        Item shortcake = new Item(5, "ショートケーキ", 400);
        Item cheesecake = new Item(6, "チーズケーキ", 400);
        Item chocolatecake = new Item(7, "チョコレートケーキ", 450);
        Item chocolatebananaparfait = new Item(8, "チョコバナナパフェ", 390);
        Item strawberryparfait = new Item(9, "イチゴパフェ", 390);
        Item meatpasta = new Item(10, "ミートパスタ", 650);
        Item mixpizza = new Item(11, "ミックスピザ", 700);
        Item croissant = new Item(12, "クロワッサン", 180);
        Item toastsandwich = new Item(13, "トーストサンド", 200);
        Item frenchtoast = new Item(14, "フレンチトースト", 210);
        int sum = 0;
        int abc = 0;
        String abcd;
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(hotcoffee);
        list.add(tea);
        list.add(icecoffee);
        list.add(icetea);
        list.add(shortcake);
        list.add(cheesecake);
        list.add(chocolatecake);
        list.add(chocolatebananaparfait);
        list.add(strawberryparfait);
        list.add(meatpasta);
        list.add(mixpizza);
        list.add(croissant);
        list.add(toastsandwich);
        list.add(frenchtoast);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNo() + "." + list.get(i).getName() + list.get(i).getPrice());
        }

        System.out.println("■■■ITECafeシステム■■■");

        Scanner scan = new Scanner(System.in);

        for (;;) {
            System.out.println("商品番号を入力してください");

            try {
                abcd = scan.next();
                abc = Integer.parseInt(abcd);
                if (abc <= list.size()) {
                    switch (abc) {
                        case 1:
                            System.out.println("ホットコーヒー" + 280 + "円");
                            break;
                        case 2:
                            System.out.println("紅茶" + 260 + "円");
                            break;
                        case 3:
                            System.out.println("アイスコーヒー" + 200 + "円");
                            break;
                        case 4:
                            System.out.println("アイスティー" + 260 + "円");
                            break;
                        case 5:
                            System.out.println("ショートケーキ" + 400 + "円");
                            break;
                        case 6:
                            System.out.println("チーズケーキ" + 400 + "円");
                            break;
                        case 7:
                            System.out.println("チョコレートケーキ" + 400 + "円");
                            break;
                        case 8:
                            System.out.println("チョコバナナパフェ" + 390 + "円");
                            break;
                        case 9:
                            System.out.println("イチゴパフェ" + 390 + "円");
                            break;
                        case 10:
                            System.out.println("ミートパスタ" + 650 + "円");
                            break;
                        case 11:
                            System.out.println("ミックスピザ" + 700 + "円");
                            break;
                        case 12:
                            System.out.println("クロワッサン" + 180 + "円");
                            break;
                        case 13:
                            System.out.println("トーストサンド" + 200 + "円");
                            break;
                        case 14:
                            System.out.println("フレンチトースト" + 210 + "円");
                            break;
                    }
                } else {
                    System.out.println("もう一度入力してください");
                    continue; //商品番号入力
                }
            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください");
                continue;
            }
            try {
                System.out.print("おいくつお求めですか？:");
                String kosuu = new java.util.Scanner(System.in).next();
                int kosunum = Integer.parseInt(kosuu);
                sum += kosunum * list.get(abc - 1).getPrice();
                System.out.println("ご注文は以上ですか？");
            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください");
                continue;
            }

            try {
                System.out.println("以上であれば数字の１　、　そうでなければ数字の２を入力してください");
                int num = new java.util.Random().nextInt(2) + 1;
                int kazu = new java.util.Scanner(System.in).nextInt();

                if (kazu == 1) {
                    System.out.println("お会計に進みます");
                    System.out.println(sum + "円になります");
                    
                } else if (kazu == 2) {
                    // System.out.println("商品番号を入力してください");
                    continue;
                } else if (kazu > 2) {
                    System.out.println("１か２を入力してください");
                    continue;
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("数字を入力してください");
            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください");
            }

            for (;;) {
                try {
                    System.out.println("お金を入力してください");
                    String dfg = new java.util.Scanner(System.in).next();
                    int hij = Integer.parseInt(dfg);
                    if (hij > sum) {
                        System.out.print(hij - sum);
                        System.out.println("円のお返しになります");
                        System.out.println("ありがとうございました");
                        break;
                    } else {
                        System.out.println("お金が足りません");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("数字を入力してください");
                }
            }
            break;
        }
    }
}
