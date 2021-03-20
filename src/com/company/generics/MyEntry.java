package com.company.generics;

import java.util.Map;
import java.util.Set;

public class MyEntry <K, V>{
    private Map<K, V> map;

    public MyEntry(Map<K, V> map) {
        this.map = map;
    }

    public void add(K key, V value){
        map.put(key, value);
    }
    public void remove(K key){
        map.remove(key);
    }
    public void removeByValue(V value){
        if(map.containsValue(value)) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (entry.getValue().equals(value)) {
                    map.remove(entry.getKey());
                    return;
                }
            }
        }
    }
    public void printKeys(){
        for (K key : map.keySet()){
            System.out.println(key);
        }
    }
    public void printValues(){
        for (V value : map.values())
            System.out.println(value);
    }
    public void printMap(){
        for(Map.Entry<K, V> entry : map.entrySet()){
            System.out.println(entry);
        }
    }

    public Map<K, V> getMap() {
        return map;
    }

    public void setMap(Map<K, V> map) {
        this.map = map;
    }
}
