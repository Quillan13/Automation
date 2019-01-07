package autoPack;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;


public class Frame {

	public static void main(String[] args) throws InterruptedException {

		JFrame frame = new JFrame("My Apps");
		try { 
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		    e.printStackTrace();
		}
	//button
		JButton button = new JButton("OpenAir");
		button.setBounds(0,0,140,40);
		button.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					OpenAir oa = new OpenAir();
					oa.openAir();
				}
			});
	//button
		JButton button1 = new JButton("eCampus");
		button1.setBounds(140,0,140,40);
		button1.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					Ecampus ec = new Ecampus();
					ec.eCampus();
				}
			});		
	//button
		JButton button2 = new JButton("NetSuite");
		button2.setBounds(280,0,140,40);
		button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				Netsuite ns = new Netsuite();
				ns.netSuite();
			}
		});	
	//button
		JButton button3 = new JButton("test");
		button3.setBounds(0,40,140,40);
		//needs listener
		
		
	//button
		JButton button4 = new JButton("blank");
		button4.setBounds(140,40,140,40);
		//needs listener
		
		
	//button
		JButton button5 = new JButton("blank");
		button5.setBounds(280,40,140,40);
		//needs listener
		
		
	//button
		JButton button6 = new JButton("blank");
		button6.setBounds(0,80,140,40);
		//needs listener
		
		
	//button
		JButton button7 = new JButton("blank");
		button7.setBounds(140,80,140,40);
		//needs listener
		
		
	//button
		JButton button8 = new JButton("blank");
		button8.setBounds(280,80,140,40);
		//needs listener
		
		
									
		frame.getContentPane().setLayout(new FlowLayout());
	//add buttons to frame
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		
		frame.setSize(435,160);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		
		
	}

	

}
