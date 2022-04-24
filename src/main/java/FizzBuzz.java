public class FizzBuzz {
    public String play(int adad) {

        if (isDevisbleBy3(adad) && isDevisblBy5(adad)){
            return "fizz Buzz";
        }
        if(isDevisbleBy3(adad)){
            return "fizz";
        }
        if(isDevisblBy5(adad)){
            return "fuzz";
        }

        return String.valueOf(adad);
    }

    private boolean isDevisbleBy3(int adad) {
        return adad % 3 == 0;
    }

    private boolean isDevisblBy5(int adad) {
        return adad % 5 == 0;
    }
}
