
package com.mycompany.searchererp;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;


public class EmployeeScreen extends javax.swing.JDialog {
        
    DefaultTableModel model;
    UserOperations user = new UserOperations();
    static Signin  signin = new Signin();
    public EmployeeScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel) employess.getModel();
        showEmployees();
    }

   

   private void showEmployees(){
      model.setRowCount(0);
       ArrayList<Employees> empList = new ArrayList<Employees>();
       empList  = user.getEmployees();
       
       
       if (empList !=null) {
           
           for (Employees employees : empList) {
               Object[] added = {employees.getId(),employees.getName(),employees.getSurName(),employees.getPosition(),employees.getPhone(),employees.getSalary()};
               
               model.addRow(added);
           }
           
       }
     
       
   
   }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        employess = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameArea = new javax.swing.JTextField();
        surnameArea = new javax.swing.JTextField();
        phoneArea = new javax.swing.JTextField();
        posotionArea = new javax.swing.JTextField();
        salaryArea = new javax.swing.JTextField();
        messages = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        employess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Phone", "Position", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employessMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employess);
        if (employess.getColumnModel().getColumnCount() > 0) {
            employess.getColumnModel().getColumn(0).setResizable(false);
            employess.getColumnModel().getColumn(1).setResizable(false);
            employess.getColumnModel().getColumn(2).setResizable(false);
            employess.getColumnModel().getColumn(3).setResizable(false);
            employess.getColumnModel().getColumn(4).setResizable(false);
            employess.getColumnModel().getColumn(5).setResizable(false);
        }

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Surname");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Phone");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Salary");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Position");

        messages.setBackground(new java.awt.Color(255, 51, 51));
        messages.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        messages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(nameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(surnameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phoneArea, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(posotionArea, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(142, 142, 142)))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salaryArea, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(messages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posotionArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(salaryArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(surnameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(messages, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
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
        employess.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));//girilen string deyerleri yoxlayir
    
    }
    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
            String sr = search.getText();
            dynamicSearch(sr);
        
    }//GEN-LAST:event_searchKeyReleased

    private void employessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employessMouseClicked
      int selectedRow = employess.getSelectedRow(); 
      nameArea.setText(model.getValueAt(selectedRow,1).toString());      
      surnameArea.setText(model.getValueAt(selectedRow,2).toString());
      phoneArea.setText(model.getValueAt(selectedRow,3).toString());
      posotionArea.setText(model.getValueAt(selectedRow,4).toString());
      salaryArea.setText(model.getValueAt(selectedRow,5).toString());


      
    }//GEN-LAST:event_employessMouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        messages.setText("");
        double salary = Double. valueOf(salaryArea.getText());
        user.addEmployee(nameArea.getText(),surnameArea.getText(),phoneArea.getText(),posotionArea.getText(),salary);
        showEmployees();
        messages.setText("NEW USER ADDED!");
        JOptionPane.showMessageDialog(this, messages.getText());
        nameArea.setText("");
        surnameArea.setText("");
        phoneArea.setText("");
        posotionArea.setText("");
        salaryArea.setText("");

    }//GEN-LAST:event_saveButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
         messages.setText("");
        double salary = Double. valueOf(salaryArea.getText());
        int selectedRow = employess.getSelectedRow();
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
            user.employeeUpdate(id,nameArea.getText(),surnameArea.getText(),phoneArea.getText(),posotionArea.getText(),salary);
        
        }
          JOptionPane.showMessageDialog(this, messages.getText());
        //user.addEmployee(nameArea.getText(),surnameArea.getText(),phoneArea.getText(),posotionArea.getText(),salary);
        showEmployees();
        messages.setText("Edit Succesful!");
        JOptionPane.showMessageDialog(this, messages.getText());
        nameArea.setText("");
        surnameArea.setText("");
        phoneArea.setText("");
        posotionArea.setText("");
        salaryArea.setText("");
        
        
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
            
          messages.setText("");
        double salary = Double. valueOf(salaryArea.getText());
        int selectedRow = employess.getSelectedRow();
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
            user.employeeDelete(id);
        
        }
          
        //user.addEmployee(nameArea.getText(),surnameArea.getText(),phoneArea.getText(),posotionArea.getText(),salary);
        showEmployees();
        messages.setText("Delete Succesful!");
        JOptionPane.showMessageDialog(this, messages.getText());
        nameArea.setText("");
        surnameArea.setText("");
        phoneArea.setText("");
        posotionArea.setText("");
        salaryArea.setText("");
    }//GEN-LAST:event_deleteButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmployeeScreen dialog = new EmployeeScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public  void windowClosing(java.awt.event.WindowEvent e) {
                        
                         System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTable employess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel messages;
    private javax.swing.JTextField nameArea;
    private javax.swing.JTextField phoneArea;
    private javax.swing.JTextField posotionArea;
    private javax.swing.JTextField salaryArea;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField search;
    private javax.swing.JTextField surnameArea;
    // End of variables declaration//GEN-END:variables
}
