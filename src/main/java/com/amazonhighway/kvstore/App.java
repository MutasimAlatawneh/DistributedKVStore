package com.amazonhighway.kvstore;
public class App {
    public static void main(String[] args){
        BasicStore store = new BasicStore();
        store.put("name", "Motasem");
        System.out.println("name: " + store.get("name"));
        store.delete("name");
        System.out.println("name after delete: " + store.get("name"));

    }

}