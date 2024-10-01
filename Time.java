package assignment;

public class Time {
   
    private int hr;
    private int min;
    private int sec;

    public Time() {
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }

    
    public Time(int hr, int min, int sec) {
        if (isValidTime(hr, min, sec)) {
            this.hr = hr;
            this.min = min;
            this.sec = sec;
        } else {
            System.out.println("Invalid time. Setting time to default (00:00:00).");
            this.hr = 0;
            this.min = 0;
            this.sec = 0;
        }
    }

  
    private boolean isValidTime(int hr, int min, int sec) {
        return hr >= 0 && hr < 24 && min >= 0 && min < 60 && sec >= 0 && sec < 60;
    }


    public void displayTime() {
        System.out.printf("Time: %02d:%02d:%02d\n", hr, min, sec);
    }

    public int getHr() {
        return hr;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }


    public void setTime(int hr, int min, int sec) {
        if (isValidTime(hr, min, sec)) {
            this.hr = hr;
            this.min = min;
            this.sec = sec;
        } else {
            System.out.println("Invalid time. Time not updated.");
        }
    }

   
}