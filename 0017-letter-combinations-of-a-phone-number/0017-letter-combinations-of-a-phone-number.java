class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        String str = "";
        int index = 0;
       List<String> list = new ArrayList<>();
       if(digits.length()==0)
            return list;
        list.add("");
        for(int i=0;i<digits.length();i++){
            list = letterc(hm.get(Integer.parseInt(""+digits.charAt(i))),list);
        }
        return list;

   
    }
    public static List<String> letterc(String digit,List<String> l){
        List<String> res = new ArrayList<>();
        for(int i=0;i<digit.length();i++){
            for(String x: l){
                res.add(x+digit.charAt(i));
            }
        }
        return res;
    }
}