import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class Game {

    //Size of the Frame
    public final int WIDTH=600;
    public final int HEIGHT=600;

    public final int BANNER_WIDHT=600;
    public final int BANNER_HEIGHT=120;

    public final int IMAGE_LABEL_WIDHT=250;
    public final int IMAGE_LABEL_HEIGHT=250;

    public final int BUTTON_PANEL_WIDTH=250;
    public final int BUTTON_PANEL_HEIGHT=250;

    int counter=0;
    

    JFrame frame=new JFrame();

    ImageIcon bannerImage=new ImageIcon("banner.png");
    JLabel bannerLabel=new JLabel(bannerImage);

    JLabel quesLabel=new JLabel();

    JPanel ImagePanel=new JPanel();
    JLabel pokeImageLabel=new JLabel();
    ImageIcon[] PokemonImage={
        new ImageIcon("image1.png"),
        new ImageIcon("image2.png"),
        new ImageIcon("image3.png"),
        new ImageIcon("image4.png"),
        new ImageIcon("image5.png"),
        new ImageIcon("image6.png")
    };


    JPanel buttonPanel=new JPanel();
    JButton b1=new JButton();
    JButton b2=new JButton();
    JButton b3=new JButton();
    JButton b4=new JButton();

    Font normalFont=new Font("Inter", Font.PLAIN, 22);
    Font headFont=new Font("Comic Sans MS", Font.BOLD, 50);


    ButtonHandler bHandler=new ButtonHandler();

    JPanel nextPanel=new JPanel();
    ImageIcon nextImage=new ImageIcon("next.png");
    JButton nextButton=new JButton(nextImage);


    public void Window(){
        frame.setSize(WIDTH,HEIGHT);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Pokemon Quiz");
        frame.getContentPane().setBackground(Color.RED);

        addBanner();
        QuestionHeading();
        settingPokemonImage();
        settingButton();
        nextButton();

        frame.setVisible(true);
    }

    public void QuestionHeading(){
        quesLabel.setBounds(0,110,600,100);
        quesLabel.setText("Who's that Pokemon");
        quesLabel.setFont(headFont);
        quesLabel.setHorizontalAlignment(JLabel.CENTER);
        quesLabel.setVerticalAlignment(JLabel.CENTER);
        quesLabel.setForeground(Color.WHITE);

        frame.add(quesLabel);
    }

    public void addBanner(){
        bannerLabel.setBounds(0,0,BANNER_WIDHT,BANNER_HEIGHT);
        frame.add(bannerLabel);
    }

    public void settingPokemonImage(){
        ImagePanel.setBounds(20,220,IMAGE_LABEL_WIDHT,IMAGE_LABEL_HEIGHT);
        // ImagePanel.setBackground(Color.CYAN);
        pokeImageLabel.setIcon(PokemonImage[counter]);

        ImagePanel.add(pokeImageLabel);
        frame.add(ImagePanel);
    }


    public void settingButton(){
        buttonPanel.setBounds(320,220,BUTTON_PANEL_WIDTH,BUTTON_PANEL_HEIGHT);
        buttonPanel.setLayout(new GridLayout(4,1,0,3));
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);

        b1.setText("Machamp");
        b2.setText("BellSprout");
        b3.setText("Machop");
        b4.setText("Tentacool");

        
        b1.setFocusPainted(false);
        b2.setFocusPainted(false);
        b3.setFocusPainted(false);
        b4.setFocusPainted(false);
        
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        
        b1.setFont(normalFont);
        b2.setFont(normalFont);
        b3.setFont(normalFont);
        b4.setFont(normalFont);
        
        b1.addActionListener(bHandler);
        b2.addActionListener(bHandler);
        b3.addActionListener(bHandler);
        b4.addActionListener(bHandler);
        
        b1.setActionCommand("machamp");
        b2.setActionCommand("no");
        b3.setActionCommand("no");
        b4.setActionCommand("no");


        frame.add(buttonPanel);
    }

    public void nextButton(){
        nextPanel.setBounds(500,490,60,60);
        nextPanel.setBackground(Color.RED);
        nextButton.setEnabled(false);
        // nextButton.setBackground(Color.RED);
        nextButton.addActionListener(bHandler);
        nextButton.setActionCommand("next");
        nextPanel.add(nextButton);
        

        frame.add(nextPanel);
    }

    public void ButtonFalse(){
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
    }

    public void ButtonTrue(){
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
    }

    public void Question2(){
        pokeImageLabel.setIcon(PokemonImage[counter]);
        b1.setText("Egeal");
        b2.setText("Blastoise");
        b3.setText("Pikachu");
        b4.setText("Balbasaur");

        ButtonTrue();        
        b1.setActionCommand("no");
        b2.setActionCommand("no");
        b3.setActionCommand("no");
        b4.setActionCommand("balbasaur");

        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        nextButton.setEnabled(false);
        // ButtonTrue();

    }

    public void Question3(){
        pokeImageLabel.setIcon(PokemonImage[counter]);
        b1.setText("Egeal");
        b2.setText("Blastoise");
        b3.setText("Caterpie");
        b4.setText("Balbasaur");

        ButtonTrue();        
        b1.setActionCommand("no");
        b2.setActionCommand("no");
        b3.setActionCommand("caterpie");
        b4.setActionCommand("no");

        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        nextButton.setEnabled(false);
    }

    public void Question4(){
        pokeImageLabel.setIcon(PokemonImage[counter]);
        b1.setText("Egeal");
        b2.setText("Machop");
        b3.setText("Geodude");
        b4.setText("Alakazam");

        ButtonTrue();        
        b1.setActionCommand("no");
        b2.setActionCommand("no");
        b3.setActionCommand("no");
        b4.setActionCommand("alakazam");

        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        nextButton.setEnabled(false);
    }


    public class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String action=e.getActionCommand();

            if(counter==0){

                if(action.equals("machamp")){
                    b1.setBackground(Color.GREEN);
                    ButtonFalse();
                    nextButton.setEnabled(true);
                }else if(action.equals("no")){
                    b1.setBackground(Color.GREEN);
                    b2.setBackground(Color.PINK);
                    b3.setBackground(Color.PINK);
                    b4.setBackground(Color.PINK);
                    ButtonFalse();
                    nextButton.setEnabled(true);
                }else if(action.equals("next")){
                    counter++;
                    Question2();
                }
                
                
            }

            else if(counter==1){
                if(action.equals("balbasaur")){
                    b4.setBackground(Color.GREEN);
                    ButtonFalse();
                    nextButton.setEnabled(true);
                }else if(action.equals("no")){
                    b1.setBackground(Color.PINK);
                    b2.setBackground(Color.PINK);
                    b3.setBackground(Color.PINK);
                    b4.setBackground(Color.GREEN);
                    ButtonFalse();
                    nextButton.setEnabled(true);
                }else if(action.equals("next")){
                    counter++;
                    Question3();
                    System.out.println("Question3");
                }
                
            }
            else if(counter==2){
                if(action.equals("caterpie")){
                    b3.setBackground(Color.GREEN);
                    ButtonFalse();
                    nextButton.setEnabled(true);
                }else if(action.equals("no")){
                    b1.setBackground(Color.PINK);
                    b2.setBackground(Color.PINK);
                    b3.setBackground(Color.GREEN);
                    b4.setBackground(Color.PINK);
                    ButtonFalse();
                    nextButton.setEnabled(true);
                }else if(action.equals("next")){
                    counter++;
                    Question4();
                    System.out.println("Question3");
                }
                
            }
            else if(counter==3){
                if(action.equals("alakazam")){
                    b1.setBackground(Color.PINK);
                    ButtonFalse();
                    nextButton.setEnabled(true);
                }else if(action.equals("no")){
                    b1.setBackground(Color.PINK);
                    b2.setBackground(Color.PINK);
                    b3.setBackground(Color.PINK);
                    b4.setBackground(Color.GREEN);
                    ButtonFalse();
                    nextButton.setEnabled(true);
                }else if(action.equals("next")){
                    counter++;
                    // Question3();
                    System.out.println("Question3");
                }
                
            }
        }

    }

    public Game(){

        Window();

    }
    
}
