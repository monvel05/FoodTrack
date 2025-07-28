/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.foodtrack;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.BufferedWriter;
/**
 *
 * @author hilar
 */
public class SeleccionListaCompras extends javax.swing.JFrame {
    ArrayList<String> alimentosSeleccionados = new ArrayList<>();

    /**
     * Creates new form SeleccionListaCompras
     */
    public SeleccionListaCompras(List<String> alimentosSeleccionados) {
        initComponents();
        SwingUtilities.invokeLater(() -> {
            checarApariencia();
            seleccionadosTextArea.setLineWrap(true);
            seleccionadosTextArea.setWrapStyleWord(true);

            //Mostrar los alimentos en el JTextArea
            StringBuilder texto = new StringBuilder();
            for (String alimento : alimentosSeleccionados) {
                texto.append("- ").append(alimento).append("\n");
            }
            seleccionadosTextArea.setText(texto.toString());
        });

    }
    private void guardarListaEnArchivo(){
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter("Seleccion_Lista_compras.txt"));
            for(String alimento : alimentosSeleccionados){
                escritor.write(alimento + "\n");
                escritor.newLine();
                
            }
            escritor.close();
            JOptionPane.showMessageDialog(null,"Lista guardada exitosamente");
            
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar la lista :" + ex.getMessage());
        }
    }
    
    private void checarApariencia() {
        if (ModoOscuro.getInstance().isModoOscuroActivo()) {
            //Cambiar menu
            menuPanel.setBackground(ModoOscuro.getInstance().getColorFuerteOscuro());
            addComidaBtn.setBackground(ModoOscuro.getInstance().getBotonesOscuro());
            addComidaBtn.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            listaComprasBtn.setBackground(ModoOscuro.getInstance().getBotonesOscuro());
            listaComprasBtn.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            estadisticasBtn.setBackground(ModoOscuro.getInstance().getBotonesOscuro());
            estadisticasBtn.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            perfilBtn.setBackground(ModoOscuro.getInstance().getBotonesOscuro());
            perfilBtn.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            salirBtn.setBackground(ModoOscuro.getInstance().getBotonesOscuro());
            salirBtn.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            
            //Cambiar panel
            jPanel1.setBackground(ModoOscuro.getInstance().getFondoOscuro());
            
            //Cambiar labels
            jLabel2.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            
            //Cambiar botones
            GuardarListaButton.setBackground(ModoOscuro.getInstance().getColorFuerteOscuro());
            GuardarListaButton.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
        } else {
            //Cambiar menu
            menuPanel.setBackground(ModoOscuro.getInstance().getColorFuerteClaro());
            addComidaBtn.setBackground(ModoOscuro.getInstance().getBotonesClaro());
            addComidaBtn.setForeground(ModoOscuro.getInstance().getFuenteClaro());
            listaComprasBtn.setBackground(ModoOscuro.getInstance().getBotonesClaro());
            listaComprasBtn.setForeground(ModoOscuro.getInstance().getFuenteClaro());
            estadisticasBtn.setBackground(ModoOscuro.getInstance().getBotonesClaro());
            estadisticasBtn.setForeground(ModoOscuro.getInstance().getFuenteClaro());
            perfilBtn.setBackground(ModoOscuro.getInstance().getBotonesClaro());
            perfilBtn.setForeground(ModoOscuro.getInstance().getFuenteClaro());
            salirBtn.setBackground(ModoOscuro.getInstance().getBotonesClaro());
            salirBtn.setForeground(ModoOscuro.getInstance().getFuenteClaro());

            //Cambiar panel
            jPanel1.setBackground(ModoOscuro.getInstance().getFondoClaro());

            //Cambiar labels
            jLabel2.setForeground(ModoOscuro.getInstance().getColorFuerteClaro());

            //Cambiar botones
            GuardarListaButton.setBackground(ModoOscuro.getInstance().getColorFuerteClaro());
            GuardarListaButton.setForeground(ModoOscuro.getInstance().getFuenteClaro());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        seleccionadosTextArea = new javax.swing.JTextArea();
        GuardarListaButton = new javax.swing.JButton();
        atrasBtn = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        addComidaBtn = new javax.swing.JButton();
        listaComprasBtn = new javax.swing.JButton();
        estadisticasBtn = new javax.swing.JButton();
        perfilBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 222, 175));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("ALIMENTOS SELECCIONADOS");

        seleccionadosTextArea.setBackground(new java.awt.Color(255, 252, 235));
        seleccionadosTextArea.setColumns(20);
        seleccionadosTextArea.setRows(5);
        jScrollPane1.setViewportView(seleccionadosTextArea);

        GuardarListaButton.setBackground(new java.awt.Color(255, 102, 0));
        GuardarListaButton.setText("Guardar lista ✔");
        GuardarListaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarListaButtonActionPerformed(evt);
            }
        });

        atrasBtn.setBackground(new java.awt.Color(255, 102, 0));
        atrasBtn.setText("Atrás ￩");
        atrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBtnActionPerformed(evt);
            }
        });

        menuPanel.setBackground(new java.awt.Color(253, 140, 13));
        menuPanel.setMaximumSize(new java.awt.Dimension(4, 4));
        menuPanel.setMinimumSize(new java.awt.Dimension(4, 4));
        menuPanel.setPreferredSize(new java.awt.Dimension(130, 25));

        addComidaBtn.setBackground(new java.awt.Color(246, 226, 155));
        addComidaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/foodtrack/Resources/addComidaIcon.png"))); // NOI18N
        addComidaBtn.setToolTipText("Añadir comida");
        addComidaBtn.setPreferredSize(new java.awt.Dimension(80, 60));
        addComidaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addComidaBtnActionPerformed(evt);
            }
        });

        listaComprasBtn.setBackground(new java.awt.Color(246, 226, 155));
        listaComprasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/foodtrack/Resources/listaComprasIcon.png"))); // NOI18N
        listaComprasBtn.setToolTipText("Lista de Compras");
        listaComprasBtn.setPreferredSize(new java.awt.Dimension(80, 60));
        listaComprasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaComprasBtnActionPerformed(evt);
            }
        });

        estadisticasBtn.setBackground(new java.awt.Color(246, 226, 155));
        estadisticasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/foodtrack/Resources/estadisticasIcon.png"))); // NOI18N
        estadisticasBtn.setToolTipText("Estadísiticas");
        estadisticasBtn.setPreferredSize(new java.awt.Dimension(80, 60));
        estadisticasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasBtnActionPerformed(evt);
            }
        });

        perfilBtn.setBackground(new java.awt.Color(246, 226, 155));
        perfilBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/foodtrack/Resources/perfilIcon.png"))); // NOI18N
        perfilBtn.setToolTipText("Perfil");
        perfilBtn.setPreferredSize(new java.awt.Dimension(80, 60));
        perfilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilBtnActionPerformed(evt);
            }
        });

        salirBtn.setBackground(new java.awt.Color(246, 226, 155));
        salirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/foodtrack/Resources/salirIcon.png"))); // NOI18N
        salirBtn.setToolTipText("Salir");
        salirBtn.setMaximumSize(new java.awt.Dimension(50, 30));
        salirBtn.setPreferredSize(new java.awt.Dimension(50, 40));
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/foodtrack/Resources/logo_blanco.png"))); // NOI18N
        jLabel12.setText("jLabel1");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perfilBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(estadisticasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listaComprasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addComidaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addComidaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaComprasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadisticasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perfilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(atrasBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GuardarListaButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarListaButton)
                    .addComponent(atrasBtn))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarListaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarListaButtonActionPerformed
 
        guardarListaEnArchivo();
// TODO add your handling code here:

    }//GEN-LAST:event_GuardarListaButtonActionPerformed

    private void atrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtnActionPerformed
        // TODO add your handling code here:
        ListaCompras listaPantalla = new ListaCompras();
        listaPantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasBtnActionPerformed

    private void addComidaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addComidaBtnActionPerformed
        AddComida miAddComida = new AddComida();
        miAddComida.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_addComidaBtnActionPerformed

    private void listaComprasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaComprasBtnActionPerformed
        // TODO add your handling code here:
        ListaCompras miListaCompras = new ListaCompras();
        miListaCompras.setVisible(true);
        dispose();
    }//GEN-LAST:event_listaComprasBtnActionPerformed

    private void estadisticasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasBtnActionPerformed
        // TODO add your handling code here:
        Estadisticas miEstadisticas= new Estadisticas();
        miEstadisticas.setVisible(true);
        dispose();
    }//GEN-LAST:event_estadisticasBtnActionPerformed

    private void perfilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilBtnActionPerformed
        // TODO add your handling code here:
        Perfil miPerfil = new Perfil();
        miPerfil.setVisible(true);
        dispose();
    }//GEN-LAST:event_perfilBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        DataBase.desconectar();
    }//GEN-LAST:event_salirBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarListaButton;
    private javax.swing.JButton addComidaBtn;
    private javax.swing.JButton atrasBtn;
    private javax.swing.JButton estadisticasBtn;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listaComprasBtn;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton perfilBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JTextArea seleccionadosTextArea;
    // End of variables declaration//GEN-END:variables
}
