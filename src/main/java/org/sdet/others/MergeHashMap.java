package org.sdet.others;

import java.util.*;

public class MergeHashMap {

    public static List<String> getSortedUniqueList(Collection<String> list) {
        Set<String> uniqueSet = new HashSet<>(list);
        List<String> sortedList = new ArrayList<>(uniqueSet);
        sortedList.sort(Comparator.comparingInt(s -> Integer.parseInt(s.split("-")[1])));
        return sortedList;
    }

    public static TreeMap<String, List<String>> mergeMaps(HashMap<String, List<String>> m1, HashMap<String, List<String>> m2) {
        TreeMap<String, List<String>> result = new TreeMap<>();

        // 1. Copy and clean everything from map1
        for (Map.Entry<String, List<String>> entry : m1.entrySet()) {
            result.put(entry.getKey(), getSortedUniqueList(entry.getValue()));
        }

        // 2. Merge map2 entries, ensuring the new list is already cleaned/sorted in case it's a new key
        for (Map.Entry<String, List<String>> entry : m2.entrySet()) {
            List<String> processedNewList = getSortedUniqueList(entry.getValue()); // Fix: Sort it first!

            result.merge(entry.getKey(), processedNewList, (existingList, newList) -> {
                List<String> combined = new ArrayList<>(existingList);
                combined.addAll(newList);
                return getSortedUniqueList(combined);
            });
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        HashMap<String, List<String>> map1 = new HashMap<>();
        HashMap<String, List<String>> map2 = new HashMap<>();

        List<String> list1 = Arrays.asList("jira-2", "jira-1");
        List<String> list2 = Arrays.asList("jira-12", "jira-20");
        List<String> list3 = Arrays.asList("jira-20", "jira-0");
        List<String> list4 = Arrays.asList("jira-30", "jira-11");

        map1.put("Sahil", list1);
        map1.put("Vicky", list2);
        map2.put("Vicky", list3);
        map2.put("Kashyap", list4);

        mergeMaps(map1, map2);
    }
}
