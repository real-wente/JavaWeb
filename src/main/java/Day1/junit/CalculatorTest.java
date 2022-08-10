package Day1.junit;

/**
 * @author wentao
 * @date 2022-08-10  17:12
 */

public class CalculatorTest {
    public static void main(String[] args) {

        //创建对象
        Calculator ca = new Calculator();
        //调用方法
        int add = ca.add(1, 2);
        System.out.println(add);
    }
}
