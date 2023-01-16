package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.view;

import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config.Database;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.controller.TodolistController;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.controller.UserController;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.helper.ClearFormHelper;

public class MainWindow extends javax.swing.JFrame {

    private final UserController userController;
    private final TodolistController todolistController;

    public MainWindow(Database database) throws SQLException {
        userController = new UserController(this, database);
        todolistController = new TodolistController(this, database);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRegisterIdx = new javax.swing.JButton();
        btnLoginIdx = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnBackRg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idRegister = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameRegister = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegisterRg = new javax.swing.JButton();
        btnClearRg = new javax.swing.JButton();
        passwordRegister = new javax.swing.JPasswordField();
        passwordRegisterVrfy = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        btnBackLg = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idLogin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLoginLg = new javax.swing.JButton();
        btnClearLg = new javax.swing.JButton();
        passwordLogin = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        btnProfileDb = new javax.swing.JButton();
        btnTodolistDb = new javax.swing.JButton();
        btnLogoutDb = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnBackPf = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        namePf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnUpdateNamePf = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnUpdatePasswordPf = new javax.swing.JButton();
        btnClearPasswordPf = new javax.swing.JButton();
        oldPasswordPf = new javax.swing.JPasswordField();
        newPasswordPf = new javax.swing.JPasswordField();
        newPasswordVrfyPf = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        btnBackTodo = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        todo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnInsertTodo = new javax.swing.JButton();
        btnUpdateTodo = new javax.swing.JButton();
        btnDeleteTodo = new javax.swing.JButton();
        btnDeleteAllTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        todoTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Todolist Application");

        btnRegisterIdx.setBackground(new java.awt.Color(0, 102, 255));
        btnRegisterIdx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegisterIdx.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterIdx.setText("Register");
        btnRegisterIdx.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegisterIdx.setBorderPainted(false);
        btnRegisterIdx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterIdxActionPerformed(evt);
            }
        });

        btnLoginIdx.setBackground(new java.awt.Color(51, 102, 255));
        btnLoginIdx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLoginIdx.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginIdx.setText("Login");
        btnLoginIdx.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLoginIdx.setBorderPainted(false);
        btnLoginIdx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginIdxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoginIdx, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegisterIdx, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(btnRegisterIdx, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnLoginIdx, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("index", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        btnBackRg.setBackground(new java.awt.Color(51, 102, 255));
        btnBackRg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBackRg.setForeground(new java.awt.Color(255, 255, 255));
        btnBackRg.setText("Back");
        btnBackRg.setBorderPainted(false);
        btnBackRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackRgActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Register");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID");

        idRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Name");

        nameRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRegisterActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Password Verify");

        btnRegisterRg.setBackground(new java.awt.Color(51, 102, 255));
        btnRegisterRg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegisterRg.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterRg.setText("Register");
        btnRegisterRg.setBorderPainted(false);
        btnRegisterRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterRgActionPerformed(evt);
            }
        });

        btnClearRg.setBackground(new java.awt.Color(51, 102, 255));
        btnClearRg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClearRg.setForeground(new java.awt.Color(255, 255, 255));
        btnClearRg.setText("Clear");
        btnClearRg.setBorderPainted(false);
        btnClearRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearRgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnBackRg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameRegister)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnRegisterRg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(btnClearRg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idRegister)
                            .addComponent(passwordRegister)
                            .addComponent(passwordRegisterVrfy))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnBackRg)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordRegisterVrfy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterRg)
                    .addComponent(btnClearRg))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("register", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        btnBackLg.setBackground(new java.awt.Color(51, 102, 255));
        btnBackLg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBackLg.setForeground(new java.awt.Color(255, 255, 255));
        btnBackLg.setText("Back");
        btnBackLg.setBorderPainted(false);
        btnBackLg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackLgActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setText("Login");

        idLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Password");

        btnLoginLg.setBackground(new java.awt.Color(51, 102, 255));
        btnLoginLg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLoginLg.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginLg.setText("Login");
        btnLoginLg.setBorderPainted(false);
        btnLoginLg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginLgActionPerformed(evt);
            }
        });

        btnClearLg.setBackground(new java.awt.Color(51, 102, 255));
        btnClearLg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClearLg.setForeground(new java.awt.Color(255, 255, 255));
        btnClearLg.setText("Clear");
        btnClearLg.setBorderPainted(false);
        btnClearLg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearLgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnBackLg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idLogin)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btnLoginLg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(77, 77, 77)
                                    .addComponent(btnClearLg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnBackLg))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel7)))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(passwordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginLg)
                    .addComponent(btnClearLg))
                .addGap(112, 112, 112))
        );

        jTabbedPane3.addTab("login", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        welcome.setText("Welcome");

        btnProfileDb.setBackground(new java.awt.Color(51, 102, 255));
        btnProfileDb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProfileDb.setForeground(new java.awt.Color(255, 255, 255));
        btnProfileDb.setText("Profile");
        btnProfileDb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProfileDb.setBorderPainted(false);
        btnProfileDb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileDbActionPerformed(evt);
            }
        });

        btnTodolistDb.setBackground(new java.awt.Color(51, 102, 255));
        btnTodolistDb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTodolistDb.setForeground(new java.awt.Color(255, 255, 255));
        btnTodolistDb.setText("Todolist");
        btnTodolistDb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTodolistDb.setBorderPainted(false);
        btnTodolistDb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodolistDbActionPerformed(evt);
            }
        });

        btnLogoutDb.setBackground(new java.awt.Color(51, 102, 255));
        btnLogoutDb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogoutDb.setForeground(new java.awt.Color(255, 255, 255));
        btnLogoutDb.setText("Logout");
        btnLogoutDb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogoutDb.setBorderPainted(false);
        btnLogoutDb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutDbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogoutDb, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProfileDb, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTodolistDb, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(welcome)
                .addGap(38, 38, 38)
                .addComponent(btnProfileDb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTodolistDb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogoutDb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jTabbedPane3.addTab("dashboard", jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        btnBackPf.setBackground(new java.awt.Color(51, 102, 255));
        btnBackPf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBackPf.setForeground(new java.awt.Color(255, 255, 255));
        btnBackPf.setText("Back");
        btnBackPf.setBorderPainted(false);
        btnBackPf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackPfActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel11.setText("Profile");

        namePf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Name");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Old Password");

        btnUpdateNamePf.setBackground(new java.awt.Color(51, 102, 255));
        btnUpdateNamePf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateNamePf.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateNamePf.setText("Update");
        btnUpdateNamePf.setBorderPainted(false);
        btnUpdateNamePf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateNamePfActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("New Password");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("New Password Verify");

        btnUpdatePasswordPf.setBackground(new java.awt.Color(51, 102, 255));
        btnUpdatePasswordPf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdatePasswordPf.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdatePasswordPf.setText("Update");
        btnUpdatePasswordPf.setBorderPainted(false);
        btnUpdatePasswordPf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePasswordPfActionPerformed(evt);
            }
        });

        btnClearPasswordPf.setBackground(new java.awt.Color(51, 102, 255));
        btnClearPasswordPf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClearPasswordPf.setForeground(new java.awt.Color(255, 255, 255));
        btnClearPasswordPf.setText("Clear");
        btnClearPasswordPf.setBorderPainted(false);
        btnClearPasswordPf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearPasswordPfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnBackPf, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel11))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateNamePf, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnUpdatePasswordPf, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(btnClearPasswordPf, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(namePf)
                            .addComponent(oldPasswordPf)
                            .addComponent(newPasswordPf)
                            .addComponent(newPasswordVrfyPf))))
                .addGap(121, 121, 121))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel11))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnBackPf)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(namePf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateNamePf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(oldPasswordPf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(newPasswordPf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(newPasswordVrfyPf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdatePasswordPf)
                    .addComponent(btnClearPasswordPf))
                .addGap(49, 49, 49))
        );

        jTabbedPane3.addTab("profile", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        btnBackTodo.setBackground(new java.awt.Color(51, 102, 255));
        btnBackTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBackTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnBackTodo.setText("Back");
        btnBackTodo.setBorderPainted(false);
        btnBackTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackTodoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel16.setText("Todolist");

        todo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Todo");

        btnInsertTodo.setBackground(new java.awt.Color(51, 102, 255));
        btnInsertTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsertTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertTodo.setText("Insert");
        btnInsertTodo.setBorderPainted(false);
        btnInsertTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertTodoActionPerformed(evt);
            }
        });

        btnUpdateTodo.setBackground(new java.awt.Color(51, 102, 255));
        btnUpdateTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateTodo.setText("Update");
        btnUpdateTodo.setBorderPainted(false);
        btnUpdateTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTodoActionPerformed(evt);
            }
        });

        btnDeleteTodo.setBackground(new java.awt.Color(51, 102, 255));
        btnDeleteTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeleteTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteTodo.setText("Delete");
        btnDeleteTodo.setBorderPainted(false);
        btnDeleteTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTodoActionPerformed(evt);
            }
        });

        btnDeleteAllTodo.setBackground(new java.awt.Color(51, 102, 255));
        btnDeleteAllTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeleteAllTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteAllTodo.setText("Delete All");
        btnDeleteAllTodo.setBorderPainted(false);
        btnDeleteAllTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllTodoActionPerformed(evt);
            }
        });

        todoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        todoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                todoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(todoTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnBackTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(todo, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnInsertTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteAllTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnBackTodo))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(todo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateTodo)
                    .addComponent(btnInsertTodo)
                    .addComponent(btnDeleteTodo)
                    .addComponent(btnDeleteAllTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane3.addTab("todolist", jPanel7);

        getContentPane().add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -32, -1, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterIdxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterIdxActionPerformed
        jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_btnRegisterIdxActionPerformed

    private void btnLoginIdxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginIdxActionPerformed
        jTabbedPane3.setSelectedIndex(2);
    }//GEN-LAST:event_btnLoginIdxActionPerformed

    private void btnBackRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackRgActionPerformed
        jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_btnBackRgActionPerformed

    private void nameRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameRegisterActionPerformed

    private void btnRegisterRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterRgActionPerformed
        if (userController.register()) {
            jTabbedPane3.setSelectedIndex(2);
        }
    }//GEN-LAST:event_btnRegisterRgActionPerformed

    private void btnClearRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearRgActionPerformed
        ClearFormHelper.clearRegister(this);
    }//GEN-LAST:event_btnClearRgActionPerformed

    private void btnBackLgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackLgActionPerformed
        jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_btnBackLgActionPerformed

    private void btnLoginLgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginLgActionPerformed
        if (userController.login()) {
            jTabbedPane3.setSelectedIndex(3);
            userController.dashboard();
        }
    }//GEN-LAST:event_btnLoginLgActionPerformed

    private void btnClearLgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearLgActionPerformed
        ClearFormHelper.clearLogin(this);
    }//GEN-LAST:event_btnClearLgActionPerformed

    private void btnProfileDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileDbActionPerformed
        jTabbedPane3.setSelectedIndex(4);
    }//GEN-LAST:event_btnProfileDbActionPerformed

    private void btnTodolistDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodolistDbActionPerformed
        todolistController.getAll();
        jTabbedPane3.setSelectedIndex(5);
    }//GEN-LAST:event_btnTodolistDbActionPerformed

    private void btnLogoutDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutDbActionPerformed
        userController.logout();
        jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_btnLogoutDbActionPerformed

    private void btnBackPfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackPfActionPerformed
        jTabbedPane3.setSelectedIndex(3);
    }//GEN-LAST:event_btnBackPfActionPerformed

    private void btnUpdateNamePfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateNamePfActionPerformed
        if (userController.updateName()) {
            userController.dashboard();
            jTabbedPane3.setSelectedIndex(3);
        }
    }//GEN-LAST:event_btnUpdateNamePfActionPerformed

    private void btnUpdatePasswordPfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePasswordPfActionPerformed
        if (userController.updatePassword()) {
            jTabbedPane3.setSelectedIndex(3);
        }
    }//GEN-LAST:event_btnUpdatePasswordPfActionPerformed

    private void btnClearPasswordPfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearPasswordPfActionPerformed
        ClearFormHelper.clearUpdatePassword(this);
    }//GEN-LAST:event_btnClearPasswordPfActionPerformed

    private void btnBackTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackTodoActionPerformed
        jTabbedPane3.setSelectedIndex(3);
    }//GEN-LAST:event_btnBackTodoActionPerformed

    private void btnInsertTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertTodoActionPerformed
        if (todolistController.insert()) {
            todolistController.getAll();
        }
    }//GEN-LAST:event_btnInsertTodoActionPerformed

    private void btnUpdateTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTodoActionPerformed
        if (todolistController.update()) {
            todolistController.getAll();
        }
    }//GEN-LAST:event_btnUpdateTodoActionPerformed

    private void btnDeleteTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTodoActionPerformed
        if (todolistController.delete()) {
            todolistController.getAll();
        }
    }//GEN-LAST:event_btnDeleteTodoActionPerformed

    private void btnDeleteAllTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllTodoActionPerformed
        todolistController.deleteAll();
        todolistController.getAll();
    }//GEN-LAST:event_btnDeleteAllTodoActionPerformed

    private void todoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todoTableMouseClicked
        idTodoSelected = (int) todoTable.getValueAt(todoTable.getSelectedRow(), 0);
        todo.setText(todoTable.getValueAt(todoTable.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_todoTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackLg;
    private javax.swing.JButton btnBackPf;
    private javax.swing.JButton btnBackRg;
    private javax.swing.JButton btnBackTodo;
    private javax.swing.JButton btnClearLg;
    private javax.swing.JButton btnClearPasswordPf;
    private javax.swing.JButton btnClearRg;
    private javax.swing.JButton btnDeleteAllTodo;
    private javax.swing.JButton btnDeleteTodo;
    private javax.swing.JButton btnInsertTodo;
    private javax.swing.JButton btnLoginIdx;
    private javax.swing.JButton btnLoginLg;
    private javax.swing.JButton btnLogoutDb;
    private javax.swing.JButton btnProfileDb;
    private javax.swing.JButton btnRegisterIdx;
    private javax.swing.JButton btnRegisterRg;
    private javax.swing.JButton btnTodolistDb;
    private javax.swing.JButton btnUpdateNamePf;
    private javax.swing.JButton btnUpdatePasswordPf;
    private javax.swing.JButton btnUpdateTodo;
    private javax.swing.JTextField idLogin;
    private javax.swing.JTextField idRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField namePf;
    private javax.swing.JTextField nameRegister;
    private javax.swing.JPasswordField newPasswordPf;
    private javax.swing.JPasswordField newPasswordVrfyPf;
    private javax.swing.JPasswordField oldPasswordPf;
    private javax.swing.JPasswordField passwordLogin;
    private javax.swing.JPasswordField passwordRegister;
    private javax.swing.JPasswordField passwordRegisterVrfy;
    private javax.swing.JTextField todo;
    private javax.swing.JTable todoTable;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
    private int idTodoSelected;

    public int getIdTodoSelected() {
        return idTodoSelected;
    }

    public void setIdTodoSelected(int idTodoSelected) {
        this.idTodoSelected = idTodoSelected;
    }
    
    
    
    public JTextField getIdLogin() {
        return idLogin;
    }

    public JTextField getIdRegister() {
        return idRegister;
    }

    public JTextField getNamePf() {
        return namePf;
    }

    public JTextField getNameRegister() {
        return nameRegister;
    }

    public JTextField getNewPasswordPf() {
        return newPasswordPf;
    }

    public JTextField getNewPasswordVrfyPf() {
        return newPasswordVrfyPf;
    }

    public JTextField getOldPasswordPf() {
        return oldPasswordPf;
    }

    public JTextField getPasswordLogin() {
        return passwordLogin;
    }

    public JTextField getPasswordRegister() {
        return passwordRegister;
    }

    public JTextField getPasswordRegisterVrfy() {
        return passwordRegisterVrfy;
    }

    public JTextField getTodo() {
        return todo;
    }

    public JTable getTodoTable() {
        return todoTable;
    }

    public JLabel getWelcome() {
        return welcome;
    }
}
