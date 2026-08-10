class Solution {

    private boolean isVowel(char c){
        return c=='a' ||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int ans=0;
        int count=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(isVowel(c))
                count++;
        }
        ans=Math.max(ans,count);
        for(int i=k;i<s.length();i++){
            char c=s.charAt(i);
            if(isVowel(c))
                count++;
            char d=s.charAt(i-k);
            if(isVowel(d))
                count--;
            ans=Math.max(ans,count);
        }
        return ans;
    }
}