package com.monotonic.collections._6_operations.before;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class CollectionOperations
{
    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Glass Window", 10);

    public static void main(String[] args)
    {
        var products = new ArrayList<>(List.of(window, floorPanel, door));
        System.out.println(products);

        var alphabet = makeAlphabet();
        System.out.println(alphabet);

        int index = Collections.binarySearch(alphabet,'A');
        System.out.println(index);

        //Collections.shuffle(products, ThreadLocalRandom.current()); // .shuffle randomly changes elements in ArrayList using java random class

        /*Collections.rotate(products,2); // .rotate has loads of algo methods
        System.out.println(products); // rotates moves the end element to the front of the ArrayList*/

        //System.out.println(products);//
    }

    private static List<Character> makeAlphabet()
    {
        return IntStream.range('A', 'Z').mapToObj(x -> (char)x).toList();
    }
}
