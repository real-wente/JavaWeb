package Day1.reflect;

import Day1.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;




/**
 * @author wentao
 * @date 2022-08-10 20:45
 */
public class ReflectDemo4 {

    public int num = 1;
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {


       /*


        */
        int num = 1;
        //0 获取Person的Class对象
        Class<Person> personClass = Person.class;
        //获取指定名称的方法
        Method eat = personClass.getMethod("eat");
        Person person = new Person();
        //执行方法
        eat.invoke(person);
        //不知道为什么不能在全局定义num并且定义
        Method eat1 = personClass.getMethod("eat", int.class);
        eat1.invoke(person,num);


    }


}
