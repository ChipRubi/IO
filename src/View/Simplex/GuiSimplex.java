/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Simplex;

import Auxiliares.Constantes;
import Metodos.Simplex.AproximarNumero;
import Metodos.Simplex.ColorFilas;
import Metodos.Simplex.ColorFilasFunciones;
import Metodos.Simplex.CrearTablasSimplex;
import Metodos.Simplex.GetX;
import Metodos.Simplex.Guardar;
import Metodos.Simplex.Simplex;
import static Metodos.Simplex.Simplex.filalaMenor;
import static Metodos.Simplex.Simplex.todosMenor;
import Metodos.Simplex.EscribirLeer;
import View.MenuProgramacionLineal;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

/**
 *
 * @author Mipc
 */
public class GuiSimplex extends javax.swing.JFrame {
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arcivos sipx ", "sipx");
    private DefaultTableModel modeloRestricciones = null;
    private DefaultTableModel modeloSolucion = null;
    
    private int Xn = 0, Nrestricciones;
    private boolean limpiar = true, guardar = true;
    private EscribirLeer archivo = new EscribirLeer(); 

    public GuiSimplex() {
        initComponents();
        Tablon.setDefaultRenderer(Object.class, new ColorFilas());
        jtRestricciones.setDefaultRenderer(Object.class, new ColorFilasFunciones());
        jFileChooser2.setFileFilter(filtro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaCoeficientes = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRestricciones = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        info2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jcbObjetivo = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jspRest = new javax.swing.JSpinner();
        jspvariables = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        info = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tablon = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaEcuaciones = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaOperaciones = new javax.swing.JTextArea();
        jlPivote = new javax.swing.JLabel();
        jlfila = new javax.swing.JLabel();
        jlcolunna = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        ventanaCoeficientes.setMinimumSize(new java.awt.Dimension(610, 610));
        ventanaCoeficientes.setResizable(false);
        ventanaCoeficientes.setSize(new java.awt.Dimension(610, 610));
        ventanaCoeficientes.getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtRestricciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jtRestricciones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtRestricciones.setComponentPopupMenu(jPopupMenu2);
        jtRestricciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtRestriccionesFocusGained(evt);
            }
        });
        jtRestricciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtRestriccionesMousePressed(evt);
            }
        });
        jtRestricciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtRestriccionesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtRestricciones);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(16, 30, 558, 350);

        jButton2.setText("Continuar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(390, 410, 177, 23);

        jCheckBox1.setText("Rellenar con 0");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBox1MousePressed(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1);
        jCheckBox1.setBounds(16, 398, 89, 31);
        jPanel3.add(info2);
        info2.setBounds(300, 402, 0, 22);

        ventanaCoeficientes.getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 120, 590, 450);

        jPanel8.setLayout(null);

        jPanel1.setLayout(null);

        jcbObjetivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maximizar", "Minimizar" }));
        jPanel1.add(jcbObjetivo);
        jcbObjetivo.setBounds(0, 34, 120, 22);

        jPanel8.add(jPanel1);
        jPanel1.setBounds(20, 10, 120, 80);

        jPanel5.setLayout(null);

        jspRest.setModel(new javax.swing.SpinnerNumberModel(2, 1, 400, 1));
        jspRest.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jspRestStateChanged(evt);
            }
        });
        jPanel5.add(jspRest);
        jspRest.setBounds(140, 50, 100, 22);

        jspvariables.setModel(new javax.swing.SpinnerNumberModel(2, 2, 350, 1));
        jPanel5.add(jspvariables);
        jspvariables.setBounds(140, 10, 100, 22);

        jButton3.setText("Generar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(270, 30, 71, 30);

        jLabel4.setText("Restricciones");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(30, 47, 110, 30);

        jLabel6.setText("Variables ");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(30, 10, 130, 30);

        jPanel8.add(jPanel5);
        jPanel5.setBounds(140, 10, 360, 88);

        ventanaCoeficientes.getContentPane().add(jPanel8);
        jPanel8.setBounds(10, 10, 590, 100);

        jDialog1.setTitle("Abrir");
        jDialog1.setMinimumSize(new java.awt.Dimension(643, 419));
        jDialog1.getContentPane().setLayout(new javax.swing.BoxLayout(jDialog1.getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jFileChooser2.setFileFilter(null);
        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jFileChooser2);

        jDialog1.getAccessibleContext().setAccessibleParent(null);

        jMenuItem5.setText("Eliminar Fila");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem5);

        info.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        Tablon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tablon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(Tablon);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 610, 330);

        jLabel3.setText("Ingeniería de sistemas CECAR 2015   ---- Fredys Vergara");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 570, 310, 20);

        jTabbedPane1.addTab("Solución", jPanel2);

        jPanel6.setLayout(null);

        jScrollPane5.setBorder(null);

        jtaEcuaciones.setEditable(false);
        jtaEcuaciones.setColumns(20);
        jtaEcuaciones.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jtaEcuaciones.setRows(5);
        jtaEcuaciones.setBorder(null);
        jtaEcuaciones.setOpaque(false);
        jScrollPane5.setViewportView(jtaEcuaciones);

        jPanel6.add(jScrollPane5);
        jScrollPane5.setBounds(0, 0, 600, 290);

        jTabbedPane1.addTab("Ecuaciones", jPanel6);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 40, 620, 360);
        //----------------------------------------------
        //JDialog d = new javax.swing.JDialog();;
        //d.setMinimumSize(new java.awt.Dimension(643, 419));
        //d.setVisible(true);
        //------------------------------------------

        jButton1.setText("Ingresar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 480, 140, 20);

        jButton5.setText("Resolver Directo");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(30, 540, 140, 20);

        jButton4.setText("Resolver en Partes");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 510, 140, 20);

        jScrollPane2.setBorder(null);

        jtaOperaciones.setEditable(false);
        jtaOperaciones.setColumns(20);
        jtaOperaciones.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jtaOperaciones.setRows(5);
        jScrollPane2.setViewportView(jtaOperaciones);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(200, 440, 230, 160);

        jlPivote.setText("Pivote");
        getContentPane().add(jlPivote);
        jlPivote.setBounds(450, 450, 180, 20);

        jlfila.setText("Fila");
        getContentPane().add(jlfila);
        jlfila.setBounds(450, 490, 130, 20);

        jlcolunna.setText("Columna");
        getContentPane().add(jlcolunna);
        jlcolunna.setBounds(450, 530, 150, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Resultados: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 410, 100, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Simplex");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 620, 17);

        jButton6.setText("Resgresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(30, 610, 100, 23);

        setSize(new java.awt.Dimension(663, 706));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ventanaCoeficientes.setBounds(this.getX() + 100, this.getY() + 5, ventanaCoeficientes.getWidth(), ventanaCoeficientes.getHeight());
        ventanaCoeficientes.setVisible(true);        
        if (limpiar)crearTablaRestricciones();        
        limpiar = false;
        jButton4.setEnabled(false);
        Nrestricciones = modeloRestricciones.getRowCount()-1;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        crearTablaRestricciones();
        jCheckBox1ActionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!validar()) {            
            CrearTablasSimplex.TablaSolucion(Xn, Nrestricciones, modeloRestricciones, Tablon);
            modeloSolucion = (DefaultTableModel) Tablon.getModel();
            Simplex.calcularZj(modeloSolucion);
            Simplex.calcularCj_Zj(modeloSolucion);
            if (jcbObjetivo.getSelectedIndex() == 0) {
                Simplex.mayorFilaCj_Zj(modeloSolucion);
             
            } else {
                
                Simplex.menorFilaCj_Zj(modeloSolucion);
            }
            Simplex.CalcularXn_Mayor(modeloSolucion);
            Simplex.Menor(modeloSolucion);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            ventanaCoeficientes.setVisible(false);
            Simplex.ntablones = 1;
            jtaOperaciones.setText(null);
            jlfila.setText("Fila: " + (Simplex.filalaMenor - 1));
            jlcolunna.setText("Columna: " + (Simplex.columnaMayor));
            jlPivote.setText("Pivote: " + Simplex.pivote);
            jlPivote.setText("Pivote: " + AproximarNumero.valorAprocimado(String.valueOf(modeloSolucion.getValueAt(filalaMenor,Simplex.columnaMayor))));
            Ecuaciones();
        }
        info2.setText("");
//        info.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        info.setText(null);
        info.setBackground(new Color(240, 240, 240));
        if (!todosMenor) {
            if (filalaMenor <= 0) {
                info.setText("El Sistema no tiene solucion");
                JOptionPane.showMessageDialog(
                        this, 
                        "El sistema no tiene solucion", 
                        Constantes.UNIDAD2_TITLE_MSG, 
                        JOptionPane.INFORMATION_MESSAGE
                );
                info.setBackground(new Color(255, 35, 35));
            } else {
                Simplex.Convertir0Pivote(modeloSolucion);
                Simplex.Gauss(modeloSolucion);
                Simplex.calcularZj(modeloSolucion);
                Simplex.calcularCj_Zj(modeloSolucion);
                 if (jcbObjetivo.getSelectedItem().toString().equalsIgnoreCase("Maximizar")) {
                  Simplex.mayorFilaCj_Zj(modeloSolucion);
                 } else if (jcbObjetivo.getSelectedItem().toString().equalsIgnoreCase("Minimizar")) {
                    Simplex.menorFilaCj_Zj(modeloSolucion);
                }
                Simplex.CalcularXn_Mayor(modeloSolucion);
                Simplex.Menor(modeloSolucion);
            }
        }
        if (todosMenor) {
            jButton4.setEnabled(false);
            info.setBackground(Color.GREEN);
            info.setText("Fin de proceso");
            GetX.mostar(modeloSolucion, Xn);
            limpiarUltimaCelda();
            
        }
        jlfila.setText("Fila: " + (Simplex.filalaMenor - 1));
        jlcolunna.setText("Columna: " + (Simplex.columnaMayor));
        jlPivote.setText("Pivote: " + AproximarNumero.valorAprocimado(String.valueOf(modeloSolucion.getValueAt(filalaMenor,Simplex.columnaMayor))));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jspRestStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jspRestStateChanged
        int fi = Integer.parseInt(jspRest.getValue().toString());
        String g[] = new String[Xn];
        if (fi > Nrestricciones) {
            for (int i = Nrestricciones + 1; i <= fi; i++) {
                g[0] = "S" + i;
                modeloRestricciones.addRow(g);
                modeloRestricciones.setValueAt("<=", i, modeloRestricciones.getColumnCount() - 2);
            }
            Nrestricciones = fi;
        } else if (fi < Nrestricciones) {
            while (Nrestricciones != fi) {
                modeloRestricciones.removeRow(Nrestricciones);
                Nrestricciones--;
            }
        }
        jCheckBox1ActionPerformed(null);
    }//GEN-LAST:event_jspRestStateChanged

    private void jtRestriccionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRestriccionesKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '-' && c != 'E' && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_jtRestriccionesKeyTyped

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed
        String ruta;
        JFileChooser seChooser = (JFileChooser) evt.getSource();
        String comando = evt.getActionCommand();
        if (comando.equals(JFileChooser.APPROVE_SELECTION)) {
            File archivoSelecciondo = seChooser.getSelectedFile();
            ruta = archivoSelecciondo.getAbsolutePath();
            if (!guardar) {
                abrirArchivo(ruta,archivoSelecciondo.getName());
            } else {
                guardarArchivo(ruta, archivoSelecciondo.getName());                
            }
        }
        else jDialog1.dispose();
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      
        if (jCheckBox1.isSelected()) {
            for (int f = 0; f < modeloRestricciones.getRowCount(); f++) {
                for (int c = 1; c < modeloRestricciones.getColumnCount(); c++) {
                    if (c != modeloRestricciones.getColumnCount() - 2) {
                        if (String.valueOf(modeloRestricciones.getValueAt(f, c)).equalsIgnoreCase("") || String.valueOf(modeloRestricciones.getValueAt(f, c)).equalsIgnoreCase("null")) {
                            modeloRestricciones.setValueAt("0", f, c);
                        }
                    }
                }
            }
            modeloRestricciones.setValueAt("", 0, modeloRestricciones.getColumnCount() - 1 );
        } else {
            for (int f = 0; f < modeloRestricciones.getRowCount(); f++) {
                for (int c = 1; c < modeloRestricciones.getColumnCount(); c++) {
                    if (c != modeloRestricciones.getColumnCount() - 2) {
                        if (String.valueOf(modeloRestricciones.getValueAt(f, c)).equalsIgnoreCase("0") || !isNumeric(String.valueOf(modeloRestricciones.getValueAt(f, c)))) {
                            modeloRestricciones.setValueAt("", f, c);
                        }
                    }
                }
            }
        }
        info2.setText(null);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       while(!todosMenor && filalaMenor>0){
           jButton4ActionPerformed(evt);
       }
       jButton5.setEnabled(false);
       limpiarUltimaCelda();
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
       info2.setText(" Procesando…");
    }//GEN-LAST:event_jButton2MousePressed

    private void jCheckBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MousePressed
      info2.setText(" Procesando…"); // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MousePressed

    private void jtRestriccionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtRestriccionesFocusGained
      
    }//GEN-LAST:event_jtRestriccionesFocusGained

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      int fil = jtRestricciones.getSelectedRow();
      if(fil>0){
          modeloRestricciones.removeRow(fil);
           Nrestricciones--;
          for (int i = 1; i <modeloRestricciones.getRowCount(); i++) {
              modeloRestricciones.setValueAt("Rest. "+i, i, 0);             
              jspRest.setValue(Nrestricciones);
          }
      }
      
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jtRestriccionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRestriccionesMousePressed
       int fil = jtRestricciones.getSelectedRow(); 
       if(fil>0 && modeloRestricciones.getRowCount()>2)jMenuItem5.setEnabled(true);
       else jMenuItem5.setEnabled(false);
    }//GEN-LAST:event_jtRestriccionesMousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        MenuProgramacionLineal menuProgramacionLineal = new MenuProgramacionLineal();
        menuProgramacionLineal.show();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed
    private void crearTablaRestricciones() {
        Xn = Integer.parseInt(String.valueOf(jspvariables.getValue()));
        Nrestricciones = Integer.parseInt(String.valueOf(jspRest.getValue()));
        Object cabeza[] = new String[Xn + 3];
        cabeza[0] = (" ");
        for (int i = 1; i <= Xn; i++) {
            cabeza[i] = ("X" + i);
        }
        cabeza[Xn + 1] = (" ");
        cabeza[Xn + 2] = (" ");

        modeloRestricciones = new DefaultTableModel(cabeza, 0) {
            public boolean isCellEditable(int row, int column) {
                if (column == 0) {
                    return false;
                }
                if (row == 0 && column >= modeloRestricciones.getColumnCount() - 2) {
                    return false;
                }
                return true;
            }
        };
        jtRestricciones.setModel(modeloRestricciones);
        String fila[] = new String[Xn + 3];
        for (int i = 0; i < Nrestricciones + 1; i++) {
            if (i == 0) {
                fila[0] = new String("Z");
            } else {
                fila[0] = new String("S" + (i));
                fila[modeloRestricciones.getColumnCount() - 2] = "<=";
            }
            modeloRestricciones.addRow(fila);
        }
        agregarComboBox(modeloRestricciones.getColumnCount(), jtRestricciones);
    }

    private void Ecuaciones() {
        jtaEcuaciones.setText(null);
        int fila = modeloRestricciones.getRowCount();
        int col = modeloRestricciones.getColumnCount();
        jtaEcuaciones.append(" Z = ");
        for (int c = 1; c <col-2; c++) {
            if (Double.parseDouble(String.valueOf(modeloRestricciones.getValueAt(0, c))) >= 0) {
                 jtaEcuaciones.append(" +" + " " + modeloRestricciones.getValueAt(0, c) + "X" + c);
            } else {
                 jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(0, c) + " X" + c);
            }
        }
        jtaEcuaciones.append(" \n\n");
        for (int fil = 1; fil < fila; fil++) {
            jtaEcuaciones.append(" ");
            for (int co = 1; co < col; co++) {
                if (co == 1) {
                    jtaEcuaciones.append("" + modeloRestricciones.getValueAt(fil, co) + "X" + co);
                } else if (co == col - 2) {
                    jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(fil, co));
                } else {
                    if (co >= col - 2) {
                        jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(fil, co));
                    } else {
                        if (Double.parseDouble(String.valueOf(modeloRestricciones.getValueAt(fil, co))) >= 0) {
                            jtaEcuaciones.append(" +" + " " + modeloRestricciones.getValueAt(fil, co) + "X" + co);
                        } else {
                            jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(fil, co) + " X" + co);
                        }
                    }
                }
            }
            jtaEcuaciones.append("\n");
        }
    }

    private void agregarComboBox(int co, JTable jtRestricciones) {
        String[] Condicion = {"<=", ">=", "=",">","<"};
        JComboBox jcb = new JComboBox(Condicion);
        TableColumn tc = jtRestricciones.getColumnModel().getColumn(co - 2);
        TableCellEditor tce = new DefaultCellEditor(jcb);
        
        tc.setCellEditor(tce);
        jtRestricciones.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtRestricciones.getColumnModel().getColumn(co - 1).setPreferredWidth(80);
        jtRestricciones.getColumnModel().getColumn(co - 2).setPreferredWidth(30);
        for (int i = 1; i <= co - 2; i++) {
            jtRestricciones.getColumnModel().getColumn(0).setPreferredWidth(80);
        }
        jtRestricciones.setRowHeight(25);
    }

    public void guardarArchivo(String ruta, String nom) {
        int op = 0;
        if (!ruta.substring(ruta.length() - 5, ruta.length()).equalsIgnoreCase(".sipx")) {
            ruta = ruta + ".sipx";
        }
        File f = new File(ruta);
        if (f.exists()) {
            op = JOptionPane.showConfirmDialog(this, nom + " Ya existe \n¿Desea reemplazarlo?","Guardar",JOptionPane.WARNING_MESSAGE);
        }
        if (op == 0) {
            Guardar g = new Guardar(modeloRestricciones, jcbObjetivo.getSelectedItem().toString());
            archivo.escribirFichero(ruta, g);
            this.setTitle(nom+" - Simplex");
            jDialog1.dispose();
        }

    }

    public void abrirArchivo(String ruta,String nombre) {
        File f = new File(ruta);
        ArrayList<Guardar> guardar;
        if (f.exists()) {
            try {
                jDialog1.dispose();
                guardar = archivo.leeFichero(ruta);
                guardar.get(0).armarTabla(jtRestricciones);
                jcbObjetivo.setSelectedItem(guardar.get(0).getObjetivo());
                modeloRestricciones = guardar.get(0).getModeloRestricciones();
                agregarComboBox(modeloRestricciones.getColumnCount(), jtRestricciones);
                ventanaCoeficientes.setBounds(this.getX() + 100, this.getY() + 5, ventanaCoeficientes.getWidth(), ventanaCoeficientes.getHeight());
                ventanaCoeficientes.setVisible(true);
                Xn = modeloRestricciones.getColumnCount() - 3;
                jspvariables.setValue(Xn);
                Nrestricciones = modeloRestricciones.getRowCount() - 1;
                jspRest.setValue(Nrestricciones);
                this.setTitle(nombre+" - Simplex");
                jCheckBox1.setSelected(true);
                jCheckBox1ActionPerformed(null);
                limpiar= false;
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(this, nombre+"\nError al leer  archivo ","Error!",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encuentra el Archivo\nCompruebe el nombre de archivo e intente de nuevo","Abrir",JOptionPane.WARNING_MESSAGE);
        }
    }
    private boolean validar() {
        String texto;
        int fila = modeloRestricciones.getRowCount();
        int colum = modeloRestricciones.getColumnCount();
        for (int i = 0; i < fila; i++) {
            for (int j = 1; j < colum; j++) {
                if (i == 0 && j >= colum - 2) 
                    break;                
                else if (j != colum - 2) {
                    texto = String.valueOf(modeloRestricciones.getValueAt(i, j));
                    if (!texto.matches("([+-]{1})?[0-9]+(\\.[0-9]+)?([Ee]{1}([-]{1})?[1-9])?")) {
                        JOptionPane.showMessageDialog(
                                this, 
                                "Datos Incorrectos",
                                Constantes.UNIDAD2_TITTLE_ERROR_MSG,
                                JOptionPane.ERROR_MESSAGE
                        );
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public Component prepareEditor (TableCellEditor editor , int row, int columna){
        return null;
        
    }
    public void limpiarUltimaCelda(){
        for (int i = 0; i < Tablon.getRowCount(); i++) {
            Tablon.setValueAt("", i, Tablon.getColumnCount()-1);
        }
    }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiSimplex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablon;
    public static javax.swing.JLabel info;
    private javax.swing.JLabel info2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox jcbObjetivo;
    private javax.swing.JLabel jlPivote;
    private javax.swing.JLabel jlcolunna;
    private javax.swing.JLabel jlfila;
    private javax.swing.JSpinner jspRest;
    private javax.swing.JSpinner jspvariables;
    private javax.swing.JTable jtRestricciones;
    private javax.swing.JTextArea jtaEcuaciones;
    public static javax.swing.JTextArea jtaOperaciones;
    private javax.swing.JFrame ventanaCoeficientes;
    // End of variables declaration//GEN-END:variables

    private static boolean isNumeric(String cadena){
	try {
            Double.parseDouble(cadena);
            return true;
	} catch (NumberFormatException nfe){
            return false;
	}
}
}
