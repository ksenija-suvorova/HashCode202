package hashcode.domain;

import java.util.List;
import java.util.Map;

public class Definition {
    private Map<Integer, Library> libraries;
    private List<Integer> scores;
    private int totalDays;

    public Definition(Map<Integer, Library> libraries, int totalDays, List<Integer> scores) {
        this.libraries = libraries;
        this.totalDays = totalDays;
        this.scores = scores;
    }

    public Map<Integer, Library> getLibraries() {
        return libraries;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public List<Integer> getScores() {
        return scores;
    }
}
