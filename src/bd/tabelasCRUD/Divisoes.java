/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.tabelasCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Lincoln dos Reis
 */
public class Divisoes extends javax.swing.JFrame {

    /**
     * Creates new form GruposArmados
     */
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    List<Integer> gCodes = null;
    public Divisoes() {
        initComponents();
        selectAll();
    }
    public void selectAll(){
        String url = "jdbc:postgresql://localhost/EPBD2";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","admin");
        props.setProperty("autosave","conservative");
        try {
            conn = DriverManager.getConnection(url, props);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("Select * from divisao");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs = stmt.executeQuery("Select codigog from grupo_armado");
            cbIDGrupo.removeAllItems();
            while(rs.next()){
                cbIDGrupo.addItem(String.valueOf(rs.getInt("codigog")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Divisoes.class.getName()).log(Level.SEVERE, null, ex);
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

        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfIDDivisao = new javax.swing.JTextField();
        cbIDGrupo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfBaixas = new javax.swing.JTextField();
        tfHomens = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfAvioes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfBarcos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfTanques = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnInsert1 = new javax.swing.JButton();
        btnInsert2 = new javax.swing.JButton();
        btnInsert3 = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Baixas"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));

        table.setBackground(new java.awt.Color(102, 102, 102));
        table.setForeground(new java.awt.Color(204, 204, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Baixas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("ID grupo armado");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("ID Divisao");

        tfIDDivisao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cbIDGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("   Baixas da divisão");

        tfBaixas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tfHomens.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Homens");

        tfAvioes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Aviões");

        tfBarcos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Barcos");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Tanques");

        tfTanques.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbIDGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfIDDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfHomens, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfAvioes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfBarcos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfTanques, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(tfBaixas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbIDGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfIDDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfBaixas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfHomens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfAvioes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfBarcos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfTanques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnInsert.setText("Inserir");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnInsert1.setText("Deletar");
        btnInsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert1ActionPerformed(evt);
            }
        });

        btnInsert2.setText("Editar");
        btnInsert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert2ActionPerformed(evt);
            }
        });

        btnInsert3.setText("Atualizar tabela");
        btnInsert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsert)
                    .addComponent(btnInsert2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert1)
                    .addComponent(btnInsert3))
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert3)
                        .addGap(50, 50, 50)
                        .addComponent(btnInsert)
                        .addGap(44, 44, 44)
                        .addComponent(btnInsert1)
                        .addGap(52, 52, 52)
                        .addComponent(btnInsert2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        Integer idGrupo,idDivisao,baixas,homens,avioes,barcos,tanques;
        try{
            idGrupo = Integer.parseInt(cbIDGrupo.getItemAt(cbIDGrupo.getSelectedIndex()));
            idDivisao = Integer.parseInt(tfIDDivisao.getText());
            baixas = Integer.parseInt(tfBaixas.getText());
            homens = Integer.parseInt(tfHomens.getText());
            avioes = Integer.parseInt(tfAvioes.getText());
            barcos = Integer.parseInt(tfBarcos.getText());
            tanques = Integer.parseInt(tfTanques.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
            "Os campos tem de ser números inteiros",
            "Campos Inválidos",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            PreparedStatement sql = conn.prepareStatement("insert into divisao values "
                    + "("+idGrupo+","+idDivisao+","+baixas+","+homens+","
                            + ""+avioes+","+barcos+","+tanques+")");
            sql.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
            "ID da divisão não pode ser repetido",
            "Campos Inválidos",
            JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Divisoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        selectAll();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnInsert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert3ActionPerformed
       selectAll();
    }//GEN-LAST:event_btnInsert3ActionPerformed

    private void btnInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert1ActionPerformed
        if(table.getRowCount()==0){
            JOptionPane.showMessageDialog(null,
            "Não foi possível deletar",
            "Campos insuficientes para a operação",
            JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int idDel=table.getSelectedRow()!=-1
                ?Integer.parseInt(table.getValueAt(table.getSelectedRow(), 1).toString())
                :Integer.parseInt(table.getValueAt(table.getRowCount()-1, 1).toString());
        int idG=table.getSelectedRow()!=-1
                ?Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString())
                :Integer.parseInt(table.getValueAt(table.getRowCount()-1, 0).toString());
        try {
            Statement del = conn.createStatement();
            String sql = "Delete from divisao where coddivisao="+idDel+"and codigog="+idG;
            del.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Divisoes.class.getName()).log(Level.SEVERE, null, ex);
        }
     
      selectAll();
        
    }//GEN-LAST:event_btnInsert1ActionPerformed

    private void btnInsert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert2ActionPerformed
        Integer idGrupo,idDivisao,baixas,homens,avioes,barcos,tanques,idGrupoOld,idDivOld;
        try{
            idGrupo = Integer.parseInt(cbIDGrupo.getItemAt(cbIDGrupo.getSelectedIndex()));
            idGrupoOld = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
            idDivOld = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 1).toString());
            idDivisao = Integer.parseInt(tfIDDivisao.getText());
            baixas = Integer.parseInt(tfBaixas.getText());
            homens = Integer.parseInt(tfHomens.getText());
            avioes = Integer.parseInt(tfAvioes.getText());
            barcos = Integer.parseInt(tfBarcos.getText());
            tanques = Integer.parseInt(tfTanques.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
            "Os campos tem de ser números inteiros",
            "Campos Inválidos",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            PreparedStatement sql = conn.prepareStatement("update divisao set codigog="+idGrupo+",coddivisao="+idDivisao+","
                    + "numbaixasd="+baixas+",homens="+homens+",aviões="+avioes+",barcos="+barcos+","
                            + "tanques="+tanques+" where codigog="+idGrupoOld+" and coddivisao="+idDivOld);
            sql.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
            "ID da divisão não pode ser repetido dentro de um grupo",
            "Campos Inválidos",
            JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Divisoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        selectAll();
    }//GEN-LAST:event_btnInsert2ActionPerformed

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
            java.util.logging.Logger.getLogger(Divisoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Divisoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Divisoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Divisoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Divisoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnInsert1;
    private javax.swing.JButton btnInsert2;
    private javax.swing.JButton btnInsert3;
    private javax.swing.JComboBox<String> cbIDGrupo;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfAvioes;
    private javax.swing.JTextField tfBaixas;
    private javax.swing.JTextField tfBarcos;
    private javax.swing.JTextField tfHomens;
    private javax.swing.JTextField tfIDDivisao;
    private javax.swing.JTextField tfTanques;
    // End of variables declaration//GEN-END:variables
}
