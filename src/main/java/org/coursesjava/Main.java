package org.coursesjava;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start fighting...");
        Arena arena = new Arena();
        String winner = arena.declareWinner(Fighter.builder()
                .name("Lew")
                .health(10)
                .damagePerAttack(2)
                .build(), Fighter.builder()
                .name("Harry")
                .health(5)
                .damagePerAttack(4)
                .build(), "Lew");
        System.out.println(winner + " is the winner!");
    }
}