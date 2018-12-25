package model;

import org.junit.Test;

import java.util.Arrays;

public class LiseDemo {
    private String[] arr;

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "ListDemo [arr=" + Arrays.toString(arr) + "]";
    }
}
