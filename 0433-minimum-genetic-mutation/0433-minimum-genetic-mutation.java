class Solution {
    public int minMutation(String start, String end, String[] bank) {
             Queue<String> q = new LinkedList<>(); // for standard BFS
        
        Set<String> vis = new HashSet<>(); // if a string as a node is visited or not
        
        q.add(start);
        vis.add(start); // init cond
        
        int steps = 0;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int j=0;j<size;j++)
            {
                
                String node = q.remove();
                if(node.equals(end)) 
                {
                    return steps;
                }
                
                for(char ch : new char[]{'A','C','G','T'})
                {
                    for(int i=0;i<node.length();i++)
                    {
                        String neighbour = node.substring(0,i) + ch + node.substring(i+1); 
                        if(!vis.contains(neighbour) && Arrays.asList(bank).contains(neighbour))
                        {
                           
                            
                            q.add(neighbour);
                            vis.add(neighbour);
                            
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}