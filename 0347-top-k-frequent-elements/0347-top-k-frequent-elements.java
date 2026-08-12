class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : nums)
            map.put(num,map.getOrDefault(num,0)+1);
        List<Integer> list=new ArrayList<>();
        for(int num : map.values())
            list.add(num);
        Collections.sort(list);
        int cutoffFrequency=list.get(list.size()-k);
        int[] result=new int[k];
        int index=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue()>=cutoffFrequency){
                result[index++]=entry.getKey();
            }
        }
        return result;
    }
}