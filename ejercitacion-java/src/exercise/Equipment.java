package exercise;

import java.util.Iterator;

public class Equipment implements Iterable<Player> {
    private Player[] players;

    public Equipment(Player[] players) {
        this.players = players;
    }

    public Iterator<Player> iterator() {
        return new MiIterator();
    }

    private class MiIterator implements Iterator<Player> {
        private int index = 0;

        public boolean hasNext() {
            return this.index < players.length;
        }

        public Player next() {
            return players[this.index++];
        }
    }
}

