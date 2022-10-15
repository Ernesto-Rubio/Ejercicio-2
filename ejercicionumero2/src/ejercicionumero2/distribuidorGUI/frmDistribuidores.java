/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicionumero2.distribuidorGUI;
import ejercicionumero2.distribuidorDAL.conexion;
import java.sql.ResultSet;
import ejercicionumero2.distribuidorBL.distribuidoresBL;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ernesto
 */
public class frmDistribuidores extends javax.swing.JFrame {
    DefaultTableModel modelo;
    /**
     * Creates new form frmDistribuidores
     */
    public frmDistribuidores() {
        initComponents();
        String[] titulos = {
            "ID",
            "NOMBRE",
            "CALLE",
            "NO.CASA",
            "COLONIA"
        };
        
        modelo= new DefaultTableModel(null,titulos);
        tblDistribuidores.setModel(modelo);
        consultarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDistribuidores = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDistribuidores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDistribuidores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDistribuidoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDistribuidores);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido paterno");

        jLabel4.setText("Apellido materno");

        jLabel5.setText("Colonia");

        jLabel6.setText("Calle");

        jLabel7.setText("Numero");

        txtID.setEditable(false);

        jLabel1.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(txtApellidoP)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtColonia, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCalle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnBorrar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        jLabel1.getAccessibleContext().setAccessibleName("ID");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        distribuidoresBL oDistribuidores = recuperarDatosGUI();
        conexion objConexion =  new conexion();
                
        String strSentenciaInsert = String.format("INSERT INTO persons(nombre,appaterno, apmaterno)" +
                                                " VALUES('%s', '%s', '%s');", 
                                            oDistribuidores.getNombre(),
                                            oDistribuidores.getApellido_paterno(),
                                            oDistribuidores.getApellido_materno());
                
        objConexion.insertarDatos(strSentenciaInsert);
        
        strSentenciaInsert = String.format(" INSERT INTO addresses(colonia, calle, numero) " +
                                                " VALUES('%s','%s', '%s' ); ", 
                                            oDistribuidores.getColonia(),
                                            oDistribuidores.getCalle(),
                                            oDistribuidores.getNumero());
                
        objConexion.insertarDatos(strSentenciaInsert);
        
        strSentenciaInsert = "INSERT INTO distributors(fecharegistro) " +
                            " VALUES(date('now'));";
                
        objConexion.insertarDatos(strSentenciaInsert);
        this.consultarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblDistribuidoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDistribuidoresMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()== 1){
           JTable receptor =(JTable)evt.getSource();
           txtID.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
           txtCalle.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
           txtNumero.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
           txtColonia.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),4).toString());
           
           String data = receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString();
           String[] split = data.split(" ");
           txtNombre.setText(split[0]);
           txtApellidoP.setText(split[1]);
           txtApellidoM.setText(split[2]);
           
        }
        
        btnEditar.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnBorrar.setEnabled(true);
    }//GEN-LAST:event_tblDistribuidoresMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiar();// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public void limpiar() {
        txtID.setText("");
        txtCalle.setText("");
        txtNumero.setText("");
        txtColonia.setText("");
        txtNombre.setText("");
        txtApellidoP.setText("");
        txtApellidoM.setText("");
        
        btnEditar.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnBorrar.setEnabled(false);
       
    }
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
         distribuidoresBL oDistribuidores = recuperarDatosGUI();        // TODO add your handling code here:
         conexion objConexion =  new conexion();
                
        String strSentenciaInsert = String.format("DELETE FROM persons" +
                                                " WHERE id = %d;", oDistribuidores.getID());
                
        objConexion.insertarDatos(strSentenciaInsert);
        
        strSentenciaInsert = String.format("DELETE FROM addresses" +
                                           " WHERE id = %d;", oDistribuidores.getID());
                
        objConexion.insertarDatos(strSentenciaInsert);
        
        strSentenciaInsert = String.format("DELETE FROM distributors" +
                                           " WHERE id = %d;", oDistribuidores.getID());
                
        objConexion.insertarDatos(strSentenciaInsert);
        this.consultarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        distribuidoresBL oDistribuidores = recuperarDatosGUI();
        conexion objConexion =  new conexion();
                
        String strSentenciaInsert = String.format("UPDATE persons SET nombre='%s' , appaterno ='%s', apmatern ='%s' " +
                                                " WHERE id = %d;", 
                                            oDistribuidores.getNombre(),
                                            oDistribuidores.getApellido_paterno(),
                                            oDistribuidores.getApellido_materno(),
                                             oDistribuidores.getID());
                
        objConexion.insertarDatos(strSentenciaInsert);
        
        strSentenciaInsert = String.format(" UPDATE addresses SET colonia ='%s', calle ='%s', numero = '%s'" +
                                                " WHERE id = %d;", 
                                            oDistribuidores.getColonia(),
                                            oDistribuidores.getCalle(),
                                            oDistribuidores.getNumero(),
                                            oDistribuidores.getID());
                
        objConexion.insertarDatos(strSentenciaInsert);
        
        strSentenciaInsert = String.format(" UPDATE distributors SET fecharegistro = date('now')" +
                                                " WHERE id = %d;", 
                                            oDistribuidores.getID());
        
        objConexion.insertarDatos(strSentenciaInsert);   
        
        this.consultarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnEditarActionPerformed
    
    public distribuidoresBL recuperarDatosGUI(){
        distribuidoresBL oDistribuidores = new distribuidoresBL();
        int ID = (txtID.getText().isEmpty())? 0 : Integer.parseInt(txtID.getText());
        oDistribuidores.setID(ID);
        oDistribuidores.setNombre(txtNombre.getText());
        oDistribuidores.setApellido_paterno(txtApellidoP.getText());
        oDistribuidores.setApellido_materno(txtApellidoM.getText());
        oDistribuidores.setColonia(txtColonia.getText());
        oDistribuidores.setCalle(txtCalle.getText());
        oDistribuidores.setNumero(txtNumero.getText());
        
        return oDistribuidores;
    }
    
    public void consultarDatos() {
        
        while(modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        
        conexion objConexion =  new conexion();
        try {
            ResultSet resultado =  
            objConexion.consultarRegistros("select p.id, p.nombre || ' ' || p.appaterno || ' ' || p.apmaterno as nombre_completo,a.calle, a.numero ,a.colonia " +
                                            "from distributors d " +
                                            "inner join persons p " +
                                            "on d.id = p.id " +
                                            "inner join addresses a " +
                                            "on d.id = a.id");
            
            while(resultado.next()){
                System.out.println(resultado.getString("nombre_completo"));
                Object[] oDistribuidor = {
                    resultado.getString("id"),
                    resultado.getString("nombre_completo"),
                    resultado.getString("calle"),
                    resultado.getString("numero"),
                    resultado.getString("colonia")
                };
                
                modelo.addRow(oDistribuidor);
            }
        }catch(Exception e) {
            System.out.println(e);
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
            java.util.logging.Logger.getLogger(frmDistribuidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDistribuidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDistribuidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDistribuidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDistribuidores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDistribuidores;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
