/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JDialogFileChooser.java
 *
 * Created on 8 nov. 2010, 22:46:34
 */

package gp.utils.swing.filechooser;

/**
 *
 * @author gpasquiers
 */
public class FileChooserView extends javax.swing.JDialog {

    /** Creates new form JDialogFileChooser */
    public FileChooserView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenuFiles = new javax.swing.JPopupMenu();
        jPopupMenuFiles_HiddenFilesItem = new javax.swing.JCheckBoxMenuItem();
        jPanelPathView = new gp.utils.swing.filechooser.path.PathView();
        jSplitPane = new javax.swing.JSplitPane();
        jPanelFilesView = new gp.utils.swing.filechooser.files.FilesView();
        jPanelPlacesView = new gp.utils.swing.filechooser.places.PlacesView();
        jPanelOpen = new javax.swing.JPanel();
        jPanelOpen_jButtonOpen = new javax.swing.JButton();
        jPanelOpen_jButtonCancel = new javax.swing.JButton();
        jPanelSave = new javax.swing.JPanel();
        jPanelSave_jButtonSave = new javax.swing.JButton();
        jPanelSave_jButtonCancel = new javax.swing.JButton();
        jPanelSaveName = new javax.swing.JPanel();
        jPanelSaveName_jTextFieldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPopupMenuFiles.setName("jPopupMenuFiles"); // NOI18N

        jPopupMenuFiles_HiddenFilesItem.setText("Show Hidden Files");
        jPopupMenuFiles_HiddenFilesItem.setName("jPopupMenuFiles_HiddenFilesItem"); // NOI18N
        jPopupMenuFiles.add(jPopupMenuFiles_HiddenFilesItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));

        jPanelPathView.setName("jPanelPathView"); // NOI18N

        jSplitPane.setBorder(null);
        jSplitPane.setDividerLocation(180);
        jSplitPane.setDividerSize(12);
        jSplitPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane.setName("jSplitPane"); // NOI18N

        jPanelFilesView.setName("jPanelFilesView"); // NOI18N
        jSplitPane.setRightComponent(jPanelFilesView);

        jPanelPlacesView.setName("jPanelPlacesView"); // NOI18N
        jSplitPane.setLeftComponent(jPanelPlacesView);

        jPanelOpen.setName("jPanelOpen"); // NOI18N

        jPanelOpen_jButtonOpen.setText("Open");
        jPanelOpen_jButtonOpen.setEnabled(false);
        jPanelOpen_jButtonOpen.setName("jPanelOpen_jButtonOpen"); // NOI18N
        jPanelOpen_jButtonOpen.setPreferredSize(new java.awt.Dimension(100, 23));

        jPanelOpen_jButtonCancel.setText("Cancel");
        jPanelOpen_jButtonCancel.setName("jPanelOpen_jButtonCancel"); // NOI18N
        jPanelOpen_jButtonCancel.setPreferredSize(new java.awt.Dimension(100, 23));

        javax.swing.GroupLayout jPanelOpenLayout = new javax.swing.GroupLayout(jPanelOpen);
        jPanelOpen.setLayout(jPanelOpenLayout);
        jPanelOpenLayout.setHorizontalGroup(
            jPanelOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpenLayout.createSequentialGroup()
                .addContainerGap(519, Short.MAX_VALUE)
                .addComponent(jPanelOpen_jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOpen_jButtonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelOpenLayout.setVerticalGroup(
            jPanelOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPanelOpen_jButtonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOpen_jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSave.setName("jPanelSave"); // NOI18N

        jPanelSave_jButtonSave.setText("Save");
        jPanelSave_jButtonSave.setEnabled(false);
        jPanelSave_jButtonSave.setName("jPanelSave_jButtonSave"); // NOI18N
        jPanelSave_jButtonSave.setPreferredSize(new java.awt.Dimension(100, 23));

        jPanelSave_jButtonCancel.setText("Cancel");
        jPanelSave_jButtonCancel.setName("jPanelSave_jButtonCancel"); // NOI18N
        jPanelSave_jButtonCancel.setPreferredSize(new java.awt.Dimension(100, 23));

        javax.swing.GroupLayout jPanelSaveLayout = new javax.swing.GroupLayout(jPanelSave);
        jPanelSave.setLayout(jPanelSaveLayout);
        jPanelSaveLayout.setHorizontalGroup(
            jPanelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSaveLayout.createSequentialGroup()
                .addContainerGap(519, Short.MAX_VALUE)
                .addComponent(jPanelSave_jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSave_jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelSaveLayout.setVerticalGroup(
            jPanelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPanelSave_jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelSave_jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSaveName.setName("jPanelSaveName"); // NOI18N

        jPanelSaveName_jTextFieldName.setName("jPanelSaveName_jTextFieldName"); // NOI18N

        jLabel1.setText("Name :");
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout jPanelSaveNameLayout = new javax.swing.GroupLayout(jPanelSaveName);
        jPanelSaveName.setLayout(jPanelSaveNameLayout);
        jPanelSaveNameLayout.setHorizontalGroup(
            jPanelSaveNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaveNameLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSaveName_jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE))
        );
        jPanelSaveNameLayout.setVerticalGroup(
            jPanelSaveNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaveNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jPanelSaveName_jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSplitPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addComponent(jPanelPathView, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addComponent(jPanelOpen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSaveName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSaveName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPathView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    protected gp.utils.swing.filechooser.files.FilesView jPanelFilesView;
    protected javax.swing.JPanel jPanelOpen;
    protected javax.swing.JButton jPanelOpen_jButtonCancel;
    protected javax.swing.JButton jPanelOpen_jButtonOpen;
    protected gp.utils.swing.filechooser.path.PathView jPanelPathView;
    protected gp.utils.swing.filechooser.places.PlacesView jPanelPlacesView;
    protected javax.swing.JPanel jPanelSave;
    protected javax.swing.JPanel jPanelSaveName;
    protected javax.swing.JTextField jPanelSaveName_jTextFieldName;
    protected javax.swing.JButton jPanelSave_jButtonCancel;
    protected javax.swing.JButton jPanelSave_jButtonSave;
    protected javax.swing.JPopupMenu jPopupMenuFiles;
    protected javax.swing.JCheckBoxMenuItem jPopupMenuFiles_HiddenFilesItem;
    protected javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables

}
