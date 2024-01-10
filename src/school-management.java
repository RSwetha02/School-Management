import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.sql.*; 
import java.awt.EventQueue; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.sql.Connection; 
import java.sql.Driver; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.Statement; 
import javax.swing.JFrame; 
import javax.swing.JButton; 
import javax.swing.JLabel; 
import javax.swing.JComboBox; 
import javax.swing.JRadioButton; 
import javax.swing.JTextArea; 
import javax.swing.JTextField; 
import javax.swing.JTabbedPane; 
import javax.swing.JOptionPane;
import java.awt.Font; 
import java.awt.Dimension; 
import java.awt.Color;  
public class pro 
{ 
private JFrame frame; 
public static void main(String[] args) { 
EventQueue.invokeLater(new Runnable() { 
public void run(){ 
try 
{ pro window=new pro(); 
window.frame.setVisible(true);} 
catch(Exception e) 
{e.printStackTrace();}} 
}); 
} 
public pro() 
{ 
initialize(); 
} 
public void initialize()
{ 
JFrame frame=new JFrame("SCHOOL MANAGEMENT"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); Toolkit tk=Toolkit.getDefaultToolkit();//size 
Dimension screensize=tk.getScreenSize(); 
frame.setSize(screensize.width/2,screensize.height/2); Container pane=frame.getContentPane();//container for frame pane.setLayout(null); 
pane.setBackground(Color.BLACK); 
frame.setVisible(true); 
JLabel topic = new JLabel("XYZ MATRICULATION HR. SEC. SCHOOL"); topic.setBounds(300,10,1000,100); 
topic.setFont(new Font("Times New Roman",Font.BOLD,40)); topic.setForeground(Color.white); 
pane.add(topic); 
JTabbedPane tabs=new JTabbedPane();// adding panel to tabbed pane tabs.setBounds(20,100,1330,600); 
pane.add(tabs); 
JPanel p1=new JPanel(); 
tabs.addTab("Home",null,p1,null); 
p1.setLayout(null); 
JPanel p2=new JPanel(); 
tabs.addTab("Admin",null,p2,null);
p2.setLayout(null); 
JPanel p3=new JPanel(); 
tabs.addTab("Staff",null,p3,null); 
p3.setLayout(null); 
JPanel p4=new JPanel(); 
tabs.addTab("Student",null,p4,null); 
p4.setLayout(null); 
JPanel p5=new JPanel(); 
tabs.addTab("About Us",null,p5,null); 
p5.setLayout(null); 
JPanel p6=new JPanel(); 
tabs.addTab("Contact Us",null,p6,null); 
p6.setLayout(null); 
p1.setBackground(Color.white); 
JLabel title=new JLabel(" WELCOME TO OUR WEBSITE"); title.setFont(new Font("verdana",Font.ITALIC|Font.BOLD,25)); title.setForeground(Color.black); 
title.setBounds(450,0,1000,30); 
p1.add(title); 
JLabel admit=new JLabel(" ADMISSIONS OPEN"); admit.setFont(new Font("verdana",Font.ITALIC|Font.BOLD,25)); admit.setForeground(Color.MAGENTA); 
admit.setBounds(150,190,1000,30);
p1.add(admit); 
JLabel pic2=new JLabel(); 
pic2.setIcon(new ImageIcon("school.jpeg")); 
pic2.setBounds(600,125,800,500); 
p1.add(pic2); 
JLabel picH=new JLabel(); 
picH.setIcon(new ImageIcon("hmeimg.jpeg")); 
picH.setBounds(0,250,564,350); 
p1.add(picH); 
JLabel homecontent=new JLabel("PREPARE YOUR STUDENTS TO THE WORLD"); homecontent.setFont(new Font("verdana",Font.ITALIC|Font.BOLD,30)); homecontent.setForeground(Color.blue); 
homecontent.setBounds(300,60,1000,30); 
p1.add(homecontent); 
// tab 2 content 
p2.setBackground(Color.white); 
JTabbedPane admintabs=new JTabbedPane(); 
admintabs.setBounds(40,10,1250,550); 
p2.add(admintabs); 
JPanel p2a=new JPanel(); 
admintabs.addTab("Login",null,p2a,null); 
p2a.setLayout(null); 
p2a.setBackground(Color.pink);
JPanel p2b=new JPanel(); 
admintabs.addTab("Staff",null,p2b,null); 
p2b.setLayout(null); 
p2b.setBackground(Color.pink); 
JPanel p2c=new JPanel(); 
admintabs.addTab("Student",null,p2c,null); 
p2c.setLayout(null); 
p2c.setBackground(Color.pink); 
admintabs.setEnabledAt(1,false); 
admintabs.setEnabledAt(2,false);  
JLabel title2=new JLabel("ADMIN LOGIN"); 
title2.setFont(new Font("Times New Roman",Font.BOLD,30)); title2.setForeground(Color.black); 
title2.setBounds(500,80,250,30); 
p2a.add(title2); 
JLabel admin_id=new JLabel("USER ID:"); 
admin_id.setFont(new Font("Times New Roman",Font.BOLD,30)); admin_id.setForeground(Color.blue); 
admin_id.setBounds(400,160,180,30); 
p2a.add(admin_id); 
JTextField admin_t1=new JTextField(); 
admin_t1.setBounds(650,160,170,30); 
admin_t1.setColumns(100);
p2a.add(admin_t1); 
JLabel admin_pswd=new JLabel("PASSWORD:"); 
admin_pswd.setFont(new Font("Times New Roman",Font.BOLD,30)); admin_pswd.setForeground(Color.blue); 
admin_pswd.setBounds(400,260,180,30); 
p2a.add(admin_pswd); 
JTextField admin_t2=new JTextField(); 
admin_t2.setBounds(650,260,170,30); 
admin_t2.setColumns(100); 
p2a.add(admin_t2); 
JButton admin_login= new JButton("Login"); 
admin_login.setBounds(500,340,180,30); 
p2a.add(admin_login); 
admin_login.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent ae){ 
String aid=admin_t1.getText(); 
String apswd=admin_t2.getText(); 
try 
{ 
if(aid.equals("admin@gmail.com") && apswd.equals("12345")) { 
JOptionPane.showMessageDialog(frame,"Successfully logged in"); admintabs.setEnabledAt(1,true);
admintabs.setEnabledAt(2,true); 
JLabel footer=new JLabel("Successfully logged in. Now you are allowed to  access other tabs"); 
footer.setFont(new Font("Times New Roman",Font.ITALIC|Font.BOLD,30)); footer.setForeground(Color.black); 
footer.setBounds(220,420,1200,30); 
p2a.add(footer); 
} 
else 
JOptionPane.showMessageDialog(frame,"Invalid"); 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
} 
}}); 
JLabel ATtitle3a=new JLabel("STAFF DETAILS"); 
ATtitle3a.setFont(new Font("Times New Roman",Font.ITALIC|Font.BOLD,30)); ATtitle3a.setForeground(Color.white); 
ATtitle3a.setBounds(420,8,500,40); 
p2b.add(ATtitle3a); 
JLabel ATl1=new JLabel("STAFF ID:"); 
ATl1.setFont(new Font("Times New Roman",Font.BOLD,20)); ATl1.setForeground(Color.black);
ATl1.setBounds(20,50,300,30); 
p2b.add(ATl1); 
JTextField ATt1=new JTextField(); 
ATt1.setBounds(160,50,200,30); 
ATt1.setColumns(100); 
p2b.add(ATt1); 
JLabel ATl2=new JLabel("NAME:"); 
ATl2.setFont(new Font("Times New Roman",Font.BOLD,20)); ATl2.setForeground(Color.black); 
ATl2.setBounds(20,90,300,30); 
p2b.add(ATl2); 
JTextField ATt2=new JTextField(); 
ATt2.setBounds(160,90,200,30); 
ATt2.setColumns(100); 
p2b.add(ATt2); 
JLabel ATl3=new JLabel("DOB:"); 
ATl3.setFont(new Font("Times New Roman",Font.BOLD,20)); ATl3.setForeground(Color.black); 
ATl3.setBounds(20,130,300,30); 
p2b.add(ATl3); 
JTextField ATt3=new JTextField(); 
ATt3.setBounds(160,130,200,30); 
ATt3.setColumns(100);
p2b.add(ATt3); 
JLabel ATl4=new JLabel("GENDER:"); 
ATl4.setFont(new Font("Times New Roman",Font.BOLD,20)); ATl4.setForeground(Color.black); 
ATl4.setBounds(20,170,300,30); 
p2b.add(ATl4); 
ButtonGroup ATbg =new ButtonGroup(); 
JRadioButton ATr1=new JRadioButton("MALE"); JRadioButton ATr2=new JRadioButton("FEMALE"); ATbg.add(ATr1);ATbg.add(ATr2); 
ATr1.setFont(new Font("Times New Roman",Font.BOLD,15)); ATr1.setForeground(Color.black); 
ATr1.setBounds(160,170,200,30); 
ATr2.setFont(new Font("Times New Roman",Font.BOLD,15)); ATr2.setForeground(Color.black); 
ATr2.setBounds(160,190,200,30); 
p2b.add(ATr1);p2b.add(ATr2); 
JLabel ATl5=new JLabel("EMAIL:"); 
ATl5.setFont(new Font("Times New Roman",Font.BOLD,20)); ATl5.setForeground(Color.black); 
ATl5.setBounds(20,230,300,30); 
p2b.add(ATl5); 
JTextField ATt5=new JTextField();
ATt5.setBounds(160,230,200,30); 
ATt5.setColumns(100); 
p2b.add(ATt5); 
JLabel ATl6=new JLabel("ADDRESS:"); 
ATl6.setFont(new Font("Times New Roman",Font.BOLD,20)); ATl6.setForeground(Color.black); 
ATl6.setBounds(20,270,300,30); 
p2b.add(ATl6); 
JTextArea ATt6=new JTextArea(); 
ATt6.setBounds(160,270,200,50); 
p2b.add(ATt6); 
JLabel ATl7=new JLabel("CONTACT :"); 
ATl7.setFont(new Font("Times New Roman",Font.BOLD,20)); ATl7.setForeground(Color.black); 
ATl7.setBounds(20,330,300,30); 
p2b.add(ATl7); 
JTextField ATt7=new JTextField(); 
ATt7.setBounds(160,330,200,30); 
ATt7.setColumns(100); 
p2b.add(ATt7); 
JLabel ATl8=new JLabel("HANDLING SUBJECTS :"); ATl8.setFont(new Font("Times New Roman",Font.BOLD,20)); ATl8.setForeground(Color.black);
ATl8.setBounds(20,370,300,30); 
p2b.add(ATl8); 
JCheckBox ch8a = new JCheckBox("ENGLISH"); 
ch8a.setBounds(20,410,100,20);p2b.add(ch8a); 
JCheckBox ch8b = new JCheckBox("TAMIL"); 
ch8b.setBounds(140,410,100,20);p2b.add(ch8b); 
JCheckBox ch8c = new JCheckBox("MATHS"); 
ch8c.setBounds(20,450,100,20);p2b.add(ch8c); 
JCheckBox ch8d = new JCheckBox("SCIENCE"); 
ch8d.setBounds(140,450,100,20);p2b.add(ch8d); 
JCheckBox ch8e = new JCheckBox("SOCIAL"); 
ch8e.setBounds(260,450,100,20);p2b.add(ch8e); 
JLabel ATl9=new JLabel("CLASS :"); 
ATl9.setFont(new Font("Times New Roman",Font.BOLD,20)); ATl9.setForeground(Color.black); 
ATl9.setBounds(20,480,300,30); 
p2b.add(ATl9); 
String  
ATclasses[]={"Pre.K.G","L.K.G","1","2","3","4","5","6","7","8","9","10","Nil"}; JComboBox ATc9=new JComboBox(ATclasses); 
ATc9.setBounds(160,480,200,30); 
p2b.add(ATc9); 
JLabel ATDLabel=new JLabel("For View, Update and Delete, search using ID"); ATDLabel.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,30));
ATDLabel.setForeground(Color.blue); 
ATDLabel.setBounds(570,55,800,30); 
p2b.add(ATDLabel); 
JLabel ATDfunc_id=new JLabel("Enter Id:"); 
ATDfunc_id.setFont(new Font("Times New Roman",Font.ITALIC,25)); ATDfunc_id.setForeground(Color.gray); 
ATDfunc_id.setBounds(570,100,100,30); 
p2b.add(ATDfunc_id); 
JTextField ATdfunc_id=new JTextField(); 
ATdfunc_id.setBounds(680,100,100,30); 
ATdfunc_id.setColumns(60); 
p2b.add(ATdfunc_id); 
JButton ATaddstaff= new JButton("ADD"); 
ATaddstaff.setBounds(570,150,200,30); 
p2b.add(ATaddstaff); 
JButton ATviewstaff= new JButton("VIEW"); 
ATviewstaff.setBounds(570,200,200,30); 
p2b.add(ATviewstaff); 
JButton ATupdatestaff= new JButton("UPDATE"); 
ATupdatestaff.setBounds(570,250,200,30); 
p2b.add(ATupdatestaff); 
JButton ATdeletestaff= new JButton("DELETE"); 
ATdeletestaff.setBounds(570,300,200,30);
p2b.add(ATdeletestaff); 
JTextArea ATSDV=new JTextArea(); 
ATSDV.setBounds(820,95,370,420); 
ATSDV.setFont(new Font("Times New Roman",Font.ITALIC|Font.BOLD,20)); p2b.add(ATSDV); 
JButton ATsavebtn= new JButton("SAVE CHANGES"); 
ATsavebtn.setBounds(570,350,200,30); 
p2b.add(ATsavebtn); 
JButton ATref = new JButton("REFRESH"); 
ATref.setBounds(570,400,200,30); 
p2b.add(ATref); 
ATref.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
ATt1.setEnabled(true);ATt2.setEnabled(true);ATt3.setEnabled(true);ATt5.setEn abled(true); 
ATt6.setEnabled(true);ATt7.setEnabled(true);ATc9.setEnabled(true); 
ATt1.setText("");ATt2.setText("");ATt3.setText("");ATbg.clearSelection();ATt5.s etText("");ATt6.setText("");ATt7.setText(""); 
ch8a.setSelected(false);ch8b.setSelected(false);ch8c.setSelected(false);ch8d.se tSelected(false);ch8e.setSelected(false); 
ATdfunc_id.setText("");
ATSDV.setEnabled(true);ATSDV.setText(""); 
} 
}); 
ATaddstaff.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String ATclass=null; 
String ATmsg=""; 
String ATstaffid=ATt1.getText(); 
String ATstaffname=ATt2.getText(); 
String ATstaffdob=ATt3.getText(); 
String ATstaffmail=ATt5.getText(); 
String ATstaffaddress=ATt6.getText(); 
String ATstaffcontact=ATt7.getText(); 
try 
{ 
if((ATstaffid.equals("")||ATstaffname.equals("")||ATstaffdob.equals("")  || ATstaffmail.equals("")  
||ATstaffaddress.equals("")||ATstaffcontact.equals("")) ||  
(ATstaffid.equals("") && ATstaffname.equals("") && ATstaffdob.equals("") &&  ATstaffmail.equals("") && ATstaffaddress.equals("") &&  
ATstaffcontact.equals("")) ) 
{
JOptionPane.showMessageDialog(frame,"Fill all details"); 
} 
else 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement ATstaffdetails_stmt=conn.createStatement(); 
int intATstaffid =Integer.parseInt(ATstaffid); 
String ATstaff_details_chkqry="Select * from staffdetails where  staff_id="+intATstaffid+""; 
ResultSet ATstaff_details_rs =  
ATstaffdetails_stmt.executeQuery(ATstaff_details_chkqry); if(ATstaff_details_rs.next()) 
{ 
JOptionPane.showMessageDialog(frame,"ID Already  
Exists"); 
} 
else 
{ 
String ATgender=null; 
if(ATr1.isSelected()) 
ATgender="Male";
else if(ATr2.isSelected()) 
ATgender="Female"; 
if(ch8a.isSelected()){ATmsg="English \n";} 
if(ch8b.isSelected()){ATmsg+="Tamil \n";} 
if(ch8c.isSelected()){ATmsg+="Maths \n";} 
if(ch8d.isSelected()){ATmsg+="Science \n";} 
if(ch8e.isSelected()){ATmsg+="Social \n";} 
ATclass=ATc9.getSelectedItem().toString(); 
Statement ATstaff_details_stmt=conn.createStatement(); 
String ATstaff_details_qry="INSERT INTO staffdetails  
VALUES(' "+ATt1.getText()+" ',' "+ATt2.getText()+" ',' "+ATt3.getText()+" ','  "+ATgender+" ',' "+ATt5.getText()+" ',' "+ATt6.getText()+" ',' "+ATt7.getText()+"  ',' "+ATmsg+" ',' "+ATclass+" ')"; 
ATstaff_details_stmt.executeUpdate(ATstaff_details_qry); 
JOptionPane.showMessageDialog(frame,"Details added  
successfully"); 
conn.close(); 
ATt1.setText("");ATt2.setText("");ATt3.setText("");ATbg.clearSelection(); ATt5.setText("");ATt6.setText("");ATt7.setText(""); 
ch8a.setSelected(false);ch8b.setSelected(false);ch8c.setSelected(false);c h8d.setSelected(false);ch8e.setSelected(false); 
ATdfunc_id.setText(""); 
}}} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc);
}}}); 
ATviewstaff.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String ATdvid=ATdfunc_id.getText(); 
try 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement ATdvstmt=conn.createStatement(); 
int intATdvid =Integer.parseInt(ATdvid); 
String ATchkdvqry="Select * from staffdetails where  
staff_id="+intATdvid+""; 
ResultSet ATdvmrs=ATdvstmt.executeQuery(ATchkdvqry); 
if(ATdvmrs.next()) 
{ 
ResultSet ATdVirs=ATdvstmt.executeQuery(ATchkdvqry); 
while(ATdVirs.next()) 
{ 
String ATidT =ATdVirs.getString("staff_id");
String ATnameT =ATdVirs.getString("staff_name"); 
String ATdobT =ATdVirs.getString("staff_dob"); 
String ATgenderT=ATdVirs.getString("staff_gender"); 
String ATmailT =ATdVirs.getString("staff_mail"); 
String ATaddressT=ATdVirs.getString("staff_address"); 
String ATphT=ATdVirs.getString("staff_contact"); 
String ATsubT=ATdVirs.getString("staff_subject"); 
String ATclassT =ATdVirs.getString("staff_class"); 
ATSDV.setText(" SELECTED DETAILS \n\n NAME: "  +ATnameT+ " \n ID : " +ATidT+ "\n DOB : " +ATdobT+ "\n GENDER : "  +ATgenderT+ "\n EMAIL : " +ATmailT+ "\n ADDRESS : \n" +ATaddressT+ " \n  CONTACT : " +ATphT+ " \n HANDLING SUBJECTS : \n" +ATsubT+ " \n CLASS  TEACHER : " +ATclassT+ "\n"); 
ATSDV.setEnabled(false); 
} 
} 
else 
{ 
JOptionPane.showMessageDialog(frame,"Id not found for  viewing"); 
ATdfunc_id.setText(""); 
} 
conn.close(); 
} 
catch(Exception exc)
{ 
JOptionPane.showMessageDialog(frame,exc); 
}}}) 
ATdeletestaff.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String ATdTid=ATdfunc_id.getText(); 
try 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement ATdTstmt=conn.createStatement(); 
int intATdTid =Integer.parseInt(ATdTid); 
String ATchkdTqry="Select * from staffdetails where  
staff_id="+intATdTid+""; 
ResultSet ATdTrs=ATdTstmt.executeQuery(ATchkdTqry); 
if(ATdTrs.next()) 
{ 
String ATTDqry="DELETE FROM staffdetails WHERE  
staff_id="+ATdfunc_id.getText()+""; 
ATdTstmt.executeUpdate(ATTDqry);
JOptionPane.showMessageDialog(frame,"Details Successfully deleted"); conn.close(); 
} 
else 
{ 
JOptionPane.showMessageDialog(frame,"Id not found"); 
} 
ATdfunc_id.setText(""); 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
} 
}}); 
ATupdatestaff.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String ATuTid=ATdfunc_id.getText(); 
try 
{ 
Class.forName("com.mysql.jdbc.Driver");
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement ATuTstmt=conn.createStatement(); 
int intATuTid =Integer.parseInt(ATuTid); 
String ATchkuTqry="Select * from staffdetails where  
staff_id="+intATuTid+""; 
ResultSet ATuTurs=ATuTstmt.executeQuery(ATchkuTqry); 
if(ATuTurs.next()) 
{ 
JOptionPane.showMessageDialog(frame,"Click Save button after  Updating Values"); 
JOptionPane.showMessageDialog(frame,"Make sure radio buttons  value and drop down values are selected"); 
ResultSet ATuTrs=ATuTstmt.executeQuery(ATchkuTqry); 
while(ATuTrs.next()) 
{ 
ATt1.setText(ATuTrs.getString("staff_id")); 
ATt2.setText(ATuTrs.getString("staff_name")); 
ATt3.setText(ATuTrs.getString("staff_dob")); 
ATt5.setText(ATuTrs.getString("staff_mail")); 
ATt6.setText(ATuTrs.getString("staff_address")); 
ATt7.setText(ATuTrs.getString("staff_contact")); 
} 
}
else 
{ 
JOptionPane.showMessageDialog(frame,"Id not found"); ATdfunc_id.setText(""); 
} 
conn.close(); 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
} 
}}); 
ATsavebtn.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String ATidTD=ATt1.getText(); 
String ATnameTD=ATt2.getText(); 
String ATdobTD=ATt3.getText(); 
String ATgenderTD=null; 
String ATmailTD=ATt5.getText(); 
String ATaddressTD=ATt6.getText();
String ATphTD=ATt7.getText(); 
String ATvalueTD; 
String ATmsgTD=""; 
try 
{ 
if(ATidTD.isEmpty() ||ATnameTD.isEmpty() ||ATdobTD.isEmpty()  ||ATmailTD.isEmpty() ||ATaddressTD.isEmpty() ||ATphTD.isEmpty() ) 
{ 
JOptionPane.showMessageDialog(frame,"Fill all details"); 
} 
else 
{  
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement ATTDstmt=conn.createStatement(); 
if(ATr1.isSelected()) 
ATgenderTD="Male"; 
else if(ATr2.isSelected()) 
ATgenderTD="Female"; 
String ATTDgender= String.valueOf(ATgenderTD); 
if(ch8a.isSelected()){ATmsgTD="English \n";} 
if(ch8b.isSelected()){ATmsgTD+="Tamil \n";}
if(ch8c.isSelected()){ATmsgTD+="Maths \n";} 
if(ch8d.isSelected()){ATmsgTD+="Science \n";} 
if(ch8e.isSelected()){ATmsgTD+="Social \n";} 
ATvalueTD=ATc9.getSelectedItem().toString(); 
ATTDstmt.executeUpdate("update staffdetails set staff_name= '  "+ATt2.getText()+" ' , staff_dob= ' "+ATt3.getText()+" ' , staff_gender='  "+ATTDgender+" ',staff_mail=' "+ATt5.getText()+" ', staff_address= '  "+ATt6.getText()+" ', staff_contact=' "+ATt7.getText()+" ', staff_subject='  "+ATmsgTD+" ', staff_class=' "+ATvalueTD+" ' where staff_id= '  "+ATdfunc_id.getText()+" ' "); 
JOptionPane.showMessageDialog(frame,"Successfully Details Updated"); conn.close(); 
} 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
} 
}}); 
p2c.setBackground(Color.pink); 
JLabel AStitle3a=new JLabel("STUDENT DETAILS"); 
AStitle3a.setFont(new Font("Times New Roman",Font.BOLD,30)); AStitle3a.setForeground(Color.blue); 
AStitle3a.setBounds(420,10,500,40); 
p2c.add(AStitle3a);
JLabel ASl1=new JLabel("STUDENT ID:"); 
ASl1.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl1.setForeground(Color.black); 
ASl1.setBounds(20,50,300,30); 
p2c.add(ASl1); 
JTextField ASt1=new JTextField(); 
ASt1.setBounds(160,50,200,30); 
ASt1.setColumns(100); 
p2c.add(ASt1); 
JLabel ASl2=new JLabel("NAME:"); 
ASl2.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl2.setForeground(Color.black); 
ASl2.setBounds(20,90,300,30); 
p2c.add(ASl2); 
JTextField ASt2=new JTextField(); 
ASt2.setBounds(160,90,200,30); 
ASt2.setColumns(100); 
p2c.add(ASt2); 
JLabel ASl3=new JLabel("DOB:"); 
ASl3.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl3.setForeground(Color.black); 
ASl3.setBounds(20,130,300,30); 
p2c.add(ASl3);
JTextField ASt3=new JTextField(); 
ASt3.setBounds(160,130,200,30); 
ASt3.setColumns(100); 
p2c.add(ASt3); 
JLabel ASl4=new JLabel("GENDER:"); 
ASl4.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl4.setForeground(Color.black); 
ASl4.setBounds(20,170,300,30); 
p2c.add(ASl4); 
ButtonGroup ASbg =new ButtonGroup(); 
JRadioButton ASr1=new JRadioButton("MALE"); JRadioButton ASr2=new JRadioButton("FEMALE"); ASbg.add(ASr1);ASbg.add(ASr2); 
ASr1.setFont(new Font("Times New Roman",Font.BOLD,15)); ASr1.setForeground(Color.black); 
ASr1.setBounds(160,170,200,30); 
ASr2.setFont(new Font("Times New Roman",Font.BOLD,15)); ASr2.setForeground(Color.black); 
ASr2.setBounds(160,190,200,30); 
p2c.add(ASr1);p2c.add(ASr2); 
JLabel ASl5=new JLabel("EMAIL:"); 
ASl5.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl5.setForeground(Color.black);
ASl5.setBounds(20,230,300,30); 
p2c.add(ASl5); 
JTextField ASt5=new JTextField(); 
ASt5.setBounds(160,230,200,30); 
ASt5.setColumns(100); 
p2c.add(ASt5); 
JLabel ASl6=new JLabel("CLASS:"); 
ASl6.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl6.setForeground(Color.black); 
ASl6.setBounds(20,270,300,30); 
p2c.add(ASl6); 
String ASclasses[]={"Pre.K.G","L.K.G","1","2","3","4","5","6","7","8","9","10"}; JComboBox ASc6=new JComboBox(ASclasses); 
ASc6.setBounds(160,270,200,30); 
p2c.add(ASc6); 
JLabel ASl7=new JLabel("ADMISSION DATE:"); 
ASl7.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl7.setForeground(Color.black); 
ASl7.setBounds(400,50,300,30); 
p2c.add(ASl7); 
JTextField ASt7=new JTextField(); 
ASt7.setBounds(590,50,200,30); 
ASt7.setColumns(100);
p2c.add(ASt7); 
JLabel ASl8=new JLabel("FATHER'S NAME:"); 
ASl8.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl8.setForeground(Color.black); 
ASl8.setBounds(400,90,300,30); 
p2c.add(ASl8); 
JTextField ASt8=new JTextField(); 
ASt8.setBounds(590,90,200,30); 
ASt8.setColumns(100); 
p2c.add(ASt8); 
JLabel ASl9=new JLabel("MOTHER'S NAME:"); 
ASl9.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl9.setForeground(Color.black); 
ASl9.setBounds(400,130,300,30); 
p2c.add(ASl9); 
JTextField ASt9=new JTextField(); 
ASt9.setBounds(590,130,200,30); 
ASt9.setColumns(100); 
p2c.add(ASt9); 
JLabel ASl10=new JLabel("ADDRESS:"); 
ASl10.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl10.setForeground(Color.black); 
ASl10.setBounds(400,170,300,30);
p2c.add(ASl10); 
JTextArea ASt10=new JTextArea(); 
ASt10.setBounds(590,170,200,50); 
p2c.add(ASt10); 
JLabel ASl11=new JLabel("CONTACT 1:"); 
ASl11.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl11.setForeground(Color.black); 
ASl11.setBounds(400,230,300,30); 
p2c.add(ASl11); 
JTextField ASt11=new JTextField(); 
ASt11.setBounds(590,230,200,30); 
ASt11.setColumns(100); 
p2c.add(ASt11); 
JLabel ASl12=new JLabel("CONTACT 2:"); 
ASl12.setFont(new Font("Times New Roman",Font.BOLD,20)); ASl12.setForeground(Color.black); 
ASl12.setBounds(400,270,300,30); 
p2c.add(ASl12); 
JTextField ASt12=new JTextField(); 
ASt12.setBounds(590,270,200,30); 
ASt12.setColumns(100); 
p2c.add(ASt12); 
JLabel ASDLabel=new JLabel("For View, Update and Delete, search using ID");
ASDLabel.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,30)); ASDLabel.setForeground(Color.white); 
ASDLabel.setBounds(20,360,800,30); 
p2c.add(ASDLabel); 
JLabel ASDfunc_id=new JLabel("Enter Id:"); 
ASDfunc_id.setFont(new Font("Times New Roman",Font.ITALIC,25)); ASDfunc_id.setForeground(Color.red); 
ASDfunc_id.setBounds(20,410,100,30); 
p2c.add(ASDfunc_id); 
JTextField ASdfunc_id=new JTextField(); 
ASdfunc_id.setBounds(130,410,200,30); 
ASdfunc_id.setColumns(100); 
p2c.add(ASdfunc_id); 
JTextArea ASSDV=new JTextArea(); 
ASSDV.setBounds(820,50,370,370); 
ASSDV.setFont(new Font("Times New Roman",Font.ITALIC|Font.BOLD,20)); p2c.add(ASSDV); 
JButton ASdref = new JButton("REFRESH"); 
ASdref.setBounds(1000,480,200,30); 
p2c.add(ASdref); 
ASdref.addActionListener( 
new ActionListener() 
{
public void actionPerformed(ActionEvent ae) 
{ 
ASt1.setEnabled(true);ASt2.setEnabled(true);ASt3.setEnabled(true);ASt5.setEn abled(true); 
ASt7.setEnabled(true);ASt8.setEnabled(true);ASt9.setEnabled(true);ASt10.setE nabled(true);ASt11.setEnabled(true);ASt12.setEnabled(true); 
ASt1.setText("");ASt2.setText("");ASt3.setText("");ASbg.clearSelection();ASt5.se tText("");ASc6.setEnabled(true);ASt7.setText("");ASt8.setText("");ASt9.setText( "");ASt10.setText("");ASt11.setText("");ASt12.setText(""); 
ASdfunc_id.setText(""); 
ASSDV.setEnabled(true);ASSDV.setText(""); 
}}); 
JButton ASaddstudents = new JButton("ADD"); 
ASaddstudents.setBounds(320,320,180,30); 
p2c.add(ASaddstudents); 
ASaddstudents.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String ASvalue; 
String ASstudentid=ASt1.getText(); 
String ASstudentname=ASt2.getText(); 
String ASstudentdob=ASt3.getText(); 
String ASstudentmail=ASt5.getText();
String ASstudentadmission=ASt7.getText(); 
String ASstudentfname=ASt8.getText(); 
String ASstudentmname=ASt9.getText(); 
String ASstudentaddress=ASt10.getText(); 
String ASstudentph1=ASt11.getText(); 
String ASstudentph2=ASt12.getText(); 
try 
{ 
if((ASstudentid.equals("")||ASstudentname.equals("")||ASstudentdob.e quals("") || ASstudentmail.equals("") || ASstudentadmission.equals("")  ||ASstudentfname.equals("")||ASstudentmname.equals("")||ASstudentaddre ss.equals("")||ASstudentph1.equals("")||ASstudentph2.equals("")) ||  (ASstudentid.equals("") && ASstudentname.equals("") &&  
ASstudentdob.equals("") && ASstudentmail.equals("") &&  ASstudentadmission.equals("") && ASstudentfname.equals("") &&  ASstudentmname.equals("") && ASstudentaddress.equals("") &&  ASstudentph1.equals("") && ASstudentph2.equals(""))) 
{ 
JOptionPane.showMessageDialog(frame,"Fill all details"); 
} 
else 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement ASstudent_details_stmt=conn.createStatement();
int intASstudentid =Integer.parseInt(ASstudentid); 
String ASStudent_details_chkqry="Select * from studentdetails  where student_id="+intASstudentid+""; 
ResultSet ASstudent_details_rs =  
ASstudent_details_stmt.executeQuery(ASStudent_details_chkqry); if(ASstudent_details_rs.next()) 
{ 
JOptionPane.showMessageDialog(frame,"ID Already  
Exists"); 
} 
else 
{ 
String ASgender=null; 
if(ASr1.isSelected()) 
ASgender="Male"; 
else if(ASr2.isSelected()) 
ASgender="Female"; 
ASvalue=ASc6.getSelectedItem().toString(); 
Statement  
ASsstudent_details_stmt=conn.createStatement(); 
String ASstudent_details_qry="INSERT INTO studentdetails  VALUES(' "+ASt1.getText()+" ',' "+ASt2.getText()+" ',' "+ASt3.getText()+" ','  "+ASgender+" ',' "+ASt5.getText()+" ',' "+ASvalue+" ',' "+ASt7.getText()+" ','  "+ASt8.getText()+" ',' "+ASt9.getText()+" ',' "+ASt10.getText()+" ','  "+ASt11.getText()+" ',' "+ASt12.getText()+" ')";
ASsstudent_details_stmt.executeUpdate(ASstudent_details_qry); 
JOptionPane.showMessageDialog(frame,"Details added  
successfully"); 
conn.close(); 
ASt1.setText("");ASt2.setText("");ASt3.setText("");ASbg.clearSelection(); ASt5.setText("");ASt7.setText("");ASt8.setText("");ASt9.setText("");ASt10.setTe xt("");ASt11.setText("");ASt12.setText(""); 
}}} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
}}}); 
JButton ASviewstudents = new JButton("VIEW"); 
ASviewstudents.setBounds(20,480,180,30); 
p2c.add(ASviewstudents); 
ASviewstudents.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String ASdvid=ASdfunc_id.getText(); 
try 
{ 
Class.forName("com.mysql.jdbc.Driver");
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement ASdvstmt=conn.createStatement(); 
int intASdvid =Integer.parseInt(ASdvid); 
String ASchkdvqry="Select * from studentdetails where  
student_id="+intASdvid+""; 
ResultSet ASdvmrs=ASdvstmt.executeQuery(ASchkdvqry); 
if(ASdvmrs.next()) 
{ 
Statement ASdVistmt=conn.createStatement(); 
ResultSet ASdVirs=ASdVistmt.executeQuery(ASchkdvqry); 
while(ASdVirs.next()) 
{ 
String ASidS =ASdVirs.getString("student_id"); 
String ASnameS =ASdVirs.getString("student_name"); 
String ASdobS =ASdVirs.getString("student_dob"); 
String ASgenderS=ASdVirs.getString("student_gender"); 
String ASmailS =ASdVirs.getString("student_mail"); 
String ASclassS =ASdVirs.getString("student_class"); 
String ASadmS =ASdVirs.getString("student_admission_date"); String ASfnameS=ASdVirs.getString("student_fathers_name"); String ASmnameS=ASdVirs.getString("student_mothers_name"); String ASaddressS=ASdVirs.getString("student_address");
String ASph1S=ASdVirs.getString("student_contact1"); 
String ASph2S=ASdVirs.getString("student_contact2"); 
ASSDV.setText(" SELECTED DETAILS \n \n NAME: "  +ASnameS+ " \n ID : " +ASidS+ "\n DOB : " +ASdobS+ "\n GENDER : "  +ASgenderS+ "\n EMAIL : " +ASmailS+ "\n CLASS : " +ASclassS+ "\n ADMISSION  DATE : " +ASadmS+ "\n FATHER'S NAME : " +ASfnameS+ "\n MOTHER'S NAME :  " +ASmnameS+ "\n ADDRESS : \n" +ASaddressS+ " \n CONTACT : " +ASph1S+  "," +ASph2S+ "\n"); 
ASSDV.setEnabled(false); 
} 
} 
else 
{ 
JOptionPane.showMessageDialog(frame,"Id not found for  
viewing"); 
ASdfunc_id.setText(""); 
} 
conn.close(); 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
}}}); 
JButton ASupdatestudents = new JButton("UPDATE"); 
ASupdatestudents.setBounds(210,480,180,30);
p2c.add(ASupdatestudents); 
ASupdatestudents.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String ASuSid=ASdfunc_id.getText(); 
try 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement ASuSstmt=conn.createStatement(); 
int intASuSid =Integer.parseInt(ASuSid); 
String ASchkuSqry="Select * from studentdetails where  
student_id="+intASuSid+""; 
ResultSet ASuSurs=ASuSstmt.executeQuery(ASchkuSqry); 
if(ASuSurs.next()) 
{ 
JOptionPane.showMessageDialog(frame,"Click Save button after  Updating Values"); 
JOptionPane.showMessageDialog(frame,"Make sure radio buttons  value and drop down values are selected"); 
ResultSet ASuSrs=ASuSstmt.executeQuery(ASchkuSqry);
while(ASuSrs.next()) 
{ 
ASt1.setText(ASuSrs.getString("student_id")); 
ASt2.setText(ASuSrs.getString("student_name")); 
ASt3.setText(ASuSrs.getString("student_dob")); 
ASt5.setText(ASuSrs.getString("student_mail")); 
ASt7.setText(ASuSrs.getString("student_admission_date")); ASt8.setText(ASuSrs.getString("student_fathers_name")); ASt9.setText(ASuSrs.getString("student_mothers_name")); ASt10.setText(ASuSrs.getString("student_address")); 
ASt11.setText(ASuSrs.getString("student_contact1")); 
ASt12.setText(ASuSrs.getString("student_contact2")); 
} 
} 
else 
{ 
JOptionPane.showMessageDialog(frame,"Id not found"); ASdfunc_id.setText(""); 
} 
conn.close(); 
} 
catch(Exception exc) 
{
JOptionPane.showMessageDialog(frame,exc); }}}); 
JButton ASsaveSbtn= new JButton("Save changes"); ASsaveSbtn.setBounds(750,480,200,30); p2c.add(ASsaveSbtn); 
ASsaveSbtn.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) { 
String ASidSD=ASt1.getText(); 
String ASnameSD=ASt2.getText(); 
String ASdobSD=ASt3.getText(); 
String ASmailSD=ASt5.getText(); 
String ASvalueSD; 
String ASadmSD=ASt7.getText(); 
String ASfnameSD=ASt8.getText(); 
String ASmnameSD=ASt9.getText(); 
String ASaddressSD=ASt10.getText(); 
String ASph1SD=ASt11.getText(); 
String ASph2SD=ASt12.getText(); 
String ASgenderSD=null; 
try
{ 
if(ASidSD.isEmpty() ||ASnameSD.isEmpty() ||ASdobSD.isEmpty()  ||ASmailSD.isEmpty() ||ASadmSD.isEmpty() ||ASfnameSD.isEmpty()  ||ASmnameSD.isEmpty() ||ASaddressSD.isEmpty()  
||ASph1SD.isEmpty()||ASph2SD.isEmpty() ) 
{ 
JOptionPane.showMessageDialog(frame,"Fill all details"); 
} 
else 
{  
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement ASSDstmt=conn.createStatement(); 
if(ASr1.isSelected()) 
ASgenderSD="Male"; 
else if(ASr2.isSelected()) 
ASgenderSD="Female"; 
String ASSDgender= String.valueOf(ASgenderSD); 
ASvalueSD=ASc6.getSelectedItem().toString(); 
ASSDstmt.executeUpdate("update studentdetails set student_name= '  "+ASt2.getText()+" ' , student_dob= ' "+ASt3.getText()+" ' , student_gender='  "+ASSDgender+" ',student_mail=' "+ASt5.getText()+" ',student_class='  "+ASvalueSD+" ', student_admission_date= ' "+ASt7.getText()+" ',  student_fathers_name= ' "+ASt8.getText()+" ', student_mothers_name= '  "+ASt9.getText()+" ', student_address= ' "+ASt10.getText()+" ', 
student_contact1=' "+ASt11.getText()+" ', student_contact2= '  "+ASt12.getText()+" ' where student_id= ' "+ASdfunc_id.getText()+" ' "); 
JOptionPane.showMessageDialog(frame,"Successfully Details Updated"); 
conn.close(); 
} 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
}}}); 
JButton ASdeletestudents = new JButton("DELETE"); 
ASdeletestudents.setBounds(400,480,180,30); 
p2c.add(ASdeletestudents); 
ASdeletestudents.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String ASdSid=ASdfunc_id.getText(); 
try 
{ 
Class.forName("com.mysql.jdbc.Driver");
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement ASdSstmt=conn.createStatement(); 
int intASdSid =Integer.parseInt(ASdSid); 
String ASchkdSqry="Select * from studentdetails where  
student_id="+intASdSid+""; 
ResultSet ASdSrs=ASdSstmt.executeQuery(ASchkdSqry); 
if(ASdSrs.next()) 
{ 
String ASSDqry="DELETE FROM studentdetails WHERE  
student_id="+ASdfunc_id.getText()+""; 
ASdSstmt.executeUpdate(ASSDqry); 
JOptionPane.showMessageDialog(frame,"Details Successfully deleted"); conn.close(); 
} 
else 
{ 
JOptionPane.showMessageDialog(frame,"Id not found"); 
} 
ASdfunc_id.setText(""); 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc);
}}}); 
p3.setBackground(Color.white); 
JTabbedPane stafftabs=new JTabbedPane(); 
stafftabs.setBounds(40,10,1250,550); 
p3.add(stafftabs); 
JPanel p3a=new JPanel(); 
stafftabs.addTab("LOGIN",null,p3a,null); 
p3a.setLayout(null); 
p3a.setBackground(Color.gray); 
JPanel p3b=new JPanel(); 
stafftabs.addTab("STUDENT DETAILS",null,p3b,null); p3b.setLayout(null); 
p3b.setBackground(Color.gray); 
JPanel p3c=new JPanel(); 
stafftabs.addTab("MARK DETAILS",null,p3c,null); p3c.setLayout(null); 
p3c.setBackground(Color.gray); 
stafftabs.setEnabledAt(1,false); 
stafftabs.setEnabledAt(2,false); 
JLabel title3=new JLabel("STAFF LOGIN"); 
title3.setFont(new Font("Times New Roman",Font.BOLD,30)); title3.setForeground(Color.white); 
title3.setBounds(500,80,250,30);
p3a.add(title3); 
JLabel staff_id=new JLabel("USER ID:"); 
staff_id.setFont(new Font("Times New Roman",Font.BOLD,30)); staff_id.setForeground(Color.black); 
staff_id.setBounds(400,160,180,30); 
p3a.add(staff_id); 
JTextField staff_t1=new JTextField(); 
staff_t1.setBounds(650,160,170,30); 
staff_t1.setColumns(100); 
p3a.add(staff_t1); 
JLabel staff_pswd=new JLabel("PASSWORD:"); 
staff_pswd.setFont(new Font("Times New Roman",Font.BOLD,30)); staff_pswd.setForeground(Color.black); 
staff_pswd.setBounds(400,260,180,30); 
p3a.add(staff_pswd); 
JTextField staff_t2=new JTextField(); 
staff_t2.setBounds(650,260,170,30); 
staff_t2.setColumns(100); 
p3a.add(staff_t2); 
JButton staff_reg= new JButton("Register"); 
staff_reg.setBounds(420,340,180,30); 
p3a.add(staff_reg); 
JButton staff_login= new JButton("Login");
staff_login.setBounds(615,340,180,30); 
p3a.add(staff_login); 
staff_reg.addActionListener( 
new ActionListener(){ 
public void actionPerformed(ActionEvent ae){ 
String sid=staff_t1.getText(); 
String spswd=staff_t2.getText(); 
try 
{ 
if((sid.equals("") || spswd.equals(""))||(sid.equals("") &&  
spswd.equals(""))) 
{ 
JOptionPane.showMessageDialog(frame,"Enter valid details"); } 
else 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement stmt=conn.createStatement(); 
int intsid = Integer.parseInt(sid); 
String Staffchkqry="Select * from staff where id_staff="+intsid+""; ResultSet staffrs=stmt.executeQuery(Staffchkqry);
if(staffrs.next()) 
{ 
JOptionPane.showMessageDialog(frame,"ID Already  
Exists"); 
} 
else 
{ 
String qry="INSERT INTO staff(id_staff,pswd_staff)  
VALUES('"+staff_t1.getText()+"','"+staff_t2.getText()+"')"; stmt.executeUpdate(qry); 
JOptionPane.showMessageDialog(frame,"Registered  
successfully. Now you can login to access other tabs"); 
conn.close(); 
staff_t1.setText("");staff_t2.setText(""); 
} 
} 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
} 
}}); 
staff_login.addActionListener( 
new ActionListener(){
public void actionPerformed(ActionEvent ae){ 
String sid=staff_t1.getText(); 
String spswd=staff_t2.getText(); 
try 
{ 
if((sid.equals("") || spswd.equals(""))||(sid.equals("") &&  
spswd.equals(""))) 
{ 
JOptionPane.showMessageDialog(frame,"Enter valid details"); } 
else 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
PreparedStatement ps=conn.prepareStatement("SELECT * FROM  staff where id_staff=? and pswd_staff=?"); 
ps.setString(1,sid); 
ps.setString(2,spswd); 
ResultSet rs=ps.executeQuery(); 
if(rs.next()) 
{ 
JOptionPane.showMessageDialog(frame,"Logged in  
successfully");
stafftabs.setEnabledAt(1,true); 
stafftabs.setEnabledAt(2,true); 
JLabel footer2=new JLabel("Successfully logged in. Now you  are allowed to access other tabs"); 
footer2.setFont(new Font("Times New  
Roman",Font.ITALIC|Font.BOLD,30)); 
footer2.setForeground(Color.white); 
footer2.setBounds(220,400,1200,30); 
p3a.add(footer2); 
} 
else 
{ 
JOptionPane.showMessageDialog(frame,"Incorrect details/  Do register first!!!"); 
} 
} 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
}}}); 
JLabel title3a=new JLabel("STUDENT DETAILS"); 
title3a.setFont(new Font("Times New Roman",Font.BOLD,30)); title3a.setForeground(Color.white);
title3a.setBounds(420,10,500,40); 
p3b.add(title3a); 
JLabel l1=new JLabel("STUDENT ID:"); 
l1.setFont(new Font("Times New Roman",Font.BOLD,20)); l1.setForeground(Color.black); 
l1.setBounds(20,50,300,30); 
p3b.add(l1); 
JTextField t1=new JTextField(); 
t1.setBounds(160,50,200,30); 
t1.setColumns(100); 
p3b.add(t1); 
JLabel l2=new JLabel("NAME:"); 
l2.setFont(new Font("Times New Roman",Font.BOLD,20)); l2.setForeground(Color.black); 
l2.setBounds(20,90,300,30); 
p3b.add(l2); 
JTextField t2=new JTextField(); 
t2.setBounds(160,90,200,30); 
t2.setColumns(100); 
p3b.add(t2); 
JLabel l3=new JLabel("DOB:"); 
l3.setFont(new Font("Times New Roman",Font.BOLD,20)); l3.setForeground(Color.black);
l3.setBounds(20,130,300,30); 
p3b.add(l3); 
JTextField t3=new JTextField(); 
t3.setBounds(160,130,200,30); 
t3.setColumns(100); 
p3b.add(t3); 
JLabel l4=new JLabel("GENDER:"); 
l4.setFont(new Font("Times New Roman",Font.BOLD,20)); l4.setForeground(Color.black); 
l4.setBounds(20,170,300,30); 
p3b.add(l4); 
ButtonGroup bg =new ButtonGroup(); 
JRadioButton r1=new JRadioButton("MALE"); JRadioButton r2=new JRadioButton("FEMALE"); bg.add(r1);bg.add(r2); 
r1.setFont(new Font("Times New Roman",Font.BOLD,15)); r1.setForeground(Color.black); 
r1.setBounds(160,170,200,30); 
r2.setFont(new Font("Times New Roman",Font.BOLD,15)); r2.setForeground(Color.black); 
r2.setBounds(160,190,200,30); 
p3b.add(r1);p3b.add(r2); 
JLabel l5=new JLabel("EMAIL:");
l5.setFont(new Font("Times New Roman",Font.BOLD,20)); l5.setForeground(Color.black); 
l5.setBounds(20,230,300,30); 
p3b.add(l5); 
JTextField t5=new JTextField(); 
t5.setBounds(160,230,200,30); 
t5.setColumns(100); 
p3b.add(t5); 
JLabel l6=new JLabel("CLASS:"); 
l6.setFont(new Font("Times New Roman",Font.BOLD,20)); l6.setForeground(Color.black); 
l6.setBounds(20,270,300,30); 
p3b.add(l6); 
String classes[]={"Pre.K.G","L.K.G","1","2","3","4","5","6","7","8","9","10"}; JComboBox c6=new JComboBox(classes); 
c6.setBounds(160,270,200,30); 
p3b.add(c6); 
JLabel l7=new JLabel("ADMISSION DATE:"); 
l7.setFont(new Font("Times New Roman",Font.BOLD,20)); l7.setForeground(Color.black); 
l7.setBounds(400,50,300,30); 
p3b.add(l7); 
JTextField t7=new JTextField();
t7.setBounds(590,50,200,30); 
t7.setColumns(100); 
p3b.add(t7); 
JLabel l8=new JLabel("FATHER'S NAME:"); 
l8.setFont(new Font("Times New Roman",Font.BOLD,20)); l8.setForeground(Color.black); 
l8.setBounds(400,90,300,30); 
p3b.add(l8); 
JTextField t8=new JTextField(); 
t8.setBounds(590,90,200,30); 
t8.setColumns(100); 
p3b.add(t8); 
JLabel l9=new JLabel("MOTHER'S NAME:"); 
l9.setFont(new Font("Times New Roman",Font.BOLD,20)); l9.setForeground(Color.black); 
l9.setBounds(400,130,300,30); 
p3b.add(l9); 
JTextField t9=new JTextField(); 
t9.setBounds(590,130,200,30); 
t9.setColumns(100); 
p3b.add(t9); 
JLabel l10=new JLabel("ADDRESS:"); 
l10.setFont(new Font("Times New Roman",Font.BOLD,20));
l10.setForeground(Color.black); 
l10.setBounds(400,170,300,30); 
p3b.add(l10); 
JTextArea t10=new JTextArea(); 
t10.setBounds(590,170,200,50); 
p3b.add(t10); 
JLabel l11=new JLabel("CONTACT 1:"); 
l11.setFont(new Font("Times New Roman",Font.BOLD,20)); l11.setForeground(Color.black); 
l11.setBounds(400,230,300,30); 
p3b.add(l11); 
JTextField t11=new JTextField(); 
t11.setBounds(590,230,200,30); 
t11.setColumns(100); 
p3b.add(t11); 
JLabel l12=new JLabel("CONTACT 2:"); 
l12.setFont(new Font("Times New Roman",Font.BOLD,20)); l12.setForeground(Color.black); 
l12.setBounds(400,270,300,30); 
p3b.add(l12); 
JTextField t12=new JTextField(); 
t12.setBounds(590,270,200,30); 
t12.setColumns(100);
p3b.add(t12); 
JLabel DLabel=new JLabel("For View, Update and Delete, search using ID"); DLabel.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,30)); DLabel.setForeground(Color.yellow); 
DLabel.setBounds(20,360,800,30); 
p3b.add(DLabel); 
JLabel Dfunc_id=new JLabel("Enter Id:"); 
Dfunc_id.setFont(new Font("Times New Roman",Font.ITALIC,25)); Dfunc_id.setForeground(Color.cyan); 
Dfunc_id.setBounds(20,410,100,30); 
p3b.add(Dfunc_id); 
JTextField dfunc_id=new JTextField(); 
dfunc_id.setBounds(130,410,200,30); 
dfunc_id.setColumns(100); 
p3b.add(dfunc_id); 
JTextArea SDV=new JTextArea(); 
SDV.setBounds(820,50,370,370); 
SDV.setFont(new Font("Times New Roman",Font.ITALIC|Font.BOLD,20)); p3b.add(SDV); 
JButton dref = new JButton("REFRESH"); 
dref.setBounds(1000,480,200,30); 
p3b.add(dref); 
dref.addActionListener(
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
t1.setEnabled(true);t2.setEnabled(true);t3.setEnabled(true);t5.setEnabled(true ); 
t7.setEnabled(true);t8.setEnabled(true);t9.setEnabled(true);t10.setEnabled(tru e);t11.setEnabled(true);t12.setEnabled(true); 
t1.setText("");t2.setText("");t3.setText("");bg.clearSelection();t5.setText("");c6. setEnabled(true);t7.setText("");t8.setText("");t9.setText("");t10.setText("");t11. setText("");t12.setText(""); 
dfunc_id.setText(""); 
SDV.setEnabled(true);SDV.setText(""); 
} 
}); 
JButton addstudents = new JButton("ADD"); 
addstudents.setBounds(320,320,180,30); 
p3b.add(addstudents); 
addstudents.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String value; 
String studentid=t1.getText();
String studentname=t2.getText(); 
String studentdob=t3.getText(); 
String studentmail=t5.getText(); 
String studentadmission=t7.getText(); 
String studentfname=t8.getText(); 
String studentmname=t9.getText(); 
String studentaddress=t10.getText(); 
String studentph1=t11.getText(); 
String studentph2=t12.getText(); 
try 
{ 
if((studentid.equals("")||studentname.equals("")||studentdob.equals("" ) || studentmail.equals("") || studentadmission.equals("")  
||studentfname.equals("")||studentmname.equals("")||studentaddress.equal s("")||studentph1.equals("")||studentph2.equals("")) || (studentid.equals("")  && studentname.equals("") && studentdob.equals("") &&  studentmail.equals("") && studentadmission.equals("") &&  studentfname.equals("") && studentmname.equals("") &&  studentaddress.equals("") && studentph1.equals("") &&  
studentph2.equals(""))) 
{ 
JOptionPane.showMessageDialog(frame,"Fill all details"); 
} 
else 
{ 
Class.forName("com.mysql.jdbc.Driver");
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement student_details_stmt=conn.createStatement(); 
int intstudentid =Integer.parseInt(studentid); 
String Student_details_chkqry="Select * from studentdetails  where student_id="+intstudentid+""; 
ResultSet student_details_rs =  
student_details_stmt.executeQuery(Student_details_chkqry); if(student_details_rs.next()) 
{ 
JOptionPane.showMessageDialog(frame,"ID Already  
Exists"); 
} 
else 
{ 
String gender=null; 
if(r1.isSelected()) 
gender="Male"; 
else if(r2.isSelected()) 
gender="Female"; 
value=c6.getSelectedItem().toString(); 
Statement sstudent_details_stmt=conn.createStatement(); 
String student_details_qry="INSERT INTO studentdetails  
VALUES(' "+t1.getText()+" ',' "+t2.getText()+" ',' "+t3.getText()+" ',' "+gender+"  ',' "+t5.getText()+" ',' "+value+" ',' "+t7.getText()+" ',' "+t8.getText()+" ',' 
"+t9.getText()+" ',' "+t10.getText()+" ',' "+t11.getText()+" ',' "+t12.getText()+"  ')"; 
sstudent_details_stmt.executeUpdate(student_details_qry); 
JOptionPane.showMessageDialog(frame,"Details added  
successfully"); 
conn.close(); 
t1.setText("");t2.setText("");t3.setText("");bg.clearSelection();t5.setText( "");t7.setText("");t8.setText("");t9.setText("");t10.setText("");t11.setText("");t1 2.setText(""); 
} }} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
}}}); 
JButton viewstudents = new JButton("VIEW"); 
viewstudents.setBounds(20,480,180,30); 
p3b.add(viewstudents); 
viewstudents.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String dvid=dfunc_id.getText(); 
try 
{
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement dvstmt=conn.createStatement(); 
int intdvid =Integer.parseInt(dvid); 
String chkdvqry="Select * from studentdetails where  
student_id="+intdvid+""; 
ResultSet dvmrs=dvstmt.executeQuery(chkdvqry); 
if(dvmrs.next()) 
{ 
Statement dVistmt=conn.createStatement(); 
ResultSet dVirs=dVistmt.executeQuery(chkdvqry); 
while(dVirs.next()) 
{ 
String idS =dVirs.getString("student_id"); 
String nameS =dVirs.getString("student_name"); 
String dobS =dVirs.getString("student_dob"); 
String genderS=dVirs.getString("student_gender"); 
String mailS =dVirs.getString("student_mail"); 
String classS =dVirs.getString("student_class"); 
String admS =dVirs.getString("student_admission_date"); 
String fnameS=dVirs.getString("student_fathers_name"); 
String mnameS=dVirs.getString("student_mothers_name");
String addressS=dVirs.getString("student_address"); 
String ph1S=dVirs.getString("student_contact1"); 
String ph2S=dVirs.getString("student_contact2"); 
SDV.setText(" SELECTED DETAILS \n \n NAME: "  +nameS+ " \n ID : " +idS+ "\n DOB : " +dobS+ "\n GENDER : " +genderS+ "\n  EMAIL : " +mailS+ "\n CLASS : " +classS+ "\n ADMISSION DATE : " +admS+ "\n  FATHER'S NAME : " +fnameS+ "\n MOTHER'S NAME : " +mnameS+ "\n  ADDRESS : \n" +addressS+ " \n CONTACT : " +ph1S+ "," +ph2S+ "\n"); 
SDV.setEnabled(false); 
} 
} 
else 
{ 
JOptionPane.showMessageDialog(frame,"Id not found for  viewing"); 
dfunc_id.setText(""); 
} 
conn.close(); 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
}}}); 
JButton updatestudents = new JButton("UPDATE"); 
updatestudents.setBounds(210,480,180,30);
p3b.add(updatestudents); 
updatestudents.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String uSid=dfunc_id.getText(); 
try 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement uSstmt=conn.createStatement(); 
int intuSid =Integer.parseInt(uSid); 
String chkuSqry="Select * from studentdetails where  
student_id="+intuSid+""; 
ResultSet uSurs=uSstmt.executeQuery(chkuSqry); 
if(uSurs.next()) 
{ 
JOptionPane.showMessageDialog(frame,"Click Save button after  Updating Values"); 
JOptionPane.showMessageDialog(frame,"Make sure radio buttons  value and drop down values are selected"); 
ResultSet uSrs=uSstmt.executeQuery(chkuSqry);
while(uSrs.next()) 
{ 
t1.setText(uSrs.getString("student_id")); 
t2.setText(uSrs.getString("student_name")); 
t3.setText(uSrs.getString("student_dob")); 
t5.setText(uSrs.getString("student_mail")); 
t7.setText(uSrs.getString("student_admission_date")); t8.setText(uSrs.getString("student_fathers_name")); t9.setText(uSrs.getString("student_mothers_name")); t10.setText(uSrs.getString("student_address")); 
t11.setText(uSrs.getString("student_contact1")); 
t12.setText(uSrs.getString("student_contact2")); 
} 
} 
else 
{ 
JOptionPane.showMessageDialog(frame,"Id not found"); dfunc_id.setText(""); 
} 
conn.close(); 
} 
catch(Exception exc) 
{
JOptionPane.showMessageDialog(frame,exc); } 
}}); 
JButton saveSbtn= new JButton("Save changes"); saveSbtn.setBounds(750,480,200,30); 
p3b.add(saveSbtn); 
saveSbtn.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) { 
String idSD=t1.getText(); 
String nameSD=t2.getText(); 
String dobSD=t3.getText(); 
String mailSD=t5.getText(); 
String valueSD; 
String admSD=t7.getText(); 
String fnameSD=t8.getText(); 
String mnameSD=t9.getText(); 
String addressSD=t10.getText(); 
String ph1SD=t11.getText(); 
String ph2SD=t12.getText(); 
String genderSD=null;
try 
{ 
if(idSD.isEmpty() ||nameSD.isEmpty() ||dobSD.isEmpty()  
||mailSD.isEmpty() ||admSD.isEmpty() ||fnameSD.isEmpty()  ||mnameSD.isEmpty() ||addressSD.isEmpty()  
||ph1SD.isEmpty()||ph2SD.isEmpty() ) 
{ 
JOptionPane.showMessageDialog(frame,"Fill all details"); 
} 
else 
{  
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement SDstmt=conn.createStatement(); 
if(r1.isSelected()) 
genderSD="Male"; 
else if(r2.isSelected()) 
genderSD="Female"; 
String SDgender= String.valueOf(genderSD); 
valueSD=c6.getSelectedItem().toString(); 
SDstmt.executeUpdate("update studentdetails set student_name= '  "+t2.getText()+" ' , student_dob= ' "+t3.getText()+" ' , student_gender='  "+SDgender+" ',student_mail=' "+t5.getText()+" ',student_class=' "+valueSD+"  ', student_admission_date= ' "+t7.getText()+" ', student_fathers_name= ' 
"+t8.getText()+" ', student_mothers_name= ' "+t9.getText()+" ',  student_address= ' "+t10.getText()+" ', student_contact1=' "+t11.getText()+" ',  student_contact2= ' "+t12.getText()+" ' where student_id= '  "+dfunc_id.getText()+" ' "); 
JOptionPane.showMessageDialog(frame,"Successfully Details Updated"); 
conn.close(); 
} 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
}}}); 
JButton deletestudents = new JButton("DELETE"); 
deletestudents.setBounds(400,480,180,30); 
p3b.add(deletestudents); 
deletestudents.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String dSid=dfunc_id.getText(); 
try 
{ 
Class.forName("com.mysql.jdbc.Driver");
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement dSstmt=conn.createStatement(); 
int intdSid =Integer.parseInt(dSid); 
String chkdSqry="Select * from studentdetails where  
student_id="+intdSid+""; 
ResultSet dSrs=dSstmt.executeQuery(chkdSqry); 
if(dSrs.next()) 
{ 
String SDqry="DELETE FROM studentdetails WHERE  
student_id="+dfunc_id.getText()+""; 
dSstmt.executeUpdate(SDqry); 
JOptionPane.showMessageDialog(frame,"Details Successfully deleted"); conn.close(); 
} 
else 
{ 
JOptionPane.showMessageDialog(frame,"Id not found"); 
} 
dfunc_id.setText(""); 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc);
}}}); 
JLabel pics=new JLabel(); 
pics.setIcon(new ImageIcon("picb.jpeg")); 
pics.setBounds(600,110,612,408); 
p3c.add(pics); 
JLabel title3b=new JLabel("STUDENT MARK DETAILS"); title3b.setFont(new Font("Times New Roman",Font.BOLD,30)); title3b.setForeground(Color.magenta); 
title3b.setBounds(420,10,500,40); 
p3c.add(title3b); 
JLabel ml1=new JLabel("STUDENT ID:"); 
ml1.setFont(new Font("Times New Roman",Font.BOLD,20)); ml1.setForeground(Color.black); 
ml1.setBounds(20,50,300,30); 
p3c.add(ml1); 
JTextField mt1=new JTextField(); 
mt1.setBounds(160,50,200,30); 
mt1.setColumns(100); 
p3c.add(mt1); 
JLabel ml2=new JLabel("NAME:"); 
ml2.setFont(new Font("Times New Roman",Font.BOLD,20)); ml2.setForeground(Color.black); 
ml2.setBounds(20,90,300,30);
p3c.add(ml2); 
JTextField mt2=new JTextField(); 
mt2.setBounds(160,90,200,30); 
mt2.setColumns(100); 
p3c.add(mt2); 
JLabel ml3=new JLabel("TAMIL:"); 
ml3.setFont(new Font("Times New Roman",Font.BOLD,20)); ml3.setForeground(Color.black); 
ml3.setBounds(20,130,300,30); 
p3c.add(ml3); 
JTextField mt3=new JTextField(); 
mt3.setBounds(160,130,200,30); 
mt3.setColumns(100); 
p3c.add(mt3); 
JLabel ml4=new JLabel("ENGLISH:"); 
ml4.setFont(new Font("Times New Roman",Font.BOLD,20)); ml4.setForeground(Color.black); 
ml4.setBounds(20,170,300,30); 
p3c.add(ml4); 
JTextField mt4=new JTextField(); 
mt4.setBounds(160,170,200,30); 
mt4.setColumns(100); 
p3c.add(mt4);
JLabel ml5=new JLabel("MATHS:"); 
ml5.setFont(new Font("Times New Roman",Font.BOLD,20)); ml5.setForeground(Color.black); 
ml5.setBounds(20,210,300,30); 
p3c.add(ml5); 
JTextField mt5=new JTextField(); 
mt5.setBounds(160,210,200,30); 
mt5.setColumns(100); 
p3c.add(mt5); 
JLabel ml6=new JLabel("SCIENCE:"); 
ml6.setFont(new Font("Times New Roman",Font.BOLD,20)); ml6.setForeground(Color.black); 
ml6.setBounds(20,250,300,30); 
p3c.add(ml6); 
JTextField mt6=new JTextField(); 
mt6.setBounds(160,250,200,30); 
mt6.setColumns(100); 
p3c.add(mt6); 
JLabel ml7=new JLabel("SOCIAL:"); 
ml7.setFont(new Font("Times New Roman",Font.BOLD,20)); ml7.setForeground(Color.black); 
ml7.setBounds(20,290,300,30); 
p3c.add(ml7);
JTextField mt7=new JTextField(); 
mt7.setBounds(160,290,200,30); 
mt7.setColumns(100); 
p3c.add(mt7); 
JButton mb1= new JButton("Total marks"); 
mb1.setBounds(110,335,170,30); 
p3c.add(mb1); 
JLabel ml8=new JLabel("TOTAL"); 
ml8.setFont(new Font("Times New Roman",Font.BOLD,20)); ml8.setForeground(Color.black); 
ml8.setBounds(20,380,300,30); 
p3c.add(ml8); 
JTextField mt8=new JTextField(); 
mt8.setBounds(160,380,200,30); 
mt8.setColumns(100); 
p3c.add(mt8); 
JLabel SLabel=new JLabel("For View, Update and Delete, search using ID"); SLabel.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,30)); SLabel.setForeground(Color.cyan); 
SLabel.setBounds(380,65,800,30); 
p3c.add(SLabel); 
JLabel Lfunc_id=new JLabel("Enter Id:"); 
Lfunc_id.setFont(new Font("Times New Roman",Font.ITALIC,25));
Lfunc_id.setForeground(Color.pink); 
Lfunc_id.setBounds(380,110,100,30); 
p3c.add(Lfunc_id); 
JTextField func_id=new JTextField(); 
func_id.setBounds(380,140,200,30); 
func_id.setColumns(100); 
p3c.add(func_id); 
JButton ref = new JButton("REFRESH"); 
ref.setBounds(380,460,200,30); 
p3c.add(ref); 
ref.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
mt1.setEnabled(true);mt2.setEnabled(true);mt3.setEnabled(true);mt4.setEnab led(true); 
mt5.setEnabled(true);mt6.setEnabled(true);mt7.setEnabled(true);mt8.setEnab led(true); 
func_id.setText("");mt1.setText("");mt2.setText("");mt3.setText("");mt4.setTex t("");mt5.setText("");mt6.setText("");mt7.setText("");mt8.setText(""); 
} 
}); 
mb1.addActionListener(
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String id=mt1.getText(); 
String name=mt2.getText(); 
String tam=mt3.getText(); 
String eng=mt4.getText(); 
String mat=mt5.getText(); 
String sci=mt6.getText(); 
String soc=mt7.getText(); 
try 
{ 
if((id.equals("")||name.equals(""))||(id.equals("")&&name.equals(""))) { 
if(id.equals("")) 
JOptionPane.showMessageDialog(frame,"Enter ID"); 
else if(name.equals("")) 
JOptionPane.showMessageDialog(frame,"Enter Name"); 
} 
else if((tam.equals("") || eng.equals("") || mat.equals("") ||  sci.equals("") || soc.equals(""))||(tam.equals("") && eng.equals("") &&  mat.equals("") && sci.equals("") && soc.equals(""))) 
{
JOptionPane.showMessageDialog(frame,"Fill all details"); } 
else 
{ 
JOptionPane.showMessageDialog(frame,"See your total marks  down"); 
int a=Integer.parseInt(tam); 
int b=Integer.parseInt(eng); 
int c=Integer.parseInt(mat); 
int d=Integer.parseInt(sci); 
int e=Integer.parseInt(soc); 
int tot=0; 
if(ae.getSource()==mb1) 
tot=a+b+c+d+e; 
String totalmarks=String.valueOf(tot); 
mt8.setText(totalmarks); 
} 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
}}}); 
JButton addmarks = new JButton("Add"); 
addmarks.setBounds(110,435,170,30);
p3c.add(addmarks); 
addmarks.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String id=mt1.getText(); 
String name=mt2.getText(); 
String tam=mt3.getText(); 
String eng=mt4.getText(); 
String mat=mt5.getText(); 
String sci=mt6.getText(); 
String soc=mt7.getText(); 
try 
{ 
if((id.equals("")||name.equals("")||tam.equals("") || eng.equals("") ||  mat.equals("") || sci.equals("") || soc.equals(""))||(id.equals("") &&  name.equals("") &&tam.equals("") && eng.equals("") && mat.equals("") &&  sci.equals("") && soc.equals(""))) 
{ 
JOptionPane.showMessageDialog(frame,"Fill all details"); 
} 
else 
{
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement stmt=conn.createStatement(); 
int intid =Integer.parseInt(id); 
String chkqry="Select * from studentmarks where 
student_id="+intid+""; 
ResultSet mrs=stmt.executeQuery(chkqry); 
if(mrs.next()) 
{ 
JOptionPane.showMessageDialog(frame,"ID Already  
Exists"); 
} 
else 
{ 
String mqry="INSERT INTO  
studentmarks(student_id,student_name,tamil,english,maths,science,social,tot al)  
VALUES('"+mt1.getText()+"','"+mt2.getText()+"','"+mt3.getText()+"','"+mt4.get Text()+"','"+mt5.getText()+"','"+mt6.getText()+"','"+mt7.getText()+"','"+mt8.get Text()+"')"; 
stmt.executeUpdate(mqry); 
JOptionPane.showMessageDialog(frame,"Marks added  
successfully"); 
conn.close();
func_id.setText("");mt1.setText("");mt2.setText("");mt3.setText("");mt4. setText("");mt5.setText("");mt6.setText("");mt7.setText("");mt8.setText(""); 
}}} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
}}}); 
JButton viewmarks = new JButton("VIEW"); 
viewmarks.setBounds(380,220,200,30); 
p3c.add(viewmarks); 
viewmarks.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String vid=func_id.getText(); 
try 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement vstmt=conn.createStatement(); 
int intvid =Integer.parseInt(vid);
String chkvqry="Select * from studentmarks where  
student_id="+intvid+""; 
ResultSet vmrs=vstmt.executeQuery(chkvqry); 
if(vmrs.next()) 
{ 
Statement Vistmt=conn.createStatement(); 
ResultSet Virs=Vistmt.executeQuery(chkvqry); 
while(Virs.next()) 
{ 
mt1.setText(Virs.getString("student_id")); 
mt2.setText(Virs.getString("student_name")); 
mt3.setText(Virs.getString("tamil")); 
mt4.setText(Virs.getString("english")); 
mt5.setText(Virs.getString("maths")); 
mt6.setText(Virs.getString("science")); 
mt7.setText(Virs.getString("social")); 
mt8.setText(Virs.getString("total")); 
mt1.setEnabled(false);mt2.setEnabled(false);mt3.setEnabled(false);mt4. setEnabled(false); 
mt5.setEnabled(false);mt6.setEnabled(false);mt7.setEnabled(false);mt8. setEnabled(false); 
} 
} 
else 
{
JOptionPane.showMessageDialog(frame,"Id not found for  viewing"); 
func_id.setText(""); 
} 
conn.close(); 
} 
catch(Exception exc) 
{ 
JOptionPane.showMessageDialog(frame,exc); 
} 
}}); 
JButton updatemarks = new JButton("UPDATE"); 
updatemarks.setBounds(380,280,200,30); 
p3c.add(updatemarks); 
updatemarks.addActionListener( 
new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
String uid=func_id.getText(); 
try 
{ 
Class.forName("com.mysql.jdbc.Driver");
Connection  
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","ro ot",""); 
Statement ustmt=conn.createStatement(); 
int intuid =Integer.parseInt(uid); 
String chkuqry="Select * from studentmarks where  
student_id="+intuid+""; 
ResultSet umrs=ustmt.executeQuery(chkuqry); 
if(umrs.next()) 
{ 
JOptionPane.showMessageDialog(frame,"Click Save button after  Updating Values"); 
Statement Upstmt=conn.createStatement(); 
ResultSet Uprs=Upstmt.executeQuery(chkuqry); 
while(Uprs.next()) 
{ 
mt1.setText(Uprs.getString("student_id")); 
mt2.setText(Uprs.getString("student_name")); 
mt3.setText(Uprs.getString("tamil")); 
mt4.setText(Uprs.getString("english")); 
mt5.setText(Uprs.getString("maths")); 
mt6.setText(Uprs.getString("science")); 
mt7.setText(Uprs.getString("social")); 
mt8.setText(Uprs.getString("total")); 
}
