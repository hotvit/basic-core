/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;
import java.awt.*;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

/**
 *
 * @author ti
 */

   
public class PaintFrame extends JFrame {
       
        private static final long serialVersionUID = 1L;

        JScrollPane scrollPane;

        ImageIcon icon;

        public PaintFrame() {

            icon = new ImageIcon("/formLog.png");

            JPanel panel = new JPanel() {

                public void paintComponent(Graphics g) {

// Trường hợp 1: Hiển thị hình ảnh với kích cỡ đầy đủ
                   g.drawImage(icon.getImage(), 0, 0, null);
// Trường hợp 2: Co giãn kích thước hình ảnh lớn bằng kích thước JFrame
                   // Dimension d = getSize();

                   // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);

                    // Trường hợp 3: Cố định vị trí hình ảnh trong scroll pane
// Point p = scrollPane.getViewport().getViewPosition();
                    // g.drawImage(icon.getImage(), p.x, p.y, null);
                    setOpaque(false);
                    super.paintComponent(g);
                }

            };

////vẽ 1 button lên JFrame để thử
            JButton button = new JButton("hello");

            panel.add(button);
            
            scrollPane = new JScrollPane(panel);

            setContentPane(scrollPane);

        }        
    
    
    public static void main(String[] args) {

        PaintFrame jframe = new PaintFrame();

            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            jframe.setSize(724, 315);

            jframe.setVisible(true);
        }
    
}
