package lotr;

import lotr.Character;
import lotr.kickstrategy.ElfKick;

public class Elf extends Character {
    
    public Elf() {
        super(10, 10, new ElfKick());
    }

    @Override
    public void kick(Character c) {
        getKickStrategy().kick(this, c);
    }
}
