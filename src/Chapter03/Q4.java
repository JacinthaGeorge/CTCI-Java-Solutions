package Chapter03;

import java.util.Stack;

/**
 * In the classic problem of the Towers of Hanoi, you have 3 towers and N disks
 * of different sizes which can slide onto any tower. The puzzle starts with disks sorted
 * in ascending order of size from top to bottom (i.e., each disk sits on top
 * of an even larger one). You have the following constraints:
 * (1) Only one disk can be moved at a time.
 * (2) A disk is slid off the top of one tower onto the next tower.
 * (3) A disk can only be placed on top of a larger disk.
 * Write a program to move the disks from the first tower to the last using stacks.
 */

public class Q4 {

    public static void towersOfHanoi(int n, Stack<Integer> from, Stack<Integer> to, Stack<Integer> temp) {

        if (n == 1) {
            to.push(from.pop());
        }
        else {
            towersOfHanoi(n-1, from, temp, to);
            towersOfHanoi(1, from, to, temp);
            towersOfHanoi(n-1, temp, to, from);
        }
    }

    public static void main(String[] args) {

        int n = 5;

        Stack<Integer> fromTower = new Stack<>();
        Stack<Integer> tempTower = new Stack<>();
        Stack<Integer> toTower = new Stack<>();

        for (int i=n;i>0;i--) {
            fromTower.push(i);
        }

        towersOfHanoi(n, fromTower, toTower, tempTower);

        while (!toTower.isEmpty()) {
            System.out.println(toTower.pop());
        }
    }
}
