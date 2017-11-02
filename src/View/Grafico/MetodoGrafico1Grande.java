package View.Grafico;

import View.MenuProgramacionLineal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.swing.*;
public class MetodoGrafico1Grande extends javax.swing.JFrame {
    static int x;
    int zx1,zx2,zx3,r1x1,r1x2,r1x3,r2x1,r2x2,r2x3,r3x2,r1,r2,r3;
    int pxr1,pyr1,pxr2,pyr2,pxr3,pyr3;
    int sacarx2,sacarx1,cero=0,segundorenglon,segundorenglon2,tercervalor,tercervalor2;

    
    
    public MetodoGrafico1Grande() {
        
        initComponents();
        this.setTitle("Metod Grafico");
        this.setSize(815, 550);
 
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Dibuja = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Nuevo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        TerceraC2 = new javax.swing.JTextField();
        TerceraC1 = new javax.swing.JTextField();
        TerceraC3 = new javax.swing.JTextField();
        SegundaC2 = new javax.swing.JTextField();
        C1 = new javax.swing.JTextField();
        C3 = new javax.swing.JTextField();
        SegundaC1 = new javax.swing.JTextField();
        ValorY = new javax.swing.JTextField();
        SegundaC3 = new javax.swing.JTextField();
        ValorX = new javax.swing.JTextField();
        C2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 500));

        jLabel1.setText("Z=");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jLabel3.setText("X2 =");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));

        jLabel5.setText("X1 +");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        Dibuja.setText("Dibuja");
        Dibuja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DibujaMouseClicked(evt);
            }
        });
        Dibuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DibujaActionPerformed(evt);
            }
        });
        getContentPane().add(Dibuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Restricciones:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jLabel7.setText("X1 +");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        jLabel8.setText("X2 =");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, -1));

        jLabel9.setText("X2 =");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        jLabel10.setText("X1 +");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, -1));

        jButton1.setText("Resolver");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, -1, -1));

        jLabel11.setText("X1 +");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jLabel12.setText("X2");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, -1));

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 540));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 250, 130));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 60, -1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 80, -1));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 70, -1));

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 60, -1));

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 60, -1));

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 70, -1));

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 60, -1));

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 60, -1));

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 70, -1));

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 60, -1));

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 60, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Resultados:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        TerceraC2.setBorder(null);
        TerceraC2.setEnabled(false);
        TerceraC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerceraC2ActionPerformed(evt);
            }
        });
        getContentPane().add(TerceraC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 60, -1));

        TerceraC1.setBorder(null);
        TerceraC1.setEnabled(false);
        TerceraC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerceraC1ActionPerformed(evt);
            }
        });
        getContentPane().add(TerceraC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 70, -1));

        TerceraC3.setBorder(null);
        TerceraC3.setEnabled(false);
        getContentPane().add(TerceraC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 60, -1));

        SegundaC2.setBorder(null);
        SegundaC2.setEnabled(false);
        SegundaC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegundaC2ActionPerformed(evt);
            }
        });
        getContentPane().add(SegundaC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 60, -1));

        C1.setBorder(null);
        C1.setEnabled(false);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 70, -1));

        C3.setBorder(null);
        C3.setEnabled(false);
        getContentPane().add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 60, -1));

        SegundaC1.setBorder(null);
        SegundaC1.setEnabled(false);
        SegundaC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegundaC1ActionPerformed(evt);
            }
        });
        getContentPane().add(SegundaC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 70, -1));

        ValorY.setBorder(null);
        ValorY.setEnabled(false);
        getContentPane().add(ValorY, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 80, -1));

        SegundaC3.setBorder(null);
        SegundaC3.setEnabled(false);
        getContentPane().add(SegundaC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 60, -1));

        ValorX.setBorder(null);
        ValorX.setEnabled(false);
        ValorX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorXActionPerformed(evt);
            }
        });
        getContentPane().add(ValorX, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 60, -1));

        C2.setBorder(null);
        C2.setEnabled(false);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Metodo Grafico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValorXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorXActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void DibujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DibujaActionPerformed
        jButton1.setEnabled(true);
        Graphics2D planoc = (Graphics2D) Panel.getGraphics();  
        // para que las liniesitas se vean de otro color
        
        planoc.setColor(Color.LIGHT_GRAY);
       
        //De aqui hace a delante se dibujan las lineas horizontales como verticales
        
        //Linea Vertical
        planoc.drawLine(250,500,250,0);
               
        //Linea Horizontal 
        planoc.drawLine(0, 250,500, 250);
        
        //De aqui en adelante se hacen los numeros de las lienas horizontales y verticales..-..-:
          
//Aqui se hacen todos los numeros de  la linea horizontal
        //Numeros horizontales desde 250 hasta 500 
         
        int aumenta=258, cont=10;
              int numero=2;
              String numero1="1";
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(numero1,258,262);
          do{
              String cadena= String.valueOf(numero);
              numero++;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(cadena,aumenta+cont,262);
              cont=cont+10;
              //System.out.println("Cont Vale"+cont);
          }while(cont<=230);
          
           
          int al=-2;
          int co=10;
          do{
              String numnegativos =String.valueOf(al);
              al--;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(numnegativos,233,263+co);
              co=co+10;
             // System.out.println("alexis alexis" + co);
          }while(co<=230);
   
          
          
        //Aqui se hacen los numeros desde 250 hacia atras
          int numero2=-2;
          int aumenta2=235;
          int cont2=-10;
          planoc.setFont(new Font("Arial",0,8));
          planoc.drawString("-1",235,262);
          
          do{
              String cadenanumnegativos=String.valueOf(numero2);
              numero2--;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(cadenanumnegativos,aumenta2+cont2,262);
              cont2=cont2-10;
              //System.out.println("aumenta " + aumenta2);
          }while(cont2>=-230); 
    
          //DE AQUI EN ADELANTE SE HACEN LOS NUMEROS DE LA LINEA VERTICAL
          
          //Aqui se hacen los numeros desde 250 hasta cero
          int alexis=225;
          int martin=10;
          planoc.setFont(new Font("Arial",0,8));
          planoc.drawString("1",238,244);
          int nun=2;
          do{
              String cadenavertical =String.valueOf(nun);
              nun++;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(cadenavertical,235,alexis+martin);
              martin=martin-10;
          }while(martin>= -210);
          
//De aqui en adelante se hacen las liniestias de la linea horizontal como la vertical.
        //Liniesitas verticales
        int contador = 0;
        do {
            planoc.drawLine(247, contador, 253, contador);
            contador = contador + 10;
        } while (contador <= 500);

        //Liniesitas Horizontales 
        contador = 10;
        do {
            planoc.drawLine(contador, 247, contador, 253);
            contador = contador + 10;
        } while(contador<=500);
    }//GEN-LAST:event_DibujaActionPerformed

    private void SegundaC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegundaC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SegundaC1ActionPerformed

    private void SegundaC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegundaC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SegundaC2ActionPerformed

    private void TerceraC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerceraC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TerceraC1ActionPerformed

    private void TerceraC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerceraC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TerceraC2ActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
      
        this.setVisible(false);
        MenuProgramacionLineal princi = new MenuProgramacionLineal();
        princi.setVisible(true);
        princi.setResizable(false);
        princi.setLocationRelativeTo(null);
    }//GEN-LAST:event_RegresarActionPerformed

            //estas son las variables del priemr renglon     Estas son las variables de el segudo renglon
    public int  PuntoOptimo1con2 (int c1, int c2, int c3    , int s1 ,int s2, int s3){ 
        double cc1,cc2,cc3;
        double ss1=0,ss2=0,ss3=0;
        double sum1,sum2,sum3;
        double div,multi,multi2,multi3;
        double res;
        double sss1,sss2,sss3;
        
        sss1=ss1;
        sss2=ss2;
        ss3=ss3;
        
        
        //Esto que ago es para cambiar los datos que recibo como parametros que son enteros para combertirlos a doubles.
        cc1=c1*1.0;
        cc2=c2*1.0;
        cc3=c3*1.0;
        
        ss1=s1*1.0;
        ss2=s2*1.0;
        ss3=s3*1.0;
        
        if (ss1>cc1){
                
            
            
                div=ss1/cc1;
                div=div*-1;
                multi=div*cc1;
                multi2=div*cc2;
                multi3=div*cc3;
                
                //ago la suma
                sum1=ss1+multi;
                sum2=ss2+multi2;
                sum3=ss3+multi3;
                //Aqui sale el primer valor ose y
                res=sum3/sum2;
                
                
                
                
                
                System.out.println("sum1 " +sum1);
                System.out.println("sum2 " + sum2);
                System.out.println("sum3 " + sum3 );
                jTextArea1.append("\nsum1 " +sum1 + "\n");
                jTextArea1.append("sum2 " +sum2 + "\n");
                jTextArea1.append("sum3 " +sum3 + "\n");
                
                System.out.println("Resultado: " + res );
                jTextArea1.append("Resultado: " + res );
        }else{
              div=cc1/ss1;
                div=div*-1;
                
                multi=div*ss1;
                multi2=div*ss2;
                multi3=div*ss3;
                
                //ago la suma
                sum1=cc1+multi;
                sum2=cc2+multi2;
                sum3=cc3+multi3;
                
                res=sum3/sum2;
                
                System.out.println("Resultado: "+ res );
                jTextArea1.append("Resultado: " + res );
                
        }
        
//        System.out.println("cc1 " +cc1);
//        System.out.println("cc2 " + cc2);
//        System.out.println("cc3 " + cc3);
//        System.out.println("");
//        System.out.println("ss1 " + ss1);
//        System.out.println("ss2 " + ss2);
//        System.out.println("ss3 " + ss3);

    
        
        return 0;
    }
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Antierror();
        
        ValorX.setText(jSpinner1.getValue().toString());
        ValorY.setText(jSpinner2.getValue().toString());
        
        C1.setText(jSpinner3.getValue().toString());
        C2.setText(jSpinner4.getValue().toString());
        C3.setText(jSpinner5.getValue().toString());
        
        SegundaC1.setText(jSpinner6.getValue().toString());
        SegundaC2.setText(jSpinner7.getValue().toString());
        SegundaC3.setText(jSpinner8.getValue().toString());
        
        TerceraC1.setText(jSpinner9.getValue().toString());
        TerceraC2.setText(jSpinner10.getValue().toString());
        TerceraC3.setText(jSpinner11.getValue().toString());
 
        jTextArea1.setText("");
        
        //Se sacan los primeros valores del primer rengon
        zx1=Integer.parseInt(C1.getText());
        zx2=Integer.parseInt(C2.getText());
        zx3=Integer.parseInt(C3.getText());
        
        sacarx2=zx3/zx2;
        System.out.println("X2 " + sacarx2);
        sacarx1=zx3/zx1;
        System.out.println("X1 " + sacarx1);
        
        System.out.println("Punto1 x1: " +sacarx1);
        System.out.println("Punto2 y2: "+sacarx2);
        //JOptionPane.showMessageDialog(null,"Punto1 x1: " + sacarx1);
        //JOptionPane.showMessageDialog(null,"Punto2 x2: " +sacarx2);
        
        
        //Aqui se sacan los valores del segundo renglon
        r1x1=Integer.parseInt(SegundaC1.getText());
        r1x2=Integer.parseInt(SegundaC2.getText());
        r1x3=Integer.parseInt(SegundaC3.getText());
        
        segundorenglon=r1x3/r1x2;
        System.out.println("Punto 2 x: " +segundorenglon);
        segundorenglon2=r1x3/r1x1;
        //JOptionPane.showMessageDialog(null,"Punto 2 x2: "+segundorenglon2);
        System.out.println("Punto 2 y: "+ segundorenglon2);
        
        
//        //Desde aqui se sacan lo valores del tercer renglon
        r2x1=Integer.parseInt(TerceraC1.getText());
        r2x2=Integer.parseInt(TerceraC2.getText());
        r2x3=Integer.parseInt(TerceraC3.getText());
        
        tercervalor=r2x3/r2x2;
        System.out.println("Punto3 x"+tercervalor);
        //JOptionPane.showMessageDialog(null,"Punto 3 x1: " + tercervalor);
        tercervalor2=r2x3/r2x1;
        System.out.println("Punto 3 y" +tercervalor2);
        //JOptionPane.showMessageDialog(null,"Punto 3 x2: " + tercervalor2);
      
        
        
        if(zx1==0){
            
        }
        
        //Dibuja desde aqui se dibujan las graficas en el plano carteciano
        //Primer linea
        Graphics2D planoc = (Graphics2D) Panel.getGraphics();
        int aumentar=0,aumentar2=0;
        
        aumentar=sacarx1*10;
        aumentar2=sacarx2*10;
        
        planoc.setColor(Color.blue);
        planoc.drawLine(250,250-aumentar2,250+aumentar,250);
        
        //Segunda Linea  
        int multiplica=0,multiplica2=0;
        multiplica=segundorenglon*10;
        multiplica2=segundorenglon2*10;
        //planoc.drawLine(250,250-multiplica2,250+multiplica,250);
        planoc.setColor(Color.yellow);
        planoc.drawLine(250,250-multiplica,250+multiplica2,250);
         
        //Tercera Linea
        int tercerrestriccion=0,tercerrestrccion2=0;
        tercerrestriccion=tercervalor*10;
        tercerrestrccion2=tercervalor2*10;
        //planoc.drawLine(250,250-tercerrestrccion2,250+tercerrestriccion,250);
        planoc.setColor(Color.BLACK);
        planoc.drawLine(250,250-tercerrestriccion,250+tercerrestrccion2,250);
        
        PuntoOptimo1con2(zx1,zx2,zx3,    r1x1,r1x2,r1x3);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed

        
// Panel.removeAll();
        Panel.repaint();
        Dibuja();
    }//GEN-LAST:event_NuevoActionPerformed

    private void DibujaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DibujaMouseClicked
   
    }//GEN-LAST:event_DibujaMouseClicked
    
    private  void Dibuja (){
        
        JOptionPane.showMessageDialog(null,"A continuacion se limpiara el plano cartesiano");
        
        Graphics2D planoc = (Graphics2D) Panel.getGraphics();  
      //planoc.drawLine()
        // para que las liniesitas se vean de otro color
        planoc.setColor(Color.red);
       
        //De aqui hace a delante se dibujan las lineas horizontales como verticales
        
        //Linea Vertical
        planoc.drawLine(250,500,250,0);
               
        //Linea Horizontal 
        planoc.drawLine(0, 250,500, 250);
        
        
        //liea diagonal
        // planoc.drawLine(0,0,500,500);
          
        //De aqui en adelante se hacen los numeros de las lienas horizontales y verticales..-..-:
          
//Aqui se hacen todos los numeros de  la linea horizontal
        //Numeros horizontales desde 250 hasta 500 
         
        int aumenta=258, cont=10;
              int numero=2;
              String numero1="1";
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(numero1,258,262);
          do{
              String cadena= String.valueOf(numero);
              numero++;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(cadena,aumenta+cont,262);
              cont=cont+10;
              //System.out.println("Cont Vale"+cont);
          }while(cont<=230);
          
           
          int al=-2;
          int co=10;
          do{
              String numnegativos =String.valueOf(al);
              al--;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(numnegativos,233,263+co);
              co=co+10;
              System.out.println("alexis alexis" + co);
          }while(co<=230);
   
          
          
        //Aqui se hacen los numeros desde 250 hacia atras
          int numero2=-2;
          int aumenta2=235;
          int cont2=-10;
          planoc.setFont(new Font("Arial",0,8));
          planoc.drawString("-1",235,262);
          
          do{
              String cadenanumnegativos=String.valueOf(numero2);
              numero2--;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(cadenanumnegativos,aumenta2+cont2,262);
              cont2=cont2-10;
              //System.out.println("aumenta " + aumenta2);
          }while(cont2>=-230); 
     
          //DE AQUI EN ADELANTE SE HACEN LOS NUMEROS DE LA LINEA VERTICAL
          String cadenanum;
          int alexis=225;
          int martin=10;
          planoc.setFont(new Font("Arial",0,8));
          planoc.drawString("1",238,244);
          int nun=2;
          do{
              String cadenavertical =String.valueOf(nun);
              nun++;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(cadenavertical,235,alexis+martin);
              martin=martin-10;
          }while(martin>= -210);
         
//De aqui en adelante se hacen las liniestias de la linea horizontal como la vertical.
        //Liniesitas verticales
        int contador = 0;
        do {
            planoc.drawLine(247, contador, 253, contador);
            contador = contador + 10;
        } while (contador <= 500);

        //Liniesitas Horizontales 
        contador = 10;
        do {
            planoc.drawLine(contador, 247, contador, 253);
            contador = contador + 10;
        } while(contador<=500);
       
    }
    
    public  void  Antierror () {
        zx1=Integer.parseInt(C1.getText());
        zx2=Integer.parseInt(C2.getText());
        zx3=Integer.parseInt(C3.getText());
        
        //Aqui se sacan los valores del segundo renglon
        r1x1=Integer.parseInt(SegundaC1.getText());
        r1x2=Integer.parseInt(SegundaC2.getText());
        r1x3=Integer.parseInt(SegundaC3.getText());
        
        //Desde aqui se sacan lo valores del tercer renglon
        r2x1=Integer.parseInt(TerceraC1.getText());
        r2x2=Integer.parseInt(TerceraC2.getText());
        r2x3=Integer.parseInt(TerceraC3.getText());
        
        if(zx1==0 && zx2==0 && zx3==0 && r1x1==0 && r1x2==0 && r1x3==0 && r2x1==0 && r2x2==0 && r2x3==0){
            JOptionPane.showMessageDialog(null,"Upsi no has introducido ningun valor");
        }
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField C1;
    private javax.swing.JTextField C2;
    private javax.swing.JTextField C3;
    private javax.swing.JButton Dibuja;
    private javax.swing.JButton Nuevo;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField SegundaC1;
    private javax.swing.JTextField SegundaC2;
    private javax.swing.JTextField SegundaC3;
    private javax.swing.JTextField TerceraC1;
    private javax.swing.JTextField TerceraC2;
    private javax.swing.JTextField TerceraC3;
    private javax.swing.JTextField ValorX;
    private javax.swing.JTextField ValorY;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}

