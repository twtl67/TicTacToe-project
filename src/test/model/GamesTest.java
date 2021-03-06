package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//test for Game
public class GamesTest {
    private Game games;
    private Player p1;
    private Player p2;

    @Test
    void testConstructorNoPara() {
        games = new Game();
        assertFalse(games.isGameOver());
    }

    @Test
    void testConstructor() {
        p1 = new Player("Sam", 'x', 3);
        p2 = new Player("James", 'o', 1);
        games = new Game(p1, p2);
        assertFalse(games.isGameOver());
        assertEquals("Sam", games.getP1().getUsername());
        assertEquals("James", games.getP2().getUsername());
    }

    @Test
    void testStartOver() {
        p1 = new Player("Sam", 'x', 3);
        p2 = new Player("James", 'o', 1);
        games = new Game(p1, p2);
        games.startOver();
        assertEquals(0, p1.score);
        assertEquals(0, p2.score);
        assertTrue(games.isGameOver());

    }

    @Test
    void testGetPlayers() {
        p1 = new Player("Sam", 'x', 3);
        p2 = new Player("James", 'o', 1);
        games = new Game(p1, p2);
        assertEquals(p1, games.getPlayers().get(0));
        assertEquals(p2, games.getPlayers().get(1));
    }

    @Test
    void testSetGameOver(){
        p1 = new Player("Sam", 'x', 3);
        p2 = new Player("James", 'o', 1);
        games = new Game(p1, p2);
        games.setGameOver();
        assertTrue(games.isGameOver());
    }
}
