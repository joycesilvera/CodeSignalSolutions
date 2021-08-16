boolean[] boundedRatio(int[] a, int l, int r) {
boolean[] b = new boolean[a.length];

for(int I = 0; I < a.length; I++){
    if(isBounded(a[I], I, l, r))
        b[I] = true;
  
    }
return b;
}

boolean isBounded(int original, int idx , int b, int c){
    
    for(int I = b; I <= c; I++){
        if((I * (idx+1)) == original){
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
