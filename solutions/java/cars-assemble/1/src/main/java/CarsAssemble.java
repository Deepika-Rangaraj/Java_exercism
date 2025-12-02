public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double prodrate;
        if (speed<=4){
            prodrate=speed*221;
        }
        else if (speed >4 && speed <9){
            prodrate=speed*221*0.9;
        }
        else if (speed==9){
            prodrate=speed*221*0.8;
        }
        else{
            prodrate=speed*221*0.77;
        }
        return prodrate;
    }

    public int workingItemsPerMinute(int speed) {
        double prodrate;
        if (speed<=4){
            prodrate=speed*3.7;
        }
        else if (speed >4 && speed <9){
            prodrate=speed*3.7*0.9;
        }
        else if (speed==9){
            prodrate=speed*3.7*0.8;
        }
        else{
            prodrate=speed*3.7*0.77;
        }
        int prodratemin = (int) prodrate;
        return prodratemin;
    }
}
