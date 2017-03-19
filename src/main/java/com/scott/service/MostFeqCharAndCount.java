package com.scott.service;

/**
 * Created by goalert on 18/03/17.
 */
public class MostFeqCharAndCount {

    String mostFeqChar;
    int count;

    public String getMostFeqChar() {
        return mostFeqChar;
    }

    public void setMostFeqChar(String mostFeqChar) {
        this.mostFeqChar = mostFeqChar;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MostFeqCharAndCount{");
        sb.append("mostFeqChar='").append(mostFeqChar).append('\'');
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
