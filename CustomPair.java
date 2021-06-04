package Leetcode;

public class CustomPair {
    private char key;
    private int value;
    CustomPair(){}
    CustomPair(char key, int value){
        this.key = key;
        this.value = value;
    }
    public char getKey(){
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setKey(char key){
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
