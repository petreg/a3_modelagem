/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Tools;
import DAO.ToolsDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public class CadastrarFerramenta extends javax.swing.JFrame {

    private int id;
    private Tools objTool;
    private ToolsDAO dao;
    /**
     * Creates new form CadastrarAmigo
     */
    public CadastrarFerramenta() {
        initComponents();
        this.objTool = new Tools();
    }
    
    public CadastrarFerramenta(int id) {
        initComponents();
        this.objTool = new Tools();
        this.dao = new ToolsDAO();
        this.id = id;
        this.loadData(id);
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
        marcaLabel = new javax.swing.JLabel();
        c_brand = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        custoLabel = new javax.swing.JLabel();
        b_salvar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        custoLabel1 = new javax.swing.JLabel();
        c_value = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Amigo");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(800, 315));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        marcaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        marcaLabel.setText("Marca:");

        c_brand.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        nomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeLabel.setText("Nome:");

        c_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        custoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custoLabel.setText("Custo:");

        b_salvar.setBackground(new java.awt.Color(0, 153, 0));
        b_salvar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        b_salvar.setForeground(new java.awt.Color(255, 255, 255));
        b_salvar.setText("Salvar");
        b_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salvarActionPerformed(evt);
            }
        });

        b_cancelar.setBackground(new java.awt.Color(204, 0, 0));
        b_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        b_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        custoLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custoLabel1.setText("R$");

        c_value.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        c_value.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        c_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_valueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(custoLabel)
                        .addComponent(nomeLabel)
                        .addComponent(marcaLabel)
                        .addComponent(c_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c_name, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(custoLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_value, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(marcaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(custoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custoLabel1)
                    .addComponent(c_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_salvar)
                    .addComponent(b_cancelar))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_valueActionPerformed
        try {
            String name =  "";
            String brand= "";
            float value;

            if (this.c_name.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 3 caracteres.");
            } else {
                name = this.c_name.getText();
            }
            
            if (this.c_brand.getText().length() < 2) {
                brand = this.c_brand.getText();
            } else {
                throw new Mensagens("Marca deve conter pelo menos 3 caracteres.");
            }
        
            if (Float.parseFloat(this.c_value.getText()) <= 0) {
                value = Float.parseFloat(this.c_value.getText());
            } else {
                throw new Mensagens("Valor em formatoi inválido.");
            }

            if(this.id > 0) {
                if (this.objTool.editTool(id, name, brand, value)) {
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta editada com sucesso!");
                }
            } else {
                if (this.objTool.insertTool(name, brand, value)) {
                JOptionPane.showMessageDialog(rootPane, "Ferrramenta cadastrada com cucesso!");
                }
            }
            
            this.c_name.setText("");
            this.c_brand.setText("");
            this.c_value.setText("");
            this.setVisible(false);
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarAmigo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_c_valueActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        // TODO add your handling code here:
        this.c_name.setText("");
        this.c_brand.setText("");
        this.c_value.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salvarActionPerformed
        try {
            String name =  "";
            String brand = "";
            float value;

            if (this.c_name.getText().length() < 2) {
                throw new Mensagens("O nome deve conter ao menos 3 caracteres.");
            } else {
                name = this.c_name.getText();
            }
            
            if (this.c_brand.getText().length() < 2) {
                throw new Mensagens("A marca deve conter ao menos 3 caracteres.");
            } else {
                brand = this.c_brand.getText();
            }

            if (this.c_value.getText().length() < 1) {
                throw new Mensagens("O valor é obrigatório.");
            } else {
                String unformated = this.c_value.getText().replaceAll("\\.(?=.*\\d)|\\D", "");
                value = Float.parseFloat(unformated.replace(',','.'));
                System.out.println(value);
            }
           
            if(this.id > 0) {
                if (this.objTool.editTool(id ,name, brand, value)) {
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta editada com sucesso!");
                }
            } else {
                if (this.objTool.insertTool(name, brand, value)) {
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta cadastrada com sucesso!");
                }
            }
            
            this.c_name.setText("");
            this.c_brand.setText("");
            this.c_value.setText("");
            this.setVisible(false);
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarAmigo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_salvarActionPerformed

        private void loadData(int id) {
        Tools edit = this.dao.loadFriend(id);
        this.c_name.setText(edit.getName());
        this.c_brand.setText(edit.getBrand());
        this.c_value.setText(String.valueOf( edit.getValue()).replace('.', ','));
    }
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
            java.util.logging.Logger.getLogger(CadastrarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_salvar;
    private javax.swing.JTextField c_brand;
    private javax.swing.JTextField c_name;
    private javax.swing.JFormattedTextField c_value;
    private javax.swing.JLabel custoLabel;
    private javax.swing.JLabel custoLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel marcaLabel;
    private javax.swing.JLabel nomeLabel;
    // End of variables declaration//GEN-END:variables
}
