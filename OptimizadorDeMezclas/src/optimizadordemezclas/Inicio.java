/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizadordemezclas;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Luigi
 */
public class Inicio extends javax.swing.JPanel {

    
    private String[] estado;
    private String path;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        path = System.getProperty("user.dir");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnCalcula = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txLinea = new javax.swing.JLabel();
        txB1n = new javax.swing.JLabel();
        txB1c = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txB1x = new javax.swing.JLabel();
        txCst = new javax.swing.JLabel();
        txTemp = new javax.swing.JLabel();
        txCp = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txGrado = new javax.swing.JLabel();
        txB2n = new javax.swing.JLabel();
        txB2c = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txB2x = new javax.swing.JLabel();
        txColor = new javax.swing.JLabel();
        txVol = new javax.swing.JLabel();
        txCpM = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código de producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 110, -1, -1));

        jTextField1.setBackground(new java.awt.Color(97, 212, 195));
        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, 39));

        btnCalcula.setText("Calcular");
        btnCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 70, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 740));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("bleble");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Código del producto");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("CP sin mejorador:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Línea:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("B1 Nombre:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("B1 Código:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        txLinea.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txLinea.setForeground(new java.awt.Color(204, 204, 204));
        txLinea.setText("blebleble");
        txLinea.setName("txLinea"); // NOI18N
        add(txLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        txB1n.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txB1n.setForeground(new java.awt.Color(204, 204, 204));
        txB1n.setText("blebleble");
        add(txB1n, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        txB1c.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txB1c.setForeground(new java.awt.Color(204, 204, 204));
        txB1c.setText("blebleble");
        add(txB1c, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("B1 X1:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("cSt a 100°C:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Temp para CCS:");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        txB1x.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txB1x.setForeground(new java.awt.Color(204, 204, 204));
        txB1x.setText("blebleble");
        add(txB1x, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        txCst.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txCst.setForeground(new java.awt.Color(204, 204, 204));
        txCst.setText("blebleble");
        add(txCst, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        txTemp.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txTemp.setForeground(new java.awt.Color(204, 204, 204));
        txTemp.setText("blebleble");
        add(txTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        txCp.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txCp.setForeground(new java.awt.Color(204, 204, 204));
        txCp.setText("blebleble");
        add(txCp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, -1, -1));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("CP con mejorador:");
        add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, -1, -1));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Grado:");
        add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("B2 Nombre:");
        add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, -1, -1));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("B2 Código:");
        add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, -1, -1));

        txGrado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txGrado.setForeground(new java.awt.Color(204, 204, 204));
        txGrado.setText("blebleble");
        add(txGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));

        txB2n.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txB2n.setForeground(new java.awt.Color(204, 204, 204));
        txB2n.setText("blebleble");
        add(txB2n, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        txB2c.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txB2c.setForeground(new java.awt.Color(204, 204, 204));
        txB2c.setText("blebleble");
        add(txB2c, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, -1));

        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("B2 X2:");
        add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, -1, -1));

        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setText("Color:");
        add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, -1));

        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Volatilidad:");
        add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, -1, -1));

        txB2x.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txB2x.setForeground(new java.awt.Color(204, 204, 204));
        txB2x.setText("blebleble");
        add(txB2x, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, -1, -1));

        txColor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txColor.setForeground(new java.awt.Color(204, 204, 204));
        txColor.setText("blebleble");
        add(txColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, -1, -1));

        txVol.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txVol.setForeground(new java.awt.Color(204, 204, 204));
        txVol.setText("blebleble");
        add(txVol, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, -1, -1));

        txCpM.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txCpM.setForeground(new java.awt.Color(204, 204, 204));
        txCpM.setText("blebleble");
        add(txCpM, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 640, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked
    static String readFile(String path, Charset encoding) throws IOException 
    {
        //System.out.println(path);
      byte[] encoded = Files.readAllBytes(Paths.get(path));
      return new String(encoded, encoding);
    }
    private void cargaEstado(){
       // System.out.println(path);
        try {
          String aux = readFile(path+"/../res.txt",Charset.defaultCharset());
          estado = aux.split(";");
        }
        catch(IOException e){
            System.out.println("Error al leer archivo");
        }
        
    
    }
    private void btnCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaActionPerformed
        // TODO add your handling code here:
        cargaEstado();
        if(estado != null){
            txLinea.setText(estado[0]);
            txB1n.setText(estado[1]);
            txB1c.setText(estado[2]);
            txB1x.setText(estado[3]);
            txCst.setText(estado[4]);
            txTemp.setText(estado[5]);
            txCp.setText(estado[6]);
            txGrado.setText(estado[7]);
            txB2n.setText(estado[8]);
            txB2c.setText(estado[9]);
            txB2x.setText(estado[10]);
            txColor.setText(estado[11]);
            txVol.setText(estado[12]);
            txCpM.setText(estado[13]);
        
        }
    }//GEN-LAST:event_btnCalculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel txB1c;
    private javax.swing.JLabel txB1n;
    private javax.swing.JLabel txB1x;
    private javax.swing.JLabel txB2c;
    private javax.swing.JLabel txB2n;
    private javax.swing.JLabel txB2x;
    private javax.swing.JLabel txColor;
    private javax.swing.JLabel txCp;
    private javax.swing.JLabel txCpM;
    private javax.swing.JLabel txCst;
    private javax.swing.JLabel txGrado;
    private javax.swing.JLabel txLinea;
    private javax.swing.JLabel txTemp;
    private javax.swing.JLabel txVol;
    // End of variables declaration//GEN-END:variables
}
