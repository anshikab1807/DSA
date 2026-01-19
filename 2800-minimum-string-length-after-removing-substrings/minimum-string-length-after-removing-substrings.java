// class Solution {
//     public int minLength(String s) {
//         Stack<Character> st=new Stack<>();
//         // char arr=st.tocharArrray();
//        for(int i=0;i<s.length();i++){
//             if(!st.isEmpty() && st.peek()=='A' && st.peek() =='B'){
//             st.pop();
//             i-- ;
//             }
//             else if(!st.isEmpty() && st.peek()=='B' && st.peek() == 'A'){
//                 st.pop();
//                 i--;
//             } else if( !st.isEmpty() && st.peek()=='C' && st.peek() =='D'){
//                 st.pop();
//                 i--;
//             } else if(!st.isEmpty() && st.peek()=='D' && st.peek() == 'C'){
//                 st.pop();
//                 i--;
//             } else {
//                 return st.push(s.charAt(i));
//             }
//         } 
//         return st.size();
//     } 
// }
class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && ((st.peek() =='A' && ch =='B') || (st.peek() =='C' && ch=='D'))) {
                    st.pop();
                } else {
              st.push(ch);
        }
        }
        return st.size();
    }
}
