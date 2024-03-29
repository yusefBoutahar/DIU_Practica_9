package interfaz;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


/**
 * @author Nassr Eddine Mousati Lamhamdi
 * @author Yousuf Boutahar El Maachi
 */
public class p9 extends javax.swing.JFrame {

    private final DefaultListModel modeloTablas = new DefaultListModel();  
    private final DefaultListModel modeloCampos = new DefaultListModel();
    private final ArrayList tablasSeleccionadas;
    private final DatabaseMetaData md;
    
    
    
    public p9(DatabaseMetaData md) {
        initComponents();
        this.setResizable(false);
        
        this.borrarLista.setEnabled(false);
        this.borrarSeleccion.setEnabled(false);
        this.borrrCampos.setEnabled(false);
        
        this.tablasSeleccionadas = new ArrayList();
        this.md = md;
        listaTablas.setModel(modeloTablas);
        listaCampos.setModel(modeloCampos);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    closeWindow();
                } catch (SQLException ex) {
                    Logger.getLogger(p9.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel_tablas = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JToggleButton();
        boton2 = new javax.swing.JToggleButton();
        boton3 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTablas = new javax.swing.JList();
        borrarLista = new javax.swing.JButton();
        borrarSeleccion = new javax.swing.JButton();
        panelCampos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCampos = new javax.swing.JList();
        mostrarCampos = new javax.swing.JButton();
        borrrCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_tablas.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablas"));

        jButton1.setText("Mostrar tablas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Seleccion"));

        buttonGroup1.add(boton1);
        boton1.setText("Seleccion unica");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(boton2);
        boton2.setText("seleccion rango");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(boton3);
        boton3.setText("seleccion random");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(boton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton3)
                .addGap(34, 34, 34))
        );

        jScrollPane1.setViewportView(listaTablas);

        borrarLista.setText("Borra lista");
        borrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarListaActionPerformed(evt);
            }
        });

        borrarSeleccion.setText("Borrar seleccion");
        borrarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarSeleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_tablasLayout = new javax.swing.GroupLayout(panel_tablas);
        panel_tablas.setLayout(panel_tablasLayout);
        panel_tablasLayout.setHorizontalGroup(
            panel_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablasLayout.createSequentialGroup()
                .addGroup(panel_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_tablasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_tablasLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(borrarSeleccion)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tablasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(borrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(52, 52, 52))
        );
        panel_tablasLayout.setVerticalGroup(
            panel_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panel_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(panel_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrarSeleccion)
                    .addComponent(borrarLista))
                .addContainerGap())
        );

        panelCampos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));

        jScrollPane2.setViewportView(listaCampos);

        mostrarCampos.setText("Mostrar Campos");
        mostrarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCamposActionPerformed(evt);
            }
        });

        borrrCampos.setText("Borrar Campos");
        borrrCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrrCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCamposLayout = new javax.swing.GroupLayout(panelCampos);
        panelCampos.setLayout(panelCamposLayout);
        panelCamposLayout.setHorizontalGroup(
            panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostrarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrrCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panelCamposLayout.setVerticalGroup(
            panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(mostrarCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(borrrCampos)
                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panel_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_tablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_boton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            modeloTablas.clear();
            
            String[] types = {"TABLE"};
            ResultSet rs = md.getTables(null, null, "%", types);
            while (rs.next()) {
                String nombreTabla = rs.getString("TABLE_NAME");
                modeloTablas.addElement(nombreTabla);
                tablasSeleccionadas.add(nombreTabla);
                
            }
            
            this.borrarLista.setEnabled(true);
            this.borrarSeleccion.setEnabled(true);


        } catch (SQLException ex) {
            Logger.getLogger(p9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void borrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarListaActionPerformed
        // TODO add your handling code here:
        modeloTablas.clear();
        modeloCampos.clear();
            
        this.borrarLista.setEnabled(false);
        this.borrarSeleccion.setEnabled(false);
        this.borrrCampos.setEnabled(false);
            
    }//GEN-LAST:event_borrarListaActionPerformed

    private void borrarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarSeleccionActionPerformed
        // TODO add your handling code here:
        listaTablas.clearSelection();
    }//GEN-LAST:event_borrarSeleccionActionPerformed

    private void borrrCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrrCamposActionPerformed
        // TODO add your handling code here:
        modeloCampos.clear();
        this.borrrCampos.setEnabled(false);

    }//GEN-LAST:event_borrrCamposActionPerformed

    private void mostrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCamposActionPerformed

        modeloCampos.clear();

        if(listaTablas.getSelectedIndices().length == 0){
            JOptionPane.showMessageDialog(null,
                "Seleccione las tablas", "",
                JOptionPane.INFORMATION_MESSAGE);
                this.borrrCampos.setEnabled(false);

            return;
        }
        
        String nombreTabla;
        int seleccionados[] = listaTablas.getSelectedIndices();
        this.borrrCampos.setEnabled(true);
        

        for (int seleccionado : seleccionados) {
            try {
                nombreTabla = (String)tablasSeleccionadas.get(seleccionado);
                ResultSet rs2 = md.getColumns(null, null, nombreTabla, null);
                while (rs2.next()) {
                    String nombreCampo = rs2.getString("COLUMN_NAME");
                    modeloCampos.addElement(nombreTabla + "." + nombreCampo);
                    
                }
                
            }catch (SQLException ex) {
                Logger.getLogger(p9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mostrarCamposActionPerformed

    private void closeWindow() throws SQLException {
            
        Icon m = new ImageIcon("C:\\Users\\hola\\Desktop\\icono_salir.jpg\\");
        String[] options = {"Salir", "Cerrar sesiòn"};
        int exitValue = JOptionPane.showOptionDialog(null, 
                "Que operacion desea realizar? ", 
                "Salir", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                m,
                options,
                options[0]);
        
        if (exitValue == JOptionPane.OK_OPTION) {
            login.con.close();
            System.exit(0);
        } else if(exitValue == JOptionPane.NO_OPTION){
            new login().setVisible(true);
            this.setVisible(false);
        }
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarLista;
    private javax.swing.JButton borrarSeleccion;
    private javax.swing.JButton borrrCampos;
    private javax.swing.JToggleButton boton1;
    private javax.swing.JToggleButton boton2;
    private javax.swing.JToggleButton boton3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaCampos;
    private javax.swing.JList listaTablas;
    private javax.swing.JButton mostrarCampos;
    private javax.swing.JPanel panelCampos;
    private javax.swing.JPanel panel_tablas;
    // End of variables declaration//GEN-END:variables
}
