package lotr.kickstrategy;
import lotr.Character;

public class ElfKick implements KickStrategy {
    
    @Override
    public void kick(Character whoKicked, Character whomKicked) {
        if (whoKicked.getPower() > whomKicked.getPower()) {
            whomKicked.setHp(0);
        } else {
            whoKicked.setPower(whoKicked.getPower() - 1);
        }
    }
}
