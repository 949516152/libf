import com.libf.strategy.*;
import com.libf.strategy.myinterface.ProformImpl1;
import org.junit.Test;

public class TestDemon {
    @Test
    public void name() {
//        策略模式
        int a = new DoCaculate(new StrategyDemon1(),new ProformImpl()).doCaculate(2,1);

        int b = new DoCaculate(new StrategyDemon2(),new ProformImpl1()).doCaculate(2,1);

        int c = new DoCaculate(new StrategyDemon3(),new ProformImpl()).doCaculate(2,1);

        System.out.println(a +" ======= " + b+" ********* " +c);

    }
}
