package com.example.demo.models;

/**
 * Created by Johan Rune
 * Date: 2021-04-09
 * Time: 11:59
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Message {


    protected boolean status;
    protected String mess;

    public Message () {}

    public Message (boolean status, String mess){
        this.status = status;
        this.mess = mess;
    }



    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }


}
