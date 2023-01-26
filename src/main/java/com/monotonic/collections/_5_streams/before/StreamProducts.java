package com.monotonic.collections._5_streams.before;

import com.monotonic.collections._5_streams.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class StreamProducts
{
    public static void main(String[] args)
    {
        var door = new Product(1, "Wooden Door", 35);
        var floorPanel = new Product(2, "Floor Panel", 25);
        var window = new Product(3, "Glass Window", 10);

        var products = List.of(door, floorPanel, window, floorPanel, window);

        System.out.println(namesOfLightProductsWeightSortedLoop(products));
        System.out.println("\n Using Java Streams: ");
        System.out.println(namesOfLightProductsWeightSortedStreams(products));
    }

    private static List<String> namesOfLightProductsWeightSortedStreams(List<Product> products) {
        return products
                .stream()
                .filter(product -> product.getWeight() < 30)
                .sorted(comparingInt(Product::getWeight)) // sort each product to that is under weight 30
                .map(Product::getName)// get the product's name
                //.distinct() // removes duplicates
                .toList(); // turn those names into an immutable list
    }

    private static List<String> namesOfLightProductsWeightSortedLoop(
        List<Product> products)
    {
        List<Product> lightProducts = new ArrayList<>();

        for (Product product : products)
        {
            if (product.getWeight() < 30)
            {
                lightProducts.add(product);
            }
        }

        lightProducts.sort(comparingInt(Product::getWeight));

        List<String> productNames = new ArrayList<>();
        for (Product product : lightProducts)
        {
            productNames.add(product.getName());
        }

        return Collections.unmodifiableList(productNames);
    }
}
