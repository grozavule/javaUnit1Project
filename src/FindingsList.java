import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class FindingsList {

    public FindingsList(){
        try {
            Thread.sleep(500);

            //rock samples
            String[] samples = new String[4];
            samples[0] = "rock";
            samples[1] = "weird rock";
            samples[2] = "smooth rock";
            samples[3] = "not rock";

            System.out.println("Everything downloaded! Here are the rocks that were collected:");
            printSamplesList(samples);

            System.out.println("What?! One of these samples isn't a rock. I'll remove that from the sample list.");
            String[] filteredSamples = new String[samples.length - 1];
            for(int i = 0, j = 0; i < samples.length; i++){
                if(!samples[i].equals("not rock")){
                    filteredSamples[j++] = samples[i];
                }
            }
            printSamplesList(filteredSamples);
            System.out.println("Perfect!");

            //fossils
            Thread.sleep(1000);
            HashMap<String, String> fossils = new HashMap<>();
            fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
            fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
            fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
            System.out.println("Fossil data downloaded");

            String fossilDescription = "";
            boolean validFossilWasChosen = false;
            while(!validFossilWasChosen){
                System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");
                String fossilChoice = Mars.scan.nextLine().toLowerCase();
                switch(fossilChoice){
                    case "bird":
                        fossilDescription = fossils.get("Bird Fossil");
                        break;
                    case "fish":
                        fossilDescription = fossils.get("Fish Fossil");
                        break;
                    case "tooth":
                        fossilDescription = fossils.get("Tooth Fossil");
                        break;
                    default:
                        System.out.println("The fossil you chose wasn't an option. Try again.\n");
                        continue;
                }
                validFossilWasChosen = true;
            }
            System.out.println(fossilDescription);

            Thread.sleep(700);

            //supplies
            HashSet<String> supplies = new HashSet<>();
            supplies.add("oxygen tanks");
            supplies.add("communication equipment");
            supplies.add("duct tape");
            supplies.add("toilet paper");
            supplies.add("floss");
            supplies.add("chewing gum");
            supplies.add("chocolate bars");

            System.out.println("************SUPPLIES BEFORE EXPEDITION**********");
            printSuppliesList(supplies);

            supplies.remove("floss");
            System.out.println("************SUPPLIES AFTER EXPEDITION**********");
            printSuppliesList(supplies);

        } catch(InterruptedException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }

    private void printSamplesList(String[] samples){
        for(int i = 0; i < samples.length; i++){
            System.out.println(samples[i]);
        }
    }

    private void printSuppliesList(HashSet<String> supplies){
        Iterator iterator = supplies.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
