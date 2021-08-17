boolean alternatingSort(int[] a) {
    int l = 0, r = a.length-1, index = 0;
    int [] b = new int[a.length];
    
    
    while(l < r){
        int x = a[l++];
        int y = a[r—];
        
        b[index++] = x;
        b[index++] = y;
        
    }
   
    if(a.length % 2 != 0){
       b[index++] = a[l++];
     }
    

    for(int i = 1;  i < b.length; i++){
        if( b[i] <= b[i-1])
            return false;
    }
        
        
    return true;
}
