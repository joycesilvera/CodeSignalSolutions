class EraseOneDigit{
    boolean eraseOneDigit(String firstnum, String secondnum, String thirdnum) {
      if(Integer.parseInt(firstnum) + Integer.parseInt(secondnum) == Integer.parseInt(thirdnum)){
          return true;
      }

      List<Integer> output = new ArrayList<>();
      int n = firstnum.length();
      for(int I =0; I < n; I++){
          String curr = firstnum.substring(0,i) + firstnum.substring(I+1,n);


          if(Integer.parseInt(curr) == 0)
              output.add(Integer.parseInt(curr));
          else if(curr.charAt(0) != ‘0’){
              output.add(Integer.parseInt(curr));
          }

      }

      for(int s : output){
          //System.out.println(s);
          if(s+ Integer.parseInt(secondnum) == Integer.parseInt(thirdnum)){
             // System.out.println(“here for: “+s);
              return true;
          }

      }

      return false;
  }
}
//Fails one hidden test case
