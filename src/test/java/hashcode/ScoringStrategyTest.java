package hashcode;

import hashcode.domain.Definition;
import hashcode.domain.Submission;
import org.junit.Test;

public class ScoringStrategyTest {
    private Service service = new Service();

    @Test
    public void run() {
        ScoringStrategy strategy = new ScoringStrategy();

        Definition definition = Mock.createDefinition1();
        strategy.run(definition);
        service.output(definition);
    }

    @Test
    public void runAllSet() {
        Submission submission;
        ScoringStrategy strategy = new ScoringStrategy();

        Definition definition = App.loadDefinition("a_example.txt");
        submission = strategy.run(definition);
        service.output(definition);

        definition = App.loadDefinition("b_read_on.txt");
        submission = strategy.run(definition);
        service.output(definition);

        definition = App.loadDefinition("c_incunabula.txt");
        submission = strategy.run(definition);
        service.output(definition);

        definition = App.loadDefinition("d_tough_choices.txt");
        submission = strategy.run(definition);
        service.output(definition);

        definition = App.loadDefinition("e_so_many_books.txt");
        submission = strategy.run(definition);
        service.output(definition);

        definition = App.loadDefinition("f_libraries_of_the_world.txt");
        submission = strategy.run(definition);
        service.output(definition);
    }
}