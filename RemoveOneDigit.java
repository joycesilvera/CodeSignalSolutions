int removeOneDigit(String s, String t) {
    int count1 = 0, count2 = 0;
    for(int I = 0;  I < s.length(); I++){
        if(Character.isDigit(s.charAt(i))){
            String subS = s.substring(0,i) + s.substring(I+1,s.length());
            if(checkDigitsSum(subS, t))
                count1++;
        }
    }
    
    for(int I = 0;  I < t.length(); I++){
        if(Character.isDigit(t.charAt(i))){
            String subT = t.substring(0,i) + t.substring(I+1,t.length());
            if(checkDigitsSum(s, subT))
                count2++;
        }
    }
    
    return count1 + count2;
}

boolean checkDigitsSum(String str1, String str2){
    
    return str1.compareTo(str2) < 0;
}
