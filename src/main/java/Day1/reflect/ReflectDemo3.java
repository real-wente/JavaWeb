package Day1.reflect;

import Day1.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 * @author wentao
 * @date 2022-08-10 20:45
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {


        /*
         * Constructor<?>[] getConstructors()
         * Constructor<T> getConstructor(类<?>... parameterTypes)
         * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
         * Constructor<?>[] getDeclaredConstructors()
         */
        //0 获取Person的Class对象
        Class<Person> personClass = Person.class;

        // 返回一个构造器 用来创建对象
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object ob = constructor.newInstance("张三",23);
        System.out.println(ob);


        System.out.println("=======================================================");
        // 使用空参的方法创建构造器
        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        Person ob1 = constructor1.newInstance();
        System.out.println(ob1);

        //Person person = personClass.newInstance();
        Person person1 = personClass.getDeclaredConstructor().newInstance();
        System.out.println(person1);

        //constructor1.setAccessible(true);


    }


}
