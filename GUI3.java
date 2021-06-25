import java.awt.*;
import java.awt.event.*;

class MarvellousListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}

class MarvellousActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Button clicked");
	}
}
class FirstWindow
{
	public Frame fobj;
	public FirstWindow()
	{
		fobj = new Frame("Marvellous Infosystems");    // Frame is like dish
		Button bobj1 = new Button("Login");
		Button bobj2 = new Button("Cancel");

		Label lobj = new Label("Marvellous Login Portal");
		Label username = new Label("Username");
		Label password = new Label("Password");

		TextField ut = new TextField("Enter your username");
		TextField pt = new TextField("Enter your password");

// setBounds() is used to display ie set coordinates
// (ie. window varti kute kay display karyche / Frame made kute kay thevycha )
		lobj.setBounds(70,30,300,30);       
		username.setBounds(20,80,80,30);
		ut.setBounds(110,80,150,30);
		password.setBounds(20,120,80,30);
		pt.setBounds(110,120,150,30);
		bobj1.setBounds(70,170,80,30);   // x y w h    button size
		bobj2.setBounds(160,170,80,30);
		fobj.add(bobj1);          // dish made button add karyche
		fobj.add(bobj2);
		fobj.add(lobj);
		fobj.add(username);
		fobj.add(password);
		fobj.add(ut);
		fobj.add(pt);
		fobj.setSize(350,250);   // frame size set karychi
		bobj1.addActionListener(new MarvellousActionListener());
		fobj.setLayout(null);
		fobj.setVisible(true);
		fobj.addWindowListener(new MarvellousListener());
	}
	
}
class GUI3
{
	public static void main(String arg[])
	{
		FirstWindow obj = new FirstWindow();
	}
}