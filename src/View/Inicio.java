/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Win10
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JPanel();
        button_emprestimos = new javax.swing.JButton();
        button_amigos = new javax.swing.JButton();
        button_ferramentas = new javax.swing.JButton();
        button_eventos = new javax.swing.JButton();
        button_relatorios = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tiozao_label = new javax.swing.JLabel();
        do_label = new javax.swing.JLabel();
        empresta_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        menuPrincipal.setBackground(new java.awt.Color(255, 153, 51));

        button_emprestimos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_emprestimos.setText("Empréstimos");
        button_emprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_emprestimosActionPerformed(evt);
            }
        });

        button_amigos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_amigos.setText("Amigos");
        button_amigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_amigosActionPerformed(evt);
            }
        });

        button_ferramentas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_ferramentas.setText("Ferramentas");
        button_ferramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ferramentasActionPerformed(evt);
            }
        });

        button_eventos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_eventos.setText("Eventos");
        button_eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_eventosActionPerformed(evt);
            }
        });

        button_relatorios.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_relatorios.setText("Relatórios");
        button_relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_relatoriosActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        tiozao_label.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tiozao_label.setForeground(new java.awt.Color(255, 255, 255));
        tiozao_label.setText("TIOZÃO");

        do_label.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        do_label.setForeground(new java.awt.Color(255, 255, 255));
        do_label.setText("DO");

        empresta_label.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        empresta_label.setForeground(new java.awt.Color(255, 255, 255));
        empresta_label.setText("EMPRESTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(empresta_label)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(do_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiozao_label)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empresta_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tiozao_label, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(do_label))
                .addContainerGap())
        );

        javax.swing.GroupLayout menuPrincipalLayout = new javax.swing.GroupLayout(menuPrincipal);
        menuPrincipal.setLayout(menuPrincipalLayout);
        menuPrincipalLayout.setHorizontalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button_emprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_amigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_ferramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_eventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_relatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPrincipalLayout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(425, 425, 425))
        );
        menuPrincipalLayout.setVerticalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(button_emprestimos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_amigos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_ferramentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_eventos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_relatorios)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_emprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_emprestimosActionPerformed
        // TODO add your handling code here:
        Emprestimos1 emprestimos = new Emprestimos1();
        emprestimos.setVisible(true);
    }//GEN-LAST:event_button_emprestimosActionPerformed

    private void button_amigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_amigosActionPerformed
        // TODO add your handling code here:
        Amigos1 amigos = new Amigos1();
        amigos.setVisible(true);
    }//GEN-LAST:event_button_amigosActionPerformed

    private void button_ferramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ferramentasActionPerformed
        // TODO add your handling code here:
        Ferramentas1 ferramentas = new Ferramentas1();
        ferramentas.setVisible(true);
    }//GEN-LAST:event_button_ferramentasActionPerformed

    private void button_eventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_eventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_eventosActionPerformed

    private void button_relatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_relatoriosActionPerformed
        // TODO add your handling code here:
        Relatorios1 relatorios = new Relatorios1();
        relatorios.setVisible(true);
    }//GEN-LAST:event_button_relatoriosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_amigos;
    private javax.swing.JButton button_emprestimos;
    private javax.swing.JButton button_eventos;
    private javax.swing.JButton button_ferramentas;
    private javax.swing.JButton button_relatorios;
    private javax.swing.JLabel do_label;
    private javax.swing.JLabel empresta_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menuPrincipal;
    private javax.swing.JLabel tiozao_label;
    // End of variables declaration//GEN-END:variables
}
