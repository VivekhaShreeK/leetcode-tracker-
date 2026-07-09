// Last updated: 7/9/2026, 9:50:29 AM
class Solution {
    public int dayOfYear(String date) {
        int[] leap = {31,29,31,30,31,30,31,31,30,31,30,31};
        int[] notLeap = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        boolean isLeap = false;
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            isLeap = true;
        }
        int[] days;
        if(isLeap) {
            days = leap;
        }
        else {
            days = notLeap;
        }
        int daysYear = 0;
        for(int i = 0; i < month - 1; i++) {
            daysYear += days[i];
        }
        daysYear += day;
        return daysYear;
    }
}