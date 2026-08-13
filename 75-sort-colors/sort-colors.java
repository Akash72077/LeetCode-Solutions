class Solution {
    public void sortColors(int[] nums) {
    int n= nums.length;
    int Zc=0;
    int Oc=0;
    int Tc=0;
    for(int i=0; i<n; i++){
        if(nums[i]==0){
            Zc++;
        }else if(nums[i]==1){
            Oc++;
        }else{
            Tc++;
        }
    }
    for(int i=0; i<Zc; i++){
            nums[i]=0;
    }
    for(int i=Zc; i<Zc+Oc; i++){
            nums[i]=1;
    }
    for(int i=Zc+Oc; i<Zc+Oc+Tc; i++){
            nums[i]=2;
    }
    
    }
}