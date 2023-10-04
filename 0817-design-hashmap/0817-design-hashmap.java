class MyHashMap {
  public static  ArrayList<mycls> list ;
    public MyHashMap() {
   list = new ArrayList<>();

        
    }
    
    public void put(int key, int value) {
        boolean flag = false;
        int i=0;
        for( i=0;i<list.size();i++){
            if(list.get(i).key == key){
                flag = true;
                break;
            }
        }
        if(flag)
            list.remove(i);
        mycls obj = new mycls(key,value);
        list.add(obj);

        
    }
    
    public int get(int key) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).key==key)
                return list.get(i).val;
        }
        return -1;
        
    }
    
    public void remove(int key) {
         boolean flag = false;
        int i=0;
        for( i=0;i<list.size();i++){
            if(list.get(i).key == key){
                flag = true;
                break;
            }
        }
        if(flag)
            list.remove(i);
        
    }
}
class mycls{
    int key ;
    int val;
    mycls(int key,int val){
        this.key = key;
        this.val = val;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */