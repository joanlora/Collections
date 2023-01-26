package com.monotonic.collections._6_operations.before;

import java.util.*;

public class UnmodifiableVsImmutable
{
    public static void main(String[] args)
    {
        var mutableCountryToPopulation = new HashMap<>();
        mutableCountryToPopulation.put("UK", 67);
        mutableCountryToPopulation.put("USA", 328);
        //mutableCountryToPopulation.put("Wessex", null); .copyof does not allow null values
        mutableCountryToPopulation.put("DR", 10);

        var unmodifiable = Collections.unmodifiableMap(mutableCountryToPopulation);
        var copied = Map.copyOf(mutableCountryToPopulation);
        var mutableCopy = new HashMap<>(mutableCountryToPopulation);

        /*var countryToPop = Map.of("UK",67,"USA","328");
        System.out.println(countryToPop);*/

        // countryToPop.put("Germany", 83); throws an error

        System.out.println("mutableCountryToPopulation = " + mutableCountryToPopulation);
        System.out.println("unmodifiable = " + unmodifiable);
        System.out.println("copied = " + copied);

        /*mutableCopy.put("Germany",83);
        System.out.println("mutable copied: " + mutableCopy);

        System.out.println("PUT");
        mutableCountryToPopulation.put("Germany", 83);

        System.out.println("mutableCountryToPopulation = " + mutableCountryToPopulation);
        System.out.println("unmodifiable = " + unmodifiable);
        System.out.println("copied = " + copied);*/

        // ctrl shift slash to make block comment (intellij)
        // ctrl slash to make line comment (intellij)
        // - JL 1/26/23



    }
}
