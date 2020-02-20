package hashcode.domain;

import java.util.List;

public class Submission {
    private String filename;
    private List<Library> signup;

    public Submission(String filename, List<Library> signup) {
        this.filename = filename;
        this.signup = signup;
    }

    public List<Library> getSignup() {
        return signup;
    }

    public int getLibraryCount() {
        return signup.size();
    }

    public String getFilename() {
        return filename;
    }
}
