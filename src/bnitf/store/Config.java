package bnitf.store;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.*;

public class Config {
	File file;
	String storeName, hostUsername, hostPassword, tablePrefix;
	URL host;
	Properties props;
	File configfile;

	public Config(Main uip) {
		new Installer(uip, this);
		/*props = new Properties();
		try {
			configfile = new File("bnitf/store/Config.xml");
			InputStream istream = new FileInputStream(configfile);
			props.loadFromXML(istream);
			readConfig();
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
			new Installer(uip, this);
		} catch (IOException e) {
			e.printStackTrace();
			new Installer(uip, this);
		} finally {
		}*/
	}

	public Config(String storeNameN, String usernameHostN,
			String passwordHostN, URL hostN) {
		createConfig(storeNameN, usernameHostN, passwordHostN, hostN);

	}

	public void readConfig() throws MalformedURLException {
		host = new URL(props.getProperty("host.url"));
		storeName = props.getProperty("store.name");
		hostUsername = props.getProperty("host.user");
		hostPassword = props.getProperty("host.password");
		tablePrefix = props.getProperty("host.tablePrefix");
	}

	public void writeConfig() {

	}

	public void createConfig(String storeNameN, String usernameHostN,
			String passwordHostN, URL hostN) {

	}

	public String spaceToPoint(String space) {
		StringBuffer point = new StringBuffer();
		for (int i = 0; i < space.length(); i++) {
			if (space.charAt(i) != ' ')
				point.append(space.charAt(i));
			else
				point.append('.');
		}
		return point.toString();
	}

	public String pointToSpace(String point) {
		StringBuffer space = new StringBuffer();
		for (int i = 0; i < point.length(); i++) {
			if (space.charAt(i) != '.')
				space.append(space.charAt(i));
			else
				space.append(' ');
		}
		return point.toString();
	}

	private class Installer {
		JLabel textNameS = new JLabel();
		public Installer(Main uip, Config config) {
			//installPane.setLayout(new BorderLayout());
			textNameS.setName("Host");
			uip.setTitle("Install DATABASE");
		}

	}

}
