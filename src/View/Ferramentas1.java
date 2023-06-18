/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Tools;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author petreg
 */
public class Ferramentas1 extends javax.swing.JFrame {
    

    private Tools objTools;
    /**
     * Creates new form Ferramentas1
     */
    public Ferramentas1() {
        initComponents();
        this.objTools = new Tools();
        this.loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ferramentaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_ferramentas = new javax.swing.JTable();
        ferramentaLabel = new javax.swing.JLabel();
        button_adicionar = new javax.swing.JButton();
        button_editar = new javax.swing.JButton();
        button_remover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        ferramentaPanel.setBackground(new java.awt.Color(255, 255, 255));

        t_ferramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Nome", "Marca", "Custo"
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
        t_ferramentas.setColumnSelectionAllowed(true);
        t_ferramentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_ferramentas);
        t_ferramentas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        ferramentaLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ferramentaLabel.setText("Ferramentas Cadastradas");

        button_adicionar.setBackground(new java.awt.Color(0, 153, 51));
        button_adicionar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_adicionar.setForeground(new java.awt.Color(255, 255, 255));
        button_adicionar.setText("Adicionar");
        button_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_adicionarActionPerformed(evt);
            }
        });

        button_editar.setBackground(new java.awt.Color(0, 153, 153));
        button_editar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_editar.setForeground(new java.awt.Color(255, 255, 255));
        button_editar.setText("Editar");
        button_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editarActionPerformed(evt);
            }
        });

        button_remover.setBackground(new java.awt.Color(204, 0, 0));
        button_remover.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_remover.setForeground(new java.awt.Color(255, 255, 255));
        button_remover.setText("Remover");
        button_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_removerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ferramentaPanelLayout = new javax.swing.GroupLayout(ferramentaPanel);
        ferramentaPanel.setLayout(ferramentaPanelLayout);
        ferramentaPanelLayout.setHorizontalGroup(
            ferramentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ferramentaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ferramentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(ferramentaPanelLayout.createSequentialGroup()
                        .addGroup(ferramentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ferramentaLabel)
                            .addGroup(ferramentaPanelLayout.createSequentialGroup()
                                .addComponent(button_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ferramentaPanelLayout.setVerticalGroup(
            ferramentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ferramentaPanelLayout.createSequentialGroup()
                .addComponent(ferramentaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ferramentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(button_editar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(button_remover, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ferramentaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ferramentaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_adicionarActionPerformed
        // TODO add your handling code here:
        CadastrarFerramenta cadastrar = new CadastrarFerramenta();
        cadastrar.setVisible(true);
    }//GEN-LAST:event_button_adicionarActionPerformed

    private void button_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editarActionPerformed
        // TODO add your handling code here:
        try{
            int id = 0;
            if (this.t_ferramentas.getSelectedRow() == -1) {
                throw new Mensagens("Você deve selecionar uma ferramenta para editar");
            } else {
                id = Integer.parseInt(this.t_ferramentas.getValueAt(this.t_ferramentas.getSelectedRow(), 0).toString());
            }
            CadastrarFerramenta cadastrar = new CadastrarFerramenta(id);
            cadastrar.setVisible(true);
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_button_editarActionPerformed

    private void button_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_removerActionPerformed
        // TODO add your handling code here:
         try {
            int id = 0;
            
            if (this.t_ferramentas.getSelectedRow() == -1) {
                throw new Mensagens("Você deve selecionar um amigo para APAGAR");
            } else {
                id = Integer.parseInt(this.t_ferramentas.getValueAt(this.t_ferramentas.getSelectedRow(), 0).toString());
            }

            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Este proceso não pode ser revertido.\nVOCÊ TEM CERTEZA QUE QUER APAGAR?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Aluno processar
                if (this.objTools.deleteTool(id)) {
                    JOptionPane.showMessageDialog(rootPane, "Dado apagado com sucesso!");

                }

            }

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        this.loadData();
    }//GEN-LAST:event_button_removerActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        this.loadData();
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(Ferramentas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ferramentas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ferramentas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ferramentas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ferramentas1().setVisible(true);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    public void loadData() {

        DefaultTableModel tModelo = (DefaultTableModel) this.t_ferramentas.getModel();
        tModelo.setNumRows(0);

        ArrayList<Tools> list = new ArrayList<>();
        list = objTools.getTools();

        for (Tools ferramenta : list) {
            tModelo.addRow(new Object[]{
                ferramenta.getId(),
                ferramenta.getName(),
                ferramenta.getBrand(),
                ferramenta.getValue()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_adicionar;
    private javax.swing.JButton button_editar;
    private javax.swing.JButton button_remover;
    private javax.swing.JLabel ferramentaLabel;
    private javax.swing.JPanel ferramentaPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t_ferramentas;
    // End of variables declaration//GEN-END:variables
}
