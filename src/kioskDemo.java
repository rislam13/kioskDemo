import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class kioskDemo extends JFrame
{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**
		 * 
		 */
		double total = 0.0;
		private JTextField textField_1;
		private JTextField textField_2;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args)
		{
			kioskDemo frame = new kioskDemo();
			frame.setVisible(true);
		}

		/**
		 * Create the frame.
		 */
		public kioskDemo() 
		{
			// Frame title
			setTitle("--- Food Truck Kiosk ---");
			
			NumberFormat formatter = new DecimalFormat("#0.00");
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// size of the frame
			setSize(975,800);
			
			// panel title
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new TitledBorder(new EtchedBorder(), 
					              "Display Area - Food Truck #1"));;
			setContentPane(contentPane);
			
			
			// list of items that are being bought
			JTextArea textArea = new JTextArea();
			textArea.setBounds(763, 11, 168, 382);
			textArea.setEditable(false);
			

			contentPane.add(textArea);
			
			// field where total accumulating price is being displayed
			JTextField textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(807, 420, 124, 34);
			contentPane.add(textField);
			textField.setColumns(10);
						
			// Orange Button
			JButton btnNewButton = new JButton("Oranges");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Oranges         .59\r\n");
					total = total + .59;
					
					textField.setText(formatter.format(total));
					textField.repaint();
				}
			});
			btnNewButton.setIcon(new ImageIcon("res/Kiosk-Oranges.jpg"));
			btnNewButton.setBounds(22, 28, 219, 256);
			contentPane.add(btnNewButton);
			
			// Apple Button
			JButton btnNewButton_1 = new JButton("Apples");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					textArea.append("Apples          .49\r\n");
					total = total + .49;
					
					textField.setText(formatter.format(total));
					textArea.repaint();
				}
			});
			btnNewButton_1.setIcon(new ImageIcon("res/Kiosk-Apples.jpg"));
			btnNewButton_1.setBounds(22, 329, 219, 243);
			contentPane.add(btnNewButton_1);
			
			// Pear Button
			JButton btnNewButton_2 = new JButton("Pears");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Pears           .39\r\n");
					total = total + .39;
					
					textField.setText(formatter.format(total));
					textArea.repaint();
				}
			});
			btnNewButton_2.setIcon(new ImageIcon("res/Kiosk-Pears.jpg"));
			btnNewButton_2.setBounds(272, 28, 187, 256);
			contentPane.add(btnNewButton_2);
			
			// Grape Button
			JButton btnNewButton_4 = new JButton("Grapes");
			btnNewButton_4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) 
				{
					textArea.append("Grapes           .89\r\n");
					total = total + .89;
										
					textField.setText(formatter.format(total));
					textArea.repaint();
				}
			});
			btnNewButton_4.setIcon(new ImageIcon("res/Kiosk-Grapes.jpg"));
			btnNewButton_4.setBounds(272, 329, 187, 243);
			contentPane.add(btnNewButton_4);
			
			
			
			
			JLabel lblNewLabel = new JLabel("    Total Price   $");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(697, 424, 100, 23);
			contentPane.add(lblNewLabel);
			
			
			
			// EXIT Button
			JButton btnNewButton_3 = new JButton("EXIT");
			btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					System.exit(0);	
				}
			});
			btnNewButton_3.setBounds(449, 700, 133, 34);
			contentPane.add(btnNewButton_3);
			
			
			// labels for each product button
			JLabel lblNewLabel_1 = new JLabel("Click for Oranges : .59 each");
			lblNewLabel_1.setBounds(39, 295, 194, 14);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Click for Pears : .39 each");
			lblNewLabel_2.setBounds(282, 295, 177, 14);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Click for Apples : .49 each");
			lblNewLabel_3.setBounds(39, 583, 202, 14);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Click for Grapes : .89 each");
			lblNewLabel_4.setBounds(272, 583, 187, 14);
			contentPane.add(lblNewLabel_4);
		
			
			// user will do the layout
			contentPane.setLayout(null);
			
			JLabel label = new JLabel("    Cash   $");
			label.setFont(new Font("Tahoma", Font.PLAIN, 14));
			label.setBounds(697, 459, 100, 23);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("    Change   $");
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			label_1.setBounds(697, 490, 100, 23);
			contentPane.add(label_1);
			
			JButton btnSumbit = new JButton("Sumbit");
			btnSumbit.setBounds(767, 543, 117, 29);
			contentPane.add(btnSumbit);
			
			textField_1 = new JTextField();
			textField_1.setBounds(807, 458, 124, 34);
			contentPane.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(807, 489, 124, 34);
			textField_2.setEditable(false);
			contentPane.add(textField_2);
			
			JButton btnPomegrate = new JButton("Pomegrate");
			btnPomegrate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.append("Pomegrante           .95\r\n");
					total = total + .95;
										
					textField.setText(formatter.format(total));
					textArea.repaint();
				}
			});
			btnPomegrate.setBounds(486, 28, 187, 256);
			btnPomegrate.setIcon(new ImageIcon("res/pomegranate.jpg"));
			contentPane.add(btnPomegrate);
			
			JButton btnStrawberry = new JButton("Strawberry");
			btnStrawberry.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.append("Strawberry           .85\r\n");
					total = total + .85;
										
					textField.setText(formatter.format(total));
					textArea.repaint();
				}
			});
			btnStrawberry.setBounds(486, 329, 187, 243);
			btnStrawberry.setIcon(new ImageIcon("res/Strawberry.jpg"));
			contentPane.add(btnStrawberry);
			
			JLabel label_2 = new JLabel("Click for Pomegrante : .95 each");
			label_2.setBounds(496, 294, 177, 14);
			contentPane.add(label_2);
			
			JLabel label_3 = new JLabel("Click for Strawberry : .85 each");
			label_3.setBounds(496, 582, 177, 14);
			contentPane.add(label_3);
			
		
			btnSumbit.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{	double a = Double.parseDouble(textField_1.getText());
					double b = a - total;
					
					textField_2.setText(formatter.format(b));
					textArea.repaint();
						
				}
			
			});
			
		
			// position frame in the middle of the screen
			this.setLocationRelativeTo(null);
		}
}