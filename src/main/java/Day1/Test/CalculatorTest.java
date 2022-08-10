package Day1.Test;

import Day1.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author wentao
 * @date 2022-08-10  17:26
 */

public class CalculatorTest {

    /**
     * 初始化方法，逻辑上首先执行init
     */
    @Before
    public void init(){
        System.out.println("初始化成功");

    }

    /**
     * 释放资源方法，逻辑上最后执行close
     */
    @After
    public void close(){
        System.out.println("资源结束");
    }

    /**
     * 测试add方法
     */
    @Test
    public void testadd(){
        Calculator c1 = new Calculator();
        int re = c1.add(1, 2);
        System.out.println(re);
        //断言
        Assert.assertEquals(3,re);

    }

}
