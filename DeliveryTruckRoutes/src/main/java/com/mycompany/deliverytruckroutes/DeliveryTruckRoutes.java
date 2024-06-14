/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deliverytruckroutes;

import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class DeliveryTruckRoutes {

    public static void main(String[] args) {
        DeliveryTruckRoutesOptimization dtr = new DeliveryTruckRoutesOptimization();
        dtr.setVisible(true);
        dtr.setBounds(0, 0,1100,700);
        dtr.setResizable(false);
        dtr.setTitle("Delivery Truck Routes");
        dtr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the window to appear centered
        dtr.setLocationRelativeTo(null);
    }
}
