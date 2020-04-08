package com.codekiller;

public class Problem {
    String problemName;
    int problemNumber;
    float finalScore;

    public Problem(String problemName, int problemNumber) {
        this.problemName = problemName;
        this.problemNumber = problemNumber;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public int getProblemNumber() {
        return problemNumber;
    }

    public void setProblemNumber(int problemNumber) {
        this.problemNumber = problemNumber;
    }

    public float getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(float finalScore) {
        this.finalScore = finalScore;
    }
}
