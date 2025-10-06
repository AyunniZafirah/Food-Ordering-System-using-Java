/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adv_prog_ass2;
public class Restaurant {
private int rid;
private String rname, raddress, remail, rfood1, rfood2, rfood3;
private double rfoodprice1, rfoodprice2, rfoodprice3;

    public Restaurant(int rid, String rname, String raddress, String remail, String rfood1, String rfood2, String rfood3, double rfoodprice1, double rfoodprice2, double rfoodprice3) {
        this.rid = rid;
        this.rname = rname;
        this.raddress = raddress;
        this.remail = remail;
        this.rfood1 = rfood1;
        this.rfood2 = rfood2;
        this.rfood3 = rfood3;
        this.rfoodprice1 = rfoodprice1;
        this.rfoodprice2 = rfoodprice2;
        this.rfoodprice3 = rfoodprice3;
    }

    public String getRfood1() {
        return rfood1;
    }

    public void setRfood1(String rfood1) {
        this.rfood1 = rfood1;
    }

    public String getRfood2() {
        return rfood2;
    }

    public void setRfood2(String rfood2) {
        this.rfood2 = rfood2;
    }

    public String getRfood3() {
        return rfood3;
    }

    public void setRfood3(String rfood3) {
        this.rfood3 = rfood3;
    }

    public double getRfoodprice1() {
        return rfoodprice1;
    }

    public void setRfoodprice1(double rfoodprice1) {
        this.rfoodprice1 = rfoodprice1;
    }

    public double getRfoodprice2() {
        return rfoodprice2;
    }

    public void setRfoodprice2(double rfoodprice2) {
        this.rfoodprice2 = rfoodprice2;
    }

    public double getRfoodprice3() {
        return rfoodprice3;
    }

    public void setRfoodprice3(double rfoodprice3) {
        this.rfoodprice3 = rfoodprice3;
    }

    public int getRid() {
        return rid;
    }
    public void setRid(int rid) {
        this.rid = rid;
    }
    
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
    public String getRaddress() {
        return raddress;
    }

    public void setRaddress(String raddress) {
        this.raddress = raddress;
    }

    public String getRemail() {
        return remail;
    }

    public void setRemail(String remail) {
        this.remail = remail;
    }
}
