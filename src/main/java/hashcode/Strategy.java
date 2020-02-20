package hashcode;

import hashcode.domain.Definition;
import hashcode.domain.Submission;

public interface Strategy {
    Submission run(Definition definition);
}
