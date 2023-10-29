package com.example.work4.model;

public class quizmodel {
    String contestname;
    int contestrating;

    public String getContestname() {
        return contestname;
    }

    public void setContestname(String contestname) {
        this.contestname = contestname;
    }

    public int getContestrating() {
        return contestrating;
    }

    public void setContestrating(int contestrating) {
        this.contestrating = contestrating;
    }

    public quizmodel(String contestname, int contestrating) {
        this.contestname = contestname;
        this.contestrating = contestrating;

    }
}
