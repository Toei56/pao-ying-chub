package PaoYingChub;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PaoYingChub extends JFrame {
    public static void main(String[] args) {
        new PaoYingChub();
    }

    JLabel mBot, mPlayer, mMessage;
    enum mStuff {Hammer, Paper, Scissors}

    ImageIcon[] image = {
            new ImageIcon("src/PaoYingChub/image/hammer.png"),
            new ImageIcon("src/PaoYingChub/image/paper.png"),
            new ImageIcon("src/PaoYingChub/image/scissors.png")
    };

    public PaoYingChub() {
        setTitle("Pao Ying Chub");
        setSize(410,230);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mBot = new JLabel(image[0]);
        mPlayer = new JLabel(image[0]);
        mMessage = new JLabel("Draw");
        JButton btHammer = new JButton("Hammer");
        JButton btPaper = new JButton("Paper");
        JButton btScissors = new JButton("Scissors");

        JPanel bt = new JPanel(new GridLayout(3,0,5,5));
        bt.add(btHammer);
        bt.add(btPaper);
        bt.add(btScissors);

        JPanel pPalyer = new JPanel();
        pPalyer.setBorder(BorderFactory.createLoweredBevelBorder());
        pPalyer.add(mPlayer, BorderLayout.WEST);
        pPalyer.add(bt, BorderLayout.EAST);

        JPanel pBot = new JPanel();
        pBot.add(mBot, BorderLayout.WEST);
        pBot.add(pPalyer, BorderLayout.EAST);
        add(pBot, BorderLayout.NORTH);

        JPanel pMessage = new JPanel();
        pMessage.setBorder(BorderFactory.createEtchedBorder(1));
        pMessage.add(mMessage);
        add(pMessage, BorderLayout.SOUTH);

        btHammer.addActionListener(e -> process(mStuff.Hammer));
        btPaper.addActionListener(e -> process(mStuff.Paper));
        btScissors.addActionListener(e -> process(mStuff.Scissors));

        setVisible(true);
    }

    public void process(mStuff stuff) {
        Random rand = new Random();
        int number = rand.nextInt(3);
        mBot.setIcon(image[number]);

        if (stuff == mStuff.Hammer) {
            mPlayer.setIcon(image[0]);
        } else if (stuff == mStuff.Paper) {
            mPlayer.setIcon(image[1]);
        } else {
            mPlayer.setIcon(image[2]);
        }

        switch (stuff) {
            case Hammer: switch (number) {
                case 0 : mMessage.setText("Draw"); break;
                case 1 : mMessage.setText("You Lose"); break;
                case 2 : mMessage.setText("You Win"); break;
            }
                break;
            case Paper: switch (number) {
                case 0 : mMessage.setText("You Win"); break;
                case 1 : mMessage.setText("Draw"); break;
                case 2 : mMessage.setText("You Lose"); break;
            }
                break;
            case Scissors: switch (number) {
                case 0 : mMessage.setText("You Lose"); break;
                case 1 : mMessage.setText("You Win"); break;
                case 2 : mMessage.setText("Draw"); break;
            }
                break;
        }
    }
}


