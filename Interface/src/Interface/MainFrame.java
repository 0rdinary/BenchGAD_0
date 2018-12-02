/*
 * Purpose : Main frame of BenchGAD
 *  Author : mwJeong
 */
package Interface;

import Data.Alldata;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class MainFrame extends javax.swing.JFrame {
    
    /* Constant of size */
    public final int PROGRESS_HEIGHT = 44;
    public final int FRAME_BORDER = 22;
    
    private boolean is_folded = true;
    
    /* status of card_panel */
    private boolean is_bench_panel = true;
    
    /* AllData value */
    private Alldata ad = new Alldata();
    

    public MainFrame() {
        initComponents();
    }

    /**
     * Do not modify this cord.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_Panel = new javax.swing.JPanel();
        side_Panel = new javax.swing.JPanel();
        collect_Panel = new javax.swing.JPanel();
        bench_Btn = new javax.swing.JButton();
        setting_Btn = new javax.swing.JButton();
        expension_Panel = new javax.swing.JPanel();
        optionPanel1 = new Interface.OptionPanel();
        progress_Panel = new javax.swing.JPanel();
        reload_Btn = new javax.swing.JButton();
        card_Panel = new javax.swing.JPanel();
        mainPanel1 = new Interface.MainPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(50, 0, 1200, 744));
        setMinimumSize(new java.awt.Dimension(1200, 744));
        setPreferredSize(new java.awt.Dimension(1200, 744));
        setSize(new java.awt.Dimension(1200, 744));

        back_Panel.setPreferredSize(new java.awt.Dimension(1200, 700));
        back_Panel.setSize(new java.awt.Dimension(1200, 700));

        side_Panel.setBackground(new java.awt.Color(0, 18, 50));
        side_Panel.setBounds(new java.awt.Rectangle(0, 0, 50, 678));
        side_Panel.setPreferredSize(new java.awt.Dimension(50, 678));

        collect_Panel.setBackground(new java.awt.Color(0, 18, 50));

        bench_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/benchOn.png"))); // NOI18N
        bench_Btn.setBorderPainted(false);
        bench_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bench_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bench_BtnMouseEntered(evt);
            }
        });

        setting_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/settingDefault.png"))); // NOI18N
        setting_Btn.setToolTipText("");
        setting_Btn.setBorderPainted(false);
        setting_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setting_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setting_BtnMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout collect_PanelLayout = new javax.swing.GroupLayout(collect_Panel);
        collect_Panel.setLayout(collect_PanelLayout);
        collect_PanelLayout.setHorizontalGroup(
            collect_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collect_PanelLayout.createSequentialGroup()
                .addGroup(collect_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(setting_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bench_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        collect_PanelLayout.setVerticalGroup(
            collect_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collect_PanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(bench_Btn)
                .addGap(18, 18, 18)
                .addComponent(setting_Btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        expension_Panel.setLayout(new java.awt.CardLayout());
        expension_Panel.add(optionPanel1, "card2");

        javax.swing.GroupLayout side_PanelLayout = new javax.swing.GroupLayout(side_Panel);
        side_Panel.setLayout(side_PanelLayout);
        side_PanelLayout.setHorizontalGroup(
            side_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_PanelLayout.createSequentialGroup()
                .addComponent(collect_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(expension_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        side_PanelLayout.setVerticalGroup(
            side_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(collect_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(expension_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        progress_Panel.setBackground(new java.awt.Color(0, 0, 0));
        progress_Panel.setPreferredSize(new java.awt.Dimension(1200, 44));
        progress_Panel.setSize(new java.awt.Dimension(1200, 44));

        reload_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reload.png"))); // NOI18N
        reload_Btn.setBorderPainted(false);
        reload_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reload_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reload_BtnMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout progress_PanelLayout = new javax.swing.GroupLayout(progress_Panel);
        progress_Panel.setLayout(progress_PanelLayout);
        progress_PanelLayout.setHorizontalGroup(
            progress_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progress_PanelLayout.createSequentialGroup()
                .addContainerGap(1058, Short.MAX_VALUE)
                .addComponent(reload_Btn)
                .addGap(94, 94, 94))
        );
        progress_PanelLayout.setVerticalGroup(
            progress_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progress_PanelLayout.createSequentialGroup()
                .addComponent(reload_Btn)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        card_Panel.setBackground(new java.awt.Color(204, 204, 0));
        card_Panel.setBounds(new java.awt.Rectangle(0, 0, 1150, 678));
        card_Panel.setMinimumSize(new java.awt.Dimension(1150, 678));
        card_Panel.setPreferredSize(new java.awt.Dimension(1150, 678));
        card_Panel.setLayout(new java.awt.CardLayout());

        mainPanel1.setMinimumSize(new java.awt.Dimension(1150, 656));
        card_Panel.add(mainPanel1, "card2");

        javax.swing.GroupLayout back_PanelLayout = new javax.swing.GroupLayout(back_Panel);
        back_Panel.setLayout(back_PanelLayout);
        back_PanelLayout.setHorizontalGroup(
            back_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(back_PanelLayout.createSequentialGroup()
                .addGroup(back_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(back_PanelLayout.createSequentialGroup()
                        .addComponent(side_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(card_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(progress_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        back_PanelLayout.setVerticalGroup(
            back_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(back_PanelLayout.createSequentialGroup()
                .addGroup(back_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(side_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(progress_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*
    * Purpose : fold or unfold side_panel
    *  Author : mwJeong
    */
    private void bench_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bench_BtnMouseClicked
        
    }//GEN-LAST:event_bench_BtnMouseClicked

    /*
    * Purpose : Cursor action;
    *  Author : mwJeong
    */
    private void bench_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bench_BtnMouseEntered
        bench_Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_bench_BtnMouseEntered

    
    private void setting_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_BtnMouseClicked
        Rectangle windowR = getBounds();
        int height = windowR.height - FRAME_BORDER - PROGRESS_HEIGHT;
        
        if (is_folded) {
            setting_Btn.setIcon(new ImageIcon(getClass().getResource("/Image/settingOn.png")));
            side_Panel.setPreferredSize(new Dimension(300, height));
            side_Panel.setSize(new Dimension(300, height));
        } else {
            setting_Btn.setIcon(new ImageIcon(getClass().getResource("/Image/settingDefault.png")));
            side_Panel.setPreferredSize(new Dimension(50, height));
            side_Panel.setSize(new Dimension(50, height));
        }
        
        is_folded = !is_folded;
    }//GEN-LAST:event_setting_BtnMouseClicked

    /*
    * Purpose : Cursor action;
    *  Author : mwJeong
    */
    private void setting_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_BtnMouseEntered
        setting_Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_setting_BtnMouseEntered

    private void reload_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reload_BtnMouseClicked
        Rectangle windowR = getBounds();
        int height = windowR.height - FRAME_BORDER - PROGRESS_HEIGHT;
        
        if (!is_folded) {
            is_folded = true;
            setting_Btn.setIcon(new ImageIcon(getClass().getResource("/Image/settingDefault.png")));
            side_Panel.setPreferredSize(new Dimension(50, height));
            side_Panel.setSize(new Dimension(50, height));
        }
        
        ad.setProject_name(optionPanel1.getProjectName());
        ad.setBench_type(optionPanel1.getType());
        
        StringBuffer status = new StringBuffer();
        
        status.append("Project Name : " + ad.getProject_name() + "\n");
        status.append("Benchmarking type : " + ad.getBench_type() + "\n");
        if (ad.getBench_type().equals(("TPC-H"))) {
            status.append("Scale Factor : " + ad.getScale_factor() + "\n");
        } else if (ad.getBench_type().equals("TPC-C")) {
            status.append("Transaction Refresh Rate : " + ad.getTransaction_refresh_rate() + "\n");
        }
        
        mainPanel1.status_Area.setText(status.toString());
    }//GEN-LAST:event_reload_BtnMouseClicked

    private void reload_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reload_BtnMouseEntered
        reload_Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_reload_BtnMouseEntered

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back_Panel;
    private javax.swing.JButton bench_Btn;
    private javax.swing.JPanel card_Panel;
    private javax.swing.JPanel collect_Panel;
    private javax.swing.JPanel expension_Panel;
    private Interface.MainPanel mainPanel1;
    private Interface.OptionPanel optionPanel1;
    private javax.swing.JPanel progress_Panel;
    private javax.swing.JButton reload_Btn;
    private javax.swing.JButton setting_Btn;
    private javax.swing.JPanel side_Panel;
    // End of variables declaration//GEN-END:variables
}
