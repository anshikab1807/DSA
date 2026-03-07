class Solution{
public int lra(int[] h){
int n=h.length;
Stack<Integer>s=new Stack<>();
s.push(-1);
int[] p=new int[n];
int[] nx=new int[n];
for(int i=0;i<n;i++){
while(s.peek()!=-1&&h[s.peek()]>=h[i])s.pop();
p[i]=s.peek();
s.push(i);
}
s.clear();
s.push(-1);
for(int i=n-1;i>=0;i--){
while(s.peek()!=-1&&h[s.peek()]>=h[i])s.pop();
nx[i]=(s.peek()==-1)?n:s.peek();
s.push(i);
}

int m=0;
for(int i=0;i<n;i++){
int ht=h[i];
int w=nx[i]-p[i]-1;
m=Math.max(m,ht*w);
}
return m;
}

public int maximalRectangle(char[][] a){
int r=a.length,c=a[0].length;
int[] h=new int[c];
int ans=0;

for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
if(a[i][j]=='1')h[j]++;
else h[j]=0;
}
ans=Math.max(ans,lra(h));
}
return ans;
}
}