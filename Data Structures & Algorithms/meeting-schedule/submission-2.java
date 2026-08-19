/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        //loop through each meeting
        //check the other meetings
        //overlap = the earlier ending time is > later staring type
        for(int i = 0; i < intervals.size(); i++) {
            Interval a = intervals.get(i);
            for(int j = i + 1; j < intervals.size(); j++) {
                //overlap
                Interval b = intervals.get(j);
                if(Math.min(a.end, b.end) > Math.max(a.start, b.start)){
                    return false;
                }
            }
        }

        return true;
    }
}
