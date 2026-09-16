
import java.util.HashMap;
import java.util.Map;

class map<K,V>
{
  static class Node<K,V>
  {
      private K key;
      private V value;
      private int hash;
      private Node<K,V> next;


      Node(K key,V value)
      {
        this.key=key;
        this.value=value;
        this.hash=key.hashCode();
        this.next=null;

      }

  }
    private Node<K, V>[] table;

  public boolean add(K key)
  {
    Map<K,Object> map1=new HashMap();
    return (map1.put(key,new Object())==null); 
  }

  public void put(K key,V Value)
  {
    int  hash=key.hashCode();
    int index=hash%table.length;
    

  }
}