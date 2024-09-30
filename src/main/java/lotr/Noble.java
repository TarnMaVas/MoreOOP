package lotr;

import java.util.Random;

import lotr.Character;
import lotr.kickstrategy.NobleKick;
public class Noble extends Character {

    static int lower_bound;
    static int upper_bound;

    public Noble() {
        super(new Random().nextInt(upper_bound - lower_bound) + lower_bound,
        new Random().nextInt(upper_bound - lower_bound) + lower_bound,
        new NobleKick());
    }

    @Override
    public void kick(Character c) {
        getKickStrategy().kick(this, c);
    }
    
}
