class Solution {
    public class Point implements Comparable<Point> {
		private int x;
		private int height;

		public Point(int x, int height) {
			this.x = x;
			this.height = height;
		}

		public int compareTo(Point o) {
			if (this.x != o.x) {
				return this.x - o.x;
			} else {
				return this.height - o.height;
			}
		}
	}
    
	public List<List<Integer>> getSkyline(int[][] buildings) {
		List<Point> points = new ArrayList<>();
		for(int[]point : buildings) {
			points.add(new Point(point[0], -point[2]));
			points.add(new Point(point[1], point[2]));
		}
	
		Collections.sort(points);
		List<List<Integer>> ans = new ArrayList<>();
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		priorityQueue.add(0);
		for (Point point : points) {
			int top = priorityQueue.peek();
			if (point.height < 0) {
				priorityQueue.add(-point.height); 
			} else { 
				priorityQueue.remove(point.height);
			}
            
			if (top != priorityQueue.peek()) {
				List<Integer> curr = new ArrayList<>();
				curr.add(point.x);
				curr.add(priorityQueue.peek());
				ans.add(curr);
			}
		}
		return ans;
	}
}