class Solution {
    public int maxArea(int[] height) {
       /*int water;
        int width,ans=0;
        for(int i=0;i<height.length;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                width=j-i;
               int h=Math.min(height[i],height[j]);
                water=width*h;
              ans=Math.max(water,ans);
            }
        }
        return ans;        
    }
}*/
int ans=0;
int start=0;
int end=height.length-1;
while(start<end){
int width=end-start;
int h =Math.min(height[start],height[end]);
int water=width*h;
ans = Math.max(ans,water);
if(height[start]<height[end])
{
    start++;
}else
{
    end--;
}
}
return ans;
}}