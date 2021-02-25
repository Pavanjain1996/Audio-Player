import java.io.File;
import javax.swing.JFileChooser;

public class GUIframe extends javax.swing.JFrame {
    CodeClass obj=null;
    String path=null;
    public GUIframe() {
        initComponents();
    }
    public class slider implements Runnable{
        @Override
        public void run() {
            while(true){
                long n=obj.clip.getMicrosecondLength();
                long i=obj.clip.getMicrosecondPosition();
                long pos=(i*10000)/n;
                Slider.setValue((int)pos);
                n=n/1000000;
                i=i/1000000;
                Start.setText((int)(i/60)+" : "+(int)(i%60));
                End.setText((int)(n/60)+" : "+(int)(n%60));
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bank = new javax.swing.JButton();
        Forward = new javax.swing.JButton();
        Play = new javax.swing.JButton();
        Pause = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        Select = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Start = new javax.swing.JLabel();
        End = new javax.swing.JLabel();
        Slider = new javax.swing.JSlider();
        Name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Audio Player");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 10))); // NOI18N

        Bank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.PNG"))); // NOI18N
        Bank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankActionPerformed(evt);
            }
        });

        Forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forward.PNG"))); // NOI18N
        Forward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForwardActionPerformed(evt);
            }
        });

        Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Play.png"))); // NOI18N
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });

        Pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pause.png"))); // NOI18N
        Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseActionPerformed(evt);
            }
        });

        Stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Stop.png"))); // NOI18N
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });

        Select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Select.png"))); // NOI18N
        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bank, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Play, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Forward, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Select, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Select, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Forward, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Play, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bank, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Playing", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 10))); // NOI18N

        Start.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Start.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        End.setBackground(new java.awt.Color(255, 255, 255));
        End.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        End.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Slider.setMaximum(10000);
        Slider.setValue(1);
        Slider.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                SliderPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/name.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        obj.play();
        Thread t1=new Thread(new GUIframe.slider());
        t1.start();
    }//GEN-LAST:event_PlayActionPerformed

    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File file=chooser.getSelectedFile();
        path=file.getAbsolutePath();
        obj=new CodeClass(path);
        Play.doClick();
    }//GEN-LAST:event_SelectActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        Pause.doClick();
        obj=new CodeClass(path);
    }//GEN-LAST:event_StopActionPerformed

    private void PauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseActionPerformed
        obj.pause();
    }//GEN-LAST:event_PauseActionPerformed

    private void SliderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_SliderPropertyChange
        
    }//GEN-LAST:event_SliderPropertyChange

    private void BankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankActionPerformed
        if(obj.clip.getMicrosecondPosition()-10000000>=0){
            obj.clip.setMicrosecondPosition(obj.clip.getMicrosecondPosition()-10000000);
        }
        else{
            obj.clip.setMicrosecondPosition(0);
        }
    }//GEN-LAST:event_BankActionPerformed

    private void ForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForwardActionPerformed
        if(obj.clip.getMicrosecondPosition()+10000000<=obj.clip.getMicrosecondLength()){
            obj.clip.setMicrosecondPosition(obj.clip.getMicrosecondPosition()+10000000);
        }
        else{
            obj.clip.setMicrosecondPosition(obj.clip.getMicrosecondLength());
        }
    }//GEN-LAST:event_ForwardActionPerformed
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
            java.util.logging.Logger.getLogger(GUIframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bank;
    private javax.swing.JLabel End;
    private javax.swing.JButton Forward;
    private javax.swing.JLabel Name;
    private javax.swing.JButton Pause;
    private javax.swing.JButton Play;
    private javax.swing.JButton Select;
    private javax.swing.JSlider Slider;
    private javax.swing.JLabel Start;
    private javax.swing.JButton Stop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}