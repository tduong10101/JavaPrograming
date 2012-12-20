package jApplet;
import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JApplet {
	Container con = getContentPane();
	JLabel greeting = new JLabel ("Hello World!");
	Font healineFont = new Font("Planet Kosmos", Font.BOLD, 36);
	JTextField anwser = new JTextField(10);
	public void init(){
		greeting.setFont(healineFont);
		con.add(greeting);
		con.add(anwser);
		con.setLayout(new FlowLayout());
		
	}
	
}
