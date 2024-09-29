package lotr;
import lotr.Character;

public class GameManager {

    public void fight(Character c1, Character c2) {
        int i = 0;
        System.out.println("Initial character state:");
        System.out.println("Character 1:" + c1.toString());
        System.out.println("Character 2:" + c2.toString());

        while (c1.getHp() != 0 && c2.getHp() != 0) {
            c1.kick(c2);
            c2.kick(c1);

            System.out.println("Round " + i + " :");
            System.out.println("Character 1:" + c1.toString());
            System.out.println("Character 2:" + c2.toString());

            i++;
        }
    }
    
}
