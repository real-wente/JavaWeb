package Day1.reflect;

import Day1.domain.Person;

/**
 * @author wentao
 * @date 2022-08-10 20:15
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {

        //1 Class.forName("全类名")
        Class aClass = Class.forName("Day1.domain.Person");
        System.out.println(aClass);

        //2 类名.class
        Class aClass1 = Person.class;
        System.out.println(aClass1);

        //3 对象.getClass()
        Person p = new Person();
        Class aClass2 = p.getClass();
        System.out.println(aClass2);

        //比较这三个对象
        System.out.println(aClass == aClass1);
        System.out.println(aClass == aClass2);


    }
}
