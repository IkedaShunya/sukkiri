package gui.JLabel.sample02;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SampleWindow extends JFrame {
	public SampleWindow(String title){
		super( title ) ;
		setSize( 200, 150 ) ;
		Container cntr = this.getContentPane();
		JLabel imgLbl =
				new JLabel( new ImageIcon( "./img/Neru_32x32.gif") ) ;
		cntr.add( imgLbl ) ;
		pack();
	}
}

