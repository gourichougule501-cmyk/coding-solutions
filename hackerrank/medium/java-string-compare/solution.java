

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        //String[] subs = new String[s.length()];
        for(int i=0;i<=s.length()-k;i++){
            String  subs =s.substring(i,k+i);
        if(subs.compareTo(smallest)<0){
            smallest = subs;
        } 
        if(subs.compareTo(largest)>0){
            largest = subs;
        }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

