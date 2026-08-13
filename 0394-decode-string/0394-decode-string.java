class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack=new Stack<>();
        Stack<StringBuilder> stringStack=new Stack<>();

        StringBuilder currentString=new StringBuilder();
        int currentNumber=0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                currentNumber=currentNumber*10+(c-'0');
            }else if(c=='['){
                countStack.push(currentNumber);
                stringStack.push(currentString);

                currentNumber=0;
                currentString=new StringBuilder();
            }else if(c==']'){
                StringBuilder decodedString=stringStack.pop();
                int repeatedTimes=countStack.pop();

                for(int i=0;i<repeatedTimes;i++){
                    decodedString.append(currentString);
                }

                currentString=decodedString;
            }else{
                currentString.append(c);
            }
        }
        return currentString.toString();
    }
}