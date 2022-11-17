class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1=(ax2-ax1)*(ay2-ay1),area2=(bx2-bx1)*(by2-by1);
        int xmax=Math.max(ax1,bx1);
        int ymax=Math.max(ay1,by1);
        int xmin=Math.min(ax2,bx2);
        int ymin=Math.min(ay2,by2); 
        int xintersect=xmin-xmax,yintersect=ymin-ymax;
        if(xintersect>0 && yintersect>0) return area1+area2-xintersect*yintersect;
        return area1+area2;
        
    }
}