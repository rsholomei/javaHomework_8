package reflection.task;

import java.lang.reflect.Field;

public class BeanRepresenter {
    public static void representer(Object element) throws IllegalAccessException, NoSuchFieldException {

        Class classElem = element.getClass();
        Field[] nameFields = classElem.getDeclaredFields();

        System.out.println(element.getClass().getName().substring(18));

        for (Field field : nameFields) {
            field.setAccessible(true);
            Object result = field.get(element);
            System.out.println("__________________________________");
            System.out.println("|   " + field.getName().toString() + "   |   " + result + "     |");
        }
        System.out.println("---------------------------------");
    }
}
