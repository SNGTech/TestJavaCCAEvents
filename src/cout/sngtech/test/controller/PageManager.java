package cout.sngtech.test.controller;

import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JPanel;

import cout.sngtech.test.gui.LoginPage;
import cout.sngtech.test.gui.PagesList;
import cout.sngtech.test.gui.StaffLoginPage;
import cout.sngtech.test.gui.StaffPage;
import cout.sngtech.test.gui.StudentPage;

public class PageManager {

	private CardLayout layout;
	private JPanel cardPanel;
	private Map<String, JPanel> pages;
	
	public PageManager() {
		layout = new CardLayout();
		cardPanel = new JPanel(layout);
		pages = new HashMap<>();
	}
	
	public void initPages(MainFrame main) {
		pages.put(PagesList.LOGIN_PAGE, new LoginPage(main));
		pages.put(PagesList.STAFF_LOGIN_PAGE, new StaffLoginPage(main));
		pages.put(PagesList.STUDENT_PAGE, new StudentPage(main));
		pages.put(PagesList.STAFF_PAGE, new StaffPage(main));
		
		for(Entry<String, JPanel> page : pages.entrySet()) {
			cardPanel.add(page.getValue(), page.getKey());
		}
	}
	
	public void showPage(String pageIdentifier) {
		layout.show(cardPanel, pageIdentifier);
	}

	public CardLayout getLayout() {
		return layout;
	}
	
	public JPanel getCardPanel() {
		return cardPanel;
	}
}
