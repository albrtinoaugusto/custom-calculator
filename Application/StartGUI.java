
package Application;

import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;

/**
 *
 * @author Albertino Augusto */

public class StartGUI extends javax.swing.JFrame 
{
    int xMouse;
    int yMouse;
    
    KeyEvent key;
    
    public StartGUI() 
    {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/icon.png")).getImage());
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 11, 11));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        frameDragg = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        CA = new javax.swing.JLabel();
        divide = new javax.swing.JLabel();
        times = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        num0 = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        num3 = new javax.swing.JLabel();
        num4 = new javax.swing.JLabel();
        num5 = new javax.swing.JLabel();
        num6 = new javax.swing.JLabel();
        num7 = new javax.swing.JLabel();
        num8 = new javax.swing.JLabel();
        num9 = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        num10 = new javax.swing.JLabel();
        dotButton = new javax.swing.JLabel();
        equals = new javax.swing.JLabel();
        caButton = new javax.swing.JLabel();
        divideButton = new javax.swing.JLabel();
        timesButton = new javax.swing.JLabel();
        minusButton = new javax.swing.JLabel();
        button1 = new javax.swing.JLabel();
        button2 = new javax.swing.JLabel();
        button3 = new javax.swing.JLabel();
        button4 = new javax.swing.JLabel();
        button5 = new javax.swing.JLabel();
        button6 = new javax.swing.JLabel();
        button7 = new javax.swing.JLabel();
        button8 = new javax.swing.JLabel();
        button9 = new javax.swing.JLabel();
        button0 = new javax.swing.JLabel();
        plusButton = new javax.swing.JLabel();
        qualsButton = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");
        setMaximumSize(new java.awt.Dimension(240, 280));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        about.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        about.setForeground(new java.awt.Color(247, 247, 247));
        about.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutMouseExited(evt);
            }
        });
        getContentPane().add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 32, 10));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1, 18, 18));

        frameDragg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameDraggMouseDragged(evt);
            }
        });
        frameDragg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameDraggMousePressed(evt);
            }
        });
        getContentPane().add(frameDragg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 20));

        display.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        display.setForeground(new java.awt.Color(247, 240, 236));
        display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 40, 214, 34));

        CA.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        CA.setForeground(new java.awt.Color(247, 247, 247));
        CA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CA.setText("CA");
        getContentPane().add(CA, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 96, 14, 12));

        divide.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        divide.setForeground(new java.awt.Color(247, 247, 247));
        divide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        divide.setText("/");
        getContentPane().add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 96, 14, 12));

        times.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        times.setForeground(new java.awt.Color(247, 247, 247));
        times.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        times.setText("*");
        times.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        times.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(times, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 96, 14, 16));

        minus.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        minus.setForeground(new java.awt.Color(247, 247, 247));
        minus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus.setText("-");
        getContentPane().add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 96, 14, 8));

        num0.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        num0.setForeground(new java.awt.Color(247, 247, 247));
        num0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num0.setText("0");
        getContentPane().add(num0, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 244, 14, 12));

        num1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        num1.setForeground(new java.awt.Color(247, 247, 247));
        num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num1.setText("1");
        getContentPane().add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 207, 14, 12));

        num2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        num2.setForeground(new java.awt.Color(247, 247, 247));
        num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num2.setText("2");
        getContentPane().add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 207, 14, 12));

        num3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        num3.setForeground(new java.awt.Color(247, 247, 247));
        num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num3.setText("3");
        num3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 207, 14, 12));

        num4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        num4.setForeground(new java.awt.Color(247, 247, 247));
        num4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num4.setText("4");
        getContentPane().add(num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 169, 14, 12));

        num5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        num5.setForeground(new java.awt.Color(247, 247, 247));
        num5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num5.setText("5");
        getContentPane().add(num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 169, 14, 12));

        num6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        num6.setForeground(new java.awt.Color(247, 247, 247));
        num6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num6.setText("6");
        num6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 169, 14, 12));

        num7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        num7.setForeground(new java.awt.Color(247, 247, 247));
        num7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num7.setText("7");
        getContentPane().add(num7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 132, 14, 12));

        num8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        num8.setForeground(new java.awt.Color(247, 247, 247));
        num8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num8.setText("8");
        getContentPane().add(num8, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 132, 14, 12));

        num9.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        num9.setForeground(new java.awt.Color(247, 247, 247));
        num9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num9.setText("9");
        num9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(num9, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 132, 14, 12));

        plus.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        plus.setForeground(new java.awt.Color(247, 247, 247));
        plus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus.setText("+");
        getContentPane().add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 150, 14, 12));

        num10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        num10.setForeground(new java.awt.Color(247, 247, 247));
        num10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num10.setText(".");
        getContentPane().add(num10, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 244, 14, 12));

        dotButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dotButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dotButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dotButtonMouseExited(evt);
            }
        });
        getContentPane().add(dotButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 232, 49, 36));

        equals.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        equals.setForeground(new java.awt.Color(247, 247, 247));
        equals.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equals.setText("=");
        getContentPane().add(equals, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 226, 14, 12));

        caButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caButtonMouseExited(evt);
            }
        });
        getContentPane().add(caButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 84, 49, 36));

        divideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divideButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                divideButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                divideButtonMouseExited(evt);
            }
        });
        getContentPane().add(divideButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 84, 49, 36));

        timesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timesButtonMouseExited(evt);
            }
        });
        getContentPane().add(timesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 84, 49, 36));

        minusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusButtonMouseExited(evt);
            }
        });
        getContentPane().add(minusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 84, 49, 36));

        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 195, 49, 36));

        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2MouseExited(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 195, 49, 36));

        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button3MouseExited(evt);
            }
        });
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 195, 49, 36));

        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button4MouseExited(evt);
            }
        });
        getContentPane().add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 158, 49, 36));

        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button5MouseExited(evt);
            }
        });
        getContentPane().add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 158, 49, 36));

        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button6MouseExited(evt);
            }
        });
        getContentPane().add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 158, 49, 36));

        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button7MouseExited(evt);
            }
        });
        getContentPane().add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 121, 49, 36));

        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button8MouseExited(evt);
            }
        });
        getContentPane().add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 121, 49, 36));

        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button9MouseExited(evt);
            }
        });
        getContentPane().add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 121, 49, 36));

        button0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button0MouseExited(evt);
            }
        });
        button0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                button0KeyTyped(evt);
            }
        });
        getContentPane().add(button0, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 232, 101, 36));

        plusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plusButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plusButtonMouseExited(evt);
            }
        });
        getContentPane().add(plusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 121, 49, 73));

        qualsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qualsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                qualsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                qualsButtonMouseExited(evt);
            }
        });
        getContentPane().add(qualsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 195, 49, 73));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        
        System.exit(0); // Close the program..
    }//GEN-LAST:event_closeMouseClicked

    private void frameDraggMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDraggMousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameDraggMousePressed

    private void frameDraggMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDraggMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameDraggMouseDragged

    private void aboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseEntered
        
        about.setText("About");
    }//GEN-LAST:event_aboutMouseEntered

    private void aboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseExited
        
        about.setText("");
    }//GEN-LAST:event_aboutMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/close_2.png"));
        close.setIcon(II);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/close.png"));
        close.setIcon(II);
    }//GEN-LAST:event_closeMouseExited

    private void caButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caButtonMouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        caButton.setIcon(II);
    }//GEN-LAST:event_caButtonMouseEntered

    private void caButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caButtonMouseExited
        
        caButton.setIcon(null);
    }//GEN-LAST:event_caButtonMouseExited

    private void caButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caButtonMouseClicked
        
        display.setText("");
    }//GEN-LAST:event_caButtonMouseClicked

    private void divideButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideButtonMouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        divideButton.setIcon(II);
    }//GEN-LAST:event_divideButtonMouseEntered

    private void divideButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideButtonMouseExited
        
        divideButton.setIcon(null);
    }//GEN-LAST:event_divideButtonMouseExited

    private void divideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideButtonMouseClicked
        
        String preVal = display.getText() + "/";
        display.setText(preVal);
    }//GEN-LAST:event_divideButtonMouseClicked

    private void timesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesButtonMouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        timesButton.setIcon(II);
    }//GEN-LAST:event_timesButtonMouseEntered

    private void timesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesButtonMouseExited
        
        timesButton.setIcon(null);
    }//GEN-LAST:event_timesButtonMouseExited

    private void timesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesButtonMouseClicked
        
        String preVal = display.getText() + "*";
        display.setText(preVal);
    }//GEN-LAST:event_timesButtonMouseClicked

    private void minusButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        minusButton.setIcon(II);
    }//GEN-LAST:event_minusButtonMouseEntered

    private void minusButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseExited
        
        minusButton.setIcon(null);
    }//GEN-LAST:event_minusButtonMouseExited

    private void minusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseClicked
        
        String preVal = display.getText() + "-";
        display.setText(preVal);
    }//GEN-LAST:event_minusButtonMouseClicked

    private void button7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        button7.setIcon(II);
    }//GEN-LAST:event_button7MouseEntered

    private void button7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseExited
        
        button7.setIcon(null);
    }//GEN-LAST:event_button7MouseExited

    private void button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseClicked
        
        String preVal = display.getText() + "7";
        display.setText(preVal);
    }//GEN-LAST:event_button7MouseClicked

    private void button8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        button8.setIcon(II);
    }//GEN-LAST:event_button8MouseEntered

    private void button8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseExited
        
        button8.setIcon(null);
    }//GEN-LAST:event_button8MouseExited

    private void button8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseClicked
        
        String preVal = display.getText() + "8";
        display.setText(preVal);
    }//GEN-LAST:event_button8MouseClicked

    private void button9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        button9.setIcon(II);
    }//GEN-LAST:event_button9MouseEntered

    private void button9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseExited
        
        button9.setIcon(null);
    }//GEN-LAST:event_button9MouseExited

    private void button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseClicked
        
        String preVal = display.getText() + "9";
        display.setText(preVal);
    }//GEN-LAST:event_button9MouseClicked

    private void button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        button4.setIcon(II);
    }//GEN-LAST:event_button4MouseEntered

    private void button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseExited
        
        button4.setIcon(null);
    }//GEN-LAST:event_button4MouseExited

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        
        String preVal = display.getText() + "4";
        display.setText(preVal);
    }//GEN-LAST:event_button4MouseClicked

    private void button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        button5.setIcon(II);
    }//GEN-LAST:event_button5MouseEntered

    private void button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseExited
        
        button5.setIcon(null);
    }//GEN-LAST:event_button5MouseExited

    private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
        
        String preVal = display.getText() + "5";
        display.setText(preVal);
    }//GEN-LAST:event_button5MouseClicked

    private void button6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        button6.setIcon(II);
    }//GEN-LAST:event_button6MouseEntered

    private void button6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseExited
        
        button6.setIcon(null);
    }//GEN-LAST:event_button6MouseExited

    private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
        
        String preVal = display.getText() + "6";
        display.setText(preVal);
    }//GEN-LAST:event_button6MouseClicked

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        button1.setIcon(II);
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        
        button1.setIcon(null);
    }//GEN-LAST:event_button1MouseExited

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        
        String preVal = display.getText() + "1";
        display.setText(preVal);
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        button2.setIcon(II);
    }//GEN-LAST:event_button2MouseEntered

    private void button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseExited
        
        button2.setIcon(null);
    }//GEN-LAST:event_button2MouseExited

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        
        String preVal = display.getText() + "2";
        display.setText(preVal);
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        button3.setIcon(II);
    }//GEN-LAST:event_button3MouseEntered

    private void button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseExited
        
        button3.setIcon(null);
    }//GEN-LAST:event_button3MouseExited

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        
        String preVal = display.getText() + "3";
        display.setText(preVal);
    }//GEN-LAST:event_button3MouseClicked

    private void button0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button0MouseEntered
       
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button090.png"));
        button0.setIcon(II);
    }//GEN-LAST:event_button0MouseEntered

    private void button0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button0MouseExited
        
        button0.setIcon(null);
    }//GEN-LAST:event_button0MouseExited

    private void button0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button0MouseClicked
        
        String preVal = display.getText() + "0";
        display.setText(preVal);
    }//GEN-LAST:event_button0MouseClicked

    private void dotButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotButtonMouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/button90.png"));
        dotButton.setIcon(II);
    }//GEN-LAST:event_dotButtonMouseEntered

    private void dotButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotButtonMouseExited
       
        dotButton.setIcon(null);
    }//GEN-LAST:event_dotButtonMouseExited

    private void dotButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotButtonMouseClicked
        
        String preVal = display.getText() + ".";
        display.setText(preVal);
    }//GEN-LAST:event_dotButtonMouseClicked

    private void plusButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/plus_equals90.png"));
        plusButton.setIcon(II);
    }//GEN-LAST:event_plusButtonMouseEntered

    private void plusButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseExited
        
        plusButton.setIcon(null);
    }//GEN-LAST:event_plusButtonMouseExited

    private void plusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseClicked
        
        String preVal = display.getText() + "+";
        display.setText(preVal);
    }//GEN-LAST:event_plusButtonMouseClicked

    private void qualsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qualsButtonMouseEntered
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/plus_equals90.png"));
        qualsButton.setIcon(II);
    }//GEN-LAST:event_qualsButtonMouseEntered

    private void qualsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qualsButtonMouseExited
        
        qualsButton.setIcon(null);
    }//GEN-LAST:event_qualsButtonMouseExited

    private void qualsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qualsButtonMouseClicked
        
        ScriptEngineManager SEM = new ScriptEngineManager();
        ScriptEngine SE = SEM.getEngineByName("JavaScript");
        
        String operation = display.getText();
        
        try
        {
            String result = SE.eval(operation) + "";
            display.setText(result);
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }  
    }//GEN-LAST:event_qualsButtonMouseClicked

    private void button0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button0KeyTyped
        
   
    }//GEN-LAST:event_button0KeyTyped

    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new StartGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CA;
    private javax.swing.JLabel about;
    private javax.swing.JLabel background;
    private javax.swing.JLabel button0;
    private javax.swing.JLabel button1;
    private javax.swing.JLabel button2;
    private javax.swing.JLabel button3;
    private javax.swing.JLabel button4;
    private javax.swing.JLabel button5;
    private javax.swing.JLabel button6;
    private javax.swing.JLabel button7;
    private javax.swing.JLabel button8;
    private javax.swing.JLabel button9;
    private javax.swing.JLabel caButton;
    private javax.swing.JLabel close;
    public static javax.swing.JLabel display;
    private javax.swing.JLabel divide;
    private javax.swing.JLabel divideButton;
    private javax.swing.JLabel dotButton;
    private javax.swing.JLabel equals;
    private javax.swing.JLabel frameDragg;
    private javax.swing.JLabel minus;
    private javax.swing.JLabel minusButton;
    private javax.swing.JLabel num0;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num10;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel num3;
    private javax.swing.JLabel num4;
    private javax.swing.JLabel num5;
    private javax.swing.JLabel num6;
    private javax.swing.JLabel num7;
    private javax.swing.JLabel num8;
    private javax.swing.JLabel num9;
    private javax.swing.JLabel plus;
    private javax.swing.JLabel plusButton;
    private javax.swing.JLabel qualsButton;
    private javax.swing.JLabel times;
    private javax.swing.JLabel timesButton;
    // End of variables declaration//GEN-END:variables
}
