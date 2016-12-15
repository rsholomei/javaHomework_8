package reflection;

import reflection.object.ListObject;
import reflection.task.BeanComparator;
import reflection.task.BeanRepresenter;
import reflection.task.CloneCreator;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, CloneNotSupportedException, InstantiationException {
        BeanRepresenter.representer(ListObject.listHuman().get(0));
        Object clone = CloneCreator.clone(ListObject.listHuman().get(0));
        BeanRepresenter.representer(clone);
        BeanComparator.compare(ListObject.listCar().get(0), ListObject.listCar().get(1));
    }
}
