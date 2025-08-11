package stopwatch;

public class StopWatch {
    int minutes;
    int hours;
    int days;
    boolean isWorkingTime;

    public void record(int minutes) {
        if (minutes >= 0) {
            this.minutes = minutes;
        }
        if(this.minutes >= 60){
            this.hours = this.minutes / 60;
            this.minutes = this.minutes % 60;
        }

        int hoursPerDay = 24;
        if(isWorkingTime)
            hoursPerDay = 8;

        if(this.hours >= hoursPerDay){
            this.days = this.hours / hoursPerDay;
            this.hours = this.hours % hoursPerDay;
        }
    }

    public int getMinutes() {
        return minutes;
    }
    public int getHours() {
        return hours;
    }
    public int getDays() {
        return days;
    }
    public void setWorkingTime(boolean isWorkingTime) {
        this.isWorkingTime = isWorkingTime;
    }
}
