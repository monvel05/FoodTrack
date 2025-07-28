/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.foodtrack;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hilar
 */
public class ListaCompras extends javax.swing.JFrame {

    /**
     * Creates new form ListaCompras
     */
    public ListaCompras() {
        initComponents();
        SwingUtilities.invokeLater(() -> {
            checarApariencia();
            proteinaAleatoria();
            carbohidratoAleatoria();
            verduraAleatoria();
            grasaAleatoria();
        });   
    }
    private List<String> obtenerAlimentosSeleccionados() {
    List<String> seleccionados = new ArrayList<>();

    // Proteínas
    if (AtúnjCheckBox.isSelected()) seleccionados.add("Atún");
    if (HuevojCheckBox.isSelected()) seleccionados.add("Huevo");
    if (PechugaPollojCheckBox.isSelected()) seleccionados.add("Pechuga de pollo");
    if (TofujCheckBox.isSelected()) seleccionados.add("Tofu");
    if (QuesoPanelajCheckBox.isSelected()) seleccionados.add("Queso panela");
    if (SardinajCheckBox.isSelected()) seleccionados.add("Sardina");
    if (PescadojCheckBox.isSelected()) seleccionados.add("Pescado");
    if (CamaronesjCheckBox.isSelected()) seleccionados.add("Camarones");
    if (PavojCheckBox.isSelected()) seleccionados.add("Pavo");
    if (LentejasjCheckBox.isSelected()) seleccionados.add("Lentejas");
    if (EspinacasjCheckBox.isSelected()) seleccionados.add("Espinacas");
    if(GuisantesjCheckBox.isSelected()) seleccionados.add("Guisantes");
    if(CarneResjCheckBox.isSelected()) seleccionados.add("Carne de Res");

    // Carbohidratos
    if (PanIntegraljCheckBox.isSelected()) seleccionados.add("Pan integral");
    if (PanAvenajCheckBox.isSelected()) seleccionados.add("Pan de avena");
    if (PastajCheckBox.isSelected()) seleccionados.add("Pasta");
    if (PlátanoMadurojCheckBox.isSelected()) seleccionados.add("Plátano maduro");
    if (TortillaTrigojCheckBox.isSelected()) seleccionados.add("Tortilla de trigo");
    if (YucaCocidajCheckBox.isSelected()) seleccionados.add("Yuca cocida");
    if (ArrozCocidojCheckBox.isSelected()) seleccionados.add("Arroz cocido");
    if (AvenajCheckBox.isSelected()) seleccionados.add("Avena");
    if (HarinaTrigojCheckBox.isSelected()) seleccionados.add("Harina de trigo");
    if (ManzanajCheckBox.isSelected()) seleccionados.add("Manzana");
    if (PapayajCheckBox.isSelected()) seleccionados.add("Papaya");
    if (CamotejCheckBox.isSelected()) seleccionados.add("Camote");
    if (GalletaIntegraljCheckBox.isSelected()) seleccionados.add("Galleta integral");

    // Grasas saludables
    if (AceitunasjCheckBox.isSelected()) seleccionados.add("Aceitunas");
    if (SemillasjCheckBox.isSelected()) seleccionados.add("Semillas");
    if (SemillaChíajCheckBox.isSelected()) seleccionados.add("Chía");
    if (TahinijCheckBox.isSelected()) seleccionados.add("Tahini");
    if (FrutosSecosjCheckBox.isSelected()) seleccionados.add("Frutos secos");
    if (EdamamejCheckBox.isSelected()) seleccionados.add("Edamame");
    if (AceiteCocojCheckBox.isSelected()) seleccionados.add("Aceite de coco");
    if (HummusjCheckBox.isSelected()) seleccionados.add("Hummus");
    if (TofujCheckBox.isSelected()) seleccionados.add("Tofu");
    if (AceiteOlivajCheckBox.isSelected()) seleccionados.add("Aceite de oliva");
    if (SalmónjCheckBox.isSelected()) seleccionados.add("Salmón");
    if (LecheEnterajCheckBox.isSelected()) seleccionados.add("Leche entera");

    // Verduras
    if (BrócolijCheckBox.isSelected()) seleccionados.add("Brócoli");
    if (ZanahoriajCheckBox.isSelected()) seleccionados.add("Zanahoria");
    if (RemolachajCheckBox.isSelected()) seleccionados.add("Remolacha");
    if (PepinojCheckBox.isSelected()) seleccionados.add("Pepino");
    if (NopalesjCheckBox.isSelected()) seleccionados.add("Nopales");
    if (LechugajCheckBox.isSelected()) seleccionados.add("Lechuga");
    if (AlcachofajCheckBox.isSelected()) seleccionados.add("Alcachofa");
    if (ColiflorjCheckBox.isSelected()) seleccionados.add("Coliflor");
    if (ApiojCheckBox.isSelected()) seleccionados.add("Apio");
    if (HabaFrescajCheckBox.isSelected()) seleccionados.add("Haba fresca");
    if (PapasjCheckBox.isSelected()) seleccionados.add("Papas");
    if (AcelgasjCheckBox.isSelected()) seleccionados.add("Acelgas");
    if (BerenjenajCheckBox.isSelected()) seleccionados.add("Berengena");
    

    return seleccionados;
}

    private void proteinaAleatoria(){
        reiniciarProteinas();
        int num = new Random().nextInt(13) + 1;
        
        switch(num){
            case 1 -> HuevojCheckBox.setSelected(true);
            case 2 -> AtúnjCheckBox.setSelected(true);
            case 3 -> SardinajCheckBox.setSelected(true);
            case 4 -> LentejasjCheckBox.setSelected(true);
            case 5 -> EspinacasjCheckBox.setSelected(true);
            case 6 -> GuisantesjCheckBox.setSelected(true);
            case 7 -> GarbanzosjCheckBox.setSelected(true);
            case 8 -> PescadojCheckBox.setSelected(true);
            case 9 -> PechugaPollojCheckBox.setSelected(true);
            case 10 -> CamaronesjCheckBox.setSelected(true);
            case 11 -> QuesoPanelajCheckBox.setSelected(true);
            case 12 -> PavojCheckBox.setSelected(true);
            case 13 -> CarneResjCheckBox.setSelected(true);
            default -> System.out.println("Numero invalido:"+ num);
        }
        
    }
    private void  carbohidratoAleatoria(){
        reiniciarCarbohidratos();
        int num = new Random().nextInt(13) + 1;
        
        switch (num){
            case 1 -> PanIntegraljCheckBox.setSelected(true);
            case 2 -> ArrozCocidojCheckBox.setSelected(true);
            case 3 -> AvenajCheckBox.setSelected(true);
            case 4 -> PastajCheckBox.setSelected(true);
            case 5 -> HarinaTrigojCheckBox.setSelected(true);
            case 6 -> ManzanajCheckBox.setSelected(true);
            case 7 -> PapayajCheckBox.setSelected(true);
            case 8 -> PlátanoMadurojCheckBox.setSelected(true);
            case 9 -> YucaCocidajCheckBox.setSelected(true);
            case 10 -> CamotejCheckBox.setSelected(true);
            case 11 -> TortillaTrigojCheckBox.setSelected(true);
            case 12 -> GalletaIntegraljCheckBox.setSelected(true);
            case 13 -> PanAvenajCheckBox.setSelected(true);
            default -> System.out.println("Numero invalido:"+ num);
        }
    }
    
    private void verduraAleatoria(){
        reiniciarVerduras();
        int num = new Random().nextInt(13) + 1;
        
        switch(num){
            case 1 -> LechugajCheckBox.setSelected(true);
            case 2 -> BrócolijCheckBox.setSelected(true);
            case 3 -> ColiflorjCheckBox.setSelected(true);
            case 4 -> ApiojCheckBox.setSelected(true);
            case 5 -> PepinojCheckBox.setSelected(true);
            case 6 -> ZanahoriajCheckBox.setSelected(true);
            case 7 -> RemolachajCheckBox.setSelected(true);
            case 8 -> HabaFrescajCheckBox.setSelected(true);
            case 9 -> PapasjCheckBox.setSelected(true);
            case 10 -> AcelgasjCheckBox.setSelected(true);
            case 11 -> BerenjenajCheckBox.setSelected(true);
            case 12 -> AlcachofajCheckBox.setSelected(true);
            case 13 -> NopalesjCheckBox.setSelected(true);
            default -> System.out.println("Numero invalido:"+ num);
        }
    }
    private void grasaAleatoria(){
        reiniciarGrasas();
        int num = new Random().nextInt(12) + 1;
        switch(num){
            case 1 -> FrutosSecosjCheckBox.setSelected(true);
            case 2 -> SemillasjCheckBox.setSelected(true);
            case 3 -> AceitunasjCheckBox.setSelected(true);
            case 4 -> EdamamejCheckBox.setSelected(true);
            case 5 -> TahinijCheckBox.setSelected(true);
            case 6 -> AceiteCocojCheckBox.setSelected(true);
            case 7 -> HummusjCheckBox.setSelected(true);
            case 8 -> TofujCheckBox.setSelected(true);
            case 9 -> AceiteOlivajCheckBox.setSelected(true);
            case 10 -> SalmónjCheckBox.setSelected(true);
            case 11 -> SemillaChíajCheckBox.setSelected(true);
            case 12 -> LecheEnterajCheckBox.setSelected(true);
            default -> System.out.println("Numero invalido:"+ num);
            
        }
    }
    private void reiniciarProteinas(){
        HuevojCheckBox.setSelected(false);
        AtúnjCheckBox.setSelected(false);
        SardinajCheckBox.setSelected(false);
        LentejasjCheckBox.setSelected(false);
        EspinacasjCheckBox.setSelected(false);
        GuisantesjCheckBox.setSelected(false);
        GarbanzosjCheckBox.setSelected(false);
        PescadojCheckBox.setSelected(false);
        PechugaPollojCheckBox.setSelected(false);
        CamaronesjCheckBox.setSelected(false);
        QuesoPanelajCheckBox.setSelected(false);
        PavojCheckBox.setSelected(false);
        CarneResjCheckBox.setSelected(false);
    }
    private void reiniciarCarbohidratos(){
        PanIntegraljCheckBox.setSelected(false);
        ArrozCocidojCheckBox.setSelected(false);
        AvenajCheckBox.setSelected(false);
        PastajCheckBox.setSelected(false);
        HarinaTrigojCheckBox.setSelected(false);
        ManzanajCheckBox.setSelected(false);
        PapayajCheckBox.setSelected(false);
        PlátanoMadurojCheckBox.setSelected(false);
        YucaCocidajCheckBox.setSelected(false);
        CamotejCheckBox.setSelected(false);
        TortillaTrigojCheckBox.setSelected(false);
        GalletaIntegraljCheckBox.setSelected(false);
        PanAvenajCheckBox.setSelected(false);
    }
    private void reiniciarVerduras(){
        LechugajCheckBox.setSelected(false);
        BrócolijCheckBox.setSelected(false);
        ColiflorjCheckBox.setSelected(false);
        ApiojCheckBox.setSelected(false);
        PepinojCheckBox.setSelected(false);
        ZanahoriajCheckBox.setSelected(false);
        RemolachajCheckBox.setSelected(false);
        HabaFrescajCheckBox.setSelected(false); 
        PapasjCheckBox.setSelected(false); 
        AcelgasjCheckBox.setSelected(false); 
        BerenjenajCheckBox.setSelected(false);
        AlcachofajCheckBox.setSelected(false); 
        NopalesjCheckBox.setSelected(false); 
    }
    private void reiniciarGrasas(){
        FrutosSecosjCheckBox.setSelected(false); 
        SemillasjCheckBox.setSelected(false); 
        AceitunasjCheckBox.setSelected(false); 
        EdamamejCheckBox.setSelected(false); 
        TahinijCheckBox.setSelected(false); 
        AceiteCocojCheckBox.setSelected(false); 
        HummusjCheckBox.setSelected(false); 
        TofujCheckBox.setSelected(false); 
        AceiteOlivajCheckBox.setSelected(false); 
        SalmónjCheckBox.setSelected(false); 
        SemillaChíajCheckBox.setSelected(false);
        LecheEnterajCheckBox.setSelected(false); 
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
        PROTEINASjLabel = new javax.swing.JLabel();
        CARBOHIDRATOSjLabel = new javax.swing.JLabel();
        VERDURASjLabel = new javax.swing.JLabel();
        GRASASjLabel = new javax.swing.JLabel();
        SiguientejButton = new javax.swing.JButton();
        HuevojCheckBox = new javax.swing.JCheckBox();
        AtúnjCheckBox = new javax.swing.JCheckBox();
        SardinajCheckBox = new javax.swing.JCheckBox();
        LentejasjCheckBox = new javax.swing.JCheckBox();
        EspinacasjCheckBox = new javax.swing.JCheckBox();
        GuisantesjCheckBox = new javax.swing.JCheckBox();
        GarbanzosjCheckBox = new javax.swing.JCheckBox();
        PescadojCheckBox = new javax.swing.JCheckBox();
        PechugaPollojCheckBox = new javax.swing.JCheckBox();
        CamaronesjCheckBox = new javax.swing.JCheckBox();
        QuesoPanelajCheckBox = new javax.swing.JCheckBox();
        PavojCheckBox = new javax.swing.JCheckBox();
        CarneResjCheckBox = new javax.swing.JCheckBox();
        PanIntegraljCheckBox = new javax.swing.JCheckBox();
        ArrozCocidojCheckBox = new javax.swing.JCheckBox();
        AvenajCheckBox = new javax.swing.JCheckBox();
        PastajCheckBox = new javax.swing.JCheckBox();
        HarinaTrigojCheckBox = new javax.swing.JCheckBox();
        ManzanajCheckBox = new javax.swing.JCheckBox();
        PapayajCheckBox = new javax.swing.JCheckBox();
        PlátanoMadurojCheckBox = new javax.swing.JCheckBox();
        YucaCocidajCheckBox = new javax.swing.JCheckBox();
        CamotejCheckBox = new javax.swing.JCheckBox();
        TortillaTrigojCheckBox = new javax.swing.JCheckBox();
        GalletaIntegraljCheckBox = new javax.swing.JCheckBox();
        PanAvenajCheckBox = new javax.swing.JCheckBox();
        LechugajCheckBox = new javax.swing.JCheckBox();
        BrócolijCheckBox = new javax.swing.JCheckBox();
        ColiflorjCheckBox = new javax.swing.JCheckBox();
        ApiojCheckBox = new javax.swing.JCheckBox();
        PepinojCheckBox = new javax.swing.JCheckBox();
        ZanahoriajCheckBox = new javax.swing.JCheckBox();
        RemolachajCheckBox = new javax.swing.JCheckBox();
        HabaFrescajCheckBox = new javax.swing.JCheckBox();
        PapasjCheckBox = new javax.swing.JCheckBox();
        AcelgasjCheckBox = new javax.swing.JCheckBox();
        BerenjenajCheckBox = new javax.swing.JCheckBox();
        AlcachofajCheckBox = new javax.swing.JCheckBox();
        NopalesjCheckBox = new javax.swing.JCheckBox();
        FrutosSecosjCheckBox = new javax.swing.JCheckBox();
        SemillasjCheckBox = new javax.swing.JCheckBox();
        AceitunasjCheckBox = new javax.swing.JCheckBox();
        EdamamejCheckBox = new javax.swing.JCheckBox();
        TahinijCheckBox = new javax.swing.JCheckBox();
        AceiteCocojCheckBox = new javax.swing.JCheckBox();
        HummusjCheckBox = new javax.swing.JCheckBox();
        TofujCheckBox = new javax.swing.JCheckBox();
        AceiteOlivajCheckBox = new javax.swing.JCheckBox();
        SalmónjCheckBox = new javax.swing.JCheckBox();
        SemillaChíajCheckBox = new javax.swing.JCheckBox();
        LecheEnterajCheckBox = new javax.swing.JCheckBox();
        menuPanel = new javax.swing.JPanel();
        addComidaBtn = new javax.swing.JButton();
        listaComprasBtn = new javax.swing.JButton();
        estadisticasBtn = new javax.swing.JButton();
        perfilBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 222, 175));

        PROTEINASjLabel.setForeground(new java.awt.Color(255, 51, 0));
        PROTEINASjLabel.setText("PROTEÍNAS");

        CARBOHIDRATOSjLabel.setForeground(new java.awt.Color(255, 51, 0));
        CARBOHIDRATOSjLabel.setText("CARBOHIDRATOS");

        VERDURASjLabel.setForeground(new java.awt.Color(255, 51, 0));
        VERDURASjLabel.setText("VERDURAS");

        GRASASjLabel.setForeground(new java.awt.Color(255, 51, 0));
        GRASASjLabel.setText("GRASAS SALUDABLES");

        SiguientejButton.setBackground(new java.awt.Color(255, 102, 0));
        SiguientejButton.setText("SIGUIENTE ⮡");
        SiguientejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguientejButtonActionPerformed(evt);
            }
        });

        HuevojCheckBox.setText("HUEVO");

        AtúnjCheckBox.setText("LATA DE ATÚN");
        AtúnjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtúnjCheckBoxActionPerformed(evt);
            }
        });

        SardinajCheckBox.setText("SARDINA");

        LentejasjCheckBox.setText("LENTEJAS");

        EspinacasjCheckBox.setText("ESPINACAS");

        GuisantesjCheckBox.setText("GUISANTES");

        GarbanzosjCheckBox.setText("GARBANZOS ");

        PescadojCheckBox.setText("PESCADO");

        PechugaPollojCheckBox.setText("PECHUGA DE POLLO");

        CamaronesjCheckBox.setText("CAMARONES");

        QuesoPanelajCheckBox.setText("QUESO PANELA");

        PavojCheckBox.setText("PAVO");

        CarneResjCheckBox.setText("CARNE DE RES");

        PanIntegraljCheckBox.setText("PAN INTEGRAL");

        ArrozCocidojCheckBox.setText("ARROZ COCIDO");

        AvenajCheckBox.setText("AVENA");

        PastajCheckBox.setText("PASTA");

        HarinaTrigojCheckBox.setText("HARINA DE TRIGO");

        ManzanajCheckBox.setText("MANZANA");
        ManzanajCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManzanajCheckBoxActionPerformed(evt);
            }
        });

        PapayajCheckBox.setText("PAPAYA");

        PlátanoMadurojCheckBox.setText("PLÁTANO MADURO");

        YucaCocidajCheckBox.setText("YUCA COCIDA");

        CamotejCheckBox.setText("CAMOTE");

        TortillaTrigojCheckBox.setText("TORTILLA DE TRIGO");

        GalletaIntegraljCheckBox.setText("GALLETA INTEGRAL");

        PanAvenajCheckBox.setText("PAN DE AVENA");

        LechugajCheckBox.setText("LECHUGA");

        BrócolijCheckBox.setText("BRÓCOLI");

        ColiflorjCheckBox.setText("COLIFLOR");

        ApiojCheckBox.setText("APIO");

        PepinojCheckBox.setText("PEPINO");

        ZanahoriajCheckBox.setText("ZANAHORIA");

        RemolachajCheckBox.setText("REMOLACHA");

        HabaFrescajCheckBox.setText("HABA FRESCA");

        PapasjCheckBox.setText("PAPAS");

        AcelgasjCheckBox.setText("ACELGAS");

        BerenjenajCheckBox.setText("BERENJENA");

        AlcachofajCheckBox.setText("ALCACHOFA");

        NopalesjCheckBox.setText("NOPALES");

        FrutosSecosjCheckBox.setText("FRUTOS SECOS");

        SemillasjCheckBox.setText("SEMILLAS");

        AceitunasjCheckBox.setText("ACEITUNAS");

        EdamamejCheckBox.setText("EDAMAME");

        TahinijCheckBox.setText("TAHINI");

        AceiteCocojCheckBox.setText("ACEITE DE COCO");

        HummusjCheckBox.setText("HUMMUS");

        TofujCheckBox.setText("TOFU");

        AceiteOlivajCheckBox.setText("ACEITE DE OLIVA");

        SalmónjCheckBox.setText("SALMÓN");

        SemillaChíajCheckBox.setText("SEMILLAS DE CHÍA");

        LecheEnterajCheckBox.setText("LECHE ENTERA");

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

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/foodtrack/Resources/logo_blanco.png"))); // NOI18N
        jLabel13.setText("jLabel1");

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
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AtúnjCheckBox)
                                    .addComponent(LentejasjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SardinajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HuevojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PROTEINASjLabel)
                                    .addComponent(GuisantesjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EspinacasjCheckBox)
                                    .addComponent(GarbanzosjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PescadojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CamaronesjCheckBox))
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QuesoPanelajCheckBox)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManzanajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HarinaTrigojCheckBox)
                            .addComponent(PapayajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlátanoMadurojCheckBox)
                            .addComponent(PastajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AvenajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArrozCocidojCheckBox)
                            .addComponent(YucaCocidajCheckBox)
                            .addComponent(CamotejCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CARBOHIDRATOSjLabel)
                                .addComponent(PanIntegraljCheckBox)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AcelgasjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PapasjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(HabaFrescajCheckBox)
                                        .addComponent(RemolachajCheckBox)
                                        .addComponent(ZanahoriajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PepinojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ApiojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ColiflorjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BrócolijCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LechugajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(VERDURASjLabel)
                                    .addGap(42, 42, 42))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(GRASASjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FrutosSecosjCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SemillasjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AceitunasjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EdamamejCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TahinijCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AceiteCocojCheckBox)
                                .addComponent(HummusjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TofujCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AceiteOlivajCheckBox)
                                .addComponent(SalmónjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LecheEnterajCheckBox))
                            .addComponent(SemillaChíajCheckBox))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CarneResjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PanAvenajCheckBox)
                                            .addComponent(GalletaIntegraljCheckBox)))
                                    .addComponent(PechugaPollojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(NopalesjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(SiguientejButton))
                                    .addComponent(AlcachofajCheckBox)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PavojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TortillaTrigojCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BerenjenajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PROTEINASjLabel)
                    .addComponent(CARBOHIDRATOSjLabel)
                    .addComponent(VERDURASjLabel)
                    .addComponent(GRASASjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HuevojCheckBox)
                    .addComponent(PanIntegraljCheckBox)
                    .addComponent(LechugajCheckBox)
                    .addComponent(FrutosSecosjCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtúnjCheckBox)
                    .addComponent(ArrozCocidojCheckBox)
                    .addComponent(BrócolijCheckBox)
                    .addComponent(SemillasjCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SardinajCheckBox)
                    .addComponent(AvenajCheckBox)
                    .addComponent(ColiflorjCheckBox)
                    .addComponent(AceitunasjCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LentejasjCheckBox)
                    .addComponent(PastajCheckBox)
                    .addComponent(ApiojCheckBox)
                    .addComponent(EdamamejCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HarinaTrigojCheckBox)
                    .addComponent(PepinojCheckBox)
                    .addComponent(TahinijCheckBox)
                    .addComponent(GuisantesjCheckBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManzanajCheckBox)
                            .addComponent(ZanahoriajCheckBox)
                            .addComponent(AceiteCocojCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(HummusjCheckBox)
                                .addComponent(RemolachajCheckBox))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PapayajCheckBox)
                                .addComponent(GarbanzosjCheckBox))))
                    .addComponent(EspinacasjCheckBox))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlátanoMadurojCheckBox)
                            .addComponent(HabaFrescajCheckBox)
                            .addComponent(TofujCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AceiteOlivajCheckBox)
                                .addComponent(PapasjCheckBox))
                            .addComponent(YucaCocidajCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SalmónjCheckBox)
                                .addComponent(AcelgasjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CamotejCheckBox)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PescadojCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CamaronesjCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(QuesoPanelajCheckBox)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TortillaTrigojCheckBox)
                    .addComponent(BerenjenajCheckBox)
                    .addComponent(SemillaChíajCheckBox)
                    .addComponent(PavojCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlcachofajCheckBox)
                    .addComponent(LecheEnterajCheckBox)
                    .addComponent(GalletaIntegraljCheckBox)
                    .addComponent(CarneResjCheckBox))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SiguientejButton)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NopalesjCheckBox)
                            .addComponent(PanAvenajCheckBox)
                            .addComponent(PechugaPollojCheckBox))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManzanajCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManzanajCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManzanajCheckBoxActionPerformed

    private void AtúnjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtúnjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtúnjCheckBoxActionPerformed

    private void SiguientejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguientejButtonActionPerformed
        // TODO add your handling code here:
        //Logica de checkboxes
        List<String> seleccionados = obtenerAlimentosSeleccionados();
        if (seleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecciona al menos un alimento");
        }

        //Mostrar en consola para depurar
        List<String> lista = obtenerAlimentosSeleccionados();
        System.out.println("Seleccionaste:");
        for (String alimento : lista) {
            System.out.println("- " + alimento);
        }

        SeleccionListaCompras nuevaPantalla = new SeleccionListaCompras(seleccionados);
        nuevaPantalla.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_SiguientejButtonActionPerformed

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
            
            //Cambiar Panel y Botón
            jPanel1.setBackground(ModoOscuro.getInstance().getFondoOscuro());
            SiguientejButton.setBackground(ModoOscuro.getInstance().getColorFuerteOscuro());
            SiguientejButton.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            
            //Cambiar labels
            PROTEINASjLabel.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            CARBOHIDRATOSjLabel.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            VERDURASjLabel.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            GRASASjLabel.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            
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

            //Cambiar Panel y Botón
            jPanel1.setBackground(ModoOscuro.getInstance().getFondoClaro());
            SiguientejButton.setBackground(ModoOscuro.getInstance().getColorFuerteClaro());
            SiguientejButton.setForeground(ModoOscuro.getInstance().getFuenteClaro());

            //Cambiar labels
            PROTEINASjLabel.setForeground(ModoOscuro.getInstance().getColorFuerteClaro());
            CARBOHIDRATOSjLabel.setForeground(ModoOscuro.getInstance().getColorFuerteClaro());
            VERDURASjLabel.setForeground(ModoOscuro.getInstance().getColorFuerteClaro());
            GRASASjLabel.setForeground(ModoOscuro.getInstance().getColorFuerteClaro());

        }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AceiteCocojCheckBox;
    private javax.swing.JCheckBox AceiteOlivajCheckBox;
    private javax.swing.JCheckBox AceitunasjCheckBox;
    private javax.swing.JCheckBox AcelgasjCheckBox;
    private javax.swing.JCheckBox AlcachofajCheckBox;
    private javax.swing.JCheckBox ApiojCheckBox;
    private javax.swing.JCheckBox ArrozCocidojCheckBox;
    private javax.swing.JCheckBox AtúnjCheckBox;
    private javax.swing.JCheckBox AvenajCheckBox;
    private javax.swing.JCheckBox BerenjenajCheckBox;
    private javax.swing.JCheckBox BrócolijCheckBox;
    private javax.swing.JLabel CARBOHIDRATOSjLabel;
    private javax.swing.JCheckBox CamaronesjCheckBox;
    private javax.swing.JCheckBox CamotejCheckBox;
    private javax.swing.JCheckBox CarneResjCheckBox;
    private javax.swing.JCheckBox ColiflorjCheckBox;
    private javax.swing.JCheckBox EdamamejCheckBox;
    private javax.swing.JCheckBox EspinacasjCheckBox;
    private javax.swing.JCheckBox FrutosSecosjCheckBox;
    private javax.swing.JLabel GRASASjLabel;
    private javax.swing.JCheckBox GalletaIntegraljCheckBox;
    private javax.swing.JCheckBox GarbanzosjCheckBox;
    private javax.swing.JCheckBox GuisantesjCheckBox;
    private javax.swing.JCheckBox HabaFrescajCheckBox;
    private javax.swing.JCheckBox HarinaTrigojCheckBox;
    private javax.swing.JCheckBox HuevojCheckBox;
    private javax.swing.JCheckBox HummusjCheckBox;
    private javax.swing.JCheckBox LecheEnterajCheckBox;
    private javax.swing.JCheckBox LechugajCheckBox;
    private javax.swing.JCheckBox LentejasjCheckBox;
    private javax.swing.JCheckBox ManzanajCheckBox;
    private javax.swing.JCheckBox NopalesjCheckBox;
    private javax.swing.JLabel PROTEINASjLabel;
    private javax.swing.JCheckBox PanAvenajCheckBox;
    private javax.swing.JCheckBox PanIntegraljCheckBox;
    private javax.swing.JCheckBox PapasjCheckBox;
    private javax.swing.JCheckBox PapayajCheckBox;
    private javax.swing.JCheckBox PastajCheckBox;
    private javax.swing.JCheckBox PavojCheckBox;
    private javax.swing.JCheckBox PechugaPollojCheckBox;
    private javax.swing.JCheckBox PepinojCheckBox;
    private javax.swing.JCheckBox PescadojCheckBox;
    private javax.swing.JCheckBox PlátanoMadurojCheckBox;
    private javax.swing.JCheckBox QuesoPanelajCheckBox;
    private javax.swing.JCheckBox RemolachajCheckBox;
    private javax.swing.JCheckBox SalmónjCheckBox;
    private javax.swing.JCheckBox SardinajCheckBox;
    private javax.swing.JCheckBox SemillaChíajCheckBox;
    private javax.swing.JCheckBox SemillasjCheckBox;
    private javax.swing.JButton SiguientejButton;
    private javax.swing.JCheckBox TahinijCheckBox;
    private javax.swing.JCheckBox TofujCheckBox;
    private javax.swing.JCheckBox TortillaTrigojCheckBox;
    private javax.swing.JLabel VERDURASjLabel;
    private javax.swing.JCheckBox YucaCocidajCheckBox;
    private javax.swing.JCheckBox ZanahoriajCheckBox;
    private javax.swing.JButton addComida;
    private javax.swing.JButton addComida1;
    private javax.swing.JButton addComida10;
    private javax.swing.JButton addComida2;
    private javax.swing.JButton addComida3;
    private javax.swing.JButton addComida4;
    private javax.swing.JButton addComida5;
    private javax.swing.JButton addComida6;
    private javax.swing.JButton addComida7;
    private javax.swing.JButton addComida8;
    private javax.swing.JButton addComida9;
    private javax.swing.JButton addComidaBtn;
    private javax.swing.JButton estadisticas;
    private javax.swing.JButton estadisticas1;
    private javax.swing.JButton estadisticas10;
    private javax.swing.JButton estadisticas2;
    private javax.swing.JButton estadisticas3;
    private javax.swing.JButton estadisticas4;
    private javax.swing.JButton estadisticas5;
    private javax.swing.JButton estadisticas6;
    private javax.swing.JButton estadisticas7;
    private javax.swing.JButton estadisticas8;
    private javax.swing.JButton estadisticas9;
    private javax.swing.JButton estadisticasBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listaCompras;
    private javax.swing.JButton listaCompras1;
    private javax.swing.JButton listaCompras10;
    private javax.swing.JButton listaCompras2;
    private javax.swing.JButton listaCompras3;
    private javax.swing.JButton listaCompras4;
    private javax.swing.JButton listaCompras5;
    private javax.swing.JButton listaCompras6;
    private javax.swing.JButton listaCompras7;
    private javax.swing.JButton listaCompras8;
    private javax.swing.JButton listaCompras9;
    private javax.swing.JButton listaComprasBtn;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu10;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JPanel menu4;
    private javax.swing.JPanel menu5;
    private javax.swing.JPanel menu6;
    private javax.swing.JPanel menu7;
    private javax.swing.JPanel menu8;
    private javax.swing.JPanel menu9;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton perfil;
    private javax.swing.JButton perfil1;
    private javax.swing.JButton perfil10;
    private javax.swing.JButton perfil2;
    private javax.swing.JButton perfil3;
    private javax.swing.JButton perfil4;
    private javax.swing.JButton perfil5;
    private javax.swing.JButton perfil6;
    private javax.swing.JButton perfil7;
    private javax.swing.JButton perfil8;
    private javax.swing.JButton perfil9;
    private javax.swing.JButton perfilBtn;
    private javax.swing.JButton salir;
    private javax.swing.JButton salir1;
    private javax.swing.JButton salir10;
    private javax.swing.JButton salir2;
    private javax.swing.JButton salir3;
    private javax.swing.JButton salir4;
    private javax.swing.JButton salir5;
    private javax.swing.JButton salir6;
    private javax.swing.JButton salir7;
    private javax.swing.JButton salir8;
    private javax.swing.JButton salir9;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables
}
