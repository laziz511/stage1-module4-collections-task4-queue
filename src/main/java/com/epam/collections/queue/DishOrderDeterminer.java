package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        List<Integer> dishOrder = new ArrayList<>();
        int count = 1;

        while (!queue.isEmpty()) {
            int dishNumber = queue.poll();
            if (count % everyDishNumberToEat == 0) {
                dishOrder.add(dishNumber);
            } else {
                queue.add(dishNumber);
            }
            count++;
        }

        return dishOrder;
    }
}
