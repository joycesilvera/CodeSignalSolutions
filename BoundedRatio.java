boolean[] boundedRatio(int[] a, int l, int r) {
boolean[] b = new boolean[a.length];

for(int i = 0; i < a.length; i++){
    if(isBounded(a[i], i, l, r))
        b[i] = true;
  
    }
return b;
}

boolean isBounded(int original, int idx , int b, int c){
    
    for(int i = b; i <= c; i++){
        if((i * (idx+1)) == original){
            return true;
        }
    }
    return false;
}



/*
You are given an array of integers a and two integers l and r. You task is to calculate a boolean array b, where b[I] = true if there exists an integer x, such that a[I] = (I + 1) * x and l ≤ x ≤ r. Otherwise, b[I] should be set to false.



Input:
a: [8, 5, 6, 16, 5]
l: 1
r: 3
Expected Output: 
[false, false, true, false, true]

*/
