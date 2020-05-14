package cn.lanca.plentyoffish.article.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommandTest {
    //Mac系统快捷键记录
    //1.command + d(duplicate)     复制一行代码
    //2.command + 退格/回退/⬅       删除光标所在行
    //3.command + option(alt) + L️  格式化代码
    //4.command + /                注释/取消注释
    //5.command + shift + u        选择内容大小写切换
    //6.shift + enter              快速切换到下一行
    //7.command + option(alt)  左右箭头    回退/前进到之前操作位置

    @Test
    public void test(){

        // 关于电梯载客效率的猜想
        // #1.早高峰,所有电梯从1楼集中分散至其他楼层,如何设置或调整电梯运行模式,使乘客最大效率的上升至其目标楼层
        // #2.电梯需求淡季,任何楼层响应,至任何楼层
        // #3.晚高峰,所有楼层都可能有乘客需求下至1楼.
        // #4.模拟大厦层高50,三部电梯,如何设计
    }

}
