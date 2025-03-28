/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package activity13;
import java.awt.*;
import javax.swing.*;
import java.util.*;


/**
 *
 * @author L12X17W07
 */
public class Game extends javax.swing.JFrame {
    
    
    
    int playerHP = 100;
    int compHP = 100;
    int playerChoice = 0; // 0 question mark, 1 rock, 2 paper, 3 scissor 
    int compChoice = 0;
    int rc = 1;
    int playerWins = 0;
    int computerWins = 0;
    

    /**
     * Creates new form Game
     */
    public Game() {
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

        btnReset = new javax.swing.JButton();
        btnFight = new javax.swing.JButton();
        prgPlayerLife = new javax.swing.JProgressBar();
        lblPlayer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnScissors = new javax.swing.JButton();
        btnPaper = new javax.swing.JButton();
        btnRock2 = new javax.swing.JButton();
        lblPlayerWins = new javax.swing.JLabel();
        lblPlayerPick = new javax.swing.JLabel();
        lblVersus = new javax.swing.JLabel();
        lblCompPick = new javax.swing.JLabel();
        lblCOmputer = new javax.swing.JLabel();
        prgComputerLife = new javax.swing.JProgressBar();
        win = new javax.swing.JLabel();
        lblCompWins = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblRound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jack N' Poy");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnReset.setText("Reset Game");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnFight.setText("Fight");
        btnFight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFightActionPerformed(evt);
            }
        });

        lblPlayer.setText("Player");

        jLabel2.setText("Win: ");

        btnScissors.setText("Scissors");
        btnScissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScissorsActionPerformed(evt);
            }
        });

        btnPaper.setText("Paper");
        btnPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperActionPerformed(evt);
            }
        });

        btnRock2.setText("Rock");
        btnRock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRock2ActionPerformed(evt);
            }
        });

        lblPlayerWins.setText("0");

        lblCOmputer.setText("COMPUTER");

        win.setText("Win: ");

        lblCompWins.setText("0");

        jLabel1.setText("ROUND");

        lblRound.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPlayerWins))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRock2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPaper)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnScissors)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCOmputer)
                        .addGap(131, 131, 131))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prgPlayerLife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFight, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(win)
                                .addGap(18, 18, 18)
                                .addComponent(lblCompWins))
                            .addComponent(prgComputerLife, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(lblPlayerPick, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblVersus, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblCompPick, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(309, 309, 309)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblRound))))
                .addGap(0, 81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblRound))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer)
                    .addComponent(lblCOmputer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(prgComputerLife, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prgPlayerLife, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPlayerWins)
                    .addComponent(win)
                    .addComponent(lblCompWins))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlayerPick, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblVersus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCompPick, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRock2)
                    .addComponent(btnPaper)
                    .addComponent(btnScissors))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFight, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        playerChoice = 0;
        compChoice = 0;
        
        ImageIcon pic = new ImageIcon("C:\\Users\\L12X17W07\\Documents\\NetBeansProjects\\Activity13\\src\\images\\questionMark.gif");
        Image img = pic.getImage().getScaledInstance(lblPlayerPick.getWidth(), lblPlayerPick.getHeight(), Image.SCALE_DEFAULT);
        lblPlayerPick.setIcon(new ImageIcon(img));
        
        
        ImageIcon compPic = new ImageIcon("C:\\Users\\L12X17W07\\Documents\\NetBeansProjects\\Activity13\\src\\images\\questionMark.gif");
        Image compImg = compPic.getImage().getScaledInstance(lblCompPick.getWidth(), lblCompPick.getHeight(), Image.SCALE_DEFAULT);
        lblCompPick.setIcon(new ImageIcon(compImg));
        
        
        rc = 1;
        playerHP = 100;
        compHP =100;
        prgPlayerLife.setValue(playerHP);
        prgComputerLife.setValue(compHP);

    }//GEN-LAST:event_btnResetActionPerformed

    private void setVersus(){
        ImageIcon pic = new ImageIcon("C:\\Users\\L12X17W07\\Documents\\NetBeansProjects\\Activity13\\src\\images\\versus.png");
        Image img = pic.getImage().getScaledInstance(lblVersus.getWidth(), lblVersus.getHeight(), Image.SCALE_DEFAULT);
        lblVersus.setIcon(new ImageIcon(img));
    }
    
    private void roundCounter(){
        if(playerHP <= 0 || compHP <= 0){
            rc++;
            
            playerHP = 100;
            compHP =100;
            prgPlayerLife.setValue(playerHP);
            prgComputerLife.setValue(compHP);
            
            if(playerHP > compHP){
                playerWins++;
                lblPlayerWins.setText(String.valueOf(playerWins));
            }else{
                computerWins++;
                lblCompWins.setText(String.valueOf(computerWins));
            }
        }
       
        //TODO best of 3 games then kaylangan kay winner ka like 2 consecutive wins mana ang dula daog ka
    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ImageIcon pic = new ImageIcon("C:\\Users\\L12X17W07\\Documents\\NetBeansProjects\\Activity13\\src\\images\\questionMark.gif");
        Image img = pic.getImage().getScaledInstance(lblPlayerPick.getWidth(), lblPlayerPick.getHeight(), Image.SCALE_DEFAULT);
        lblPlayerPick.setIcon(new ImageIcon(img));
        
        
        ImageIcon compPic = new ImageIcon("C:\\Users\\L12X17W07\\Documents\\NetBeansProjects\\Activity13\\src\\images\\questionMark.gif");
        Image compImg = compPic.getImage().getScaledInstance(lblCompPick.getWidth(), lblCompPick.getHeight(), Image.SCALE_DEFAULT);
        lblCompPick.setIcon(new ImageIcon(compImg));
        
        setVersus();
        prgComputerLife.setValue(compHP);
        prgPlayerLife.setValue(playerHP);
        btnFight.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnRock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRock2ActionPerformed
        // TODO add your handling code here:
        btnFight.setEnabled(true);
        playerChoice = 1;
        
        ImageIcon pic = new ImageIcon("C:\\Users\\L12X17W07\\Documents\\NetBeansProjects\\Activity13\\src\\images\\rock.gif");
        Image img = pic.getImage().getScaledInstance(lblPlayerPick.getWidth(), lblPlayerPick.getHeight(), Image.SCALE_DEFAULT);
        lblPlayerPick.setIcon(new ImageIcon(img));
        
    }//GEN-LAST:event_btnRock2ActionPerformed

    private void btnPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperActionPerformed
        // TODO add your handling code here:
        btnFight.setEnabled(true);
        playerChoice = 2;
        
        ImageIcon pic = new ImageIcon("C:\\Users\\L12X17W07\\Documents\\NetBeansProjects\\Activity13\\src\\images\\paper.gif");
        Image img = pic.getImage().getScaledInstance(lblPlayerPick.getWidth(), lblPlayerPick.getHeight(), Image.SCALE_DEFAULT);
        lblPlayerPick.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_btnPaperActionPerformed

    private void btnScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScissorsActionPerformed
        // TODO add your handling code here:
        btnFight.setEnabled(true);
        playerChoice = 3;
        
        ImageIcon pic = new ImageIcon("C:\\Users\\L12X17W07\\Documents\\NetBeansProjects\\Activity13\\src\\images\\scissors.gif");
        Image img = pic.getImage().getScaledInstance(lblPlayerPick.getWidth(), lblPlayerPick.getHeight(), Image.SCALE_DEFAULT);
        lblPlayerPick.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_btnScissorsActionPerformed

    private void btnFightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFightActionPerformed
        // TODO add your handling code here:
        Random rnd = new Random();
        compChoice = rnd.nextInt(3) +1;
        
        if(compChoice == 1){
            ImageIcon compPic = new ImageIcon("C:\\Users\\L12X17W07\\Documents\\NetBeansProjects\\Activity13\\src\\images\\rock.gif");
            Image compImg = compPic.getImage().getScaledInstance(lblCompPick.getWidth(), lblCompPick.getHeight(), Image.SCALE_DEFAULT);
            lblCompPick.setIcon(new ImageIcon(compImg));
        } else if ( compChoice == 2){
            ImageIcon compPic = new ImageIcon("C:\\Users\\L12X17W07\\Documents\\NetBeansProjects\\Activity13\\src\\images\\paper.gif");
            Image compImg = compPic.getImage().getScaledInstance(lblCompPick.getWidth(), lblCompPick.getHeight(), Image.SCALE_DEFAULT);
            lblCompPick.setIcon(new ImageIcon(compImg));
        }else if(compChoice == 3){
            ImageIcon compPic = new ImageIcon("C:\\Users\\L12X17W07\\Documents\\NetBeansProjects\\Activity13\\src\\images\\scissors.gif");
            Image compImg = compPic.getImage().getScaledInstance(lblCompPick.getWidth(), lblCompPick.getHeight(), Image.SCALE_DEFAULT);
            lblCompPick.setIcon(new ImageIcon(compImg));
        }
        
        //check winner
        if(playerChoice == 1 && compChoice == 1){
            JOptionPane.showMessageDialog(null, "It's a tie!", "Jack n' Poy Game!", JOptionPane.WARNING_MESSAGE);
        }else if(playerChoice == 1 && compChoice == 2){
            JOptionPane.showMessageDialog(null, "You lose!", "Jack n' Poy Game!", JOptionPane.ERROR_MESSAGE);
            playerHP -= 30;
            prgPlayerLife.setValue(playerHP);
        }else if(playerChoice == 1 && compChoice == 3){
            JOptionPane.showMessageDialog(null, "You Win!", "Jack n' Poy Game!", JOptionPane.INFORMATION_MESSAGE);
            compHP -= 30;
            prgComputerLife.setValue(compHP);
        }else if(playerChoice == 2 && compChoice == 1){
            JOptionPane.showMessageDialog(null, "You Win!", "Jack n' Poy Game!", JOptionPane.INFORMATION_MESSAGE);
            compHP -= 30;
            prgComputerLife.setValue(compHP);
        }else if(playerChoice == 2 && compChoice == 2){
            JOptionPane.showMessageDialog(null, "It's a tie!", "Jack n' Poy Game!", JOptionPane.WARNING_MESSAGE);
        }else if(playerChoice == 2 && compChoice == 3){
            JOptionPane.showMessageDialog(null, "You lose!", "Jack n' Poy Game!", JOptionPane.ERROR_MESSAGE);
            playerHP -= 30;
            prgPlayerLife.setValue(playerHP);
        }else if(playerChoice == 3 && compChoice == 1){
            JOptionPane.showMessageDialog(null, "You lose!", "Jack n' Poy Game!", JOptionPane.ERROR_MESSAGE);
            playerHP -= 30;
            prgPlayerLife.setValue(playerHP);
        }else if(playerChoice == 3 && compChoice == 2){
            JOptionPane.showMessageDialog(null, "You Win!", "Jack n' Poy Game!", JOptionPane.INFORMATION_MESSAGE);
            compHP -= 30;
            prgComputerLife.setValue(compHP);
        }else if(playerChoice == 3 && compChoice == 3){
            JOptionPane.showMessageDialog(null, "It's a tie!", "Jack n' Poy Game!", JOptionPane.WARNING_MESSAGE);
        }
        
        roundCounter();
        lblRound.setText(String.valueOf(rc));
    }//GEN-LAST:event_btnFightActionPerformed

    
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFight;
    private javax.swing.JButton btnPaper;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRock2;
    private javax.swing.JButton btnScissors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCOmputer;
    private javax.swing.JLabel lblCompPick;
    private javax.swing.JLabel lblCompWins;
    private javax.swing.JLabel lblPlayer;
    private javax.swing.JLabel lblPlayerPick;
    private javax.swing.JLabel lblPlayerWins;
    private javax.swing.JLabel lblRound;
    private javax.swing.JLabel lblVersus;
    private javax.swing.JProgressBar prgComputerLife;
    private javax.swing.JProgressBar prgPlayerLife;
    private javax.swing.JLabel win;
    // End of variables declaration//GEN-END:variables
}
