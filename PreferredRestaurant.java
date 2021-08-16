class PreferredRestaurant{
static int preferredRestaurant(int[][] preferences) {
    int majority = preferences.length, key = 0;
    
    HashMap<Integer, Integer> map = new HashMap<>();
    HashSet<Integer> keys = new HashSet<>();
    HashSet<Integer> vals = new HashSet<>();
    
    for(int i = 0; i < preferences[0].length; i++){
        for(int j = 0; j < preferences.length; j++){
            //person1 
            map.put(preferences[j][i], map.getOrDefault(preferences[j][i],0)+1);
            key = preferences[j][i];
            

            if(map.get(key) == majority){
                
                keys.addAll(map.keySet());
                System.out.println("keys:"+keys.toString());
                vals.addAll(map.values());
                System.out.println("vals:"+vals.toString());
                if(keys.size() > 1 && vals.size() <= 2)
                    return -1;
                else
                    return key;
            }        
            
        }
    }
    return -1;
}

public static void main(String [] args){
}

}


/*
preferences = [[1, 2, 3, 4],
               [3, 1, 4, 2],
               [4, 2, 1, 3]]


the output should be preferredRestaurant(preferences) = 1.

Restaurant 1 is friend 1's first choice; they wouldn't prefer any other restaurant.
Friend 2 would only prefer restaurant 3 over restaurant 1.
Friend 3 would prefer either restaurant 4 or 2 over restaurant 1.
Even though friends 2 and 3 have other preferences, there's no one other restaurant that they'd both prefer to go to. So the friends will choose restaurant 1.


preferences = [[1, 2, 3],
               [2, 3, 1],
               [3, 1, 2]]
the output should be preferredRestaurant(preferences) = -1.



preferences:
[[3,5,2,6,10,1,7,8,4,9], 
 [8,7,2,4,10,1,5,3,6,9], 
 [7,3,2,10,6,4,1,9,5,8]] 

Output 7 instead of 2

Input:
preferences:
[[1,2,3], 
 [2,3,1], 
 [3,1,2]]
Output:
3
Expected Output: -1



*/


//Test cases: 6/8
