package standoff.oldman;
import java.util.Random

public class OldMan {
    public String randomMove(){
	Random rand = new Random();
	int actionNum = rand.nextInt(5);
	String action = "";
	int target = rand.nextInt(4);

	switch (action) {
	    case 0: 
		action = Constants.MOVE_SHOOT + " " + target;
	    case 1:
		action = Constants.MOVE_DODGE + " " + target;
	    case 2:
		action = Constants.MOVE_PREPARE;
	    case 3:
		action = Constants.MOVE_THROW + " " + target;
	    case 4:
		action = Constants.MOVE_NOTHING;
	}
        return action; //Chosen by fair dice roll, guaranteed to be randoms
    }


}
