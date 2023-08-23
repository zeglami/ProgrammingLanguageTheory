package me.zegit.other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapPlayGround {

  public static void main(String[] args) {
    //
      Map mapCountry= new HashMap<String,String>();
      mapCountry.put("MA","Maroc");
      mapCountry.put("FR","France");

    System.out.println(mapCountry.get("FR"));

      mapCountry.forEach((k,v) -> System.out.println(k + "=" + v));




      Set<String> hash_Set = new HashSet<>();

      // Adding elements to the Set
      // using add() method
      hash_Set.add("Geeks");
      hash_Set.add("For");
      hash_Set.add("Geeks");
      hash_Set.add("Example");
      hash_Set.add("Set");

      System.out.println(hash_Set);


  }
}
