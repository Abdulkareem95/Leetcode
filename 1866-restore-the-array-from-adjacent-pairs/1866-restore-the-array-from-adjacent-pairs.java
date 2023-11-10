class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {

        HashMap<Integer,List<Integer>> hm =new HashMap<>();
        int [] ans = new int [adjacentPairs.length+1];
        for(int i=0;i<adjacentPairs.length;i++){
            int key = adjacentPairs[i][0];
            int val = adjacentPairs[i][1];
            add(hm,key,val);
            add(hm,val,key);
           
        }
        System.out.println(hm);
        int start = 0;
        for(Map.Entry<Integer,List<Integer>> x:hm.entrySet()){
            if(hm.get(x.getKey()).size()==1)
            {
                start = x.getKey();
                break;
            }
        }
        System.out.println(start);
        ArrayList<Integer> l = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        dfs(start,hm,l,set);
        System.out.println(l);
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;

        
    }
    public static void dfs(int start,HashMap<Integer,List<Integer>> hm,ArrayList<Integer> l,HashSet<Integer> set){
        l.add(start);
        set.add(start);
        for(Integer x:hm.get(start)){
            if(!set.contains(x)){
                dfs(x,hm,l,set);
            }

        }
    }
    public static void add(HashMap<Integer,List<Integer>>hm,int key,int val){
         if(hm.containsKey(key)){
                hm.get(key).add(val);
            }else{
                hm.put(key,new ArrayList<>());
                hm.get(key).add(val);
            }
    }
}