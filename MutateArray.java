class MutateArray{
    
    //passed all test cases

int[] mutateTheArray(int n, int[] a) {
    int [] b = new int[a.length];
    
    for(int I = 0; I < a.length; I++){
        int x = i-1 < 0 ? 0 : a[i-1];
        int y = a[I];
        int z = I+1 >= a.length ? 0 : a[I+1];
        
        b[I] = x + y+ z;
    }
    
    return b;
}


}
