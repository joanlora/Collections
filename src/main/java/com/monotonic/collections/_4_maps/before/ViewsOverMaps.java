package com.monotonic.collections._4_maps.before;

import java.util.*;

public class ViewsOverMaps
{
    public static void main(String[] args)
    {
        var idToProduct = new HashMap<Integer, Product>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        /*
        var entries = idToProduct.entrySet();
        var entry = Map.entry(1,ProductFixtures.door);
        entries.remove(entry);

        System.out.println(entries);
        System.out.println(idToProduct);

        /*
        var e = entries.iterator().next();
        e.setValue(null);

        System.out.println(idToProduct);
        /*
        idToProduct.forEach((k,v) ->
        {
            System.out.println(k);
            System.out.println(v);
        });
        /*
        for (var entry : entries)
        {
            System.out.println(entry);
        }
        /*
        var products = idToProduct.values();

        products.remove(ProductFixtures.door);
        idToProduct.remove(2);

        System.out.println(products);
        System.out.println(idToProduct);

        /*
        var ids = idToProduct.keySet();

        System.out.println(ids);
        System.out.println(idToProduct);

        ids.remove(1);
        idToProduct.remove(2);

        System.out.println("\n .remove executed:");
        System.out.println(ids);
        System.out.println(idToProduct);
        */

        
    }
}
