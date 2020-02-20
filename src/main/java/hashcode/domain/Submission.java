package hashcode.domain;

import java.util.List;

public class Submission {
    private List<Library> signup;

    public Submission(List<Library> signup) {
        this.signup = signup;
    }

    public List<Library> getSignup() {
        return signup;
    }

    public int getLibraryCount() {
        return signup.size();
    }
}
