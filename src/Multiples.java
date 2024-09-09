public class Multiples {
    public static void main(String[] args) {

        // write a main method that **prints** how many multiples of 3 or 5 there are below 1000.
        //Add this file to your project, commit, and push. Check your repo on
        // GitHub to confirm your changes were pushed successfully.

        int tot = 0;
        for (int i = 1; i < 1000; i++) {

            if ( i % 3 == 0 || i % 5 == 0) {
                tot++;
            }
        }
        System.out.println(tot);
    }
}
