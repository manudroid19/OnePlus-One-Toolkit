/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPT;

import java.awt.Desktop;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Prada
 */
public class CM11S extends javax.swing.JDialog {

    /**
     * Creates new form CM11S
     */
    public CM11S(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        buttonGroup1.add(jRadioButton2);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("OPT/Bundle"); // NOI18N
        jRadioButton2.setText(bundle.getString("OPO 64 GB")); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText(bundle.getString("OPO 16 GB")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(bundle.getString("FLASH CM11S/COLOR OS")); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CM11S"));

        jButton1.setText(bundle.getString("DOWNLOAD CM11S")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText(bundle.getString("FLASH CM11S!")); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel3.setText(bundle.getString("PUT_DEVICE_CM11S")); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("External download"));

        jButton8.setText(bundle.getString("DOWNLOAD IN BROWSER")); // NOI18N

        jButton5.setText(bundle.getString("SELECT THE FILE")); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ColorOS"));

        jButton3.setText(bundle.getString("1.DOWNLOAD COLOROS(BROWSER)")); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText(bundle.getString("5.FLASH COLOROS!")); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel2.setText(bundle.getString("COLOR_OS_EXPLANATION")); // NOI18N

        jButton6.setText(bundle.getString("4.BOOT TWRP")); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText(bundle.getString("3.DOWNLOAD TWRP")); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton9.setText(bundle.getString("2.SELECT DOWNLOADED FILE")); // NOI18N
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton3))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText(bundle.getString("<HTML> BEFORE STARTING, YOUR DEVICE MUST BE UNLOCKED.<BR> YOU MUST DO SO IN  MAIN MENU.")); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("30O OTA Update"));

        jButton10.setText(bundle.getString("DOWNLOAD IN BROWSER")); // NOI18N
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton11.setText(bundle.getString("SELECT THE FILE")); // NOI18N
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jLabel5.setText(bundle.getString("OTAZIPTEXT")); // NOI18N

        jButton12.setText(bundle.getString("FLASHOTA")); // NOI18N
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        LogWriter ub = new LogWriter("[Downloading CM11S]","[Launching BAT]\n" +
"cd tools\\downloads\n" +
"rmdir \"CM11S\" /s /q\n" +
"wget.exe -P CM11S http://dist01.slc.cyngn.com/factory/bacon/cm-11.0-XNPH25R-bacon-signed-fastboot.zip\n" +
"exit\n"
        + "[BAT END]\n\n");
        
        try {
            String fpathunlockb = path + "\\tools\\downloads\\CM11S.bat";
            String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, ""};
            Runtime rt = Runtime.getRuntime();
            ProcessBuilder pb = new ProcessBuilder(args);      
            Process pr = pb.start();
            
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
DevicesManager uu = new DevicesManager();
        if (uu.FastbootConnected() == true) {
            if (uu.getFastbootUnlocked() == true) {
            
            LogWriter ub = new LogWriter("fastboot flash modem NON-HLOS.bin\n" +
"fastboot flash sbl1 sbl1.mbn\n" +
"fastboot flash dbi sdi.mbn\n" +
"fastboot flash aboot emmc_appsboot.mbn\n" +
"fastboot flash rpm rpm.mbn\n" +
"fastboot flash tz tz.mbn\n" +
"fastboot flash LOGO logo.bin\n" +
"fastboot update -w cm-11.0-XNPH25R-bacon-signed-fastboot.zip" ,
                "[Launching BAT]\n" +
"cd tools\\downloads\\\n" +
"7za x -oCM11S CM11S\\cm-11.0-XNPH25R-bacon-signed-fastboot.zip\n" +
"cd ..\n" +
"adb_files\\fastboot flash modem downloads\\CM11S\\NON-HLOS.bin\n" +
"adb_files\\fastboot flash sbl1 downloads\\CM11S\\sbl1.mbn\n" +
"adb_files\\fastboot flash dbi downloads\\CM11S\\sdi.mbn\n" +
"adb_files\\fastboot flash aboot downloads\\CM11S\\emmc_appsboot.mbn\n" +
"adb_files\\fastboot flash rpm downloads\\CM11S\\rpm.mbn\n" +
"adb_files\\fastboot flash tz downloads\\CM11S\\tz.mbn\n" +
"adb_files\\fastboot flash LOGO downloads\\CM11S\\logo.bin\n" +
"adb_files\\fastboot update -w downloads\\CM11S\\cm-11.0-XNPH25R-bacon-signed-fastboot.zip\n" +
"@echo Done!!!\n" +
"exit"
        + "[BAT END]\n\n");
        
        if (cmzip == null){
            cmzip = path + "\\tools\\downloads\\CM11S\\cm-11.0-XNPH25R-bacon-signed-fastboot.zip";
        }
        
        //if (this.jRadioButton1.isSelected() == true) {
        
        try {
            String fpathunlockb = path + "\\tools\\CM11S.exe";
            String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, cmzip};
            Runtime rt = Runtime.getRuntime();
            ProcessBuilder pb = new ProcessBuilder(args);      
            Process pr = pb.start();
            
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        //}else if (this.jRadioButton2.isSelected() == true){
           // try {
          //  String fpathunlockb = path + "\\tools\\CM11S64.bat";
            //String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, ""};
          //  Runtime rt = Runtime.getRuntime();
          //  ProcessBuilder pb = new ProcessBuilder(args);      
          //  Process pr = pb.start();
            
        //} catch (IOException ex) {
         //   Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        //}
        //} else if (this.jRadioButton1.isSelected() == false && this.jRadioButton2.isSelected() == false) {
           //jLabel4.setText("<html>Please select a OnePlus One storage version!!");
        //}
            }else if (uu.getFastbootUnlocked() == false){
                main yy = new main();
                NotUnlocked ugg = new NotUnlocked(yy, true);
            }

        }else if (uu.FastbootConnected() == false){
            main uaa = new main();
            NotConnected uc = new NotConnected(uaa, true);
            uc.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked

        LogWriter ub = new LogWriter("[Downloading TWRP recovery]","[Launching BAT]\ncd tools\\downloads\n" +
"rmdir \"TWRP\" /s /q\n" +
"mkdir TWRP\n" +
"wget.exe -P TWRP http://tinyw.in/x6GA\n" +
"exit\n"
        + "[BAT END]\n\n");
        
        try {
            String fpathunlockb = path + "\\tools\\downloads\\TWRP.bat";
            String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, ""};
            Runtime rt = Runtime.getRuntime();
            ProcessBuilder pb = new ProcessBuilder(args);      
            Process pr = pb.start();
            
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked

        DevicesManager uu = new DevicesManager();
        if (uu.FastbootConnected() == true) {
            if (uu.getFastbootUnlocked() == true) {
            
               LogWriter ub = new LogWriter("fastboot boot openrecovery-twrp-2.8.0.1-bacon.img","[Direct cammand]\n"
                + "tools\\adb_files\\fastboot.exe boot tools\\downloads\\TWRP\\openrecovery-twrp-2.8.0.1-bacon.img\n[Command end]\n\n");

        
        try {
            String fpathunlockb = path + "\\tools\\adb_files\\fastboot.exe";
            String fpath = path + "\\tools\\downloads\\openrecovery-twrp-2.8.0.1-bacon.img";
            String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, "fastboot boot " + fpath};
            Runtime rt = Runtime.getRuntime();
            ProcessBuilder pb = new ProcessBuilder(args);      
            Process pr = pb.start();
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(root2.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
            }else if (uu.getFastbootUnlocked() == false){
                main yy = new main();
                NotUnlocked ugg = new NotUnlocked(yy, true);
            }

        }else if (uu.FastbootConnected() == false){
            main uaa = new main();
            NotConnected uc = new NotConnected(uaa, true);
            uc.setVisible(true);
        }
        
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
 DevicesManager uu = new DevicesManager();
        if (uu.ADBConnected() == true) {
            if (coloroszip == null){
     jButton4.setText(java.util.ResourceBundle.getBundle("OPT/Bundle").getString("NOTHING SELECTED!!"));
 }else {
     
        
        LogWriter ub = new LogWriter("adb sideload " + otazip,"[Direct cammand]\n"
                + "tools\\adb_files\\adb.exe sideload " + otazip +"\n[Command end]\n\n");

        
        try {
            String fpathunlockb = path + "\\tools\\adb_files\\adb.exe";
            String fpath = otazip;
            String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, "sideload", fpath};
            Runtime rt = Runtime.getRuntime();
            ProcessBuilder pb = new ProcessBuilder(args);      
            Process pr = pb.start();
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(root2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 }
        }else if (uu.ADBConnected() == false){
            main uaa = new main();
            NotConnected uc = new NotConnected(uaa, true);
            uc.setVisible(true);
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        LogWriter ub = new LogWriter(java.util.ResourceBundle.getBundle("OPT/Bundle").getString("OPENING DOWNLOAD URL IN BROWSER") , java.util.ResourceBundle.getBundle("OPT/Bundle").getString("OPENING DOWNLOAD URL IN BROWSER"));
        try 
        {
            Desktop.getDesktop().browse(new URL("http://www.androidfilehost.com/?fid=23501681358542179").toURI());
        }           
        catch (IOException | URISyntaxException e) {}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try {        
            JFileChooser jfc = new JFileChooser();
            jfc.setDialogTitle(java.util.ResourceBundle.getBundle("OPT/Bundle").getString("PLEASE SELECT A FILE"));
            jfc.setFileFilter(new FileNameExtensionFilter(java.util.ResourceBundle.getBundle("OPT/Bundle").getString("ZIP FILES"), java.util.ResourceBundle.getBundle("OPT/Bundle").getString("ZIP")));
            jfc.showDialog(this, java.util.ResourceBundle.getBundle("OPT/Bundle").getString("SELECT"));
            jfc.setVisible(true);
            File filename = jfc.getSelectedFile();
            cmzip = filename.getCanonicalPath();// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(CM11S.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
      try {        
            JFileChooser jfc = new JFileChooser();
            jfc.setDialogTitle(java.util.ResourceBundle.getBundle("OPT/Bundle").getString("PLEASE SELECT A FILE"));
            jfc.setFileFilter(new FileNameExtensionFilter(java.util.ResourceBundle.getBundle("OPT/Bundle").getString("ZIP FILES"), java.util.ResourceBundle.getBundle("OPT/Bundle").getString("ZIP")));
            jfc.showDialog(this, java.util.ResourceBundle.getBundle("OPT/Bundle").getString("SELECT"));
            jfc.setVisible(true);
            File filename = jfc.getSelectedFile();
            coloroszip = filename.getCanonicalPath();// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(CM11S.class.getName()).log(Level.SEVERE, null, ex);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
     try {        
            JFileChooser jfc = new JFileChooser();
            jfc.setDialogTitle(java.util.ResourceBundle.getBundle("OPT/Bundle").getString("PLEASE SELECT A FILE"));
            jfc.setFileFilter(new FileNameExtensionFilter(java.util.ResourceBundle.getBundle("OPT/Bundle").getString("ZIP FILES"), java.util.ResourceBundle.getBundle("OPT/Bundle").getString("ZIP")));
            jfc.showDialog(this, java.util.ResourceBundle.getBundle("OPT/Bundle").getString("SELECT"));
            jfc.setVisible(true);
            File filename = jfc.getSelectedFile();
            otazip = filename.getCanonicalPath();// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(CM11S.class.getName()).log(Level.SEVERE, null, ex);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        LogWriter ub = new LogWriter(java.util.ResourceBundle.getBundle("OPT/Bundle").getString("OPENING DOWNLOAD URL IN BROWSER") , java.util.ResourceBundle.getBundle("OPT/Bundle").getString("OPENING DOWNLOAD URL IN BROWSER"));
        try 
        {
            Desktop.getDesktop().browse(new URL("https://www.androidfilehost.com/?fid=23610159112653774").toURI());
        }           
        catch (IOException | URISyntaxException e) {}// TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
DevicesManager uu = new DevicesManager();
        if (uu.ADBConnected() == true) {
            
        if (otazip == null){
     jButton4.setText(java.util.ResourceBundle.getBundle("OPT/Bundle").getString("NOTHING SELECTED!!"));
 }else {
     
        
        LogWriter ub = new LogWriter("adb sideload OnePlusOneColorOS120.zip","[Direct cammand]\n"
                + "tools\\adb_files\\adb.exe sideload tools\\downloads\\SuperSU\\OnePlusOneColorOS120.zip\n[Command end]\n\n");

        
        try {
            String fpathunlockb = path + "\\tools\\adb_files\\adb.exe";
            String fpath = coloroszip;
            String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, "sideload", fpath};
            Runtime rt = Runtime.getRuntime();
            ProcessBuilder pb = new ProcessBuilder(args);      
            Process pr = pb.start();
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(root2.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
        }else if (uu.ADBConnected() == false){
            main uaa = new main();
            NotConnected uc = new NotConnected(uaa, true);
            uc.setVisible(true);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseClicked

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CM11S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CM11S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CM11S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CM11S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CM11S dialog = new CM11S(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    
    public String otazip;
    public String cmzip;
    public String coloroszip;
    public String path = System.getProperty("user.dir");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
