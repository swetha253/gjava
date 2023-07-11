public class TwoSum {
    int[] twosum(int[] nums,int target) {
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    int[] arr={i,j};
                    return arr;
                }
                
            }

        }
        throw new IllegalArgumentException("No two numbers add up to the tsrget sum ");

    }
    public static void main(String[] args){
        TwoSum obj=new TwoSum();
        int[] nums={1,4,7,5,3};
        int target=11;
        int[] r=obj.twosum(nums,target);
        for(int k=0;k<=r.length-1;k++){
        System.out.print(r[k]+" ");}

    }
}