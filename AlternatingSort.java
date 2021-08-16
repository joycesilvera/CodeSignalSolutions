boolean alternatingSort(int[] a) {
    int l = 0, r = a.length-1, index = 0;
    int [] b = new int[a.length];
    
    if(a.length % 2 == 0){
            while(l < r){
        int x = a[l++];
        int y = a[r—];
        

            
        b[index++] = x;
        b[index++] = y;
        
    }
    }
    else{
        while(l < r){
        int x = a[l++];
        int y = a[r—];
        

            
        b[index++] = x;
        b[index++] = y;
        
       }
       b[index++] = a[l++];
    }
    

   // System.out.println(b[0]);
    for(int I = 1;  I < b.length; I++){
       // System.out.println(b[I]);
        if( b[I] <= b[i-1])
            return false;
    }
        
        
    return true;
}
