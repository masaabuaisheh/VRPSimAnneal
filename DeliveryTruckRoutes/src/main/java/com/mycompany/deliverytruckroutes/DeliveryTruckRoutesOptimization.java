package com.mycompany.deliverytruckroutes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class DeliveryTruckRoutesOptimization extends javax.swing.JFrame {
        private ArrayList<Integer> truckCap = new ArrayList<>();
        private ArrayList<String> deliveryPoints = new ArrayList<>();
        private int[] StartingPoint;
        private ArrayList<int[]> coordinates = new ArrayList<>();
        private double[][] distance; 
        int counttruck=0;
        
    public DeliveryTruckRoutesOptimization() {
        initComponents();        
                     
    }



   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        latitudeField = new javax.swing.JTextField();
        longitudeField = new javax.swing.JTextField();
        addPointButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        shwPointButton = new javax.swing.JButton();
        demandField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        latField = new javax.swing.JTextField();
        longField = new javax.swing.JTextField();
        depotButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        drawingPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        solveVRP = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        quit1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        numberField = new javax.swing.JTextField();
        capacityField = new javax.swing.JTextField();
        addTruckButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        shwTruckButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        latitudeField.setBackground(new java.awt.Color(255, 255, 255));
        latitudeField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        latitudeField.setForeground(new java.awt.Color(0, 0, 0));
        latitudeField.setText("Latitude");
        latitudeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel6.add(latitudeField);
        latitudeField.setBounds(22, 61, 370, 22);

        longitudeField.setBackground(new java.awt.Color(255, 255, 255));
        longitudeField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        longitudeField.setForeground(new java.awt.Color(0, 0, 0));
        longitudeField.setText("Longitude");
        longitudeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel6.add(longitudeField);
        longitudeField.setBounds(22, 95, 370, 22);

        addPointButton.setBackground(new java.awt.Color(0, 51, 153));
        addPointButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addPointButton.setForeground(new java.awt.Color(0, 0, 0));
        addPointButton.setText("Add delivery point");
        addPointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPointButtonActionPerformed(evt);
            }
        });
        jPanel6.add(addPointButton);
        addPointButton.setBounds(30, 170, 170, 23);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Delivery Points");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(130, 20, 160, 25);

        shwPointButton.setBackground(new java.awt.Color(0, 51, 153));
        shwPointButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shwPointButton.setForeground(new java.awt.Color(0, 0, 0));
        shwPointButton.setText("Show all delivery point");
        shwPointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shwPointButtonActionPerformed(evt);
            }
        });
        jPanel6.add(shwPointButton);
        shwPointButton.setBounds(210, 170, 180, 23);

        demandField.setBackground(new java.awt.Color(255, 255, 255));
        demandField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        demandField.setForeground(new java.awt.Color(0, 0, 0));
        demandField.setText("Demand");
        demandField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel6.add(demandField);
        demandField.setBounds(22, 129, 370, 22);
        jPanel6.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 230);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\backk.jpg")); // NOI18N
        jPanel6.add(jLabel6);
        jLabel6.setBounds(1, 0, 460, 230);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(608, 6, 460, 230);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        latField.setBackground(new java.awt.Color(255, 255, 255));
        latField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        latField.setForeground(new java.awt.Color(0, 0, 0));
        latField.setText("Latitude");
        latField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        latField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latFieldActionPerformed(evt);
            }
        });
        jPanel2.add(latField);
        latField.setBounds(22, 67, 354, 22);

        longField.setBackground(new java.awt.Color(255, 255, 255));
        longField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        longField.setForeground(new java.awt.Color(0, 0, 0));
        longField.setText("Longitude");
        longField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.add(longField);
        longField.setBounds(22, 101, 354, 22);

        depotButton.setBackground(new java.awt.Color(0, 51, 153));
        depotButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        depotButton.setForeground(new java.awt.Color(0, 0, 0));
        depotButton.setText("Set Depot");
        depotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depotButtonActionPerformed(evt);
            }
        });
        jPanel2.add(depotButton);
        depotButton.setBounds(20, 140, 354, 23);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Depot");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(170, 20, 152, 25);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 0, 180);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\backk.jpg")); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 460, 190);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(610, 450, 460, 190);

        drawingPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        drawingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawingPanelMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\map.jpg")); // NOI18N

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawingPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(drawingPanel);
        drawingPanel.setBounds(8, 71, 590, 580);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Delivery locations");

        solveVRP.setBackground(new java.awt.Color(0, 51, 153));
        solveVRP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        solveVRP.setForeground(new java.awt.Color(0, 0, 0));
        solveVRP.setText("Solve ");
        solveVRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveVRPActionPerformed(evt);
            }
        });

        quit.setBackground(new java.awt.Color(0, 51, 153));
        quit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        quit.setForeground(new java.awt.Color(0, 0, 0));
        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        quit1.setBackground(new java.awt.Color(0, 51, 153));
        quit1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        quit1.setForeground(new java.awt.Color(0, 0, 0));
        quit1.setText("Optimization");
        quit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(54, 54, 54)
                .addComponent(quit1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solveVRP, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quit)
                        .addComponent(solveVRP))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(quit1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 784, 61);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        numberField.setBackground(new java.awt.Color(255, 255, 255));
        numberField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numberField.setForeground(new java.awt.Color(0, 0, 0));
        numberField.setText("Number of Trucks");
        numberField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });
        jPanel7.add(numberField);
        numberField.setBounds(22, 67, 354, 22);

        capacityField.setBackground(new java.awt.Color(255, 255, 255));
        capacityField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        capacityField.setForeground(new java.awt.Color(0, 0, 0));
        capacityField.setText("Capacity");
        capacityField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel7.add(capacityField);
        capacityField.setBounds(22, 101, 354, 22);

        addTruckButton.setBackground(new java.awt.Color(0, 51, 153));
        addTruckButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addTruckButton.setForeground(new java.awt.Color(0, 0, 0));
        addTruckButton.setText("Add Truck");
        addTruckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTruckButtonActionPerformed(evt);
            }
        });
        jPanel7.add(addTruckButton);
        addTruckButton.setBounds(20, 150, 162, 23);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Trucks");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(170, 20, 152, 25);

        shwTruckButton.setBackground(new java.awt.Color(0, 51, 153));
        shwTruckButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shwTruckButton.setForeground(new java.awt.Color(0, 0, 0));
        shwTruckButton.setText("Show all Available Trucks ");
        shwTruckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shwTruckButtonActionPerformed(evt);
            }
        });
        jPanel7.add(shwTruckButton);
        shwTruckButton.setBounds(192, 150, 180, 23);
        jPanel7.add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 200);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\backk.jpg")); // NOI18N
        jPanel7.add(jLabel10);
        jLabel10.setBounds(1, 0, 460, 200);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(610, 240, 460, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void latFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latFieldActionPerformed

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberFieldActionPerformed

    private void drawingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseClicked
               int xaxis = evt.getX();
                int yaxis = evt.getY();
                String demand = "1";
                Graphics g = drawingPanel.getGraphics();
                g.setColor(Color.blue);
                g.fillOval(xaxis - 5, yaxis - 5, 10, 10);
                g.setColor(Color.BLACK);
                g.drawString("(" + xaxis + ", " + yaxis + ")", xaxis + 10, yaxis);
                String pointDesc = "Latitude: " + xaxis + ", Longitude: " + yaxis + ", Demand: " + demand;
                deliveryPoints.add(pointDesc);
                coordinates.add(new int[]{xaxis, yaxis});
                JOptionPane.showMessageDialog(drawingPanel, "Point added at (" + xaxis + ", " + yaxis + ")");
    }//GEN-LAST:event_drawingPanelMouseClicked

    private void shwPointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shwPointButtonActionPerformed
        if (deliveryPoints.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No delivery points have been added yet.", "No Points", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
        String points = "All Delivery Points:\n";
        for (String point : deliveryPoints) {
            points += point + "\n";
        }
        System.out.println("Console Output:");
        for (int i = 0; i < deliveryPoints.size(); i++) {
            System.out.println("Point " + (i + 1) + ": " + deliveryPoints.get(i));
        }

        JOptionPane.showMessageDialog(this, points, "Delivery Points", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_shwPointButtonActionPerformed

    private void addTruckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTruckButtonActionPerformed
        try {
            int numberOfTrucks = Integer.parseInt(numberField.getText());
            int capacity = Integer.parseInt(capacityField.getText());
            for (int i = 0; i < numberOfTrucks; i++) {
                truckCap.add(capacity);
                counttruck+=capacity;
                System.out.println(counttruck);
            } 
            JOptionPane.showMessageDialog(null, "Successfully added " + numberOfTrucks + " trucks with capacity " + capacity + ".", "Addition Successful", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid integers for number of trucks and capacity.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addTruckButtonActionPerformed

    private void shwTruckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shwTruckButtonActionPerformed
        try {
            StringBuilder info = new StringBuilder("Updated Truck Information:\n");
            for (int i = 0; i < truckCap.size(); i++) {
                info.append("Truck ").append(i + 1).append(": Capacity = ").append(truckCap.get(i)).append("\n");
            }
            Object[] options = {"Delete All Trucks", "Close"};
            int response = JOptionPane.showOptionDialog(null, info.toString(), "Truck Information",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null, options, options[1]);

            if (response == 0) {
                truckCap.clear();
                JOptionPane.showMessageDialog(null, "All trucks have been deleted.", "Deletion Complete", JOptionPane.INFORMATION_MESSAGE);
            }
            System.out.println("Console Output:");
            for (int i = 0; i < truckCap.size(); i++) {
                System.out.println("Truck " + (i + 1) + ": Capacity = " + truckCap.get(i));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid integers for number of trucks and capacity.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_shwTruckButtonActionPerformed

    private void depotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depotButtonActionPerformed
         try {
            int x = Integer.parseInt(latField.getText());
            int y = Integer.parseInt(longField.getText());
            
            StartingPoint = new int[x];
            Arrays.fill(StartingPoint, y); 
            System.out.println("Console Output:");
            System.out.println("Starting Point: X= " + x + " , Y= " + y);
            JOptionPane.showMessageDialog(null, "Central starting point (" + x + "," + y+ ").", "Addition Successful", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid integers for Central starting point", "Input Error", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_depotButtonActionPerformed

    private void addPointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPointButtonActionPerformed
            if (latitudeField.getText().isEmpty() || longitudeField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter values for latitude and longitude.", "Missing Values", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int x = Integer.parseInt(latitudeField.getText());
            int y = Integer.parseInt(longitudeField.getText());

            Graphics g = drawingPanel.getGraphics();
            g.setColor(Color.blue);
            g.fillOval(x - 5, y - 5, 8, 8);

            g.setColor(Color.BLACK);
            g.drawString("(" + x + ", " + y + ")", x + 10, y);

            String demand;
            if (demandField.getText().isEmpty()) {
                demand = "1";
            } else {
                demand = demandField.getText();
            }
            String pointDescription = "Latitude: " + latitudeField.getText() + ", Longitude: " + longitudeField.getText() + ", Demand: " + demand;
            deliveryPoints.add(pointDescription);
            coordinates.add(new int[]{x, y}); 
            JOptionPane.showMessageDialog(this, "Point added successfully: " + pointDescription, "Point Added", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_addPointButtonActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
        System.exit(0); 
        }
    }//GEN-LAST:event_quitActionPerformed
    
        private int[] bestSolution;
        private double bestDistance;
        private final double initialTemp = 10000;
        private final double coolingRate = 0.003;
        int[] currentSolution;
        double currentDistance;
        int flag=0;
    private void solveVRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveVRPActionPerformed
        if (coordinates.size() < 2 || truckCap.isEmpty()) {
              JOptionPane.showMessageDialog(this, "Please add at least one depot and delivery point, and add at least one truck.", "Error", JOptionPane.ERROR_MESSAGE);
              return;
          }
          if (distance == null) {
              Distance();
          }
          currentSolution = findInitSolution();
          currentDistance = calculateDistance(currentSolution);
          bestSolution = currentSolution.clone();
          bestDistance = currentDistance;

          displaySolution(bestSolution, bestDistance);
    }//GEN-LAST:event_solveVRPActionPerformed

    private void quit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit1ActionPerformed
        // TODO add your handling code here:
        if (coordinates.size() < 2 || truckCap.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please add at least one depot and delivery point, and add at least one truck.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        double temperature = initialTemp;
        Random random = new Random();

    // Simulated Annealing loop
    while (temperature > 1) {
        int[] newSolution = neighborSol(currentSolution);
        double newDistance = calculateDistance(newSolution);

        if (acceptance(currentDistance, newDistance, temperature) > random.nextDouble()) {
            currentSolution = newSolution.clone();
            currentDistance = newDistance;
        }

        if (newDistance < bestDistance) {
            bestSolution = newSolution.clone();
            bestDistance = newDistance;
        }

        temperature *= 1 - coolingRate;
    }
        flag=1;
       displaySolution(bestSolution, bestDistance);
    }//GEN-LAST:event_quit1ActionPerformed
    
    
    private void Distance() {
        int size = coordinates.size();
        distance = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                double x = coordinates.get(i)[0] - coordinates.get(j)[0];  
                double y = coordinates.get(i)[1] - coordinates.get(j)[1];  
                distance[i][j] = Math.sqrt(x * x + y * y);    
            }
        }
    }

    private int[] findInitSolution() {
        int demand;
        int count=0;
         int size = coordinates.size();
        int[] solution = new int[size];
          for (String pointDescription : deliveryPoints) {
                String[] parts = pointDescription.split(", ");
                for (String part : parts) {
                    if (part.startsWith("Demand: ")) {
                        demand = Integer.parseInt(part.substring(8));
                        for (int i = 0; i < size; i++) {
                            if(counttruck>0 && counttruck>=demand){
                             solution[i] = i;
                              counttruck-=demand;
                            }
                        }
                    }
                }
            }

   
            flag = 0;
            mixArray(solution); 
            System.out.println(Arrays.toString(solution)); 
            return solution;
    }

    private void mixArray(int[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            //swaping
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
         }
    }
    
    private double calculateDistance(int[] solution) {
        double totalDistance = 0;
        for (int i = 0; i < solution.length - 1; i++) {
            totalDistance += distance[solution[i]][solution[i + 1]];
        }
        totalDistance += distance[solution[solution.length - 1]][solution[0]]; 
        return totalDistance;
    }

    private int[] neighborSol(int[] solution) {
        int[] newSolution = solution.clone();
        int swap1 = (int) (Math.random() * newSolution.length);
        int swap2 = (int) (Math.random() * newSolution.length);
        int temp = newSolution[swap1];
        newSolution[swap1] = newSolution[swap2];
        newSolution[swap2] = temp;
        return newSolution;
    }

    private double acceptance(double currentDistance, double newDistance, double temperature) {
        if (newDistance < currentDistance) {
            return 1.0;
        }
        return Math.exp((currentDistance - newDistance) / temperature);
    }

    private void displaySolution(int[] solution, double distance) {
        StringBuilder solutionBuilder = new StringBuilder("solution :\n");
        Graphics g = drawingPanel.getGraphics();
        if(flag==0){
        g.setColor(Color.blue);} 
        else{
        g.setColor(Color.black);} 

        int p = solution[0];
        solutionBuilder.append(formatCoordinate(coordinates.get(p)));

        for (int i = 1; i < solution.length; i++) {
            int c = solution[i];
            int[] PPoint = coordinates.get(p);
            int[] cPoint = coordinates.get(c);

            g.drawLine(PPoint[0], PPoint[1], cPoint[0], cPoint[1]);

            int X = (PPoint[0] + cPoint[0]) / 2;
            int Y = (PPoint[1] + cPoint[1]) / 2;
            g.drawString(Integer.toString(i), X, Y);

            solutionBuilder.append(" -> ").append(formatCoordinate(cPoint));
            p = c;
        }
        
        int[] firstPoint = coordinates.get(solution[0]);
                //StartingPoint;
                //coordinates.get(solution[0]);
        int[] lastPoint = coordinates.get(solution[solution.length - 1]);
                //StartingPoint;
                //coordinates.get(solution[solution.length - 1]);
        g.drawLine(lastPoint[0], lastPoint[1], firstPoint[0], firstPoint[1]);
        int X = (lastPoint[0] + firstPoint[0]) / 2;
        int Y = (lastPoint[1] + firstPoint[1]) / 2;
        g.drawString(Integer.toString(solution.length), X, Y);
        solutionBuilder.append(" -> ").append(formatCoordinate(firstPoint));
        solutionBuilder.append("\nTotal Distance: ").append(String.format("%.2f", distance)).append(" km");
        if(flag==0){
        JOptionPane.showMessageDialog(this, solutionBuilder.toString(), "Start solution", JOptionPane.INFORMATION_MESSAGE);}
        else{
        JOptionPane.showMessageDialog(this, solutionBuilder.toString(), "Optimized Route", JOptionPane.INFORMATION_MESSAGE);}
    }

    private String formatCoordinate(int[] coordinate) {
        return "(" + coordinate[0] + ", " + coordinate[1] + ")";
    }


  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeliveryTruckRoutesOptimization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPointButton;
    private javax.swing.JButton addTruckButton;
    private javax.swing.JTextField capacityField;
    private javax.swing.JTextField demandField;
    private javax.swing.JButton depotButton;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField latField;
    private javax.swing.JTextField latitudeField;
    private javax.swing.JTextField longField;
    private javax.swing.JTextField longitudeField;
    private javax.swing.JTextField numberField;
    private javax.swing.JButton quit;
    private javax.swing.JButton quit1;
    private javax.swing.JButton shwPointButton;
    private javax.swing.JButton shwTruckButton;
    private javax.swing.JButton solveVRP;
    // End of variables declaration//GEN-END:variables
}
