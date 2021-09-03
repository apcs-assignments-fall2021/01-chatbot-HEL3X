import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Add some code here!
        System.out.println("What's your name?");

        String name = scan.nextLine();
        System.out.println(name + "!?!?!? PFFFTTTPT, your parents couldn't think of anything else? So, wait... How old did you say you where?");

        String age = scan.nextLine();
        System.out.println(age + "? Yeah I thought so... pathetic really... How about your favorite colour?");

        String colorAnswer = scan.nextLine();
        System.out.println(colorAnswer + "!?! Are you serious?!? Is there anything good about you? Like... what's your favorite sport?");

        String sport = scan.nextLine();
        System.out.println(sport + " sucks! You're really getting on my nerves right now, like is there anything that you and I share in common? What about your favorite food?");

        String food = scan.nextLine();
        System.out.println("Actually " + food + " doesn't sound to bad, though I've never tasted food before so I guess you get a pass from this one.");
        System.out.println("Anyways, you're really boring to talk to soooo I'm going to head out, cya!");




        scan.close();
    }
}
