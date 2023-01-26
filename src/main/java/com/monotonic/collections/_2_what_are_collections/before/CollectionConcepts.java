package com.monotonic.collections._2_what_are_collections.before;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionConcepts
{
    public static void main(String[] args)
    {
        var door = new Product("Wooden Door", 35);
        var floorPanel = new Product("Floor Panel", 25);
        var window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        // var products = new ArrayList<Product>(); also works! - JL 1/24/2023

        products.add(door);
        products.add(floorPanel);
        products.add(window);

        var toRemove = new ArrayList<Product>();
        toRemove.add(door);
        toRemove.add(floorPanel);
        toRemove.add(window);

        products.removeAll(toRemove);
        System.out.println(products);

        /*System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(door));
        System.out.println(products.remove(door));
        System.out.println(products.contains(door));

       /*System.out.println("products = " + products);

        Iterator<Product> it = products.iterator();
        while (it.hasNext()){
            var product = it.next();
            if(product.weight() > 20){
                it.remove();
            }
        }

        System.out.print(products);
        /*for(var product:products){
            if(product.weight() > 20){
                products.remove(product);
            }
        }*/
        // products.removeIf(product -> product.weight() > 20); also works! JL 1/24/2023


    }
}
