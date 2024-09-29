package lotr.kickstrategy;
import java.util.Random;

import lotr.Character;

public class NobleKick implements KickStrategy {
    
    @Override
    public void kick(Character whoKicked, Character whomKicked) {
        whomKicked.setHp(new Random().nextInt(whoKicked.getPower()));
    }
}
