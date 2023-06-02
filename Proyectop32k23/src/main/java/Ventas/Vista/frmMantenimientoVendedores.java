/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Carlos Emanuel Hernandez Garcia
//9959-21-363
//Mantenimiento Vendedores
package Ventas.Vista;


import Seguridad.Controlador.clsBitacora;
import Ventas.Controlador.clsVendedores;
import Seguridad.Controlador.clsUsuarioConectado;
import Seguridad.Modelo.Conexion;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author visitante
 */
public class frmMantenimientoVendedores extends javax.swing.JInternalFrame {

    public void llenadoDeCombos() {
        /*EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        List<Empleado> empleados = empleadoDAO.select();
        cbox_empleado.addItem("Seleccione una opción");
        for (int i = 0; i < empleados.size(); i++) {
            cbox_empleado.addItem(empleados.get(i).getNombreEmpleado());
        } */
    }

    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("nombre");
        modelo.addColumn("direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        clsVendedores vendedor = new clsVendedores();
        //VendedorDAO vendedorDAO = new VendedorDAO();
        List<clsVendedores> listaVendedores = vendedor.getListadoVendedores();
        tablaVendedores.setModel(modelo);
        String[] dato = new String[5];
        for (int i = 0; i < listaVendedores.size(); i++) {
            dato[0] = Integer.toString(listaVendedores.get(i).getIdVendedor());
            dato[1] = listaVendedores.get(i).getNombreVendedor();
            dato[2] = listaVendedores.get(i).getDireccionVendedor();
            dato[3] = listaVendedores.get(i).getTelefonoVendedor();
            dato[4] = listaVendedores.get(i).getEmailVendedor();
            modelo.addRow(dato);
        }       

//a
    }


int codigoAplicacion = 3003;

    public frmMantenimientoVendedores() {
        initComponents();
        llenadoDeTablas();
        llenadoDeCombos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2Vendedores = new javax.swing.JLabel();
        lbusuVendedores = new javax.swing.JLabel();
        btnEliminarVendedor = new javax.swing.JButton();
        btnRegistrarVendedor = new javax.swing.JButton();
        btnBuscarVendedor = new javax.swing.JButton();
        lbVendedoresT = new javax.swing.JLabel();
        btnModificarVendedor = new javax.swing.JButton();
        lbNombreVendedor = new javax.swing.JLabel();
        txtVendedorbuscado = new javax.swing.JTextField();
        txtNombreVendedor = new javax.swing.JTextField();
        btnLimpiarVendedor = new javax.swing.JButton();
        jScrollPane1Vendedor = new javax.swing.JScrollPane();
        tablaVendedores = new javax.swing.JTable();
        txtDireccionVendedor = new javax.swing.JTextField();
        lbDireccionVendedor = new javax.swing.JLabel();
        btnAyudaVendedor = new javax.swing.JButton();
        lbBuscarVendedor = new javax.swing.JLabel();
        btnActualizarVendedor = new javax.swing.JButton();
        lbTelefonoVendedor = new javax.swing.JLabel();
        txtTelefonoVendedor = new javax.swing.JTextField();
        lbEmailVendedor = new javax.swing.JLabel();
        txtEmailVendedor = new javax.swing.JTextField();
        rptVendedores = new javax.swing.JButton();

        lb2Vendedores.setForeground(new java.awt.Color(204, 204, 204));
        lb2Vendedores.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento Vendedores");
        setVisible(true);

        btnEliminarVendedor.setText("Eliminar");
        btnEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVendedorActionPerformed(evt);
            }
        });

        btnRegistrarVendedor.setText("Registrar");
        btnRegistrarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVendedorActionPerformed(evt);
            }
        });

        btnBuscarVendedor.setText("Buscar");
        btnBuscarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendedorActionPerformed(evt);
            }
        });

        lbVendedoresT.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbVendedoresT.setText("Vendedores");

        btnModificarVendedor.setText("Modificar");
        btnModificarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVendedorActionPerformed(evt);
            }
        });

        lbNombreVendedor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbNombreVendedor.setText("Nombre");

        txtNombreVendedor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombreVendedor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        btnLimpiarVendedor.setText("Limpiar");
        btnLimpiarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarVendedorActionPerformed(evt);
            }
        });

        tablaVendedores.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1Vendedor.setViewportView(tablaVendedores);

        txtDireccionVendedor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDireccionVendedor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtDireccionVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionVendedorActionPerformed(evt);
            }
        });

        lbDireccionVendedor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbDireccionVendedor.setText("Direccion");

        btnAyudaVendedor.setText("Ayuda");
        btnAyudaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaVendedorActionPerformed(evt);
            }
        });

        lbBuscarVendedor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbBuscarVendedor.setText("ID a buscar");

        btnActualizarVendedor.setText("Actualizar");
        btnActualizarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarVendedorActionPerformed(evt);
            }
        });

        lbTelefonoVendedor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbTelefonoVendedor.setText("Telefono");

        txtTelefonoVendedor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTelefonoVendedor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtTelefonoVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoVendedorActionPerformed(evt);
            }
        });

        lbEmailVendedor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbEmailVendedor.setText("Email");

        rptVendedores.setText("Reporte");
        rptVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rptVendedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbBuscarVendedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVendedorbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRegistrarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLimpiarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAyudaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rptVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombreVendedor)
                            .addComponent(lbDireccionVendedor)
                            .addComponent(lbTelefonoVendedor)
                            .addComponent(lbEmailVendedor))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefonoVendedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEmailVendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDireccionVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                        .addComponent(txtNombreVendedor)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizarVendedor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbVendedoresT)
                        .addGap(294, 546, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1Vendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbVendedoresT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombreVendedor)
                            .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDireccionVendedor)
                            .addComponent(txtDireccionVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefonoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTelefonoVendedor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEmailVendedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarVendedor)
                            .addComponent(btnEliminarVendedor)
                            .addComponent(btnModificarVendedor))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiarVendedor)
                            .addComponent(btnAyudaVendedor)
                            .addComponent(rptVendedores))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarVendedor)
                            .addComponent(txtVendedorbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbBuscarVendedor))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarVendedor)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVendedorActionPerformed
        // TODO add your handling code here:
        int registrosBorrados=0;
        clsVendedores vendedor = new clsVendedores();
        vendedor.setIdVendedor(Integer.parseInt(txtVendedorbuscado.getText()));
        registrosBorrados=vendedor.setBorrarVendedor(vendedor);
        JOptionPane.showMessageDialog(null, "Registro Borrado\n", 
                    "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        int resultadoBitacora=0;
                    clsBitacora bitacoraRegistro = new clsBitacora();
                    resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"DEL"); 
        llenadoDeTablas();
        limpiarTextos();
        
        
    }//GEN-LAST:event_btnEliminarVendedorActionPerformed

    private void btnRegistrarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVendedorActionPerformed
        clsVendedores vendedor = new clsVendedores();
        vendedor.setNombreVendedor(txtNombreVendedor.getText());
        vendedor.setDireccionVendedor(txtDireccionVendedor.getText());
        vendedor.setTelefonoVendedor(txtTelefonoVendedor.getText());
        vendedor.setEmailVendedor(txtEmailVendedor.getText());
        vendedor.setIngresarVendedor(vendedor);
        JOptionPane.showMessageDialog(null, "Registro Ingresado\n", 
                    "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "INS");
        llenadoDeTablas();
        limpiarTextos();
        
    }//GEN-LAST:event_btnRegistrarVendedorActionPerformed

    private void btnBuscarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVendedorActionPerformed
        // TODO add your handling code here:
        clsVendedores vendedor = new clsVendedores();
        //aplicacion.setNombreAplicacion(txtbuscado.getText());        
       vendedor.setIdVendedor(Integer.parseInt(txtVendedorbuscado.getText()));        
        vendedor = vendedor.getBuscarInformacionVendedorPorId(vendedor);
        System.out.println("Usuario retornado:" + vendedor);        
        txtNombreVendedor.setText(vendedor.getNombreVendedor());
        txtDireccionVendedor.setText(vendedor.getDireccionVendedor());
        txtTelefonoVendedor.setText(vendedor.getTelefonoVendedor());
        txtEmailVendedor.setText(vendedor.getEmailVendedor());
         int resultadoBitacora=0;
                    clsBitacora bitacoraRegistro = new clsBitacora();
                    resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "QRY");
                 
        
        
    }//GEN-LAST:event_btnBuscarVendedorActionPerformed

    private void btnModificarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVendedorActionPerformed
//        // TODO add your handling code here:
        clsVendedores vendedor = new clsVendedores();
        vendedor.setIdVendedor(Integer.parseInt(txtVendedorbuscado.getText()));
        vendedor.setNombreVendedor(txtNombreVendedor.getText());
        vendedor.setDireccionVendedor(txtDireccionVendedor.getText());
        vendedor.setTelefonoVendedor(txtTelefonoVendedor.getText());
        vendedor.setEmailVendedor(txtEmailVendedor.getText());
        vendedor.setModificarVendedor(vendedor);
        JOptionPane.showMessageDialog(null, "Registro Modificado\n", 
                    "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);      
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "UPD");
        llenadoDeTablas();
        limpiarTextos();
    }//GEN-LAST:event_btnModificarVendedorActionPerformed

    private void btnLimpiarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarVendedorActionPerformed
        limpiarTextos();
        habilitarBotones();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarVendedorActionPerformed
    public void limpiarTextos()
    {
        txtNombreVendedor.setText("");
        txtDireccionVendedor.setText("");
        txtTelefonoVendedor.setText("");
        txtEmailVendedor.setText("");
        txtVendedorbuscado.setText("");
    }
    public void habilitarBotones()
    {
        btnRegistrarVendedor.setEnabled(true);
        btnModificarVendedor.setEnabled(true);
        btnEliminarVendedor.setEnabled(true);
    }
    public void desHabilitarBotones()
    {
        btnRegistrarVendedor.setEnabled(false);
        btnModificarVendedor.setEnabled(false);
        btnEliminarVendedor.setEnabled(false);
    }    
    
    private void btnAyudaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaVendedorActionPerformed
        // TODO add your handling code here:
        //Carlos Javier Sandoval Catalán
        //9959-21-1324
        try {
            if ((new File("src\\main\\java\\ventas\\ayuda\\ayudavend.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\ventas\\ayuda\\ayudavend.chm");
                p.waitFor();
            } else {
                System.out.println("La ayuda no fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAyudaVendedorActionPerformed

    private void btnActualizarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarVendedorActionPerformed
        // TODO add your handling code here:
        llenadoDeTablas();
    }//GEN-LAST:event_btnActualizarVendedorActionPerformed

    private void txtTelefonoVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoVendedorActionPerformed

    private void txtDireccionVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionVendedorActionPerformed

    //Meyglin del Rosario Rosales Ochoa
    //9959 - 21 - 4490
    private void rptVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rptVendedoresActionPerformed
        // TODO add your handling code here:
        Connection conn = null;        
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            conn = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()

                    + "/src/main/java/Ventas/Reportes/rptVendedores.jrxml");
	    print = JasperFillManager.fillReport(report, p, conn);
            JasperViewer view = new JasperViewer(print, false);
	    view.setTitle("Reporte Prueba");
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_rptVendedoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarVendedor;
    private javax.swing.JButton btnAyudaVendedor;
    private javax.swing.JButton btnBuscarVendedor;
    private javax.swing.JButton btnEliminarVendedor;
    private javax.swing.JButton btnLimpiarVendedor;
    private javax.swing.JButton btnModificarVendedor;
    private javax.swing.JButton btnRegistrarVendedor;
    private javax.swing.JScrollPane jScrollPane1Vendedor;
    private javax.swing.JLabel lb2Vendedores;
    private javax.swing.JLabel lbBuscarVendedor;
    private javax.swing.JLabel lbDireccionVendedor;
    private javax.swing.JLabel lbEmailVendedor;
    private javax.swing.JLabel lbNombreVendedor;
    private javax.swing.JLabel lbTelefonoVendedor;
    private javax.swing.JLabel lbVendedoresT;
    private javax.swing.JLabel lbusuVendedores;
    private javax.swing.JButton rptVendedores;
    private javax.swing.JTable tablaVendedores;
    private javax.swing.JTextField txtDireccionVendedor;
    private javax.swing.JTextField txtEmailVendedor;
    private javax.swing.JTextField txtNombreVendedor;
    private javax.swing.JTextField txtTelefonoVendedor;
    private javax.swing.JTextField txtVendedorbuscado;
    // End of variables declaration//GEN-END:variables
}
