// This file is part of MicropolisJ.
// Copyright (C) 2013 Jason Long
// Portions Copyright (C) 1989-2007 Electronic Arts Inc.
//
// MicropolisJ is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package micropolisj.gui;

import java.util.*;
import javax.swing.*;
import javax.swing.text.*;

import micropolisj.engine.*;

public class MessagesPane extends JTextPane
{
	static ResourceBundle cityMessageStrings = ResourceBundle.getBundle("micropolisj.CityMessages");
	public static int touristCash; //Holds variable for the exact amount of money obtained from tourism function

	public MessagesPane()
	{
		setEditable(false);
	}

	public void appendCityMessage(MicropolisMessage message)
	{
		if (message.name() == "TOURISTS_VISIT"){
			String cash = Integer.toString(touristCash);
			String notif = cityMessageStrings.getString(message.name());
			notif = notif.replace("cash", cash); //replace the placeholder word 'cash' in the message string with the exact amount of money
			appendMessageText(notif);
		}
		else{
			appendMessageText(cityMessageStrings.getString(message.name()));
		}
	}

	void appendMessageText(String messageText)
	{
		try {
			StyledDocument doc = getStyledDocument();
			if (doc.getLength() != 0) {
				doc.insertString(doc.getLength(), "\n", null);
			}
			doc.insertString(doc.getLength(), messageText, null);
		}
		catch (BadLocationException e) {
			throw new Error("unexpected", e);
		}
	}
}
