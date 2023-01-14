public class FindingsList {

    public FindingsList(){
        try {
            Thread.sleep(500);

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
}
