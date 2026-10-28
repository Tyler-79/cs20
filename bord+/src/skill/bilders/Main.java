package skill.bilders;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int playerHP = 30;
        int monsterHP = 25;

        System.out.println("A monster appears!");

        while (playerHP > 0 && monsterHP > 0) {
            int damage = rand.nextInt(10) + 1;
            monsterHP -= damage;
            System.out.println("You hit for " + damage);

            if (monsterHP <= 0) break;

            int hit = rand.nextInt(8) + 1;
            playerHP -= hit;
            System.out.println("Monster hits for " + hit);
            System.out.println("Your HP: " + Math.max(0, playerHP));
            System.out.println("Monster HP: " + monsterHP);
        }

        System.out.println(playerHP > 0
            ? "Victory! You defeated the monster!"
            : "Game over!");
    }
}