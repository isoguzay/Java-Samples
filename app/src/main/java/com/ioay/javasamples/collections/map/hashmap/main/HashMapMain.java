package com.ioay.javasamples.collections.map.hashmap.main;

import com.ioay.javasamples.collections.map.hashmap.model.City;

import java.util.HashMap;
import java.util.Set;

public class HashMapMain {

    public static void main(String args[]) {

        HashMap<Integer, String> cities = new HashMap<>();

        cities.put(34, "Istanbul");
        cities.put(35, "Izmir");
        cities.put(06, "Ankara");

        System.out.println(cities.get(6));

        Set<Integer> keys = cities.keySet();

        for (Integer x : keys) {
            System.out.print(cities.get(x) + " - ");
        }

        /* --------------------------------------------  */

        HashMap<Integer, City> citiesMap = new HashMap<>();

        City city = new City(01, "Adana");
        City city1 = new City(10, "Balıkesir");
        City city2 = new City(61, "Trabzon");

        citiesMap.put(city.getCityId(), city);
        citiesMap.put(city1.getCityId(), city1);
        citiesMap.put(city2.getCityId(), city2);

        Set<Integer> citiesId = citiesMap.keySet();

        for (Integer cityId : citiesId) {
            System.out.println("\n ---- ----- ----");
            System.out.println("City No : " + citiesMap.get(cityId).getCityId());
            System.out.println("City Name : " + citiesMap.get(cityId).getCityName());
        }

    }
}
