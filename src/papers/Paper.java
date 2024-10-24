
package papers;

import com.formdev.flatlaf.FlatDarkLaf;


public class Paper extends javax.swing.JFrame {

    
    public Paper() {
        initComponents();
        
        Subject panel = new Subject();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(panel).setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pictureBox2 = new papers.PictureBox();
        pictureBox1 = new papers.PictureBox();
        jLabel1 = new javax.swing.JLabel();
        pictureBox3 = new papers.PictureBox();
        jLabel2 = new javax.swing.JLabel();
        pictureBox4 = new papers.PictureBox();
        pictureBox5 = new papers.PictureBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pictureBox6 = new papers.PictureBox();
        jLabel5 = new javax.swing.JLabel();
        pictureBox7 = new papers.PictureBox();
        jLabel6 = new javax.swing.JLabel();
        pictureBox8 = new papers.PictureBox();
        pictureBox9 = new papers.PictureBox();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureBox2.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/Quizzy_Bee__2_-removebg-preview.png"))); // NOI18N
        jPanel1.add(pictureBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 234, 100));

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-dashboards-20.png"))); // NOI18N
        jPanel1.add(pictureBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 80, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 80, -1));

        pictureBox3.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-paper-20 (1).png"))); // NOI18N
        jPanel1.add(pictureBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Paper");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        pictureBox4.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-quiz-20.png"))); // NOI18N
        jPanel1.add(pictureBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 80, 50));

        pictureBox5.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-score-20.png"))); // NOI18N
        jPanel1.add(pictureBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Score");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MCQ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        pictureBox6.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-feedback-20.png"))); // NOI18N
        jPanel1.add(pictureBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 70, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Feedback");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, -1, -1));

        pictureBox7.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-glyph-30.png"))); // NOI18N
        jPanel1.add(pictureBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 60, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("L.K Sachith Niromal Gunarathna");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 30, 220, 30));

        pictureBox8.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-message-40.png"))); // NOI18N
        jPanel1.add(pictureBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1690, 0, 100, 100));

        pictureBox9.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-on-30.png"))); // NOI18N
        jPanel1.add(pictureBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 0, 90, 100));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1920, 378));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1964, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1936, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1114, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        FlatDarkLaf.setup();

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private papers.PictureBox pictureBox1;
    private papers.PictureBox pictureBox2;
    private papers.PictureBox pictureBox3;
    private papers.PictureBox pictureBox4;
    private papers.PictureBox pictureBox5;
    private papers.PictureBox pictureBox6;
    private papers.PictureBox pictureBox7;
    private papers.PictureBox pictureBox8;
    private papers.PictureBox pictureBox9;
    // End of variables declaration//GEN-END:variables
}
