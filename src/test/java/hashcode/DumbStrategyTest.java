package hashcode;

import hashcode.domain.Definition;
import org.junit.Test;

public class DumbStrategyTest {
    private Service service = new Service();

    @Test
    public void run() {
        DumbStrategy strategy = new DumbStrategy();

        Definition definition = Mock.createDefinition1();
        strategy.run(definition);
        service.output(definition);
    }

    @Test
    public void runAllSet() {
        DumbStrategy strategy = new DumbStrategy();

        Definition definition = App.loadDefinition("a_example.txt");
        strategy.run(definition);
        service.output(definition);

        definition = App.loadDefinition("b_read_on.txt");
        strategy.run(definition);
        service.output(definition);

        definition = App.loadDefinition("c_incunabula.txt");
        strategy.run(definition);
        service.output(definition);

        definition = App.loadDefinition("d_tough_choices.txt");
        strategy.run(definition);
        service.output(definition);

        definition = App.loadDefinition("e_so_many_books.txt");
        strategy.run(definition);
        service.output(definition);

        definition = App.loadDefinition("f_libraries_of_the_world.txt");
        strategy.run(definition);
        service.output(definition);
    }
}