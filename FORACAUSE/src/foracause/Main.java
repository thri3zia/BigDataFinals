/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1styrGroupB
 */

package foracause;

import java.awt.Component;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;




public class Main extends javax.swing.JFrame {
    
    double PmangoTree = 100.00;     //offered trees to choose in the first kind panel
    double PpeachTree = 150.00;
    double PlimeTree = 100.00;
    double PorangeTree = 200.00;
    double PavocadoTree = 100.00;
    double PnarraTree = 200.00;     //offered trees to choose in the second kind panel
    double PacaciaTree = 300.00;
    double PbambooTree = 150.00;
    double PmahoganyTree = 250.00;
    double PmangroveTree = 150.00;
    double Tax_rate = 1.00;
    
    double iTax,iSubTotal,iTotal,iChange;
    
    double[] ItemCost = new double[10];

    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Kinds = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTxtMango = new javax.swing.JTextField();
        jTxtpeach = new javax.swing.JTextField();
        jTxtlime = new javax.swing.JTextField();
        jTxtorange = new javax.swing.JTextField();
        jTxtavocado = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        Kinds1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTxtnarra = new javax.swing.JTextField();
        jTxtacacia = new javax.swing.JTextField();
        jTxxtbamboo = new javax.swing.JTextField();
        jTxtmahogany = new javax.swing.JTextField();
        jTxtmangrove = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        subtotal2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCmbMethod = new javax.swing.JComboBox<>();
        jTxtAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTxtChange = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jBtnReset = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jBtnTotal = new javax.swing.JButton();
        jBtnReceipt = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtReceipt = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTxtSubtotal = new javax.swing.JTextField();
        jTxttax = new javax.swing.JTextField();
        jTxtTotal = new javax.swing.JTextField();
        jlblsubtotal = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(138, 154, 91));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(44, 95, 45));
        jLabel1.setText("FOR A CAUSE SYSTEM");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(300, 300, 300))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel2.setBackground(new java.awt.Color(44, 95, 45));

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(138, 154, 91)));

        Kinds.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        Kinds.setText("FRUIT - BEARING TREES");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setText("MANGO TREE");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setText("PEACH TREE");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setText("AVOCADO TREE");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setText("LIME TREE");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setText("ORANGE TREE");

        jTxtMango.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtMango.setText("0");
        jTxtMango.setToolTipText("");
        jTxtMango.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtMangoActionPerformed(evt);
            }
        });
        jTxtMango.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtMangoKeyTyped(evt);
            }
        });

        jTxtpeach.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtpeach.setText("0");
        jTxtpeach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtpeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtpeachActionPerformed(evt);
            }
        });
        jTxtpeach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtpeachKeyTyped(evt);
            }
        });

        jTxtlime.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtlime.setText("0");
        jTxtlime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtlime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtlimeActionPerformed(evt);
            }
        });
        jTxtlime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtlimeKeyTyped(evt);
            }
        });

        jTxtorange.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtorange.setText("0");
        jTxtorange.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtorange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtorangeActionPerformed(evt);
            }
        });
        jTxtorange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtorangeKeyTyped(evt);
            }
        });

        jTxtavocado.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtavocado.setText("0");
        jTxtavocado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtavocado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtavocadoActionPerformed(evt);
            }
        });
        jTxtavocado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtavocadoKeyTyped(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(138, 154, 91));
        jSeparator2.setForeground(new java.awt.Color(138, 154, 91));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Kinds)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(86, 86, 86)
                            .addComponent(jTxtMango, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtavocado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtorange, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtlime, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(92, 92, 92)
                                .addComponent(jTxtpeach, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Kinds)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtMango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTxtpeach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtlime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtorange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtavocado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(138, 154, 91)));

        Kinds1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        Kinds1.setText("NON-FRUIT BEARING TREES");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setText("ACACIA TREE");

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel10.setText("NARRA TREE");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setText("BAMBOO TREE");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel12.setText("MAHOGANY TREE");

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel13.setText("MANGROVE TREE");

        jTxtnarra.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtnarra.setText("0");
        jTxtnarra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtnarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtnarraActionPerformed(evt);
            }
        });
        jTxtnarra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtnarraKeyTyped(evt);
            }
        });

        jTxtacacia.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtacacia.setText("0");
        jTxtacacia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtacacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtacaciaActionPerformed(evt);
            }
        });
        jTxtacacia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtacaciaKeyTyped(evt);
            }
        });

        jTxxtbamboo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxxtbamboo.setText("0");
        jTxxtbamboo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxxtbamboo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxxtbambooActionPerformed(evt);
            }
        });
        jTxxtbamboo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxxtbambooKeyTyped(evt);
            }
        });

        jTxtmahogany.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtmahogany.setText("0");
        jTxtmahogany.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtmahogany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtmahoganyActionPerformed(evt);
            }
        });
        jTxtmahogany.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtmahoganyKeyTyped(evt);
            }
        });

        jTxtmangrove.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtmangrove.setText("0");
        jTxtmangrove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtmangrove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtmangroveActionPerformed(evt);
            }
        });
        jTxtmangrove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtmangroveKeyTyped(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(138, 154, 91));
        jSeparator1.setForeground(new java.awt.Color(138, 154, 91));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtmangrove, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtnarra, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtmahogany, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxxtbamboo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtacacia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Kinds1)))
                .addGap(44, 44, 44))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Kinds1)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtnarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtacacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxxtbamboo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtmahogany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTxtmangrove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(138, 154, 91)));

        subtotal2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel2.setText("PAYMENT METHOD");

        jCmbMethod.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jCmbMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH", "DEBIT CARD", "ONLINE PAYMENT", "VISA CARD" }));
        jCmbMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbMethodActionPerformed(evt);
            }
        });

        jTxtAmount.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtAmount.setText("0");
        jTxtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAmountActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setText("AMOUNT:");

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel14.setText("CHANGE:");

        jTxtChange.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtChange.setText("0");
        jTxtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(subtotal2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jCmbMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCmbMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtAmount)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTxtChange))
                .addGap(14, 14, 14))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(138, 154, 91)));

        jBtnReset.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jBtnReset.setText("RESET");
        jBtnReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jBtnExit.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jBtnExit.setText("EXIT");
        jBtnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        jBtnTotal.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jBtnTotal.setText("TOTAL");
        jBtnTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jBtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTotalActionPerformed(evt);
            }
        });

        jBtnReceipt.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jBtnReceipt.setText("RECEIPT");
        jBtnReceipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jBtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReceiptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jBtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(138, 154, 91)));

        jtxtReceipt.setColumns(20);
        jtxtReceipt.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jtxtReceipt.setRows(5);
        jScrollPane1.setViewportView(jtxtReceipt);

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel15.setText("PROOF OF PAYMENT");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(53, 53, 53))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(138, 154, 91)));

        jTxtSubtotal.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtSubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSubtotalActionPerformed(evt);
            }
        });

        jTxttax.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxttax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxttax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxttaxActionPerformed(evt);
            }
        });

        jTxtTotal.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTxtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTotalActionPerformed(evt);
            }
        });

        jlblsubtotal.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jlblsubtotal.setText("SUB - TOTAL:");

        tax.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        tax.setText("TAX :");

        jlblTotal.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jlblTotal.setText("TOTAL:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jlblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(tax)
                                .addGap(36, 36, 36))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap(46, Short.MAX_VALUE)
                                .addComponent(jlblsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxttax, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxttax, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tax))
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblsubtotal)
                    .addComponent(jTxtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal)
                    .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSubtotalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTxtSubtotalActionPerformed

    private void jTxttaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxttaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxttaxActionPerformed

    private void jTxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTotalActionPerformed

    private void jTxtMangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtMangoActionPerformed
         
    }//GEN-LAST:event_jTxtMangoActionPerformed

    private void jTxtpeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtpeachActionPerformed
        
    }//GEN-LAST:event_jTxtpeachActionPerformed

    private void jTxtlimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtlimeActionPerformed
        
    }//GEN-LAST:event_jTxtlimeActionPerformed

    private void jTxtorangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtorangeActionPerformed
        
    }//GEN-LAST:event_jTxtorangeActionPerformed

    private void jTxtavocadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtavocadoActionPerformed
        
    }//GEN-LAST:event_jTxtavocadoActionPerformed

    private void jTxtnarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtnarraActionPerformed
        
    }//GEN-LAST:event_jTxtnarraActionPerformed

    private void jTxtacaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtacaciaActionPerformed
        
    }//GEN-LAST:event_jTxtacaciaActionPerformed

    private void jTxxtbambooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxxtbambooActionPerformed
        
    }//GEN-LAST:event_jTxxtbambooActionPerformed

    private void jTxtmahoganyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtmahoganyActionPerformed
        
    }//GEN-LAST:event_jTxtmahoganyActionPerformed

    private void jTxtmangroveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtmangroveActionPerformed
        
    }//GEN-LAST:event_jTxtmangroveActionPerformed
private JFrame frame;
    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
    frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","For A Cause System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
            
        }
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        jTxtMango.setText("0");
        jTxtpeach.setText("0");
        jTxtlime.setText("0");
        jTxtorange.setText("0");
        jTxtavocado.setText("0");
        
        jTxtnarra.setText("0");
        jTxtacacia.setText("0");
        jTxxtbamboo.setText("0");
        jTxtmahogany.setText("0");
        jTxtmangrove.setText("0");

        jTxttax.setText("0");
        jTxtSubtotal.setText("0");
        jTxtTotal.setText("0");
        
        jTxtAmount.setText("0");
        jTxtChange.setText("0");
        jtxtReceipt.setText("");
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jCmbMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbMethodActionPerformed

    private void jTxtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAmountActionPerformed

    private void jTxtMangoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtMangoKeyTyped
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
             ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTxtMangoKeyTyped

    private void jTxtpeachKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtpeachKeyTyped
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTxtpeachKeyTyped

    private void jTxtlimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtlimeKeyTyped
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTxtlimeKeyTyped

    private void jTxtorangeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtorangeKeyTyped
    char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTxtorangeKeyTyped

    private void jTxtavocadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtavocadoKeyTyped
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTxtavocadoKeyTyped

    private void jTxtnarraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtnarraKeyTyped
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTxtnarraKeyTyped

    private void jTxtacaciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtacaciaKeyTyped
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTxtacaciaKeyTyped

    private void jTxxtbambooKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxxtbambooKeyTyped
    char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTxxtbambooKeyTyped

    private void jTxtmahoganyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtmahoganyKeyTyped
    char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTxtmahoganyKeyTyped

    private void jTxtmangroveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtmangroveKeyTyped
    char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTxtmangroveKeyTyped

    private void jBtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTotalActionPerformed
  
        ItemCost[0] = PmangoTree * Double.parseDouble(jTxtMango.getText());
        ItemCost[1] = PpeachTree * Double.parseDouble(jTxtpeach.getText());
        ItemCost[2] = PlimeTree * Double.parseDouble(jTxtlime.getText());
        ItemCost[3] = PorangeTree * Double.parseDouble(jTxtorange.getText());
        ItemCost[3] = PavocadoTree * Double.parseDouble(jTxtavocado.getText());
        ItemCost[5] = PnarraTree * Double.parseDouble(jTxtnarra.getText());
        ItemCost[6] = PacaciaTree * Double.parseDouble(jTxtacacia.getText());
        ItemCost[7] = PbambooTree * Double.parseDouble(jTxxtbamboo.getText());
        ItemCost[8] = PmahoganyTree * Double.parseDouble(jTxtmahogany.getText());
        ItemCost[9] = PmangroveTree * Double.parseDouble(jTxtmangrove.getText());
        iChange = Double.parseDouble(jTxtAmount.getText());
        
        
        
        String PaymentMethod = (String)jCmbMethod.getSelectedItem();
        if("CASH".equals(PaymentMethod))
        {
        iSubTotal = ItemCost[0] + ItemCost[1] + ItemCost[2] + ItemCost[3] + ItemCost[4] + ItemCost[5]+
                    ItemCost[6] + ItemCost[7] + ItemCost[8] + ItemCost[9];
        if(iChange >= iSubTotal)
        {
        iTax = (iSubTotal * Tax_rate)/100;
        
        String cTax = String.format("₱%.2f",iTax);
        jTxttax.setText(cTax);
        
        String cSubtotal = String.format("₱%.2f",iSubTotal);
        jTxtSubtotal.setText(cSubtotal);
        
        String cTotal = String.format("₱%.2f",iTax + iSubTotal);
        jTxtTotal.setText(cTotal);
        
        String cChange = String.format("₱%.2f", iChange - (iSubTotal + iTax));
        jTxtChange.setText(cChange);
        }
        else
        {
           JOptionPane.showMessageDialog(null,"Enter enough cash entered. Please Input Amount.","FOR A CAUSE SYSTEM",HEIGHT);  
        }
        }
        else if ("DEBIT CARD".equals(PaymentMethod) || "ONLINE PAYMENT".equals(PaymentMethod) || "VISA CARD".equals(PaymentMethod) );
        {
            iSubTotal = ItemCost[0] + ItemCost[1] + ItemCost[2] + ItemCost[3] + ItemCost[4] + ItemCost[5]+
                        ItemCost[6] + ItemCost[7] + ItemCost[8] + ItemCost[9];

            iTax = (iSubTotal * Tax_rate)/100;

            String cTax = String.format("₱%.2f",iTax);
            jTxttax.setText(cTax);

            String cSubtotal = String.format("₱%.2f",iSubTotal);
            jTxtSubtotal.setText(cSubtotal);

            String cTotal = String.format("₱%.2f",iTax + iSubTotal );
            jTxtTotal.setText(cTotal);
        }
        
    }//GEN-LAST:event_jBtnTotalActionPerformed

    private void jTxtChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtChangeActionPerformed

    private void jBtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReceiptActionPerformed

        
        
        ////////////////////////////////////////////
        int refs = 1347 + (int)(Math.random()*4238);
        ///////////////////////////////////////////////
        
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat ("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat tDate = new SimpleDateFormat ("dd:MMM:yyyy");
        tDate.format(timer.getTime());
        
        jtxtReceipt.append("\t   FOR A CAUSE SYSTEM\n"+ 
                "Reference:\t\t\t"+ refs + 
                "\n======================================\n" +
                    "\t        TAX:\t"+ jTxttax.getText() +"\n"+
                    "\t  SUB-TOTAL:\t"+jTxtSubtotal.getText() +"\n"+
                    "\t      TOTAL:\t"+jTxtTotal.getText() +"\n"+
                    "\tCASH AMOUNT:\t"+jTxtAmount.getText() +"\n"+
                    "\t     CHANGE:\t"+jTxtChange.getText() +"\n"+
                "======================================"+
                    "\nDATE:" + tDate.format(timer.getTime())+
                    "\tTIME:" + tTime.format(timer.getTime())+
                            "\n\n\t     THANK YOU" + 
                "\n\n  FROM ALL OF US, WE THANK YOU USER \n\tFOR USING OUR SYSTEM.\n\t HAVE A GREAT DAY!");
       
    }//GEN-LAST:event_jBtnReceiptActionPerformed
   
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kinds;
    private javax.swing.JLabel Kinds1;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnReceipt;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnTotal;
    private javax.swing.JComboBox<String> jCmbMethod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTxtAmount;
    private javax.swing.JTextField jTxtChange;
    private javax.swing.JTextField jTxtMango;
    private javax.swing.JTextField jTxtSubtotal;
    private javax.swing.JTextField jTxtTotal;
    private javax.swing.JTextField jTxtacacia;
    private javax.swing.JTextField jTxtavocado;
    private javax.swing.JTextField jTxtlime;
    private javax.swing.JTextField jTxtmahogany;
    private javax.swing.JTextField jTxtmangrove;
    private javax.swing.JTextField jTxtnarra;
    private javax.swing.JTextField jTxtorange;
    private javax.swing.JTextField jTxtpeach;
    private javax.swing.JTextField jTxttax;
    private javax.swing.JTextField jTxxtbamboo;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JLabel jlblsubtotal;
    private javax.swing.JTextArea jtxtReceipt;
    private javax.swing.JLabel subtotal2;
    private javax.swing.JLabel tax;
    // End of variables declaration//GEN-END:variables
}