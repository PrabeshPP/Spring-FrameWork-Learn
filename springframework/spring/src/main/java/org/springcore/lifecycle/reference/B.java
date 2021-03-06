package org.springcore.lifecycle.reference;

public class B {
    private String name;
    private  int score;
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public B(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public B() {
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
