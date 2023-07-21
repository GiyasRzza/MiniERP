
package com.mycompany.searchererp;

import com.mysql.cj.util.DnsSrv;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ProductsScreen extends javax.swing.JFrame {
    DefaultTableModel model;
    UserOperations user = new UserOperations();
    static Signin  signin = new Signin();
    String addedUser = signin.getName();
 
    public ProductsScreen() {
        initComponents();
    }


        public void showProducts(){
            
             model.setRowCount(0);
       ArrayList<Products> productsList = new ArrayList<Products>();
       productsList  = user.getProducts();
       
       if (productsList !=null) {
           
           for (Products products : productsList) {
               Object[] added = {products.getPrId(),products.getPrPrice(),products.getPrCategory(),products.getAddedUser()};
               model.addRow(added);
           }
           
        }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        products = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameArea = new javax.swing.JTextField();
        priceArea = new javax.swing.JTextField();
        categoryArea = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        messages = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });

        products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Category", "Added User"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(products);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Price");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Category");

        saveButton.setBackground(new java.awt.Color(102, 255, 51));
        saveButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        saveButton.setText("Save!");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(255, 255, 0));
        editButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        editButton.setText("Edit!");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        deleteButton.setText("Delete!");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        messages.setBackground(new java.awt.Color(255, 51, 51));
        messages.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        messages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameArea, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceArea, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoryArea, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(messages, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       public  void dynamicSearch(String search){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        products.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));//girilen string deyerleri yoxlayir
    
    }
    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
        String sr = search1.getText();
        dynamicSearch(sr);

    }//GEN-LAST:event_search1KeyReleased

    private void productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseClicked
        int selectedRow = products.getSelectedRow();
        nameArea.setText(model.getValueAt(selectedRow,1).toString());
        priceArea.setText(model.getValueAt(selectedRow,2).toString());
        categoryArea.setText(model.getValueAt(selectedRow,3).toString());
    }//GEN-LAST:event_productsMouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        messages.setText("");
        double price = Double. valueOf(priceArea.getText());
        user.addProducts(nameArea.getText(),price,categoryArea.getText(),addedUser);
        showProducts();
        messages.setText("NEW Product ADDED!");
        JOptionPane.showMessageDialog(this, messages);
        nameArea.setText("");
        priceArea.setText("");
        categoryArea.setText("");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        messages.setText("");
        double price = Double. valueOf(priceArea.getText());
        int selectedRow = products.getSelectedRow();
        if (selectedRow==-1) {
            if (model.getRowCount()==-0) {
                messages.setText("Table empty!");
            }
            else{

                messages.setText("Update column not found!");
            }
        }
        else{

            int id = (int) model.getValueAt(selectedRow, 0);
            user.productUpdate(id,nameArea.getText(),price,categoryArea.getText(),addedUser);

        }
        JOptionPane.showMessageDialog(this, messages.getText());
        //user.addEmployee(nameArea.getText(),surnameArea.getText(),phoneArea.getText(),posotionArea.getText(),salary);
        showProducts();
        messages.setText("Edit Succesful!");
        JOptionPane.showMessageDialog(this, messages.getText());
        nameArea.setText("");
        priceArea.setText("");
        categoryArea.setText("");
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        messages.setText("");
        double price = Double. valueOf(priceArea.getText());
        int selectedRow = products.getSelectedRow();
        if (selectedRow==-1) {
            if (model.getRowCount()==-0) {
                messages.setText("Table empty!");
            }
            else{

                messages.setText("Delete column not found!");
            }
        }
        else{

            int id = (int) model.getValueAt(selectedRow, 0);
            user.productDelefe(id);

        }

        //user.addEmployee(nameArea.getText(),surnameArea.getText(),phoneArea.getText(),posotionArea.getText(),salary);
        showProducts();
        messages.setText("Delete Succesful!");
        JOptionPane.showMessageDialog(this, messages.getText());
        nameArea.setText("");
        priceArea.setText("");
        categoryArea.setText("");
    }//GEN-LAST:event_deleteButtonActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(() -> {
            new ProductsScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categoryArea;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messages;
    private javax.swing.JTextField nameArea;
    private javax.swing.JTextField priceArea;
    private javax.swing.JTable products;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField search1;
    // End of variables declaration//GEN-END:variables
}
