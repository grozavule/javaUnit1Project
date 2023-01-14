import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){
        //Mars Rover boot up
        System.out.println("Mars Rover coming online...");
        System.out.println("Your bootup request will be handled in the order it was received.");
        System.out.println("Please wait. Your bootup request is very important to us.");
        System.out.println("Mars Rover is ready. Please enter your name for user authentication: ");
        String personName = Mars.scan.nextLine();

        System.out.println("Are you ready to explore the surface of Mars? (y/N)");
        String exploreInput = Mars.scan.nextLine();
        if(exploreInput.equalsIgnoreCase("y") || exploreInput.equalsIgnoreCase("yes")){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("You are a candy@$$. Get your butt out there anyway!");
        }

        //choose the number of crew members on the away team
        boolean validNumberofCrewMembersChosen = false;
        int crewMembersOnAwayTeam = 0;
        while(!validNumberofCrewMembersChosen){
            try {
                System.out.println("How many crew members will you take with you?");
                crewMembersOnAwayTeam = Integer.parseInt(Mars.scan.nextLine());

                if(crewMembersOnAwayTeam < 0){
                    System.out.println("Oh, so you're a wise guy, eh? Let's see how hard you can laugh when I jettison your @$$ into the vacuum of space!");
                } else if(crewMembersOnAwayTeam > 2){
                    System.out.println("Didn't you read the Mars Rover manual? There are only three total seats in the rover. I'll just log that two crew members will join you.");
                    crewMembersOnAwayTeam = 2;
                    validNumberofCrewMembersChosen = true;
                } else {
                    System.out.println("Technically, I'm supposed to force you to choose two crew members. No more no less. This time I'll make an exception.");
                    validNumberofCrewMembersChosen = true;
                }
            } catch(NumberFormatException e){
                System.out.println("Has your cabin been depressurized or something? You need to tell me the NUMBER of crew members who will join the Away team.");
                continue;
            }
        }

        //pick a snack for the expedition
        boolean snackChoiceWasMade = false;
        String snackChoice = "";
        while(!snackChoiceWasMade){
            System.out.println("You can bring one snack with you on the expedition. What would you like to bring?");
            snackChoice = Mars.scan.nextLine();
            if(snackChoice.length() == 0){
                System.out.println("Have you got rocks in your head? Choose a snack!");
                continue;
            } else if(snackChoice.contains("Coke")){
                System.out.println("Excellent choice! Nothing is better on the hot, dusty planet of Mars than a nice, cold can of Coke!");
            } else {
                System.out.println("I'll signal the galley to have your " + snackChoice + " ready for you.");
            }
            snackChoiceWasMade = true;
        }

        //pick a vehicle for the expedition
        boolean validVehicleNumberChosen = false;
        int vehicleChoice = 0;
        String chosenVehicleName = "";
        while(!validVehicleNumberChosen){
            System.out.println("Below is a list of the vehicles available for your expedition.");
            System.out.println("1.\tBattle Tank");
            System.out.println("2.\tVespa Scooter");
            System.out.println("3.\tTwin-Engine Hovercraft");
            System.out.println("4.\tTrusty, Rusty Pogo Stick");
            System.out.println("Choose the line number of the vehicle you'd like to take:");
            try {
                vehicleChoice = Integer.parseInt(Mars.scan.nextLine());

                switch(vehicleChoice){
                    case 1:
                        chosenVehicleName = "Battle Tank";
                        break;
                    case 2:
                        chosenVehicleName = "Vespa Scooter";
                        break;
                    case 3:
                        chosenVehicleName = "Twin-Engine Hovercraft";
                        break;
                    case 4:
                        chosenVehicleName = "Trusty, Rusty Pogo Stick";
                        break;
                    default:
                        throw new NoSuchFieldException("\nThe chosen vehicle number isn't valid\n");
                }
                validVehicleNumberChosen = true;
            } catch(NumberFormatException e){
                System.out.println("\nI've had about enough of you and your inability to distinguish letters from numbers\n");
                continue;
            } catch(NoSuchFieldException e){
                System.out.println(e.getMessage());
                continue;
            }
        }


        System.out.println("***********EXPEDITION SUMMARY***********");
        System.out.println("Away Team Leader: " + personName);
        System.out.println("Additional Crew Members on Away Team: " + crewMembersOnAwayTeam);
        System.out.println("Snack of Choice: " + snackChoice);
        System.out.println("Expedition Vehicle: " + chosenVehicleName);

        System.out.println("The expedition will begin in 10 seconds.");
        System.out.println("9...\n8...\n7...\n6...\n5...\n4...\n3...\n2...\n1...");
        System.out.println("The " + chosenVehicleName + " exploded!");
        System.out.println("Oops! That was the countdown for the self-destruct sequence.");
        System.out.println("On the bright side, the galley has your " + snackChoice + " ready for you.");
    }
}
