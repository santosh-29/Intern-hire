/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internhire;

import java.awt.Color;

/**
 *
 * @author INDIA
 */
public class ApplicationStatusPanel extends javax.swing.JPanel {
    public String internshipId = "";
        public String internshipName = "";
        public String stipend = "";
        public String organisation = "";
        public String period = "";
        public String category = "";
        public String status = "";
        public int id = 0;
    /**
     * Creates new form ApplicationStatusPanel
     */
    public ApplicationStatusPanel() {
        initComponents();
    }
    
    public ApplicationStatusPanel(String internshipId,String internshipName,String period, String stipend,String category,String organisation,String status) {
        initComponents();
        this.internshipId = internshipId;
        this.internshipName = internshipName;
        this.stipend = stipend;
        this.organisation = organisation;
        this.period = period;
        this.status = status;
        this.category = category;
        id = 101;
        
        internshipNameValue.setText(this.internshipName);
        internStipend.setText(this.stipend);
        internOrganisation.setText(this.organisation);
        internDuration.setText(this.period);
        internCategory.setText(this.category);
        
        if(status.equals("SELECTED"))
        {
            internStatus.setText("SELECTED");
            internStatus.setForeground(Color.green);
        }
        else if(status.equals("COMPLETED"))
        {
            internStatus.setText("COMPLETED");
            internStatus.setForeground(Color.blue);
        }
        else if(status.equals("PENDING"))
        {
            internStatus.setText("PENDING");
            internStatus.setForeground(Color.yellow);
        }
        else if(status.equals("REJECTED"))
        {
            internStatus.setText("REJECTED");
            internStatus.setForeground(Color.red);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internshipNameValue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        viewMoreButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        internStatus = new javax.swing.JLabel();
        internDuration = new javax.swing.JLabel();
        internCategory = new javax.swing.JLabel();
        internStipend = new javax.swing.JLabel();
        internOrganisation = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(778, 146));

        internshipNameValue.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        internshipNameValue.setForeground(new java.awt.Color(49, 87, 94));
        internshipNameValue.setText("Internship Name:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(70, 124, 134));
        jLabel2.setText("Stipend        :");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(70, 124, 134));
        jLabel3.setText("Duration      :");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 124, 134));
        jLabel4.setText("Location       :");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 124, 134));
        jLabel5.setText("Category     :");

        viewMoreButton.setBackground(new java.awt.Color(244, 139, 1));
        viewMoreButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        viewMoreButton.setForeground(new java.awt.Color(255, 255, 255));
        viewMoreButton.setText("View More");
        viewMoreButton.setBorder(null);
        viewMoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMoreButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 87, 94));
        jLabel1.setText("APPLICATION STATUS       :");

        internStatus.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        internStatus.setForeground(new java.awt.Color(51, 153, 0));
        internStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        internStatus.setText("SELECTED");
        internStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        internDuration.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        internDuration.setForeground(new java.awt.Color(70, 124, 134));
        internDuration.setText("Duration ");

        internCategory.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        internCategory.setForeground(new java.awt.Color(70, 124, 134));
        internCategory.setText("Category      ");

        internStipend.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        internStipend.setForeground(new java.awt.Color(70, 124, 134));
        internStipend.setText("Stipend");

        internOrganisation.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        internOrganisation.setForeground(new java.awt.Color(70, 124, 134));
        internOrganisation.setText("Location");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(internStipend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(internOrganisation, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(internDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(internCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(viewMoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(internshipNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(internStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(internshipNameValue)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(internStatus)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(internCategory)
                            .addComponent(jLabel2)
                            .addComponent(internStipend))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(internOrganisation))
                            .addComponent(internDuration)))
                    .addComponent(viewMoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewMoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMoreButtonActionPerformed
        // TODO add your handling code here:
        ApplicationStatus status = new ApplicationStatus();
        status.setStatusValues(this.internshipId,this.status);
        status.setVisible(true);
    }//GEN-LAST:event_viewMoreButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel internCategory;
    private javax.swing.JLabel internDuration;
    private javax.swing.JLabel internOrganisation;
    private javax.swing.JLabel internStatus;
    private javax.swing.JLabel internStipend;
    private javax.swing.JLabel internshipNameValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton viewMoreButton;
    // End of variables declaration//GEN-END:variables
}