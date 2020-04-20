import java.sql.*;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Forget_Password.java
 *
 * Created on 5 Nov, 2015, 2:58:10 PM
 */

/**
 *
 * @author Shreyash Haritashya
 */
public class Forget_Password extends javax.swing.JFrame {

    /** Creates new form Forget_Password */
    public Forget_Password() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usname = new javax.swing.JTextField();
        phno = new javax.swing.JTextField();
        jcb1 = new javax.swing.JComboBox();
        qans = new javax.swing.JTextField();
        jp1 = new javax.swing.JPasswordField();
        jp2 = new javax.swing.JPasswordField();
        pro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Forget Password");
        setIconImage(new ImageIcon("E:\\HomoD\\Images\\unedited\\icon\\ico.png").getImage());
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton8.setBackground(new java.awt.Color(0, 0, 102));
        jButton8.setForeground(new java.awt.Color(0, 0, 153));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(980, 0, 30, 29);

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back(1).png"))); // NOI18N
        jButton1.setText("Go Back");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/top.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 100);

        jLabel2.setFont(new java.awt.Font("Georgia", 2, 48));
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Provide correct details :-");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 170, 560, 55);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel3.setText("User Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 240, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel4.setText("Phone no:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 290, 107, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel5.setText("Security Question :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 350, 201, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel6.setText("Answer :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 390, 110, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel7.setText("New Password :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 520, 172, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel8.setText("Re-Type New Password :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 560, 269, 29);

        usname.setFont(new java.awt.Font("Tahoma", 0, 18));
        getContentPane().add(usname);
        usname.setBounds(450, 240, 290, 28);

        phno.setFont(new java.awt.Font("Tahoma", 0, 18));
        getContentPane().add(phno);
        phno.setBounds(450, 290, 290, 28);

        jcb1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jcb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please select a Question ...", "My first pet name ?", "My Birthplace ?", "Bestfriend's name ?", "What I like most ?", "Place I wanna go ? " }));
        getContentPane().add(jcb1);
        jcb1.setBounds(450, 350, 290, 30);

        qans.setFont(new java.awt.Font("Tahoma", 0, 18));
        getContentPane().add(qans);
        qans.setBounds(450, 390, 290, 28);

        jp1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jp1.setEnabled(false);
        getContentPane().add(jp1);
        jp1.setBounds(460, 520, 290, 28);

        jp2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jp2.setEnabled(false);
        jp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jp2ActionPerformed(evt);
            }
        });
        getContentPane().add(jp2);
        jp2.setBounds(460, 560, 290, 28);

        pro.setFont(new java.awt.Font("Georgia", 2, 24));
        pro.setForeground(new java.awt.Color(0, 102, 255));
        pro.setText("Proceed");
        pro.setEnabled(false);
        pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proActionPerformed(evt);
            }
        });
        getContentPane().add(pro);
        pro.setBounds(620, 620, 200, 30);

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24));
        jButton2.setForeground(new java.awt.Color(51, 255, 51));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(610, 430, 200, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(200, 482, 620, 10);

        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(180, 150, 660, 560);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forgetpass.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 90, 1020, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jp2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String Usn,qan,phn,ques;
Usn=usname.getText();
qan=qans.getText();
phn=phno.getText();
ques = (String)jcb1.getSelectedItem();
String Ques=null,Qan=null,Phn=null;
 try{
        Class.forName("java.sql.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
        Statement st= c.createStatement();
        String h = "Select Phone_No,Security_question,Security_Answer from SignUp_Forms where User_Name="+"'"+ Usn+"';" ;
        ResultSet rs = st.executeQuery(h);
         while(rs.next())
         {
             Phn = rs.getString("Phone_No");
             Ques = rs.getString("Security_question");
             Qan= rs.getString("Security_Answer");
         }
         if (phn.equals(Phn)&&ques.equals(Ques)&&qan.equals(Qan))
         {
             jp1.setEnabled(true);
             jp2.setEnabled(true);
             pro.setVisible(true);
             pro.setEnabled(false);
               pro.setEnabled(true);

             
         }
         else JOptionPane.showMessageDialog(null,"Your entries are not correct,Please Enter correct Details");

 }
 catch(Exception e)
 {

 }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
pro.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proActionPerformed
String pass1,pass2;
String Usn=usname.getText();
pass1=new String(jp1.getPassword());
pass2=new String(jp2.getPassword());
if(pass1.equals(pass2))
{
    pro.setEnabled(true);
     try{
        Class.forName("java.sql.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
        Statement st= c.createStatement();

        String t = "update signup_forms set Password ="+"'"+pass1+"'"+"where User_Name ="+"'"+Usn+"';";
        st.executeUpdate(t);

        String u="update SignUp_forms set val = 1 where User_Name ='"+Usn+"';";
            st.executeUpdate(u);


       
        JOptionPane.showMessageDialog(null,"Your Password has been Updated");
        Forget_Password.this.setVisible(false);
        new Welcome_Screen().setVisible(true);
     }
     catch(Exception e)
     {

     }
}
else
{
    JOptionPane.showMessageDialog(null,"Your New Password is not Matching !!! Please type again");
    jp1.setText("");
    jp2.setText("");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_proActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Forget_Password.this.setVisible(false);
new LogIn().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);

        // TODO add your handling code here:
}//GEN-LAST:event_jButton8ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forget_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox jcb1;
    private javax.swing.JPasswordField jp1;
    private javax.swing.JPasswordField jp2;
    private javax.swing.JTextField phno;
    private javax.swing.JButton pro;
    private javax.swing.JTextField qans;
    private javax.swing.JTextField usname;
    // End of variables declaration//GEN-END:variables

}