package reflection.task;

import java.lang.reflect.Field;

public class BeanComparator {
    public static <T> void compare(T firstObject, T secondObject) throws NoSuchFieldException, IllegalAccessException {
        if (!firstObject.getClass().equals(secondObject.getClass()))
        {
            System.out.println("no matches");
        }else {
            System.out.println("________________________________________________");
            System.out.println("Field           A        B       Matches");
            for (Field firstField : firstObject.getClass().getDeclaredFields()) {
                Field secondField = secondObject.getClass().getDeclaredField(firstField.getName());
                firstField.setAccessible(true);
                secondField.setAccessible(true);
                Object firstObjectResult = firstField.get(firstObject);
                Object secondObjectResult = secondField.get(secondObject);
                System.out.println("________________________________________________");
                if (firstObjectResult.equals(secondObjectResult))
                {
                    System.out.println(firstField.getName() + "     |   " + firstObjectResult + "   |  "
                            + secondObjectResult + "    |   " + "YES   |");
                }
                else {
                    System.out.println(firstField.getName() + "     |   " + firstObjectResult + "   |  "
                            + secondObjectResult + "    |   " + "NO   |");
                }
            }
                System.out.println("------------------------------------------------");
        }
    }
}
