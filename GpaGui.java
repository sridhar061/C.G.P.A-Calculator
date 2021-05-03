package Windows;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GpaGui {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField;
	private JTextField textField_14;
	private JTextField textField_15;
	private JLabel lblNewLabel_7;
	private JTextField textField_16;
	private JButton btnCalculateGpa;
	private JLabel lblNewLabel_8;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GpaGui window = new GpaGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GpaGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1244, 753);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GPA CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 57));
		lblNewLabel.setBounds(358, 10, 561, 65);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setBounds(45, 244, 157, 39);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_2.setColumns(10);
		textField_2.setBounds(45, 318, 157, 39);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_3.setColumns(10);
		textField_3.setBounds(45, 385, 157, 39);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_4.setColumns(10);
		textField_4.setBounds(45, 453, 157, 39);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_5.setColumns(10);
		textField_5.setBounds(45, 521, 157, 39);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_6.setColumns(10);
		textField_6.setBounds(45, 590, 157, 39);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(263, 102, 351, 53);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_8.setColumns(10);
		textField_8.setBounds(233, 244, 127, 39);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_9.setColumns(10);
		textField_9.setBounds(233, 318, 127, 39);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_10.setColumns(10);
		textField_10.setBounds(233, 385, 127, 39);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_11.setColumns(10);
		textField_11.setBounds(233, 453, 127, 39);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_12.setColumns(10);
		textField_12.setBounds(233, 521, 127, 39);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_13.setColumns(10);
		textField_13.setBounds(233, 590, 127, 39);
		frame.getContentPane().add(textField_13);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(634, 232, 69, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Your Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2.setBounds(27, 96, 191, 64);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Subject Names");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(49, 185, 125, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MARKS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_4.setBounds(268, 183, 69, 38);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Percentage");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_5.setBounds(596, 293, 122, 53);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("GRADE");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_6.setBounds(627, 376, 91, 28);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 21));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(778, 231, 122, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setText(" ");
		textField_14.setEditable(false);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 21));
		textField_14.setColumns(10);
		textField_14.setBounds(778, 299, 122, 40);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.BOLD, 21));
		textField_15.setColumns(10);
		textField_15.setBounds(778, 370, 122, 40);
		frame.getContentPane().add(textField_15);
		
		JButton btnNewButton = new JButton("Calculate TOTAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
			
				
	
			float subject1;

			try {
			      subject1=Integer.parseInt(textField_8.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject1 = 0;
			    }
			    	//textField_8.setText("Invalid input");}
				
			float subject2;

			try {
			      subject2=Integer.parseInt(textField_9.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject2 = 0;
			    }
			    	//textField_8.setText("Invalid input");}
			
			float subject3;

			try {
			      subject3=Integer.parseInt(textField_10.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject3 = 0;
			    }
			    	//textField_8.setText("Invalid input");}

			float subject4;

			try {
			      subject4=Integer.parseInt(textField_11.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject4 = 0;
			    }
			    	//textField_8.setText("Invalid input");}
			

			float subject5;

			try {
			      subject5=Integer.parseInt(textField_12.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject5 = 0;
			    }
			    	//textField_8.setText("Invalid input");}
			
			float subject6;

			try {
			      subject6=Integer.parseInt(textField_13.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject6 = 0;
			    }
			    	

				
				if(subject1 <= 100)
				{subject1= subject1;}
				else
				{subject1=100;}
				
				if(subject2 <= 100)
				{subject2= subject2;}
				else
				{subject2=100;}
				
				if(subject3 <= 100)
				{subject3= subject3;}
				else
				{subject3=100;}
				
				if(subject4 <= 100)
				{subject4= subject4;}
				else
				{subject4=100;}
				
				if(subject5 <= 100)
				{subject5= subject5;}
				else
				{subject5=100;}
				
				if(subject6 <= 100)
				{subject6= subject6;}
				else
				{subject6=100;}
			
			float total  = subject1+subject2+subject3+subject4+subject5+subject6;
			
			textField.setText(""+total);
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setBounds(661, 450, 258, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCalculatePercentage = new JButton("Calculate Percentage");
		btnCalculatePercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			Float total = Float.parseFloat(textField.getText());
			float per =  total / 6;
			int percentage = (int)(per);
			
			textField_14.setText(""+percentage);
			}
		});
		btnCalculatePercentage.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnCalculatePercentage.setBounds(657, 538, 267, 53);
		frame.getContentPane().add(btnCalculatePercentage);
		
		JButton btnCalculateGrade = new JButton("Calculate GRADE");
		btnCalculateGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			float percentage = Float.parseFloat(textField_14.getText());
			char grade ;
			
			if (percentage>=90)  
				{grade = 'A'; }
			
			else {
				
				
				if  (percentage>=80)
					{grade = 'B' ;} 
					
			   else {
			   
					if  (percentage>=70) 
						{grade = 'C'; }
					
					else {
						
						if  (percentage>=60) 
							{grade = 'D'; }
						
						else 
						{
							if  (percentage>=50) 
								{grade = 'E'; }
							else 
								
								{grade = 'F';}
							
						}}}}
			
			
			textField_15.setText(""+grade);
			}
			
			
			
		
			
		});
		btnCalculateGrade.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnCalculateGrade.setBounds(661, 618, 258, 53);
		frame.getContentPane().add(btnCalculateGrade);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				
			
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnClear.setBounds(38, 653, 157, 53);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		
			
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnExit.setBounds(219, 653, 146, 53);
		frame.getContentPane().add(btnExit);
		
		lblNewLabel_7 = new JLabel("GPA");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(1062, 220, 106, 84);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.BOLD, 26));
		textField_16.setEditable(false);
		textField_16.setBounds(1057, 323, 127, 46);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		btnCalculateGpa = new JButton("Calculate GPA");
		btnCalculateGpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			float gpa;
			
			
			float subject1;

			try {
			      subject1=Integer.parseInt(textField_8.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject1 = 0;
			    }
			    	//textField_8.setText("Invalid input");}
				
			float subject2;

			try {
			      subject2=Integer.parseInt(textField_9.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject2 = 0;
			    }
			    	//textField_8.setText("Invalid input");}
			
			float subject3;

			try {
			      subject3=Integer.parseInt(textField_10.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject3 = 0;
			    }
			    	//textField_8.setText("Invalid input");}

			float subject4;

			try {
			      subject4=Integer.parseInt(textField_11.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject4 = 0;
			    }
			    	
			

			float subject5;

			try {
			      subject5=Integer.parseInt(textField_12.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject5 = 0;
			    }
			    	
			
			float subject6;

			try {
			      subject6=Integer.parseInt(textField_13.getText());
			    }
			    catch(NumberFormatException e1){
			    	subject6 = 0;
			    }
			
			
			if(subject1 <= 100)
			{subject1= subject1;}
			else
			{subject1=100;}
			
			if(subject2 <= 100)
			{subject2= subject2;}
			else
			{subject2=100;}
			
			if(subject3 <= 100)
			{subject3= subject3;}
			else
			{subject3=100;}
			
			if(subject4 <= 100)
			{subject4= subject4;}
			else
			{subject4=100;}
			
			if(subject5 <= 100)
			{subject5= subject5;}
			else
			{subject5=100;}
			
			if(subject6 <= 100)
			{subject6= subject6;}
			else
			{subject6=100;}
			
			
		
			
			float credit1;

			try {
				credit1=Integer.parseInt(textField_17.getText());
			    }
			    catch(NumberFormatException e1){
			    	credit1 = 0;
			    }
			    	
			float credit2;

			try {
				credit2=Integer.parseInt(textField_18.getText());
			    }
			    catch(NumberFormatException e1){
			    	credit2 = 0;
			    }
			
			float credit3;

			try {
				credit3=Integer.parseInt(textField_19.getText());
			    }
			    catch(NumberFormatException e1){
			    	credit3 = 0;
			    }
			
			float credit4;

			try {
				credit4=Integer.parseInt(textField_20.getText());
			    }
			    catch(NumberFormatException e1){
			    	credit4 = 0;
			    }
			
			float credit5;

			try {
				credit5=Integer.parseInt(textField_21.getText());
			    }
			    catch(NumberFormatException e1){
			    	credit5 = 0;
			    }
				
			
			float credit6;

			try {
				credit6=Integer.parseInt(textField_22.getText());
			    }
			    catch(NumberFormatException e1){
			    	credit6 = 0;
			    }
		
			
			
			if(credit1 <= 10)
			{credit1= credit1;}
			else
			{credit1=10;}
			
			if(credit2 <= 10)
			{credit2= credit2;}
			else
			{credit2=10;}
			
			if(credit3 <= 10)
			{credit3= credit3;}
			else
			{credit3=10;}
			
			if(credit4 <= 10)
			{credit4= credit4;}
			else
			{credit4=10;}
			
			if(credit5 <= 10)
			{credit5= credit5;}
			else
			{credit5=10;}
			
			if(credit6 <= 10)
			{credit6= credit6;}
			else
			{credit6=10;}
			
			
			
			
			
		
		int points;
		int points2;
		int points3;
		int points4;
		int points5;
		int points6;
			
			if (subject1>=90)  
				{points = 10; }
			
			else {
				
				
				if  (subject1>=80)
					{points = 9 ;} 
					
			   else {
			   
					if  (subject1>=70) 
						{points = 8; }
					
					else {
						
						if  (subject1>=60) 
							{points = 7; }
						
						else 
						{
							if  (subject1>=50) 
								{points = 6; }
							else 
								
								{points = 0;}
							
						}}}}
			
			

			if (subject2>=90)  
				{points2 = 10; }
			
			else {
				
				
				if  (subject2>=80)
					{points2 = 9 ;} 
					
			   else {
			   
					if  (subject2>=70) 
						{points2 = 8; }
					
					else {
						
						if  (subject2>=60) 
							{points2 = 7; }
						
						else 
						{
							if  (subject2>=50) 
								{points2 = 6; }
							else 
								
								{points2 = 0;}
							
						}}}}
			

			if (subject3>=90)  
				{points3 = 10; }
			
			else {
				
				
				if  (subject3>=80)
					{points3 = 9 ;} 
					
			   else {
			   
					if  (subject3>=70) 
						{points3 = 8; }
					
					else {
						
						if  (subject3>=60) 
							{points3 = 7; }
						
						else 
						{
							if  (subject3>=50) 
								{points3 = 6; }
							else 
								
								{points3 = 0;}
							
						}}}}
			

			if (subject4>=90)  
				{points4 = 10; }
			
			else {
				
				
				if  (subject4>=80)
					{points4 = 9 ;} 
					
			   else {
			   
					if  (subject4>=70) 
						{points4 = 8; }
					
					else {
						
						if  (subject4>=60) 
							{points4 = 7; }
						
						else 
						{
							if  (subject4>=50) 
								{points4 = 6; }
							else 
								
								{points4 = 0;}
							
						}}}}
			

			if (subject5>=90)  
				{points5 = 10; }
			
			else {
				
				
				if  (subject5>=80)
					{points5 = 9 ;} 
					
			   else {
			   
					if  (subject5>=70) 
						{points5 = 8; }
					
					else {
						
						if  (subject5>=60) 
							{points5 = 7; }
						
						else 
						{
							if  (subject5>=50) 
								{points5 = 6; }
							else 
								
								{points5 = 0;}
							
						}}}}
			

			if (subject6>=90)  
				{points6 = 10; }
			
			else {
				
				
				if  (subject6>=80)
					{points6 = 9 ;} 
					
			   else {
			   
					if  (subject6>=70) 
						{points6 = 8; }
					
					else {
						
						if  (subject6>=60) 
							{points6 = 7; }
						
						else 
						{
							if  (subject6>=50) 
								{points6 = 6; }
							else 
								
								{points6 = 0;}
							
						}}}}
			
			float up = ((points*credit1) + (points2*credit2) + (points3*credit3) + (points4*credit4) + (points5*credit5) + (points6*credit6));
			float down = credit1+credit2+credit3+credit4+credit5+credit6;
			gpa = up/down;
			textField_16.setText(String.format(" %.3f", gpa));
		
			}
		});
		btnCalculateGpa.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnCalculateGpa.setBounds(959, 538, 250, 53);
		frame.getContentPane().add(btnCalculateGpa);
		
		lblNewLabel_8 = new JLabel("CREDITS");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_8.setBounds(425, 188, 83, 25);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_17.setColumns(10);
		textField_17.setBounds(408, 244, 127, 39);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_18.setColumns(10);
		textField_18.setBounds(408, 318, 127, 39);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_19.setColumns(10);
		textField_19.setBounds(408, 385, 127, 39);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_20.setColumns(10);
		textField_20.setBounds(408, 453, 127, 39);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_21.setColumns(10);
		textField_21.setBounds(408, 521, 127, 39);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_22.setColumns(10);
		textField_22.setBounds(408, 590, 127, 39);
		frame.getContentPane().add(textField_22);
	}
}