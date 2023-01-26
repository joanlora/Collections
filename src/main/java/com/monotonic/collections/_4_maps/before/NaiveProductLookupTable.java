package com.monotonic.collections._4_maps.before;

import java.util.*;

public class NaiveProductLookupTable implements ProductLookupTable {
    private final List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(final Product productToAdd) {
        var id = productToAdd.getId();
        for (var product : products) {
            if (product.getId() == id) {
                throw new IllegalArgumentException(
                        "Unable to add product, duplicate id for " + product);

            }
        }
        products.add(productToAdd);
    }

    @Override
    public Product lookupById(final int id) {
        for (var product: products)
        {
            if (product.getId() == id)
            {
                return product;
            }
        }
        return null;
    }

    @Override
    public void clear() {
        products.clear();
    }
}
