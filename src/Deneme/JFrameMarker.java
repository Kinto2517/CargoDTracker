package Deneme;

class JFrameMarker extends javax.swing.JFrame {
    private Maps gmv=new Maps();

    public JFrameMarker() {
        initComponents();
        gmv.setSize(mapsPanel.getSize());
        mapsPanel.add(gmv);
        gmv.loadMap("C:\\Users\\User\\IdeaProjects\\CargoDTracker\\src\\Deneme\\maps.html");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mapsPanel = new javax.swing.JPanel();
        addRandomMarkersButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        markerCountTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        radiusTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        centerXTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        centerYTextField = new javax.swing.JTextField();
        removeAllMarkersButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        deleteMarkerButton = new javax.swing.JButton();
        markerLabel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        zoomLevelTextField = new javax.swing.JTextField();
        clusterMarkerCheckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        mapsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout mapsPanelLayout = new javax.swing.GroupLayout(mapsPanel);
        mapsPanel.setLayout(mapsPanelLayout);
        mapsPanelLayout.setHorizontalGroup(
                mapsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1013, Short.MAX_VALUE)
        );
        mapsPanelLayout.setVerticalGroup(
                mapsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 422, Short.MAX_VALUE)
        );

        addRandomMarkersButton.setText("Add Random Markers");
        addRandomMarkersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRandomMarkersButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Marker Count:");

        markerCountTextField.setText("10");

        jLabel2.setText("Radius:");

        radiusTextField.setText("100");
        radiusTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiusTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Center X:");

        centerXTextField.setText("40");

        jLabel4.setText("Center Y:");

        centerYTextField.setText("29");

        removeAllMarkersButton.setText("Remove All Markers");
        removeAllMarkersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllMarkersButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Marker Label:");

        deleteMarkerButton.setText("Delete Marker");
        deleteMarkerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMarkerButtonActionPerformed(evt);
            }
        });

        markerLabel.setText("1");

        jLabel6.setText("Zoom Level:");

        zoomLevelTextField.setText("15");

        clusterMarkerCheckbox.setText("Cluster Markers");
        clusterMarkerCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clusterMarkerCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(centerXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(centerYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(zoomLevelTextField)
                                        .addComponent(markerCountTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(clusterMarkerCheckbox))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addRandomMarkersButton)
                                        .addComponent(removeAllMarkersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(markerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(deleteMarkerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mapsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mapsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(centerXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(zoomLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(radiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addRandomMarkersButton)
                                        .addComponent(jLabel5)
                                        .addComponent(markerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel4)
                                                .addComponent(centerYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1)
                                                .addComponent(markerCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(clusterMarkerCheckbox))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(removeAllMarkersButton)
                                                .addComponent(deleteMarkerButton)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRandomMarkersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRandomMarkersButtonActionPerformed
        gmv.removeAllMarkers();
        gmv.centerMap(centerXTextField.getText(), centerYTextField.getText(),zoomLevelTextField.getText());
        gmv.generateRandomCoordinates(Double.parseDouble(centerXTextField.getText()), Double.parseDouble(centerYTextField.getText()),Integer.parseInt(radiusTextField.getText()), Integer.parseInt(markerCountTextField.getText()));
        gmv.createMarkers();
        gmv.addMarkersToMap();
    }//GEN-LAST:event_addRandomMarkersButtonActionPerformed

    private void removeAllMarkersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllMarkersButtonActionPerformed
        gmv.removeAllMarkers();

    }//GEN-LAST:event_removeAllMarkersButtonActionPerformed

    private void deleteMarkerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMarkerButtonActionPerformed
        gmv.removeMarker(markerLabel.getText());
    }//GEN-LAST:event_deleteMarkerButtonActionPerformed

    private void clusterMarkerCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clusterMarkerCheckboxActionPerformed
        if(clusterMarkerCheckbox.isSelected())
            gmv.clusterMarkers(true);
        else
            gmv.clusterMarkers(false);
    }//GEN-LAST:event_clusterMarkerCheckboxActionPerformed

    private void radiusTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiusTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiusTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMarker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMarker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMarker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMarker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMarker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRandomMarkersButton;
    private javax.swing.JTextField centerXTextField;
    private javax.swing.JTextField centerYTextField;
    private javax.swing.JCheckBox clusterMarkerCheckbox;
    private javax.swing.JButton deleteMarkerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel mapsPanel;
    private javax.swing.JTextField markerCountTextField;
    private javax.swing.JTextField markerLabel;
    private javax.swing.JTextField radiusTextField;
    private javax.swing.JButton removeAllMarkersButton;
    private javax.swing.JTextField zoomLevelTextField;
    // End of variables declaration//GEN-END:variables
}

