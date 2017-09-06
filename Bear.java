package com.example.user.hashmap;
import java.util.HashMap;
import java.util.*;

/**
 * Created by user on 05/09/2017.
 */

public class Bear {
    private HashMap <String, Integer> journal;
    private ArrayList<Fish> belly;

    public Bear(){
        belly = new ArrayList<>();
        journal = new HashMap<>();
        initJournal();
    }

    public HashMap<String, Integer> getJournal(){
        return this.journal;
    }


    public void eat(String day, Fish fish){
        belly.add(fish);
        if (!journal.containsKey(day)){
            int newCount = journal.get(day) + 1;
            journal.put(day, newCount);
        }
    }

    private void initJournal(){
        journal.clear();
        journal.put("Monday", 0);
        journal.put("Tuesday", 0);
        journal.put("Wednesday", 0);
        journal.put("Thursday", 0);
        journal.put("Friday", 0);
        journal.put("Saturday", 0);
        journal.put("Sunday", 0);
    }

    public void resetJournal(){
        for (String day: journal.keySet()){
            journal.put(day, 0);
        }
    }

}
