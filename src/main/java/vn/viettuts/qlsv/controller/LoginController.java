package vn.viettuts.qlsv.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import vn.viettuts.qlsv.dao.UserDao;
import vn.viettuts.qlsv.entity.User;
import vn.viettuts.qlsv.view.FilterView;
import vn.viettuts.qlsv.view.HomeView;
import vn.viettuts.qlsv.view.LoginView;
import vn.viettuts.qlsv.view.HangHoaView;

public class LoginController {
    private UserDao userDao;
    private LoginView loginView;
    public HomeView homeView;
    
//    private HangHoaView studentView;
//    private FilterView filterView;
    
    public LoginController(LoginView view) {
        this.loginView = view;
        this.userDao = new UserDao();
        view.addLoginListener(new LoginListener());
        view.addLoginKeyBtnListener(new LoginListener());
        view.addLoginListenerKey(new KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    logIn();                
                }
            }
        });
    }
    
    private void logIn(){
        User user = loginView.getUser();
        if (userDao.checkUser(user)) {
            // nếu đăng nhập thành công, mở màn hình quản lý sinh viên
            homeView = new HomeView();
            homeView.setLocationRelativeTo(loginView);
            homeView.setVisible(true);
//            studentView = new HangHoaView();
//            filterView = new FilterView();
//            StudentController studentController = new StudentController(studentView, filterView);
//            studentController.showStudentView();
//            studentView.setLocationRelativeTo(loginView);
            
            loginView.setVisible(false);
        } else {
            loginView.showMessage("Username hoặc password không đúng.");
        }
    }

    public void showLoginView() {
        loginView.setVisible(true);
    }
    
    /**
     * Lớp LoginListener 
     * chứa cài đặt cho sự kiện click button "Login"
     * 
     * @author viettuts.vn
     */
    class LoginListener implements ActionListener, KeyListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            logIn();
        }
        
        @Override
        public void keyPressed(KeyEvent e){
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                logIn();           
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
