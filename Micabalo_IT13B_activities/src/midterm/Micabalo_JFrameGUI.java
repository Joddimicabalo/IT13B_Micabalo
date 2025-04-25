
package midterm;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Micabalo_JFrameGUI extends javax.swing.JFrame {

    
    public Micabalo_JFrameGUI() {
        initComponents();
        setBounds(600, 300, 400, 250);
        setVisible(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelusername = new javax.swing.JLabel();
        jTextFieldusername = new javax.swing.JTextField();
        jLabelpassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonlogin = new javax.swing.JButton();
        jButtoncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 2));

        jLabelusername.setText("Username:");
        getContentPane().add(jLabelusername);
        getContentPane().add(jTextFieldusername);

        jLabelpassword.setText("Password:");
        getContentPane().add(jLabelpassword);
        getContentPane().add(jPasswordField);

        jButtonlogin.setText("LOGIN");
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlogin);

        jButtoncancel.setText("CANCEL");
        jButtoncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtoncancel);

        pack();
    }// </editor-fold>

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {
            String username = jTextFieldusername.getText();
            String password = new String (jPasswordField.getPassword());
            
            credits (username, password);
            
            JOptionPane.showMessageDialog(this, "Account Save Successfully",  "Save",JOptionPane.INFORMATION_MESSAGE );
    }

    private void credits ( String username,String password ){
        try {
        File file = new File("C:\\Users\\Jayboy\\Desktop\\java programs\\Micabalo_JFrame.txt");

        BufferedWriter data = new BufferedWriter( new FileWriter( file, true));
        data.write(username + "," + password);
        data.newLine();
        data.close();

        }catch (IOException e){
               JOptionPane.showMessageDialog(this, "Error Saving Account",  "Error",JOptionPane.ERROR_MESSAGE );
        }
    }
    
    private void jButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {
       jTextFieldusername.setText("");
       jPasswordField.setText("");
    }

    
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Micabalo_JFrameGUI().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton jButtoncancel;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldusername;
    
}