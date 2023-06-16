/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author Win10
 */
public class Ferramentas extends javax.swing.JPanel {

    /**
     * Creates new form IdlePanel
     */
    public Ferramentas() {
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

        ferramentaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ferramentas = new javax.swing.JTable();
        ferramentaLabel = new javax.swing.JLabel();
        button_adicionar = new javax.swing.JButton();
        button_editar = new javax.swing.JButton();
        button_remover = new javax.swing.JButton();

        ferramentaPanel.setBackground(new java.awt.Color(255, 255, 255));

        table_ferramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Marca", "Custo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_ferramentas.setColumnSelectionAllowed(true);
        table_ferramentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_ferramentas);
        table_ferramentas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents

    private void button_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_editarActionPerformed

    private void button_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_adicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_adicionarActionPerformed

    private void button_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_removerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_removerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_adicionar;
    private javax.swing.JButton button_editar;
    private javax.swing.JButton button_remover;
    private javax.swing.JLabel ferramentaLabel;
    private javax.swing.JPanel ferramentaPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_ferramentas;
    // End of variables declaration//GEN-END:variables
}