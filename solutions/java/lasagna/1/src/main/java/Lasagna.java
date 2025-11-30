public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int time = 40;
        return time;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time){
        int remining = expectedMinutesInOven() - time;
        return remining;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int num){
        int timeTaken = num*2;
        return timeTaken;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int num, int time){
        int total = preparationTimeInMinutes(num)+time;
        return total;
    }  

}
