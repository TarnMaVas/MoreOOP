package lotr;
import lotr.Character;
import lotr.kickstrategy.HobbitKick;

public class Hobbit extends Character {

        public Hobbit() {
            super(3, 0, new HobbitKick());
        }

        @Override
        public void kick(Character c ) {
            getKickStrategy().kick(this, c);
        }


}
    
