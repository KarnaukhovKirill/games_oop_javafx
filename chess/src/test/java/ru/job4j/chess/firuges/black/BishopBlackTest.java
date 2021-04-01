package ru.job4j.chess.firuges.black;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Figure blackBishop = new BishopBlack(Cell.D4);
        Cell pos = blackBishop.position();
        int x = pos.getX();
        int y = pos.getY();
        assertThat(x, is(3));
        assertThat(y, is(4));
    }

    @Test
    public void testCopy() {
        Figure blackBishop = new BishopBlack(Cell.D8);
        Figure pos = blackBishop.copy(Cell.H4);
        Cell finalPosition = pos.position();
        assertThat(finalPosition.getX(), is(7));
        assertThat(finalPosition.getY(), is(4));
    }

    @Test
    public void testWayD4toE5() {
        Figure blackBishop = new BishopBlack(Cell.D4);
        Cell[] array = blackBishop.way(Cell.E5);
        assertThat(array[0].getX(), is(4));
        assertThat(array[0].getY(), is(3));
    }

    @Test
    public void testWayD4toC3() {
        Figure blackBishop = new BishopBlack(Cell.D4);
        Cell[] array = blackBishop.way(Cell.C3);
        assertThat(array[0].getX(), is(2));
        assertThat(array[0].getY(), is(5));
    }

    @Test
    public void testWayD4toC5() {
        Figure blackBishop = new BishopBlack(Cell.D4);
        Cell[] array = blackBishop.way(Cell.C5);
        assertThat(array[0].getX(), is(2));
        assertThat(array[0].getY(), is(3));
    }

    @Test
    public void testWayD4toE3() {
        Figure blackBishop = new BishopBlack(Cell.D4);
        Cell[] array = blackBishop.way(Cell.E3);
        assertThat(array[0].getX(), is(4));
        assertThat(array[0].getY(), is(5));
    }

    @Test
    public void testWayD4toG7() {
        Figure blackBishop = new BishopBlack(Cell.D4);
        Cell[] array = blackBishop.way(Cell.G7);
        Cell[] expected = {Cell.E5, Cell.F6, Cell.G7};
        assertThat(array, is(expected));
    }

    @Test
    public void testWayD4toA7() {
        Figure blackBishop = new BishopBlack(Cell.D4);
        Cell[] array = blackBishop.way(Cell.A7);
        Cell[] expected = {Cell.C5, Cell.B6, Cell.A7};
        assertThat(array, is(expected));
    }
}