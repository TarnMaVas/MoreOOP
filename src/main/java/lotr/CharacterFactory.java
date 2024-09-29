package lotr;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;
import org.reflections.Reflections;

public class CharacterFactory {
    Reflections reflections = new Reflections("lotr");
    Set<Class<? extends Character>> classes = reflections.getSubTypesOf(Character.class);

    Character createCharacter() throws NoSuchMethodException {

        int choice = new Random().nextInt(classes.size());
        int i = 0;
        Class<? extends Character> resultingClass = Character.class;


        for (Class<? extends Character> c: classes) {
            if (i == choice) {
                resultingClass = c;
            }

            i++;
        }

        try {

            return resultingClass.getDeclaredConstructor().newInstance(); 

        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e){

            return null;
        }

    }
}
