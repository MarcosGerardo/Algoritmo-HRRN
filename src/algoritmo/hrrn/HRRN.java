
package algoritmo.hrrn;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;


public class HRRN extends javax.swing.JFrame {

  
    int contador = 0, tiempo = 0;
    int [] MatrizTiempoServicio = new int [5];//Tiempo de Servicio
    int [] te = new int [5];//Tiempo de espera
    int [] tll = new int [5];//Tiempo de llegada
    int [] tf = new int [5];//Tiempo Final
    int [] P = new int [5];//Proceso
    double [] priori = new double[5];//prioridad
    public HRRN() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        llegada = new javax.swing.JComboBox<>();
        TiempoDeServicio = new javax.swing.JComboBox<>();
        p2 = new java.awt.Panel();
        p4 = new java.awt.Panel();
        p3 = new java.awt.Panel();
        p5 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        ingresar = new javax.swing.JButton();
        iniciar = new javax.swing.JButton();
        p1 = new java.awt.Panel();
        jButton1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tq = new javax.swing.JTextField();
        tqn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmo Grupo 1");
        setBackground(new java.awt.Color(153, 153, 153));
        setMaximumSize(new java.awt.Dimension(1170, 500));
        setMinimumSize(new java.awt.Dimension(1170, 500));
        setPreferredSize(new java.awt.Dimension(1170, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        llegada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        llegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llegadaActionPerformed(evt);
            }
        });
        getContentPane().add(llegada);
        llegada.setBounds(480, 80, 119, 25);

        TiempoDeServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(TiempoDeServicio);
        TiempoDeServicio.setBounds(630, 80, 119, 25);

        p2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(p2);
        p2.setBounds(90, 93, 310, 50);

        p4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(p4);
        p4.setBounds(90, 213, 310, 50);

        p3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(p3);
        p3.setBounds(90, 153, 310, 50);

        p5.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(p5);
        p5.setBounds(90, 273, 310, 50);

        jLabel3.setBackground(new java.awt.Color(255, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Proceso 1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 33, 70, 50);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Proceso 2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 93, 70, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Proceso 3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 153, 70, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Proceso 4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 213, 70, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Proceso 5");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 273, 70, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "HR llegada", "TS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(460, 180, 209, 139);

        jTextField1.setEditable(false);
        jTextField1.setText("Llegada");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(480, 40, 55, 20);

        jTextField2.setEditable(false);
        jTextField2.setText("Tiempo de Servicio");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(630, 40, 110, 20);

        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar);
        ingresar.setBounds(480, 130, 90, 26);

        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar);
        iniciar.setBounds(600, 130, 80, 26);

        p1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(p1);
        p1.setBounds(90, 33, 310, 50);

        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(383, 378, 90, 26);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(506, 378, 80, 26);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T Finalizacion", "T Retorno", "Tq/Ts"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(700, 180, 209, 139);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tiempo de retorno promedio");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 370, 180, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tq normalizado promedio");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 400, 160, 15);

        tq.setEditable(false);
        getContentPane().add(tq);
        tq.setBounds(210, 370, 55, 20);

        tqn.setEditable(false);
        tqn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tqnActionPerformed(evt);
            }
        });
        getContentPane().add(tqn);
        tqn.setBounds(210, 400, 55, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//M??todo para ingresar los datos de las combo box
    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        if(contador >= 5){
            
            //PARAMETROS DE ENTRADA SI EL CONTAO ES MAYOR A CINCO NO HAGAS NADA, 
            llegada.setEnabled(false);
            TiempoDeServicio.setEnabled(false);
        }
        else
        {
            if(TiempoDeServicio.getSelectedIndex()>0){
               MatrizTiempoServicio[contador]=TiempoDeServicio.getSelectedIndex(); 
            }
            else
            {
                MatrizTiempoServicio[contador]=1;
            }
            tll[contador]=llegada.getSelectedIndex();
            P [contador]=contador+1;
            contador++;
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            Object [] miTabla = new Object [5];
            miTabla [0] = contador;
            miTabla [1] = llegada.getSelectedIndex();
            miTabla [2] = TiempoDeServicio.getSelectedIndex();
            modelo.addRow(miTabla);
        }
    }//GEN-LAST:event_ingresarActionPerformed
//M??todo para iniciar el algoritmo
    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        int tiempot = 0;
        ingresar.setEnabled(false);
        iniciar.setEnabled(false);
        llegada.setEnabled(false);
        TiempoDeServicio.setEnabled(false);
        if(contador ==5)
        {
            for(int i =0; i<MatrizTiempoServicio.length; i++)
        {
            tiempot = tiempot + MatrizTiempoServicio[i];
        }
         tiempo = tiempot;
          new Thread (new Hilo()).start();
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "La cantidad de procesos no debe ser mayor a 5 ni menor a 5");
        }
        
    }//GEN-LAST:event_iniciarActionPerformed
//No hace nada fue doble clic por accidente y Kevin x Anna is real 7w7 (ni olvidar borrar)
    private void llegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_llegadaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ingresar.setEnabled(true);
        iniciar.setEnabled(true);
        llegada.setEnabled(true);
        TiempoDeServicio.setEnabled(true);
        contador=0;
        tiempo=0;
        for(int i =0; i<5; i++)
        {
          MatrizTiempoServicio [i]= 0;
          te [i]= 0;
          tll [i]= 0;
          tf [i]= 0;
          P [i]= 0;
          priori [i]= 0;
        }
        Graphics g; //variable temporal
        g=p1.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0,0,600,50);
        g=p2.getGraphics();

        g.setColor(Color.white);
        g.fillRect(0,0,600,50);

        g=p3.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0,0,600,50);

        g=p4.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0,0,600,50);

        g=p5.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0,0,600,50);
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
            while(dm.getRowCount() > 0)
                 {      
                      dm.removeRow(0);
                 }
            DefaultTableModel dmc = (DefaultTableModel)jTable2.getModel();
            while(dmc.getRowCount() > 0)
                 {      
                      dmc.removeRow(0);
                 }
            tqn.setText("");
            tq.setText("");
            llegada.setSelectedIndex(0);
            TiempoDeServicio.setSelectedIndex(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Confirme su salida", "??Desea Salir?",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE)==JOptionPane.YES_OPTION){
            this.dispose();
        }

    }//GEN-LAST:event_salirActionPerformed

    private void tqnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tqnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tqnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
//Pintaar los paneles
    public void pinta(Graphics g, int tsActual, int cantTs, int tamBloq){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 600, 50);
        g.setColor(new Color(3,4,7));
        for(int x=0;x<cantTs;x++){
            if((x%2)==1){
                g.setColor(Color.CYAN);
            }
            else{
                g.setColor(new Color(0,204,204));
            }
            g.fillRect(tsActual*tamBloq+(tamBloq*x), 0, tamBloq, 50);
            ZaWarudo(400);
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
                if ("JOJOS".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HRRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRRN().setVisible(true);
            }
        });
    }
    public void ZaWarudo(int tokiwatomare){
        try{
            Thread.sleep(tokiwatomare);
        }catch(Exception tokiwaugokasai){
            System.out.println("No se pudo detener el tiempo");
        }
    }
   //Clase Hilos con el contenido del Hilo que hace los procesos del algoritmo
private class Hilo implements Runnable{

        @Override
        public void run() {//Ejecuta el Hilo
            int DIO = 0, star_platinum=0;
            int OP =0;
            double trprom=0, tnrprom=0;
            double tqts;
            double temp=0;
            DIO= p1.getWidth()/tiempo;//nos dice cuanto vale cada unidad de ts en el grafico
            int a=0,b=0,c=0,d=0,e=0;
            //inicio lso timepos de espere y de finalizacion en 0
            DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
                Object [] miTabla = new Object [5];
            for(int z=0;z<5;z++){
                te[z]=0;
                tf[z]=0;
                priori[z]=0;
            }
            for(int i =0; i<MatrizTiempoServicio.length-1;i++){
                for(int j =0; j<MatrizTiempoServicio.length-1;j++){
                    if(tll[j]>tll[j+1])
                    {
                        a = MatrizTiempoServicio[j+1];
                        MatrizTiempoServicio[j+1]=MatrizTiempoServicio[j];
                        MatrizTiempoServicio[j]=a;
                                
                                c = tll[j+1];
                                tll[j+1]=tll[j];
                                tll[j]=c;
                                    
                                        e = P[j+1];
                                        P[j+1]=P[j];
                                        P[j]=e;
                    }   
                }
            }
            for(int i = 0; i<5; i++)
            {
               OP = P[i];
               tqts=0.0;
               switch(OP){
                   case 1:
                       pinta(p1.getGraphics(),star_platinum,MatrizTiempoServicio[i],DIO);
                   break;

                   case 2:
                       pinta(p2.getGraphics(),star_platinum,MatrizTiempoServicio[i],DIO);
                   break;

                   case 3:
                       pinta(p3.getGraphics(),star_platinum,MatrizTiempoServicio[i],DIO);
                   break;
                   
                   case 4:
                       pinta(p4.getGraphics(),star_platinum,MatrizTiempoServicio[i],DIO);
                   break;
                   
                   case 5:
                        pinta(p5.getGraphics(),star_platinum,MatrizTiempoServicio[i],DIO);
                   break;
               }
               star_platinum = star_platinum + (MatrizTiempoServicio[i]);
               //le aumenta a star_platinum la cuenta, econ esto sabemos
               //cuantos segundos o unidades ts han pasado
               tf[i]=star_platinum;
               //tiempo en que finalizo el proceso que acaba de ejecutarse
               te[i]=star_platinum-tll[i];
               //tiempo de espera que tuvo el proceso que acaba de ejecutarse
               priori[i]=100+i;
               //calculo de priporidades para los que faltan ejecutar y ya existen
               for(int y=0;y<5;y++){
                   if(priori[y]>99){
                       continue;
                   }
                   if(tll[y]>star_platinum){
                       priori[y]=0;
                       continue;
                   }
                   te[y]=star_platinum-tll[y];
                   priori[y]=((double)te[y]+(double)MatrizTiempoServicio[y])/(double)MatrizTiempoServicio[y];
               }
               for(int x=0;x<5;x++){
                   for(int y =0;y<4;y++){
                       if(priori[y]<priori[y+1]){
                           a=P[y+1];
                           P[y+1]=P[y];
                           P[y]=a;
                           
                           b=MatrizTiempoServicio[y+1];
                           MatrizTiempoServicio[y+1]=MatrizTiempoServicio[y];
                           MatrizTiempoServicio[y]=b;
                           
                           c=tll[y+1];
                           tll[y+1]=tll[y];
                           tll[y]=c;
                           
                           d=te[y+1];
                           te[y+1]=te[y];
                           te[y]=d;
                           
                           temp=priori[y+1];
                           priori[y+1]=priori[y];
                           priori[y]=temp;
                       }
                   }
               }
              
            }
            for(int i =0; i<5; i++)
            {
                for(int y =0;y<4;y++){
                       if(P[y]>P[y+1]){
                           a=P[y+1];
                           P[y+1]=P[y];
                           P[y]=a;
                           
                           b=MatrizTiempoServicio[y+1];
                           MatrizTiempoServicio[y+1]=MatrizTiempoServicio[y];
                          MatrizTiempoServicio[y]=b;
                           
                           c=tll[y+1];
                           tll[y+1]=tll[y];
                           tll[y]=c;
                           
                           d=te[y+1];
                           te[y+1]=te[y];
                           te[y]=d;
                           
                           temp=priori[y+1];
                           priori[y+1]=priori[y];
                           priori[y]=temp;
                           
                           e = tf[y+1];
                           tf[y+1]=tf[y];
                           tf[y]=e;
                       }
                   }
            }
            for(int i =0; i<5;i++)
            {
              tqts=((double)te[i])/((double)MatrizTiempoServicio[i]);
               trprom=trprom+(double)te[i];
               tnrprom = tnrprom + tqts;
                miTabla [0] = tf[i];
                miTabla [1] = te[i];
                miTabla [2] = tqts;
                modelo.addRow(miTabla);  
            }
            trprom=trprom/5;
            tnrprom=tnrprom/5;
            tq.setText(""+trprom);
            tqn.setText(""+tnrprom);
        }
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TiempoDeServicio;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> llegada;
    private java.awt.Panel p1;
    private java.awt.Panel p2;
    private java.awt.Panel p3;
    private java.awt.Panel p4;
    private java.awt.Panel p5;
    private javax.swing.JButton salir;
    private javax.swing.JTextField tq;
    private javax.swing.JTextField tqn;
    // End of variables declaration//GEN-END:variables
}
