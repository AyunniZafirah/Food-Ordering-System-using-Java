/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adv_prog_ass2;

import java.util.Comparator;

/**
 *
 * @author ayunn
 */
public class ComparatorIDRestaurant implements Comparator<Restaurant>{
  
 public int compare(Restaurant r1, Restaurant r2) {
        // Compare based on restaurant ID
        int idComparison = Integer.compare(r1.getRid(), r2.getRid());
         return idComparison;
        }
 
}

