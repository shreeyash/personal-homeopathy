import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Clinic.java
 *
 * Created on 5 Nov, 2015, 6:31:58 PM
 */

/**
 *
 * @author Shreyash Haritashya
 */
public class Clinic extends javax.swing.JFrame {

    /** Creates new form Clinic */
    public Clinic() {
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

        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jc1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("My Clinic");
        setIconImage(new ImageIcon("E:\\HomoD\\Images\\unedited\\icon\\ico.png").getImage());
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 130, 30);

        jButton7.setBackground(new java.awt.Color(0, 0, 102));
        jButton7.setForeground(new java.awt.Color(0, 0, 153));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(990, 0, 30, 29);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/top.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 1024, 90);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 24));
        jLabel1.setText("Please Select Your Problem -");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 90, 370, 40);

        jc1.setFont(new java.awt.Font("Georgia", 0, 18));
        getContentPane().add(jc1);
        jc1.setBounds(20, 130, 420, 30);

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 24));
        jLabel2.setText("Your Presciption -");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 200, 240, 30);

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Power", "Tablets Quantity"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 230, 640, 490);

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear-icon.png"))); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(670, 610, 200, 30);

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/go.jpg"))); // NOI18N
        jButton3.setText("Go");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 130, 110, 30);

        jButton5.setBackground(new java.awt.Color(0, 153, 0));
        jButton5.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton5.setText("Save Presciption ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(670, 680, 270, 30);

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 20));
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Happy to Help You !!");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(700, 480, 250, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doct.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(700, 210, 260, 270);
        getContentPane().add(jl1);
        jl1.setBounds(720, 90, 70, 60);

        jl2.setFont(new java.awt.Font("Georgia", 2, 18));
        jl2.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(jl2);
        jl2.setBounds(790, 90, 230, 60);

        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(720, 90, 300, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminBk.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 90, 1020, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Clinic.this.setVisible(false);
        new StartUp().setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed
int j;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 String prob;
        DefaultTableModel m = (DefaultTableModel)tb1.getModel();
        prob = (String)jc1.getSelectedItem();

       int n = m.getRowCount();


           if(n>0)
           {


                 for(int k=0;k<n;k++)
                 {
                 m.removeRow(0);
                 }
              n=0;
               try{
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
            Statement st= c.createStatement();
            String q = "Select medicine,power,quantity from medi where prob_name = '"+prob+"' ;";
            ResultSet rs = st.executeQuery(q);
            while(rs.next()) {

                String Mname = rs.getString("medicine");
                String Pw = rs.getString("power");
                String Qu = rs.getString("quantity");
                m.addRow(new Object[]
                {
                    Mname,Pw,Qu
                });
                j=1;
            }
        } catch (Exception e) {

        }

           }
           else if(n==0)
           {
        try{
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
            Statement st= c.createStatement();
            String q = "Select medicine,power,quantity from medi where prob_name = '"+prob+"' ;";
            ResultSet rs = st.executeQuery(q);
            while(rs.next()) {

                String Mname = rs.getString("medicine");
                String Pw = rs.getString("power");
                String Qu = rs.getString("quantity");
                m.addRow(new Object[]
                {
                    Mname,Pw,Qu
                });
                j=1;
            }
        } catch (Exception e) {

        }
           }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
String Fname = null,Lname = null,img = null,gen=null,gen1,M;
        try{
        Class.forName("java.sql.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
        Statement st= c.createStatement();
        String q = "Select First_Name,Last_Name,image,Gender from signup_forms where val =1;";
        ResultSet rs = st.executeQuery(q);
        while(rs.next())
        {
            Fname=rs.getString("First_Name");
            Lname=rs.getString("Last_Name");
            img=rs.getString("image");

        }

        ImageIcon icon= new ImageIcon(img);
        Image im = icon.getImage();
        Image myImg = im.getScaledInstance(jl1.getWidth(), jl1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(myImg);
        jl1.setIcon(newImage);
        jl2.setText(" "+Fname+" "+Lname);
        }
        catch (Exception e)
        {

        }

String t,r=null ;

        try{
        Class.forName("java.sql.Driver");
        Connection w = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
        Statement st= w.createStatement();
         String q = "Select prob_name from medi;";
        ResultSet rs = st.executeQuery(q);
        while(rs.next())
        {
           t = rs.getString(1);
          if(t.equals(r))
          {
            t = null;
          }
           else { jc1.addItem(t);  r = t ;}
        }
}
catch(Exception z)
{

}
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
DefaultTableModel m = (DefaultTableModel)tb1.getModel();
int n = m.getRowCount();
for(int i=0;i<n;i++)
{
    m.removeRow(0);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String k = null,usname = null;
        String prob = (String)jc1.getSelectedItem();


        try
        {

        Class.forName("java.sql.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
        Statement st= c.createStatement();



        String d = "Select curtime(),curdate();";
        ResultSet rs = st.executeQuery(d);
        while(rs.next())
        {
            String a = rs.getString("curtime()");
            String b = rs.getString("curdate()");
            k = b+"/"+a;
        }



        String h = "Select User_Name from signup_forms where val = 1; ";
        ResultSet zx = st.executeQuery(h);
        while(zx.next())
        {
            usname=zx.getString("User_Name");
        }



        String q = "Select medicine,power,quantity from medi where prob_name = '"+prob+"' ;";
        ResultSet ps = st.executeQuery(q);
        while(ps.next())
        {

           String Mname = ps.getString("medicine");
           String Pw = ps.getString("power");
           String Qu = ps.getString("quantity");
            try
               {

                        Class.forName("java.sql.Driver");
                        Connection f = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
                        Statement dt= f.createStatement();



                         String ll = "insert into prescription values ('"+usname+"','"+prob+"','"+Mname+"','"+Pw+"','"+Qu+"','"+k+"');";
                         dt.executeUpdate(ll);

                }


                catch(Exception o)
                {
                  System.out.println(o);
                }



        }

        JOptionPane.showMessageDialog(null,"Your prescription has been saved , Go TO My Prescription to Check It");
        Clinic.this.setVisible(false);
        new StartUp().setVisible(true);

        }


 catch(Exception e)
        {
          System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
            Statement st= c.createStatement();
            String u="update SignUp_forms set val = 0 where val =1;";
            st.executeUpdate(u);
        } catch(Exception e) {

        }

        System.exit(0);

        // TODO add your handling code here:
}//GEN-LAST:event_jButton7ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clinic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox jc1;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables

}