package Day1.reflect;

import Day1.domain.Person;

import java.lang.reflect.Field;

/**
 * @author wentao
 * @date 2022-08-10 20:45
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        //0 获取Person的Class对象
        Class<Person> personClass = Person.class;

        /*
          获取成员变量们 设置值或者获取值
          Field[] getFields() 获取所有public的成员变量
          Field getField(String name) 获取指定名称的public的成员变量

          Field[] getDeclaredFields()
          Field[] getDeclaredField(String name)
         */
        Field[] fields = personClass.getFields();
        //iter增强for循环
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("===================");
        Field a = personClass.getField("a");
        Person p = new Person();
        Object value = a.get(p);
        //初始化的值默认是null
        System.out.println(value);
        //设置a的值
        a.set(p,"张三 ");
        System.out.println(p);

        System.out.println("===================");

        /*
        Filed[] getDeclaredFields()
        获取所有成员变量不考虑修饰符
         */
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        /*
        Filed getDeclaredField(String name)
         */
        Field d = personClass.getDeclaredField("d");
        //忽悠访问权限修饰符的安全检查
        d.setAccessible(true); //暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);


    }


}
