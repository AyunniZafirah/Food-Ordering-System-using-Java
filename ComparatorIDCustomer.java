/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adv_prog_ass2;

import java.util.Comparator;

/**
 *
 * @author wani
 */
public class ComparatorIDCustomer implements Comparator<Customer> {

    public int compare(Customer r1, Customer r2) {
        // Compare based on restaurant ID
        int idComparison = Integer.compare(r1.getCid(), r2.getCid());
        return idComparison;
    }

}
