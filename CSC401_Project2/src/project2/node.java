package project2;

public class node<K,V> {
    K key;
    V value;
    node<K,V> next;

    public node(K key, V value, node<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
