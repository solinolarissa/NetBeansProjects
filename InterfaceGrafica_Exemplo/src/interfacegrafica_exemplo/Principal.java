/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica_exemplo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Computer
 */
public class Principal extends javax.swing.JFrame {
    ArrayList<Departamento>ListaDep;
    String modo;   
            public void LoadTableDep(){
            DefaultTableModel modelo = new DefaultTableModel (new Object[]{"Código", "Nome"}, 0);
           
       
       for(int i=0; i<ListaDep.size(); i++){
            Object linha[] = new Object[]{ListaDep.get(i).getCodigo(),
                                            ListaDep.get(i).getNome()};
            
            modelo.addRow(linha);                                 
       }  
            tbl_dep_depts.setModel (modelo);
            tbl_dep_depts.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_dep_depts.getColumnModel().getColumn(1).setPreferredWidth(200);
       
              }
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        ListaDep = new ArrayList();
        modo = "Navegar";
        ManipulaInterface();
    }

    public void ManipulaInterface(){
         switch(modo){
           case "Navegar":
               btn_dep_salvar.setEnabled(false);
               btn_dep_cancelar.setEnabled(false);
               c_dep_codigo.setEnabled(false);
               c_dep_nome.setEnabled(false);  
               btn_dep_novo.setEnabled(true);
               btn_dep_editar.setEnabled(false);
               btn_dep_excluir.setEnabled(false);

               break;
    
           
           case "Novo":
               btn_dep_salvar.setEnabled(true);
               btn_dep_cancelar.setEnabled(true);
               c_dep_codigo.setEnabled(true);
               c_dep_nome.setEnabled(true);  
               btn_dep_novo.setEnabled(true);
               btn_dep_editar.setEnabled(false);
               btn_dep_excluir.setEnabled(false);              
               
               break;
    
           
           case "Editar":
               btn_dep_salvar.setEnabled(true);
               btn_dep_cancelar.setEnabled(true);
               c_dep_codigo.setEnabled(true);
               c_dep_nome.setEnabled(true);  
               btn_dep_novo.setEnabled(false);
               btn_dep_editar.setEnabled(false);
               btn_dep_excluir.setEnabled(false);                
               
               break;
              
           
           case "Excluir":
               btn_dep_salvar.setEnabled(false);
               btn_dep_cancelar.setEnabled(false);
               c_dep_codigo.setEnabled(false);
               c_dep_nome.setEnabled(false);  
               btn_dep_novo.setEnabled(true);
               btn_dep_editar.setEnabled(false);
               btn_dep_excluir.setEnabled(false);              
               
               break;
               
           case "Selecao":
               btn_dep_salvar.setEnabled(false);
               btn_dep_cancelar.setEnabled(false);
               c_dep_codigo.setEnabled(false);
               c_dep_nome.setEnabled(false);  
               btn_dep_novo.setEnabled(true);
               btn_dep_editar.setEnabled(true);
               btn_dep_excluir.setEnabled(true);              
               
               break;
           default: System.out.println("Modo inválido");
    
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dep_depts = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        c_dep_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_dep_nome = new javax.swing.JTextField();
        btn_dep_salvar = new javax.swing.JButton();
        btn_dep_cancelar = new javax.swing.JButton();
        btn_dep_novo = new javax.swing.JButton();
        btn_dep_editar = new javax.swing.JButton();
        btn_dep_excluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_dep_depts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_dep_depts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dep_deptsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_dep_depts);
        if (tbl_dep_depts.getColumnModel().getColumnCount() > 0) {
            tbl_dep_depts.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_dep_depts.getColumnModel().getColumn(1).setPreferredWidth(200);
        }
        tbl_dep_depts.getAccessibleContext().setAccessibleParent(tbl_dep_depts);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Departamento"));

        c_dep_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_dep_codigoActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        c_dep_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_dep_nomeActionPerformed(evt);
            }
        });

        btn_dep_salvar.setText("Salvar");
        btn_dep_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dep_salvarActionPerformed(evt);
            }
        });

        btn_dep_cancelar.setText("Cancelar");
        btn_dep_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dep_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_dep_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn_dep_salvar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_dep_cancelar))
                            .addComponent(c_dep_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_dep_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_dep_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dep_salvar)
                    .addComponent(btn_dep_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_dep_novo.setText("Novo");
        btn_dep_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dep_novoActionPerformed(evt);
            }
        });

        btn_dep_editar.setText("Editar");
        btn_dep_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dep_editarActionPerformed(evt);
            }
        });

        btn_dep_excluir.setText("Excluir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_dep_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_dep_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_dep_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dep_novo)
                    .addComponent(btn_dep_editar)
                    .addComponent(btn_dep_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Departamentos", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Funcionários", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_dep_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_dep_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_dep_codigoActionPerformed

    private void c_dep_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_dep_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_dep_nomeActionPerformed
  
    private void btn_dep_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dep_novoActionPerformed
        c_dep_codigo.setText("");
        c_dep_nome.setText("");
        
        modoDep = "Novo";
        ManipulaInterfaceDep();
    }
    }//GEN-LAST:event_btn_dep_novoActionPerformed

    
    private void btn_dep_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dep_salvarActionPerformed
        int cod = Integer.parseInt(c_dep_codigo.getText());
        if(modo.equals("Novo")); 
            Departamento D = new Departamento(cod, c_dep_nome.getText());
            ListaDep.add(D);
        }else if(modo.equals("Editar")){
            int index = tbl_dep_depts.getSelectedRow();  
            ListaDep.get(index).setCodigo(cod);
            ListaDep.get(index).setNome(c_dep_nome.getText());

        }    
        LoadTableDep();
        modo = "Navegar";
        ManipulaInterface();
        c_dep_codigo.setText("");
        c_dep_nome.setText("");
        
    }//GEN-LAST:event_btn_dep_salvarActionPerformed

    private void btn_dep_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dep_cancelarActionPerformed
        c_dep_codigo.setText("");
        c_dep_nome.setText("");
        modo = "Navegar";
        ManipulaInterface();
        
      }//GEN-LAST:event_btn_dep_cancelarActionPerformed

    private void tbl_dep_deptsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dep_deptsMouseClicked
        int index = tbl_dep_dpts.getSelectedRow();
        if(index>=0 && index<ListaDep.size ()){
            Departamento D = ListaDep.get(index);
            c_dep_codigo.setText(String.valueOf(D.getCodigo()));
            c_dep_nome.setText(D.getNome());  
            modo = "Selecao";
            ManipulaInterface();
       
      }   
    }//GEN-LAST:event_tbl_dep_deptsMouseClicked

    private void btn_dep_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dep_editarActionPerformed
             ManipulaInterface("Editar"); 
    }//GEN-LAST:event_btn_dep_editarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dep_cancelar;
    private javax.swing.JButton btn_dep_editar;
    private javax.swing.JButton btn_dep_excluir;
    private javax.swing.JButton btn_dep_novo;
    private javax.swing.JButton btn_dep_salvar;
    private javax.swing.JTextField c_dep_codigo;
    private javax.swing.JTextField c_dep_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_dep_depts;
    // End of variables declaration//GEN-END:variables
}
