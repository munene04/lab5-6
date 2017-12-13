import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Chatting extends javax.swing.JFrame implements Runnable {
Socket client;
ServerSocket server;
BufferedReader Server_Reader,Client_Reader;
BufferedWriter Server_Writer,Client_writer;



    public Chatting() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private void client_connection(){
       
       
    try {
         String iP = JOptionPane.showInputDialog(null, "Evans IP Address:");
        client = new Socket (iP,2000);
        jCBserver.setEnabled(false);
        Server_Reader = new BufferedReader(new InputStreamReader (client.getInputStream()));
        Server_Writer = new BufferedWriter(new OutputStreamWriter (client.getOutputStream()));
        jBon.setText("DISCONNECT");
    } catch (UnknownHostException ex) {
        System.out.println("Accept Failed");
        System.exit(-1);
    }catch (IOException ex){
        Logger.getLogger(Chatting.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    private void read_connection(){
        try{
            try{
                try{
                    server = new ServerSocket(2000);
                    this.setTitle("Please wait...");
                    
                } catch (Exception ex){
                    System.out.println("Could not listen");
                    System.exit(-1);
                    
                }
                client = server.accept();
                this.setTitle("CONNECTED" + client.getInetAddress());
            }catch(IOException ex) {
                System.out.println("Accept Failed");
                System.exit(-1);
            }
            Server_Reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            Server_Writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException ex){
            System.out.println("Read failed");
            System.exit(-1);
        }
    }
    
    private void disconnected_by_client(){
        try{
            client.close();
            Server_Reader.close();
            Server_Writer.close();
            jCBserver.setEnabled(true);
            jBon.setText("ON");
            setTitle("DISCONNECT");
            
        }catch(IOException ex){
            Logger.getLogger(Chatting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void stopped_by_server(){
        try{
            Server_Reader.close();
            Server_Writer.close();
            jBon.setText("ON");
        } catch(IOException ex){
            Logger.getLogger(Chatting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBon = new javax.swing.JButton();
        jBabout = new javax.swing.JButton();
        jCBserver = new javax.swing.JComboBox();
        jTusername = new javax.swing.JTextField();
        Lchat = new java.awt.List();
        jTchat = new javax.swing.JTextField();
        jBsend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBon.setText("ON");
        jBon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBonActionPerformed(evt);
            }
        });

        jBabout.setText("ABOUT");
        jBabout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCBserver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SERVER", "CLIENT", " ", " " }));
        jCBserver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCBserver.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBserverItemStateChanged(evt);
            }
        });
        jCBserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBserverActionPerformed(evt);
            }
        });

        jTusername.setText("UserName");
        jTusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTusernameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCBserver, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jBon, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jBabout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTusername)
                    .addComponent(Lchat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBserver, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jBon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBabout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTusername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Lchat, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTchat.setText("Text Message");
        jTchat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTchatMouseClicked(evt);
            }
        });
        jTchat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTchatKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTchatKeyTyped(evt);
            }
        });

        jBsend.setText("SEND");
        jBsend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBsend.setEnabled(false);
        jBsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTchat, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBsend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTchat, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jBsend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBonActionPerformed
           
       Calendar timer = Calendar.getInstance();
       timer.getTime();
       SimpleDateFormat t_time = new SimpleDateFormat("HH:mm:ss");
       t_time.format(timer.getTime());
       SimpleDateFormat T_date = new SimpleDateFormat("dd-MMM-yyyy");
       T_date.format(timer.getTime());
       
       Lchat.add(T_date.format(timer.getTime()));
        if (jBon.getText().equals("CONNECT")){
            jBon.setText("DISCONNECT");
            client_connection();
            Thread thread = new Thread(this);
            thread.start();
        }else if (jCBserver.getSelectedItem().equals("SERVER")){
            jBon.setText("OFF");
            read_connection();
            Thread thread = new Thread(this);
            thread.start();
        }
        //jBon.setEnabled(false);
    }//GEN-LAST:event_jBonActionPerformed

    private void jBsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsendActionPerformed
   
        if (jTchat.getText().contains("")){
     
           jBsend.setEnabled(false);
            
        }
        Calendar timer = Calendar.getInstance();
       timer.getTime();
       SimpleDateFormat t_time = new SimpleDateFormat("HH:mm:ss");
       t_time.format(timer.getTime());
       SimpleDateFormat T_date = new SimpleDateFormat("dd-MMM-yyyy");
       T_date.format(timer.getTime());
       
        try{
           //Server_Writer.append(T_date.format(timer.getTime()));
           Server_Writer.newLine();
           Server_Writer.write( jTusername.getText() + ":" +jTchat.getText()+ "             "+ t_time.format(timer.getTime()));
           Server_Writer.newLine();
           Server_Writer.flush();
       }catch(Exception ex){
           Logger.getLogger(Chatting.class.getName()).log(Level.SEVERE, null, ex);
       }
      //Lchat.add ( T_date.format(timer.getTime()));
       Lchat.add("Me : " + jTchat.getText()+  "               " + t_time.format(timer.getTime()));
       jTchat.setText("");
    }//GEN-LAST:event_jBsendActionPerformed

    private void jCBserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBserverActionPerformed
        
    }//GEN-LAST:event_jCBserverActionPerformed

    private void jCBserverItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBserverItemStateChanged
        if (jCBserver.getSelectedItem().equals("SERVER")){
            jBon.setText("ON");
            jTusername.setText("SERVER");
        }else {
            jBon.setText("CONNECT");
            jTusername.setText("CLIENT");
        }
    }//GEN-LAST:event_jCBserverItemStateChanged

    private void jTusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTusernameMouseClicked
    jTusername.setText(null);   

    }//GEN-LAST:event_jTusernameMouseClicked

    private void jTchatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTchatMouseClicked
    jTchat.setText(null);  

    }//GEN-LAST:event_jTchatMouseClicked

    private void jTchatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTchatKeyPressed
    
        
    }//GEN-LAST:event_jTchatKeyPressed

    private void jTchatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTchatKeyTyped
    if (jTchat.contains(null)){
        jBsend.setEnabled(false);
    }
         jBsend.setEnabled(true);
    
            

    }//GEN-LAST:event_jTchatKeyTyped

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chatting().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List Lchat;
    private javax.swing.JButton jBabout;
    private javax.swing.JButton jBon;
    private javax.swing.JButton jBsend;
    private javax.swing.JComboBox jCBserver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTchat;
    private javax.swing.JTextField jTusername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true){
            try{
                Lchat.add(Server_Reader.readLine());
            }catch(IOException ex){
                Logger.getLogger(Chatting.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
    }
}
