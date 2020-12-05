

import java.io.EOFException;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
Jorge Vega
 */
public class Graficos extends javax.swing.JFrame {

    public Graficos() {
        initComponents();
        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        USUARIOS_NUEVOS = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        L17 = new javax.swing.JLabel();
        L14 = new javax.swing.JLabel();
        L15 = new javax.swing.JLabel();
        L16 = new javax.swing.JLabel();
        L18 = new javax.swing.JLabel();
        CAP_NOM = new javax.swing.JTextField();
        CAP_APE = new javax.swing.JTextField();
        CAP_USER = new javax.swing.JTextField();
        CAP_PAS = new javax.swing.JTextField();
        CAP_FINAL = new javax.swing.JFormattedTextField();
        CREAR_NUEVO_USUARIO = new javax.swing.JButton();
        L12 = new javax.swing.JLabel();
        L13 = new javax.swing.JLabel();
        HACER_COMPILADOR = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        L21 = new javax.swing.JLabel();
        L25 = new javax.swing.JLabel();
        L20 = new javax.swing.JLabel();
        NOM_COM = new javax.swing.JTextField();
        CREA_COM = new javax.swing.JTextField();
        BACK = new javax.swing.JButton();
        CREAR_NUEVO_COMPILADOR = new javax.swing.JButton();
        L23 = new javax.swing.JLabel();
        L24 = new javax.swing.JLabel();
        L22 = new javax.swing.JLabel();
        LEX_COM = new javax.swing.JFormattedTextField();
        SIN_COM = new javax.swing.JFormattedTextField();
        SEM_COM = new javax.swing.JFormattedTextField();
        L26 = new javax.swing.JLabel();
        GENEF_COM = new javax.swing.JTextField();
        L28 = new javax.swing.JLabel();
        L27 = new javax.swing.JLabel();
        GENEI_COM = new javax.swing.JTextField();
        COD_FIN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAB1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAB2 = new javax.swing.JTable();
        L29 = new javax.swing.JLabel();
        CANT_LIN = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        L2 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        CAPTURA_USER = new javax.swing.JTextField();
        CAPTURA_CONTRA = new javax.swing.JTextField();
        ENTRAR = new javax.swing.JButton();
        ANADIR_USER = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();

        USUARIOS_NUEVOS.setTitle("Crear Usuario");

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        L17.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L17.setForeground(new java.awt.Color(255, 255, 255));
        L17.setText("ELIJA UNA CONTRASE?A");

        L14.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L14.setForeground(new java.awt.Color(255, 255, 255));
        L14.setText("INGRESE EL NOMBRE");

        L15.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L15.setForeground(new java.awt.Color(255, 255, 255));
        L15.setText("INGRESE EL APELLIDO");

        L16.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L16.setForeground(new java.awt.Color(255, 255, 255));
        L16.setText("INGRESE UN USUARIO");

        L18.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L18.setForeground(new java.awt.Color(255, 255, 255));
        L18.setText("CALIFICACION FINAL");

        CAP_NOM.setBackground(new java.awt.Color(255, 255, 102));

        CAP_APE.setBackground(new java.awt.Color(255, 255, 102));

        CAP_USER.setBackground(new java.awt.Color(255, 255, 102));

        CAP_PAS.setBackground(new java.awt.Color(255, 255, 102));

        CAP_FINAL.setBackground(new java.awt.Color(255, 255, 102));
        CAP_FINAL.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));

        CREAR_NUEVO_USUARIO.setBackground(new java.awt.Color(51, 51, 51));
        CREAR_NUEVO_USUARIO.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        CREAR_NUEVO_USUARIO.setForeground(new java.awt.Color(255, 255, 255));
        CREAR_NUEVO_USUARIO.setText("CREAR USUARIO");
        CREAR_NUEVO_USUARIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CREAR_NUEVO_USUARIOMouseClicked(evt);
            }
        });

        L12.setBackground(new java.awt.Color(0, 102, 204));
        L12.setFont(new java.awt.Font("Tw Cen MT", 1, 28)); // NOI18N
        L12.setForeground(new java.awt.Color(255, 255, 255));
        L12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L12.setText("FORMULARIO DE ");
        L12.setOpaque(true);

        L13.setBackground(new java.awt.Color(0, 102, 204));
        L13.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        L13.setForeground(new java.awt.Color(255, 255, 255));
        L13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L13.setText("CREACION DE USUARIOS");
        L13.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CAP_PAS, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CAP_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CAP_APE, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CAP_NOM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CREAR_NUEVO_USUARIO)
                                    .addComponent(CAP_FINAL, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(L14))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(L15))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(L16))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(L18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(L17)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L12, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L13))))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(L13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(L14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CAP_NOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(L15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CAP_APE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(L16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CAP_USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(L17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CAP_PAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(L18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CAP_FINAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CREAR_NUEVO_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout USUARIOS_NUEVOSLayout = new javax.swing.GroupLayout(USUARIOS_NUEVOS.getContentPane());
        USUARIOS_NUEVOS.getContentPane().setLayout(USUARIOS_NUEVOSLayout);
        USUARIOS_NUEVOSLayout.setHorizontalGroup(
            USUARIOS_NUEVOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        USUARIOS_NUEVOSLayout.setVerticalGroup(
            USUARIOS_NUEVOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HACER_COMPILADOR.setTitle("CREAR NUEVO COMPILADOR");

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

        L21.setBackground(new java.awt.Color(255, 255, 255));
        L21.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L21.setForeground(new java.awt.Color(255, 255, 255));
        L21.setText("NOMBRE COMPILADOR");

        L25.setBackground(new java.awt.Color(255, 255, 255));
        L25.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L25.setForeground(new java.awt.Color(255, 255, 255));
        L25.setText("NOMBRE CREADOR");

        L20.setBackground(new java.awt.Color(0, 102, 204));
        L20.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        L20.setForeground(new java.awt.Color(255, 255, 255));
        L20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L20.setText("FORMULARIO PARA CREAR COMPILADORES");
        L20.setOpaque(true);

        BACK.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        BACK.setText("BACK");
        BACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKMouseClicked(evt);
            }
        });

        CREAR_NUEVO_COMPILADOR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CREAR_NUEVO_COMPILADOR.setText("CREAR COMPILADOR");
        CREAR_NUEVO_COMPILADOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CREAR_NUEVO_COMPILADORMouseClicked(evt);
            }
        });

        L23.setBackground(new java.awt.Color(255, 255, 255));
        L23.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L23.setForeground(new java.awt.Color(255, 255, 255));
        L23.setText("ANALISIS LEXICO");

        L24.setBackground(new java.awt.Color(255, 255, 255));
        L24.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L24.setForeground(new java.awt.Color(255, 255, 255));
        L24.setText("ANALISIS SINTACTICO");

        L22.setBackground(new java.awt.Color(255, 255, 255));
        L22.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L22.setForeground(new java.awt.Color(255, 255, 255));
        L22.setText("ANALISIS SEMANTICO");

        LEX_COM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        SIN_COM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        SEM_COM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        L26.setBackground(new java.awt.Color(255, 255, 255));
        L26.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L26.setForeground(new java.awt.Color(255, 255, 255));
        L26.setText("GENE. CODIGO");

        L28.setBackground(new java.awt.Color(255, 255, 255));
        L28.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L28.setForeground(new java.awt.Color(255, 255, 255));
        L28.setText("GENE. FINAL CODIGO");

        L27.setBackground(new java.awt.Color(255, 255, 255));
        L27.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L27.setForeground(new java.awt.Color(255, 255, 255));
        L27.setText("OPTIMI.CODIGO");

        TAB1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "SIMBOLOS", "TIPOS"
            }
        ));
        jScrollPane1.setViewportView(TAB1);

        TAB2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ERRORES", "DESCRIPCIONES"
            }
        ));
        jScrollPane2.setViewportView(TAB2);

        L29.setBackground(new java.awt.Color(255, 255, 255));
        L29.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        L29.setForeground(new java.awt.Color(255, 255, 255));
        L29.setText("CANTIDAD DE LINEAS");

        CANT_LIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANT_LINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CREAR_NUEVO_COMPILADOR)
                .addGap(52, 52, 52))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(L21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NOM_COM, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(L22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SEM_COM, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(374, 374, 374))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CREA_COM, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(L25))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(GENEI_COM, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(L26))
                                        .addGap(3, 3, 3)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(GENEF_COM, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(L27))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(L28)
                                                    .addComponent(COD_FIN, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(LEX_COM, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(L23))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(L24)
                                                    .addComponent(SIN_COM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CANT_LIN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(L29)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(L20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(L22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SEM_COM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(L21)
                                    .addComponent(L23)
                                    .addComponent(L24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NOM_COM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LEX_COM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SIN_COM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(L26)
                                    .addComponent(L27)
                                    .addComponent(L28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(GENEI_COM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GENEF_COM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(COD_FIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(L25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CREA_COM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(L29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CANT_LIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CREAR_NUEVO_COMPILADOR, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout HACER_COMPILADORLayout = new javax.swing.GroupLayout(HACER_COMPILADOR.getContentPane());
        HACER_COMPILADOR.getContentPane().setLayout(HACER_COMPILADORLayout);
        HACER_COMPILADORLayout.setHorizontalGroup(
            HACER_COMPILADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HACER_COMPILADORLayout.setVerticalGroup(
            HACER_COMPILADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        L2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        L2.setForeground(new java.awt.Color(255, 255, 255));
        L2.setText("CONTRASEÑA");

        L1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setText("USUARIO");

        CAPTURA_USER.setBackground(new java.awt.Color(153, 153, 255));

        CAPTURA_CONTRA.setBackground(new java.awt.Color(153, 153, 255));

        ENTRAR.setBackground(new java.awt.Color(51, 51, 51));
        ENTRAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ENTRAR.setForeground(new java.awt.Color(255, 255, 255));
        ENTRAR.setText("ENTRAR");
        ENTRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENTRARMouseClicked(evt);
            }
        });

        ANADIR_USER.setBackground(new java.awt.Color(0, 0, 102));
        ANADIR_USER.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ANADIR_USER.setForeground(new java.awt.Color(255, 255, 0));
        ANADIR_USER.setText("Cree Usuario");
        ANADIR_USER.setOpaque(true);
        ANADIR_USER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ANADIR_USERMouseClicked(evt);
            }
        });

        L3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        L3.setForeground(new java.awt.Color(255, 255, 255));
        L3.setText("Si aun no tiene");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(L2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CAPTURA_USER)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CAPTURA_CONTRA, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(ENTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(L3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANADIR_USER)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(L1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CAPTURA_USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(L2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CAPTURA_CONTRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ENTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L3)
                    .addComponent(ANADIR_USER))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ENTRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRARMouseClicked
       
        
        
        
        
        String CapturaTex_Usuario = CAPTURA_USER.getText();
        String CapturaTex_Contra = CAPTURA_CONTRA.getText();
        Clase_SuperUser ob = new Clase_SuperUser();
        String usuario = ob.getUSER();
        String password = ob.getPASS();
        String nom = ob.getNAME();
        String ape = ob.getLAST_NAME();


        
        
        
        
        
        if ((CapturaTex_Usuario.contains(usuario)) && (CapturaTex_Contra.contains(password))) {
            JOptionPane.showMessageDialog(this, " Hola " + nom + " " + ape);

        } else {}
        ArrayList User = new ArrayList();
        ArrayList Contras = new ArrayList();
        Administrar_User Referencia_Torona = new Administrar_User("./List_Alumnos.txt");
        Referencia_Torona.FILE_LOADING();
        for (int i = 0; i < Referencia_Torona.getUSUARIOS_LISTADOS().size(); i++) {
            User.add(Referencia_Torona.getUSUARIOS_LISTADOS().get(i).getUSER());
            Contras.add(Referencia_Torona.getUSUARIOS_LISTADOS().get(i).getPASS());
        }if (User.contains(CAPTURA_USER.getText()) && Contras.contains(CAPTURA_CONTRA.getText())) {
            dispose();
            ANADIR_COMPI();
        } else {}
    }//GEN-LAST:event_ENTRARMouseClicked

    private void ANADIR_USERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ANADIR_USERMouseClicked
        dispose();
        ANADIR_USU();
    }//GEN-LAST:event_ANADIR_USERMouseClicked

    private void CREAR_NUEVO_USUARIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CREAR_NUEVO_USUARIOMouseClicked
        try {
            Clase_Users PERSON = new Clase_Users(CAP_NOM.getText(), CAP_APE.getText(), CAP_USER.getText(), CAP_PAS.getText(), Integer.parseInt(CAP_FINAL.getText()));
            Administrar_User admi = new Administrar_User("./List_Alumnos.txt");
            admi.FILE_LOADING();
            admi.setALUMNO(PERSON);
            admi.SHOW_FILE();
            JOptionPane.showMessageDialog(this, "SE HA CREADO UN NUEVO USUARIO");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "IMPOSIBLE, INTENTE DE NUEVO");
        }

        USUARIOS_NUEVOS.setModal(false);
        USUARIOS_NUEVOS.setVisible(false);
        new Graficos().setVisible(true);
    }//GEN-LAST:event_CREAR_NUEVO_USUARIOMouseClicked

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        HACER_COMPILADOR.setModal(false);
        HACER_COMPILADOR.setVisible(false);
        new Graficos().setVisible(true);
    }//GEN-LAST:event_BACKMouseClicked

    private void CREAR_NUEVO_COMPILADORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CREAR_NUEVO_COMPILADORMouseClicked
        try {            
            DefaultTableModel MENSA_ERROR = (DefaultTableModel) TAB2.getModel();
            DefaultTableModel SIMB = (DefaultTableModel) TAB1.getModel();
            
            Analisis ANALISIS = new Analisis(Integer.parseInt(LEX_COM.getText()),Integer.parseInt(SIN_COM.getText()),Integer.parseInt(SEM_COM.getText()));
            Sintesis SINTESIS = new Sintesis(Integer.parseInt(GENEI_COM.getText()),Integer.parseInt(GENEF_COM.getText()),Integer.parseInt(COD_FIN.getText()));
            
            Clase_Compiladores COMP = new Clase_Compiladores(NOM_COM.getText(),CREA_COM.getText(),Integer.parseInt(CANT_LIN.getText()),ANALISIS,SINTESIS,SIMB,MENSA_ERROR);

            COMP.setERROR(MENSA_ERROR);
            COMP.setSIMBOLOGIA(SIMB);
            
            Compi_Admin Y = new Compi_Admin("./compiladors.txt"); 
            Y.FILE_LOADING();
            Y.setCOMPI(COMP);
            Y.SHOW_FILE();
        } catch (Exception D) {
            JOptionPane.showMessageDialog(this, "IMPOSIBLE, INTENTE DE NUEVO");
        }
        
        HACER_COMPILADOR.setModal(false);
        HACER_COMPILADOR.setVisible(false);
        new Graficos().setVisible(true);
    }//GEN-LAST:event_CREAR_NUEVO_COMPILADORMouseClicked

    private void CANT_LINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANT_LINActionPerformed

    }//GEN-LAST:event_CANT_LINActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficos().setVisible(true);
            }
        });
    }

    public void ANADIR_USU() {
        USUARIOS_NUEVOS.pack();
        USUARIOS_NUEVOS.setModal(true);
        USUARIOS_NUEVOS.setLocationRelativeTo(this);
        USUARIOS_NUEVOS.setVisible(true);
    }

    public void ANADIR_COMPI() {
        HACER_COMPILADOR.pack();
        HACER_COMPILADOR.setModal(true);
        HACER_COMPILADOR.setLocationRelativeTo(this);
        HACER_COMPILADOR.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANADIR_USER;
    private javax.swing.JButton BACK;
    private javax.swing.JTextField CANT_LIN;
    private javax.swing.JTextField CAPTURA_CONTRA;
    private javax.swing.JTextField CAPTURA_USER;
    private javax.swing.JTextField CAP_APE;
    private javax.swing.JFormattedTextField CAP_FINAL;
    private javax.swing.JTextField CAP_NOM;
    private javax.swing.JTextField CAP_PAS;
    private javax.swing.JTextField CAP_USER;
    private javax.swing.JTextField COD_FIN;
    private javax.swing.JButton CREAR_NUEVO_COMPILADOR;
    private javax.swing.JButton CREAR_NUEVO_USUARIO;
    private javax.swing.JTextField CREA_COM;
    private javax.swing.JButton ENTRAR;
    private javax.swing.JTextField GENEF_COM;
    private javax.swing.JTextField GENEI_COM;
    private javax.swing.JDialog HACER_COMPILADOR;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L13;
    private javax.swing.JLabel L14;
    private javax.swing.JLabel L15;
    private javax.swing.JLabel L16;
    private javax.swing.JLabel L17;
    private javax.swing.JLabel L18;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L20;
    private javax.swing.JLabel L21;
    private javax.swing.JLabel L22;
    private javax.swing.JLabel L23;
    private javax.swing.JLabel L24;
    private javax.swing.JLabel L25;
    private javax.swing.JLabel L26;
    private javax.swing.JLabel L27;
    private javax.swing.JLabel L28;
    private javax.swing.JLabel L29;
    private javax.swing.JLabel L3;
    private javax.swing.JFormattedTextField LEX_COM;
    private javax.swing.JTextField NOM_COM;
    private javax.swing.JFormattedTextField SEM_COM;
    private javax.swing.JFormattedTextField SIN_COM;
    private javax.swing.JTable TAB1;
    private javax.swing.JTable TAB2;
    private javax.swing.JDialog USUARIOS_NUEVOS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
