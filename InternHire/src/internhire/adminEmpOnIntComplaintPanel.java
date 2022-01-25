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
public class adminEmpOnIntComplaintPanel extends javax.swing.JPanel {

    /**
     * Creates new form adminEmpIntComplaintPanel
     */
    
    public String employerId = "";
    public String internId = "";
    public String internshipId = "";
    public String description = "";
    public String internshipName = "";
    
    AdminHome ah;
    
//    public adminEmpOnIntComplaintPanel() {
//        initComponents();
//    }
    
    public adminEmpOnIntComplaintPanel(String employerId, String internId,String internshipId,String description,String internshipName,AdminHome ah) {
        initComponents();
        
        this.employerId = employerId;
        this.internId = internId;
        this.internshipId= internshipId;
        this.internshipName = internshipName;
        this.description = description;
        this.ah = ah;
        
        ComplaintEmployerName.setText(employerId);
        ComplaintInternName.setText(internId);
        ComplaintInternshipId.setText(internshipId);
        ComplaintInternshipName.setText(internshipName);
        
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComplaintEmployerName = new javax.swing.JLabel();
        ComplaintInternshipId = new javax.swing.JLabel();
        ComplaintInternName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ComplaintInternshipName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 87, 94));
        jLabel1.setText("Complaint On: ");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(70, 124, 134));
        jLabel3.setText("By               :");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 124, 134));
        jLabel4.setText("Internship ID:");

        ComplaintEmployerName.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        ComplaintEmployerName.setForeground(new java.awt.Color(70, 124, 134));
        ComplaintEmployerName.setText("Naveen");

        ComplaintInternshipId.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        ComplaintInternshipId.setForeground(new java.awt.Color(70, 124, 134));
        ComplaintInternshipId.setText("VCE");

        ComplaintInternName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ComplaintInternName.setForeground(new java.awt.Color(49, 87, 94));
        ComplaintInternName.setText("Santosh");

        jButton1.setBackground(new java.awt.Color(244, 139, 1));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View More");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 124, 134));
        jLabel5.setText("Internship Name:");

        ComplaintInternshipName.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        ComplaintInternshipName.setForeground(new java.awt.Color(70, 124, 134));
        ComplaintInternshipName.setText("VCE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(ComplaintInternName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComplaintEmployerName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ComplaintInternshipId, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(ComplaintInternshipName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(304, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComplaintInternName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComplaintEmployerName)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(ComplaintInternshipId))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(ComplaintInternshipName)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EmployerReportDetails erd = new EmployerReportDetails(employerId,internId,internshipId,description,internshipName,ah);
        erd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ComplaintEmployerName;
    private javax.swing.JLabel ComplaintInternName;
    private javax.swing.JLabel ComplaintInternshipId;
    private javax.swing.JLabel ComplaintInternshipName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
