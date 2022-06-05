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
		finalp = returnATS();
		
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton secondstart = new JButton("Start");
		secondstart.setForeground(Color.RED);
		secondstart.setBounds(264, 102, 138, 67);
		contentPane.add(secondstart);
		
		JButton yesbutton = new JButton("Yes");
		yesbutton.setForeground(Color.RED);
		yesbutton.setVisible(false);
		yesbutton.setBounds(190, 158, 92, 90);
		contentPane.add(yesbutton);
		
		JLabel gamelabel = new JLabel("How well do you know our class?");
		gamelabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		gamelabel.setForeground(Color.RED);
		gamelabel.setBounds(231, 74, 225, 16);
		contentPane.add(gamelabel);
		
		JLabel akinlabel1 = new JLabel("Do you want to play Akinator?");
		akinlabel1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		akinlabel1.setForeground(Color.RED);
		akinlabel1.setBounds(16, 74, 211, 16);
		contentPane.add(akinlabel1);
		
		JLabel titlelabel = new JLabel("Welcome To Akinator!");
		titlelabel.setForeground(Color.RED);
		titlelabel.setBackground(new Color(238, 238, 238));
		titlelabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titlelabel.setBounds(124, 27, 289, 16);
		contentPane.add(titlelabel);
		
		JLabel imagelabel1 = new JLabel("");
		imagelabel1.setVisible(false);
		imagelabel1.setBounds(16, 75, 162, 173);
		contentPane.add(imagelabel1);
		
		JLabel addlabel = new JLabel("Additonal Info: ");
		addlabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		addlabel.setForeground(Color.RED);
		addlabel.setVisible(false);
		addlabel.setBounds(190, 117, 254, 16);
		contentPane.add(addlabel);
		
		JButton hintbutton = new JButton("Get Hint");
		hintbutton.setVisible(false);
		hintbutton.setForeground(Color.RED);
		hintbutton.setBounds(302, 145, 117, 29);
		contentPane.add(hintbutton);
		
		JButton resetbutton = new JButton("Reset People");
		resetbutton.setVisible(false);
		resetbutton.setForeground(Color.RED);
		resetbutton.setBounds(190, 145, 117, 29);
		contentPane.add(resetbutton);
		
		JLabel leftbutton = new JLabel("People left: 31");
		leftbutton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		leftbutton.setVisible(false);
		leftbutton.setForeground(Color.RED);
		leftbutton.setBounds(326, 16, 130, 16);
		contentPane.add(leftbutton);
		
		JButton skipbutton = new JButton("Skip Person");
		skipbutton.setForeground(Color.RED);
		skipbutton.setVisible(false);
		skipbutton.setBounds(323, 243, 117, 29);
		contentPane.add(skipbutton);
	   
		JLabel eyelabel = new JLabel("Eyes");
		eyelabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		eyelabel.setForeground(Color.RED);
		eyelabel.setBounds(190, 74, 92, 16);
		contentPane.add(eyelabel);
		eyelabel.setVisible(false);
		
		JLabel hairlabel = new JLabel("Hair");
		hairlabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		hairlabel.setForeground(Color.RED);
		hairlabel.setBounds(285, 74, 92, 16);
		contentPane.add(hairlabel);
		hairlabel.setVisible(false);
		
		JLabel heightlabel = new JLabel("Height");
		heightlabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		heightlabel.setForeground(Color.RED);
		heightlabel.setBounds(190, 102, 229, 16);
		contentPane.add(heightlabel);
		heightlabel.setVisible(false);
		
		JLabel glasseslabel = new JLabel("Glasses");
		glasseslabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		glasseslabel.setForeground(Color.RED);
		glasseslabel.setBounds(185, 89, 92, 16);
		contentPane.add(glasseslabel);
		glasseslabel.setVisible(false);
		
		JLabel hintlabel = new JLabel("");
		hintlabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		hintlabel.setForeground(Color.RED);
		hintlabel.setVisible(false);
		hintlabel.setBounds(219, 227, 225, 16);
		contentPane.add(hintlabel);
		
		JLabel akinlabel = new JLabel("Do you want to play Akinator?");
		akinlabel.setForeground(Color.RED);
		akinlabel.setVisible(false);
		akinlabel.setBounds(-6, 188, 450, 90);
		contentPane.add(akinlabel);
		
		JButton startbutton1 = new JButton("Start");
		startbutton1.setForeground(Color.RED);
		startbutton1.setBackground(Color.WHITE);
		
		JButton nobutton = new JButton("No\n");
		nobutton.setForeground(Color.RED);
		nobutton.setVisible(false);
		nobutton.setBounds(313, 161, 100, 84);
		
		textField = new JTextField();
		textField.setBounds(236, 189, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		JButton homebutton = new JButton("Back To Home");
		homebutton.setForeground(Color.RED);
		homebutton.setVisible(false);
		homebutton.setBounds(6, 6, 117, 63);
		contentPane.add(homebutton);
		
		ArrayList<String> options = new ArrayList<>();
	    options.add("eye");
	    options.add("hair");
	    options.add("glasses");
	    options.add("heights");
		
		yes = yesbutton;
	    
		yesbutton.addActionListener((ActionListener) new ActionListener () {
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
					    nobutton.setVisible(false);
					    yesbutton.setVisible(false);				      
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
			 nobutton.setVisible(false);
			 yesbutton.setVisible(false);
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
		no = nobutton;
		nobutton.addActionListener((ActionListener) new ActionListener () {
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
						    nobutton.setVisible(false);
						    yesbutton.setVisible(false);				      
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
					    nobutton.setVisible(false);
					    yesbutton.setVisible(false);
					    
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
		
		contentPane.add(nobutton);
		hintbutton.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				hintlabel.setVisible(true);
				hintlabel.setText("The first letter of their name is " + there.substring(0, 1));
				}
			});
		
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
					yesbutton.setVisible(true);
					nobutton.setVisible(true);
					homebutton.setVisible(true);
					akinlabel.setVisible(true);
					gamelabel.setVisible(false);
					akinlabel1.setVisible(false);
					secondstart.setVisible(false);
					akinlabel.setBounds(200, 78, 450, 90);
					titlelabel.setBounds(190, 73, 289, 16);
					startbutton1.setBounds(235, 170, 151, 67);
					eyelabel.setVisible(false);
					hairlabel.setVisible(false);
					heightlabel.setVisible(false);
					glasseslabel.setVisible(false);
					imagelabel1.setVisible(true);
					hintlabel.setVisible(false);
					titlelabel.setText("Let's guess you!");
					
				}
				
			}
		});
		contentPane.add(startbutton1);

		
		secondstart.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == secondstart) {
					
					startbutton1.setVisible(false);
					yesbutton.setVisible(false);
					nobutton.setVisible(false);
					homebutton.setVisible(true);
					secondstart.setVisible(false);
					akinlabel1.setVisible(false);
					akinlabel.setVisible(false);
					gamelabel.setVisible(false);
					textField.setVisible(true);
					textField.setText("");
					titlelabel.setBounds(188, 46, 289, 16);
					int r = randNum(y);
					eyelabel.setText("Eyes: " + finalpt.get(r).getEye().toLowerCase());
					eyelabel.setVisible(true);
					hairlabel.setText(" Hair: " + finalpt.get(r).getHair().toLowerCase());
					hairlabel.setVisible(true);
					heightlabel.setText("Height: " + finalpt.get(r).getHeights().substring(
					finalpt.get(r).getHeights().indexOf('t') + 2, finalpt.get(r).getHeights().length() - 1));
					heightlabel.setVisible(true);
					glasseslabel.setText(" Glasses: " + finalpt.get(r).getGlasses());
					glasseslabel.setVisible(true);
					there = finalpt.get(r).getName();
					imagelabel1.setVisible(true);
					hintbutton.setVisible(true);
					leftbutton.setVisible(true);
					resetbutton.setVisible(true);
					skipbutton.setVisible(true);
					if (irregular3(there)) {
						addlabel.setText("Additional Information: " + irregular2(there));
						addlabel.setVisible(true);
					}
					else {
						addlabel.setVisible(false);
					}
					titlelabel.setText("Guess The Person!");
				
				}
			}
		});
		
		
		textField.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if (there.toLowerCase().substring(0, there.indexOf(" ")).equals(textField.getText().toLowerCase())) {
					hintlabel.setVisible(true);
					hintlabel.setText("You got it!");
					skipbutton.setText("Next Person");
					y--;
					finalpt = returnATSS(finalpt, there);
				}
				else if (there.toLowerCase().equals(textField.getText().toLowerCase())) {
					hintlabel.setVisible(true);
					hintlabel.setText("You got it!");
					skipbutton.setText("Next Person");
					y--;
					finalpt = returnATSS(finalpt, there);
				}
				else {
					hintlabel.setVisible(true);
					hintlabel.setText("That's wrong!");
				}
				leftbutton.setText("People left: " + finalpt.size());
			}
		});
	
		Image img = new ImageIcon(this.getClass().getResource("Screen Shot 2022-06-03 at 8.29.41 AM.png")).getImage();
		imagelabel1.setIcon(new ImageIcon(img));
		
		JLabel eyelabel_8 = new JLabel("");
		eyelabel_8.setBounds(26, 0, 462, 279);
		contentPane.add(eyelabel_8);
		Image img1 = new ImageIcon(this.getClass().getResource("Screen Shot 2022-06-02 at 5.42.41 PM.png")).getImage();
		eyelabel_8.setIcon(new ImageIcon(img1));
		
		homebutton.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == homebutton) {
					
					finalp = returnATS();
					startbutton1.setVisible(true);
					secondstart.setVisible(true);
					yesbutton.setVisible(false);
					nobutton.setVisible(false);
					homebutton.setVisible(false);
					akinlabel1.setVisible(true);
					akinlabel.setVisible(false);
					gamelabel.setVisible(true);
					textField.setVisible(false);
					eyelabel.setVisible(false);
					hairlabel.setVisible(false);
					heightlabel.setVisible(false);
					glasseslabel.setVisible(false);
					titlelabel.setBounds(124, 27, 289, 16);
					akinlabel.setText("Do you want to play Akinator?");
					startbutton1.setText("Start");
					startbutton1.setBounds(59, 102, 151, 67);
					imagelabel1.setVisible(false);
					hintlabel.setVisible(false);
					addlabel.setVisible(false);
					hintbutton.setVisible(false);
					leftbutton.setVisible(false);
					resetbutton.setVisible(false);
					skipbutton.setVisible(false);
					titlelabel.setText("Welcome To Akinator!");
					
				}
			}
		});
		resetbutton.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				finalpt = returnATS();
				leftbutton.setText("People left: " + finalpt.size());
				skipbutton.setText("Skip Person");
				there = "";
				y = 31;
				finalpt = returnATSS(finalpt, there);
				if (finalpt.size() == 0) {
					finalpt = returnATS();
				}
				leftbutton.setText("People left: " + finalpt.size());
				int r = randNum(y);
				eyelabel.setText("Eyes: " + finalpt.get(r).getEye().toLowerCase());
				eyelabel.setVisible(true);
				hairlabel.setText(" Hair: " + finalpt.get(r).getHair().toLowerCase());
				hairlabel.setVisible(true);
				heightlabel.setText("Height: " + finalpt.get(r).getHeights().substring(
				finalpt.get(r).getHeights().indexOf('t') + 2, finalpt.get(r).getHeights().length() - 1));
				heightlabel.setVisible(true);
				glasseslabel.setText(" Glasses: " + finalpt.get(r).getGlasses());
				glasseslabel.setVisible(true);
				there = finalpt.get(r).getName();
				if (irregular3(there)) {
					addlabel.setText("Additional Information: " + irregular2(there));
					addlabel.setVisible(true);
				}
				else {
					addlabel.setVisible(false);
				}
				textField.setText("");
				hintlabel.setText("");
			}
		});
		
		skipbutton.addActionListener((ActionListener) new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if (!skipbutton.getText().equals("Next Person")) {
					hintlabel.setVisible(true);
					hintlabel.setText("That person was " + there);
					y--;
				}
				else {
					hintlabel.setText("");
				}
				skipbutton.setText("Skip Person");
				finalpt = returnATSS(finalpt, there);
				if (finalpt.size() == 0) {
					finalpt = returnATS();
					y = 31;
				}
				leftbutton.setText("People left: " + finalpt.size());
				int r = randNum(y);
				eyelabel.setText("Eyes: " + finalpt.get(r).getEye().toLowerCase());
				eyelabel.setVisible(true);
				hairlabel.setText(" Hair: " + finalpt.get(r).getHair().toLowerCase());
				hairlabel.setVisible(true);
				heightlabel.setText("Height: " + finalpt.get(r).getHeights().substring(
				finalpt.get(r).getHeights().indexOf('t') + 2, finalpt.get(r).getHeights().length() - 1));
				heightlabel.setVisible(true);
				glasseslabel.setText(" Glasses: " + finalpt.get(r).getGlasses());
				glasseslabel.setVisible(true);
				there = finalpt.get(r).getName();
				if (irregular3(there)) {
					addlabel.setText("Additional Information: " + irregular2(there));
					addlabel.setVisible(true);
				}
				else {
					addlabel.setVisible(false);
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