class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        for(int i  = 0; i < s1.length ; i++){
            if(s1[i] != t1[i])
                return false;
        }

        return true;

    //     if(s.length() != t.length())
    //         return false;

    //     Map<Character,Integer> sCounter = new HashMap<>();
    //     Map<Character,Integer> tCounter = new HashMap<>();

    //     for(char c : s.toCharArray()){
    //         sCounter.merge(c,1,Integer::sum);
    //     }

    //     for(char c : t.toCharArray()){
    //         tCounter.merge(c,1,Integer::sum);
    //     }

    //    for(Map.Entry<Character,Integer> entry: sCounter.entrySet()){
    //         if(!entry.getValue().equals(tCounter.get(entry.getKey())))
    //             return false;
    //     };

    //     return true;
    }
}
