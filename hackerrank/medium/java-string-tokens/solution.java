

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a= a.toLowerCase();     //overwrite
         b = b.toLowerCase();       //overwrite
            //return s.equals(p);
            if(a.length() != b.length()){
                return false;
            }
    
            
    int[] freq = new int[26];
    
    for(int i=0;i<a.length();i++){
        freq[a.charAt(i)-'a']++;
        freq[b.charAt(i)-'a']--;
    }
    for(int i=0;i<26;i++){
        if(freq[i] != 0){
            return false;
        }
    }
    return true;
    
    }
    
    

