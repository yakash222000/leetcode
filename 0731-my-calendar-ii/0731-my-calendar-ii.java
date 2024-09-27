class MyCalendarTwo {
    private List<int[]> bookings;

    public MyCalendarTwo() {
        bookings = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for (int[] interval : bookings) {
            int a = interval[0], b = interval[1];
            if (start < b && end > a) {
                int newStart = Math.max(a, start);
                int newEnd = Math.min(b, end);
                if (check(newStart, newEnd)) {
                    return false; 
                }
            }
        }

        bookings.add(new int[] {start, end});
        return true;  // Booking successful
    }

    private boolean check(int start, int end) {
        int overlapCount = 0;

        for (int[] interval : bookings) {
            int a = interval[0], b = interval[1];

            if (start < b && end > a) {
                overlapCount++;
                if (overlapCount == 2) {
                    return true;  
                }
            }
        }

        return false; 
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */