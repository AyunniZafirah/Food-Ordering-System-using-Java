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
public class ComparatorNameCustomer implements Comparator<Customer>{
    
    @Override
    public int compare(Customer r1, Customer r2) {
        return r1.getCname().compareTo(r2.getCname());
    }
}
