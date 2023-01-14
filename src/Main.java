public class Main {
    public static void main(String[] args) {
        String colonyName = "Haberdasher";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        double mealsConsumedPerDay = 0.75;
        int landingProcessDuration = 2;

        //begin landing process
        meals -= mealsConsumedPerDay * shipPopulation * landingProcessDuration;
        System.out.println("After completing the landing process, the " + colonyName + " colony only has "
                + meals + " meals left");

        //an extra crate of food is found, increasing meals by 50%!
        meals *= 1.5;
        System.out.println("An extra crate of food was discovered! Food reserves increased to " + meals + " meals.");

        //5 babies were born on the ship during the landing process
        shipPopulation += 5;

        //the ship is coming into its final descent
        String landingLocation = "The Plain";
        if(landingLocation.equalsIgnoreCase("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain.");
        }

        try {
            landing = landingCheck(50);
        } catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for(int minute = 0; minute <= minutesLeft; minute++){
            if(minute % 2 == 0 && minute % 3 == 0){
                System.out.println("Keep Center");
            } else if (minute % 2 == 0){
                System.out.println("Right");
            } else if (minute % 3 == 0){
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}