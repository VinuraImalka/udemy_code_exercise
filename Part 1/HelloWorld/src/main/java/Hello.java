public class Hello {

    public static void main(String[] args) {


        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("tim" , position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("bob" , position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("percy" , position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("gilbert" , position);
    }

    public static void displayHighScorePosition(String name ,int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition (int score){

        int position = 4;

        if(score>1000){
            position = 1;
        }
        else if(score>500 && score<1000){
            position = 2;
        }
        else if(score>100 && score<500){
            position = 3;
        }


        return position;
    }

}
