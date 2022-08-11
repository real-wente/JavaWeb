package Day1.domain;

/**
 * @author wentao
 * @date 2022-08-10 20:17
 */
public class Person {
    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;

    /**
     * 构造方法快捷键 alt+insert
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("eating=========");
    }

    public void eat(int num){
        System.out.println("eating========="+ num);
    }


}
