//Filename: Problem3.java
//Author: Keidy Lopez
//Description:simple rpg game

import java.util.Random;
import java.util.Scanner;

public class Problem3 {
    public static int _20SidedDie() {
        Random num = new Random();
        int die = num.nextInt(0, 20);
        return die;
    }

    public static boolean isPlayer1Active() {
        int player1die = _20SidedDie();
        int player2die = _20SidedDie();
        boolean flag;

        if (player1die < player2die) {
            flag = false;
        } else {
            flag = true;
        }

        return flag;


    }

    public static void main(String[] args) throws InterruptedException {
        //variable
        Thread thread = new Thread();
        Scanner input = new Scanner(System.in);
        boolean whoIsActive, player1 = false, player2 = true, flag = true;
        String characterName, characterName2, answer;
        int hitPoints, armorClassDamage, hitBonus, hitToRoll,damage;
        int hitPoints2, armorClassDamage2, hitBonus2, hitToRoll2,damage2;
        int rounds=0;
        double hit = 0.00, miss=0.00,hit2=0.00,miss2=0.00;

        //player 1
        System.out.println("Player 1");

        System.out.print("please enter you character's name:");
        characterName = input.nextLine();

        do {
            System.out.print("please enter you health amount:");
            hitPoints = input.nextInt();
            input.skip("\n");
            if(hitPoints<10)System.out.println("please enter a bigger number");
        }while(hitPoints<10);

        System.out.print("please enter you armor class damage:");
        armorClassDamage = input.nextInt();
        input.skip("\n");

        System.out.print("please enter you damage:");
        damage = input.nextInt();
        input.skip("\n");

        do {
            System.out.print("plase enter your hit bonus:");
            hitBonus = input.nextInt();
            input.skip("\n");
            if(hitBonus<=0)System.out.println("please enter a bigger number ");
        }while(hitBonus<=0);

        //player 2

        System.out.println("\n" + "Player 2");

        System.out.print("please enter you character's name:");
        characterName2 = input.nextLine();

        do {
            System.out.print("please enter you health amount:");
            hitPoints2 = input.nextInt();
            input.skip("\n");
            if(hitPoints2<10)System.out.println("please enter a bigger number");
        }while(hitPoints2<10);

        System.out.print("please enter you armor class:");
        armorClassDamage2 = input.nextInt();
        input.skip("\n");

        System.out.print("please enter you damage:");
        damage2 = input.nextInt();
        input.skip("\n");

        do {
            System.out.print("plase enter your hit bonus:");
            hitBonus2 = input.nextInt();
            input.skip("\n");
            if(hitBonus2<=0)System.out.println("please enter a bigger number ");
        }while(hitBonus2<=0);


        // game loop
        while (flag) {
            whoIsActive = isPlayer1Active();

            if (whoIsActive) {
                player1 = true;
                player2 = false;
                System.out.println("\n"+characterName+" is the active player!");
            }
            else{System.out.println("\n"+characterName2+" is the active player!");}

            if (player1 == true) {
                rounds+=1;
                hitToRoll = _20SidedDie();
                thread.sleep(500);
                System.out.println("\n"+"rolling Die...");
                thread.sleep(500);
                System.out.println("\n"+characterName+" rolled "+ hitToRoll);
                if (hitToRoll+hitBonus > armorClassDamage2) {
                    hit+=1;
                    hitPoints2 = hitPoints2 - damage;
                    thread.sleep(500);
                    System.out.println("\n"+characterName+" landed a hit! "+characterName2+" has "+hitPoints2+" health remaning");
                }
                else{
                    hit+=1;
                    miss+=1;
                    thread.sleep(500);
                    System.out.println("\n"+characterName+" missed");}

                if (hitPoints <= 0 || hitPoints2 <= 0) {
                    if (hitPoints <= 0) {
                        thread.sleep(500);
                        System.out.print("\n" + characterName + " lost");
                    } else {
                        thread.sleep(500);
                        System.out.print("\n" + characterName2 + " lost");
                    }

                    flag = false;

                    continue;
                }
                player1 = false;
                player2= true;
            }

            if (player2 == true) {
                hitToRoll2 = _20SidedDie();
                thread.sleep(500);
                System.out.println("\n" + "rolling Die...");
                thread.sleep(500);
                System.out.println("\n" + characterName2 + " rolled " + hitToRoll2);
                if (hitToRoll2 + hitBonus2 > armorClassDamage) {
                    hit2+=1;
                    hitPoints = hitPoints - damage2;
                    thread.sleep(500);
                    System.out.println("\n" + characterName2 + " landed a hit! player 1 has " + hitPoints + " health remaning");
                }
                else {
                    hit2+=1;
                    miss2+=1;
                    thread.sleep(500);
                    System.out.println("\n" + characterName2 + " missed");
                }

                if (hitPoints <= 0 || hitPoints2 <= 0) {
                    if (hitPoints <= 0) {
                        System.out.print("\n" + characterName + " lost");
                    } else {
                        System.out.print("\n" + characterName2 + " lost");
                    }

                    flag = false;
                    continue;
                }
                player1 = false;
                player2 = true;

                //players 1 turn
                if (whoIsActive == false) {
                    rounds+=1;
                    hitToRoll = _20SidedDie();
                    thread.sleep(500);
                    System.out.println("\n" + "rolling Die...");
                    thread.sleep(500);
                    System.out.println("\n" + characterName + " rolled " + hitToRoll);
                    if (hitToRoll + hitBonus > armorClassDamage2) {
                        hit+=1;
                        hitPoints2 = hitPoints2 - damage;
                        thread.sleep(500);
                        System.out.println("\n" + characterName + " landed a hit! " + characterName2 + " has " + hitPoints2 + " health remaning");
                    } else {
                        hit+=1;
                        miss+=1;
                        thread.sleep(500);
                        System.out.println("\n" + characterName + " missed");
                    }
                }
                if (hitPoints <= 0 || hitPoints2 <= 0) {
                    if (hitPoints <= 0) {
                        System.out.print("\n" + characterName + " lost");
                    } else {
                        System.out.print("\n" + characterName2 + " lost");
                    }

                    flag = false;

                }


                if (flag) {
                    thread.sleep(500);
                    if (hitPoints > hitPoints2){System.out.println("The winner of this round is " + characterName);}
                    else {System.out.println("The winner of this round is " + characterName2);}
                    thread.sleep(500);
                    System.out.println(characterName+" hit rate "+ (((hit-miss)/hit)*100));
                    thread.sleep(500);
                    System.out.println(characterName2+" hit rate "+ (((hit2-miss2)/hit2)*100));
                    thread.sleep(500);
                    System.out.println("number of rounds: "+rounds);
                    thread.sleep(1000);
                    System.out.print("would you like to play again?(y/n)");
                    answer = input.nextLine();

                    if (answer.toUpperCase().equals("Y")) flag = true;
                    else {flag = false;}
                }
            }
        }
    }

}


