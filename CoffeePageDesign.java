package micros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;

public class CoffeePageDesign extends javax.swing.JFrame {

    int tutar = 0;
    public CoffeePageDesign() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        btn_slatte = new javax.swing.JButton();
        btn_mlatte = new javax.swing.JButton();
        btn_llatte = new javax.swing.JButton();
        btn_samericano = new javax.swing.JButton();
        btn_mamericano = new javax.swing.JButton();
        btn_lamericano = new javax.swing.JButton();
        btn_sflat = new javax.swing.JButton();
        btn_mflat = new javax.swing.JButton();
        btn_lflat = new javax.swing.JButton();
        btn_smocha = new javax.swing.JButton();
        btn_mmocha = new javax.swing.JButton();
        btn_lmocha = new javax.swing.JButton();
        btn_awhite = new javax.swing.JButton();
        btn_mwhite = new javax.swing.JButton();
        btn_lwhite = new javax.swing.JButton();
        btn_syrup = new javax.swing.JButton();
        btn_espresso = new javax.swing.JButton();
        btn_odeme = new javax.swing.JButton();
        btn_temizle = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        lbltoplam = new javax.swing.JLabel();
        list1 = new java.awt.List();
        list3 = new java.awt.List();
        list = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(102, 102, 102));

        btn_slatte.setBackground(new java.awt.Color(255, 255, 255));
        btn_slatte.setText("S LATTE");
        btn_slatte.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_slatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_slatteActionPerformed(evt);
            }
        });

        btn_mlatte.setBackground(new java.awt.Color(255, 255, 255));
        btn_mlatte.setText("M LATTE");
        btn_mlatte.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_mlatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mlatteActionPerformed(evt);
            }
        });

        btn_llatte.setBackground(new java.awt.Color(255, 255, 255));
        btn_llatte.setText("L LATTE");
        btn_llatte.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_llatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_llatteActionPerformed(evt);
            }
        });

        btn_samericano.setBackground(new java.awt.Color(255, 255, 255));
        btn_samericano.setText("S AMERICANO");
        btn_samericano.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_samericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_samericanoActionPerformed(evt);
            }
        });

        btn_mamericano.setBackground(new java.awt.Color(255, 255, 255));
        btn_mamericano.setText("M AMERICANO");
        btn_mamericano.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_mamericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mamericanoActionPerformed(evt);
            }
        });

        btn_lamericano.setBackground(new java.awt.Color(255, 255, 255));
        btn_lamericano.setText("L AMERICANO");
        btn_lamericano.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_lamericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lamericanoActionPerformed(evt);
            }
        });

        btn_sflat.setBackground(new java.awt.Color(255, 255, 255));
        btn_sflat.setText("S FLAT WHITE");
        btn_sflat.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_sflat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sflatActionPerformed(evt);
            }
        });

        btn_mflat.setBackground(new java.awt.Color(255, 255, 255));
        btn_mflat.setText("M FLAT WHITE");
        btn_mflat.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_mflat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mflatActionPerformed(evt);
            }
        });

        btn_lflat.setBackground(new java.awt.Color(255, 255, 255));
        btn_lflat.setText("L FLAT WHITE");
        btn_lflat.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_lflat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lflatActionPerformed(evt);
            }
        });

        btn_smocha.setBackground(new java.awt.Color(255, 255, 255));
        btn_smocha.setText("S MOCHA");
        btn_smocha.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_smocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_smochaActionPerformed(evt);
            }
        });

        btn_mmocha.setBackground(new java.awt.Color(255, 255, 255));
        btn_mmocha.setText("M MOCHA");
        btn_mmocha.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_mmocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mmochaActionPerformed(evt);
            }
        });

        btn_lmocha.setBackground(new java.awt.Color(255, 255, 255));
        btn_lmocha.setText("L MOCHA");
        btn_lmocha.setMaximumSize(new java.awt.Dimension(100, 35));
        btn_lmocha.setMinimumSize(new java.awt.Dimension(100, 35));
        btn_lmocha.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_lmocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lmochaActionPerformed(evt);
            }
        });

        btn_awhite.setBackground(new java.awt.Color(255, 255, 255));
        btn_awhite.setText("S WHITE MOCHA");
        btn_awhite.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_awhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_awhiteActionPerformed(evt);
            }
        });

        btn_mwhite.setBackground(new java.awt.Color(255, 255, 255));
        btn_mwhite.setText("M WHITE MOCHA");
        btn_mwhite.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_mwhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mwhiteActionPerformed(evt);
            }
        });

        btn_lwhite.setBackground(new java.awt.Color(255, 255, 255));
        btn_lwhite.setText("L WHITE MOCHA");
        btn_lwhite.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_lwhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lwhiteActionPerformed(evt);
            }
        });

        btn_syrup.setBackground(new java.awt.Color(255, 255, 255));
        btn_syrup.setText(" SYRUP");
        btn_syrup.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_syrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_syrupActionPerformed(evt);
            }
        });

        btn_espresso.setBackground(new java.awt.Color(255, 255, 255));
        btn_espresso.setText("ESPRESSO");
        btn_espresso.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_espresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_espressoActionPerformed(evt);
            }
        });

        btn_odeme.setBackground(new java.awt.Color(255, 255, 255));
        btn_odeme.setText("ÖDEME");
        btn_odeme.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_odeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_odemeActionPerformed(evt);
            }
        });

        btn_temizle.setBackground(new java.awt.Color(255, 255, 255));
        btn_temizle.setText("TEMİZLE");
        btn_temizle.setPreferredSize(new java.awt.Dimension(135, 35));
        btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temizleActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(255, 102, 51));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton20.setText("SİPARİŞLER");

        lbltoplam.setBackground(new java.awt.Color(255, 255, 255));
        lbltoplam.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbltoplam.setForeground(new java.awt.Color(255, 255, 255));
        lbltoplam.setText("TOPLAM TUTAR :        0 tl");

        list.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbltoplam, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                    .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_awhite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_smocha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_sflat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_samericano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_slatte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(btn_lmocha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_mmocha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(btn_mwhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_lwhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_mflat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_mamericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_lamericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_lflat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(btn_mlatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_llatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btn_odeme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(btn_syrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_espresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_slatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_mlatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_llatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_samericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_lamericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_mamericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_sflat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_mflat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_lflat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_smocha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_lmocha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_mmocha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_awhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mwhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lwhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltoplam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_odeme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_syrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_espresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_slatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_slatteActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("slatte    ")){ 
                    list.addItem("  S LATTE                             " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
                } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        
       
    }//GEN-LAST:event_btn_slatteActionPerformed

    private void btn_odemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_odemeActionPerformed
        try{
            PaymentPageDesign screen2 = new PaymentPageDesign();
            screen2.setVisible(true);
            String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
            Connection con = DriverManager.getConnection(url);
            String sql = "UPDATE prices SET price=? WHERE name=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, tutar);
            statement.setString(2, "tutar");
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully!");
            }

        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btn_odemeActionPerformed

    private void btn_mflatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mflatActionPerformed
         try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("mflat     ")){ 
                    list.addItem("  M FLAT WHITE                   " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_mflatActionPerformed

    private void btn_awhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_awhiteActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("swhite    ")){ 
                    list.addItem("  S WHITE MOCHA               " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_awhiteActionPerformed

    private void btn_mlatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mlatteActionPerformed
         try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("mlatte    ")){ 
                    list.addItem("  M LATTE                             " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_mlatteActionPerformed

    private void btn_llatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_llatteActionPerformed
         try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("llatte    ")){ 
                    list.addItem("  L LATTE                             " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_llatteActionPerformed

    private void btn_samericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_samericanoActionPerformed
         try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("samericano")){ 
                    list.addItem("  S AMERICANO                   " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
                } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_samericanoActionPerformed

    private void btn_mamericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mamericanoActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("mamericano")){ 
                    list.addItem("  M AMERICANO                   " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_mamericanoActionPerformed

    private void btn_lamericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lamericanoActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("lamericano")){ 
                    list.addItem("  L AMERICANO                   " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_lamericanoActionPerformed

    private void btn_sflatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sflatActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("sflat     ")){ 
                    list.addItem(" S FLAT WHITE                    " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_sflatActionPerformed

    private void btn_lflatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lflatActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("lflat     ")){ 
                    list.addItem("  L FLAT WHITE                    " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_lflatActionPerformed

    private void btn_smochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_smochaActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("smocha    ")){ 
                    list.addItem("  S MOCHA                          " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_smochaActionPerformed

    private void btn_mmochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mmochaActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("mmocha    ")){ 
                    list.addItem("  M MOCHA                          " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_mmochaActionPerformed

    private void btn_lmochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lmochaActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("lmocha    ")){ 
                    list.addItem("  L MOCHA                          " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_lmochaActionPerformed

    private void btn_mwhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mwhiteActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("mwhite    ")){ 
                    list.addItem("  M WHITE MOCHA               " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_mwhiteActionPerformed

    private void btn_lwhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lwhiteActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("lwhite    ")){ 
                    list.addItem("  L WHITE MOCHA               " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_lwhiteActionPerformed

    private void btn_syrupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_syrupActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("syrup     ")){ 
                    list.addItem("  SYRUP                               " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_syrupActionPerformed

    private void btn_espressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_espressoActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("espresso  ")){ 
                    list.addItem("  ESPRESSO                        " +rs.getString("price") + " tl");
                    tutar += rs.getInt("price");
                    lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
                   break; 
               }
               } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_espressoActionPerformed

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temizleActionPerformed
        list.clear();
        tutar=0;
        lbltoplam.setText("TOPLAM TUTAR :        " + tutar + " tl");
        try{
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
            Connection con = DriverManager.getConnection(url);
            String sql = "UPDATE prices SET price=? WHERE name=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1,0);
            statement.setString(2, "tutar");
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully!");
            }

        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_temizleActionPerformed

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoffeePageDesign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_awhite;
    private javax.swing.JButton btn_espresso;
    private javax.swing.JButton btn_lamericano;
    private javax.swing.JButton btn_lflat;
    private javax.swing.JButton btn_llatte;
    private javax.swing.JButton btn_lmocha;
    private javax.swing.JButton btn_lwhite;
    private javax.swing.JButton btn_mamericano;
    private javax.swing.JButton btn_mflat;
    private javax.swing.JButton btn_mlatte;
    private javax.swing.JButton btn_mmocha;
    private javax.swing.JButton btn_mwhite;
    private javax.swing.JButton btn_odeme;
    private javax.swing.JButton btn_samericano;
    private javax.swing.JButton btn_sflat;
    private javax.swing.JButton btn_slatte;
    private javax.swing.JButton btn_smocha;
    private javax.swing.JButton btn_syrup;
    private javax.swing.JButton btn_temizle;
    private javax.swing.JButton jButton20;
    private javax.swing.JLabel lbltoplam;
    private java.awt.List list;
    private java.awt.List list1;
    private java.awt.List list3;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
