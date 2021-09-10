/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Alejo Giraldo
 */
public class EventosBotones extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form EventosBotones
     */
    public EventosBotones() {
        initComponents();
        terceraForma();
        cuartaForma();
        //Segunda forma
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Segunda forma");
            }
        });
    }
    
    //Tercera forma
    private void terceraForma() { 
        JButton temp;
        for (int i = 2; i < 4; i++) {
            temp = new JButton("Botón " + (i+1));
            temp.setActionCommand(""+(i+1));
            temp.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Tercera forma, botón: " + e.getActionCommand());
                }
            });
            this.add(temp);
       }
    }

    private void cuartaForma(){
        JButton temp;
        for (int i = 4; i < 6; i++) {
            temp = new JButton("Botón " + (i+1));
            temp.setActionCommand("Botón " + (i+1));
            temp.addActionListener(this);
            this.add(temp);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        getContentPane().setLayout(flowLayout1);

        btn1.setText("Botón 1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeraForma(evt);
            }
        });
        getContentPane().add(btn1);

        btn2.setText("Botón 2");
        getContentPane().add(btn2);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Primera forma
    private void primeraForma(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeraForma
        System.out.println("Primera forma");
    }//GEN-LAST:event_primeraForma

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EventosBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventosBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventosBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventosBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventosBotones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cuarta forma");
    }
}