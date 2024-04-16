package exercise;

import java.util.Iterator;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Player[] players = {
                new Player("Ernesto", "Delantero", 24),
                new Player("Ivan", "Defensor", 14),
                new Player("Jorge", "Mediocampista", 26)
        };
        Equipment equipment = new Equipment(players);

        for(Player player : equipment){
            System.out.println(player);
        }
    }
}

