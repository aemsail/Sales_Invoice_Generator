package models;

import java.util.Date;

public class InvoiceHeader {
    private  int num;
    private Date date;
    private String name;

    public InvoiceHeader(int num, Date date, String name) {
        this.num = num;
        this.date = date;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
