import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;


public class MainFrame extends JFrame {
	
	public static ArrayList<FinalProjectObject> finalp = new ArrayList<>();
	
	public static ArrayList<FinalProjectObject> finalpt = new ArrayList<>();
	
	public static String type = "";
	
	public static String real2 = "";
	
	public static int k = 4;
	
	public static int z = 0;
	
	public static int y = 31;
	
	public static String there = "";

	private JPanel contentPane;
	private JButton yes;
	private JButton no;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	    }

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		
		finalpt = returnATS();
		
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton yesbutton1_4 = new JButton("Start");
		yesbutton1_4.setForeground(Color.RED);
		JButton yesbutton1 = new JButton("Yes");
		yesbutton1.setForeground(Color.RED);
		JLabel gamelabel1 = new JLabel("How well do you know our class?");
		gamelabel1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		gamelabel1.setForeground(Color.RED);
		JLabel akinlabel1 = new JLabel("Do you want to play Akinator?");
		akinlabel1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		akinlabel1.setForeground(Color.RED);
		JLabel titlelabel = new JLabel("Welcome To Akinator!");
		titlelabel.setForeground(Color.RED);
		JLabel lblNewLabel_4 = new JLabel("");
		JLabel lblNewLabel_6 = new JLabel("Additonal Info: ");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setVisible(false);
		JButton btnNewButton = new JButton("Get Hint");
		btnNewButton.setVisible(false);
		JButton btnNewButton_1 = new JButton("Reset People");
		btnNewButton_1.setVisible(false);
		JLabel lblNewLabel_7 = new JLabel("People left: 31");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		JButton btnNewButton_2 = new JButton("Skip Person");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setVisible(false);
	   
		JLabel lblNewLabel = new JLabel("Eyes");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(190, 74, 92, 16);
		contentPane.add(lblNewLabel);
		lblNewLabel.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("Hair");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(285, 74, 92, 16);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("Height");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(190, 102, 229, 16);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("Glasses");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(185, 89, 92, 16);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		
		yesbutton1.setVisible(false);
		yesbutton1.setBounds(190, 158, 92, 90);
		yes = yesbutton1;
		contentPane.add(yesbutton1);
		JLabel akinlabel = new JLabel("Do you want to play Akinator?");
		akinlabel.setForeground(Color.RED);
		akinlabel.setVisible(false);
		akinlabel.setBounds(-6, 188, 450, 90);
		contentPane.add(akinlabel);
		JButton startbutton1 = new JButton("Start");
		startbutton1.setForeground(Color.RED);
		startbutton1.setBackground(Color.WHITE);
		JButton nobutton1 = new JButton("No\n");
		nobutton1.setForeground(Color.RED);
		ArrayList<String> options = new ArrayList<>();
		ArrayList<String> options2 = new ArrayList<>();
	    options.add("eye");
	    options.add("hair");
	    options.add("glasses");
	    options.add("heights");
	    finalp = returnATS();
	    
		yesbutton1.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
			if (e.getSource() == yes) {
			   if (finalp.size() == 2 && options.size() == 0) {
						akinlabel.setText("Hi, " + finalp.get(0).getName());
						finalp = returnATS();
					    options.add("eye");
					    options.add("hair");
					    options.add("glasses");
					    options.add("heights");
					    startbutton1.setText("Play Again?");
					    startbutton1.setVisible(true);
					    nobutton1.setVisible(false);
					    yesbutton1.setVisible(false);				      
				    	 }

			  else {
		      for (int i = 0; i < options.size(); i++) {
		        if (options.get(i).equals(type)) {
		          options.remove(i);
		          i--;
		        }
		      }
		      if (type.equals("glasses")) {
		      finalp = returnA("yes", type, finalp);
		        }
		      else {
		        finalp = returnA(real2, type , finalp);
		      }
		     if (finalp.size() == 1) {
			 akinlabel.setText("Hi, " + finalp.get(0).getName());
			 finalp = returnATS();
			 options.add("eye");
			 options.add("hair");
			 options.add("glasses");
			 options.add("heights");
			 startbutton1.setText("Play Again?");
			 startbutton1.setVisible(true);
			 nobutton1.setVisible(false);
			 yesbutton1.setVisible(false);
		     }

		     else {
			     if (finalp.size() == 2 && options.size() == 0) {
			     akinlabel.setText(irregular(finalp.get(0).getName()));
			     }
			    else {
		    	k--;
				int r = randNum(k);
			    type = options.get(r);
			    real2 = iterate(finalp, type);
				String real3 = iterate2(finalp, type);
				akinlabel.setText(real3);	
			     }
		     }
			}
		  }
			}
		});
		nobutton1.setVisible(false);
		nobutton1.setBounds(313, 161, 100, 84);
		no = nobutton1;
		nobutton1.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == no) {
					   if (finalp.size() == 2 && options.size() == 0) {
							akinlabel.setText("Hi, " + finalp.get(1).getName());
							finalp = returnATS();
						    options.add("eye");
						    options.add("hair");
						    options.add("glasses");
						    options.add("heights");
						    startbutton1.setText("Play Again?");
						    startbutton1.setVisible(true);
						    nobutton1.setVisible(false);
						    yesbutton1.setVisible(false);				      
					    	 }
					   else {
			      if (type.equals("glasses")) {
			          for (int m = 0; m < options.size(); m++) {
			            if (options.get(m).equals(type)) {
			              options.remove(m);
			              m--;
			            }
			          }
			          finalp = returnAT("yes", type, finalp);
			          k--;
			          }
			          else {
			            finalp = returnAT(real2, type, finalp);
			          }
				     if (finalp.size() == 1) {
						akinlabel.setText("Hi, " + finalp.get(0).getName());
						finalp = returnATS();
					    options.add("eye");
					    options.add("hair");
					    options.add("glasses");
					    options.add("heights");
					    startbutton1.setText("Play Again?");
					    startbutton1.setVisible(true);
					    nobutton1.setVisible(false);
					    yesbutton1.setVisible(false);
					    
					}
				     
				     else {
					     if (finalp.size() == 2 && options.size() == 0) {
						     akinlabel.setText(irregular(finalp.get(0).getName()));
						     }
						    else {
							int r = randNum(k);
						    type = options.get(r);
						    real2 = iterate(finalp, type);
							String real3 = iterate2(finalp, type);
							akinlabel.setText(real3);	
						     }
				     }
					   }
				}
			}
		});
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_5.setForeground(Color.RED);
		contentPane.add(nobutton1);
		btnNewButton.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_5.setVisible(true);
				lblNewLabel_5.setText("The first letter of their name is " + there.substring(0, 1));
				}
			});
		JButton yesbutton1_3 = new JButton("Back To Home");
		yesbutton1_3.setForeground(Color.RED);
		startbutton1.setBounds(59, 102, 151, 67);
		startbutton1.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == startbutton1) {
					
					k = 4;
				    int r = randNum(k);
					options.add(0, "eye");
					options.add(1, "hair");
					options.add(2, "glasses");
					options.add(3, "heights");
				    type = options.get(r);
					real2 = iterate(finalp, type);
					String real3 = iterate2(finalp, type);
					akinlabel.setText(real3);
					startbutton1.setVisible(false);
					yesbutton1.setVisible(true);
					nobutton1.setVisible(true);
					yesbutton1_3.setVisible(true);
					akinlabel.setVisible(true);
					gamelabel1.setVisible(false);
					akinlabel1.setVisible(false);
					yesbutton1_4.setVisible(false);
					akinlabel.setBounds(200, 78, 450, 90);
					titlelabel.setBounds(190, 73, 289, 16);
					startbutton1.setBounds(235, 170, 151, 67);
					lblNewLabel.setVisible(false);
					lblNewLabel_1.setVisible(false);
					lblNewLabel_2.setVisible(false);
					lblNewLabel_3.setVisible(false);
					lblNewLabel_4.setVisible(true);
					lblNewLabel_5.setVisible(false);
					titlelabel.setText("Let's guess you!");
					
				}
				
			}
		});
		contentPane.add(startbutton1);
		
		titlelabel.setBackground(new Color(238, 238, 238));
		titlelabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titlelabel.setBounds(124, 27, 289, 16);
		contentPane.add(titlelabel);
		
		yesbutton1_3.setVisible(false);
		yesbutton1_3.setBounds(6, 6, 117, 63);
		contentPane.add(yesbutton1_3);
		
		yesbutton1_4.setBounds(264, 102, 138, 67);
		contentPane.add(yesbutton1_4);
		
		akinlabel1.setBounds(16, 74, 211, 16);
		contentPane.add(akinlabel1);
		

		gamelabel1.setBounds(231, 74, 225, 16);
		contentPane.add(gamelabel1);
		
		textField = new JTextField();
		textField.setBounds(236, 189, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setBounds(16, 75, 162, 173);
		contentPane.add(lblNewLabel_4);
		textField.setVisible(false);

		
		yesbutton1_4.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == yesbutton1_4) {
					
					startbutton1.setVisible(false);
					yesbutton1.setVisible(false);
					nobutton1.setVisible(false);
					yesbutton1_3.setVisible(true);
					yesbutton1_4.setVisible(false);
					akinlabel1.setVisible(false);
					akinlabel.setVisible(false);
					gamelabel1.setVisible(false);
					textField.setVisible(true);
					textField.setText("");
					titlelabel.setBounds(188, 46, 289, 16);
					int r = randNum(y);
					lblNewLabel.setText("Eyes: " + finalpt.get(r).getEye().toLowerCase());
					lblNewLabel.setVisible(true);
					lblNewLabel_1.setText(" Hair: " + finalpt.get(r).getHair().toLowerCase());
					lblNewLabel_1.setVisible(true);
					lblNewLabel_2.setText("Height: " + finalpt.get(r).getHeights().substring(
					finalpt.get(r).getHeights().indexOf('t') + 2, finalpt.get(r).getHeights().length() - 1));
					lblNewLabel_2.setVisible(true);
					lblNewLabel_3.setText(" Glasses: " + finalpt.get(r).getGlasses());
					lblNewLabel_3.setVisible(true);
					there = finalpt.get(r).getName();
					lblNewLabel_4.setVisible(true);
					btnNewButton.setVisible(true);
					lblNewLabel_7.setVisible(true);
					btnNewButton_1.setVisible(true);
					btnNewButton_2.setVisible(true);
					if (irregular3(there)) {
						lblNewLabel_6.setText("Additional Information: " + irregular2(there));
						lblNewLabel_6.setVisible(true);
					}
					else {
						lblNewLabel_6.setVisible(false);
					}
					titlelabel.setText("Guess The Person!");
				
				}
			}
		});
		
		
		textField.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if (there.toLowerCase().substring(0, there.indexOf(" ")).equals(textField.getText().toLowerCase())) {
					lblNewLabel_5.setVisible(true);
					lblNewLabel_5.setText("You got it!");
					btnNewButton_2.setText("Next Person");
					y--;
					finalpt = returnATSS(finalpt, there);
				}
				else if (there.toLowerCase().equals(textField.getText().toLowerCase())) {
					lblNewLabel_5.setVisible(true);
					lblNewLabel_5.setText("You got it!");
					btnNewButton_2.setText("Next Person");
					y--;
					finalpt = returnATSS(finalpt, there);
				}
				else {
					lblNewLabel_5.setVisible(true);
					lblNewLabel_5.setText("That's wrong!");
				}
				lblNewLabel_7.setText("People left: " + finalpt.size());
			}
		});
	
		Image img = new ImageIcon(this.getClass().getResource("Screen Shot 2022-06-03 at 8.29.41 AM.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img));
		
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setBounds(219, 227, 225, 16);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6.setBounds(190, 117, 254, 16);
		contentPane.add(lblNewLabel_6);
		
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(302, 145, 117, 29);
		contentPane.add(btnNewButton);
		
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(190, 145, 117, 29);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_7.setVisible(false);
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setBounds(326, 16, 130, 16);
		contentPane.add(lblNewLabel_7);
		
		btnNewButton_2.setBounds(323, 243, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(26, 0, 462, 279);
		contentPane.add(lblNewLabel_8);
		Image img1 = new ImageIcon(this.getClass().getResource("Screen Shot 2022-06-02 at 5.42.41 PM.png")).getImage();
		lblNewLabel_8.setIcon(new ImageIcon(img1));
		
		yesbutton1_3.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == yesbutton1_3) {
					
					finalp = returnATS();
					startbutton1.setVisible(true);
					yesbutton1_4.setVisible(true);
					yesbutton1.setVisible(false);
					nobutton1.setVisible(false);
					yesbutton1_3.setVisible(false);
					akinlabel1.setVisible(true);
					akinlabel.setVisible(false);
					gamelabel1.setVisible(true);
					textField.setVisible(false);
					lblNewLabel.setVisible(false);
					lblNewLabel_1.setVisible(false);
					lblNewLabel_2.setVisible(false);
					lblNewLabel_3.setVisible(false);
					titlelabel.setBounds(124, 27, 289, 16);
					akinlabel.setText("Do you want to play Akinator?");
					startbutton1.setText("Start");
					startbutton1.setBounds(59, 102, 151, 67);
					lblNewLabel_4.setVisible(false);
					lblNewLabel_5.setVisible(false);
					lblNewLabel_6.setVisible(false);
					btnNewButton.setVisible(false);
					lblNewLabel_7.setVisible(false);
					btnNewButton_1.setVisible(false);
					btnNewButton_2.setVisible(false);
					titlelabel.setText("Welcome To Akinator!");
					
				}
			}
		});
		btnNewButton_1.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				finalpt = returnATS();
				lblNewLabel_7.setText("People left: " + finalpt.size());
				btnNewButton_2.setText("Skip Person");
				there = "";
				y = 31;
				finalpt = returnATSS(finalpt, there);
				if (finalpt.size() == 0) {
					finalpt = returnATS();
				}
				lblNewLabel_7.setText("People left: " + finalpt.size());
				int r = randNum(y);
				lblNewLabel.setText("Eyes: " + finalpt.get(r).getEye().toLowerCase());
				lblNewLabel.setVisible(true);
				lblNewLabel_1.setText(" Hair: " + finalpt.get(r).getHair().toLowerCase());
				lblNewLabel_1.setVisible(true);
				lblNewLabel_2.setText("Height: " + finalpt.get(r).getHeights().substring(
				finalpt.get(r).getHeights().indexOf('t') + 2, finalpt.get(r).getHeights().length() - 1));
				lblNewLabel_2.setVisible(true);
				lblNewLabel_3.setText(" Glasses: " + finalpt.get(r).getGlasses());
				lblNewLabel_3.setVisible(true);
				there = finalpt.get(r).getName();
				if (irregular3(there)) {
					lblNewLabel_6.setText("Additional Information: " + irregular2(there));
					lblNewLabel_6.setVisible(true);
				}
				else {
					lblNewLabel_6.setVisible(false);
				}
				textField.setText("");
				lblNewLabel_5.setText("");
			}
		});
		
		btnNewButton_2.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if (!btnNewButton_2.getText().equals("Next Person")) {
					lblNewLabel_5.setVisible(true);
					lblNewLabel_5.setText("That person was " + there);
					y--;
				}
				else {
					lblNewLabel_5.setText("");
				}
				btnNewButton_2.setText("Skip Person");
				finalpt = returnATSS(finalpt, there);
				if (finalpt.size() == 0) {
					finalpt = returnATS();
					y = 31;
				}
				lblNewLabel_7.setText("People left: " + finalpt.size());
				int r = randNum(y);
				lblNewLabel.setText("Eyes: " + finalpt.get(r).getEye().toLowerCase());
				lblNewLabel.setVisible(true);
				lblNewLabel_1.setText(" Hair: " + finalpt.get(r).getHair().toLowerCase());
				lblNewLabel_1.setVisible(true);
				lblNewLabel_2.setText("Height: " + finalpt.get(r).getHeights().substring(
				finalpt.get(r).getHeights().indexOf('t') + 2, finalpt.get(r).getHeights().length() - 1));
				lblNewLabel_2.setVisible(true);
				lblNewLabel_3.setText(" Glasses: " + finalpt.get(r).getGlasses());
				lblNewLabel_3.setVisible(true);
				there = finalpt.get(r).getName();
				if (irregular3(there)) {
					lblNewLabel_6.setText("Additional Information: " + irregular2(there));
					lblNewLabel_6.setVisible(true);
				}
				else {
					lblNewLabel_6.setVisible(false);
				}
				textField.setText("");
			}
		}); 
		
	}
public static int randNum(int i) {
		int r = (int) (Math.random() * i);
		return r;
	}
public static String iterate(ArrayList<FinalProjectObject> obj, String name) {
		int i = 0;
		String real = "";
			if (name.equals("eye")) {
      real = obj.get(i).getEye();
			}
			else if (name.equals("hair")) {
      real = obj.get(i).getHair();
			}
       else if (name.equals("glasses")) {
      real = obj.get(i).getGlasses();
			}
      else if (name.equals("heights")) {
      real = obj.get(i).getHeights();
			}
			return real;
   }
public static String iterate2(ArrayList<FinalProjectObject> obj, String name) {
	int i = 0;
	String real = "";
		if (name.equals("eye")) {
  real = "Are your eyes " + obj.get(i).getEye().toLowerCase() + "?";
		}
		else if (name.equals("hair")) {
  real = "Is your hair " + obj.get(i).getHair().toLowerCase() + "?";
		}
   else if (name.equals("glasses")) {
  real = "Do you have glasses?";
		}
  else if (name.equals("heights")) {
  real = obj.get(i).getHeights();
		}
		return real;
}
public static ArrayList<FinalProjectObject> returnA (String real, String name, ArrayList<FinalProjectObject> obj) {
		for (int j = 0; j < obj.size(); j++) {
			if (name.equals("eye")) {
				if (!obj.get(j).getEye().toUpperCase().equals(real.toUpperCase())) {
					obj.remove(j);
					j--;
				}
			}
			else if (name.equals("hair")) {
				if (!obj.get(j).getHair().toUpperCase().equals(real.toUpperCase())) {
					obj.remove(j);
					j--;
				}
			}
      else if (name.equals("glasses")) {
        if (!obj.get(j).getGlasses().toUpperCase().equals(real.toUpperCase()))
        {
          obj.remove(j);
					j--;
        }
      }
    else if (name.equals("heights")) {
        if (!obj.get(j).getHeights().toUpperCase().equals(real.toUpperCase()))
        {
          obj.remove(j);
					j--;
        }
      }
		 }
		return obj;
	}
public static ArrayList<FinalProjectObject> returnAT (String real, String name, ArrayList<FinalProjectObject> obj) {
		for (int j = 0; j < obj.size(); j++) {
			if (name.equals("eye")) {
				if (obj.get(j).getEye().toUpperCase().equals(real.toUpperCase())) {
					obj.remove(j);
					j--;
				}
			}
			else if (name.equals("hair")) {
				if (obj.get(j).getHair().toUpperCase().equals(real.toUpperCase())) {
					obj.remove(j);
					j--;
				}
			}
    else if (name.equals("glasses")) {
        if (obj.get(j).getGlasses().toUpperCase().equals(real.toUpperCase()))
        {
          obj.remove(j);
					j--;
        }
      }
     else if (name.equals("heights")) {
        if (obj.get(j).getHeights().toUpperCase().equals(real.toUpperCase()))
        {
          obj.remove(j);
					j--;
        }
      }
		 }
		return obj;
	}
public static ArrayList<FinalProjectObject> returnATS () {
    ArrayList<FinalProjectObject> finalp = new ArrayList<>();
    String[] eye = importFile("eye.txt");
    String[] glasses = importFile("glasses.txt");
    String[] hair = importFile("hair.txt");
    String[] name = importFile("name.txt");
    String[] heights = importFile("heights.txt");
    String[] gender = importFile("gender.txt");
    String[] classt = importFile("class.txt");
    for (int i = 0; i < 31; i ++) {
      FinalProjectObject hi = new FinalProjectObject(eye[i], hair[i], name[i], glasses[i], heights[i], gender[i], classt[i]);
      finalp.add(hi);
    }
    return finalp;
  }
public static String[] importFile(String fileName) {
    ArrayList<String> words = new ArrayList<>();
    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        words.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    String[] wordArray = toArray(words);
    return wordArray;
  }
public static String[] toArray(ArrayList<String> s){
    String[] words = new String[s.size()];
    for(int i = 0; i < words.length; i++){
      words[i] = s.get(i);
    }
    return words;
  }
public static ArrayList<String> toArrayList(String[] s){
    ArrayList<String> words = new ArrayList<String>();
    for(int i = 0; i < s.length; i++){
      words.add(s[i]);
    }
    return words;
  }
public static String irregular(String n) {
	String s = "";
	if (n.equals("Shivsai K")) {
		s = "Are you a male?";
	}
	else if (n.equals("Paawan K")) {
		s = "Are you a senior?";
	}
	else if (n.equals("Anjali M")) {
		s = "Are you a sophomore?";
	}
	else if (n.equals("Akshaya S")) {
		s = "Are you a junior?";
	}
	else if (n.equals("Nikhill A")) {
		s = "Are your shoes white?";
	}
	return s;
}
public static String irregular2(String n) {
	String s = "";
	if (n.equals("Shivsai K")) {
		s = "male";
	}
	else if (n.equals("Elena M")) {
		s = "female";
	}
	else if (n.equals("Paawan K")) {
		s = "senior";
	}
	else if (n.equals("Aditya K")) {
		s = "sophomore";
	}
	else if (n.equals("Anjali M")) {
		s = "sophomore";
	}
	else if (n.equals("Sudeeksha N")) {
		s = "senior";
	}
	else if (n.equals("Akshaya S")) {
		s = "junior";
	}
	else if (n.equals("Lalitha G")) {
		s = "sophomore";
	}
	else if (n.equals("Nikhill A")) {
		s = "white shoes";
	}
	else if (n.equals("Sourish M")) {
		s = "red shoes";
	}
	return s;
}
public static boolean irregular3(String n) {
	
	boolean s = false;
	
	if (n.equals("Shivsai K")) {
		s = true;
	}
	else if (n.equals("Elena M")) {
		s = true;
	}
	else if (n.equals("Paawan K")) {
		s = true;
	}
	else if (n.equals("Aditya K")) {
		s = true;
	}
	else if (n.equals("Anjali M")) {
		s = true;
	}
	else if (n.equals("Sudeeksha N")) {
		s = true;
	}
	else if (n.equals("Akshaya S")) {
		s = true;
	}
	else if (n.equals("Lalitha G")) {
		s = true;
	}
	else if (n.equals("Nikhill A")) {
		s = true;
	}
	else if (n.equals("Sourish M")) {
		s = true;
	}
	return s;
}

public static ArrayList<FinalProjectObject> returnATSS (ArrayList<FinalProjectObject> obj, String o) {
			for (int i = 0; i < obj.size(); i ++) {
				if (obj.get(i).getName().equals(o)) {
					obj.remove(i);
					i--;
				}
			}
			return obj;
}
}