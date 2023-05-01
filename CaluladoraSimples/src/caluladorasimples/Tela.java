/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package caluladorasimples;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.util.Stack;
import javax.swing.ImageIcon;

/**
 *
 * @author ellencrist
 */
public class Tela extends javax.swing.JFrame {

    private String cadeiaNumeros = "";
    private String operacao = "nula";
    private double primeiroNumero, resultado;
    private boolean ativado = true;
    private boolean ponto = true;

    
    public Tela() {
        initComponents();
        setIcon();
        this.setTitle("Calculator");
        this.setLocationRelativeTo(null);
    }
    
    double valor1, valor2;
    String sinal;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        botao9 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        Btndeleteall = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btnsoma = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btnraiz = new javax.swing.JButton();
        Btnvirgula = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnMaisMenos = new javax.swing.JButton();
        display = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btndiv = new javax.swing.JButton();
        btnapagar = new javax.swing.JButton();
        displayamostra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bonecojava = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botao9.setBackground(new java.awt.Color(51, 51, 51));
        botao9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao9.setForeground(new java.awt.Color(255, 255, 255));
        botao9.setText("9");
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });
        getContentPane().add(botao9);
        botao9.setBounds(140, 230, 60, 30);

        botao2.setBackground(new java.awt.Color(51, 51, 51));
        botao2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao2.setForeground(new java.awt.Color(255, 255, 255));
        botao2.setText("2");
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });
        getContentPane().add(botao2);
        botao2.setBounds(80, 290, 60, 30);

        botao1.setBackground(new java.awt.Color(51, 51, 51));
        botao1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao1.setForeground(new java.awt.Color(255, 255, 255));
        botao1.setText("1");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao1);
        botao1.setBounds(20, 290, 60, 30);

        botao4.setBackground(new java.awt.Color(51, 51, 51));
        botao4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao4.setForeground(new java.awt.Color(255, 255, 255));
        botao4.setText("4");
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });
        getContentPane().add(botao4);
        botao4.setBounds(20, 260, 60, 30);

        botao7.setBackground(new java.awt.Color(51, 51, 51));
        botao7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao7.setForeground(new java.awt.Color(255, 255, 255));
        botao7.setText("7");
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });
        getContentPane().add(botao7);
        botao7.setBounds(20, 230, 60, 30);

        botao8.setBackground(new java.awt.Color(51, 51, 51));
        botao8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao8.setForeground(new java.awt.Color(255, 255, 255));
        botao8.setText("8");
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });
        getContentPane().add(botao8);
        botao8.setBounds(80, 230, 60, 30);

        botao5.setBackground(new java.awt.Color(51, 51, 51));
        botao5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao5.setForeground(new java.awt.Color(255, 255, 255));
        botao5.setText("5");
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });
        getContentPane().add(botao5);
        botao5.setBounds(80, 260, 60, 30);

        botao6.setBackground(new java.awt.Color(51, 51, 51));
        botao6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao6.setForeground(new java.awt.Color(255, 255, 255));
        botao6.setText("6");
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });
        getContentPane().add(botao6);
        botao6.setBounds(140, 260, 60, 30);

        botao3.setBackground(new java.awt.Color(51, 51, 51));
        botao3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao3.setForeground(new java.awt.Color(255, 255, 255));
        botao3.setText("3");
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });
        getContentPane().add(botao3);
        botao3.setBounds(140, 290, 60, 30);

        btnmulti.setBackground(new java.awt.Color(51, 51, 51));
        btnmulti.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnmulti.setForeground(new java.awt.Color(255, 255, 255));
        btnmulti.setText("×");
        btnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiActionPerformed(evt);
            }
        });
        getContentPane().add(btnmulti);
        btnmulti.setBounds(210, 240, 60, 30);

        Btndeleteall.setBackground(new java.awt.Color(51, 51, 51));
        Btndeleteall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btndeleteall.setForeground(new java.awt.Color(255, 255, 255));
        Btndeleteall.setText("C");
        Btndeleteall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtndeleteallActionPerformed(evt);
            }
        });
        getContentPane().add(Btndeleteall);
        Btndeleteall.setBounds(80, 200, 60, 30);

        btnsub.setBackground(new java.awt.Color(51, 51, 51));
        btnsub.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsub.setForeground(new java.awt.Color(255, 255, 255));
        btnsub.setText("-");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });
        getContentPane().add(btnsub);
        btnsub.setBounds(210, 280, 60, 30);

        btnsoma.setBackground(new java.awt.Color(51, 51, 51));
        btnsoma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsoma.setForeground(new java.awt.Color(255, 255, 255));
        btnsoma.setText("+");
        btnsoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsomaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsoma);
        btnsoma.setBounds(210, 320, 60, 30);

        btnigual.setBackground(new java.awt.Color(0, 0, 102));
        btnigual.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnigual.setForeground(new java.awt.Color(255, 255, 255));
        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });
        getContentPane().add(btnigual);
        btnigual.setBounds(20, 360, 180, 30);

        btnraiz.setBackground(new java.awt.Color(51, 51, 51));
        btnraiz.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnraiz.setForeground(new java.awt.Color(255, 255, 255));
        btnraiz.setText("√");
        btnraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizActionPerformed(evt);
            }
        });
        getContentPane().add(btnraiz);
        btnraiz.setBounds(140, 320, 60, 30);

        Btnvirgula.setBackground(new java.awt.Color(51, 51, 51));
        Btnvirgula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btnvirgula.setForeground(new java.awt.Color(255, 255, 255));
        Btnvirgula.setText(",");
        Btnvirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnvirgulaActionPerformed(evt);
            }
        });
        getContentPane().add(Btnvirgula);
        Btnvirgula.setBounds(20, 200, 60, 30);

        btn0.setBackground(new java.awt.Color(51, 51, 51));
        btn0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(20, 320, 60, 30);

        btnMaisMenos.setBackground(new java.awt.Color(51, 51, 51));
        btnMaisMenos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMaisMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMaisMenos.setText("±");
        btnMaisMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisMenosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMaisMenos);
        btnMaisMenos.setBounds(80, 320, 60, 30);

        display.setBackground(new java.awt.Color(51, 51, 51));
        display.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        display.setToolTipText("");
        display.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51)));
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(display);
        display.setBounds(10, 60, 310, 90);
        display.getAccessibleContext().setAccessibleDescription("display onde os números digitados aparecem");

        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 180, 310, 10);

        btndiv.setBackground(new java.awt.Color(51, 51, 51));
        btndiv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndiv.setForeground(new java.awt.Color(255, 255, 255));
        btndiv.setText("÷");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });
        getContentPane().add(btndiv);
        btndiv.setBounds(210, 200, 60, 30);

        btnapagar.setBackground(new java.awt.Color(53, 53, 53));
        btnapagar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnapagar.setForeground(new java.awt.Color(255, 255, 255));
        btnapagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caluladorasimples/img/teste8.png"))); // NOI18N
        btnapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnapagar);
        btnapagar.setBounds(140, 200, 60, 30);

        displayamostra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        displayamostra.setForeground(new java.awt.Color(255, 255, 255));
        displayamostra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(displayamostra);
        displayamostra.setBounds(10, 10, 310, 30);

        jLabel1.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("@ellencrist");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 440, 60, 16);

        bonecojava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caluladorasimples/img/n_nnn_n-removebg-preview.png"))); // NOI18N
        bonecojava.setText("jLabel2");
        getContentPane().add(bonecojava);
        bonecojava.setBounds(250, 350, 80, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caluladorasimples/img/fundo-display.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 60, 310, 90);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caluladorasimples/img/R.png"))); // NOI18N
        fundo.setMaximumSize(new java.awt.Dimension(960, 480));
        fundo.setMinimumSize(new java.awt.Dimension(960, 480));
        fundo.setPreferredSize(new java.awt.Dimension(700, 487));
        getContentPane().add(fundo);
        fundo.setBounds(-590, -470, 920, 1010);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
      if(display.getText().equals("0")){
        cadeiaNumeros = "9";
      }else{
          cadeiaNumeros += "9";
      }
      display.setText(cadeiaNumeros);
      ativado = true;//vou usar a calculadora
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
       if(display.getText().equals("0")){
        cadeiaNumeros = "6";
      }else{
          cadeiaNumeros += "6";
      }
      display.setText(cadeiaNumeros);
      ativado = true;//vou usar a calculadora
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        //display.setText(display.getText()+"8");
        
      if(display.getText().equals("0")){
        cadeiaNumeros = "8";
      }else{
          cadeiaNumeros += "8";
      }
      display.setText(cadeiaNumeros);
      ativado = true;//vou usar a calculadora  
    }//GEN-LAST:event_botao8ActionPerformed

    private void BtnvirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnvirgulaActionPerformed
        
        if(ponto == true){
            if (cadeiaNumeros.equals("")) {
                cadeiaNumeros = "0.";
            }else{
                cadeiaNumeros += ".";
            }
         display.setText(cadeiaNumeros);
         ponto = false; 
        }
    }//GEN-LAST:event_BtnvirgulaActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
      if(display.getText().equals("0")){
        cadeiaNumeros = "1";
      }else{
          cadeiaNumeros += "1";
      }
      display.setText(cadeiaNumeros);
      ativado = true;//vou usar a calculadora
    }//GEN-LAST:event_botao1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
      if(display.getText().equals("0")){
        cadeiaNumeros = "0";
      }else{
          cadeiaNumeros += "0";
      }
      display.setText(cadeiaNumeros);
      ativado = true;//vou usar a calculadora
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
         if(ativado == true){
         primeiroNumero = Double.parseDouble(cadeiaNumeros);
         displayamostra.setText(cadeiaNumeros + " * ");
         cadeiaNumeros = "";
         operacao = "multiplicar";
         
         ativado = false;
        }
    }//GEN-LAST:event_btnmultiActionPerformed

    private void btnMaisMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisMenosActionPerformed
        if(cadeiaNumeros.charAt(0) != '-'){//-0
            cadeiaNumeros = "-" + cadeiaNumeros;
        }else{
            cadeiaNumeros = cadeiaNumeros.substring(1,cadeiaNumeros.length());
        }
        display.setText(cadeiaNumeros);
    }//GEN-LAST:event_btnMaisMenosActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
     if(display.getText().equals("0")){
        cadeiaNumeros = "2";
      }else{
          cadeiaNumeros += "2";
      }
      display.setText(cadeiaNumeros);
      ativado = true;//vou usar a calculadora
      
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
      if(display.getText().equals("0")){
        cadeiaNumeros = "3";
      }else{
          cadeiaNumeros += "3";
      }
      display.setText(cadeiaNumeros);
      ativado = true;//vou usar a calculadora
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
if(display.getText().equals("0")){
        cadeiaNumeros = "4";
      }else{
          cadeiaNumeros += "4";
      }
      display.setText(cadeiaNumeros);
      ativado = true;//vou usar a calculadora
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
      if(display.getText().equals("0")){
        cadeiaNumeros = "5";
      }else{
          cadeiaNumeros += "5";
      }
      display.setText(cadeiaNumeros);
      ativado = true;//vou usar a calculadora
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
       //display.setText(display.getText()+"7");
      if(display.getText().equals("0")){
        cadeiaNumeros = "7";
      }else{
          cadeiaNumeros += "7";
      }
      display.setText(cadeiaNumeros);
      ativado = true;//vou usar a calculadora
    }//GEN-LAST:event_botao7ActionPerformed

    private void btnraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizActionPerformed
  
        primeiroNumero = Double.parseDouble(cadeiaNumeros);
        displayamostra.setText("sqrt("+cadeiaNumeros+")");
        resultado = Math.sqrt(primeiroNumero);
        display.setText(String.format("%.2f", resultado));
        cadeiaNumeros = String.valueOf(resultado);//convertemos valor
    }//GEN-LAST:event_btnraizActionPerformed

    private void BtndeleteallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtndeleteallActionPerformed
        //apaga toda a cadeia de números
        displayamostra.setText("");
        display.setText("0");
        operacao = "nula";
        cadeiaNumeros = "";
        ativado = true;
        ponto = true;
    }//GEN-LAST:event_BtndeleteallActionPerformed

    private void btnsomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsomaActionPerformed

        if(ativado == true){
         primeiroNumero = Double.parseDouble(cadeiaNumeros);
         displayamostra.setText(cadeiaNumeros + " + ");
         cadeiaNumeros = "";
         operacao = "somar";
         
         ativado = false;
        }
    }//GEN-LAST:event_btnsomaActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
           double segundoNumero;
           
           if(operacao.equals("nula")){
               display.setText(cadeiaNumeros);
           }
           
           else if(operacao.equals("somar")){
               segundoNumero = Double.parseDouble(cadeiaNumeros);
               resultado = primeiroNumero + segundoNumero;
               display.setText(String.format("%.2f",resultado));
               cadeiaNumeros = String.valueOf(resultado);
               operacao = "nula";
           }
           
           else if(operacao.equals("subtrair")){
               segundoNumero = Double.parseDouble(cadeiaNumeros);
               resultado = primeiroNumero - segundoNumero;
               display.setText(String.format("%.2f",resultado));
               cadeiaNumeros = String.valueOf(resultado);
               operacao = "nula";
           }
           
           else if(operacao.equals("multiplicar")){
               segundoNumero = Double.parseDouble(cadeiaNumeros);
               resultado = primeiroNumero * segundoNumero;
               display.setText(String.format("%.2f",resultado));
               cadeiaNumeros = String.valueOf(resultado);
               operacao = "nula";
           }
           
         else if (operacao.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadeiaNumeros);
            if (segundoNumero == 0) {
                display.setText("NãoSeDividePor0");
            } else {
                resultado = primeiroNumero / segundoNumero;
                display.setText(String.format("% .2f", resultado));
                cadeiaNumeros = String.valueOf(resultado);
                operacao = "nula";
            }
        }
           displayamostra.setText("");
           ativado = true;  
    }//GEN-LAST:event_btnigualActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
         if(ativado == true){
         primeiroNumero = Double.parseDouble(cadeiaNumeros);
         displayamostra.setText(cadeiaNumeros + " - ");
         cadeiaNumeros = "";
         operacao = "subtrair";
         
         ativado = false;
        }
    }//GEN-LAST:event_btnsubActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        if(ativado == true){
         primeiroNumero = Double.parseDouble(cadeiaNumeros);
         displayamostra.setText(cadeiaNumeros + " / ");
         cadeiaNumeros = "";
         operacao = "dividir";
         
         ativado = false;
        }
    }//GEN-LAST:event_btndivActionPerformed

    private void btnapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapagarActionPerformed
    /*String backSp = null;
    if(display.getText().length() > 0)
    {
       StringBuilder sb  = new StringBuilder(display.getText());
       sb.deleteCharAt(display.getText().length()-1);
       backSp = sb.toString();
       display.setText(backSp);
    }*/
    //apaga um por um
   int tamanho =  cadeiaNumeros.length();
   if(tamanho > 0 ){
       if(tamanho == 1){
          cadeiaNumeros = "0";
   }else{
       cadeiaNumeros = cadeiaNumeros.substring(0, cadeiaNumeros.length() - 1);
   }
       display.setText(cadeiaNumeros);
    }//GEN-LAST:event_btnapagarActionPerformed
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btndeleteall;
    private javax.swing.JButton Btnvirgula;
    private javax.swing.JLabel bonecojava;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btnMaisMenos;
    private javax.swing.JButton btnapagar;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmulti;
    private javax.swing.JButton btnraiz;
    private javax.swing.JButton btnsoma;
    private javax.swing.JButton btnsub;
    private javax.swing.JLabel display;
    private javax.swing.JLabel displayamostra;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

    private void digitouNumero(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon-calculator.png")));//adicionando icone ao jframe
    }
}
