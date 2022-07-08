package br.una.estatistica;

import com.formdev.flatlaf.FlatDarkLaf;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Lucas Samoyedem
 */
public class Estatistica extends javax.swing.JFrame {

    private EstatisticaDescritiva es;

    /**
     * Creates new form estatistica
     */
    public Estatistica() {
        initComponents();
    }

    private String arredondar(Double valor) {
        return new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN).toString();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        inputValores = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modaText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        media = new javax.swing.JLabel();
        mediana = new javax.swing.JLabel();
        desvioPadrao = new javax.swing.JLabel();
        moda = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        variancia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        coeVariancia = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mediaGeo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        distFreqTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        separador = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        quantidade = new javax.swing.JLabel();
        fiTotal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estatística");
        setIconImages(null);

        inputValores.setColumns(20);
        inputValores.setRows(5);
        jScrollPane2.setViewportView(inputValores);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Média aritmética:");

        modaText.setText("Moda:");

        jLabel2.setText("Mediana:");

        jLabel3.setText("Desvio padrão:");

        media.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        media.setText("0");
        media.setFocusable(false);
        media.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        mediana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mediana.setText("0");
        mediana.setToolTipText("");
        mediana.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        desvioPadrao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        desvioPadrao.setText("0");
        desvioPadrao.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        moda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        moda.setText("0");
        moda.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel4.setText("Variância:");

        variancia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        variancia.setText("0");
        variancia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel5.setText("Coeficiente de variação amostral:");

        coeVariancia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        coeVariancia.setText("0");
        coeVariancia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel6.setText("Média geométrica:");

        mediaGeo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mediaGeo.setText("0");
        mediaGeo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        distFreqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Valores", "FI", "XI", "FAC", "FI%", "FacR %"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(distFreqTable);
        if (distFreqTable.getColumnModel().getColumnCount() > 0) {
            distFreqTable.getColumnModel().getColumn(0).setResizable(false);
            distFreqTable.getColumnModel().getColumn(1).setResizable(false);
            distFreqTable.getColumnModel().getColumn(1).setCellRenderer(null);
            distFreqTable.getColumnModel().getColumn(2).setResizable(false);
            distFreqTable.getColumnModel().getColumn(3).setResizable(false);
            distFreqTable.getColumnModel().getColumn(4).setResizable(false);
            distFreqTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Digite os valores");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Distribuição de Frequências");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Totais");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setText("Separador:");

        separador.setText(",");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Total");

        quantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidade.setText("0");

        fiTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fiTotal.setText("0");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("-");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("-");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel11)
                .addGap(81, 81, 81)
                .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(fiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(modaText)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mediana, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(mediaGeo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                        .addComponent(media, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(moda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(variancia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addComponent(desvioPadrao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(coeVariancia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 135, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(2, 2, 2)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modaText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(mediana))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(media)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mediaGeo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(moda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(desvioPadrao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(variancia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(coeVariancia)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(quantidade)
                    .addComponent(fiTotal)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("teste");
        getAccessibleContext().setAccessibleDescription("teste");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!inputValores.getText().isEmpty()) {
            String[] valInput = inputValores.getText().split(separador.getText());
            List<Double> valores = new ArrayList<>();
            for (String valor : valInput) {
                valores.add(Double.valueOf(valor));
            }
            Collections.sort(valores);
            es = new EstatisticaDescritiva(valores);
            media.setText(arredondar(es.media()));
            moda.setText(arredondar(es.moda()));
            mediana.setText(arredondar(es.mediana()));
            desvioPadrao.setText(arredondar(es.desvioPadrao()));
            variancia.setText(arredondar(es.getVariancia()));
            coeVariancia.setText(arredondar(es.getCoeficienteVariacao()));
            mediaGeo.setText(arredondar(es.getMediaGeometrica()));

            List<Integer> valoresInteiros = new ArrayList<>();
            for (Double valore : valores) {
                valoresInteiros.add(valore.intValue());
            }

            Integer r = valoresInteiros.get(valoresInteiros.size() - 1) - valoresInteiros.get(0);
            Double k = new BigDecimal(1 + 3.22 * Math.log10(valoresInteiros.size())).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
            Double hAux = r / k;
            Integer h = new BigDecimal(hAux).setScale(0, RoundingMode.HALF_UP).intValue();

            Integer maximo = valoresInteiros.get(valoresInteiros.size() - 1);
            Integer primeiro = valoresInteiros.get(0);
            List<DistribuicaoDeFrequencia> dfList = new ArrayList<>();
            while (primeiro < maximo) {
                DistribuicaoDeFrequencia df = new DistribuicaoDeFrequencia(primeiro, primeiro + h);
                int count = 0;
                for (Integer valor : valoresInteiros) {
                    if (valor >= df.getInicio() && valor < df.getFim()) {
                        count++;
                    }
                }
                df.setFi(count);
                dfList.add(df);
                primeiro = primeiro + h;
            }
            Integer ultimo = 0;
            Double ultimoFacR = 0.0;
            Double fiPortcet = 0.0;
            for (DistribuicaoDeFrequencia df : dfList) {
                df.setFac(ultimo + df.getFi());
                ultimo = ultimo + df.getFi();
                df.setFiPorcent(df.getFi().doubleValue() / valoresInteiros.size() * 100.0);
                fiPortcet += df.getFi().doubleValue() / valoresInteiros.size() * 100.0;
                df.setFacr(ultimoFacR + df.getFiPorcent());
                ultimoFacR = ultimoFacR + df.getFiPorcent();
            }
            int index = 0;
            for (DistribuicaoDeFrequencia df : dfList) {
                distFreqTable.setValueAt(df.getValor(), index, 0);
                distFreqTable.setValueAt(df.getFi(), index, 1);
                distFreqTable.setValueAt(df.getXi(), index, 2);
                distFreqTable.setValueAt(df.getFac(), index, 3);
                distFreqTable.setValueAt(new BigDecimal(df.getFiPorcent()).setScale(2, RoundingMode.HALF_EVEN).toString(), index, 4);
                distFreqTable.setValueAt(new BigDecimal(df.getFacr()).setScale(2, RoundingMode.HALF_EVEN).toString(), index, 5);
                index++;
            }
            quantidade.setText(String.valueOf(valoresInteiros.size()));
            fiTotal.setText(String.valueOf(fiPortcet));

            DefaultTableCellRenderer center = new DefaultTableCellRenderer();

            center.setHorizontalAlignment(SwingConstants.CENTER);
            distFreqTable.getColumnModel().getColumn(0).setCellRenderer(center);
            distFreqTable.getColumnModel().getColumn(1).setCellRenderer(center);
            distFreqTable.getColumnModel().getColumn(2).setCellRenderer(center);
            distFreqTable.getColumnModel().getColumn(3).setCellRenderer(center);
            distFreqTable.getColumnModel().getColumn(4).setCellRenderer(center);
            distFreqTable.getColumnModel().getColumn(5).setCellRenderer(center);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estatistica().setVisible(true);
            }
        });
    }

    public EstatisticaDescritiva getEs() {
        return es;
    }

    public void setEs(EstatisticaDescritiva es) {
        this.es = es;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coeVariancia;
    private javax.swing.JLabel desvioPadrao;
    private javax.swing.JTable distFreqTable;
    private javax.swing.JLabel fiTotal;
    private javax.swing.JTextArea inputValores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel media;
    private javax.swing.JLabel mediaGeo;
    private javax.swing.JLabel mediana;
    private javax.swing.JLabel moda;
    private javax.swing.JLabel modaText;
    private javax.swing.JLabel quantidade;
    private javax.swing.JTextField separador;
    private javax.swing.JLabel variancia;
    // End of variables declaration//GEN-END:variables
}
