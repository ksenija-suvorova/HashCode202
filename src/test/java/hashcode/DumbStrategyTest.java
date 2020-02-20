package hashcode;

import hashcode.domain.Definition;
import org.junit.Test;

public class DumbStrategyTest {
    private Service service = new Service();

    @Test
    public void run() {
        Definition definition = Mock.createDefinition1();
        DumbStrategy strategy = new DumbStrategy();
        strategy.run(definition);

        service.output(definition);
    }

}