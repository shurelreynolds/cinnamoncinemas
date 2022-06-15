package com.shurel.cinnamoncinemas;

class Seat {


    private final String code;
    private Integer number;
    private boolean allocated;


    public Seat(Integer number, String code) {
        this.number = number;
        this.code = code;
    }

    public Integer getNumber() {
        return number;
    }

    public boolean isAllocated() {
        return allocated;
    }

    public String getCode() {
        return code;
    }

    public void allocate(boolean b) {
        allocated=b;
    }
}
