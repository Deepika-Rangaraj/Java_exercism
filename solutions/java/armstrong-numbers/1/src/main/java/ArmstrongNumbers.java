class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int num = numberToCheck;
        int count=String.valueOf(Math.abs(numberToCheck)).length();
        int number=0;
        while (num !=0){
            int digit =num %10;
            number+= Math.pow(digit,count);
            num /=10;
        }
        if (numberToCheck==number){
            return true;
        }
        else{
            return false;
        }

    }

}
