package me.zegit.other;

import java.util.ArrayList;
import java.util.Vector;

public class ListPlayGround {

    public static void main(String[] args) {
        int[] list = new int[5];
        list[0] = 1;
        list[1] = 2;


        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        //-------------------------------------------
        System.out.println("List:-------------------------------------------");
        //-------------------------------------------
        java.util.List<String> listCountry = new ArrayList<>();
        listCountry.add("France");
        listCountry.add("Germany");

        for (int i = 0; i < listCountry.size(); i++) {
            System.out.println(listCountry.get(i));
        }


        //-------------------------------------------
        System.out.println("ArrayList:-------------------------------------------");
        //-------------------------------------------
        ArrayList<String> listPays = new ArrayList<>();
        listPays.add("US");
        listPays.add("Canada");

        for (int i = 0; i < listPays.size(); i++) {
            System.out.println(listPays.get(i));
        }

        for (String el:listPays
             ) {
            System.out.println(el);
        }

        //-------------------------------------------
        System.out.println("Vector:-------------------------------------------");
        //-------------------------------------------
        Vector<String> listFruits = new Vector<>();
        listFruits.add("Fraise");
        listFruits.add("Pomme");

        for (int i = 0; i < listPays.size(); i++) {
            System.out.println(listFruits.get(i));
        }

        for (String f : listFruits
        ) {
            System.out.println(f);

        }


    }
}
