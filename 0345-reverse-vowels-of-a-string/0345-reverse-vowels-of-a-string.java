class Solution {
    public String reverseVowels(String s) {
        char[] ss=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end && !isVowel(ss[end])){
                end--;
            }
            while(start<end && !isVowel(ss[start])){
                start++;
            }

            char temp=ss[start];
            ss[start]=ss[end];
            ss[end]=temp;

            start++;
            end--;
        }

        return new String(ss);
    }

    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ;
    }
}