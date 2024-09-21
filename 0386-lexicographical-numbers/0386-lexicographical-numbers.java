class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for(int i=1 ; i<=9 ; i++) {
            s.append(Integer.toString(i));
            dfs(s,ans,n);
            s.deleteCharAt(s.length()-1);
        }
        return ans;
    }
    
    public void dfs(StringBuilder s, List<Integer> ans, int n) {
        int num = Integer.parseInt(s.toString());
        if(num>n) return;
        ans.add(num);
        for(int i=0;i<=9;i++) {
            s.append(Integer.toString(i));
            dfs(s,ans,n);
            s.deleteCharAt(s.length()-1);
        }
    }
}


class TrieNode {
    TrieNode[] children;
    boolean isEndOfNum;
    TrieNode () {
        children = new TrieNode[10];
        isEndOfNum = false;
    }
} 

class Trie {
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    //insert function;
    public void insert(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray()) {
            int index = ch-'0';
            if(node.children[index]==null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfNum = true;
    }
    
    //search function 
    public  boolean search(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray()) {
            int index = ch - '0';
            if(node.children[index] == null) return false;
            node  = node.children[index];
        }
        return node.isEndOfNum;
    }
    
    //Starts with prefix
    public  boolean startsWith(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray()) {
            int index = ch - '0';
            if(node.children[index] == null) return false;
            node  = node.children[index];
        }
        return true;
    }
    
    
}