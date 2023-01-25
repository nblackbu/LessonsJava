package org.example;

public enum Constants {
    SAME("SAME + "), ADDED("ADDED + "), REMOVED("REMOVED + ");


    private String s;

    Constants(String s) {
        this.s = s;
    }
    public String getConstants(){
        return s;
    }
}
