package LeetcodeDailyChallenge;

public class Main {

    public static void main(String[] args) {
    int hour = 12;
    int minute = 15;
        System.out.println(angleClock(hour,minute));
    }
    public static double angleClock(int hour, int minutes) {
        double hourDegree=0.0;
        if(hour == 12){
            hour=0;
        }
        double minutesDegree = (double)(6*minutes);
        double increment = (double)(0.5*minutes);

        hourDegree=(double)hour*30+increment;
        double DIFFERENCE= Math.abs(minutesDegree-hourDegree);
        if(DIFFERENCE>180){
            DIFFERENCE=360-DIFFERENCE;
        }
        return DIFFERENCE;
    }

}
