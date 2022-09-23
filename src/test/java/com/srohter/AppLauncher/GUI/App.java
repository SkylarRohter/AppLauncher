package com.srohter.AppLauncher.GUI;

import com.srohter.AppLauncher.Apps.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author Skylar Rohter
 */
public class App extends JFrame {
    private JPanel contentPane;
    private JPanel panel_1;
    private JPasswordField passwordField;
    private JTextField spotType;

    public App() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 570, 430);
        contentPane = new JPanel();
        contentPane.setBorder(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panel_1 = new JPanel();
        panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(6, 6, 558, 396);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JButton Alma = new JButton("");
        Alma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Alma alma = new Alma();
                alma.openAlma();
            }
        });
        Alma.setBounds(44, 309, 37, 37);
        panel_1.add(Alma);
        Alma.setFont(new Font("Arial", Font.PLAIN, 13));

        JLabel AlmaText = new JLabel("alma");
        AlmaText.setFont(new Font("Arial", Font.PLAIN, 20));
        AlmaText.setBounds(85, 303, 47, 47);
        panel_1.add(AlmaText);

        JButton word = new JButton("");
        word.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Word word = new Word();
                word.openWord();
            }
        });
        word.setFont(new Font("Arial", Font.PLAIN, 13));
        word.setBounds(44, 260, 37, 37);
        panel_1.add(word);

        JLabel wordText = new JLabel("word");
        wordText.setFont(new Font("Arial", Font.PLAIN, 20));
        wordText.setBounds(85, 254, 47, 47);
        panel_1.add(wordText);

        JButton mail = new JButton("");
        mail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Mail mail = new Mail();
                mail.openMail();
            }
        });
        mail.setFont(new Font("Arial", Font.PLAIN, 13));
        mail.setBounds(44, 211, 37, 37);
        panel_1.add(mail);

        JButton yale = new JButton("");
        yale.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        yale.setFont(new Font("Arial", Font.PLAIN, 13));
        yale.setBounds(477, 313, 37, 37);
        panel_1.add(yale);

        JLabel mailText = new JLabel("mail");
        mailText.setFont(new Font("Arial", Font.PLAIN, 20));
        mailText.setBounds(85, 208, 47, 47);
        panel_1.add(mailText);

        JLabel yaleText = new JLabel("yale");
        yaleText.setFont(new Font("Arial", Font.PLAIN, 20));
        yaleText.setBounds(381, 275, 47, 47);
        panel_1.add(yaleText);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 13));
        passwordField.setForeground(new Color(0, 0, 0));
        passwordField.setBounds(341, 316, 121, 26);
        panel_1.add(passwordField);

        JButton rbs6 = new JButton("");
        rbs6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        rbs6.setFont(new Font("Arial", Font.PLAIN, 13));
        rbs6.setBounds(44, 162, 37, 37);
        panel_1.add(rbs6);

        JLabel rb6sText = new JLabel("rb6s");
        rb6sText.setFont(new Font("Arial", Font.PLAIN, 20));
        rb6sText.setBounds(85, 158, 47, 47);
        panel_1.add(rb6sText);

        JSlider volume = new JSlider();
        volume.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
        volume.setBounds(341, 238, 121, 29);
        panel_1.add(volume);

        spotType = new JTextField();
        spotType.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        spotType.setBounds(341, 200, 121, 26);
        panel_1.add(spotType);
        spotType.setColumns(10);

        JButton spot = new JButton("");
        spot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Spotify spotify = new Spotify(spotType.getText(),volume.getValue());
                spotify.openSpotify();
            }
        });
        spot.setFont(new Font("Arial", Font.PLAIN, 13));
        spot.setBounds(477, 211, 37, 37);
        panel_1.add(spot);

        JLabel lblSpotify = new JLabel("spotify");
        lblSpotify.setFont(new Font("Arial", Font.PLAIN, 20));
        lblSpotify.setBounds(370, 152, 81, 47);
        panel_1.add(lblSpotify);

        JCheckBox mailCheck = new JCheckBox("");
        mailCheck.setFont(new Font("Arial", Font.PLAIN, 15));
        mailCheck.setBounds(16, 217, 28, 23);
        panel_1.add(mailCheck);

        JCheckBox wordCheck = new JCheckBox("");
        wordCheck.setFont(new Font("Arial", Font.PLAIN, 15));
        wordCheck.setBounds(16, 268, 28, 23);
        panel_1.add(wordCheck);

        JCheckBox almaCheck = new JCheckBox("");
        almaCheck.setFont(new Font("Arial", Font.PLAIN, 15));
        almaCheck.setBounds(16, 316, 28, 23);
        panel_1.add(almaCheck);

        JCheckBox rbCheck = new JCheckBox("");
        rbCheck.setFont(new Font("Arial", Font.PLAIN, 15));
        rbCheck.setBounds(16, 171, 28, 23);
        panel_1.add(rbCheck);

        JButton start = new JButton("");
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<Boolean> list = new ArrayList<>();
                list.add(rbCheck.isSelected());
                list.add(mailCheck.isSelected());
                list.add(wordCheck.isSelected());
                list.add(almaCheck.isSelected());
                Starter starter = new Starter(list);
                starter.makeStarter();
            }
        });
        start.setFont(new Font("Arial", Font.PLAIN, 13));
        start.setBounds(27, 122, 37, 37);
        panel_1.add(start);

        JLabel startText = new JLabel("start spf.");
        startText.setFont(new Font("Arial", Font.PLAIN, 20));
        startText.setBounds(68, 116, 87, 47);
        panel_1.add(startText);
    }
}
