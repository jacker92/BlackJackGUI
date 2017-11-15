/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliittyma;


import javax.swing.ImageIcon;
import blackjack.*;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tietovarastot.*;


public class Peli extends javax.swing.JFrame {
    
Graphics g;

  
    // Määritellään muuttujat
    String voittaja = "";
    boolean gameLost = false;
    boolean cardsDealing = true;
    int monesKortti = 0;
    int monesJakajanKortti = 0;
    boolean blackJack = false;
    int voitot = 0;
 
  Tietovarasto tietovarasto = new Tietovarasto();  
  Korttipakka korttipakka = new Korttipakka (10);
  PelaajanKasi pelaajankasi = new PelaajanKasi();
  PelaajanKasi vastustajankasi = new PelaajanKasi();
  
// Määritellään pelin lopussa näkyvät viesti-ikkunat
final JOptionPane pane1 = new JOptionPane("Hävisit!");
final JDialog dLost = pane1.createDialog((JFrame)null, "Hävisit!");
final JOptionPane pane2 = new JOptionPane("Hävisit! Jakajalla on Blackjack!");
final JDialog dDealerBlackJack = pane2.createDialog((JFrame)null, "Hävisit!");
final JOptionPane pane3 = new JOptionPane("Blackjack! Voitit!");
final JDialog dPlayerBlackJack = pane3.createDialog((JFrame)null, "Voitit!");
final JOptionPane pane4 = new JOptionPane("Tasapeli eli jakaja voittaa!");
final JDialog dDraw = pane4.createDialog((JFrame)null, "Hävisit!");
final JOptionPane pane5 = new JOptionPane("Jakajalla meni yli 21! Voitit!");
final JDialog dDealerBust = pane5.createDialog((JFrame)null, "Voitit!");
final JOptionPane pane6 = new JOptionPane("Pelaaja voittaa!");
final JDialog dPlayerWins = pane6.createDialog((JFrame)null, "Voitit!");
final JOptionPane pane7 = new JOptionPane("Jakaja voittaa!");
final JDialog dElseCase = pane7.createDialog((JFrame)null, "Hävisit!");
    
    public Peli() {
        
  initComponents();
  
  voitotTekstiLabel.setText(voitot + "");
  korttienSummaTeksti.setText("0");
  jakajanKorttienSummaLabel.setText("0");
  
  korttipakka.sekoita();      
 
  pelaajankasi.otaKortti(korttipakka.jaaKortti());
  pelaajankasi.otaKortti(korttipakka.jaaKortti());
  
  Kortti apukortti = pelaajankasi.getKortti(monesKortti);
  pelaajanKortti1Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
  monesKortti++;
  
  apukortti = pelaajankasi.getKortti(monesKortti);
  pelaajanKortti2Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
  monesKortti++;
  
  String summa = pelaajankasi.selvitaSumma() + "";
  korttienSummaTeksti.setText(summa);
  
    }
    
    public void PelinAlustus() {
   
    // Alustetaan muuttujat    
    gameLost = false;
    cardsDealing = true;
    monesKortti = 0;
    monesJakajanKortti = 0;
    blackJack = false;
    pelaajankasi.PoistaKortit();
    vastustajankasi.PoistaKortit();
    korttipakka.lisaaPakka();
    korttipakka.sekoita();
    // Asetetaan tekstikenttiin nollat
    
    korttienSummaTeksti.setText("0");
    jakajanKorttienSummaLabel.setText("0");
  
    // Alustetaan korttien pohjat
    pelaajanKortti1Label.setIcon(null);
    pelaajanKortti2Label.setIcon(null);
    pelaajanKortti3Label.setIcon(null);
    pelaajanKortti4Label.setIcon(null);
    pelaajanKortti5Label.setIcon(null);
    pelaajanKortti6Label.setIcon(null);
    jakajanKortti1Label.setIcon(null);
    jakajanKortti2Label.setIcon(null);
    jakajanKortti3Label.setIcon(null);
    jakajanKortti4Label.setIcon(null);
    jakajanKortti5Label.setIcon(null);
    jakajanKortti6Label.setIcon(null);
  korttipakka.sekoita();      
 
  pelaajankasi.otaKortti(korttipakka.jaaKortti());
  pelaajankasi.otaKortti(korttipakka.jaaKortti());
  
  Kortti apukortti = pelaajankasi.getKortti(monesKortti);
  pelaajanKortti1Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
  monesKortti++;
  
  apukortti = pelaajankasi.getKortti(monesKortti);
  pelaajanKortti2Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
  monesKortti++;
  
  String summa = pelaajankasi.selvitaSumma() + "";
  korttienSummaTeksti.setText(summa);
      
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pelaajanKortti1Label = new javax.swing.JLabel();
        pelaajanKortti2Label = new javax.swing.JLabel();
        pelaajanKortti3Label = new javax.swing.JLabel();
        pelaajanKortti4Label = new javax.swing.JLabel();
        pelaajanKortti5Label = new javax.swing.JLabel();
        pelaajanKortti6Label = new javax.swing.JLabel();
        lisaaButton = new javax.swing.JButton();
        korttienSummaLabel = new javax.swing.JLabel();
        korttienSummaTeksti = new javax.swing.JLabel();
        voitotLabel = new javax.swing.JLabel();
        voitotTekstiLabel = new javax.swing.JLabel();
        jaaButton = new javax.swing.JButton();
        valikkoonButton = new javax.swing.JButton();
        lopetaButton = new javax.swing.JButton();
        jakajanKorttienSummaLabel = new javax.swing.JLabel();
        jakajanSummaLabel = new javax.swing.JLabel();
        jakajanKortti1Label = new javax.swing.JLabel();
        jakajanKortti2Label = new javax.swing.JLabel();
        jakajanKortti3Label = new javax.swing.JLabel();
        jakajanKortti4Label = new javax.swing.JLabel();
        jakajanKortti5Label = new javax.swing.JLabel();
        jakajanKortti6Label = new javax.swing.JLabel();
        kuvaTaustaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pelaajanKortti1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 79, 100));
        getContentPane().add(pelaajanKortti2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 69, 100));
        getContentPane().add(pelaajanKortti3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 68, 100));
        getContentPane().add(pelaajanKortti4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 68, 100));
        getContentPane().add(pelaajanKortti5Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 68, 100));
        getContentPane().add(pelaajanKortti6Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, 70, 100));

        lisaaButton.setText("Lisää");
        lisaaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lisaaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(lisaaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 120, -1));

        korttienSummaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        korttienSummaLabel.setForeground(new java.awt.Color(204, 255, 204));
        korttienSummaLabel.setText("Pelaajan korttien summa:");
        getContentPane().add(korttienSummaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 210, 20));

        korttienSummaTeksti.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        korttienSummaTeksti.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(korttienSummaTeksti, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 50, 30));

        voitotLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        voitotLabel.setText("Voitot:");
        getContentPane().add(voitotLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 390, 60, -1));

        voitotTekstiLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        voitotTekstiLabel.setForeground(new java.awt.Color(255, 255, 255));
        voitotTekstiLabel.setToolTipText("");
        getContentPane().add(voitotTekstiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 420, 20, 30));

        jaaButton.setText("Jää");
        jaaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jaaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 120, -1));

        valikkoonButton.setText("Takaisin valikkoon");
        valikkoonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valikkoonButtonActionPerformed(evt);
            }
        });
        getContentPane().add(valikkoonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 130, -1));

        lopetaButton.setText("Lopeta");
        lopetaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lopetaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(lopetaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 130, -1));

        jakajanKorttienSummaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jakajanKorttienSummaLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jakajanKorttienSummaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 60, 30));

        jakajanSummaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jakajanSummaLabel.setForeground(new java.awt.Color(255, 153, 153));
        jakajanSummaLabel.setText("Jakajan korttien summa:");
        getContentPane().add(jakajanSummaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, -1));
        getContentPane().add(jakajanKortti1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 70, 100));
        getContentPane().add(jakajanKortti2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 77, 102));
        getContentPane().add(jakajanKortti3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 73, 102));
        getContentPane().add(jakajanKortti4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 77, 102));
        getContentPane().add(jakajanKortti5Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 77, 102));
        getContentPane().add(jakajanKortti6Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 70, 100));

        kuvaTaustaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kayttoliittyma/blackjack.png"))); // NOI18N
        getContentPane().add(kuvaTaustaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 1270, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lisaaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lisaaButtonActionPerformed
    
        while (cardsDealing == true) {
      
        if (monesKortti == 2 && gameLost == false) {
        pelaajankasi.otaKortti(korttipakka.jaaKortti());
        Kortti apukortti = pelaajankasi.getKortti(monesKortti);
        pelaajanKortti3Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
        String summa = pelaajankasi.selvitaSumma() + "";
        korttienSummaTeksti.setText(summa); 
        monesKortti++;
        break;
            
    }
      
        if (monesKortti == 3 && gameLost == false) {
            pelaajankasi.otaKortti(korttipakka.jaaKortti());
            Kortti apukortti = pelaajankasi.getKortti(monesKortti);
            pelaajanKortti4Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
            String summa = pelaajankasi.selvitaSumma() + "";
            korttienSummaTeksti.setText(summa);
            monesKortti++;
            break;
            
        }
        
        if (monesKortti == 4 && gameLost == false) {
            pelaajankasi.otaKortti(korttipakka.jaaKortti());
            Kortti apukortti = pelaajankasi.getKortti(monesKortti);
            pelaajanKortti5Label.setIcon(new ImageIcon (apukortti.getKuvaPolku()));
            String summa = pelaajankasi.selvitaSumma() + "";
            korttienSummaTeksti.setText(summa);
            monesKortti++;
            break;
        }
        
        if (monesKortti == 5 && gameLost == false) {
            pelaajankasi.otaKortti(korttipakka.jaaKortti());
            Kortti apukortti = pelaajankasi.getKortti(monesKortti);
            pelaajanKortti6Label.setIcon(new ImageIcon (apukortti.getKuvaPolku()));
            String summa = pelaajankasi.selvitaSumma() + "";
            korttienSummaTeksti.setText(summa);
            monesKortti++;
            break;
        }
        
        if (monesKortti >= 6) {
            break;
        }
        }
        
        if (pelaajankasi.selvitaSumma() > 21) {
        gameLost = true;
         
        }
       
        if (gameLost == true) {
        voittaja = "Jakaja";
        dLost.setLocation(450, 330);
        dLost.setVisible(true);
        PelinAlustus();
        }
               
    }//GEN-LAST:event_lisaaButtonActionPerformed

    private void jaaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaaButtonActionPerformed
    
        if (pelaajankasi.isBlackJack() == true) {
         blackJack = true;
        }  
        
    if (gameLost == false) {
        
        
        // Kaksi korttia jaetaan joka tapauksessa
        
        vastustajankasi.otaKortti(korttipakka.jaaKortti());
        Kortti apukortti = vastustajankasi.getKortti(monesJakajanKortti);
        jakajanKortti1Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
        String summa = vastustajankasi.selvitaSumma() + "";
        jakajanKorttienSummaLabel.setText(summa);
        monesJakajanKortti++;
        
        
        vastustajankasi.otaKortti(korttipakka.jaaKortti());
        apukortti = vastustajankasi.getKortti(monesJakajanKortti);
        jakajanKortti2Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
        summa = vastustajankasi.selvitaSumma() + "";
        jakajanKorttienSummaLabel.setText(summa);
        monesJakajanKortti++;
        
        
        Ajastin();
        //jakajanKortti2Label.update(g);
      
    } 
  
        
        // Kolmas kortti
        if (vastustajankasi.selvitaSumma() < 17) {
        
      
         vastustajankasi.otaKortti(korttipakka.jaaKortti());
        Kortti apukortti = vastustajankasi.getKortti(monesJakajanKortti);
        jakajanKortti3Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
        String summa = vastustajankasi.selvitaSumma() + "";
        jakajanKorttienSummaLabel.setText(summa);
        monesJakajanKortti++;     
        }
  
      
        // Neljäs kortti
        if (vastustajankasi.selvitaSumma() < 17) {
            
        vastustajankasi.otaKortti(korttipakka.jaaKortti());
        Kortti apukortti = vastustajankasi.getKortti(monesJakajanKortti);
        jakajanKortti4Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
        String summa = vastustajankasi.selvitaSumma() + "";
        jakajanKorttienSummaLabel.setText(summa);
        monesJakajanKortti++;  
        }
        
        // Viides kortti
        if (vastustajankasi.selvitaSumma() < 17) {
       
         vastustajankasi.otaKortti(korttipakka.jaaKortti());
        Kortti apukortti = vastustajankasi.getKortti(monesJakajanKortti);
        jakajanKortti5Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
        String summa = vastustajankasi.selvitaSumma() + "";
        jakajanKorttienSummaLabel.setText(summa);
        monesJakajanKortti++;  
        }
        
        // Kuudes kortti
        if (vastustajankasi.selvitaSumma() < 17) {
       
         vastustajankasi.otaKortti(korttipakka.jaaKortti());
        Kortti apukortti = vastustajankasi.getKortti(monesJakajanKortti);
        jakajanKortti6Label.setIcon(new ImageIcon(apukortti.getKuvaPolku()));
        String summa = vastustajankasi.selvitaSumma() + "";
        jakajanKorttienSummaLabel.setText(summa);
        monesJakajanKortti++;  
        }
        
        // Muutetaan käsien tiedot järkevään muotoon ennen tietokantaan tallentamista
        String pelaaja = "";
        String jakaja = "";
        
        for (int i = 0; i < pelaajankasi.kortit.size(); i++) {
            pelaaja += ""+pelaajankasi.kortit.get(i) + ", " ;
        }
        
        for (int i = 0; i < vastustajankasi.kortit.size(); i++) {
            jakaja += ""+vastustajankasi.kortit.get(i) + ", ";
        }
        VoittajanTarkistus();
        // Lisätään jako tietokantaan
        try {
        tietovarasto.lisaaJako(pelaaja, jakaja, voittaja);
        }
        catch (Exception e) {
            System.out.println("Tietovarasto ei ole auki");
        }
        
        PelinAlustus();
        voitotTekstiLabel.setText(voitot + "");
     
        
    }//GEN-LAST:event_jaaButtonActionPerformed

    private void lopetaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lopetaButtonActionPerformed
     System.exit(0);
    }//GEN-LAST:event_lopetaButtonActionPerformed

    private void valikkoonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valikkoonButtonActionPerformed
    new Paavalikko().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_valikkoonButtonActionPerformed

   private void Ajastin() {
           // Ajastin    
        long startTime = System.currentTimeMillis();
        long elapsedTime = 0L;

        while (elapsedTime < 200) {
        elapsedTime = (new Date()).getTime() - startTime;
        }
   }
   
   private void VoittajanTarkistus() {
       
           if (gameLost == true) {
        dLost.setLocation(450, 330);
        dLost.setVisible(true);
        voittaja = "Jakaja";
    }   else if (vastustajankasi.selvitaSumma() == 21 && monesJakajanKortti == 2) {
        dDealerBlackJack.setLocation(450, 330);
        dDealerBlackJack.setVisible(true);
        voittaja = "Jakaja";
    }   else if (blackJack == true) {
        dPlayerBlackJack.setLocation(450, 330);
        dPlayerBlackJack.setVisible(true);
        voitot++;
        voittaja = "Pelaaja";
    }   else if (vastustajankasi.selvitaSumma() == pelaajankasi.selvitaSumma()) {
        dDraw.setLocation(450, 330);
        dDraw.setVisible(true);
        voittaja = "Jakaja";
    }   else if (vastustajankasi.selvitaSumma() > 21) {
        dDealerBust.setLocation(450, 330);
        dDealerBust.setVisible(true);
        voitot++;
        voittaja = "Pelaaja";
    }   else if (pelaajankasi.selvitaSumma() > vastustajankasi.selvitaSumma()) {
        dPlayerWins.setLocation(450, 330);
        dPlayerWins.setVisible(true);
        voitot++;
        voittaja = "Pelaaja";
    }   else {
        dElseCase.setLocation(450, 330);
        dElseCase.setVisible(true);
        voittaja = "Jakaja";
    }
    
   
   }
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
            java.util.logging.Logger.getLogger(Peli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peli().setVisible(true);
              
            }
        });
    }

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jaaButton;
    private javax.swing.JLabel jakajanKortti1Label;
    private javax.swing.JLabel jakajanKortti2Label;
    private javax.swing.JLabel jakajanKortti3Label;
    private javax.swing.JLabel jakajanKortti4Label;
    private javax.swing.JLabel jakajanKortti5Label;
    private javax.swing.JLabel jakajanKortti6Label;
    private javax.swing.JLabel jakajanKorttienSummaLabel;
    private javax.swing.JLabel jakajanSummaLabel;
    private javax.swing.JLabel korttienSummaLabel;
    private javax.swing.JLabel korttienSummaTeksti;
    private javax.swing.JLabel kuvaTaustaLabel;
    public javax.swing.JButton lisaaButton;
    private javax.swing.JButton lopetaButton;
    public javax.swing.JLabel pelaajanKortti1Label;
    private javax.swing.JLabel pelaajanKortti2Label;
    private javax.swing.JLabel pelaajanKortti3Label;
    private javax.swing.JLabel pelaajanKortti4Label;
    private javax.swing.JLabel pelaajanKortti5Label;
    private javax.swing.JLabel pelaajanKortti6Label;
    private javax.swing.JButton valikkoonButton;
    private javax.swing.JLabel voitotLabel;
    private javax.swing.JLabel voitotTekstiLabel;
    // End of variables declaration//GEN-END:variables
 
 
}
