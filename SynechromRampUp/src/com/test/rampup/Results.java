package com.test.rampup;
public class Results {
    private final Integer totalMarks;
    private final String strongSubject;
    private final String weakSubject;
    private final Integer percentage;
    private final Integer rank;

    public Results(Integer totalMarks, String strongSubject, String weakSubject, Integer percentage, Integer rank) {
        this.totalMarks = totalMarks;
        this.strongSubject = strongSubject;
        this.weakSubject = weakSubject;
        this.percentage = percentage;
        this.rank = rank;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public String getStrongSubject() {
        return strongSubject;
    }

    public String getWeakSubject() {
        return weakSubject;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public Integer getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Results{" +
                "totalMarks=" + totalMarks +
                ", strongSubject='" + strongSubject + '\'' +
                ", weakSubject='" + weakSubject + '\'' +
                ", percentage=" + percentage +
                ", rank=" + rank +
                '}';
    }
}
