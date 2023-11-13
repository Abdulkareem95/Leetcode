class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> l = new ArrayList<Character>();
        char ch;
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                l.add(ch);
            }
        }
        Collections.sort(l);
    int k = 0;
        // System.out.println(l);
        char [] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
             ch = arr[i];
                       if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

                           arr[i]=l.get(k++);
                       }

        }
        String ans =  "";
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;

        
        
        
    }
}