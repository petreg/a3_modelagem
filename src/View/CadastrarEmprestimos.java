/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Friends;
import Model.Tools;
import Model.Loan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus Soares
 */
public class CadastrarEmprestimos extends javax.swing.JFrame {
    
    private Friends objAmigo;
    private Tools objTool;
    private Loan objLoan;
    /**
     * Creates new form emprestimos1
     */
    public CadastrarEmprestimos() {
        initComponents();
        this.objAmigo = new Friends();
        this.objTool = new Tools();
        this.objLoan = new Loan();
        this.loadFriends();
        this.loadTools();
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
        idlePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_amigo = new javax.swing.JTable();
        selecioneOperacao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_ferramenta = new javax.swing.JTable();
        b_confirmar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        idlePanel.setBackground(new java.awt.Color(255, 255, 255));

        t_amigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Amigo", "E-mail", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_amigo.setColumnSelectionAllowed(true);
        t_amigo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_amigo);
        t_amigo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        selecioneOperacao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        selecioneOperacao.setText("Fazer Emprestimo");

        t_ferramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Ferramenta", "Marca", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_ferramenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(t_ferramenta);
        t_ferramenta.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        b_confirmar.setBackground(new java.awt.Color(0, 153, 51));
        b_confirmar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        b_confirmar.setForeground(new java.awt.Color(255, 255, 255));
        b_confirmar.setText("Confirmar");
        b_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_confirmarActionPerformed(evt);
            }
        });

        b_cancelar.setBackground(new java.awt.Color(255, 10, 15));
        b_cancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        b_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        b_cancelar.setText("Devolver");
        b_cancelar.setActionCommand("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout idlePanelLayout = new javax.swing.GroupLayout(idlePanel);
        idlePanel.setLayout(idlePanelLayout);
        idlePanelLayout.setHorizontalGroup(
            idlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(idlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(idlePanelLayout.createSequentialGroup()
                        .addGroup(idlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecioneOperacao)
                            .addGroup(idlePanelLayout.createSequentialGroup()
                                .addComponent(b_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        idlePanelLayout.setVerticalGroup(
            idlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idlePanelLayout.createSequentialGroup()
                .addComponent(selecioneOperacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(idlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(idlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_confirmarActionPerformed
       
         try {
            int friend_id = 0;
            int tool_id = 0;
            if (this.t_amigo.getSelectedRow() == -1) {
                throw new Mensagens("Você deve selecionar um amigo.");
            } else {
                friend_id = Integer.parseInt(this.t_amigo.getValueAt(this.t_amigo.getSelectedRow(), 0).toString());
            }
            
            if (this.t_ferramenta.getSelectedRow() == -1) {
                throw new Mensagens("Você deve selecionar uma ferramenta.");
            } else {
                tool_id = Integer.parseInt(this.t_ferramenta.getValueAt(this.t_ferramenta.getSelectedRow(), 0).toString());
            }

            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Realizar emprestimo?");

            if (resposta_usuario == 0) {// clicou em SIM
                
                if ( objLoan.insertLoan(tool_id, friend_id)) {
                    JOptionPane.showMessageDialog(rootPane, "Emprestimo realizado com sucesso!");
                    this.setVisible(false);
                }
            }

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_b_confirmarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_cancelarActionPerformed

    
    @SuppressWarnings("unchecked")
    public void loadFriends() {

        DefaultTableModel tModelo = (DefaultTableModel) this.t_amigo.getModel();
        tModelo.setNumRows(0);

        ArrayList<Friends> list = new ArrayList<>();
        list = objAmigo.getFriends();

        for (Friends amigo : list) {
            tModelo.addRow(new Object[]{
                amigo.getId(),
                amigo.getName(),
                amigo.getEmail(),
                amigo.getTel()
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    public void loadTools() {

        DefaultTableModel tModelo = (DefaultTableModel) this.t_ferramenta.getModel();
        tModelo.setNumRows(0);

        ArrayList<Tools> list = new ArrayList<>();
        list = objTool.getLoanTools();

        for (Tools ferramenta : list) {
            tModelo.addRow(new Object[]{
                ferramenta.getId(),
                ferramenta.getName(),
                ferramenta.getBrand(),
                ferramenta.getValue()
            });
        }
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
            java.util.logging.Logger.getLogger(CadastrarEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarEmprestimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_confirmar;
    private javax.swing.JPanel idlePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel selecioneOperacao;
    private javax.swing.JTable t_amigo;
    private javax.swing.JTable t_ferramenta;
    // End of variables declaration//GEN-END:variables
}
