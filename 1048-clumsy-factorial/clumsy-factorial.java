class Solution {
    public int clumsy(int n) {
        Deque<Integer>stack=new ArrayDeque<>();
        stack.push(n);
        int op=0;
        for(int i=n-1;i>0;i--){
            switch (op){
                case 0:stack.push(stack.pop()*i);break;
                case 1:stack.push(stack.pop()/i);break;
                case 2:stack.push(i);break;
                case 3:stack.push(-i);break;
            }
            op=(op+1)%4;
        }
        int result=0;
        while(!stack.isEmpty())result+=stack.pop();
        return result;
    }
}