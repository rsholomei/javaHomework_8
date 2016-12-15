package reflection.task;


import java.lang.reflect.Field;

public class CloneCreator {
    public static  <T> T clone(T object) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();
        T cloneObject = (T)aClass.newInstance();

        for (Field field : fields)
        {
            field.setAccessible(true);
            Field newCloneObject = cloneObject.getClass().getDeclaredField(field.getName());
            newCloneObject.setAccessible(true);
            newCloneObject.set(cloneObject, field.get(object));
        }
        return cloneObject;
    }
}
