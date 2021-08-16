boolean shopInAndOutEvents(String[][] events) {
    HashSet<String> set = new HashSet<>();
    HashMap<String, Integer> map = new HashMap<>();
    
    if(events.length < 2){
        if(events[0][1].equals(“out”))
            return false;
    }
    
    for(String[] log : events){
        
        if(log[1].equals(“in”)){
            map.put(log[0], map.getOrDefault(log[0], 0)+1);
            if(map.get(log[0]) > 1){
                return false;
            }
            set.add(log[0]);
        }
        else{
            if(set.contains(log[0])){
                set.remove(log[0]);
                map.put(log[0], map.getOrDefault(log[0], 0)-1);
            }
        }

    }
    
    return set.isEmpty();
}
