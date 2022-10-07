/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        for(int[] i : ans) {
                Arrays.fill(i,-1);
        } 
        int rowcount=0,columncount=0,i=0,j=0,rowhigh=m,columnhigh=n;
        while(head!=null){
                while(j<columnhigh && head!=null) {
                        ans[i][j++]=head.val;
                        head=head.next;
                }
                j--;
                i++;
                rowcount++;
                if(head==null) break;
                while(i<rowhigh && head!=null) {
                        ans[i++][j]=head.val;
                        head=head.next;
                }
                i--;
                j--;
                columnhigh--;
                if(head==null) break;
                while(j>=columncount && head!=null) {
                        ans[i][j--]=head.val;
                        head=head.next;
                }
                j++;
                i--;
                rowhigh--;
                if(head==null) break;
                while(i>=rowcount && head!=null) {
                        ans[i--][j]=head.val;
                        head=head.next;
                }
                i++;
                j++;
                columncount++;       
        }
        return ans;
    }
}