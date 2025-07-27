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
            case 1: FrutosSecosjCheckBox.setSelected(true); break;
            case 2: SemillasjCheckBox.setSelected(true); break;
            case 3: AceitunasjCheckBox.setSelected(true); break;
            case 4: EdamamejCheckBox.setSelected(true); break;
            case 5: TahinijCheckBox.setSelected(true); break;
            case 6: AceiteCocojCheckBox.setSelected(true); break;
            case 7: HummusjCheckBox.setSelected(true); break;
            case 8: TofujCheckBox.setSelected(true); break;
            case 9: AceiteOlivajCheckBox.setSelected(true); break;
            case 10: SalmónjCheckBox.setSelected(true); break;
            case 11: SemillaChíajCheckBox.setSelected(true); break;
            case 12: LecheEnterajCheckBox.setSelected(true); break;        
            default:System.out.println("Numero invalido:"+ num); break;
            
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
        jPanel2 = new javax.swing.JPanel();
        LogojLabel = new javax.swing.JLabel();
        AñadirComidajButton = new javax.swing.JButton();
        ListaDeComprasjButton = new javax.swing.JButton();
        EstadisticasjButton = new javax.swing.JButton();
        PerfiljButton = new javax.swing.JButton();
        SalirjButton = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 222, 175));

        jPanel2.setBackground(new java.awt.Color(253, 140, 13));

        LogojLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/foodtrack/Resources/logo_blanco.png"))); // NOI18N

        AñadirComidajButton.setBackground(new java.awt.Color(255, 255, 204));
        AñadirComidajButton.setText("Añadir comida");
        AñadirComidajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirComidajButtonActionPerformed(evt);
            }
        });

        ListaDeComprasjButton.setBackground(new java.awt.Color(255, 255, 204));
        ListaDeComprasjButton.setText("Lista de compras");
        ListaDeComprasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDeComprasjButtonActionPerformed(evt);
            }
        });

        EstadisticasjButton.setBackground(new java.awt.Color(255, 255, 204));
        EstadisticasjButton.setText("Estadísticas");
        EstadisticasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticasjButtonActionPerformed(evt);
            }
        });

        PerfiljButton.setBackground(new java.awt.Color(255, 255, 204));
        PerfiljButton.setText("Perfil");
        PerfiljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfiljButtonActionPerformed(evt);
            }
        });

        SalirjButton.setBackground(new java.awt.Color(255, 255, 204));
        SalirjButton.setText("Salir");
        SalirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AñadirComidajButton)
                            .addComponent(ListaDeComprasjButton)
                            .addComponent(EstadisticasjButton)
                            .addComponent(PerfiljButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogojLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalirjButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(LogojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(AñadirComidajButton)
                .addGap(34, 34, 34)
                .addComponent(ListaDeComprasjButton)
                .addGap(42, 42, 42)
                .addComponent(EstadisticasjButton)
                .addGap(38, 38, 38)
                .addComponent(PerfiljButton)
                .addGap(31, 31, 31)
                .addComponent(SalirjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PROTEINASjLabel.setForeground(new java.awt.Color(255, 51, 0));
        PROTEINASjLabel.setText("PROTEÍNAS");

        CARBOHIDRATOSjLabel.setForeground(new java.awt.Color(255, 51, 0));
        CARBOHIDRATOSjLabel.setText("CARBOHIDRATOS");

        VERDURASjLabel.setForeground(new java.awt.Color(255, 51, 0));
        VERDURASjLabel.setText("VERDURAS");

        GRASASjLabel.setForeground(new java.awt.Color(255, 51, 0));
        GRASASjLabel.setText("GRASAS SALUDABLES");

        SiguientejButton.setBackground(new java.awt.Color(255, 102, 0));
        SiguientejButton.setText("SIGUIENTE>");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CarneResjCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QuesoPanelajCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(PavojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PanAvenajCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NopalesjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(SiguientejButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(GalletaIntegraljCheckBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AlcachofajCheckBox))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TortillaTrigojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BerenjenajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PROTEINASjLabel)
                            .addComponent(HuevojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AtúnjCheckBox)
                            .addComponent(SardinajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LentejasjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EspinacasjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuisantesjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GarbanzosjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PescadojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PechugaPollojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CamaronesjCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CARBOHIDRATOSjLabel)
                                    .addComponent(PanIntegraljCheckBox)
                                    .addComponent(ArrozCocidojCheckBox)
                                    .addComponent(AvenajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PastajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HarinaTrigojCheckBox)
                                    .addComponent(ManzanajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PapayajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PlátanoMadurojCheckBox)
                                    .addComponent(YucaCocidajCheckBox))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(VERDURASjLabel)
                                            .addComponent(LechugajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BrócolijCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ColiflorjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ApiojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PepinojCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ZanahoriajCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RemolachajCheckBox)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PapasjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(HabaFrescajCheckBox)
                                            .addComponent(AcelgasjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(CamotejCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
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
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(EspinacasjCheckBox)
                    .addComponent(HarinaTrigojCheckBox)
                    .addComponent(PepinojCheckBox)
                    .addComponent(TahinijCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GuisantesjCheckBox)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ManzanajCheckBox)
                        .addComponent(ZanahoriajCheckBox)
                        .addComponent(AceiteCocojCheckBox)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GarbanzosjCheckBox)
                            .addComponent(PapayajCheckBox)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HummusjCheckBox)
                            .addComponent(RemolachajCheckBox))))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PlátanoMadurojCheckBox)
                        .addComponent(HabaFrescajCheckBox)
                        .addComponent(TofujCheckBox))
                    .addComponent(PescadojCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AceiteOlivajCheckBox)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PechugaPollojCheckBox)
                        .addComponent(YucaCocidajCheckBox))
                    .addComponent(PapasjCheckBox))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CamaronesjCheckBox)
                            .addComponent(CamotejCheckBox)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SalmónjCheckBox)
                            .addComponent(AcelgasjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuesoPanelajCheckBox)
                    .addComponent(TortillaTrigojCheckBox)
                    .addComponent(BerenjenajCheckBox)
                    .addComponent(SemillaChíajCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PavojCheckBox)
                    .addComponent(AlcachofajCheckBox)
                    .addComponent(LecheEnterajCheckBox)
                    .addComponent(GalletaIntegraljCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SiguientejButton)
                    .addComponent(CarneResjCheckBox)
                    .addComponent(PanAvenajCheckBox)
                    .addComponent(NopalesjCheckBox))
                .addGap(26, 26, 26))
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
//BUTTON AÑADIR COMIDA
    private void AñadirComidajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirComidajButtonActionPerformed
       AddComida miaddcomida= new AddComida();
        miaddcomida.setVisible(true);
       this.dispose();

    //Logica de checkboxes
        List<String> seleccionados = obtenerAlimentosSeleccionados();
     if(seleccionados.isEmpty()) {
         JOptionPane.showMessageDialog(this, "Selecciona al menos un alimento");
     } else{
      JOptionPane.showMessageDialog(this, "has añadido: " + String.join(",", seleccionados));
     }
     
     //Mostrar en consola para depurar
     List<String> lista = obtenerAlimentosSeleccionados();
     System.out.println("Seleccionaste:");
    for (String alimento : lista) {
        System.out.println("- " + alimento);
}
    
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AñadirComidajButtonActionPerformed

    private void AtúnjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtúnjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtúnjCheckBoxActionPerformed

    private void SiguientejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguientejButtonActionPerformed
       List<String> seleccionados = obtenerAlimentosSeleccionados();
        // TODO add your handling code here:
        
        SeleccionListaCompras nuevaPantalla = new SeleccionListaCompras(seleccionados);
        nuevaPantalla.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_SiguientejButtonActionPerformed

    private void ListaDeComprasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaDeComprasjButtonActionPerformed
        // TODO add your handling code here:
        ListaCompras listaPantalla = new ListaCompras();
        listaPantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ListaDeComprasjButtonActionPerformed

    private void EstadisticasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticasjButtonActionPerformed
        // TODO add your handling code here:
        Estadisticas estadisticasPantalla = new Estadisticas();
        estadisticasPantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EstadisticasjButtonActionPerformed

    private void PerfiljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfiljButtonActionPerformed
        // TODO add your handling code here:
        Perfil perfilPantalla = new Perfil();
        perfilPantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PerfiljButtonActionPerformed

    private void SalirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirjButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirjButtonActionPerformed

    private void ManzanajCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManzanajCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManzanajCheckBoxActionPerformed

    private void checarApariencia() {
        if (ModoOscuro.getInstance().isModoOscuroActivo()) {
            //Cambiar menu
            jPanel2.setBackground(ModoOscuro.getInstance().getColorFuerteOscuro());
            AñadirComidajButton.setBackground(ModoOscuro.getInstance().getBotonesOscuro());
            AñadirComidajButton.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            ListaDeComprasjButton.setBackground(ModoOscuro.getInstance().getBotonesOscuro());
            ListaDeComprasjButton.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            EstadisticasjButton.setBackground(ModoOscuro.getInstance().getBotonesOscuro());
            EstadisticasjButton.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            PerfiljButton.setBackground(ModoOscuro.getInstance().getBotonesOscuro());
            PerfiljButton.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            SalirjButton.setBackground(ModoOscuro.getInstance().getBotonesOscuro());
            SalirjButton.setForeground(ModoOscuro.getInstance().getFuenteOscuro());
            
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
            jPanel2.setBackground(ModoOscuro.getInstance().getColorFuerteClaro());
            AñadirComidajButton.setBackground(ModoOscuro.getInstance().getBotonesClaro());
            AñadirComidajButton.setForeground(ModoOscuro.getInstance().getFuenteClaro());
            ListaDeComprasjButton.setBackground(ModoOscuro.getInstance().getBotonesClaro());
            ListaDeComprasjButton.setForeground(ModoOscuro.getInstance().getFuenteClaro());
            EstadisticasjButton.setBackground(ModoOscuro.getInstance().getBotonesClaro());
            EstadisticasjButton.setForeground(ModoOscuro.getInstance().getFuenteClaro());
            PerfiljButton.setBackground(ModoOscuro.getInstance().getBotonesClaro());
            PerfiljButton.setForeground(ModoOscuro.getInstance().getFuenteClaro());
            SalirjButton.setBackground(ModoOscuro.getInstance().getBotonesClaro());
            SalirjButton.setForeground(ModoOscuro.getInstance().getFuenteClaro());

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
    private javax.swing.JButton AñadirComidajButton;
    private javax.swing.JCheckBox BerenjenajCheckBox;
    private javax.swing.JCheckBox BrócolijCheckBox;
    private javax.swing.JLabel CARBOHIDRATOSjLabel;
    private javax.swing.JCheckBox CamaronesjCheckBox;
    private javax.swing.JCheckBox CamotejCheckBox;
    private javax.swing.JCheckBox CarneResjCheckBox;
    private javax.swing.JCheckBox ColiflorjCheckBox;
    private javax.swing.JCheckBox EdamamejCheckBox;
    private javax.swing.JCheckBox EspinacasjCheckBox;
    private javax.swing.JButton EstadisticasjButton;
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
    private javax.swing.JButton ListaDeComprasjButton;
    private javax.swing.JLabel LogojLabel;
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
    private javax.swing.JButton PerfiljButton;
    private javax.swing.JCheckBox PescadojCheckBox;
    private javax.swing.JCheckBox PlátanoMadurojCheckBox;
    private javax.swing.JCheckBox QuesoPanelajCheckBox;
    private javax.swing.JCheckBox RemolachajCheckBox;
    private javax.swing.JButton SalirjButton;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
