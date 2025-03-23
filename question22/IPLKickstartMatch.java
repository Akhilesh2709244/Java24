package question22;

import java.util.Vector;

public class IPLKickstartMatch {
    public static void main(String[] args) {
        // Initialize batting lineups
        Vector<String> KKR = new Vector<>();
        Vector<String> MumbaiIndians = new Vector<>();

        // Add players to KKR lineup
        KKR.add("Venkatesh Iyer");
        KKR.add("Shubman Gill");
        KKR.add("Ajinkya Rahane");
        KKR.add("Quinton de Kock"); 
        KKR.add("Nitish Rana");
        KKR.add("Andre Russell");
        KKR.add("Sunil Narine");

        // Add players to Mumbai Indians lineup
        MumbaiIndians.add("Rohit Sharma");
        MumbaiIndians.add("Ishan Kishan");
        MumbaiIndians.add("Suryakumar Yadav");
        MumbaiIndians.add("Tilak Varma");
        MumbaiIndians.add("Kieron Pollard");

        // Display the original batting lineup of KKR
        System.out.println("Original Batting Lineup of KKR: " + KKR);

        // Change in KKR lineup: Replace "Quinton de Kock" with "Anukul Roy" at two down (index 2)
        int positionToChange = 3; //  Two down means the 4th position (index 3 in zero-based indexing)
        KKR.set(positionToChange, "Anukul Roy");

        // Display the updated batting lineup of KKR
        System.out.println("Updated Batting Lineup of KKR: " + KKR);
    }
}
