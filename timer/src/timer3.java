
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import static java.lang.Thread.sleep;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class timer3 extends javax.swing.JFrame {
       
       Color g=Color.decode("#32cd32");
       int giftcount=0; 
       String text="";
       static int total=0;
       static int reset=0;
       boolean hide=false;
       String text1="";
       static int count=0; //GEREKSİZ OLABİLİR DİKKAT ET
       
       
       Thread t1=new Thread();
       private Object lock1 = new Object();
       static boolean state1=true;
       static int millisecond1=0;
       static int fivesecond1=301;
       static int tensecond1=601;
       static int ortak1=0;
       static boolean kosul1=true;
       boolean sound1=true;
       boolean resetb1=false;
       boolean giftb1=false;
       int count1=0;
       boolean paused1=false;
       
       
       Thread t2=new Thread();
       private Object lock2 = new Object();
       static boolean state2=true;
       static int millisecond2=0;
       static int fivesecond2=301;
       static int tensecond2=601;
       static int ortak2=0;
       static boolean kosul2=true;
       boolean sound2=true;
       boolean resetb2=false;
       boolean giftb2=false;
       int count2=0;
       boolean paused2=false;
       
       Thread t3=new Thread();
       private Object lock3 = new Object();
       static boolean state3=true;
       static int millisecond3=0;
       static int fivesecond3=301;
       static int tensecond3=601;
       static int ortak3=0;
       static boolean kosul3=true;
       boolean sound3=true;
       boolean resetb3=false;
       boolean giftb3=false;
       int count3=0;
       boolean paused3=false;
       
       Thread t4=new Thread();
       private Object lock4 = new Object();
       static boolean state4=true;
       static int millisecond4=0;
       static int fivesecond4=301;
       static int tensecond4=601;
       static int ortak4=0;
       static boolean kosul4=true;
       boolean sound4=true;
       boolean resetb4=false;
       boolean giftb4=false;
       int count4=0;
       boolean paused4=false;
       
       Thread t5=new Thread();
       private Object lock5 = new Object();
       static boolean state5=true;
       static int millisecond5=0;
       static int fivesecond5=301;
       static int tensecond5=601;
       static int ortak5=0;
       static boolean kosul5=true;
       boolean sound5=true;
       boolean resetb5=false;
       boolean giftb5=false;
       int count5=0;
       boolean paused5=false;
       
       Thread t6=new Thread();
       private Object lock6 = new Object();
       static boolean state6=true;
       static int millisecond6=0;
       static int fivesecond6=301;
       static int tensecond6=601;
       static int ortak6=0;
       static boolean kosul6=true;
       boolean sound6=true;
       boolean resetb6=false;
       boolean giftb6=false;
       int count6=0;
       boolean paused6=false;
       
       Thread t7=new Thread();
       private Object lock7 = new Object();
       static boolean state7=true;
       static int millisecond7=0;
       static int fivesecond7=301;
       static int tensecond7=601;
       static int ortak7=0;
       static boolean kosul7=true;
       boolean sound7=true;
       boolean resetb7=false;
       boolean giftb7=false;
       int count7=0;
       boolean paused7=false;
       
       Thread t8=new Thread();
       private Object lock8 = new Object();
       static boolean state8=true;
       static int millisecond8=0;
       static int fivesecond8=301;
       static int tensecond8=601;
       static int ortak8=0;
       static boolean kosul8=true;
       boolean sound8=true;
       boolean resetb8=false;
       boolean giftb8=false;
       int count8=0;
       boolean paused8=false;
       
       Thread t9=new Thread();
       private Object lock9 = new Object();
       static boolean state9=true;
       static int millisecond9=0;
       static int fivesecond9=301;
       static int tensecond9=601;
       static int ortak9=0;
       static boolean kosul9=true;
       boolean sound9=true;
       boolean resetb9=false;
       boolean giftb9=false;
       int count9=0;
       boolean paused9=false;
       
       Thread t10=new Thread();
       private Object lock10 = new Object();
       static boolean state10=true;
       static int millisecond10=0;
       static int fivesecond10=301;
       static int tensecond10=601;
       static int ortak10=0;
       static boolean kosul10=true;
       boolean sound10=true;
       boolean resetb10=false;
       boolean giftb10=false;
       int count10=0;
       boolean paused10=false;
       
       Thread t11=new Thread();
       private Object lock11 = new Object();      
       static boolean state11=true;
       static int millisecond11=0;
       static int fivesecond11=301;
       static int tensecond11=601;
       static int ortak11=0;
       static boolean kosul11=true;
       boolean sound11=true;
       boolean resetb11=false;
       boolean giftb11=false;
       int count11=0;
       boolean paused11=false;
       
       Thread t12=new Thread();
       private Object lock12 = new Object();
       static boolean state12=true;
       static int millisecond12=0;
       static int fivesecond12=301;
       static int tensecond12=601;
       static int ortak12=0;
       static boolean kosul12=true;
       boolean sound12=true;
       boolean resetb12=false;
       boolean giftb12=false;
       int count12=0;
       boolean paused12=false;
       
       Thread t13=new Thread();
       private Object lock13 = new Object();
       static boolean state13=true;
       static int millisecond13=0;
       static int fivesecond13=301;
       static int tensecond13=601;
       static int ortak13=0;
       static boolean kosul13=true;
       boolean sound13=true;
       boolean resetb13=false;
       boolean giftb13=false;
       int count13=0;
       boolean paused13=false;
       
       Thread t14=new Thread();
       private Object lock14 = new Object();
       static boolean state14=true;
       static int millisecond14=0;
       static int fivesecond14=301;
       static int tensecond14=601;
       static int ortak14=0;
       static boolean kosul14=true;
       boolean sound14=true;
       boolean resetb14=false;
       boolean giftb14=false;
       int count14=0;
       boolean paused14=false;
       
       Thread t15=new Thread();
       private Object lock15 = new Object();
       static boolean state15=true;
       static int millisecond15=0;
       static int fivesecond15=301;
       static int tensecond15=601;
       static int ortak15=0;
       static boolean kosul15=true;
       boolean sound15=true;
       boolean resetb15=false;
       boolean giftb15=false;
       int count15=0;
       boolean paused15=false;
       
       Thread t16=new Thread();
       private Object lock16 = new Object();
       static boolean state16=true;
       static int millisecond16=0;
       static int fivesecond16=301;
       static int tensecond16=601;
       static int ortak16=0;
       static boolean kosul16=true;
       boolean sound16=true;
       boolean resetb16=false;
       boolean giftb16=false;
       int count16=0;
       boolean paused16=false;
       
       Thread t17=new Thread();
       private Object lock17 = new Object();
       static boolean state17=true;
       static int millisecond17=0;
       static int fivesecond17=301;
       static int tensecond17=601;
       static int ortak17=0;
       static boolean kosul17=true;
       boolean sound17=true;
       boolean resetb17=false;
       boolean giftb17=false;
       int count17=0;
       boolean paused17=false;
       
       Thread t18=new Thread();
       private Object lock18 = new Object();
       static boolean state18=true;
       static int millisecond18=0;
       static int fivesecond18=301;
       static int tensecond18=601;
       static int ortak18=0;
       static boolean kosul18=true;
       boolean sound18=true;
       boolean resetb18=false;
       boolean giftb18=false;
       int count18=0;
       boolean paused18=false;
       
       Thread t19=new Thread();
       private Object lock19 = new Object();
       static boolean state19=true;
       static int millisecond19=0;
       static int fivesecond19=301;
       static int tensecond19=601;
       static int ortak19=0;
       static boolean kosul19=true;
       boolean sound19=true;
       boolean resetb19=false;
       boolean giftb19=false;
       int count19=0;
       boolean paused19=false;
       
       Thread t20=new Thread();
       private Object lock20 = new Object();
       static boolean state20=true;
       static int millisecond20=0;
       static int fivesecond20=301;
       static int tensecond20=601;
       static int ortak20=0;
       static boolean kosul20=true;
       boolean sound20=true;
       boolean resetb20=false;
       boolean giftb20=false;
       int count20=0;
       boolean paused20=false;
       
       Thread t21=new Thread();
       private Object lock21 = new Object();
       static boolean state21=true;
       static int millisecond21=0;
       static int fivesecond21=301;
       static int tensecond21=601;
       static int ortak21=0;
       static boolean kosul21=true;
       boolean sound21=true;
       boolean resetb21=false;
       boolean giftb21=false;
       int count21=0;
       boolean paused21=false;
       
       Thread t22=new Thread();
       private Object lock22 = new Object();
       static boolean state22=true;
       static int millisecond22=0;
       static int fivesecond22=301;
       static int tensecond22=601;
       static int ortak22=0;
       static boolean kosul22=true;
       boolean sound22=true;
       boolean resetb22=false;
       boolean giftb22=false;
       int count22=0;
       boolean paused22=false;
       
       Thread t23=new Thread();
       private Object lock23 = new Object();
       static boolean state23=true;
       static int millisecond23=0;
       static int fivesecond23=301;
       static int tensecond23=601;
       static int ortak23=0;
       static boolean kosul23=true;
       boolean sound23=true;
       boolean resetb23=false;
       boolean giftb23=false;
       int count23=0;
       boolean paused23=false;
       
       Thread t24=new Thread();
       private Object lock24 = new Object();
       static boolean state24=true;
       static int millisecond24=0;
       static int fivesecond24=301;
       static int tensecond24=601;
       static int ortak24=0;
       static boolean kosul24=true;
       boolean sound24=true;
       boolean resetb24=false;
       boolean giftb24=false;
       int count24=0;
       boolean paused24=false;
    /**
     * Creates new form timer3
     */
    public timer3() throws IOException  {
        initComponents();
        jPanel1.setBackground(Color.decode("#75CEFC"));
        label1.setBackground(Color.yellow);
        label2.setBackground(Color.yellow);
        label3.setBackground(Color.yellow);
        label4.setBackground(Color.yellow);
        label5.setBackground(Color.yellow);
        label6.setBackground(Color.yellow);
        label7.setBackground(Color.yellow);
        label8.setBackground(Color.yellow);
        label9.setBackground(Color.yellow);
        label10.setBackground(Color.yellow);
        label11.setBackground(Color.yellow);
        label12.setBackground(Color.yellow);
        label13.setBackground(Color.yellow);
        label14.setBackground(Color.yellow);
        label15.setBackground(Color.yellow);
        label16.setBackground(Color.yellow);
        label17.setBackground(Color.yellow);
        label18.setBackground(Color.yellow);
        label19.setBackground(Color.yellow);
        label20.setBackground(Color.yellow);
        label21.setBackground(Color.yellow);
        label22.setBackground(Color.yellow);
        label23.setBackground(Color.yellow);
        label24.setBackground(Color.yellow);
        money1.setText("ALINMADI");
        money1.setBackground(Color.RED);
        money2.setText("ALINMADI");
        money2.setBackground(Color.RED);
        money3.setText("ALINMADI");
        money3.setBackground(Color.RED);
        money4.setText("ALINMADI");
        money4.setBackground(Color.RED);
        money5.setText("ALINMADI");
        money5.setBackground(Color.RED);
        money6.setText("ALINMADI");
        money6.setBackground(Color.RED);
        money7.setText("ALINMADI");
        money7.setBackground(Color.RED);
        money8.setText("ALINMADI");
        money8.setBackground(Color.RED);
        money9.setText("ALINMADI");
        money9.setBackground(Color.RED);
        money10.setText("ALINMADI");
        money10.setBackground(Color.RED);
        money11.setText("ALINMADI");
        money11.setBackground(Color.RED);
        money12.setText("ALINMADI");
        money12.setBackground(Color.RED);
        money13.setText("ALINMADI");
        money13.setBackground(Color.RED);
        money14.setText("ALINMADI");
        money14.setBackground(Color.RED);
        money15.setText("ALINMADI");
        money15.setBackground(Color.RED);
        money16.setText("ALINMADI");
        money16.setBackground(Color.RED);
        money17.setText("ALINMADI");
        money17.setBackground(Color.RED);
        money18.setText("ALINMADI");
        money18.setBackground(Color.RED);
        money19.setText("ALINMADI");
        money19.setBackground(Color.RED);
        money20.setText("ALINMADI");
        money20.setBackground(Color.RED);
        money21.setText("ALINMADI");
        money21.setBackground(Color.RED);
        money22.setText("ALINMADI");
        money22.setBackground(Color.RED);
        money23.setText("ALINMADI");
        money23.setBackground(Color.RED);
        money24.setText("ALINMADI");
        money24.setBackground(Color.RED);
        time();
        existFile();
        st1.setText("STANDTA");
        st1.setBackground(g);
        st2.setText("STANDTA");
        st2.setBackground(g);
        st3.setText("STANDTA");
        st3.setBackground(g);
        st4.setText("STANDTA");
        st4.setBackground(g);
        st5.setText("STANDTA");
        st5.setBackground(g);
        st6.setText("STANDTA");
        st6.setBackground(g);
        st7.setText("STANDTA");
        st7.setBackground(g);
        st8.setText("STANDTA");
        st8.setBackground(g);
        st9.setText("STANDTA");
        st9.setBackground(g);
        st10.setText("STANDTA");
        st10.setBackground(g);
        st11.setText("STANDTA");
        st11.setBackground(g);
        st12.setText("STANDTA");
        st12.setBackground(g);
        st13.setText("STANDTA");
        st13.setBackground(g);
        st14.setText("STANDTA");
        st14.setBackground(g);
        st15.setText("STANDTA");
        st15.setBackground(g);
        st16.setText("STANDTA");
        st16.setBackground(g);
        st17.setText("STANDTA");
        st17.setBackground(g);
        st18.setText("STANDTA");
        st18.setBackground(g);
        st19.setText("STANDTA");
        st19.setBackground(g);
        st20.setText("STANDTA");
        st20.setBackground(g);
        st21.setText("STANDTA");
        st21.setBackground(g);
        st22.setText("STANDTA");
        st22.setBackground(g);
        st23.setText("STANDTA");
        st23.setBackground(g);
        st24.setText("STANDTA");
        st24.setBackground(g);
        Image pauseIcon=null;
        pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
        gift1.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift2.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift3.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift4.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift5.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift6.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift7.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift8.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift9.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift10.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift11.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift12.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift13.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift14.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift15.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift16.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift17.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift18.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift19.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift20.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift21.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift22.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift23.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        gift24.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
        
        gift1.addActionListener(pauseResume1);
        gift2.addActionListener(pauseResume2);
        gift3.addActionListener(pauseResume3);
        gift4.addActionListener(pauseResume4);
        gift5.addActionListener(pauseResume5);
        gift6.addActionListener(pauseResume6);
        gift7.addActionListener(pauseResume7);
        gift8.addActionListener(pauseResume8);
        gift9.addActionListener(pauseResume9);
        gift10.addActionListener(pauseResume10);
        gift11.addActionListener(pauseResume11);
        gift12.addActionListener(pauseResume12);
        gift13.addActionListener(pauseResume13);
        gift14.addActionListener(pauseResume14);
        gift15.addActionListener(pauseResume15);
        gift16.addActionListener(pauseResume16);
        gift17.addActionListener(pauseResume17);
        gift18.addActionListener(pauseResume18);
        gift19.addActionListener(pauseResume19);
        gift20.addActionListener(pauseResume20);
        gift21.addActionListener(pauseResume21);
        gift22.addActionListener(pauseResume22);
        gift23.addActionListener(pauseResume23);
        gift24.addActionListener(pauseResume24);
        
        
        
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        stop1 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        five1 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        ten1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        gift2 = new javax.swing.JButton();
        five2 = new javax.swing.JButton();
        stop2 = new javax.swing.JButton();
        reset2 = new javax.swing.JButton();
        money1 = new javax.swing.JTextField();
        time = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        money2 = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        gift3 = new javax.swing.JButton();
        five3 = new javax.swing.JButton();
        reset3 = new javax.swing.JButton();
        money3 = new javax.swing.JTextField();
        stop3 = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        gift4 = new javax.swing.JButton();
        five4 = new javax.swing.JButton();
        reset4 = new javax.swing.JButton();
        money4 = new javax.swing.JTextField();
        stop4 = new javax.swing.JButton();
        label5 = new javax.swing.JLabel();
        gift5 = new javax.swing.JButton();
        five5 = new javax.swing.JButton();
        reset5 = new javax.swing.JButton();
        money5 = new javax.swing.JTextField();
        stop5 = new javax.swing.JButton();
        label6 = new javax.swing.JLabel();
        gift6 = new javax.swing.JButton();
        five6 = new javax.swing.JButton();
        reset6 = new javax.swing.JButton();
        money6 = new javax.swing.JTextField();
        stop6 = new javax.swing.JButton();
        label7 = new javax.swing.JLabel();
        gift7 = new javax.swing.JButton();
        five7 = new javax.swing.JButton();
        reset7 = new javax.swing.JButton();
        money7 = new javax.swing.JTextField();
        stop7 = new javax.swing.JButton();
        label8 = new javax.swing.JLabel();
        gift8 = new javax.swing.JButton();
        five8 = new javax.swing.JButton();
        reset8 = new javax.swing.JButton();
        money8 = new javax.swing.JTextField();
        stop8 = new javax.swing.JButton();
        label9 = new javax.swing.JLabel();
        gift9 = new javax.swing.JButton();
        five9 = new javax.swing.JButton();
        reset9 = new javax.swing.JButton();
        money9 = new javax.swing.JTextField();
        stop9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        gift10 = new javax.swing.JButton();
        five10 = new javax.swing.JButton();
        stop10 = new javax.swing.JButton();
        reset10 = new javax.swing.JButton();
        money10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        gift11 = new javax.swing.JButton();
        five11 = new javax.swing.JButton();
        stop11 = new javax.swing.JButton();
        reset11 = new javax.swing.JButton();
        money11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        gift12 = new javax.swing.JButton();
        five12 = new javax.swing.JButton();
        stop12 = new javax.swing.JButton();
        reset12 = new javax.swing.JButton();
        money12 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        gift13 = new javax.swing.JButton();
        five13 = new javax.swing.JButton();
        stop13 = new javax.swing.JButton();
        reset13 = new javax.swing.JButton();
        money13 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        gift14 = new javax.swing.JButton();
        five14 = new javax.swing.JButton();
        stop14 = new javax.swing.JButton();
        reset14 = new javax.swing.JButton();
        money14 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        gift15 = new javax.swing.JButton();
        five15 = new javax.swing.JButton();
        stop15 = new javax.swing.JButton();
        reset15 = new javax.swing.JButton();
        money15 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        label16 = new javax.swing.JLabel();
        gift16 = new javax.swing.JButton();
        five16 = new javax.swing.JButton();
        stop16 = new javax.swing.JButton();
        reset16 = new javax.swing.JButton();
        money16 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        label17 = new javax.swing.JLabel();
        gift17 = new javax.swing.JButton();
        five17 = new javax.swing.JButton();
        stop17 = new javax.swing.JButton();
        reset17 = new javax.swing.JButton();
        money17 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        label18 = new javax.swing.JLabel();
        gift18 = new javax.swing.JButton();
        five18 = new javax.swing.JButton();
        stop18 = new javax.swing.JButton();
        reset18 = new javax.swing.JButton();
        money18 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        label19 = new javax.swing.JLabel();
        gift19 = new javax.swing.JButton();
        five19 = new javax.swing.JButton();
        stop19 = new javax.swing.JButton();
        reset19 = new javax.swing.JButton();
        money19 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        label20 = new javax.swing.JLabel();
        gift20 = new javax.swing.JButton();
        five20 = new javax.swing.JButton();
        stop20 = new javax.swing.JButton();
        reset20 = new javax.swing.JButton();
        money20 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        label21 = new javax.swing.JLabel();
        gift21 = new javax.swing.JButton();
        five21 = new javax.swing.JButton();
        stop21 = new javax.swing.JButton();
        reset21 = new javax.swing.JButton();
        money21 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        label22 = new javax.swing.JLabel();
        gift22 = new javax.swing.JButton();
        five22 = new javax.swing.JButton();
        stop22 = new javax.swing.JButton();
        reset22 = new javax.swing.JButton();
        money22 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        label23 = new javax.swing.JLabel();
        gift23 = new javax.swing.JButton();
        five23 = new javax.swing.JButton();
        stop23 = new javax.swing.JButton();
        reset23 = new javax.swing.JButton();
        money23 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        label24 = new javax.swing.JLabel();
        gift24 = new javax.swing.JButton();
        five24 = new javax.swing.JButton();
        stop24 = new javax.swing.JButton();
        reset24 = new javax.swing.JButton();
        money24 = new javax.swing.JTextField();
        jButton97 = new javax.swing.JButton();
        st1 = new javax.swing.JTextField();
        st2 = new javax.swing.JTextField();
        st3 = new javax.swing.JTextField();
        st4 = new javax.swing.JTextField();
        st5 = new javax.swing.JTextField();
        st6 = new javax.swing.JTextField();
        st7 = new javax.swing.JTextField();
        st8 = new javax.swing.JTextField();
        st9 = new javax.swing.JTextField();
        st10 = new javax.swing.JTextField();
        st11 = new javax.swing.JTextField();
        st12 = new javax.swing.JTextField();
        st13 = new javax.swing.JTextField();
        st14 = new javax.swing.JTextField();
        st15 = new javax.swing.JTextField();
        st16 = new javax.swing.JTextField();
        st17 = new javax.swing.JTextField();
        st18 = new javax.swing.JTextField();
        st19 = new javax.swing.JTextField();
        st20 = new javax.swing.JTextField();
        st21 = new javax.swing.JTextField();
        st22 = new javax.swing.JTextField();
        st23 = new javax.swing.JTextField();
        st24 = new javax.swing.JTextField();
        ten2 = new javax.swing.JButton();
        ten3 = new javax.swing.JButton();
        ten4 = new javax.swing.JButton();
        ten5 = new javax.swing.JButton();
        ten6 = new javax.swing.JButton();
        ten7 = new javax.swing.JButton();
        ten8 = new javax.swing.JButton();
        ten9 = new javax.swing.JButton();
        ten10 = new javax.swing.JButton();
        ten11 = new javax.swing.JButton();
        ten12 = new javax.swing.JButton();
        ten13 = new javax.swing.JButton();
        ten14 = new javax.swing.JButton();
        ten15 = new javax.swing.JButton();
        ten16 = new javax.swing.JButton();
        ten17 = new javax.swing.JButton();
        ten18 = new javax.swing.JButton();
        ten19 = new javax.swing.JButton();
        ten20 = new javax.swing.JButton();
        ten21 = new javax.swing.JButton();
        ten22 = new javax.swing.JButton();
        ten23 = new javax.swing.JButton();
        ten24 = new javax.swing.JButton();
        gift1 = new javax.swing.JButton();
        ekran = new java.awt.List();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UMUT");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));

        stop1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop1.setText("STOP");
        stop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop1ActionPerformed(evt);
            }
        });

        reset1.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset1.setText("RESET");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        five1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five1.setText("5 DK");
        five1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five1ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("0");
        label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label1.setOpaque(true);

        ten1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten1.setText("10 DK");
        ten1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("RESET:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("GEÇERLİ BİNİŞ:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("0");
        label2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label2.setOpaque(true);

        gift2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift2ActionPerformed(evt);
            }
        });

        five2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five2.setText("5 DK");
        five2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five2ActionPerformed(evt);
            }
        });

        stop2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop2.setText("STOP");
        stop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop2ActionPerformed(evt);
            }
        });

        reset2.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset2.setText("RESET");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });

        money1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money1.setText("ALINMADI");
        money1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money1MouseClicked(evt);
            }
        });

        time.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("ZAMAN");
        time.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        money2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money2.setText("ALINMADI");
        money2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money2MouseClicked(evt);
            }
        });

        label3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("0");
        label3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label3.setOpaque(true);

        gift3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift3ActionPerformed(evt);
            }
        });

        five3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five3.setText("5 DK");
        five3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five3ActionPerformed(evt);
            }
        });

        reset3.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset3.setText("RESET");
        reset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset3ActionPerformed(evt);
            }
        });

        money3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money3.setText("ALINMADI");
        money3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money3MouseClicked(evt);
            }
        });

        stop3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop3.setText("STOP");
        stop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop3ActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("0");
        label4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label4.setOpaque(true);

        gift4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift4ActionPerformed(evt);
            }
        });

        five4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five4.setText("5 DK");
        five4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five4ActionPerformed(evt);
            }
        });

        reset4.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset4.setText("RESET");
        reset4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset4ActionPerformed(evt);
            }
        });

        money4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money4.setText("ALINMADI");
        money4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money4MouseClicked(evt);
            }
        });

        stop4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop4.setText("STOP");
        stop4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop4ActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setText("0");
        label5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label5.setOpaque(true);

        gift5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift5ActionPerformed(evt);
            }
        });

        five5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five5.setText("5 DK");
        five5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five5ActionPerformed(evt);
            }
        });

        reset5.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset5.setText("RESET");
        reset5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset5ActionPerformed(evt);
            }
        });

        money5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money5.setText("ALINMADI");
        money5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money5MouseClicked(evt);
            }
        });

        stop5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop5.setText("STOP");
        stop5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop5ActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label6.setText("0");
        label6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label6.setOpaque(true);

        gift6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift6ActionPerformed(evt);
            }
        });

        five6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five6.setText("5 DK");
        five6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five6ActionPerformed(evt);
            }
        });

        reset6.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset6.setText("RESET");
        reset6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset6ActionPerformed(evt);
            }
        });

        money6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money6.setText("ALINMADI");
        money6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money6MouseClicked(evt);
            }
        });

        stop6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop6.setText("STOP");
        stop6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop6ActionPerformed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setText("0");
        label7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label7.setOpaque(true);

        gift7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift7ActionPerformed(evt);
            }
        });

        five7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five7.setText("5 DK");
        five7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five7ActionPerformed(evt);
            }
        });

        reset7.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset7.setText("RESET");
        reset7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset7ActionPerformed(evt);
            }
        });

        money7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money7.setText("ALINMADI");
        money7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money7MouseClicked(evt);
            }
        });

        stop7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop7.setText("STOP");
        stop7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop7ActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label8.setText("0");
        label8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label8.setOpaque(true);

        gift8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift8ActionPerformed(evt);
            }
        });

        five8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five8.setText("5 DK");
        five8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five8ActionPerformed(evt);
            }
        });

        reset8.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset8.setText("RESET");
        reset8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset8ActionPerformed(evt);
            }
        });

        money8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money8.setText("ALINMADI");
        money8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money8MouseClicked(evt);
            }
        });

        stop8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop8.setText("STOP");
        stop8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop8ActionPerformed(evt);
            }
        });

        label9.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setText("0");
        label9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label9.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label9.setOpaque(true);

        gift9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift9ActionPerformed(evt);
            }
        });

        five9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five9.setText("5 DK");
        five9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five9ActionPerformed(evt);
            }
        });

        reset9.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset9.setText("RESET");
        reset9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset9ActionPerformed(evt);
            }
        });

        money9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money9.setText("ALINMADI");
        money9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money9MouseClicked(evt);
            }
        });

        stop9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop9.setText("STOP");
        stop9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop9ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("2");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("1");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("3");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("5");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("6");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("7");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("8");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("9");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("10");

        label10.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setText("0");
        label10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label10.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label10.setOpaque(true);

        gift10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift10ActionPerformed(evt);
            }
        });

        five10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five10.setText("5 DK");
        five10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five10ActionPerformed(evt);
            }
        });

        stop10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop10.setText("STOP");
        stop10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop10ActionPerformed(evt);
            }
        });

        reset10.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset10.setText("RESET");
        reset10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset10ActionPerformed(evt);
            }
        });

        money10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money10.setText("ALINMADI");
        money10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money10MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("11");

        label11.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label11.setText("0");
        label11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label11.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label11.setOpaque(true);

        gift11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift11ActionPerformed(evt);
            }
        });

        five11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five11.setText("5 DK");
        five11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five11ActionPerformed(evt);
            }
        });

        stop11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop11.setText("STOP");
        stop11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop11ActionPerformed(evt);
            }
        });

        reset11.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset11.setText("RESET");
        reset11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset11ActionPerformed(evt);
            }
        });

        money11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money11.setText("ALINMADI");
        money11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money11MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("12");

        label12.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label12.setText("0");
        label12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label12.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label12.setOpaque(true);

        gift12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift12ActionPerformed(evt);
            }
        });

        five12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five12.setText("5 DK");
        five12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five12ActionPerformed(evt);
            }
        });

        stop12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop12.setText("STOP");
        stop12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop12ActionPerformed(evt);
            }
        });

        reset12.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset12.setText("RESET");
        reset12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset12ActionPerformed(evt);
            }
        });

        money12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money12.setText("ALINMADI");
        money12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money12MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("13");

        label13.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label13.setText("0");
        label13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label13.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label13.setOpaque(true);

        gift13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift13ActionPerformed(evt);
            }
        });

        five13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five13.setText("5 DK");
        five13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five13ActionPerformed(evt);
            }
        });

        stop13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop13.setText("STOP");
        stop13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop13ActionPerformed(evt);
            }
        });

        reset13.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset13.setText("RESET");
        reset13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset13ActionPerformed(evt);
            }
        });

        money13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money13.setText("ALINMADI");
        money13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money13MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("14");

        label14.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label14.setText("0");
        label14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label14.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label14.setOpaque(true);

        gift14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift14ActionPerformed(evt);
            }
        });

        five14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five14.setText("5 DK");
        five14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five14ActionPerformed(evt);
            }
        });

        stop14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop14.setText("STOP");
        stop14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop14ActionPerformed(evt);
            }
        });

        reset14.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset14.setText("RESET");
        reset14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset14ActionPerformed(evt);
            }
        });

        money14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money14.setText("ALINMADI");
        money14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money14MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("15");

        label15.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label15.setText("0");
        label15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label15.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label15.setOpaque(true);

        gift15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift15ActionPerformed(evt);
            }
        });

        five15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five15.setText("5 DK");
        five15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five15ActionPerformed(evt);
            }
        });

        stop15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop15.setText("STOP");
        stop15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop15ActionPerformed(evt);
            }
        });

        reset15.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset15.setText("RESET");
        reset15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset15ActionPerformed(evt);
            }
        });

        money15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money15.setText("ALINMADI");
        money15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money15MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("16");

        label16.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label16.setText("0");
        label16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label16.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label16.setOpaque(true);

        gift16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift16ActionPerformed(evt);
            }
        });

        five16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five16.setText("5 DK");
        five16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five16ActionPerformed(evt);
            }
        });

        stop16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop16.setText("STOP");
        stop16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop16ActionPerformed(evt);
            }
        });

        reset16.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset16.setText("RESET");
        reset16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset16ActionPerformed(evt);
            }
        });

        money16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money16.setText("ALINMADI");
        money16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money16MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("17");

        label17.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label17.setText("0");
        label17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label17.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label17.setOpaque(true);

        gift17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift17ActionPerformed(evt);
            }
        });

        five17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five17.setText("5 DK");
        five17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five17ActionPerformed(evt);
            }
        });

        stop17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop17.setText("STOP");
        stop17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop17ActionPerformed(evt);
            }
        });

        reset17.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset17.setText("RESET");
        reset17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset17ActionPerformed(evt);
            }
        });

        money17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money17.setText("ALINMADI");
        money17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money17MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("18");

        label18.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label18.setText("0");
        label18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label18.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label18.setOpaque(true);

        gift18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift18ActionPerformed(evt);
            }
        });

        five18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five18.setText("5 DK");
        five18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five18ActionPerformed(evt);
            }
        });

        stop18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop18.setText("STOP");
        stop18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop18ActionPerformed(evt);
            }
        });

        reset18.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset18.setText("RESET");
        reset18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset18ActionPerformed(evt);
            }
        });

        money18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money18.setText("ALINMADI");
        money18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money18MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("19");

        label19.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label19.setText("0");
        label19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label19.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label19.setOpaque(true);

        gift19.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift19ActionPerformed(evt);
            }
        });

        five19.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five19.setText("5 DK");
        five19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five19ActionPerformed(evt);
            }
        });

        stop19.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop19.setText("STOP");
        stop19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop19ActionPerformed(evt);
            }
        });

        reset19.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset19.setText("RESET");
        reset19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset19ActionPerformed(evt);
            }
        });

        money19.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money19.setText("ALINMADI");
        money19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money19MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("20");

        label20.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label20.setText("0");
        label20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label20.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label20.setOpaque(true);

        gift20.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift20ActionPerformed(evt);
            }
        });

        five20.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five20.setText("5 DK");
        five20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five20ActionPerformed(evt);
            }
        });

        stop20.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop20.setText("STOP");
        stop20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop20ActionPerformed(evt);
            }
        });

        reset20.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset20.setText("RESET");
        reset20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset20ActionPerformed(evt);
            }
        });

        money20.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money20.setText("ALINMADI");
        money20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money20MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("21");

        label21.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label21.setText("0");
        label21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label21.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label21.setOpaque(true);

        gift21.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift21ActionPerformed(evt);
            }
        });

        five21.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five21.setText("5 DK");
        five21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five21ActionPerformed(evt);
            }
        });

        stop21.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop21.setText("STOP");
        stop21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop21ActionPerformed(evt);
            }
        });

        reset21.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset21.setText("RESET");
        reset21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset21ActionPerformed(evt);
            }
        });

        money21.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money21.setText("ALINMADI");
        money21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money21MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("22");

        label22.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label22.setText("0");
        label22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label22.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label22.setOpaque(true);

        gift22.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift22ActionPerformed(evt);
            }
        });

        five22.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five22.setText("5 DK");
        five22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five22ActionPerformed(evt);
            }
        });

        stop22.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop22.setText("STOP");
        stop22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop22ActionPerformed(evt);
            }
        });

        reset22.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset22.setText("RESET");
        reset22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset22ActionPerformed(evt);
            }
        });

        money22.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money22.setText("ALINMADI");
        money22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money22MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("23");

        label23.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label23.setText("0");
        label23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label23.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label23.setOpaque(true);

        gift23.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift23ActionPerformed(evt);
            }
        });

        five23.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five23.setText("5 DK");
        five23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five23ActionPerformed(evt);
            }
        });

        stop23.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop23.setText("STOP");
        stop23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop23ActionPerformed(evt);
            }
        });

        reset23.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset23.setText("RESET");
        reset23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset23ActionPerformed(evt);
            }
        });

        money23.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money23.setText("ALINMADI");
        money23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money23MouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("24");

        label24.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label24.setText("0");
        label24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label24.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        label24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label24.setOpaque(true);

        gift24.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift24ActionPerformed(evt);
            }
        });

        five24.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        five24.setText("5 DK");
        five24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five24ActionPerformed(evt);
            }
        });

        stop24.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stop24.setText("STOP");
        stop24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop24ActionPerformed(evt);
            }
        });

        reset24.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        reset24.setText("RESET");
        reset24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset24ActionPerformed(evt);
            }
        });

        money24.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        money24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        money24.setText("ALINMADI");
        money24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money24MouseClicked(evt);
            }
        });

        jButton97.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton97.setText("SAKLA/GÖSTER");
        jButton97.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton97.setBorderPainted(false);
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });

        st1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st1.setText("STANDTA");
        st1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st1MouseClicked(evt);
            }
        });

        st2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st2.setText("STANDTA");
        st2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st2MouseClicked(evt);
            }
        });

        st3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st3.setText("STANDTA");
        st3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st3MouseClicked(evt);
            }
        });

        st4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st4.setText("STANDTA");
        st4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st4MouseClicked(evt);
            }
        });

        st5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st5.setText("STANDTA");
        st5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st5MouseClicked(evt);
            }
        });

        st6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st6.setText("STANDTA");
        st6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st6MouseClicked(evt);
            }
        });

        st7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st7.setText("STANDTA");
        st7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st7MouseClicked(evt);
            }
        });

        st8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st8.setText("STANDTA");
        st8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st8MouseClicked(evt);
            }
        });

        st9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st9.setText("STANDTA");
        st9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st9MouseClicked(evt);
            }
        });

        st10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st10.setText("STANDTA");
        st10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st10MouseClicked(evt);
            }
        });

        st11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st11.setText("STANDTA");
        st11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st11MouseClicked(evt);
            }
        });

        st12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st12.setText("STANDTA");
        st12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st12MouseClicked(evt);
            }
        });

        st13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st13.setText("STANDTA");
        st13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st13MouseClicked(evt);
            }
        });

        st14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st14.setText("STANDTA");
        st14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st14MouseClicked(evt);
            }
        });

        st15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st15.setText("STANDTA");
        st15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st15MouseClicked(evt);
            }
        });

        st16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st16.setText("STANDTA");
        st16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st16MouseClicked(evt);
            }
        });

        st17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st17.setText("STANDTA");
        st17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st17MouseClicked(evt);
            }
        });

        st18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st18.setText("STANDTA");
        st18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st18MouseClicked(evt);
            }
        });

        st19.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st19.setText("STANDTA");
        st19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st19MouseClicked(evt);
            }
        });

        st20.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st20.setText("STANDTA");
        st20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st20MouseClicked(evt);
            }
        });

        st21.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st21.setText("STANDTA");
        st21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st21MouseClicked(evt);
            }
        });

        st22.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st22.setText("STANDTA");
        st22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st22MouseClicked(evt);
            }
        });

        st23.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st23.setText("STANDTA");
        st23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st23MouseClicked(evt);
            }
        });

        st24.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        st24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st24.setText("STANDTA");
        st24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st24MouseClicked(evt);
            }
        });

        ten2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten2.setText("10 DK");
        ten2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten2ActionPerformed(evt);
            }
        });

        ten3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten3.setText("10 DK");
        ten3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten3ActionPerformed(evt);
            }
        });

        ten4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten4.setText("10 DK");
        ten4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten4ActionPerformed(evt);
            }
        });

        ten5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten5.setText("10 DK");
        ten5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten5ActionPerformed(evt);
            }
        });

        ten6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten6.setText("10 DK");
        ten6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten6ActionPerformed(evt);
            }
        });

        ten7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten7.setText("10 DK");
        ten7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten7ActionPerformed(evt);
            }
        });

        ten8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten8.setText("10 DK");
        ten8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten8ActionPerformed(evt);
            }
        });

        ten9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten9.setText("10 DK");
        ten9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten9ActionPerformed(evt);
            }
        });

        ten10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten10.setText("10 DK");
        ten10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten10ActionPerformed(evt);
            }
        });

        ten11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten11.setText("10 DK");
        ten11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten11ActionPerformed(evt);
            }
        });

        ten12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten12.setText("10 DK");
        ten12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten12ActionPerformed(evt);
            }
        });

        ten13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten13.setText("10 DK");
        ten13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten13ActionPerformed(evt);
            }
        });

        ten14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten14.setText("10 DK");
        ten14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten14ActionPerformed(evt);
            }
        });

        ten15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten15.setText("10 DK");
        ten15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten15ActionPerformed(evt);
            }
        });

        ten16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten16.setText("10 DK");
        ten16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten16ActionPerformed(evt);
            }
        });

        ten17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten17.setText("10 DK");
        ten17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten17ActionPerformed(evt);
            }
        });

        ten18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten18.setText("10 DK");
        ten18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten18ActionPerformed(evt);
            }
        });

        ten19.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten19.setText("10 DK");
        ten19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten19ActionPerformed(evt);
            }
        });

        ten20.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten20.setText("10 DK");
        ten20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten20ActionPerformed(evt);
            }
        });

        ten21.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten21.setText("10 DK");
        ten21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten21ActionPerformed(evt);
            }
        });

        ten22.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten22.setText("10 DK");
        ten22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten22ActionPerformed(evt);
            }
        });

        ten23.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten23.setText("10 DK");
        ten23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten23ActionPerformed(evt);
            }
        });

        ten24.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ten24.setText("10 DK");
        ten24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten24ActionPerformed(evt);
            }
        });

        gift1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gift1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gift1ActionPerformed(evt);
            }
        });

        ekran.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ekran.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        ekran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekranActionPerformed(evt);
            }
        });

        jLabel27.setText("Developed by");

        jLabel28.setText("UMUT YILDIZ");

        time1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        time1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time1.setText("ZAMAN");
        time1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(reset13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stop13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(five13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ten13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gift13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(label13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(money13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(st13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(st15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gift15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ten15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(five15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(stop15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(money15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(money16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(reset15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reset16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reset17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ten18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gift18, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(gift19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gift20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ten19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ten20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(five18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stop18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reset18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(money18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(st18, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(five19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stop19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reset19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(money19, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(st19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(five20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(st21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gift21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ten21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(five21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(stop21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(reset21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(money21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(st1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(money1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(reset1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stop1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(five1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ten1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gift1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gift4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gift12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ten4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(five4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(stop4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stop12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(reset4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(money4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(st4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(210, 210, 210))
                                        .addComponent(jButton97, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(time, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(time1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(59, 59, 59))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ekran, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gift1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gift2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gift3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gift4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gift5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gift6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gift7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gift8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gift9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gift10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gift11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gift12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ten1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ten2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ten3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ten4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ten5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ten6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ten7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ten8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ten9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ten10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ten11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ten12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(five1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(stop1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(money1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(money12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(st1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gift13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gift24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ten13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(five13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stop13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ekran, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(money13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(st13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void money24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money24MouseClicked
        // TODO add your handling code here:
        money24.setText("ALINDI");
        money24.setBackground(g);
    }//GEN-LAST:event_money24MouseClicked

    private void reset24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset24ActionPerformed
        // TODO add your handling code here:
        if(!resetb24&&state24){
            
               reset++; 
             resetb24=true;
            
            
        }
    }//GEN-LAST:event_reset24ActionPerformed

    private void stop24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop24ActionPerformed
        // TODO add your handling code here:
        if(state24){
            state24=false;
        }
    }//GEN-LAST:event_stop24ActionPerformed

    private void five24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five24ActionPerformed
        // TODO add your handling code here:
         if(t24.isAlive()){
                ortak24+=300;
            st24.setText("DIŞARDA");
            st24.setBackground(Color.RED);
            count24++;
            }else{
               state24=true;
               resetb24=false;
               count24++;
                 t24=new Thread(){
            
            public void run(){
                ortak24+=fivesecond24;
                for(;;){
                    if(resetb24){
                        millisecond24=0;
                        fivesecond24=301;
                        count24=0;
                        ortak24=0;
                        label24.setText("0");
                        label24.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     24       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     24       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state24==true&&ortak24!=0){
                        try {
                            sleep(4);
                            if(millisecond24>1000){
                                millisecond24=0;
                                ortak24--;
                                label24.setText(""+ortak24);
                            }
                            allowPause24();
                            if(ortak24<=60&&ortak24>=30){
                                Color a=Color.RED;
                                label24.setBackground(a); 
                            }else if(ortak24<30&&ortak24>0){
                                if(ortak24%2==1){
                                    label24.setBackground(Color.YELLOW); 
                                }else{
                                    label24.setBackground(Color.RED);
                                }
                              
                            }if(ortak24==1&&sound24){
                                    sound();
                                    sound24=false;
                                }
                            
                            millisecond24+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond24=0;
                        fivesecond24=301;
                        total+=count24;
                        count24=0;
                        ortak24=0;
                        label24.setText("0");
                        label24.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     24       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     24       "+"                            1  ";
                        addElement();
                        count++;
                        sound24=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond24==301&&tensecond24==601&&!t24.isAlive()){
            money24.setText("ALINMADI");
            money24.setBackground(Color.RED);
            st24.setText("DIŞARDA");
            st24.setBackground(Color.RED);
            t24.start();
            
        } 
            }
            
    }//GEN-LAST:event_five24ActionPerformed

    private void gift24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift24ActionPerformed
        // TODO add your handling code here:
        if(!giftb24){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift24.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb24=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift24.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb24=false;
        }
    }//GEN-LAST:event_gift24ActionPerformed

    private void money23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money23MouseClicked
        // TODO add your handling code here:
        money23.setText("ALINDI");
        money23.setBackground(g);
    }//GEN-LAST:event_money23MouseClicked

    private void reset23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset23ActionPerformed
        // TODO add your handling code here:
        if(!resetb23&&state23){
            
               reset++; 
             resetb23=true;
            
            
        }
    }//GEN-LAST:event_reset23ActionPerformed

    private void stop23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop23ActionPerformed
        // TODO add your handling code here:
        if(state23){
            state23=false;
        }
    }//GEN-LAST:event_stop23ActionPerformed

    private void five23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five23ActionPerformed
        // TODO add your handling code here:
         if(t23.isAlive()){
                ortak23+=300;
            st23.setText("DIŞARDA");
            st23.setBackground(Color.RED);
            count23++;
            }else{
               state23=true;
               resetb23=false;
               count23++;
                 t23=new Thread(){
            
            public void run(){
                ortak23+=fivesecond23;
                for(;;){
                    if(resetb23){
                        millisecond23=0;
                        fivesecond23=301;
                        count23=0;
                        ortak23=0;
                        label23.setText("0");
                        label23.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     23       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     23       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state23==true&&ortak23!=0){
                        try {
                            sleep(4);
                            if(millisecond23>1000){
                                millisecond23=0;
                                ortak23--;
                                label23.setText(""+ortak23);
                            }
                            allowPause23();
                            if(ortak23<=60&&ortak23>=30){
                                Color a=Color.RED;
                                label23.setBackground(a); 
                            }else if(ortak23<30&&ortak23>0){
                                if(ortak23%2==1){
                                    label23.setBackground(Color.YELLOW); 
                                }else{
                                    label23.setBackground(Color.RED);
                                }
                              
                            }if(ortak23==1&&sound23){
                                    sound();
                                    sound23=false;
                                }
                            
                            millisecond23+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond23=0;
                        fivesecond23=301;
                        total+=count23;
                        count23=0;
                        ortak23=0;
                        label23.setText("0");
                        label23.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     23       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     23       "+"                            1  ";
                        addElement();
                        count++;
                        sound23=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond23==301&&tensecond23==601&&!t23.isAlive()){
            money23.setText("ALINMADI");
            money23.setBackground(Color.RED);
            st23.setText("DIŞARDA");
            st23.setBackground(Color.RED);
            t23.start();
            
        } 
            }
            
    }//GEN-LAST:event_five23ActionPerformed

    private void gift23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift23ActionPerformed
        // TODO add your handling code here:
        if(!giftb23){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift23.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb23=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift23.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb23=false;
        }
    }//GEN-LAST:event_gift23ActionPerformed

    private void money22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money22MouseClicked
        // TODO add your handling code here:
        money22.setText("ALINDI");
        money22.setBackground(g);
    }//GEN-LAST:event_money22MouseClicked

    private void reset22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset22ActionPerformed
        // TODO add your handling code here:
        if(!resetb22&&state22){
            
               reset++; 
             resetb22=true;
            
            
        }
    }//GEN-LAST:event_reset22ActionPerformed

    private void stop22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop22ActionPerformed
        // TODO add your handling code here:
        if(state22){
            state22=false;
        }
    }//GEN-LAST:event_stop22ActionPerformed

    private void five22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five22ActionPerformed
        // TODO add your handling code here:
         if(t22.isAlive()){
                ortak22+=300;
            st22.setText("DIŞARDA");
            st22.setBackground(Color.RED);
            count22++;
            }else{
               state22=true;
               resetb22=false;
               count22++;
                 t22=new Thread(){
            
            public void run(){
                ortak22+=fivesecond22;
                for(;;){
                    if(resetb22){
                        millisecond22=0;
                        fivesecond22=301;
                        count22=0;
                        ortak22=0;
                        label22.setText("0");
                        label22.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     22       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     22       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state22==true&&ortak22!=0){
                        try {
                            sleep(4);
                            if(millisecond22>1000){
                                millisecond22=0;
                                ortak22--;
                                label22.setText(""+ortak22);
                            }
                            allowPause22();
                            if(ortak22<=60&&ortak22>=30){
                                Color a=Color.RED;
                                label22.setBackground(a); 
                            }else if(ortak22<30&&ortak22>0){
                                if(ortak3%2==1){
                                    label22.setBackground(Color.YELLOW); 
                                }else{
                                    label22.setBackground(Color.RED);
                                }
                              
                            }if(ortak22==1&&sound22){
                                    sound();
                                    sound22=false;
                                }
                            
                            millisecond22+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond22=0;
                        fivesecond22=301;
                        total+=count22;
                        count22=0;
                        ortak22=0;
                        label22.setText("0");
                        label22.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     22       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     22       "+"                            1  ";
                        addElement();
                        count++;
                        sound22=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond22==301&&tensecond22==601&&!t22.isAlive()){
            money22.setText("ALINMADI");
            money22.setBackground(Color.RED);
            st22.setText("DIŞARDA");
            st22.setBackground(Color.RED);
            t22.start();
            
        } 
            }
            
    }//GEN-LAST:event_five22ActionPerformed

    private void gift22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift22ActionPerformed
        // TODO add your handling code here:
       if(!giftb22){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift22.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb22=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift22.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb22=false;
        }
    }//GEN-LAST:event_gift22ActionPerformed

    private void money21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money21MouseClicked
        // TODO add your handling code here:
        money21.setText("ALINDI");
        money21.setBackground(g);
    }//GEN-LAST:event_money21MouseClicked

    private void reset21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset21ActionPerformed
        // TODO add your handling code here:
        if(!resetb21&&state21){
            
               reset++; 
             resetb21=true;
            
            
        }
    }//GEN-LAST:event_reset21ActionPerformed

    private void stop21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop21ActionPerformed
        // TODO add your handling code here:
        if(state21){
            state21=false;
        }
    }//GEN-LAST:event_stop21ActionPerformed

    private void five21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five21ActionPerformed
        // TODO add your handling code here:
         if(t21.isAlive()){
                ortak21+=300;
            st21.setText("DIŞARDA");
            st21.setBackground(Color.RED);
            count21++;
            }else{
               state21=true;
               resetb21=false;
               count21++;
                 t21=new Thread(){
            
            public void run(){
                ortak21+=fivesecond21;
                for(;;){
                    if(resetb21){
                        millisecond21=0;
                        fivesecond21=301;
                        count21=0;
                        ortak21=0;
                        label21.setText("0");
                        label21.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     21       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     21       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state21==true&&ortak21!=0){
                        try {
                            sleep(4);
                            if(millisecond21>1000){
                                millisecond21=0;
                                ortak21--;
                                label21.setText(""+ortak21);
                            }
                            allowPause21();
                            if(ortak21<=60&&ortak21>=30){
                                Color a=Color.RED;
                                label21.setBackground(a); 
                            }else if(ortak21<30&&ortak21>0){
                                if(ortak21%2==1){
                                    label21.setBackground(Color.YELLOW); 
                                }else{
                                    label21.setBackground(Color.RED);
                                }
                              
                            }if(ortak21==1&&sound21){
                                    sound();
                                    sound21=false;
                                }
                            
                            millisecond21+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond21=0;
                        fivesecond21=301;
                        total+=count21;
                        count21=0;
                        ortak21=0;
                        label21.setText("0");
                        label21.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     21       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     21       "+"                            1  ";
                        addElement();
                        count++;
                        sound21=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond21==301&&tensecond21==601&&!t21.isAlive()){
            money21.setText("ALINMADI");
            money21.setBackground(Color.RED);
            st21.setText("DIŞARDA");
            st21.setBackground(Color.RED);
            t21.start();
            
        } 
            }
            
    }//GEN-LAST:event_five21ActionPerformed

    private void gift21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift21ActionPerformed
        // TODO add your handling code here:
        if(!giftb21){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift21.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb21=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift21.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb21=false;
        }
    }//GEN-LAST:event_gift21ActionPerformed

    private void money20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money20MouseClicked
        // TODO add your handling code here:
        money20.setText("ALINDI");
        money20.setBackground(g);
    }//GEN-LAST:event_money20MouseClicked

    private void reset20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset20ActionPerformed
        // TODO add your handling code here:
        if(!resetb20&&state20){
            
               reset++; 
             resetb20=true;
            
            
        }
    }//GEN-LAST:event_reset20ActionPerformed

    private void stop20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop20ActionPerformed
        // TODO add your handling code here:
        if(state20){
            state20=false;
        }
    }//GEN-LAST:event_stop20ActionPerformed

    private void five20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five20ActionPerformed
        // TODO add your handling code here:
         if(t20.isAlive()){
                ortak20+=300;
                st20.setText("DIŞARDA");
                st20.setBackground(Color.RED);
                count20++;
            }else{
               state20=true;
               resetb20=false;
               count20++;
                 t20=new Thread(){
            
            public void run(){
                ortak20+=fivesecond20;
                for(;;){
                    if(resetb20){
                        millisecond20=0;
                        fivesecond20=301;
                        count20=0;
                        ortak20=0;
                        label20.setText("0");
                        label20.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     20       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     20       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state20==true&&ortak20!=0){
                        try {
                            sleep(4);
                            if(millisecond20>1000){
                                millisecond20=0;
                                ortak20--;
                                label20.setText(""+ortak20);
                            }
                            allowPause20();
                            if(ortak20<=60&&ortak20>=30){
                                Color a=Color.RED;
                                label20.setBackground(a); 
                            }else if(ortak20<30&&ortak20>0){
                                if(ortak20%2==1){
                                    label20.setBackground(Color.YELLOW); 
                                }else{
                                    label20.setBackground(Color.RED);
                                }
                              
                            }if(ortak20==1&&sound20){
                                    sound();
                                    sound20=false;
                                }
                            
                            millisecond20+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond20=0;
                        fivesecond20=301;
                        total+=count20;
                        count20=0;
                        ortak20=0;
                        label20.setText("0");
                        label20.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     20       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     20       "+"                            1  ";
                        addElement();
                        count++;
                        sound20=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond20==301&&tensecond20==601&&!t20.isAlive()){
            money20.setText("ALINMADI");
            money20.setBackground(Color.RED);
            st20.setText("DIŞARDA");
            st20.setBackground(Color.RED);
            t20.start();
            
        } 
            }
            
    }//GEN-LAST:event_five20ActionPerformed

    private void gift20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift20ActionPerformed
        // TODO add your handling code here:
        if(!giftb20){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift20.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb20=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift20.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb20=false;
        }
    }//GEN-LAST:event_gift20ActionPerformed

    private void money19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money19MouseClicked
        // TODO add your handling code here:
        money19.setText("ALINDI");
        money19.setBackground(g);
    }//GEN-LAST:event_money19MouseClicked

    private void reset19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset19ActionPerformed
        // TODO add your handling code here:
        if(!resetb19&&state19){
            
               reset++; 
             resetb19=true;
            
            
        }
    }//GEN-LAST:event_reset19ActionPerformed

    private void stop19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop19ActionPerformed
        // TODO add your handling code here:
        if(state19){
            state19=false;
        }
    }//GEN-LAST:event_stop19ActionPerformed

    private void five19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five19ActionPerformed
        // TODO add your handling code here:
         if(t19.isAlive()){
                ortak19+=300;
            st19.setText("DIŞARDA");
            st19.setBackground(Color.RED);
            count19++;
            }else{
               state19=true;
               resetb19=false;
               count19++;
                 t19=new Thread(){
            
            public void run(){
                ortak19+=fivesecond19;
                for(;;){
                    if(resetb19){
                        millisecond19=0;
                        fivesecond19=301;
                        count19=0;
                        ortak19=0;
                        label19.setText("0");
                        label19.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     19       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     19       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state19==true&&ortak19!=0){
                        try {
                            sleep(4);
                            if(millisecond19>1000){
                                millisecond19=0;
                                ortak19--;
                                label19.setText(""+ortak19);
                            }
                            allowPause19();
                            if(ortak19<=60&&ortak19>=30){
                                Color a=Color.RED;
                                label19.setBackground(a); 
                            }else if(ortak19<30&&ortak19>0){
                                if(ortak19%2==1){
                                    label19.setBackground(Color.YELLOW); 
                                }else{
                                    label19.setBackground(Color.RED);
                                }
                              
                            }if(ortak19==1&&sound19){
                                    sound();
                                    sound19=false;
                                }
                            
                            millisecond19+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond19=0;
                        fivesecond19=301;
                        total+=count19;
                        count19=0;
                        ortak19=0;
                        label19.setText("0");
                        label19.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     19       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     19       "+"                            1  ";
                        addElement();
                        count++;
                        sound19=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond19==301&&tensecond19==601&&!t19.isAlive()){
            money19.setText("ALINMADI");
            money19.setBackground(Color.RED);
            st19.setText("DIŞARDA");
            st19.setBackground(Color.RED);
            t19.start();
            
        } 
            }
            
    }//GEN-LAST:event_five19ActionPerformed

    private void gift19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift19ActionPerformed
        // TODO add your handling code here:
       if(!giftb19){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift19.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb19=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift19.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb19=false;
        }
    }//GEN-LAST:event_gift19ActionPerformed

    private void money18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money18MouseClicked
        // TODO add your handling code here:
        money18.setText("ALINDI");
        money18.setBackground(g);
    }//GEN-LAST:event_money18MouseClicked

    private void reset18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset18ActionPerformed
        // TODO add your handling code here:
        if(!resetb18&&state18){
            
               reset++; 
             resetb18=true;
            
            
        }
    }//GEN-LAST:event_reset18ActionPerformed

    private void stop18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop18ActionPerformed
        // TODO add your handling code here:
        if(state18){
            state18=false;
        }
    }//GEN-LAST:event_stop18ActionPerformed

    private void five18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five18ActionPerformed
        // TODO add your handling code here:
         if(t18.isAlive()){
                ortak18+=300;
            st18.setText("DIŞARDA");
            st18.setBackground(Color.RED);
            count18++;
            }else{
               state18=true;
               resetb18=false;
               count18++;
                 t18=new Thread(){
            
            public void run(){
                ortak18+=fivesecond18;
                for(;;){
                    if(resetb18){
                        millisecond18=0;
                        fivesecond18=301;
                        count18=0;
                        ortak18=0;
                        label18.setText("0");
                        label18.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     18       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     18       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state18==true&&ortak18!=0){
                        try {
                            sleep(4);
                            if(millisecond18>1000){
                                millisecond18=0;
                                ortak18--;
                                label18.setText(""+ortak18);
                            }
                            allowPause18();
                            if(ortak18<=60&&ortak18>=30){
                                Color a=Color.RED;
                                label18.setBackground(a); 
                            }else if(ortak18<30&&ortak18>0){
                                if(ortak18%2==1){
                                    label18.setBackground(Color.YELLOW); 
                                }else{
                                    label18.setBackground(Color.RED);
                                }
                              
                            }if(ortak18==1&&sound18){
                                    sound();
                                    sound18=false;
                                }
                            
                            millisecond18+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond18=0;
                        fivesecond18=301;
                        total+=count18;
                        count18=0;
                        ortak18=0;
                        label18.setText("0");
                        label18.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     18       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     18       "+"                            1  ";
                        addElement();
                        count++;
                        sound18=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond18==301&&tensecond18==601&&!t18.isAlive()){
            money18.setText("ALINMADI");
            money18.setBackground(Color.RED);
            st18.setText("DIŞARDA");
            st18.setBackground(Color.RED);
            t18.start();
            
        } 
            }
            
    }//GEN-LAST:event_five18ActionPerformed

    private void gift18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift18ActionPerformed
        // TODO add your handling code here:
        if(!giftb18){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift18.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb18=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift18.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb18=false;
        }
    }//GEN-LAST:event_gift18ActionPerformed

    private void money17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money17MouseClicked
        // TODO add your handling code here:
        money17.setText("ALINDI");
        money17.setBackground(g);
    }//GEN-LAST:event_money17MouseClicked

    private void reset17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset17ActionPerformed
        // TODO add your handling code here:
        if(!resetb17&&state17){
            
               reset++; 
             resetb17=true;
            
            
        }
    }//GEN-LAST:event_reset17ActionPerformed

    private void stop17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop17ActionPerformed
        // TODO add your handling code here:
        if(state17){
            state17=false;
        }
    }//GEN-LAST:event_stop17ActionPerformed

    private void five17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five17ActionPerformed
        // TODO add your handling code here:
         if(t17.isAlive()){
                ortak17+=300;
            st17.setText("DIŞARDA");
            st17.setBackground(Color.RED);
            count17++;
            }else{
               state17=true;
               resetb17=false;
               count17++;
                 t17=new Thread(){
            
            public void run(){
                ortak17+=fivesecond17;
                for(;;){
                    if(resetb17){
                        millisecond17=0;
                        fivesecond17=301;
                        count17=0;
                        ortak17=0;
                        label17.setText("0");
                        label17.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     17       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     17       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state17==true&&ortak17!=0){
                        try {
                            sleep(4);
                            if(millisecond17>1000){
                                millisecond17=0;
                                ortak17--;
                                label17.setText(""+ortak17);
                            }
                            allowPause17();
                            if(ortak17<=60&&ortak17>=30){
                                Color a=Color.RED;
                                label17.setBackground(a); 
                            }else if(ortak17<30&&ortak17>0){
                                if(ortak17%2==1){
                                    label17.setBackground(Color.YELLOW); 
                                }else{
                                    label17.setBackground(Color.RED);
                                }
                              
                            }if(ortak17==1&&sound17){
                                    sound();
                                    sound17=false;
                                }
                            
                            millisecond17+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond17=0;
                        fivesecond17=301;
                        total+=count17;
                        count17=0;
                        ortak17=0;
                        label17.setText("0");
                        label17.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     17       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     17       "+"                            1  ";
                        addElement();
                        count++;
                        sound17=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond17==301&&tensecond17==601&&!t17.isAlive()){
            money17.setText("ALINMADI");
            money17.setBackground(Color.RED);
            st17.setText("DIŞARDA");
            st17.setBackground(Color.RED);
            t17.start();
            
        } 
            }
            
    }//GEN-LAST:event_five17ActionPerformed

    private void gift17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift17ActionPerformed
        // TODO add your handling code here:
        if(!giftb17){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift17.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb17=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift17.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb17=false;
        }
    }//GEN-LAST:event_gift17ActionPerformed

    private void money16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money16MouseClicked
        // TODO add your handling code here:
        money16.setText("ALINDI");
        money16.setBackground(g);
    }//GEN-LAST:event_money16MouseClicked

    private void reset16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset16ActionPerformed
        // TODO add your handling code here:
        if(!resetb16&&state16){
            
               reset++; 
             resetb16=true;
            
            
        }
    }//GEN-LAST:event_reset16ActionPerformed

    private void stop16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop16ActionPerformed
        // TODO add your handling code here:
        if(state16){
            state16=false;
        }
    }//GEN-LAST:event_stop16ActionPerformed

    private void five16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five16ActionPerformed
        // TODO add your handling code here:
         if(t16.isAlive()){
                ortak16+=300;
            st16.setText("DIŞARDA");
            st16.setBackground(Color.RED);
            count16++;
            }else{
               state16=true;
               resetb16=false;
               count16++;
                 t16=new Thread(){
            
            public void run(){
                ortak16+=fivesecond16;
                for(;;){
                    if(resetb16){
                        millisecond16=0;
                        fivesecond16=301;
                        count16=0;
                        ortak16=0;
                        label16.setText("0");
                        label16.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     16       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     16       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state16==true&&ortak16!=0){
                        try {
                            sleep(4);
                            if(millisecond16>1000){
                                millisecond16=0;
                                ortak16--;
                                label16.setText(""+ortak16);
                            }
                            allowPause16();
                            if(ortak16<=60&&ortak16>=30){
                                Color a=Color.RED;
                                label16.setBackground(a); 
                            }else if(ortak16<30&&ortak16>0){
                                if(ortak16%2==1){
                                    label16.setBackground(Color.YELLOW); 
                                }else{
                                    label16.setBackground(Color.RED);
                                }
                              
                            }if(ortak16==1&&sound16){
                                    sound();
                                    sound16=false;
                                }
                            
                            millisecond16+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond16=0;
                        fivesecond16=301;
                        total+=count16;
                        count16=0;
                        ortak16=0;
                        label16.setText("0");
                        label16.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     16       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     16       "+"                            1  ";
                        addElement();
                        count++;
                        sound16=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond16==301&&tensecond16==601&&!t16.isAlive()){
            money16.setText("ALINMADI");
            money16.setBackground(Color.RED);
            st16.setText("DIŞARDA");
            st16.setBackground(Color.RED);
            t16.start();
            
        } 
            }
            
    }//GEN-LAST:event_five16ActionPerformed

    private void gift16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift16ActionPerformed
        // TODO add your handling code here:
        if(!giftb16){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift16.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb16=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift16.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb16=false;
        }
        
    }//GEN-LAST:event_gift16ActionPerformed

    private void money15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money15MouseClicked
        // TODO add your handling code here:
        money15.setText("ALINDI");
        money15.setBackground(g);
    }//GEN-LAST:event_money15MouseClicked

    private void reset15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset15ActionPerformed
        // TODO add your handling code here:
        if(!resetb15&&state15){
           
               reset++; 
             resetb15=true;
            
            
        }
    }//GEN-LAST:event_reset15ActionPerformed

    private void stop15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop15ActionPerformed
        // TODO add your handling code here:
        if(state15){
            state15=false;
        }
    }//GEN-LAST:event_stop15ActionPerformed

    private void five15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five15ActionPerformed
        // TODO add your handling code here:
         if(t15.isAlive()){
                ortak15+=300;
            st15.setText("DIŞARDA");
            st15.setBackground(Color.RED);
            count15++;
            }else{
               state15=true;
               resetb15=false;
               count15++;
                 t15=new Thread(){
            
            public void run(){
                ortak15+=fivesecond15;
                for(;;){
                    if(resetb15){
                        millisecond15=0;
                        fivesecond15=301;
                        count15=0;
                        ortak15=0;
                        label15.setText("0");
                        label15.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     15       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     15       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state15==true&&ortak15!=0){
                        try {
                            sleep(4);
                            if(millisecond15>1000){
                                millisecond15=0;
                                ortak15--;
                                label15.setText(""+ortak15);
                            }
                            allowPause15();
                            if(ortak15<=60&&ortak15>=30){
                                Color a=Color.RED;
                                label15.setBackground(a); 
                            }else if(ortak15<30&&ortak15>0){
                                if(ortak15%2==1){
                                    label15.setBackground(Color.YELLOW); 
                                }else{
                                    label15.setBackground(Color.RED);
                                }
                              
                            }if(ortak15==1&&sound15){
                                    sound();
                                    sound15=false;
                                }
                            
                            millisecond15+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond15=0;
                        fivesecond15=301;
                        total+=count15;
                        count15=0;
                        ortak15=0;
                        label15.setText("0");
                        label15.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     15       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     15       "+"                            1  ";
                        addElement();
                        count++;
                        sound15=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond15==301&&tensecond15==601&&!t15.isAlive()){
            money15.setText("ALINMADI");
            money15.setBackground(Color.RED);
            st15.setText("DIŞARDA");
            st15.setBackground(Color.RED);
            t15.start();
            
        } 
            }
            
    }//GEN-LAST:event_five15ActionPerformed

    private void gift15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift15ActionPerformed
        // TODO add your handling code here:
        if(!giftb15){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift15.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb15=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift15.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb15=false;
        }
    }//GEN-LAST:event_gift15ActionPerformed

    private void money14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money14MouseClicked
        // TODO add your handling code here:
        money14.setText("ALINDI");
        money14.setBackground(g);
    }//GEN-LAST:event_money14MouseClicked

    private void reset14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset14ActionPerformed
        // TODO add your handling code here:
        if(!resetb14&&state14){
            
               reset++; 
             resetb14=true;
            
            
        }
    }//GEN-LAST:event_reset14ActionPerformed

    private void stop14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop14ActionPerformed
        // TODO add your handling code here:
        if(state14){
            state14=false;
        }
    }//GEN-LAST:event_stop14ActionPerformed

    private void five14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five14ActionPerformed
        // TODO add your handling code here:
         if(t14.isAlive()){
                ortak14+=300;
            st14.setText("DIŞARDA");
            st14.setBackground(Color.RED);
            count14++;
            }else{
               state14=true;
               resetb14=false;
               count14++;
                 t14=new Thread(){
            
            public void run(){
                ortak14+=fivesecond14;
                for(;;){
                    if(resetb14){
                        millisecond14=0;
                        fivesecond14=301;
                        count14=0;
                        ortak14=0;
                        label14.setText("0");
                        label14.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     14       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     14       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state14==true&&ortak14!=0){
                        try {
                            sleep(4);
                            if(millisecond14>1000){
                                millisecond14=0;
                                ortak14--;
                                label14.setText(""+ortak14);
                            }
                            allowPause14();
                            if(ortak14<=60&&ortak14>=30){
                                Color a=Color.RED;
                                label14.setBackground(a); 
                            }else if(ortak14<30&&ortak14>0){
                                if(ortak14%2==1){
                                    label14.setBackground(Color.YELLOW); 
                                }else{
                                    label14.setBackground(Color.RED);
                                }
                              
                            }if(ortak14==1&&sound14){
                                    sound();
                                    sound14=false;
                                }
                            
                            millisecond14+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond14=0;
                        fivesecond14=301;
                        total+=count14;
                        count14=0;
                        ortak14=0;
                        label14.setText("0");
                        label14.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     14       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     14       "+"                            1  ";
                        addElement();
                        count++;
                        sound14=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond14==301&&tensecond14==601&&!t14.isAlive()){
            money14.setText("ALINMADI");
            money14.setBackground(Color.RED);
            st14.setText("DIŞARDA");
            st14.setBackground(Color.RED);
            t14.start();
            
        } 
            }
            
    }//GEN-LAST:event_five14ActionPerformed

    private void gift14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift14ActionPerformed
        // TODO add your handling code here:
       if(!giftb14){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift14.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb14=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift14.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb14=false;
        }
    }//GEN-LAST:event_gift14ActionPerformed

    private void money13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money13MouseClicked
        // TODO add your handling code here:
        money13.setText("ALINDI");
        money13.setBackground(g);
    }//GEN-LAST:event_money13MouseClicked

    private void reset13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset13ActionPerformed
        // TODO add your handling code here:
        if(!resetb13&&state13){
            
               reset++; 
             resetb13=true;
            
            
        }
    }//GEN-LAST:event_reset13ActionPerformed

    private void stop13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop13ActionPerformed
        // TODO add your handling code here:
        if(state13){
            state13=false;
        }
    }//GEN-LAST:event_stop13ActionPerformed

    private void five13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five13ActionPerformed
        // TODO add your handling code here:
         if(t13.isAlive()){
                ortak13+=300;
            st13.setText("DIŞARDA");
            st13.setBackground(Color.RED);
            count13++;
            }else{
               state13=true;
               resetb13=false;
               count13++;
                 t13=new Thread(){
            
            public void run(){
                ortak13+=fivesecond13;
                for(;;){
                    if(resetb13){
                        millisecond13=0;
                        fivesecond13=301;
                        count13=0;
                        ortak13=0;
                        label13.setText("0");
                        label13.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     13       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     13       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state13==true&&ortak13!=0){
                        try {
                            sleep(4);
                            if(millisecond13>1000){
                                millisecond13=0;
                                ortak13--;
                                label13.setText(""+ortak13);
                            }
                            allowPause13();
                            if(ortak13<=60&&ortak13>=30){
                                Color a=Color.RED;
                                label13.setBackground(a); 
                            }else if(ortak13<30&&ortak13>0){
                                if(ortak13%2==1){
                                    label13.setBackground(Color.YELLOW); 
                                }else{
                                    label13.setBackground(Color.RED);
                                }
                              
                            }if(ortak13==1&&sound13){
                                    sound();
                                    sound13=false;
                                }
                            
                            millisecond13+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond13=0;
                        fivesecond13=301;
                        total+=count13;
                        count13=0;
                        ortak13=0;
                        label13.setText("0");
                        label13.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     13       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     13       "+"                            1  ";
                        addElement();
                        count++;
                        sound13=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond13==301&&tensecond13==601&&!t13.isAlive()){
            money13.setText("ALINMADI");
            money13.setBackground(Color.RED);
            st13.setText("DIŞARDA");
            st13.setBackground(Color.RED);
            t13.start();
            
        } 
            }
            
    }//GEN-LAST:event_five13ActionPerformed

    private void gift13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift13ActionPerformed
        // TODO add your handling code here:
       if(!giftb13){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift13.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb13=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift13.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb13=false;
        }
    }//GEN-LAST:event_gift13ActionPerformed

    private void money12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money12MouseClicked
        // TODO add your handling code here:
        money12.setText("ALINDI");
        money12.setBackground(g);
    }//GEN-LAST:event_money12MouseClicked

    private void reset12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset12ActionPerformed
        // TODO add your handling code here:
        if(!resetb12&&state12){
            
               reset++; 
             resetb12=true;
            
            
        }
    }//GEN-LAST:event_reset12ActionPerformed

    private void stop12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop12ActionPerformed
        // TODO add your handling code here:
        if(state12){
            state12=false;
        }
    }//GEN-LAST:event_stop12ActionPerformed

    private void five12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five12ActionPerformed
        // TODO add your handling code here:
          if(t12.isAlive()){
                ortak12+=300;
            st12.setText("DIŞARDA");
            st12.setBackground(Color.RED);
            count12++;
            }else{
               state12=true;
               resetb12=false;
               count12++;
                 t12=new Thread(){
            
            public void run(){
                ortak12+=fivesecond12;
                for(;;){
                    if(resetb12){
                        millisecond12=0;
                        fivesecond12=301;
                        count12=0;
                        ortak12=0;
                        label12.setText("0");
                        label12.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     12       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     12       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state12==true&&ortak12!=0){
                        try {
                            sleep(4);
                            if(millisecond12>1000){
                                millisecond12=0;
                                ortak12--;
                                label12.setText(""+ortak12);
                            }
                            allowPause12();
                            if(ortak12<=60&&ortak12>=30){
                                Color a=Color.RED;
                                label12.setBackground(a); 
                            }else if(ortak12<30&&ortak12>0){
                                if(ortak12%2==1){
                                    label12.setBackground(Color.YELLOW); 
                                }else{
                                    label12.setBackground(Color.RED);
                                }
                              
                            }if(ortak12==1&&sound12){
                                    sound();
                                    sound12=false;
                                }
                            
                            millisecond12+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond12=0;
                        fivesecond12=301;
                        total+=count12;
                        count12=0;
                        ortak12=0;
                        label12.setText("0");
                        label12.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     12       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     12       "+"                            1  ";
                        addElement();
                        count++;
                        sound12=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond12==301&&tensecond12==601&&!t12.isAlive()){
            money12.setText("ALINMADI");
            money12.setBackground(Color.RED);
            st12.setText("DIŞARDA");
            st12.setBackground(Color.RED);
            t12.start();
            
        } 
            }
    }//GEN-LAST:event_five12ActionPerformed

    private void gift12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift12ActionPerformed
        // TODO add your handling code here:
          if(!giftb12){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift12.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb12=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift12.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb12=false;
        }
    }//GEN-LAST:event_gift12ActionPerformed

    private void money11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money11MouseClicked
        // TODO add your handling code here:
        money11.setText("ALINDI");
        money11.setBackground(g);
    }//GEN-LAST:event_money11MouseClicked

    private void reset11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset11ActionPerformed
        // TODO add your handling code here:
        if(!resetb11&&state11){
            
               reset++; 
             resetb11=true;
            
            
        }
    }//GEN-LAST:event_reset11ActionPerformed

    private void stop11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop11ActionPerformed
        // TODO add your handling code here:
        if(state11){
            state11=false;
        }
    }//GEN-LAST:event_stop11ActionPerformed

    private void five11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five11ActionPerformed
        // TODO add your handling code here:
         if(t11.isAlive()){
                ortak11+=300;
            st11.setText("DIŞARDA");
            st11.setBackground(Color.RED);
            count11++;
            }else{
               state11=true;
               resetb11=false;
               count11++;
                 t11=new Thread(){
            
            public void run(){
                ortak11+=fivesecond11;
                for(;;){
                    if(resetb11){
                        millisecond11=0;
                        fivesecond11=301;
                        count11=0;
                        ortak11=0;
                        label11.setText("0");
                        label11.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     11       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     11       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state11==true&&ortak11!=0){
                        try {
                            sleep(4);
                            if(millisecond11>1000){
                                millisecond11=0;
                                ortak11--;
                                label11.setText(""+ortak11);
                            }
                            allowPause11();
                            if(ortak11<=60&&ortak11>=30){
                                Color a=Color.RED;
                                label11.setBackground(a); 
                            }else if(ortak11<30&&ortak11>0){
                                if(ortak11%2==1){
                                    label11.setBackground(Color.YELLOW); 
                                }else{
                                    label11.setBackground(Color.RED);
                                }
                              
                            }if(ortak11==1&&sound11){
                                    sound();
                                    sound11=false;
                                }
                            
                            millisecond11+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond11=0;
                        fivesecond11=301;
                        total+=count11;
                        count11=0;
                        ortak11=0;
                        label11.setText("0");
                        label11.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     11       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     11       "+"                            1  ";
                        addElement();
                        count++;
                        sound11=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond11==301&&tensecond11==601&&!t11.isAlive()){
            money11.setText("ALINMADI");
            money11.setBackground(Color.RED);
            st11.setText("DIŞARDA");
            st11.setBackground(Color.RED);
            t11.start();
            
        } 
            }
    }//GEN-LAST:event_five11ActionPerformed

    private void gift11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift11ActionPerformed
        // TODO add your handling code here:
          if(!giftb11){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift11.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb11=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift11.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb11=false;
        }
    }//GEN-LAST:event_gift11ActionPerformed

    private void money10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money10MouseClicked
        // TODO add your handling code here:
        money10.setText("ALINDI");
        money10.setBackground(g);
    }//GEN-LAST:event_money10MouseClicked

    private void reset10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset10ActionPerformed
        // TODO add your handling code here:
        if(!resetb10&&state10){
            
               reset++; 
             resetb10=true;
            
            
        }
    }//GEN-LAST:event_reset10ActionPerformed

    private void stop10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop10ActionPerformed
        // TODO add your handling code here:
        if(state10){
            state10=false;
        }
    }//GEN-LAST:event_stop10ActionPerformed

    private void five10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five10ActionPerformed
        // TODO add your handling code here:
          if(t10.isAlive()){
                ortak10+=300;
            st10.setText("DIŞARDA");
            st10.setBackground(Color.RED);
            count10++;
            }else{
               state10=true;
               resetb10=false;
               count10++;
                 t10=new Thread(){
            
            public void run(){
                ortak10+=fivesecond10;
                for(;;){
                    if(resetb10){
                        millisecond10=0;
                        fivesecond10=301;
                        count10=0;
                        ortak10=0;
                        label10.setText("0");
                        label10.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     10       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     10       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state10==true&&ortak10!=0){
                        try {
                            sleep(4);
                            if(millisecond10>1000){
                                millisecond10=0;
                                ortak10--;
                                label10.setText(""+ortak10);
                            }
                            allowPause10();
                            if(ortak10<=60&&ortak10>=30){
                                Color a=Color.RED;
                                label10.setBackground(a); 
                            }else if(ortak10<30&&ortak10>0){
                                if(ortak10%2==1){
                                    label10.setBackground(Color.YELLOW); 
                                }else{
                                    label10.setBackground(Color.RED);
                                }
                              
                            }if(ortak10==1&&sound10){
                                    sound();
                                    sound10=false;
                                }
                            
                            millisecond10+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond10=0;
                        fivesecond10=301;
                        total+=count10;
                        count10=0;
                        ortak10=0;
                        label10.setText("0");
                        label10.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     10       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     10       "+"                            1  ";
                        addElement();
                        count++;
                        sound10=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond10==301&&tensecond10==601&&!t10.isAlive()){
            money10.setText("ALINMADI");
            money10.setBackground(Color.RED);
            st10.setText("DIŞARDA");
            st10.setBackground(Color.RED);
            t10.start();
            
        } 
            }
    }//GEN-LAST:event_five10ActionPerformed

    private void gift10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift10ActionPerformed
        // TODO add your handling code here:
          if(!giftb10){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift10.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb10=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift10.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb10=false;
        }
    }//GEN-LAST:event_gift10ActionPerformed

    private void stop9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop9ActionPerformed
        // TODO add your handling code here:
        if(state9){
            state9=false;
        }
    }//GEN-LAST:event_stop9ActionPerformed

    private void money9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money9MouseClicked
        // TODO add your handling code here:
        money9.setText("ALINDI");
        money9.setBackground(g);
    }//GEN-LAST:event_money9MouseClicked

    private void reset9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset9ActionPerformed
        // TODO add your handling code here:
        if(!resetb9&&state9){
            
               reset++; 
             resetb9=true;
            
            
        }
    }//GEN-LAST:event_reset9ActionPerformed

    private void five9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five9ActionPerformed
        // TODO add your handling code here:
          if(t9.isAlive()){
                ortak9+=300;
            st9.setText("DIŞARDA");
            st9.setBackground(Color.RED);
            count9++;
            }else{
               state9=true;
               resetb9=false;
               count9++;
                 t9=new Thread(){
            
            public void run(){
                ortak9+=fivesecond9;
                for(;;){
                    if(resetb9){
                        millisecond9=0;
                        fivesecond9=301;
                        count9=0;
                        ortak9=0;
                        label9.setText("0");
                        label9.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     9       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     9       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state9==true&&ortak9!=0){
                        try {
                            sleep(4);
                            if(millisecond9>1000){
                                millisecond9=0;
                                ortak9--;
                                label9.setText(""+ortak9);
                            }
                            allowPause9();
                            if(ortak9<=60&&ortak9>=30){
                                Color a=Color.RED;
                                label9.setBackground(a); 
                            }else if(ortak9<30&&ortak9>0){
                                if(ortak9%2==1){
                                    label9.setBackground(Color.YELLOW); 
                                }else{
                                    label9.setBackground(Color.RED);
                                }
                              
                            }if(ortak9==1&&sound9){
                                    sound();
                                    sound9=false;
                                }
                            
                            millisecond9+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond9=0;
                        fivesecond9=301;
                        total+=count9;
                        count9=0;
                        ortak9=0;
                        label9.setText("0");
                        label9.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     9       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     9       "+"                            1  ";
                        addElement();
                        count++;
                        sound9=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond9==301&&tensecond9==601&&!t9.isAlive()){
            money9.setText("ALINMADI");
            money9.setBackground(Color.RED);
            st9.setText("DIŞARDA");
            st9.setBackground(Color.RED);
            t9.start();
            
        } 
            }
    }//GEN-LAST:event_five9ActionPerformed

    private void gift9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift9ActionPerformed
        // TODO add your handling code here:
          if(!giftb9){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift9.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb9=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift9.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb9=false;
        }
    }//GEN-LAST:event_gift9ActionPerformed

    private void stop8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop8ActionPerformed
        // TODO add your handling code here:
        if(state8){
            state8=false;
        }
    }//GEN-LAST:event_stop8ActionPerformed

    private void money8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money8MouseClicked
        // TODO add your handling code here:
        money8.setText("ALINDI");
        money8.setBackground(g);
    }//GEN-LAST:event_money8MouseClicked

    private void reset8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset8ActionPerformed
        // TODO add your handling code here:
        if(!resetb8&&state8){
            
               reset++; 
             resetb8=true;
            
            
        }
    }//GEN-LAST:event_reset8ActionPerformed

    private void five8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five8ActionPerformed
        // TODO add your handling code here:
         if(t8.isAlive()){
                ortak8+=300;
            st8.setText("DIŞARDA");
            st8.setBackground(Color.RED);
            count8++;
            }else{
               state8=true;
               resetb8=false;
               count8++;
                 t8=new Thread(){
            
            public void run(){
                ortak8+=fivesecond8;
                for(;;){
                    if(resetb8){
                        millisecond8=0;
                        fivesecond8=301;
                        count8=0;
                        ortak8=0;
                        label8.setText("0");
                        label8.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     8       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     8       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state8==true&&ortak8!=0){
                        try {
                            sleep(4);
                            if(millisecond8>1000){
                                millisecond8=0;
                                ortak8--;
                                label8.setText(""+ortak8);
                            }
                            allowPause8();
                            if(ortak8<=60&&ortak8>=30){
                                Color a=Color.RED;
                                label8.setBackground(a); 
                            }else if(ortak8<30&&ortak8>0){
                                if(ortak8%2==1){
                                    label8.setBackground(Color.YELLOW); 
                                }else{
                                    label8.setBackground(Color.RED);
                                }
                              
                            }if(ortak8==1&&sound8){
                                    sound();
                                    sound8=false;
                                }
                            
                            millisecond8+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond8=0;
                        fivesecond8=301;
                        total+=count8;
                        count8=0;
                        ortak8=0;
                        label8.setText("0");
                        label8.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     8       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     8       "+"                            1  ";
                        addElement();
                        count++;
                        sound8=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond8==301&&tensecond8==601&&!t8.isAlive()){
            money8.setText("ALINMADI");
            money8.setBackground(Color.RED);
            st8.setText("DIŞARDA");
            st8.setBackground(Color.RED);
            t8.start();
            
        } 
            }
    }//GEN-LAST:event_five8ActionPerformed

    private void gift8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift8ActionPerformed
        // TODO add your handling code here:
          if(!giftb8){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift8.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb8=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift8.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb8=false;
        }
    }//GEN-LAST:event_gift8ActionPerformed

    private void stop7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop7ActionPerformed
        // TODO add your handling code here:
        if(state7){
            state7=false;
        }
    }//GEN-LAST:event_stop7ActionPerformed

    private void money7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money7MouseClicked
        // TODO add your handling code here:
        money7.setText("ALINDI");
        money7.setBackground(g);
    }//GEN-LAST:event_money7MouseClicked

    private void reset7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset7ActionPerformed
        // TODO add your handling code here:
        if(!resetb7&&state7){
            
               reset++; 
             resetb7=true;
            
            
        }
    }//GEN-LAST:event_reset7ActionPerformed

    private void five7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five7ActionPerformed
        // TODO add your handling code here:
          if(t7.isAlive()){
                ortak7+=300;
            st7.setText("DIŞARDA");
            st7.setBackground(Color.RED);
            count7++;
            }else{
               state7=true;
               resetb7=false;
               count7++;
                 t7=new Thread(){
            
            public void run(){
                ortak7+=fivesecond7;
                for(;;){
                    if(resetb7){
                        millisecond7=0;
                        fivesecond7=301;
                        count7=0;
                        ortak7=0;
                        label7.setText("0");
                        label7.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     7       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     7       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state7==true&&ortak7!=0){
                        try {
                            sleep(4);
                            if(millisecond7>1000){
                                millisecond7=0;
                                ortak7--;
                                label7.setText(""+ortak7);
                            }
                            allowPause7();
                            if(ortak7<=60&&ortak7>=30){
                                Color a=Color.RED;
                                label7.setBackground(a); 
                            }else if(ortak7<30&&ortak7>0){
                                if(ortak7%2==1){
                                    label7.setBackground(Color.YELLOW); 
                                }else{
                                    label7.setBackground(Color.RED);
                                }
                              
                            }if(ortak7==1&&sound7){
                                    sound();
                                    sound7=false;
                                }
                            
                            millisecond7+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond7=0;
                        fivesecond7=301;
                        total+=count7;
                        count7=0;
                        ortak7=0;
                        label7.setText("0");
                        label7.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     7       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     7       "+"                            1  ";
                        addElement();
                        count++;
                        sound7=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond7==301&&tensecond7==601&&!t7.isAlive()){
            money7.setText("ALINMADI");
            money7.setBackground(Color.RED);
            st7.setText("DIŞARDA");
            st7.setBackground(Color.RED);
            t7.start();
            
        } 
            }
    }//GEN-LAST:event_five7ActionPerformed

    private void gift7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift7ActionPerformed
        // TODO add your handling code here:
          if(!giftb7){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift7.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb7=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift7.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb7=false;
        }
    }//GEN-LAST:event_gift7ActionPerformed

    private void stop6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop6ActionPerformed
        // TODO add your handling code here:
        if(state6){
            state6=false;
        }
    }//GEN-LAST:event_stop6ActionPerformed

    private void money6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money6MouseClicked
        // TODO add your handling code here:
        money6.setText("ALINDI");
        money6.setBackground(g);
    }//GEN-LAST:event_money6MouseClicked

    private void reset6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset6ActionPerformed
        // TODO add your handling code here:
        if(!resetb6&&state6){
            
               reset++; 
             resetb6=true;
            
            
        }
    }//GEN-LAST:event_reset6ActionPerformed

    private void five6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five6ActionPerformed
        // TODO add your handling code here:
          if(t6.isAlive()){
                ortak6+=300;
            st6.setText("DIŞARDA");
            st6.setBackground(Color.RED);
            count6++;
            }else{
               state6=true;
               resetb6=false;
               count6++;
                 t6=new Thread(){
            
            public void run(){
                ortak6+=fivesecond6;
                for(;;){
                    if(resetb6){
                        millisecond6=0;
                        fivesecond6=301;
                        count6=0;
                        ortak6=0;
                        label6.setText("0");
                        label6.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     6       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     6       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state6==true&&ortak6!=0){
                        try {
                            sleep(4);
                            if(millisecond6>1000){
                                millisecond6=0;
                                ortak6--;
                                label6.setText(""+ortak6);
                            }
                            allowPause6();
                            if(ortak6<=60&&ortak6>=30){
                                Color a=Color.RED;
                                label6.setBackground(a); 
                            }else if(ortak6<30&&ortak6>0){
                                if(ortak6%2==1){
                                    label6.setBackground(Color.YELLOW); 
                                }else{
                                    label6.setBackground(Color.RED);
                                }
                              
                            }if(ortak6==1&&sound6){
                                    sound();
                                    sound6=false;
                                }
                            
                            millisecond6+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond6=0;
                        fivesecond6=301;
                        total+=count6;
                        count6=0;
                        ortak6=0;
                        label6.setText("0");
                        label6.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     6       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     6       "+"                            1  ";
                        addElement();
                        count++;
                        sound6=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond6==301&&tensecond6==601&&!t6.isAlive()){
            money6.setText("ALINMADI");
            money6.setBackground(Color.RED);
            st6.setText("DIŞARDA");
            st6.setBackground(Color.RED);
            t6.start();
            
        } 
            }
    }//GEN-LAST:event_five6ActionPerformed

    private void gift6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift6ActionPerformed
        // TODO add your handling code here:
        if(!giftb6){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift6.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb6=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift6.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb6=false;
        }
          
    }//GEN-LAST:event_gift6ActionPerformed

    private void stop5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop5ActionPerformed
        // TODO add your handling code here:
        if(state5){
            state5=false;
        }
    }//GEN-LAST:event_stop5ActionPerformed

    private void money5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money5MouseClicked
        // TODO add your handling code here:
        money5.setText("ALINDI");
        money5.setBackground(g);
    }//GEN-LAST:event_money5MouseClicked

    private void reset5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset5ActionPerformed
        // TODO add your handling code here:
        if(!resetb5&&state5){
            
               reset++; 
            resetb5=true;
            
            
        }
    }//GEN-LAST:event_reset5ActionPerformed

    private void five5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five5ActionPerformed
        // TODO add your handling code here:
         if(t5.isAlive()){
                ortak5+=300;
            st5.setText("DIŞARDA");
            st5.setBackground(Color.RED);
            count5++;
            }else{
               state5=true;
               resetb5=false;
               count5++;
                 t5=new Thread(){
            
            public void run(){
                ortak5+=fivesecond5;
                for(;;){
                    if(resetb5){
                        millisecond5=0;
                        fivesecond5=301;
                        count5=0;
                        ortak5=0;
                        label5.setText("0");
                        label5.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     5       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     5       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state5==true&&ortak5!=0){
                        try {
                            sleep(4);
                            if(millisecond5>1000){
                                millisecond5=0;
                                ortak5--;
                                label5.setText(""+ortak5);
                            }
                            allowPause5();
                            if(ortak5<=60&&ortak5>=30){
                                Color a=Color.RED;
                                label5.setBackground(a); 
                            }else if(ortak5<30&&ortak5>0){
                                if(ortak5%2==1){
                                    label5.setBackground(Color.YELLOW); 
                                }else{
                                    label5.setBackground(Color.RED);
                                }
                              
                            }if(ortak5==1&&sound5){
                                    sound();
                                    sound5=false;
                                }
                            
                            millisecond5+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond5=0;
                        fivesecond5=301;
                        total+=count5;
                        count5=0;
                        ortak5=0;
                        label5.setText("0");
                        label5.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     5       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     5       "+"                            1  ";
                        addElement();
                        count++;
                        sound5=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond5==301&&tensecond5==601&&!t5.isAlive()){
            money5.setText("ALINMADI");
            money5.setBackground(Color.RED);
            st5.setText("DIŞARDA");
            st5.setBackground(Color.RED);
            t5.start();
            
        } 
            }
            
    }//GEN-LAST:event_five5ActionPerformed

    private void gift5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift5ActionPerformed
        // TODO add your handling code here:
         if(!giftb5){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift5.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb5=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift5.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb5=false;
        }
    }//GEN-LAST:event_gift5ActionPerformed

    private void stop4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop4ActionPerformed
        // TODO add your handling code here:
        if(state4){
            state4=false;
        }
    }//GEN-LAST:event_stop4ActionPerformed

    private void money4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money4MouseClicked
        // TODO add your handling code here:
        money4.setText("ALINDI");
        money4.setBackground(g);
    }//GEN-LAST:event_money4MouseClicked

    private void reset4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset4ActionPerformed
        // TODO add your handling code here:
         if(!resetb4&&state4){
            
               reset++; 
            resetb4=true;
            
            
        }
    }//GEN-LAST:event_reset4ActionPerformed

    private void five4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five4ActionPerformed
        // TODO add your handling code here:
         if(t4.isAlive()){
                ortak4+=300;
            st4.setText("DIŞARDA");
            st4.setBackground(Color.RED);
            count4++;
            }else{
               state4=true;
               resetb4=false;
               count4++;
                 t4=new Thread(){
            
            public void run(){
                ortak4+=fivesecond4;
                for(;;){
                    if(resetb4){
                        millisecond4=0;
                        count4=0;
                        fivesecond4=301;
                        ortak4=0;
                        label4.setText("0");
                        label4.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     4       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     4       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state4==true&&ortak4!=0){
                        try {
                            sleep(4);
                            if(millisecond4>1000){
                                millisecond4=0;
                                ortak4--;
                                label4.setText(""+ortak4);
                            }
                            allowPause4();
                            if(ortak4<=60&&ortak4>=30){
                                Color a=Color.RED;
                                label4.setBackground(a); 
                            }else if(ortak4<30&&ortak4>0){
                                if(ortak4%2==1){
                                    label4.setBackground(Color.YELLOW); 
                                }else{
                                    label4.setBackground(Color.RED);
                                }
                              
                            }if(ortak4==1&&sound4){
                                    sound();
                                    sound4=false;
                                }
                            
                            millisecond4+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond4=0;
                        fivesecond4=301;
                        total+=count4;
                        count4=0;
                        ortak4=0;
                        label4.setText("0");
                        label4.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     4       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     4       "+"                            1  ";
                        addElement();
                        count++;
                        sound4=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond4==301&&tensecond4==601&&!t4.isAlive()){
            money4.setText("ALINMADI");
            money4.setBackground(Color.RED);
            st4.setText("DIŞARDA");
            st4.setBackground(Color.RED);
            t4.start();
            
        } 
            }
            
            
        
        
           

    }//GEN-LAST:event_five4ActionPerformed

    private void gift4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift4ActionPerformed
        // TODO add your handling code here:
        if(!giftb4){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift4.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb4=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift4.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb4=false;
        }
    }//GEN-LAST:event_gift4ActionPerformed

    private void stop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop3ActionPerformed
        // TODO add your handling code here:
        if(state3){
            state3=false;
        }
    }//GEN-LAST:event_stop3ActionPerformed

    private void money3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money3MouseClicked
        // TODO add your handling code here:
        money3.setText("ALINDI");
        money3.setBackground(g);
    }//GEN-LAST:event_money3MouseClicked

    private void reset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset3ActionPerformed
        // TODO add your handling code here:
        if(!resetb3&&state3){
            
               reset++; 
            resetb3=true;
            
            
        }
    }//GEN-LAST:event_reset3ActionPerformed

    private void five3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five3ActionPerformed
        if(t3.isAlive()){
                ortak3+=300;
            st3.setText("DIŞARDA");
            st3.setBackground(Color.RED);
            count3++;
            }else{
               state3=true;
               resetb3=false;
               count3++;
                 t3=new Thread(){
            
            public void run(){
                ortak3+=fivesecond3;
                for(;;){
                    if(resetb3){
                        millisecond3=0;
                        fivesecond3=301;
                        ortak3=0;
                        count3=0;
                        label3.setText("0");
                        label3.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     3       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     3       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state3==true&&ortak3!=0){
                        try {
                            sleep(4);
                            if(millisecond3>1000){
                                millisecond3=0;
                                ortak3--;
                                label3.setText(""+ortak3);
                            }
                            allowPause3();
                            if(ortak3<=60&&ortak3>=30){
                                Color a=Color.RED;
                                label3.setBackground(a); 
                            }else if(ortak3<30&&ortak3>0){
                                if(ortak3%2==1){
                                    label3.setBackground(Color.YELLOW); 
                                }else{
                                    label3.setBackground(Color.RED);
                                }
                              
                            }if(ortak3==1&&sound3){
                                    sound();
                                    sound3=false;
                                }
                            
                            millisecond3+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond3=0;
                        fivesecond3=301;
                        total+=count3;
                        count3=0;
                        ortak3=0;
                        label3.setText("0");
                        label3.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     3       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     3       "+"                            1  ";
                        addElement();
                        sound3=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond3==301&&tensecond3==601&&!t3.isAlive()){
            money3.setText("ALINMADI");
            money3.setBackground(Color.RED);
            st3.setText("DIŞARDA");
            st3.setBackground(Color.RED);
            t3.start();
            
        } 
            }
            
            
        
        
            

    }//GEN-LAST:event_five3ActionPerformed

    private void gift3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift3ActionPerformed
        // TODO add your handling code here:
         if(!giftb3){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift3.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb3=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift3.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb3=false;
        }
        
    }//GEN-LAST:event_gift3ActionPerformed

    private void money2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money2MouseClicked
        // TODO add your handling code here:
        money2.setText("ALINDI");
        money2.setBackground(g);
    }//GEN-LAST:event_money2MouseClicked

    private void money1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money1MouseClicked
        // TODO add your handling code here:
        money1.setText("ALINDI");
        money1.setBackground(g);
    }//GEN-LAST:event_money1MouseClicked

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
        // TODO add your handling code here:
        if(!resetb2&&state2){
            
            
               reset++; 
            resetb2=true;
            
            
            
        }
    }//GEN-LAST:event_reset2ActionPerformed

    private void stop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop2ActionPerformed
        // TODO add your handling code here:
        if(state2){

            
            state2=false;
        }
    }//GEN-LAST:event_stop2ActionPerformed

    private void five2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five2ActionPerformed
        // TODO add your handling code here:
         if(t2.isAlive()){
                ortak2+=300;
            st2.setText("DIŞARDA");
            st2.setBackground(Color.RED);
            count2++;
            }else{
               state2=true;
               resetb2=false;
               count2++;
                 t2=new Thread(){
            
            public void run(){
                ortak2+=fivesecond2;
                for(;;){
                    if(resetb2){
                        millisecond2=0;
                        fivesecond2=301;
                        count2=0;
                        ortak2=0;
                        label2.setText("0");
                        label2.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     2      "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     2      "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state2==true&&ortak2!=0){
                        try {
                            sleep(4);
                            if(millisecond2>1000){
                                millisecond2=0;
                                ortak2--;
                                label2.setText(""+ortak2);
                            }
                            allowPause2();
                            if(ortak2<=60&&ortak2>=30){
                                Color a=Color.RED;
                                label2.setBackground(a); 
                            }else if(ortak2<30&&ortak2>0){
                                if(ortak2%2==1){
                                    label2.setBackground(Color.YELLOW); 
                                }else{
                                    label2.setBackground(Color.RED);
                                }
                              
                            }if(ortak2==1&&sound2){
                                    sound();
                                    sound2=false;
                                }
                            
                            millisecond2+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond2=0;
                        fivesecond2=301;
                        total+=count2;
                        count2=0;
                        ortak2=0;
                        label2.setText("0");
                        label2.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     2       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     2       "+"                            1  ";
                        addElement();
                        count++;
                        sound2=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond2==301&&tensecond2==601&&!t2.isAlive()){
            money2.setText("ALINMADI");
            money2.setBackground(Color.RED);
            st2.setText("DIŞARDA");
            st2.setBackground(Color.RED);
            t2.start();
            
        } 
            }
            
            
        
        
            

        
    }//GEN-LAST:event_five2ActionPerformed

    private void gift2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift2ActionPerformed
        // TODO add your handling code here:
        if(!giftb2){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift2.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb2=true;
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift2.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb2=false;
        }
        
    }//GEN-LAST:event_gift2ActionPerformed

    private void ten1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten1ActionPerformed
        // TODO add your handling code here:
        //10 DAKİKA
            if(t1.isAlive()){
                ortak1+=600;
            st1.setText("DIŞARDA");
            st1.setBackground(Color.RED);
            count1+=2;
            }else{
               state1=true;
               resetb1=false;
               count1+=2;
                 t1=new Thread(){
            
            public void run(){
                ortak1+=tensecond1;
                for(;;){
                    if(resetb1){
                        millisecond1=0;
                        count1=0;
                        tensecond1=601;
                        ortak1=0;
                        label1.setText("0");
                        label1.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     1       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     1       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state1==true&&ortak1!=0){
                        try {
                            sleep(4);
                            if(millisecond1>1000){
                                millisecond1=0;
                                ortak1--;
                                label1.setText(""+ortak1);
                            }
                            allowPause1();
                            if(ortak1<=60&&ortak1>=30){
                                Color a=Color.RED;
                                label1.setBackground(a); 
                            }else if(ortak1<30&&ortak1>0){
                                if(ortak1%2==1){
                                    label1.setBackground(Color.YELLOW); 
                                }else{
                                    label1.setBackground(Color.RED);
                                }
                              
                            }if(ortak1==1&&sound1){
                                    sound();
                                    sound1=false;
                                }
                            
                            millisecond1+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond1=0;
                        ortak1=0;
                        label1.setText("0");
                        label1.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     1       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     1       "+"                          1  ";
                        addElement();
                        total+=count1;
                        count1=0;
                        sound1=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond1==301&&tensecond1==601&&!t1.isAlive()){
            money1.setText("ALINMADI");
            money1.setBackground(Color.RED);
            st1.setText("DIŞARDA");
            st1.setBackground(Color.RED);
            t1.start();
            
        } 
            }
    }//GEN-LAST:event_ten1ActionPerformed

    //5 DAKİKA METHODU
    private void five1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five1ActionPerformed
        // TODO add your handling code here:
        if(t1.isAlive()){
                ortak1+=300;
                count1++;
            st1.setText("DIŞARDA");
            st1.setBackground(Color.RED);
            }else{
               state1=true;
               resetb1=false;
               count1++;
                 t1=new Thread(){
            
            public void run(){
                ortak1+=fivesecond1;
                for(;;){
                    if(resetb1){
                        millisecond1=0;
                        fivesecond1=301;
                        count1=0;
                        ortak1=0;
                        label1.setText("0");
                        label1.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     1       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     1       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state1==true&&ortak1!=0){
                        try {
                            sleep(4);
                            if(millisecond1>1000){
                                millisecond1=0;
                                ortak1--;
                                label1.setText(""+ortak1);
                            }
                            allowPause1();
                            if(ortak1<=60&&ortak1>=30){
                                Color a=Color.RED;
                                label1.setBackground(a); 
                            }else if(ortak1<30&&ortak1>0){
                                if(ortak1%2==1){
                                    label1.setBackground(Color.YELLOW); 
                                }else{
                                    label1.setBackground(Color.RED);
                                }
                              
                            }if(ortak1==1&&sound1){
                                    sound();
                                    sound1=false;
                                }
                            
                            millisecond1+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond1=0;
                        fivesecond1=301;
                        ortak1=0;
                        label1.setText("0");
                        label1.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     1       "+"                            1  "+"\r\n";
                        text1=dtf.format(now)+"     1       "+"                            1  ";
                        addElement();
                        total+=count1;
                        count1=0;
                        sound1=true;
                        break;
                    }
                }

            }
        };
            
        
        if(fivesecond1==301&&tensecond1==601&&!t1.isAlive()){
            money1.setText("ALINMADI");
            money1.setBackground(Color.RED);
            st1.setText("DIŞARDA");
            st1.setBackground(Color.RED);
            t1.start();
            
        } 
            }
            
            
    }//GEN-LAST:event_five1ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        // TODO add your handling code here:
        if(!resetb1&&state1){
            
            
               reset++; 
            resetb1=true;
            
    }//GEN-LAST:event_reset1ActionPerformed
    }
    private void stop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop1ActionPerformed
        if(state1){

            
            state1=false;
        }
    }//GEN-LAST:event_stop1ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        // TODO add your handling code here:
        
        if(!hide){
            jLabel2.setText("GEÇERLİ BİNİŞ:  "+total);
            jLabel1.setText("RESET:    "+reset);
            
            hide=true;
        }else{
           hide=false;
            jLabel2.setText("GEÇERLİ BİNİŞ:     ");
            jLabel1.setText("RESET:    ");
            
        }
    }//GEN-LAST:event_jButton97ActionPerformed

    private void st1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st1MouseClicked
        // TODO add your handling code here:
       st1.setBackground(g);
       st1.setText("STANDTA");
       label1.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st1MouseClicked

    private void st2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st2MouseClicked
        // TODO add your handling code here:
        st2.setBackground(g);
       st2.setText("STANDTA");
       label2.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st2MouseClicked

    private void st3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st3MouseClicked
        // TODO add your handling code here:
        st3.setBackground(g);
       st3.setText("STANDTA");
       label3.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st3MouseClicked

    private void st4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st4MouseClicked
        // TODO add your handling code here:
        st4.setBackground(g);
       st4.setText("STANDTA");
       label4.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st4MouseClicked

    private void st5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st5MouseClicked
        // TODO add your handling code here:
        st5.setBackground(g);
       st5.setText("STANDTA");
       label5.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st5MouseClicked

    private void st6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st6MouseClicked
        // TODO add your handling code here:
        st6.setBackground(g);
       st6.setText("STANDTA");
       label6.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st6MouseClicked

    private void st7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st7MouseClicked
        // TODO add your handling code here:
        st7.setBackground(g);
       st7.setText("STANDTA");
       label7.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st7MouseClicked

    private void st8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st8MouseClicked
        // TODO add your handling code here:
        st8.setBackground(g);
       st8.setText("STANDTA");
       label8.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st8MouseClicked

    private void st9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st9MouseClicked
        // TODO add your handling code here:
        st9.setBackground(g);
       st9.setText("STANDTA");
       label9.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st9MouseClicked

    private void st10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st10MouseClicked
        // TODO add your handling code here:
        st10.setBackground(g);
       st10.setText("STANDTA");
       label10.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st10MouseClicked

    private void st11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st11MouseClicked
        // TODO add your handling code here:
        st11.setBackground(g);
       st11.setText("STANDTA");
       label11.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st11MouseClicked

    private void st12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st12MouseClicked
        // TODO add your handling code here:
        st12.setBackground(g);
       st12.setText("STANDTA");
       label12.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st12MouseClicked

    private void st13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st13MouseClicked
        // TODO add your handling code here:
        st13.setBackground(g);
       st13.setText("STANDTA");
       label13.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st13MouseClicked

    private void st14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st14MouseClicked
        // TODO add your handling code here:
        st14.setBackground(g);
       st14.setText("STANDTA");
       label14.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st14MouseClicked

    private void st15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st15MouseClicked
        // TODO add your handling code here:
        st15.setBackground(g);
       st15.setText("STANDTA");
       label15.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st15MouseClicked

    private void st16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st16MouseClicked
        // TODO add your handling code here:
        st16.setBackground(g);
       st16.setText("STANDTA");
       label16.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st16MouseClicked

    private void st17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st17MouseClicked
        // TODO add your handling code here:
        st17.setBackground(g);
       st17.setText("STANDTA");
       label17.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st17MouseClicked

    private void st18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st18MouseClicked
        // TODO add your handling code here:
        st18.setBackground(g);
       st18.setText("STANDTA");
       label18.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st18MouseClicked

    private void st19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st19MouseClicked
        // TODO add your handling code here:
        st19.setBackground(g);
       st19.setText("STANDTA");
       label19.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st19MouseClicked

    private void st20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st20MouseClicked
        // TODO add your handling code here:
        st20.setBackground(g);
       st20.setText("STANDTA");
       label20.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st20MouseClicked

    private void st21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st21MouseClicked
        // TODO add your handling code here:
        st21.setBackground(g);
       st21.setText("STANDTA");
       label21.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st21MouseClicked

    private void st22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st22MouseClicked
        // TODO add your handling code here:
        st22.setBackground(g);
       st22.setText("STANDTA");
       label22.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st22MouseClicked

    private void st23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st23MouseClicked
        // TODO add your handling code here:
        st23.setBackground(g);
       st23.setText("STANDTA");
       label23.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st23MouseClicked

    private void st24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st24MouseClicked
        // TODO add your handling code here:
        st24.setBackground(g);
       st24.setText("STANDTA");
       label24.setBackground(Color.YELLOW);
    }//GEN-LAST:event_st24MouseClicked

    private void ten2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten2ActionPerformed
        // TODO add your handling code here:
        if(t2.isAlive()){
                ortak2+=600;
            st2.setText("DIŞARDA");
            st2.setBackground(Color.RED);
            count2+=2;
            
            }else{
               state2=true;
               resetb2=false;
               count2+=2;
                 t2=new Thread(){
            
            public void run(){
                ortak2+=tensecond2;
                for(;;){
                    if(resetb2){
                        millisecond2=0;
                        tensecond2=601;
                        count2=0;
                        ortak2=0;
                        label2.setText("0");
                        label2.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     2       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     2       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state2==true&&ortak2!=0){
                        try {
                            sleep(4);
                            if(millisecond2>1000){
                                millisecond2=0;
                                ortak2--;
                                label2.setText(""+ortak2);
                            }
                            allowPause2();
                            if(ortak2<=60&&ortak2>=30){
                                Color a=Color.RED;
                                label2.setBackground(a); 
                            }else if(ortak2<30&&ortak2>0){
                                if(ortak2%2==1){
                                    label2.setBackground(Color.YELLOW); 
                                }else{
                                    label2.setBackground(Color.RED);
                                }
                              
                            }if(ortak2==1&&sound2){
                                    sound();
                                    sound2=false;
                                }
                            
                            millisecond2+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond2=0;
                        total+=count2;
                        count2=0;
                        ortak2=0;
                        label2.setText("0");
                        label2.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     2       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     2       "+"                          1  ";
                        addElement();
                        count++;
                        sound2=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond2==301&&tensecond2==601&&!t2.isAlive()){
            money2.setText("ALINMADI");
            money2.setBackground(Color.RED);
            st2.setText("DIŞARDA");
            st2.setBackground(Color.RED);
            t2.start();
            
        } 
            }
            

     
    }//GEN-LAST:event_ten2ActionPerformed

    private void ten3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten3ActionPerformed
        // TODO add your handling code here:
         if(t3.isAlive()){
                ortak3+=600;
            st3.setText("DIŞARDA");
            st3.setBackground(Color.RED);
            count3+=2;
            }else{
               state3=true;
               resetb3=false;
               count3+=2;
                 t3=new Thread(){
            
            public void run(){
                ortak3+=tensecond3;
                for(;;){
                    if(resetb3){
                        millisecond3=0;
                        tensecond3=601;
                        count3=0;
                        ortak3=0;
                        label3.setText("0");
                        label3.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     3       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     3       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state3==true&&ortak3!=0){
                        try {
                            sleep(4);
                            if(millisecond3>1000){
                                millisecond3=0;
                                ortak3--;
                                label3.setText(""+ortak3);
                            }
                            allowPause3();
                            if(ortak3<=60&&ortak3>=30){
                                Color a=Color.RED;
                                label3.setBackground(a); 
                            }else if(ortak3<30&&ortak3>0){
                                if(ortak3%2==1){
                                    label3.setBackground(Color.YELLOW); 
                                }else{
                                    label3.setBackground(Color.RED);
                                }
                              
                            }if(ortak3==1&&sound3){
                                    sound();
                                    sound3=false;
                                }
                            
                            millisecond3+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond3=0;
                        total+=count3;
                        count3=0;
                        ortak3=0;
                        label3.setText("0");
                        label3.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     3       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     3       "+"                          1  ";
                        addElement();
                        count++;
                        sound3=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond3==301&&tensecond3==601&&!t3.isAlive()){
            money3.setText("ALINMADI");
            money3.setBackground(Color.RED);
            st3.setText("DIŞARDA");
            st3.setBackground(Color.RED);
            t3.start();
            
        } 
            }
    }//GEN-LAST:event_ten3ActionPerformed

    private void ten4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten4ActionPerformed
        // TODO add your handling code here:
          if(t4.isAlive()){
                ortak4+=600;
            st4.setText("DIŞARDA");
            st4.setBackground(Color.RED);
            count4+=2;
            
            }else{
               state4=true;
               resetb4=false;
               count4+=2;
                 t4=new Thread(){
            
            public void run(){
                ortak4+=tensecond4;
                for(;;){
                    if(resetb4){
                        millisecond4=0;
                        tensecond4=601;
                        count4=0;
                        ortak4=0;
                        label4.setText("0");
                        label4.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     4       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     4       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state4==true&&ortak4!=0){
                        try {
                            sleep(4);
                            if(millisecond4>1000){
                                millisecond4=0;
                                ortak4--;
                                label4.setText(""+ortak4);
                            }
                            allowPause4();
                            if(ortak4<=60&&ortak4>=30){
                                Color a=Color.RED;
                                label4.setBackground(a); 
                            }else if(ortak4<30&&ortak4>0){
                                if(ortak4%2==1){
                                    label4.setBackground(Color.YELLOW); 
                                }else{
                                    label4.setBackground(Color.RED);
                                }
                              
                            }if(ortak4==1&&sound4){
                                    sound();
                                    sound4=false;
                                }
                            
                            millisecond4+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond4=0;
                        total+=count4;
                        count4=0;
                        ortak4=0;
                        label4.setText("0");
                        label4.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     4       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     4       "+"                          1  ";
                        addElement();
                        count++;
                        sound4=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond4==301&&tensecond4==601&&!t4.isAlive()){
            money4.setText("ALINMADI");
            money4.setBackground(Color.RED);
            st4.setText("DIŞARDA");
            st4.setBackground(Color.RED);
            t4.start();
            
        } 
            }
    }//GEN-LAST:event_ten4ActionPerformed

    private void ten5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten5ActionPerformed
        // TODO add your handling code here:
         if(t5.isAlive()){
                ortak5+=600;
            st5.setText("DIŞARDA");
            st5.setBackground(Color.RED);
            count5+=2;
            }else{
               state5=true;
               resetb5=false;
               count5+=2;
                 t5=new Thread(){
            
            public void run(){
                ortak5+=tensecond5;
                for(;;){
                    if(resetb5){
                        millisecond5=0;
                        tensecond5=601;
                        count5=0;
                        ortak5=0;
                        label5.setText("0");
                        label5.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     5       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     5       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state5==true&&ortak5!=0){
                        try {
                            sleep(4);
                            if(millisecond5>1000){
                                millisecond5=0;
                                ortak5--;
                                label5.setText(""+ortak5);
                            }
                            allowPause5();
                            if(ortak5<=60&&ortak5>=30){
                                Color a=Color.RED;
                                label5.setBackground(a); 
                            }else if(ortak5<30&&ortak5>0){
                                if(ortak5%2==1){
                                    label5.setBackground(Color.YELLOW); 
                                }else{
                                    label5.setBackground(Color.RED);
                                }
                              
                            }if(ortak5==1&&sound5){
                                    sound();
                                    sound5=false;
                                }
                            
                            millisecond5+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond5=0;
                        total+=count5;
                        count5=0;
                        ortak5=0;
                        label5.setText("0");
                        label5.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     5       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     5       "+"                          1  ";
                        addElement();
                        count++;
                        sound5=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond5==301&&tensecond5==601&&!t5.isAlive()){
            money5.setText("ALINMADI");
            money5.setBackground(Color.RED);
            st5.setText("DIŞARDA");
            st5.setBackground(Color.RED);
            t5.start();
            
        } 
            }
    }//GEN-LAST:event_ten5ActionPerformed

    private void ten6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten6ActionPerformed
        // TODO add your handling code here:
          if(t6.isAlive()){
                ortak6+=600;
            st6.setText("DIŞARDA");
            st6.setBackground(Color.RED);
            count6+=2;
            }else{
               state6=true;
               resetb6=false;
               count6+=2;
                 t6=new Thread(){
            
            public void run(){
                ortak6+=tensecond6;
                for(;;){
                    if(resetb6){
                        millisecond6=0;
                        tensecond6=601;
                        ortak6=0;
                        count6=0;
                        label6.setText("0");
                        label6.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     6       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     6       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state6==true&&ortak6!=0){
                        try {
                            sleep(4);
                            if(millisecond6>1000){
                                millisecond6=0;
                                ortak6--;
                                label6.setText(""+ortak6);
                            }
                            allowPause6();
                            if(ortak6<=60&&ortak6>=30){
                                Color a=Color.RED;
                                label6.setBackground(a); 
                            }else if(ortak6<30&&ortak6>0){
                                if(ortak6%2==1){
                                    label6.setBackground(Color.YELLOW); 
                                }else{
                                    label6.setBackground(Color.RED);
                                }
                              
                            }if(ortak6==1&&sound6){
                                    sound();
                                    sound6=false;
                                }
                            
                            millisecond6+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond6=0;
                        total+=count6;
                        count6=0;
                        ortak6=0;
                        label6.setText("0");
                        label6.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     6       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     6       "+"                          1  ";
                        addElement();
                        count++;
                        sound6=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond6==301&&tensecond6==601&&!t6.isAlive()){
            money6.setText("ALINMADI");
            money6.setBackground(Color.RED);
            st6.setText("DIŞARDA");
            st6.setBackground(Color.RED);
            t6.start();
            
        } 
            }
    }//GEN-LAST:event_ten6ActionPerformed

    private void ten7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten7ActionPerformed
        // TODO add your handling code here:
          if(t7.isAlive()){
                ortak7+=600;
            st7.setText("DIŞARDA");
            st7.setBackground(Color.RED);
            count7+=2;
            
            }else{
               state7=true;
               resetb7=false;
               count7+=2;
                 t7=new Thread(){
            
            public void run(){
                ortak7+=tensecond7;
                for(;;){
                    if(resetb7){
                        millisecond7=0;
                        tensecond7=601;
                        count7=0;
                        ortak7=0;
                        label7.setText("0");
                        label7.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     7       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     7       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state7==true&&ortak7!=0){
                        try {
                            sleep(4);
                            if(millisecond7>1000){
                                millisecond7=0;
                                ortak7--;
                                label7.setText(""+ortak7);
                            }
                            allowPause7();
                            if(ortak7<=60&&ortak7>=30){
                                Color a=Color.RED;
                                label7.setBackground(a); 
                            }else if(ortak7<30&&ortak7>0){
                                if(ortak7%2==1){
                                    label7.setBackground(Color.YELLOW); 
                                }else{
                                    label7.setBackground(Color.RED);
                                }
                              
                            }if(ortak7==1&&sound7){
                                    sound();
                                    sound7=false;
                                }
                            
                            millisecond7+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond7=0;
                        total+=count7;
                        count7=0;
                        ortak7=0;
                        label7.setText("0");
                        label7.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     7       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     7       "+"                          1  ";
                        addElement();
                        count++;
                        sound7=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond7==301&&tensecond7==601&&!t7.isAlive()){
            money7.setText("ALINMADI");
            money7.setBackground(Color.RED);
            st7.setText("DIŞARDA");
            st7.setBackground(Color.RED);
            t7.start();
            
        } 
            }
    }//GEN-LAST:event_ten7ActionPerformed

    private void ten8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten8ActionPerformed
        // TODO add your handling code here:
          if(t8.isAlive()){
                ortak8+=600;
                count8+=2;
            st8.setText("DIŞARDA");
            st8.setBackground(Color.RED);
            
            }else{
               state8=true;
               resetb8=false;
               count8+=2;
                 t8=new Thread(){
            
            public void run(){
                ortak8+=tensecond8;
                for(;;){
                    if(resetb8){
                        millisecond8=0;
                        tensecond8=601;
                        count8=0;
                        ortak8=0;
                        label8.setText("0");
                        label8.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     8       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     8       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state8==true&&ortak8!=0){
                        try {
                            sleep(4);
                            if(millisecond8>1000){
                                millisecond8=0;
                                ortak8--;
                                label8.setText(""+ortak8);
                            }
                            allowPause8();
                            if(ortak8<=60&&ortak8>=30){
                                Color a=Color.RED;
                                label8.setBackground(a); 
                            }else if(ortak8<30&&ortak8>0){
                                if(ortak8%2==1){
                                    label8.setBackground(Color.YELLOW); 
                                }else{
                                    label8.setBackground(Color.RED);
                                }
                              
                            }if(ortak8==1&&sound8){
                                    sound();
                                    sound8=false;
                                }
                            
                            millisecond8+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond8=0;
                        total+=count8;
                        count8=0;
                        ortak8=0;
                        label8.setText("0");
                        label8.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     8       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     8       "+"                          1  ";
                        addElement();
                        count++;
                        sound8=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond8==301&&tensecond8==601&&!t8.isAlive()){
            money8.setText("ALINMADI");
            money8.setBackground(Color.RED);
            st8.setText("DIŞARDA");
            st8.setBackground(Color.RED);
            t8.start();
            
        } 
            }
    }//GEN-LAST:event_ten8ActionPerformed

    private void ten9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten9ActionPerformed
        // TODO add your handling code here:
          if(t9.isAlive()){
                ortak9+=600;
            st9.setText("DIŞARDA");
            st9.setBackground(Color.RED);
            count9+=2;
            }else{
               state9=true;
               resetb9=false;
               count9+=2;
                 t9=new Thread(){
            
            public void run(){
                ortak9+=tensecond9;
                for(;;){
                    if(resetb9){
                        millisecond9=0;
                        tensecond9=601;
                        count9=0;
                        ortak9=0;
                        label9.setText("0");
                        label9.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     9       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     9       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state9==true&&ortak9!=0){
                        try {
                            sleep(4);
                            if(millisecond9>1000){
                                millisecond9=0;
                                ortak9--;
                                label9.setText(""+ortak9);
                            }
                            allowPause9();
                            if(ortak9<=60&&ortak9>=30){
                                Color a=Color.RED;
                                label9.setBackground(a); 
                            }else if(ortak9<30&&ortak9>0){
                                if(ortak9%2==1){
                                    label9.setBackground(Color.YELLOW); 
                                }else{
                                    label9.setBackground(Color.RED);
                                }
                              
                            }if(ortak9==1&&sound9){
                                    sound();
                                    sound9=false;
                                }
                            
                            millisecond9+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond9=0;
                        total+=count9;
                        count9=0;
                        ortak9=0;
                        label9.setText("0");
                        label9.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     9       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     9       "+"                          1  ";
                        addElement();
                        count++;
                        sound9=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond9==301&&tensecond9==601&&!t9.isAlive()){
            money9.setText("ALINMADI");
            money9.setBackground(Color.RED);
            st9.setText("DIŞARDA");
            st9.setBackground(Color.RED);
            t9.start();
            
        } 
            }
    }//GEN-LAST:event_ten9ActionPerformed

    private void ten10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten10ActionPerformed
        // TODO add your handling code here:
          if(t10.isAlive()){
                ortak10+=600;
            st10.setText("DIŞARDA");
            st10.setBackground(Color.RED);
            count10+=2;
            
            }else{
               state10=true;
               resetb10=false;
               count10+=2;
                 t10=new Thread(){
            
            public void run(){
                ortak10+=tensecond10;
                for(;;){
                    if(resetb10){
                        millisecond10=0;
                        tensecond10=601;
                        count10=0;
                        ortak10=0;
                        label10.setText("0");
                        label10.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     10       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     10       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state10==true&&ortak10!=0){
                        try {
                            sleep(4);
                            if(millisecond10>1000){
                                millisecond10=0;
                                ortak10--;
                                label10.setText(""+ortak10);
                            }
                            allowPause10();
                            if(ortak10<=60&&ortak10>=30){
                                Color a=Color.RED;
                                label10.setBackground(a); 
                            }else if(ortak10<30&&ortak10>0){
                                if(ortak10%2==1){
                                    label10.setBackground(Color.YELLOW); 
                                }else{
                                    label10.setBackground(Color.RED);
                                }
                              
                            }if(ortak10==1&&sound10){
                                    sound();
                                    sound10=false;
                                }
                            
                            millisecond10+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond10=0;
                        total+=count10;
                        count10=0;
                        ortak10=0;
                        label10.setText("0");
                        label10.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     10       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     10       "+"                          1  ";
                        addElement();
                        count++;
                        sound10=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond10==301&&tensecond10==601&&!t10.isAlive()){
            money10.setText("ALINMADI");
            money10.setBackground(Color.RED);
            st10.setText("DIŞARDA");
            st10.setBackground(Color.RED);
            t10.start();
            
        } 
            }
    }//GEN-LAST:event_ten10ActionPerformed

    private void ten11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten11ActionPerformed
        // TODO add your handling code here:
          if(t11.isAlive()){
                ortak11+=600;
            st11.setText("DIŞARDA");
            st11.setBackground(Color.RED);
            count11+=2;
            
            }else{
               state11=true;
               resetb11=false;
               count11+=2;
                 t11=new Thread(){
            
            public void run(){
                ortak11+=tensecond11;
                for(;;){
                    if(resetb11){
                        millisecond11=0;
                        tensecond11=601;
                        count11=0;
                        ortak11=0;
                        label11.setText("0");
                        label11.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     11       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     11       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state11==true&&ortak11!=0){
                        try {
                            sleep(4);
                            if(millisecond11>1000){
                                millisecond11=0;
                                ortak11--;
                                label11.setText(""+ortak11);
                            }
                            allowPause11();
                            if(ortak11<=60&&ortak11>=30){
                                Color a=Color.RED;
                                label11.setBackground(a); 
                            }else if(ortak11<30&&ortak11>0){
                                if(ortak11%2==1){
                                    label11.setBackground(Color.YELLOW); 
                                }else{
                                    label11.setBackground(Color.RED);
                                }
                              
                            }if(ortak11==1&&sound11){
                                    sound();
                                    sound11=false;
                                }
                            
                            millisecond11+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond11=0;
                        total+=count11;
                        count11=0;
                        ortak11=0;
                        label11.setText("0");
                        label11.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     11       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     11       "+"                          1  ";
                        addElement();
                        count++;
                        sound11=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond11==301&&tensecond11==601&&!t11.isAlive()){
            money11.setText("ALINMADI");
            money11.setBackground(Color.RED);
            st11.setText("DIŞARDA");
            st11.setBackground(Color.RED);
            t11.start();
            
        } 
            }
    }//GEN-LAST:event_ten11ActionPerformed

    private void ten12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten12ActionPerformed
        // TODO add your handling code here:
          if(t12.isAlive()){
                ortak12+=600;
            st12.setText("DIŞARDA");
            st12.setBackground(Color.RED);
            count12+=2;
            
            }else{
               state12=true;
               resetb12=false;
               count12+=2;
                 t12=new Thread(){
            
            public void run(){
                ortak12+=tensecond12;
                for(;;){
                    if(resetb12){
                        millisecond12=0;
                        tensecond12=601;
                        count12=0;
                        ortak12=0;
                        label12.setText("0");
                        label12.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     12       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     12       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state12==true&&ortak12!=0){
                        try {
                            sleep(4);
                            if(millisecond12>1000){
                                millisecond12=0;
                                ortak12--;
                                label12.setText(""+ortak12);
                            }
                            allowPause12();
                            if(ortak12<=60&&ortak12>=30){
                                Color a=Color.RED;
                                label12.setBackground(a); 
                            }else if(ortak12<30&&ortak12>0){
                                if(ortak12%2==1){
                                    label12.setBackground(Color.YELLOW); 
                                }else{
                                    label12.setBackground(Color.RED);
                                }
                              
                            }if(ortak12==1&&sound12){
                                    sound();
                                    sound12=false;
                                }
                            
                            millisecond12+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond12=0;
                        total+=count12;
                        count12=0;
                        ortak12=0;
                        label12.setText("0");
                        label12.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     12       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     12       "+"                          1  ";
                        addElement();
                        count++;
                        sound12=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond12==301&&tensecond12==601&&!t12.isAlive()){
            money12.setText("ALINMADI");
            money12.setBackground(Color.RED);
            st12.setText("DIŞARDA");
            st12.setBackground(Color.RED);
            t12.start();
            
        } 
            }
    }//GEN-LAST:event_ten12ActionPerformed

    private void ten13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten13ActionPerformed
        // TODO add your handling code here:
          if(t13.isAlive()){
                ortak13+=600;
            st13.setText("DIŞARDA");
            st13.setBackground(Color.RED);
            count13+=2;
            
            }else{
               state13=true;
               resetb13=false;
               count13+=2;
                 t13=new Thread(){
            
            public void run(){
                ortak13+=tensecond13;
                for(;;){
                    if(resetb13){
                        millisecond13=0;
                        tensecond13=601;
                        count13=0;
                        ortak13=0;
                        label13.setText("0");
                        label13.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     13       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     13       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state13==true&&ortak13!=0){
                        try {
                            sleep(4);
                            if(millisecond13>1000){
                                millisecond13=0;
                                ortak13--;
                                label13.setText(""+ortak13);
                            }
                            allowPause13();
                            if(ortak13<=60&&ortak13>=30){
                                Color a=Color.RED;
                                label13.setBackground(a); 
                            }else if(ortak13<30&&ortak13>0){
                                if(ortak13%2==1){
                                    label13.setBackground(Color.YELLOW); 
                                }else{
                                    label13.setBackground(Color.RED);
                                }
                              
                            }if(ortak13==1&&sound13){
                                    sound();
                                    sound13=false;
                                }
                            
                            millisecond13+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond13=0;
                        total+=count13;
                        count13=0;
                        ortak13=0;
                        label13.setText("0");
                        label13.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     13       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     13       "+"                          1  ";
                        addElement();
                        count++;
                        sound13=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond13==301&&tensecond13==601&&!t13.isAlive()){
            money13.setText("ALINMADI");
            money13.setBackground(Color.RED);
            st13.setText("DIŞARDA");
            st13.setBackground(Color.RED);
            t13.start();
            
        } 
            }
    }//GEN-LAST:event_ten13ActionPerformed

    private void ten14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten14ActionPerformed
        // TODO add your handling code here:
          if(t14.isAlive()){
                ortak14+=600;
            st14.setText("DIŞARDA");
            st14.setBackground(Color.RED);
            count14+=2;
            
            }else{
               state14=true;
               resetb14=false;
               count14+=2;
                 t14=new Thread(){
            
            public void run(){
                ortak14+=tensecond14;
                for(;;){
                    if(resetb14){
                        millisecond14=0;
                        tensecond14=601;
                        count14=0;
                        ortak14=0;
                        label14.setText("0");
                        label14.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     14       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     14       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state14==true&&ortak14!=0){
                        try {
                            sleep(4);
                            if(millisecond14>1000){
                                millisecond14=0;
                                ortak14--;
                                label14.setText(""+ortak14);
                            }
                            allowPause14();
                            if(ortak14<=60&&ortak14>=30){
                                Color a=Color.RED;
                                label14.setBackground(a); 
                            }else if(ortak14<30&&ortak14>0){
                                if(ortak14%2==1){
                                    label14.setBackground(Color.YELLOW); 
                                }else{
                                    label14.setBackground(Color.RED);
                                }
                              
                            }if(ortak14==1&&sound14){
                                    sound();
                                    sound14=false;
                                }
                            
                            millisecond14+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond14=0;
                        total+=count14;
                        count14=0;
                        ortak14=0;
                        label14.setText("0");
                        label14.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     14       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     14       "+"                          1  ";
                        addElement();
                        count++;
                        sound14=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond14==301&&tensecond14==601&&!t14.isAlive()){
            money14.setText("ALINMADI");
            money14.setBackground(Color.RED);
            st14.setText("DIŞARDA");
            st14.setBackground(Color.RED);
            t14.start();
            
        } 
            }
    }//GEN-LAST:event_ten14ActionPerformed

    private void ten15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten15ActionPerformed
        // TODO add your handling code here:
          if(t15.isAlive()){
                ortak15+=600;
            st15.setText("DIŞARDA");
            st15.setBackground(Color.RED);
            count15+=2;
            
            }else{
               state15=true;
               resetb15=false;
               count15+=2;
                 t15=new Thread(){
            
            public void run(){
                ortak15+=tensecond15;
                for(;;){
                    if(resetb15){
                        millisecond15=0;
                        tensecond15=601;
                        count15=0;
                        ortak15=0;
                        label15.setText("0");
                        label15.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     15       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     15       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state15==true&&ortak15!=0){
                        try {
                            sleep(4);
                            if(millisecond15>1000){
                                millisecond15=0;
                                ortak15--;
                                label15.setText(""+ortak15);
                            }
                            allowPause15();
                            if(ortak15<=60&&ortak15>=30){
                                Color a=Color.RED;
                                label15.setBackground(a); 
                            }else if(ortak15<30&&ortak15>0){
                                if(ortak15%2==1){
                                    label15.setBackground(Color.YELLOW); 
                                }else{
                                    label15.setBackground(Color.RED);
                                }
                              
                            }if(ortak15==1&&sound15){
                                    sound();
                                    sound15=false;
                                }
                            
                            millisecond15+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond15=0;
                        total+=count15;
                        count15=0;
                        ortak15=0;
                        label15.setText("0");
                        label15.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     15       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     15       "+"                          1  ";
                        addElement();
                        count++;
                        sound15=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond15==301&&tensecond15==601&&!t15.isAlive()){
            money15.setText("ALINMADI");
            money15.setBackground(Color.RED);
            st15.setText("DIŞARDA");
            st15.setBackground(Color.RED);
            t15.start();
            
        } 
            }
    }//GEN-LAST:event_ten15ActionPerformed

    private void ten16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten16ActionPerformed
        // TODO add your handling code here:
          if(t16.isAlive()){
                ortak16+=600;
            st16.setText("DIŞARDA");
            st16.setBackground(Color.RED);
            count16+=2;
            
            }else{
               state16=true;
               resetb16=false;
               count16+=2;
                 t16=new Thread(){
            
            public void run(){
                ortak16+=tensecond16;
                for(;;){
                    if(resetb16){
                        millisecond16=0;
                        tensecond16=601;
                        count16=0;
                        ortak16=0;
                        label16.setText("0");
                        label16.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     16       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     16       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state16==true&&ortak16!=0){
                        try {
                            sleep(4);
                            if(millisecond16>1000){
                                millisecond16=0;
                                ortak16--;
                                label16.setText(""+ortak16);
                            }
                            allowPause16();
                            if(ortak16<=60&&ortak16>=30){
                                Color a=Color.RED;
                                label16.setBackground(a); 
                            }else if(ortak16<30&&ortak16>0){
                                if(ortak16%2==1){
                                    label16.setBackground(Color.YELLOW); 
                                }else{
                                    label16.setBackground(Color.RED);
                                }
                              
                            }if(ortak16==1&&sound16){
                                    sound();
                                    sound16=false;
                                }
                            
                            millisecond16+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond16=0;
                        total+=count16;
                        count16=0;
                        ortak16=0;
                        label16.setText("0");
                        label16.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     16       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     16       "+"                          1  ";
                        addElement();
                        count++;
                        sound16=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond16==301&&tensecond16==601&&!t16.isAlive()){
            money16.setText("ALINMADI");
            money16.setBackground(Color.RED);
            st16.setText("DIŞARDA");
            st16.setBackground(Color.RED);
            t16.start();
            
        } 
            }
    }//GEN-LAST:event_ten16ActionPerformed

    private void ten17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten17ActionPerformed
        // TODO add your handling code here:
          if(t17.isAlive()){
                ortak17+=600;
            st17.setText("DIŞARDA");
            st17.setBackground(Color.RED);
            count17+=2;
            
            }else{
               state17=true;
               resetb17=false;
               count17+=2;
                 t17=new Thread(){
            
            public void run(){
                ortak17+=tensecond17;
                for(;;){
                    if(resetb17){
                        millisecond17=0;
                        tensecond17=601;
                        count17=0;
                        ortak17=0;
                        label17.setText("0");
                        label17.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     17       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     17       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state17==true&&ortak17!=0){
                        try {
                            sleep(4);
                            if(millisecond17>1000){
                                millisecond17=0;
                                ortak17--;
                                label17.setText(""+ortak17);
                            }
                            allowPause17();
                            if(ortak17<=60&&ortak17>=30){
                                Color a=Color.RED;
                                label17.setBackground(a); 
                            }else if(ortak17<30&&ortak17>0){
                                if(ortak17%2==1){
                                    label17.setBackground(Color.YELLOW); 
                                }else{
                                    label17.setBackground(Color.RED);
                                }
                              
                            }if(ortak17==1&&sound17){
                                    sound();
                                    sound17=false;
                                }
                            
                            millisecond17+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond17=0;
                        total+=count17;
                        count17=0;
                        ortak17=0;
                        label17.setText("0");
                        label17.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     17       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     17       "+"                          1  ";
                        addElement();
                        count++;
                        sound17=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond17==301&&tensecond17==601&&!t17.isAlive()){
            money17.setText("ALINMADI");
            money17.setBackground(Color.RED);
            st17.setText("DIŞARDA");
            st17.setBackground(Color.RED);
            t17.start();
            
        } 
            }
    }//GEN-LAST:event_ten17ActionPerformed

    private void ten18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten18ActionPerformed
        // TODO add your handling code here:
          if(t18.isAlive()){
                ortak18+=600;
            st18.setText("DIŞARDA");
            st18.setBackground(Color.RED);
            count18+=2;
            
            }else{
               state18=true;
               resetb18=false;
               count18+=2;
                 t18=new Thread(){
            
            public void run(){
                ortak18+=tensecond18;
                for(;;){
                    if(resetb18){
                        millisecond18=0;
                        tensecond18=601;
                        count18=0;
                        ortak18=0;
                        label18.setText("0");
                        label18.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     18       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     18       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state18==true&&ortak18!=0){
                        try {
                            sleep(4);
                            if(millisecond18>1000){
                                millisecond18=0;
                                ortak18--;
                                label18.setText(""+ortak18);
                            }
                            allowPause18();
                            if(ortak18<=60&&ortak18>=30){
                                Color a=Color.RED;
                                label18.setBackground(a); 
                            }else if(ortak18<30&&ortak18>0){
                                if(ortak18%2==1){
                                    label18.setBackground(Color.YELLOW); 
                                }else{
                                    label18.setBackground(Color.RED);
                                }
                              
                            }if(ortak18==1&&sound18){
                                    sound();
                                    sound18=false;
                                }
                            
                            millisecond18+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond18=0;
                        total+=count18;
                        count18=0;
                        ortak18=0;
                        label18.setText("0");
                        label18.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     18       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     18       "+"                          1  ";
                        addElement();
                        count++;
                        sound18=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond18==301&&tensecond18==601&&!t18.isAlive()){
            money18.setText("ALINMADI");
            money18.setBackground(Color.RED);
            st18.setText("DIŞARDA");
            st18.setBackground(Color.RED);
            t18.start();
            
        } 
            }
    }//GEN-LAST:event_ten18ActionPerformed

    private void ten19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten19ActionPerformed
        // TODO add your handling code here:
          if(t19.isAlive()){
                ortak19+=600;
            st19.setText("DIŞARDA");
            st19.setBackground(Color.RED);
            count19+=2;
            
            }else{
               state19=true;
               resetb19=false;
               count19+=2;
                 t19=new Thread(){
            
            public void run(){
                ortak19+=tensecond19;
                for(;;){
                    if(resetb19){
                        millisecond19=0;
                        tensecond19=601;
                        count19=0;
                        ortak19=0;
                        label19.setText("0");
                        label19.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     19       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     19       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state19==true&&ortak19!=0){
                        try {
                            sleep(4);
                            if(millisecond19>1000){
                                millisecond19=0;
                                ortak19--;
                                label19.setText(""+ortak19);
                            }
                            allowPause19();
                            if(ortak19<=60&&ortak19>=30){
                                Color a=Color.RED;
                                label19.setBackground(a); 
                            }else if(ortak19<30&&ortak19>0){
                                if(ortak19%2==1){
                                    label19.setBackground(Color.YELLOW); 
                                }else{
                                    label19.setBackground(Color.RED);
                                }
                              
                            }if(ortak19==1&&sound19){
                                    sound();
                                    sound19=false;
                                }
                            
                            millisecond19+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond19=0;
                        total+=count19;
                        count19=0;
                        ortak19=0;
                        label19.setText("0");
                        label19.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     19       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     19       "+"                          1  ";
                        addElement();
                        count++;
                        sound19=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond19==301&&tensecond19==601&&!t19.isAlive()){
            money19.setText("ALINMADI");
            money19.setBackground(Color.RED);
            st19.setText("DIŞARDA");
            st19.setBackground(Color.RED);
            t19.start();
            
        } 
            }
    }//GEN-LAST:event_ten19ActionPerformed

    private void ten20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten20ActionPerformed
        // TODO add your handling code here:
          if(t20.isAlive()){
                ortak20+=600;
                st20.setText("DIŞARDA");
                st20.setBackground(Color.RED);
                count20+=2;
            
            }else{
               state20=true;
               resetb20=false;
               count20+=2;
                 t20=new Thread(){
            
            public void run(){
                ortak20+=tensecond20;
                for(;;){
                    if(resetb20){
                        millisecond20=0;
                        tensecond20=601;
                        count20=0;
                        ortak20=0;
                        label20.setText("0");
                        label20.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     20       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     20       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state20==true&&ortak20!=0){
                        try {
                            sleep(4);
                            if(millisecond20>1000){
                                millisecond20=0;
                                ortak20--;
                                label20.setText(""+ortak20);
                            }
                            allowPause20();
                            if(ortak20<=60&&ortak20>=30){
                                Color a=Color.RED;
                                label20.setBackground(a); 
                            }else if(ortak20<30&&ortak20>0){
                                if(ortak20%2==1){
                                    label20.setBackground(Color.YELLOW); 
                                }else{
                                    label20.setBackground(Color.RED);
                                }
                              
                            }if(ortak20==1&&sound20){
                                    sound();
                                    sound20=false;
                                }
                            
                            millisecond20+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond20=0;
                        total+=count20;
                        count20=0;
                        ortak20=0;
                        label20.setText("0");
                        label20.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     20       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     20       "+"                          1  ";
                        addElement();
                        count++;
                        sound20=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond20==301&&tensecond20==601&&!t20.isAlive()){
            money20.setText("ALINMADI");
            money20.setBackground(Color.RED);
            st20.setText("DIŞARDA");
            st20.setBackground(Color.RED);
            t20.start();
            
        } 
            }
    }//GEN-LAST:event_ten20ActionPerformed

    private void ten21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten21ActionPerformed
        // TODO add your handling code here:
          if(t21.isAlive()){
                ortak21+=600;
            st21.setText("DIŞARDA");
            st21.setBackground(Color.RED);
            count21+=2;
            }else{
               state21=true;
               resetb21=false;
               count21+=2;
                 t21=new Thread(){
            
            public void run(){
                ortak21+=tensecond21;
                for(;;){
                    if(resetb21){
                        millisecond21=0;
                        tensecond21=601;
                        count21=0;
                        ortak21=0;
                        label21.setText("0");
                        label21.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     21       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     21       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state21==true&&ortak21!=0){
                        try {
                            sleep(4);
                            if(millisecond21>1000){
                                millisecond21=0;
                                ortak21--;
                                label21.setText(""+ortak21);
                            }
                            allowPause21();
                            if(ortak21<=60&&ortak21>=30){
                                Color a=Color.RED;
                                label21.setBackground(a); 
                            }else if(ortak21<30&&ortak21>0){
                                if(ortak21%2==1){
                                    label21.setBackground(Color.YELLOW); 
                                }else{
                                    label21.setBackground(Color.RED);
                                }
                              
                            }if(ortak21==1&&sound21){
                                    sound();
                                    sound21=false;
                                }
                            
                            millisecond21+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond21=0;
                        total+=count21;
                        count21=0;
                        ortak21=0;
                        label21.setText("0");
                        label21.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     21       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     21       "+"                          1  ";
                        addElement();
                        count++;
                        sound21=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond21==301&&tensecond21==601&&!t21.isAlive()){
            money21.setText("ALINMADI");
            money21.setBackground(Color.RED);
            st21.setText("DIŞARDA");
            st21.setBackground(Color.RED);
            t21.start();
            
        } 
            }
    }//GEN-LAST:event_ten21ActionPerformed

    private void ten22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten22ActionPerformed
        // TODO add your handling code here:
          if(t22.isAlive()){
                ortak22+=600;
            st22.setText("DIŞARDA");
            st22.setBackground(Color.RED);
            count22+=2;
            }else{
               state22=true;
               resetb22=false;
               count22+=2;
                 t22=new Thread(){
            
            public void run(){
                ortak22+=tensecond22;
                for(;;){
                    if(resetb22){
                        millisecond22=0;
                        tensecond22=601;
                        count22=0;
                        ortak22=0;
                        label22.setText("0");
                        label22.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     22       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     22       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state22==true&&ortak22!=0){
                        try {
                            sleep(4);
                            if(millisecond22>1000){
                                millisecond22=0;
                                ortak22--;
                                label22.setText(""+ortak22);
                            }
                            allowPause22();
                            if(ortak22<=60&&ortak22>=30){
                                Color a=Color.RED;
                                label3.setBackground(a); 
                            }else if(ortak22<30&&ortak22>0){
                                if(ortak22%2==1){
                                    label22.setBackground(Color.YELLOW); 
                                }else{
                                    label22.setBackground(Color.RED);
                                }
                              
                            }if(ortak22==1&&sound22){
                                    sound();
                                    sound22=false;
                                }
                            
                            millisecond22+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond22=0;
                        total+=count22;
                        count22=0;
                        ortak22=0;
                        label22.setText("0");
                        label22.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     22       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     22       "+"                          1  ";
                        addElement();
                        count++;
                        sound22=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond22==301&&tensecond22==601&&!t22.isAlive()){
            money22.setText("ALINMADI");
            money22.setBackground(Color.RED);
            st22.setText("DIŞARDA");
            st22.setBackground(Color.RED);
            t22.start();
            
        } 
            }
    }//GEN-LAST:event_ten22ActionPerformed

    private void ten23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten23ActionPerformed
        // TODO add your handling code here:
          if(t23.isAlive()){
                ortak23+=600;
            st23.setText("DIŞARDA");
            st23.setBackground(Color.RED);
            count23+=2;
            }else{
               state23=true;
               resetb23=false;
               count23+=2;
                 t23=new Thread(){
            
            public void run(){
                ortak23+=tensecond23;
                for(;;){
                    if(resetb23){
                        millisecond23=0;
                        tensecond23=601;
                        count23=0;
                        ortak23=0;
                        label23.setText("0");
                        label23.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     23       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     23       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state23==true&&ortak23!=0){
                        try {
                            sleep(4);
                            if(millisecond23>1000){
                                millisecond23=0;
                                ortak23--;
                                label23.setText(""+ortak23);
                            }
                            allowPause23();
                            if(ortak23<=60&&ortak23>=30){
                                Color a=Color.RED;
                                label23.setBackground(a); 
                            }else if(ortak23<30&&ortak23>0){
                                if(ortak23%2==1){
                                    label23.setBackground(Color.YELLOW); 
                                }else{
                                    label23.setBackground(Color.RED);
                                }
                              
                            }if(ortak23==1&&sound23){
                                    sound();
                                    sound23=false;
                                }
                            
                            millisecond23+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond23=0;
                        total+=count23;
                        count23=0;
                        ortak23=0;
                        label23.setText("0");
                        label23.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     23       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     23       "+"                          1  ";
                        addElement();
                        count++;
                        sound23=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond23==301&&tensecond23==601&&!t23.isAlive()){
            money23.setText("ALINMADI");
            money23.setBackground(Color.RED);
            st23.setText("DIŞARDA");
            st23.setBackground(Color.RED);
            t23.start();
            
        } 
            }
    }//GEN-LAST:event_ten23ActionPerformed

    private void ten24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten24ActionPerformed
        // TODO add your handling code here:
          if(t24.isAlive()){
                ortak24+=600;
            st24.setText("DIŞARDA");
            st24.setBackground(Color.RED);
            count24+=2;
            }else{
               state24=true;
               resetb24=false;
               count24+=2;
                 t24=new Thread(){
            
            public void run(){
                ortak24+=tensecond24;
                for(;;){
                    if(resetb24){
                        millisecond24=0;
                        tensecond24=601;
                        count24=0;
                        ortak24=0;
                        label24.setText("0");
                        label24.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     24       "+"                            0  "+"\r\n";
                        text1=dtf.format(now)+"     24       "+"                            0  ";
                        addElement();
                        break;
                    }
                    if(state24==true&&ortak24!=0){
                        try {
                            sleep(4);
                            if(millisecond24>1000){
                                millisecond24=0;
                                ortak24--;
                                label24.setText(""+ortak24);
                            }
                            allowPause24();
                            if(ortak24<=60&&ortak24>=30){
                                Color a=Color.RED;
                                label24.setBackground(a); 
                            }else if(ortak24<30&&ortak24>0){
                                if(ortak24%2==1){
                                    label24.setBackground(Color.YELLOW); 
                                }else{
                                    label24.setBackground(Color.RED);
                                }
                              
                            }if(ortak24==1&&sound24){
                                    sound();
                                    sound24=false;
                                }
                            
                            millisecond24+=4;
                        } catch (Exception e) {
                        }
                    }else{
                        millisecond24=0;
                        total+=count24;
                        count24=0;
                        ortak24=0;
                        label24.setText("0");
                        label24.setBackground(Color.RED);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        text+=dtf.format(now)+"     24       "+"                          1  "+"\r\n";
                        text1=dtf.format(now)+"     24       "+"                          1  ";
                        addElement();
                        count++;
                        sound24=true;
                        break;
                    }
                }

            }
        };
            
             
        if(fivesecond24==301&&tensecond24==601&&!t24.isAlive()){
            money24.setText("ALINMADI");
            money24.setBackground(Color.RED);
            st24.setText("DIŞARDA");
            st24.setBackground(Color.RED);
            t24.start();
            
        } 
            }
    }//GEN-LAST:event_ten24ActionPerformed

    private void gift1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gift1ActionPerformed
        // TODO add your handling code here:
        if(!giftb1){
                Image playIcon=null;
                playIcon=new ImageIcon(this.getClass().getResource("/image/play1.png")).getImage();
                gift1.setIcon(new ImageIcon(playIcon.getScaledInstance(25, 25, 25)));
                giftb1=true;
        
                
                
        }else{
                Image pauseIcon=null;
                pauseIcon=new ImageIcon(this.getClass().getResource("/image/pause_icon.png")).getImage();
                gift1.setIcon(new ImageIcon(pauseIcon.getScaledInstance(25, 25, 25)));
                giftb1=false;
        }
        
        
             
    }//GEN-LAST:event_gift1ActionPerformed

    private void ekranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ekranActionPerformed

    /**
     * @param args the command line arguments
     */
    public void time(){
        Thread a=new Thread(){
            
        public void run(){
         for (;;) {
             try {
                 sleep(500);
            if(true){
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
                 DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");  
       LocalDateTime now = LocalDateTime.now();  
       time1.setText(dtf.format(now)); 
       time.setText(dtf1.format(now)); 
       
            }else{
                break;
            }
             } catch (Exception e) {
             }
             
        }  
        }
        
        };
        a.start();
       Image image=null;
        image=new ImageIcon(this.getClass().getResource("/image/daco1.jpg")).getImage();
        
        img.setIcon(new ImageIcon(image.getScaledInstance(150, 100, 250)));
        
        
    }
    
    public void addElement() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
              LocalDateTime now = LocalDateTime.now();
              String userHomeFolder = System.getProperty("user.home");
              String s=dtf.format(now)+".txt";
              File file=new File(userHomeFolder,s);
              FileWriter writer=null;
          try {
             writer=new FileWriter(file);
              writer.write(text);
              ekran.add("\r\n"+text1);
              addTotal();
          } catch (IOException ex) {
              System.out.println("IO Exception -- add element()");
          }finally{
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    
                }
       }
       
            }
       
    }
    public void addTotal(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
              LocalDateTime now = LocalDateTime.now();
              String userHomeFolder = System.getProperty("user.home");
              String s="total"+dtf.format(now)+".txt";
              File file=new File(userHomeFolder,s);
              FileWriter writer=null;
           try {
               writer=new FileWriter(file);
               writer.write(""+total);
           } catch (IOException ex) {
               Logger.getLogger(timer3.class.getName()).log(Level.SEVERE, null, ex);
           }finally{
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    
                }
       }
       
            }
    }
    public void existFile(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
       LocalDateTime now = LocalDateTime.now();  
       String userHomeFolder = System.getProperty("user.home");
       String s=dtf.format(now)+".txt"; 
       File file=new File(userHomeFolder,s);
       DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy.MM.dd"); 
        String s1="total"+dtf1.format(now)+".txt";
       File totalfile=new File(userHomeFolder,s1);
        if(file.exists()){
            try {
                Scanner input=new Scanner(new FileReader(file));
                Scanner input1=new Scanner(new FileReader(totalfile));
                
                for (;;) {
                    if(input.hasNextLine()){
                        String a=input.nextLine();
                        if(a.endsWith("0  ")){
                            reset++;
                        }else if(a.endsWith("1  ")){
                            
                        }else{
                            giftcount++;
                        }
                        text+=a+"\r\n";
                         ekran.add(a+"\r\n");
                         
                    }else{
                        if(totalfile.exists()){
                            if (input1.hasNext()) {
                              String b=input1.nextLine();
                            total=Integer.parseInt(b);  
                            }
                            
                        }
                        break;
                    }
                }   } catch (FileNotFoundException ex) {
                System.out.println("File Not exception--existfile()");
            }
    }
    }
    public void sound(){
            InputStream in = null;
            String userHomeFolder = System.getProperty("user.home");
            File file=new File(userHomeFolder,"umut.wav");
        try {
            in = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(timer3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        AudioStream as = null;         
        try {
            as = new AudioStream(in);
        } catch (IOException ex) {
            Logger.getLogger(timer3.class.getName()).log(Level.SEVERE, null, ex);
        }

AudioPlayer.player.start(as);            


    }
    public static boolean password(){
        String userHomeFolder = System.getProperty("user.home");
        File file =new File(userHomeFolder,"run.txt");
        
        if(file.exists()){
            try {
                Scanner input=new Scanner(new FileReader(file));
                if(input.hasNext()){
                    if(input.next().equals("umut")){
                        return true;
                    }
                }
                
                   } catch (FileNotFoundException ex) {
                System.out.println("File Not exception--existfile()");
            }
    }
        return false;
    }
    private void allowPause1() {
        synchronized(lock1){
            while(paused1) {
                try {
                    lock1.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
            
        
    }
    private void allowPause2() {
        synchronized(lock2){
            while(paused2) {
                try {
                    lock2.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause3() {
        synchronized(lock3){
            while(paused3) {
                try {
                    lock3.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause4() {
        synchronized(lock4){
            while(paused4) {
                try {
                    lock4.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause5() {
        synchronized(lock5){
            while(paused5) {
                try {
                    lock5.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause6() {
        synchronized(lock6){
            while(paused6) {
                try {
                    lock6.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause7() {
        synchronized(lock7){
            while(paused7) {
                try {
                    lock7.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause8() {
        synchronized(lock8){
            while(paused8) {
                try {
                    lock8.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause9() {
        synchronized(lock9){
            while(paused9) {
                try {
                    lock9.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause10() {
        synchronized(lock10){
            while(paused10) {
                try {
                    lock10.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause11() {
        synchronized(lock11){
            while(paused11) {
                try {
                    lock11.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause12() {
        synchronized(lock12){
            while(paused12) {
                try {
                    lock12.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause13() {
        synchronized(lock13){
            while(paused13) {
                try {
                    lock13.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause14() {
        synchronized(lock14){
            while(paused14) {
                try {
                    lock14.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause15() {
        synchronized(lock15){
            while(paused15) {
                try {
                    lock15.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause16() {
        synchronized(lock16){
            while(paused16) {
                try {
                    lock16.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause17() {
        synchronized(lock17){
            while(paused17) {
                try {
                    lock17.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause18() {
        synchronized(lock18){
            while(paused18) {
                try {
                    lock18.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause19() {
        synchronized(lock19){
            while(paused19) {
                try {
                    lock19.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause20() {
        synchronized(lock20){
            while(paused20) {
                try {
                    lock20.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause21() {
        synchronized(lock21){
            while(paused21) {
                try {
                    lock21.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause22() {
        synchronized(lock22){
            while(paused22) {
                try {
                    lock22.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause23() {
        synchronized(lock23){
            while(paused23) {
                try {
                    lock23.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
    private void allowPause24() {
        synchronized(lock24){
            while(paused24) {
                try {
                    lock24.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        }
    }
     private java.awt.event.ActionListener pauseResume1 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused1 = !paused1;
                    
                synchronized(lock1) {
                    lock1.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume2 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused2 = !paused2;
                    
                synchronized(lock2) {
                    lock2.notify();
                }
            }
        };   
     private java.awt.event.ActionListener pauseResume3 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused3 = !paused3;
                    
                synchronized(lock3) {
                    lock3.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume4 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused4 = !paused4;
                    
                synchronized(lock4) {
                    lock4.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume5 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused5 = !paused5;
                    
                synchronized(lock5) {
                    lock5.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume6 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused6 = !paused6;
                    
                synchronized(lock6) {
                    lock6.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume7 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused7 = !paused7;
                    
                synchronized(lock7) {
                    lock7.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume8 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused8 = !paused8;
                    
                synchronized(lock8) {
                    lock8.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume9 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused9 = !paused9;
                    
                synchronized(lock9) {
                    lock9.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume10 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused10 = !paused10;
                    
                synchronized(lock10) {
                    lock10.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume11 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused11 = !paused11;
                    
                synchronized(lock11) {
                    lock11.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume12 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused12 = !paused12;
                    
                synchronized(lock12) {
                    lock12.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume13 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused13 = !paused13;
                    
                synchronized(lock13) {
                    lock13.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume14 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused14 = !paused14;
                    
                synchronized(lock14) {
                    lock14.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume15 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused15 = !paused15;
                    
                synchronized(lock15) {
                    lock15.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume16 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused16 = !paused16;
                    
                synchronized(lock16) {
                    lock16.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume17 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused17 = !paused17;
                    
                synchronized(lock17) {
                    lock17.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume18 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused18 = !paused18;
                    
                synchronized(lock18) {
                    lock18.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume19 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused19 = !paused19;
                    
                synchronized(lock19) {
                    lock19.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume20 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused20 = !paused20;
                    
                synchronized(lock20) {
                    lock20.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume21 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused21 = !paused21;
                    
                synchronized(lock21) {
                    lock21.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume22 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused22 = !paused22;
                    
                synchronized(lock22) {
                    lock22.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume23 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused23 = !paused23;
                    
                synchronized(lock23) {
                    lock23.notify();
                }
            }
        };
     private java.awt.event.ActionListener pauseResume24 =
        new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                    paused24 = !paused24;
                    
                synchronized(lock24) {
                    lock24.notify();
                }
            }
        };
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(timer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(password()){
                    timer3 timer3;
                    try {
                        timer3 = new timer3();
                        timer3.setVisible(true);
                        timer3.setResizable(false);
                        timer3.setTitle("DAÇO ÇOCUK");
                
                    } catch (IOException ex) {
                        Logger.getLogger(timer3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                
                
                }
                
                    
               
                
            }
            
        });
         
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List ekran;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton five1;
    private javax.swing.JButton five10;
    private javax.swing.JButton five11;
    private javax.swing.JButton five12;
    private javax.swing.JButton five13;
    private javax.swing.JButton five14;
    private javax.swing.JButton five15;
    private javax.swing.JButton five16;
    private javax.swing.JButton five17;
    private javax.swing.JButton five18;
    private javax.swing.JButton five19;
    private javax.swing.JButton five2;
    private javax.swing.JButton five20;
    private javax.swing.JButton five21;
    private javax.swing.JButton five22;
    private javax.swing.JButton five23;
    private javax.swing.JButton five24;
    private javax.swing.JButton five3;
    private javax.swing.JButton five4;
    private javax.swing.JButton five5;
    private javax.swing.JButton five6;
    private javax.swing.JButton five7;
    private javax.swing.JButton five8;
    private javax.swing.JButton five9;
    private javax.swing.JButton gift1;
    private javax.swing.JButton gift10;
    private javax.swing.JButton gift11;
    private javax.swing.JButton gift12;
    private javax.swing.JButton gift13;
    private javax.swing.JButton gift14;
    private javax.swing.JButton gift15;
    private javax.swing.JButton gift16;
    private javax.swing.JButton gift17;
    private javax.swing.JButton gift18;
    private javax.swing.JButton gift19;
    private javax.swing.JButton gift2;
    private javax.swing.JButton gift20;
    private javax.swing.JButton gift21;
    private javax.swing.JButton gift22;
    private javax.swing.JButton gift23;
    private javax.swing.JButton gift24;
    private javax.swing.JButton gift3;
    private javax.swing.JButton gift4;
    private javax.swing.JButton gift5;
    private javax.swing.JButton gift6;
    private javax.swing.JButton gift7;
    private javax.swing.JButton gift8;
    private javax.swing.JButton gift9;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton97;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label18;
    private javax.swing.JLabel label19;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label20;
    private javax.swing.JLabel label21;
    private javax.swing.JLabel label22;
    private javax.swing.JLabel label23;
    private javax.swing.JLabel label24;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JTextField money1;
    private javax.swing.JTextField money10;
    private javax.swing.JTextField money11;
    private javax.swing.JTextField money12;
    private javax.swing.JTextField money13;
    private javax.swing.JTextField money14;
    private javax.swing.JTextField money15;
    private javax.swing.JTextField money16;
    private javax.swing.JTextField money17;
    private javax.swing.JTextField money18;
    private javax.swing.JTextField money19;
    private javax.swing.JTextField money2;
    private javax.swing.JTextField money20;
    private javax.swing.JTextField money21;
    private javax.swing.JTextField money22;
    private javax.swing.JTextField money23;
    private javax.swing.JTextField money24;
    private javax.swing.JTextField money3;
    private javax.swing.JTextField money4;
    private javax.swing.JTextField money5;
    private javax.swing.JTextField money6;
    private javax.swing.JTextField money7;
    private javax.swing.JTextField money8;
    private javax.swing.JTextField money9;
    private javax.swing.JButton reset1;
    private javax.swing.JButton reset10;
    private javax.swing.JButton reset11;
    private javax.swing.JButton reset12;
    private javax.swing.JButton reset13;
    private javax.swing.JButton reset14;
    private javax.swing.JButton reset15;
    private javax.swing.JButton reset16;
    private javax.swing.JButton reset17;
    private javax.swing.JButton reset18;
    private javax.swing.JButton reset19;
    private javax.swing.JButton reset2;
    private javax.swing.JButton reset20;
    private javax.swing.JButton reset21;
    private javax.swing.JButton reset22;
    private javax.swing.JButton reset23;
    private javax.swing.JButton reset24;
    private javax.swing.JButton reset3;
    private javax.swing.JButton reset4;
    private javax.swing.JButton reset5;
    private javax.swing.JButton reset6;
    private javax.swing.JButton reset7;
    private javax.swing.JButton reset8;
    private javax.swing.JButton reset9;
    private javax.swing.JTextField st1;
    private javax.swing.JTextField st10;
    private javax.swing.JTextField st11;
    private javax.swing.JTextField st12;
    private javax.swing.JTextField st13;
    private javax.swing.JTextField st14;
    private javax.swing.JTextField st15;
    private javax.swing.JTextField st16;
    private javax.swing.JTextField st17;
    private javax.swing.JTextField st18;
    private javax.swing.JTextField st19;
    private javax.swing.JTextField st2;
    private javax.swing.JTextField st20;
    private javax.swing.JTextField st21;
    private javax.swing.JTextField st22;
    private javax.swing.JTextField st23;
    private javax.swing.JTextField st24;
    private javax.swing.JTextField st3;
    private javax.swing.JTextField st4;
    private javax.swing.JTextField st5;
    private javax.swing.JTextField st6;
    private javax.swing.JTextField st7;
    private javax.swing.JTextField st8;
    private javax.swing.JTextField st9;
    private javax.swing.JButton stop1;
    private javax.swing.JButton stop10;
    private javax.swing.JButton stop11;
    private javax.swing.JButton stop12;
    private javax.swing.JButton stop13;
    private javax.swing.JButton stop14;
    private javax.swing.JButton stop15;
    private javax.swing.JButton stop16;
    private javax.swing.JButton stop17;
    private javax.swing.JButton stop18;
    private javax.swing.JButton stop19;
    private javax.swing.JButton stop2;
    private javax.swing.JButton stop20;
    private javax.swing.JButton stop21;
    private javax.swing.JButton stop22;
    private javax.swing.JButton stop23;
    private javax.swing.JButton stop24;
    private javax.swing.JButton stop3;
    private javax.swing.JButton stop4;
    private javax.swing.JButton stop5;
    private javax.swing.JButton stop6;
    private javax.swing.JButton stop7;
    private javax.swing.JButton stop8;
    private javax.swing.JButton stop9;
    private javax.swing.JButton ten1;
    private javax.swing.JButton ten10;
    private javax.swing.JButton ten11;
    private javax.swing.JButton ten12;
    private javax.swing.JButton ten13;
    private javax.swing.JButton ten14;
    private javax.swing.JButton ten15;
    private javax.swing.JButton ten16;
    private javax.swing.JButton ten17;
    private javax.swing.JButton ten18;
    private javax.swing.JButton ten19;
    private javax.swing.JButton ten2;
    private javax.swing.JButton ten20;
    private javax.swing.JButton ten21;
    private javax.swing.JButton ten22;
    private javax.swing.JButton ten23;
    private javax.swing.JButton ten24;
    private javax.swing.JButton ten3;
    private javax.swing.JButton ten4;
    private javax.swing.JButton ten5;
    private javax.swing.JButton ten6;
    private javax.swing.JButton ten7;
    private javax.swing.JButton ten8;
    private javax.swing.JButton ten9;
    private static javax.swing.JLabel time;
    private static javax.swing.JLabel time1;
    // End of variables declaration//GEN-END:variables
}
