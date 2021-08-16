int[] longestInversionalSubarray(int[] a, int[] b, int[] c) {
    HashSet<Integer> setB = new HashSet<>();
    HashSet<Integer> setC = new HashSet<>();
    int [] result = new int[2];
    for(int I : b)
        setB.add(i);
    
    for(int I : c)
        setC.add(i);
    
    int max = Integer.MIN_VALUE;

    int I = 0, j = 0;

    
    while(I < a.length){
        j = I;
        while(j < a.length && setB.contains(a[j]) && !setC.contains(a[j])){
            j++;
            if(j-i+1 > max){
                max = Math.max(max, j-i + 1);
                result[0] = I;
                result[1] = j;
            }
        }
        I++;
    }
    
    return Arrays.copyOfRange(a, result[0], result[1]);
}
