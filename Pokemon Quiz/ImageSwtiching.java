import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

public class ImageSwtiching {

    JFrame frame=new JFrame();
    JButton button=new JButton("Click Me");
    ImageIcon[] image={
        new ImageIcon("image1.png"),
        new ImageIcon("image2.png"),
        new ImageIcon("image3.png")
    };

    JLabel imagLabel=new JLabel(image[0]);
    int index=0;
    MouseHandler mHandler=new MouseHandler();
    public static void main(String[] args) {
        new ImageSwtiching();
    }

    public ImageSwtiching(){
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);

        imagLabel.setBounds(0,0,200,200);
        button.setBounds(200,260,100,40);
        button.addMouseListener(mHandler);
        imagLabel.setOpaque(true);
        frame.add(button);
        frame.add(imagLabel);

        frame.setVisible(true);

    }
    public class MouseHandler implements MouseInputListener
    {

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
            if(e.getSource()==button){
                System.out.println("You clicked the button!");
                index++;
                imagLabel.setIcon(image[index]);
                frame.add(imagLabel);
            }


        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'mouseDragged'");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'mouseMoved'");
        }
        
    }
}