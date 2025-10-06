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
public class ComparatorNameRestaurant implements Comparator<Restaurant>{
      public int compare(Restaurant r1, Restaurant r2) {
        return r1.getRname().compareTo(r2.getRname());
    }
}
