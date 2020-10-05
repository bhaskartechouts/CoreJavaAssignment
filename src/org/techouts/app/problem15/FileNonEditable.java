package org.techouts.app.problem15;

import java.awt.FlowLayout;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class FileNonEditable extends JFrame {

	private static final long serialVersionUID = 1L;
	private static List<Employee> list = new LinkedList<Employee>();
    private static Scanner scanner = new Scanner(System.in);
	public FileNonEditable() {

		this.getContentPane().setLayout(new FlowLayout());

		JTextField field ;
		employee();
		
		for(Employee emp : list) {
			field = new JTextField();
			String str = emp+"";
			field.setText(str);
			field.setEditable(false);

			add(field);
		}
		scanner.close();
	}

	private static void createAndShowGUI() {


		JFrame frame = new FileNonEditable();


		frame.pack();

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	private static void employee() {
		System.out.println("Enter Employee ID : ");
		String id = scanner.next();
		System.out.println("Enter Employee Name : ");
		String name = scanner.next();
		System.out.println("Enter Employee MailID : ");
		String mailId = scanner.next();
		Employee employee = new Employee(id, name, mailId);
		list.add(employee);
		System.out.println("If You Want Continue Enter Y or Terminated Enter N ");
		char ch = scanner.next().charAt(0);
		if(ch == 'Y' || ch == 'y') {
			employee();
		}
	}

	public static void main(String[] args) {


		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				createAndShowGUI(); 

			}

		});
	}

}