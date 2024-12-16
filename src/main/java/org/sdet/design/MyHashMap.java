package org.sdet.design;


import java.util.LinkedList;

class MyHashMap {
    private static final int BUCKET_SIZE = 1000;
    private LinkedList<Node>[] buckets;

    private static class Node {
        int key;
        int value;
         Node(int k, int v){
            this.key = k;
            this.value = v;
        }
    }
    public MyHashMap(){
        buckets = new LinkedList[BUCKET_SIZE];
        for(int i = 0; i< BUCKET_SIZE; i++){
            buckets[i] = new LinkedList<>();
        }
    }
    private int getBucketIndex(int key) {
        return Integer.hashCode(key) % BUCKET_SIZE;
    }

    public void add(int key, int val){
     int index = getBucketIndex(key);
     LinkedList<Node> bucket = buckets[index];
     for(Node node: bucket){
         if(node.key == key)
             node.value = val;
         return;
     }
     Node n = new Node(key, val);
     bucket.add(n);
    }

    public int get(int key){
    int index  = getBucketIndex(key);
    LinkedList<Node> bucket = buckets[index];
    for(Node n: bucket){
        if(n.key == key)
            return n.value;
    }
    return -1;
     }
     public void remove(int key){
         int index = getBucketIndex(key);
         LinkedList<Node> bucket = buckets[index];
         bucket.removeIf(node -> node.key == key);
     }
}
