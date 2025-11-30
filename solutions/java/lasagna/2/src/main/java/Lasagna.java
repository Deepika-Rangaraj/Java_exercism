public class Lasagna {
    public int expectedMinutesInOven(){
        int time = 40;
        return time;
    }
    public int remainingMinutesInOven(int time){
        int remining = expectedMinutesInOven() - time;
        return remining;
    }
    public int preparationTimeInMinutes(int num){
        int timeTaken = num*2;
        return timeTaken;
    }
    public int totalTimeInMinutes(int num, int time){
        int total = preparationTimeInMinutes(num)+time;
        return total;
    }  

}
