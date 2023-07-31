/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jiporOOP;

/**
 *
 * @author sreng
 */
class Vehicle {
    //data members
    private String vcode;
    private String mcode;
    private String fcode;
    private String my;
    private String model;
    private String color;
    //create constructor
    public Vehicle(){}//default constructor
    public Vehicle(String vcode, String mcode, String fcode, String my, String model, String color){
        this.vcode = vcode;
        this.mcode = mcode;
        this.fcode = fcode;
        this.my = my;
        this.model = model;
        this.color = color;
    }
    //create method set of data members
    public void setVcode(String vcode){
        this.vcode = vcode;
    }
    public void setMcode(String mcode){
        this.mcode = mcode;
    }
    public void setFcode(String fcode){
        this.fcode = fcode;
    }
    public void setMy(String my){
        this.my = my;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    //create getter methods
    public String getVcode(){
        return vcode;
    }
    public String getMcode(){
        return mcode;
    }
    public String getFcode(){
        return fcode;
    }
    public String getMy(){
        return my;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public void showInfo(){
        System.out.println("Vehicle Code: "+this.vcode);
        System.out.println("Machine Code: "+this.mcode);
        System.out.println("Frame Code: "+this.fcode);
        System.out.println("Make Year: "+this.my);
        System.out.println("Vehicle Model: "+this.model);
        System.out.println("Vehicle Color: "+this.color);

    }
}
