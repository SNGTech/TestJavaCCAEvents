package cout.sngtech.test.gui;

import java.awt.Dimension;

import javax.swing.JPanel;

import cout.sngtech.test.controller.MainFrame;
import cout.sngtech.test.data.events.Category;
import cout.sngtech.test.data.events.EnrichmentEvent;
import cout.sngtech.test.data.events.Event;
import cout.sngtech.test.data.events.ServiceEvent;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class StudentPage extends JPanel {
	
	private static final long serialVersionUID = 1165379489856931549L;
	
	private JTextField eventNameInputField;
	private JTextField dateInputField;
	
	Event event;

	public StudentPage(MainFrame main) {
		this.setSize(new Dimension(MainFrame.WIDTH, MainFrame.HEIGHT));
		setLayout(null);
		
		JPanel submissionView = new JPanel();
		submissionView.setBounds(506, 342, 353, 233);
		add(submissionView);
		submissionView.setLayout(null);
		submissionView.setVisible(false);
		
		JLabel lblSubmittedEventDetails = new JLabel("Submitted Event Details");
		lblSubmittedEventDetails.setBounds(0, 0, 198, 16);
		submissionView.add(lblSubmittedEventDetails);
		lblSubmittedEventDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblEventName = new JLabel("Event Name:");
		lblEventName.setBounds(0, 35, 87, 16);
		submissionView.add(lblEventName);
		lblEventName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblDate_1 = new JLabel("Date:");
		lblDate_1.setBounds(0, 67, 36, 16);
		submissionView.add(lblDate_1);
		lblDate_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblCategory_1 = new JLabel("Category:");
		lblCategory_1.setBounds(0, 99, 64, 19);
		submissionView.add(lblCategory_1);
		lblCategory_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel submittedName = new JLabel("placholder_name");
		submittedName.setBounds(98, 35, 187, 16);
		submissionView.add(submittedName);
		submittedName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel submittedDate = new JLabel("placholder_date");
		submittedDate.setBounds(47, 67, 153, 16);
		submissionView.add(submittedDate);
		submittedDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel submittedCategory = new JLabel("placholder_category");
		submittedCategory.setBounds(75, 99, 162, 19);
		submissionView.add(submittedCategory);
		submittedCategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		String[] categories = new String[]{ Category.SERVICE.label(), Category.ENRICHMENT.label() };
		JComboBox comboBox = new JComboBox(categories);
		comboBox.setBounds(600, 245, 119, 22);
		add(comboBox);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(129, 152, 97, 25);
		submissionView.add(btnEdit);
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(244, 152, 97, 25);
		submissionView.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				eventNameInputField.setText("");
				dateInputField.setText("");
				comboBox.setSelectedIndex(0);
				submissionView.setVisible(false);
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JTextArea textArea = new JTextArea();
		textArea.setBounds(49, 109, 386, 430);
		add(textArea);

		
		JLabel lblEventList = new JLabel("Event List");
		lblEventList.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEventList.setBounds(49, 80, 93, 16);
		add(lblEventList);
		
		JLabel lblSubmitCcaEvent = new JLabel("Submit CCA Event");
		lblSubmitCcaEvent.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSubmitCcaEvent.setBounds(506, 109, 153, 16);
		add(lblSubmitCcaEvent);
		
		JLabel lblNewLabel = new JLabel("Event Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(506, 150, 87, 16);
		add(lblNewLabel);
		
		eventNameInputField = new JTextField();
		eventNameInputField.setBounds(600, 148, 213, 22);
		add(eventNameInputField);
		eventNameInputField.setColumns(10);
		
		dateInputField = new JTextField();
		dateInputField.setBounds(600, 195, 213, 22);
		add(dateInputField);
		dateInputField.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate.setBounds(553, 197, 31, 16);
		add(lblDate);
		
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCategory.setBounds(525, 246, 59, 19);
		add(lblCategory);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex() == 0) {
					event = new ServiceEvent(eventNameInputField.getText(), dateInputField.getText());
				}
				if(comboBox.getSelectedIndex() == 1) {
					event = new EnrichmentEvent(eventNameInputField.getText(), dateInputField.getText());
				}
				
				submittedName.setText(event.name);
				submittedDate.setText(event.date);
				submittedCategory.setText(event.category.label());
				submissionView.setVisible(true);
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSubmit.setBounds(506, 290, 97, 25);
		add(btnSubmit);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(12, 152, 97, 25);
		submissionView.add(btnConfirm);
		btnConfirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.getEventController().confirmEvent(event);
				
				StringBuilder eventList = new StringBuilder("");
				for(Event event : main.getEventController().getStudentEvents().getEvents()) {
					eventList.append(event.name + "    ");
					eventList.append(event.date + "    ");
					eventList.append(event.category.label() + "\n");
				}
				textArea.setText(eventList.toString());
				submissionView.setVisible(false);
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnStaffView = new JButton("Switch to Staff View");
		btnStaffView.setBounds(362, 44, 149, 25);
		btnStaffView.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.getPageManager().showPage(PagesList.STAFF_LOGIN_PAGE);
			}
		});
		add(btnStaffView);
		
		JLabel lblNewLabel_1 = new JLabel("Student Home Page");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(352, 15, 179, 16);
		add(lblNewLabel_1);
	}
}
