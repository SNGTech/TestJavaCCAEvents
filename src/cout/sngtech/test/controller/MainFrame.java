package cout.sngtech.test.controller;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import cout.sngtech.test.controller.users.User;
import cout.sngtech.test.gui.PagesList;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -5180715048937240093L;
	
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;
	public static final String TITLE = "Test CCA Portal";

	PageManager pageManager;
	EventController controller;
	
	public MainFrame() {
		this.setSize(new Dimension(WIDTH, HEIGHT));
		this.setTitle(TITLE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		pageManager = new PageManager();
		pageManager.initPages(this);
		this.setLayout(new BorderLayout());
		this.add(pageManager.getCardPanel());
		pageManager.showPage(PagesList.LOGIN_PAGE);
		
		controller = new EventController();
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
	
	public PageManager getPageManager() {
		return pageManager;
	}
	
	public EventController getEventController() {
		return controller;
	}
}
