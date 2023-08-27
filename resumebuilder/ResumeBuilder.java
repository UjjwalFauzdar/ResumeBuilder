package com.resumebuilder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ResumeBuilder extends JFrame {
	private final Map<String, String> resumeFields = new HashMap<>();

	private JLabel nameLabel, emailLabel, phoneLabel, addressLabel, educationLabel, workExperienceLabel, skillsLabel;
	private JTextField nameField, emailField, phoneField, addressField, educationField, workExperienceField,
			skillsField;
	private JButton generateButton;

	public ResumeBuilder() {
        setTitle("Resume Builder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2));

        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField();
        addressLabel = new JLabel("Address:");
        addressField = new JTextField();
        educationLabel = new JLabel("Education:");
        educationField = new JTextField();
        workExperienceLabel = new JLabel("Work Experience:");
        workExperienceField = new JTextField();
        skillsLabel = new JLabel("Skills:");
        skillsField = new JTextField();

        generateButton = new JButton("Generate Resume");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateResume();
            }
        });

        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(phoneLabel);
        add(phoneField);
        add(addressLabel);
        add(addressField);
        add(educationLabel);
        add(educationField);
        add(workExperienceLabel);
        add(workExperienceField);
        add(skillsLabel);
        add(skillsField);
        add(new JLabel()); 
        add(generateButton);

        pack();
        setLocationRelativeTo(null); 
        setVisible(true);
    }

	private void generateResume() {
		resumeFields.put("Name", nameField.getText());
		resumeFields.put("Email", emailField.getText());
		resumeFields.put("Phone", phoneField.getText());
		resumeFields.put("Address", addressField.getText());
		resumeFields.put("Education", educationField.getText());
		resumeFields.put("Work Experience", workExperienceField.getText());
		resumeFields.put("Skills", skillsField.getText());
		JOptionPane.showMessageDialog(this, "Your Resume has been generated successfully!");
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ResumeBuilder();
			}
		});
	}
}