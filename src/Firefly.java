import java.util.Scanner;

public class Firefly extends Ship implements badguys{
 public Firefly(){
    super("firefly");
}
public static String Greeting(){
     String greeting= "Firefly: I'm so big and powerful. Do I want to mess with you right now? Find out.";
     return greeting;
}
    public static void challenge(){
        String[] probs= {"What is the capital of the American State, OR ?", "What is the Square root of 169?", "Where on a cranium is a bipedal's foreum magnum located?", "What is Parker Straight's 800 pr?"};
        String[] ans= {"Salem", "13", "bottom", "1:58"};
        String output;
        int ran= (int) (Math.random() * probs.length);
        String p= probs[ran];
        System.out.println(p);
        Scanner input= new Scanner(System.in);
        String answer= input.nextLine();
        if (answer== ans[ran]){
            output= name+ ": Sweet! Good job, fun messing with you visit anytime.";
            System.out.println(output);
        }
        else{
            output= name+ ": Stupid. Have fun in hell. \n Game over";
            System.out.println(output);
            Board.gameOff();
        }
    }

}

