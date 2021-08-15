class StrictlyIncreasing{
    
    
    //Failing one test case
    //HINT : Return true if it is possible to obtain a strictly increasing array by applying the digit-swap operation at most once, and false otherwise.

static HashSet<Integer> set;

static boolean makeIncreasing(int[] numbers) {
    
    if(numbers.length == 0 || numbers == null)
        return false;
    if(numbers.length < 2 || isIncreasing(numbers))
        return true;

        
    
    
    for(int i = 1; i < numbers.length; i++){
        
        if(numbers[i] < numbers[i-1]){
            permutations(numbers[i-1]);
            
            for(int j : set){
                numbers[i-1] = j;
                System.out.println(j);
                if(isIncreasing(numbers))
                    return true;
            }
        }

    }
    return false;
    
}

static void permutations(int num){
    String number = num +"";
    
    set = new HashSet<>();
    for(int i = 0; i <= number.length(); i++){
        int curr = swap(num);
        set.add(curr);
        num = curr;
    }
    
}

static int swap(int number){
    char[] a = String.valueOf(number).toCharArray();
    for (int i = 0; i < a.length - 1; i += 2) {
        char tmp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = tmp;
    }
    number = Integer.parseInt(new String(a));
return number;
}

static boolean isIncreasing(int [] arr){
    for(int i = 1; i < arr.length; i++){
        if(arr[i] <= arr[i-1])
            return false;
    }return true;
}


public static void main(String [] args){
  int [] num1 = {1, 5, 10, 20};
  System.out.println(makeIncreasing(num1));
}
