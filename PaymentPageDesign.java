package micros;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PaymentPageDesign extends javax.swing.JFrame {

    int tutar=0;
    int verilentutar=0;
    int odenecektutar=0;
    

    public PaymentPageDesign() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        panel1 = new java.awt.Panel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lblgeriodeme = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txthesapno = new javax.swing.JTextField();
        txtsifre = new javax.swing.JPasswordField();
        btnindirim30 = new javax.swing.JButton();
        lblbasari = new javax.swing.JLabel();
        btnacikindirim = new javax.swing.JButton();
        lblacikindirimtutar = new javax.swing.JTextField();
        btnlindirim10 = new javax.swing.JButton();
        btntutar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(102, 102, 102));
        panel1.setPreferredSize(new java.awt.Dimension(843, 433));

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("NAKİT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("KART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn20.setBackground(new java.awt.Color(255, 255, 255));
        btn20.setText("20 tl");
        btn20.setToolTipText("");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn50.setBackground(new java.awt.Color(255, 255, 255));
        btn50.setText("50 tl");
        btn50.setToolTipText("");
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });

        btn100.setBackground(new java.awt.Color(255, 255, 255));
        btn100.setText("100 tl");
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });

        btn200.setBackground(new java.awt.Color(255, 255, 255));
        btn200.setText("200 tl");
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Geri Ödenecek Tutar");

        lblgeriodeme.setBackground(new java.awt.Color(255, 255, 255));
        lblgeriodeme.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblgeriodeme.setForeground(new java.awt.Color(102, 102, 102));
        lblgeriodeme.setText(".");

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Hesap No");

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Şifre");

        txthesapno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthesapnoActionPerformed(evt);
            }
        });

        btnindirim30.setBackground(new java.awt.Color(255, 102, 51));
        btnindirim30.setText("% 30 İndirim");
        btnindirim30.setPreferredSize(new java.awt.Dimension(74, 16));
        btnindirim30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnindirim30ActionPerformed(evt);
            }
        });

        lblbasari.setBackground(new java.awt.Color(255, 255, 255));
        lblbasari.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblbasari.setForeground(new java.awt.Color(102, 102, 102));
        lblbasari.setText(".");

        btnacikindirim.setBackground(new java.awt.Color(255, 102, 51));
        btnacikindirim.setText("Açık İndirim");
        btnacikindirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacikindirimActionPerformed(evt);
            }
        });

        lblacikindirimtutar.setText("0");

        btnlindirim10.setBackground(new java.awt.Color(255, 102, 51));
        btnlindirim10.setText("% 10 İndirim");
        btnlindirim10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlindirim10ActionPerformed(evt);
            }
        });

        btntutar.setBackground(new java.awt.Color(255, 102, 51));
        btntutar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btntutar.setText("     TOPLAM TUTAR :            0");
        btntutar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btntutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btntutar, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn100))
                                .addGap(36, 36, 36)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn200)
                                    .addComponent(lblgeriodeme, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txthesapno, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(txtsifre))))
                .addGap(51, 51, 51)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnindirim30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnacikindirim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblacikindirimtutar)
                    .addComponent(btnlindirim10, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblbasari, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btntutar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn20)
                            .addComponent(btn50)
                            .addComponent(txthesapno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn100)
                            .addComponent(btn200)
                            .addComponent(jButton9)
                            .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(lblacikindirimtutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton7)
                                    .addComponent(lblgeriodeme, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnlindirim10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnindirim30, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnacikindirim, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblbasari, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        btn100.setBackground(Color.LIGHT_GRAY);
        verilentutar = 100;
    }//GEN-LAST:event_btn100ActionPerformed

    private void txthesapnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthesapnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthesapnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
                    Connection con = DriverManager.getConnection(url);
                    String sql = "SELECT * FROM prices";
                    PreparedStatement pst = con.prepareStatement(sql);
                    ResultSet rs= pst.executeQuery();
                    while(rs.next()) {
                        String name = rs.getString("name"); 
                         if( name.equals("tutar     ")){ 
                            tutar = Integer.valueOf(rs.getString("price"));
                            break; 
                        }
                    } 
           
                    con.close();
           
                    }
                    catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            if(tutar>verilentutar){
                lblbasari.setForeground(Color.white);
                lblbasari.setText("Ödeme başarısız..!");
            }
            else{
                odenecektutar=verilentutar-tutar;
                lblgeriodeme.setForeground(Color.white);
                lblgeriodeme.setText(String.valueOf(odenecektutar) + " tl ");
                lblbasari.setForeground(Color.white);
                lblbasari.setText("Ödeme başarılı..!");
            }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnlindirim10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlindirim10ActionPerformed
        
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
                    Connection con = DriverManager.getConnection(url);
                    String sql = "SELECT * FROM prices";
                    PreparedStatement pst = con.prepareStatement(sql);
                    ResultSet rs= pst.executeQuery();
                    while(rs.next()) {
                        String name = rs.getString("name"); 
                         if( name.equals("tutar     ")){ 
                            tutar = Integer.valueOf(rs.getString("price"));
                            break; 
                        }
                    } 
           
                    con.close();
           
                    }
                    catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
        
        tutar = (tutar - (tutar/10));
       
        String txt= "     TOPLAM TUTAR :            " + tutar;
        btntutar.setText(txt);
        
        try{
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
            Connection con = DriverManager.getConnection(url);
            String sql = "UPDATE prices SET price=? WHERE name=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, tutar);
            statement.setString(2, "tutar");
            int rowsUpdated = statement.executeUpdate();
            

        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
    }//GEN-LAST:event_btnlindirim10ActionPerformed

    private void btntutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntutarActionPerformed
         try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
                    Connection con = DriverManager.getConnection(url);
                    String sql = "SELECT * FROM prices";
                    PreparedStatement pst = con.prepareStatement(sql);
                    ResultSet rs= pst.executeQuery();
                    while(rs.next()) {
                        String name = rs.getString("name"); 
                         if( name.equals("tutar     ")){ 
                            String txt= "     TOPLAM TUTAR :            " + rs.getString("price");
                            btntutar.setText(txt);
                            
                            break; 
                        }
                    } 
           
                    con.close();
           
                    }
                    catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
    }//GEN-LAST:event_btntutarActionPerformed

    private void btnindirim30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnindirim30ActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
                    Connection con = DriverManager.getConnection(url);
                    String sql = "SELECT * FROM prices";
                    PreparedStatement pst = con.prepareStatement(sql);
                    ResultSet rs= pst.executeQuery();
                    while(rs.next()) {
                        String name = rs.getString("name"); 
                         if( name.equals("tutar     ")){ 
                            tutar = Integer.valueOf(rs.getString("price"));
                            break; 
                        }
                    } 
           
                    con.close();
           
                    }
                    catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
        
        tutar = (tutar - ((tutar*3)/10));
       
        String txt= "     TOPLAM TUTAR :            " + tutar;
        btntutar.setText(txt);
        
        try{
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
            Connection con = DriverManager.getConnection(url);
            String sql = "UPDATE prices SET price=? WHERE name=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, tutar);
            statement.setString(2, "tutar");
            int rowsUpdated = statement.executeUpdate();
            

        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnindirim30ActionPerformed

    private void btnacikindirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacikindirimActionPerformed
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
                    Connection con = DriverManager.getConnection(url);
                    String sql = "SELECT * FROM prices";
                    PreparedStatement pst = con.prepareStatement(sql);
                    ResultSet rs= pst.executeQuery();
                    while(rs.next()) {
                        String name = rs.getString("name"); 
                         if( name.equals("tutar     ")){ 
                            tutar = Integer.valueOf(rs.getString("price"));
                            break; 
                        }
                    } 
           
                    con.close();
           
                    }
                    catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
        int indirim = Integer.valueOf(lblacikindirimtutar.getText());
        tutar -= indirim;
       
        String txt= "     TOPLAM TUTAR :            " + tutar;
        btntutar.setText(txt);
        
        try{
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
            Connection con = DriverManager.getConnection(url);
            String sql = "UPDATE prices SET price=? WHERE name=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, tutar);
            statement.setString(2, "tutar");
            int rowsUpdated = statement.executeUpdate();
            

        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnacikindirimActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
       
        btn20.setBackground(Color.LIGHT_GRAY);
        verilentutar = 20;
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        btn50.setBackground(Color.LIGHT_GRAY);
        verilentutar = 50;
    }//GEN-LAST:event_btn50ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        btn200.setBackground(Color.LIGHT_GRAY);
        verilentutar = 200;
    }//GEN-LAST:event_btn200ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int hesapno = Integer.valueOf(txthesapno.getText());
        int sifre = 0;
        sifre = Integer.valueOf(txtsifre.getText());
        String password = " ";
        int issuccess2 = 0;
        try{ String url = "jdbc:sqlserver://localhost:1433;databaseName=coffee; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM prices";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("name"); 
               if( name.equals("52820800  ")){ 
                   if( sifre == rs.getInt("price"))
                       issuccess2=1;
                    break; 
               }
               } 
           if(issuccess2==1){
                lblbasari.setForeground(Color.white);
                lblbasari.setText("Ödeme başarılı..!");
           }
           else {
                lblbasari.setForeground(Color.white);
                lblbasari.setText("Ödeme başarısız..!");
           }
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaymentPageDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentPageDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentPageDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentPageDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentPageDesign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btnacikindirim;
    private javax.swing.JButton btnindirim30;
    private javax.swing.JButton btnlindirim10;
    private javax.swing.JButton btntutar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lblacikindirimtutar;
    private javax.swing.JLabel lblbasari;
    private javax.swing.JLabel lblgeriodeme;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txthesapno;
    private javax.swing.JPasswordField txtsifre;
    // End of variables declaration//GEN-END:variables

    private Color Color(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
