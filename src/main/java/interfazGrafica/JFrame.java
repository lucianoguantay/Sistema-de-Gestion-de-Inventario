package interfazGrafica;

import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import logica.*;
public class JFrame extends javax.swing.JFrame {
    private ListaEnlazada lista;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrame.class.getName());

    public JFrame(ListaEnlazada lista) {
        this.lista=lista;
        initComponents();
     
        Icon imagenEdificio = new ImageIcon(new ImageIcon (getClass().getResource("/Imagenes/edificioInicio.jpg")).getImage()
        .getScaledInstance(imagenInicio.getWidth(), imagenInicio.getHeight(), 0));
        //imagenInicio.getWidth(), imagenInicio.getHeight()
        imagenInicio.setIcon(imagenEdificio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        JpanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        botonVer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        imagenInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        JpanelPrincipal.setBackground(new java.awt.Color(240, 189, 189));

        jLabel1.setBackground(new java.awt.Color(84, 58, 58));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO AL CENTRO DE CONTROL");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 39, 39));
        jLabel2.setText("INICIAR SESION");
        jLabel2.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108, 50, 50), 4));
        jPanel1.setForeground(new java.awt.Color(219, 171, 171));
        jPanel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setText("USUARIO");

        labelNombre.setForeground(new java.awt.Color(144, 144, 144));
        labelNombre.setText("Ingresar nombre de usuario");
        labelNombre.setToolTipText("");
        labelNombre.setBorder(null);
        labelNombre.setCaretColor(new java.awt.Color(153, 0, 51));
        labelNombre.addActionListener(this::labelNombreActionPerformed);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setText("CONTRASEÑA");

        password.setForeground(new java.awt.Color(0, 0, 0));
        password.addActionListener(this::passwordActionPerformed);

        botonVer.setBackground(new java.awt.Color(52, 35, 35));
        botonVer.setForeground(new java.awt.Color(255, 255, 255));
        botonVer.setText("Ver");
        botonVer.addActionListener(this::botonVerActionPerformed);

        jButton1.setBackground(new java.awt.Color(52, 35, 35));
        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(117, 117, 117))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(143, 143, 143))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonVer, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(botonVer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout JpanelPrincipalLayout = new javax.swing.GroupLayout(JpanelPrincipal);
        JpanelPrincipal.setLayout(JpanelPrincipalLayout);
        JpanelPrincipalLayout.setHorizontalGroup(
            JpanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(JpanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(JpanelPrincipalLayout.createSequentialGroup()
                        .addGroup(JpanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagenInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        JpanelPrincipalLayout.setVerticalGroup(
            JpanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGroup(JpanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelPrincipalLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(imagenInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JpanelPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelNombreActionPerformed

    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed

        if (botonVer.getText().equals("Ver")){
            password.setEchoChar((char) 0);
            botonVer.setText("Ocultar");
        }else{                                  //El boton dice ocultar
            password.setEchoChar('*');
            botonVer.setText("Ver");
        }
    }//GEN-LAST:event_botonVerActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
    int anchoDinamico = imagenInicio.getWidth();
    int altoDinamico = imagenInicio.getHeight();
    
    // 2. Solo achicamos la foto si la ventana ya tiene un tamaño real (mayor a 0)
    if (anchoDinamico > 0 && altoDinamico > 0) {
        Icon imagenEdificio = new ImageIcon(new ImageIcon (getClass().getResource("/Imagenes/edificioInicio.jpg")).getImage()
        .getScaledInstance(anchoDinamico, altoDinamico, 0));
        imagenInicio.setIcon(imagenEdificio);
      
            
    }
    }//GEN-LAST:event_formComponentResized

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!labelNombre.getText().equals("") && !labelNombre.getText().equals("Ingresar nombre de usuario") && !password.getText().equals("")){
            JFrameSegundo pantallaAplicacion = new JFrameSegundo (lista);
            pantallaAplicacion.setExtendedState(MAXIMIZED_BOTH);
            pantallaAplicacion.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "USUARIO INVALIDO", "Error al iniciar sesion", HEIGHT);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelPrincipal;
    private javax.swing.JButton botonVer;
    private javax.swing.JLabel imagenInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField labelNombre;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
