package StouTec;

import javax.swing.*;
import java.awt.*;

public class StouTec extends JFrame {
    JPanel mPanel = new JPanel();
    JLabel mLbStou = new JLabel("บริษัท STOI-TEC จำกัด");
    JLabel[] mLbMessage = new JLabel[5];
    JLabel[] mLbData = new JLabel[16];
    JTextField[] mTfData = new JTextField[6];
    String[] mQUAL_1 = { "เลือกความรู้ความสามารถ 1",
            "Wep_ASP", "C++", "Database Administrator,DB2", "Database Administrator,ORACLE", "Graphic Disign",
            "JAVA", "Management", "Network", "Secretarial work45 words/min", "Secretarial work65 words/min",
            "System Analyst, Level 1", "System Analyst, Level 2", "Visual Basic"};
    String[] mQUAL_2 = { "เลือกความรู้ความสามารถ 2",
            "Wep_ASP", "C++", "Database Administrator,DB2", "Database Administrator,ORACLE", "Graphic Disign",
            "JAVA", "Management", "Network", "Secretarial work45 words/min", "Secretarial work65 words/min",
            "System Analyst, Level 1", "System Analyst, Level 2", "Visual Basic"};
    String[] mQUAL_3 = { "เลือกความรู้ความสามารถ 3",
            "Wep_ASP", "C++", "Database Administrator,DB2", "Database Administrator,ORACLE", "Graphic Disign",
            "JAVA", "Management", "Network", "Secretarial work45 words/min", "Secretarial work65 words/min",
            "System Analyst, Level 1", "System Analyst, Level 2", "Visual Basic"};
    String[] mQUAL_4 = { "เลือกความรู้ความสามารถ 4",
            "Wep_ASP", "C++", "Database Administrator,DB2", "Database Administrator,ORACLE", "Graphic Disign",
            "JAVA", "Management", "Network", "Secretarial work45 words/min", "Secretarial work65 words/min",
            "System Analyst, Level 1", "System Analyst, Level 2", "Visual Basic"};
    String[] mQUAL_5 = { "เลือกความรู้ความสามารถ 5",
            "Wep_ASP", "C++", "Database Administrator,DB2", "Database Administrator,ORACLE", "Graphic Disign",
            "JAVA", "Management", "Network", "Secretarial work45 words/min", "Secretarial work65 words/min",
            "System Analyst, Level 1", "System Analyst, Level 2", "Visual Basic"};
    String[] mPOS_1 = { "เลือกตำแหน่งที่ต้องการสมัคร 1",
            "Tecnical Programmer", "Wep Developer", "General Manager", "ICT Specialist", "E-Business Analyst",
            "ICT Documenter", "Database Administrator", "PC Administrator", "Network Specialist", "ICT Manager"};
    String[] mPOS_2 = { "เลือกตำแหน่งที่ต้องการสมัคร 2",
            "Tecnical Programmer", "Wep Developer", "General Manager", "ICT Specialist", "E-Business Analyst",
            "ICT Documenter", "Database Administrator", "PC Administrator", "Network Specialist", "ICT Manager"};
    String[] mPOS_3 = { "เลือกตำแหน่งที่ต้องการสมัคร 3",
            "Tecnical Programmer", "Wep Developer", "General Manager", "ICT Specialist", "E-Business Analyst",
            "ICT Documenter", "Database Administrator", "PC Administrator", "Network Specialist", "ICT Manager"};
    JComboBox[] mCbQUAL = new JComboBox[5];
    JComboBox[] mCbPOS = new JComboBox[3];
    JRadioButton mSEX_M = new JRadioButton("ชาย");
    JRadioButton mSEX_F = new JRadioButton("หญิง");
    ButtonGroup mGSEX = new ButtonGroup();
    JButton mOK = new JButton("ตกลง");

    Font mFont_1 = new Font("Microsoft Sans Serif", Font.BOLD, 16);
    Font mFont_2 = new Font("Microsoft Sans Serif", Font.BOLD, 14);
    Font mFont_3 = new Font("Microsoft Sans Serif", Font.PLAIN, 14);

    String t;

    StouTec() {
        setTitle("STOU-TEC");
        setSize(800,680);
        setResizable(true);

        mLbStou.setFont(mFont_1);

        mLbMessage[0] = new JLabel("แบบฟอร์มใบสมัครพนักงาน");
        mLbMessage[1] = new JLabel("ใบสมัครงานด้าน ICT นี้ ให้ผู้สมัครกรอกรายละเอียดต่อไปนี้เพื่อที่");
        mLbMessage[2] = new JLabel("บริษัท STOU-TEC จำกัด ทำการคัดเลือกตามความเหมาะสม");
        mLbMessage[3] = new JLabel("ความรู้ความสามารถหรือคุณสมบัติเฉพาะตำแหน่ง (QUAL_DESC) (ตอบได้ไม่เกิน 5 รายการ)");
        mLbMessage[4] = new JLabel("ตำแหน่งตองการสมัคร (POS_NAME) : (ตอบได้ไม่เกิน 3 ตำแหน่ง)");
        for (JLabel jLabel : mLbMessage) {
            jLabel.setFont(mFont_2);
        }

        mLbData[0] = new JLabel("เลขประจำตัวของผู้สมัคร (AP_ID) : ");
        mLbData[1] = new JLabel("ชื่อ-นามสกุล (AP_NAME) : ");
        mLbData[2] = new JLabel("ที่อยู่ (AP_ADDRESS) : ");
        mLbData[3] = new JLabel("จังหวัด (AP_CHW) : ");
        mLbData[4] = new JLabel("เพศ (AP_SEX) : ");
        mLbData[5] = new JLabel("วุฒิการศึกษาชั้นสูงสุด (AP_ED) : ");
        mLbData[6] = new JLabel("(เช่น B.S, B.A, M.S, M.BA, M.A)");
        mLbData[7] = new JLabel("วิชาเอก (AP_MAJ) : ");
        mLbData[8] = new JLabel("ความรู้ความสามารถ 1");
        mLbData[9] = new JLabel("ความรู้ความสามารถ 2");
        mLbData[10] = new JLabel("ความรู้ความสามารถ 3");
        mLbData[11] = new JLabel("ความรู้ความสามารถ 4");
        mLbData[12] = new JLabel("ความรู้ความสามารถ 5");
        mLbData[13] = new JLabel("ตำแหน่งที่ต้องการสมัคร 1");
        mLbData[14] = new JLabel("ตำแหน่งที่ต้องการสมัคร 2");
        mLbData[15] = new JLabel("ตำแหน่งที่ต้องการสมัคร 3");
        for (JLabel mLbDatum : mLbData) {
            mLbDatum.setFont(mFont_3);
        }

        mTfData[0] = new JTextField();
        mTfData[1] = new JTextField();
        mTfData[2] = new JTextField();
        mTfData[3] = new JTextField();
        mTfData[4] = new JTextField();
        mTfData[5] = new JTextField();

        mCbQUAL[0] = new JComboBox<>(mQUAL_1);
        mCbQUAL[1] = new JComboBox<>(mQUAL_2);
        mCbQUAL[2] = new JComboBox<>(mQUAL_3);
        mCbQUAL[3] = new JComboBox<>(mQUAL_4);
        mCbQUAL[4] = new JComboBox<>(mQUAL_5);

        mCbPOS[0] = new JComboBox<>(mPOS_1);
        mCbPOS[1] = new JComboBox<>(mPOS_2);
        mCbPOS[2] = new JComboBox<>(mPOS_3);

        mGSEX.add(mSEX_M);
        mGSEX.add(mSEX_F);

        mPanel.setLayout(null);
        mPanel.add(mLbStou);
        mLbStou.setBounds(300,5,200,30);

        mPanel.add(mLbMessage[0]);
        mLbMessage[0].setBounds(300,40,500,15);

        mPanel.add(mLbMessage[1]);
        mLbMessage[1].setBounds(200,65,500,15);

        mPanel.add(mLbMessage[2]);
        mLbMessage[2].setBounds(220,85,500,15);

        mPanel.add(mLbData[0]);
        mLbData[0].setBounds(50,107,500,20);
        mPanel.add(mTfData[0]);
        mTfData[0].setBounds(260,110,250,20);
        t = mTfData[0].getText();

        mPanel.add(mLbData[1]);
        mLbData[1].setBounds(50,135,500,20);
        mPanel.add(mTfData[1]);
        mTfData[1].setBounds(260,138,250,20);

        mPanel.add(mLbData[2]);
        mLbData[2].setBounds(50,163,500,20);
        mPanel.add(mTfData[2]);
        mTfData[2].setBounds(260,166,250,20);

        mPanel.add(mLbData[3]);
        mLbData[3].setBounds(50,191,500,20);
        mPanel.add(mTfData[3]);
        mTfData[3].setBounds(260,194,250,20);

        mPanel.add(mLbData[4]);
        mLbData[4].setBounds(50,219,500,20);
        mPanel.add(mSEX_M);
        mSEX_M.setBounds(255,222,50,20);
        mPanel.add(mSEX_F);
        mSEX_F.setBounds(310,222,60,20);

        mPanel.add(mLbData[5]);
        mLbData[5].setBounds(50,247,500,20);
        mPanel.add(mTfData[4]);
        mTfData[4].setBounds(260,250,250,20);

        mPanel.add(mLbData[6]);
        mLbData[6].setBounds(50,275,500,20);

        mPanel.add(mLbData[7]);
        mLbData[7].setBounds(50,303,500,20);
        mPanel.add(mTfData[5]);
        mTfData[5].setBounds(260,306,250,20);

        mPanel.add(mLbMessage[3]);
        mLbMessage[3].setBounds(50,331,600,20);

        mPanel.add(mLbData[8]);
        mLbData[8].setBounds(50,359,500,20);
        mPanel.add(mCbQUAL[0]);
        mCbQUAL[0].setBounds(260,362,250,20);

        mPanel.add(mLbData[9]);
        mLbData[9].setBounds(50,387,500,20);
        mPanel.add(mCbQUAL[1]);
        mCbQUAL[1].setBounds(260,390,250,20);

        mPanel.add(mLbData[10]);
        mLbData[10].setBounds(50,415,500,20);
        mPanel.add(mCbQUAL[2]);
        mCbQUAL[2].setBounds(260,418,250,20);

        mPanel.add(mLbData[11]);
        mLbData[11].setBounds(50,443,500,20);
        mPanel.add(mCbQUAL[3]);
        mCbQUAL[3].setBounds(260,446,250,20);

        mPanel.add(mLbData[12]);
        mLbData[12].setBounds(50,471,500,20);
        mPanel.add(mCbQUAL[4]);
        mCbQUAL[4].setBounds(260,474,250,20);

        mPanel.add(mLbMessage[4]);
        mLbMessage[4].setBounds(50,499,500,20);

        mPanel.add(mLbData[13]);
        mLbData[13].setBounds(50,527,500,20);
        mPanel.add(mCbPOS[0]);
        mCbPOS[0].setBounds(260,530,250,20);

        mPanel.add(mLbData[14]);
        mLbData[14].setBounds(50,555,500,20);
        mPanel.add(mCbPOS[1]);
        mCbPOS[1].setBounds(260,558,250,20);

        mPanel.add(mLbData[15]);
        mLbData[15].setBounds(50,583,500,20);
        mPanel.add(mCbPOS[2]);
        mCbPOS[2].setBounds(260,586,250,20);

        mPanel.add(mOK);
        mOK.setBounds(340,611,70,20);

        add(mPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
