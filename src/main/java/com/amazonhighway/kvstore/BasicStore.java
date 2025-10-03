package com.amazonhighway.kvstore;
import java.util.concurrent.ConcurrentHashMap;
public class BasicStore {
    ConcurrentHashMap<String,String>store;
    public BasicStore(){
        store=new ConcurrentHashMap<>();
    }
    public String get(String key){
        return store.get(key);
    }
    public void put(String key,String value){
            store.put(key,value);
    }
    public String delete(String key){
            return store.remove(key);
    }
}
