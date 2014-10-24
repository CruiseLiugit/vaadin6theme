package com.example.vaadin6theme;

import com.vaadin.Application;
import com.vaadin.addon.chameleon.ChameleonTheme;
import com.vaadin.ui.*;
//import com.vaadin.ui.themes.ChameleonTheme;

/**
 * Main application class.
 */
public class Vaadin6themeApplication extends Application {

	@Override
	public void init() {
		//setTheme("chameleon-blue");
		//setTheme("chameleon-dark");
		setTheme("chameleon-green");
		
		Window mainWindow = new Window("Vaadin6theme Application");
		Label label = new Label("Hello Vaadin user");
		
		
		Label label2 = new Label("测试Theme 样式");
		Button button = new Button("Style me");
        button.addStyleName(ChameleonTheme.BUTTON_BIG);
        button.addStyleName(ChameleonTheme.BUTTON_WIDE);
        button.addStyleName(ChameleonTheme.BUTTON_DEFAULT);
        mainWindow.addComponent(button);
        mainWindow.addComponent(label2);
		
		
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}

