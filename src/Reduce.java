public class Reduce {
    public static void main(String[] args) {
        // write a main method that prints how many steps it takes to reach 0 if you start at 100.
        //Add this file to your project, commit, and push. If you don't get the right answer, that's okay for now.
        //This is to get you to practice. You'll have until the end of the week to work out the details and
        //submit your working code on MarkUs.


        int step = 0;
        int i = 100;
        while (i > 0){
            if (i % 2 == 0){
                i = i/2;
            }
            else {
                i -= 1;
            }
            step++;


        }

        System.out.println(step);
    }

}
