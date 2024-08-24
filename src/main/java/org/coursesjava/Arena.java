package org.coursesjava;

import java.util.Objects;

public class Arena {
    public String declareWinner(Fighter firstFighter, Fighter secondFighter, String firstAttacker) {
        byte attackingNowCounter = 0;
        String firstFighterName = firstFighter.getName();
        String secondFighterName = secondFighter.getName();
        int collisions = 1;
        String lastAttackerName = null;

        if (firstFighter.getName().equals(firstAttacker)) attackingNowCounter = 1;

        for (int i = 0; i < collisions; i++) {
            if (attackingNowCounter == 1) {
                lastAttackerName = firstFighterName;
                int enemyHealth = secondFighter.getHealth() - firstFighter.getDamagePerAttack();
                secondFighter.setHealth(enemyHealth);
                System.out.println(firstFighterName + " attacked " + secondFighterName + ". Enemy health " + enemyHealth);
                attackingNowCounter = 0;
                if (secondFighter.getHealth() <= 0) break;
            } else {
                lastAttackerName = secondFighterName;
                int enemyHealth = firstFighter.getHealth() - secondFighter.getDamagePerAttack();
                firstFighter.setHealth(enemyHealth);
                System.out.println(secondFighterName + " attacked " + firstFighterName + ". Enemy health " + enemyHealth);
                attackingNowCounter = 1;
                if (firstFighter.getHealth() <= 0) break;
            }
            collisions++;
        }

        return Objects.requireNonNullElse(lastAttackerName, "None");
    }
}
