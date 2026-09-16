
      
void main() {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "mangesh");
        map.put(102, "pawan");
        map.put(103, "gaurav");
        map.put(104, "mangesh");

        //size of the map
        System.out.println("Map sizen " + map.size());

        //map is empty or not
        System.out.println("Map is empty or not " + map.isEmpty());

        //map contains or not 
        System.out.println("map contains value or not " + map.containsValue("mangesh"));

        // get the value 
        System.err.println("get the value " + map.get(101));

        //remove the key inside the map
        //  map.remove(101);
        // System.out.println("remove the value"+map);
        //keyset return all the list only store inside the set only 
        Set<Integer> set = map.keySet();
        System.out.println("key set values is " + set);

        //map values  it can return the values some times duplicate values is come that why return the collection
        Collection<String> c = map.values();
        System.out.println("values " + c);

        //map key values it return key and values both entry is interface  
        Set<Map.Entry<Integer, String>> ls = map.entrySet();
        System.out.println("key value " + ls);

        //get method to get the value
        System.out.println(map.get(101));

        //get the value the value not present then give the output default
        System.out.println(map.getOrDefault(100, "unknown"));

        //put method alternative method putIfAbsent store the value inside the map while after if absent then stored only  not replace
        //put replace original method
        //putIfAbsent doent not replace
        System.out.println("put inside the map " + map.putIfAbsent(105, "dhiraj"));
        System.out.println(map);

//remove key value pair check both are same then remove
        map.remove(101, "mangesh");
        System.out.println(map);

        //replace the value
        map.replace(102, "shubham");
        System.out.println(map);


    }
