import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PokeCalcu extends JFrame implements ActionListener
{
	String types[] = {"NORMAL","FIRE","WATER","ELECTRIC","GRASS","ICE","FIGHTING","POISON","GROUND","GHOST","FLYING","PSYCHIC","BUG","ROCK","GHOST","DRAGON","DARK","STEEL","FAIRY"};
	JPanel offense = new JPanel();
	JPanel defense = new JPanel();
	JPanel resultp = new JPanel();
	JLabel softname = new JLabel("Pokemon Move Calculator");
	JComboBox typedrop = new JComboBox(types);
	JTextField result = new JTextField(14);
	JTextField type1 = new JTextField(10);
	JTextField type2 = new JTextField(10);
	JRadioButton choose = new JRadioButton("");
	JRadioButton choose2 = new JRadioButton("");
	JButton calc = new JButton("Calculate");
	JButton about = new JButton("?");
	
	private void InitUI()
	{
		Container x = getContentPane();
		x.setLayout(new FlowLayout());
		x.add(softname);
		x.add(typedrop);
		x.add(about);
		x.add(defense);
		defense.setBorder(BorderFactory.createTitledBorder("Offensive Type"));
		{
			defense.add(choose);
			defense.add(type1);
		}
		x.add(offense);
		offense.setBorder(BorderFactory.createTitledBorder("Defense Type"));
		{
			offense.add(choose2);
			offense.add(type2);
		}
		x.add(calc);
		x.add(resultp);
		resultp.setBorder(BorderFactory.createTitledBorder("Resulting Effect"));
		{
			resultp.add(result);
		}
		
		ButtonGroup group = new ButtonGroup();
		group.add(choose);
		group.add(choose2);
		
		result.setEditable(false);
		type1.setEditable(false);
		type2.setEditable(false);
		
		
		type1.setText("? ? ?");
		type2.setText("? ? ?");
		result.setText("? ? ?");
		
		typedrop.addActionListener(this);
		calc.addActionListener(this);
		choose.addActionListener(this);
		choose2.addActionListener(this);
		about.addActionListener(this);
		result.setHorizontalAlignment(JTextField.CENTER);
		type1.setHorizontalAlignment(JTextField.CENTER);
		type2.setHorizontalAlignment(JTextField.CENTER);
		
		setTitle("PC v1.2");
		setResizable(false);
		setSize(240,295);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public PokeCalcu()
	{
		InitUI();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == about)
		{
			JOptionPane.showMessageDialog(null,"Pokemon Move Calculator v1.2 by Gabriel Anciano\n\nFollow me on social media: @gabanciano\n\n** CHANGELOG **\n\nv1.2:\n\t- Fixed radio button functionality\n\t- Added JPanels for better organization\n\t- Bug fixes","About",JOptionPane.WARNING_MESSAGE);
		}
		if(choose.isSelected())
		{
			type1.setText(typedrop.getSelectedItem().toString());
			String color = type1.getText();
			if(color.equals("FIRE"))
			{
				type1.setBackground(new Color(255,128,0));
				type1.setForeground(Color.white);
			}
			if(color.equals("WATER"))
			{
				type1.setBackground(new Color(51,153,255));
				type1.setForeground(Color.white);
			}
			if(color.equals("ELECTRIC"))
			{
				type1.setBackground(new Color(204,204,0));
				type1.setForeground(Color.white);
			}
			if(color.equals("ICE"))
			{
				type1.setBackground(new Color(160,223,223));
				type1.setForeground(Color.white);
			}
			if(color.equals("NORMAL"))
			{
				type1.setBackground(new Color(179,174,151));
				type1.setForeground(Color.white);
			}
			if(color.equals("PSYCHIC"))
			{
				type1.setBackground(new Color(232,73,142));
				type1.setForeground(Color.white);
			}
			if(color.equals("GHOST"))
			{
				type1.setBackground(new Color(127,97,165));
				type1.setForeground(Color.white);
			}
			if(color.equals("GRASS"))
			{
				type1.setBackground(new Color(45,168,0));
				type1.setForeground(Color.white);
			}
			if(color.equals("DARK"))
			{
				type1.setBackground(new Color(81,67,9));
				type1.setForeground(Color.white);
			}
			if(color.equals("FIGHTING"))
			{
				type1.setBackground(new Color(181,44,44));
				type1.setForeground(Color.white);
			}
			if(color.equals("BUG"))
			{
				type1.setBackground(new Color(153,153,0));
				type1.setForeground(Color.white);
			}
			if(color.equals("FAIRY"))
			{
				type1.setBackground(new Color(255,102,255));
				type1.setForeground(Color.white);
			}
			if(color.equals("GROUND"))
			{
				type1.setBackground(new Color(226,209,124));
				type1.setForeground(Color.white);
			}
			if(color.equals("FLYING"))
			{
				type1.setBackground(new Color(206,172,225));
				type1.setForeground(Color.white);
			}
			if(color.equals("POISON"))
			{
				type1.setBackground(new Color(151,74,209));
				type1.setForeground(Color.white);
			}
			if(color.equals("ROCK"))
			{
				type1.setBackground(new Color(172,149,33));
				type1.setForeground(Color.white);
			}
			if(color.equals("STEEL"))
			{
				type1.setBackground(new Color(188,188,188));
				type1.setForeground(Color.white);
			}
			if(color.equals("DRAGON"))
			{
				type1.setBackground(new Color(63,8,175));
				type1.setForeground(Color.white);
			}
			type1.setText(color);
		}
		if(choose2.isSelected())
		{
			type2.setText(typedrop.getSelectedItem().toString());
			String color2 = type2.getText();
			if(color2.equals("FIRE"))
			{
				type2.setBackground(new Color(255,128,0));
				type2.setForeground(Color.white);
			}
			if(color2.equals("WATER"))
			{
				type2.setBackground(new Color(51,153,255));
				type2.setForeground(Color.white);
			}
			if(color2.equals("ELECTRIC"))
			{
				type2.setBackground(new Color(204,204,0));
				type2.setForeground(Color.white);
			}
			if(color2.equals("ICE"))
			{
				type2.setBackground(new Color(160,223,223));
				type2.setForeground(Color.white);
			}
			if(color2.equals("NORMAL"))
			{
				type2.setBackground(new Color(179,174,151));
				type2.setForeground(Color.white);
			}
			if(color2.equals("PSYCHIC"))
			{
				type2.setBackground(new Color(232,73,142));
				type2.setForeground(Color.white);
			}
			if(color2.equals("GHOST"))
			{
				type2.setBackground(new Color(127,97,165));
				type2.setForeground(Color.white);
			}
			if(color2.equals("GRASS"))
			{
				type2.setBackground(new Color(45,168,0));
				type2.setForeground(Color.white);
			}
			if(color2.equals("DARK"))
			{
				type2.setBackground(new Color(81,67,9));
				type2.setForeground(Color.white);
			}
			if(color2.equals("FIGHTING"))
			{
				type2.setBackground(new Color(181,44,44));
				type2.setForeground(Color.white);
			}
			if(color2.equals("BUG"))
			{
				type2.setBackground(new Color(153,153,0));
				type2.setForeground(Color.white);
			}
			if(color2.equals("FAIRY"))
			{
				type2.setBackground(new Color(255,102,255));
				type2.setForeground(Color.white);
			}
			if(color2.equals("GROUND"))
			{
				type2.setBackground(new Color(226,209,124));
				type2.setForeground(Color.white);
			}
			if(color2.equals("FLYING"))
			{
				type2.setBackground(new Color(206,172,225));
				type2.setForeground(Color.white);
			}
			if(color2.equals("POISON"))
			{
				type2.setBackground(new Color(151,74,209));
				type2.setForeground(Color.white);
			}
			if(color2.equals("ROCK"))
			{
				type2.setBackground(new Color(172,149,33));
				type2.setForeground(Color.white);
			}
			if(color2.equals("STEEL"))
			{
				type2.setBackground(new Color(188,188,188));
				type2.setForeground(Color.white);
			}
			if(color2.equals("DRAGON"))
			{
				type2.setBackground(new Color(63,8,175));
				type2.setForeground(Color.white);
			}
			type2.setText(color2);
		}
		if(e.getSource() == calc)
		{
			String t1 = type1.getText();
			String t2 = type2.getText();
			//FIRE TYPE COMPARISON
			if(t1.equals("FIRE") && t2.equals("GRASS"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FIRE") && t2.equals("ICE"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FIRE") && t2.equals("BUG"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FIRE") && t2.equals("STEEL"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FIRE") && t2.equals("WATER"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FIRE") && t2.equals("ELECTRIC"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FIRE") && t2.equals("WATER"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FIRE") && t2.equals("FIRE"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FIRE") && t2.equals("DRAGON"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FIRE") && t2.equals("ROCK"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FIRE") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIRE") && t2.equals("POISON"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIRE") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIRE") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIRE") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIRE") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIRE") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIRE") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			//NORMAL
			else if(t1.equals("NORMAL") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("FIRE"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("WATER"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("GRASS"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("POISON"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("FLYING"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("DRAGON"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("NORMAL") && t2.equals("ROCK"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("NORMAL") && t2.equals("STEEL"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("NORMAL") && t2.equals("GHOST"))
			{
				result.setText(NE());
			}
			//WATER
			else if(t1.equals("WATER") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("POISON"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("FLYING"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("STEEL"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("WATER") && t2.equals("FIRE"))
			{
				result.setText(SE());
			}
			else if(t1.equals("WATER") && t2.equals("GROUND"))
			{
				result.setText(SE());
			}
			else if(t1.equals("WATER") && t2.equals("ROCK"))
			{
				result.setText(SE());
			}
			else if(t1.equals("WATER") && t2.equals("WATER"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("WATER") && t2.equals("GRASS"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("WATER") && t2.equals("DRAGON"))
			{
				result.setText(NVE());
			}
			//ELECTRIC TYPE
			else if(t1.equals("ELECTRIC") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("FIRE"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("POISON"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("ROCK"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("STEEL"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("ELECTRIC"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("GRASS"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("DRAGON"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("WATER"))
			{
				result.setText(SE());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("FLYING"))
			{
				result.setText(SE());
			}
			else if(t1.equals("ELECTRIC") && t2.equals("GROUND"))
			{
				result.setText(NE());
			}
			//GRASS TYPE
			else if(t1.equals("GRASS") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("GRASS") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("GRASS") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("GRASS") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("GRASS") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("GRASS") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("GRASS") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("GRASS") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("GRASS") && t2.equals("FIRE"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("GRASS") && t2.equals("GRASS"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("GRASS") && t2.equals("POISON"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("GRASS") && t2.equals("FLYING"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("GRASS") && t2.equals("BUG"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("GRASS") && t2.equals("DRAGON"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("GRASS") && t2.equals("STEEL"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("GRASS") && t2.equals("WATER"))
			{
				result.setText(SE());
			}
			else if(t1.equals("GRASS") && t2.equals("GROUND"))
			{
				result.setText(SE());
			}
			else if(t1.equals("GRASS") && t2.equals("ROCK"))
			{
				result.setText(SE());
			}
			//ICE TYPE
			else if(t1.equals("ICE") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("ICE") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("ICE") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("ICE") && t2.equals("POISON"))
			{
				result.setText(N());
			}
			else if(t1.equals("ICE") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("ICE") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("ICE") && t2.equals("ROCK"))
			{
				result.setText(N());
			}
			else if(t1.equals("ICE") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("ICE") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("ICE") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("ICE") && t2.equals("FIRE"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("ICE") && t2.equals("WATER"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("ICE") && t2.equals("ICE"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("ICE") && t2.equals("STEEL"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("ICE") && t2.equals("GRASS"))
			{
				result.setText(SE());
			}
			else if(t1.equals("ICE") && t2.equals("GROUND"))
			{
				result.setText(SE());
			}
			else if(t1.equals("ICE") && t2.equals("FLYING"))
			{
				result.setText(SE());
			}
			else if(t1.equals("ICE") && t2.equals("DRAGON"))
			{
				result.setText(SE());
			}
			//FIGHTING TYPE
			else if(t1.equals("FIGHTING") && t2.equals("FIRE"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIGHTING") && t2.equals("WATER"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIGHTING") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIGHTING") && t2.equals("GRASS"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIGHTING") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIGHTING") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIGHTING") && t2.equals("DRAGON"))
			{
				result.setText(N());
			}
			else if(t1.equals("FIGHTING") && t2.equals("POISON"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FIGHTING") && t2.equals("FLYING"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FIGHTING") && t2.equals("PSYCHIC"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FIGHTING") && t2.equals("BUG"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FIGHTING") && t2.equals("FAIRY"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FIGHTING") && t2.equals("NORMAL"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FIGHTING") && t2.equals("ICE"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FIGHTING") && t2.equals("ROCK"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FIGHTING") && t2.equals("DARK"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FIGHTING") && t2.equals("STEEL"))
			{
				result.setText(SE());
			}
			//POISON TYPE
			else if(t1.equals("POISON") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("POISON") && t2.equals("FIRE"))
			{
				result.setText(N());
			}
			else if(t1.equals("POISON") && t2.equals("WATER"))
			{
				result.setText(N());
			}
			else if(t1.equals("POISON") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("POISON") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("POISON") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("POISON") && t2.equals("FLYING"))
			{
				result.setText(N());
			}
			else if(t1.equals("POISON") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("POISON") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("POISON") && t2.equals("DRAGON"))
			{
				result.setText(N());
			}
			else if(t1.equals("POISON") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("POISON") && t2.equals("GRASS"))
			{
				result.setText(SE());
			}
			else if(t1.equals("POISON") && t2.equals("FAIRY"))
			{
				result.setText(SE());
			}
			else if(t1.equals("POISON") && t2.equals("POISON"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("POISON") && t2.equals("GROUND"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("POISON") && t2.equals("ROCK"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("POISON") && t2.equals("GHOST"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("POISON") && t2.equals("STEEL"))
			{
				result.setText(NE());
			}
			//GROUND TYPE
			else if(t1.equals("GROUND") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("GROUND") && t2.equals("WATER"))
			{
				result.setText(N());
			}
			else if(t1.equals("GROUND") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("GROUND") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("GROUND") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("GROUND") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("GROUND") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("GROUND") && t2.equals("DRAGON"))
			{
				result.setText(N());
			}
			else if(t1.equals("GROUND") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("GROUND") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("GROUND") && t2.equals("FIRE"))
			{
				result.setText(SE());
			}
			else if(t1.equals("GROUND") && t2.equals("ELECTRIC"))
			{
				result.setText(SE());
			}
			else if(t1.equals("GROUND") && t2.equals("POISON"))
			{
				result.setText(SE());
			}
			else if(t1.equals("GROUND") && t2.equals("ROCK"))
			{
				result.setText(SE());
			}
			else if(t1.equals("GROUND") && t2.equals("STEEL"))
			{
				result.setText(SE());
			}
			else if(t1.equals("GROUND") && t2.equals("GRASS"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("GROUND") && t2.equals("BUG"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("GROUND") && t2.equals("FLYING"))
			{
				result.setText(NE());
			}
			//FLYING TYPE
			else if(t1.equals("FLYING") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("FIRE"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("WATER"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("POISON"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("FLYING"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("DRAGON"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("FLYING") && t2.equals("ELECTRIC"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FLYING") && t2.equals("ROCK"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FLYING") && t2.equals("STEEL"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FLYING") && t2.equals("GRASS"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FLYING") && t2.equals("FIGHTING"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FLYING") && t2.equals("BUG"))
			{
				result.setText(SE());
			}
			//PSYCHIC TYPE
			else if(t1.equals("PSYCHIC") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("FIRE"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("WATER"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("GRASS"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("FLYING"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("ROCK"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("DRAGON"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("FIGHTING"))
			{
				result.setText(SE());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("POISON"))
			{
				result.setText(SE());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("PSYCHIC"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("STEEL"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("PSYCHIC") && t2.equals("DARK"))
			{
				result.setText(NE());
			}
			//BUG TYPE
			else if(t1.equals("BUG") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("BUG") && t2.equals("WATER"))
			{
				result.setText(N());
			}
			else if(t1.equals("BUG") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("BUG") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("BUG") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("BUG") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("BUG") && t2.equals("ROCK"))
			{
				result.setText(N());
			}
			else if(t1.equals("BUG") && t2.equals("DRAGON"))
			{
				result.setText(N());
			}
			else if(t1.equals("BUG") && t2.equals("FIRE"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("BUG") && t2.equals("FIGHTING"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("BUG") && t2.equals("POISON"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("BUG") && t2.equals("FLYING"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("BUG") && t2.equals("GHOST"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("BUG") && t2.equals("STEEL"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("BUG") && t2.equals("FAIRY"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("BUG") && t2.equals("GRASS"))
			{
				result.setText(SE());
			}
			else if(t1.equals("BUG") && t2.equals("PSYCHIC"))
			{
				result.setText(SE());
			}
			else if(t1.equals("BUG") && t2.equals("DARK"))
			{
				result.setText(SE());
			}
			//ROCK TYPE
			else if(t1.equals("ROCK") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("ROCK") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("ROCK") && t2.equals("GRASS"))
			{
				result.setText(N());
			}
			else if(t1.equals("ROCK") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("ROCK") && t2.equals("POISON"))
			{
				result.setText(N());
			}
			else if(t1.equals("ROCK") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("ROCK") && t2.equals("ROCK"))
			{
				result.setText(N());
			}
			else if(t1.equals("ROCK") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("ROCK") && t2.equals("DRAGON"))
			{
				result.setText(N());
			}
			else if(t1.equals("ROCK") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("ROCK") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("ROCK") && t2.equals("FIGHTING"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("ROCK") && t2.equals("GROUND"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("ROCK") && t2.equals("STEEL"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("ROCK") && t2.equals("FIRE"))
			{
				result.setText(SE());
			}
			else if(t1.equals("ROCK") && t2.equals("ICE"))
			{
				result.setText(SE());
			}
			else if(t1.equals("ROCK") && t2.equals("FLYING"))
			{
				result.setText(SE());
			}
			else if(t1.equals("ROCK") && t2.equals("BUG"))
			{
				result.setText(SE());
			}
			//GHOST TYPE
			else if(t1.equals("GHOST") && t2.equals("NORMAL"))
			{
				result.setText(NE());
			}
			else if(t1.equals("GHOST") && t2.equals("FIRE"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("WATER"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("GRASS"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("POISON"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("FLYING"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("ROCK"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("DRAGON"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("STEEL"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("GHOST") && t2.equals("DARK"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("GHOST") && t2.equals("PSYCHIC"))
			{
				result.setText(SE());
			}
			else if(t1.equals("GHOST") && t2.equals("GHOST"))
			{
				result.setText(SE());
			}
			//DRAGON TYPE
			else if(t1.equals("DRAGON") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("FIRE"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("WATER"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("GRASS"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("POISON"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("FLYING"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("ROCK"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("DRAGON") && t2.equals("STEEL"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("DRAGON") && t2.equals("FAIRY"))
			{
				result.setText(NE());
			}
			//DARK TYPE
			else if(t1.equals("DARK") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("FIRE"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("WATER"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("GRASS"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("POISON"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("FLYING"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("ROCK"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("DRAGON"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("STEEL"))
			{
				result.setText(N());
			}
			else if(t1.equals("DARK") && t2.equals("FIGHTING"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("DARK") && t2.equals("DARK"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("DARK") && t2.equals("FAIRY"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("DARK") && t2.equals("PSYCHIC"))
			{
				result.setText(SE());
			}
			else if(t1.equals("DARK") && t2.equals("GHOST"))
			{
				result.setText(NVE());
			}
			//STEEL TYPE
			else if(t1.equals("STEEL") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("STEEL") && t2.equals("GRASS"))
			{
				result.setText(N());
			}
			else if(t1.equals("STEEL") && t2.equals("FIGHTING"))
			{
				result.setText(N());
			}
			else if(t1.equals("STEEL") && t2.equals("POISON"))
			{
				result.setText(N());
			}
			else if(t1.equals("STEEL") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("STEEL") && t2.equals("FLYING"))
			{
				result.setText(N());
			}
			else if(t1.equals("STEEL") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("STEEL") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("STEEL") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("STEEL") && t2.equals("DRAGON"))
			{
				result.setText(N());
			}
			else if(t1.equals("STEEL") && t2.equals("DARK"))
			{
				result.setText(N());
			}
			else if(t1.equals("STEEL") && t2.equals("FIRE"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("STEEL") && t2.equals("WATER"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("STEEL") && t2.equals("ELECTRIC"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("STEEL") && t2.equals("STEEL"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("STEEL") && t2.equals("ICE"))
			{
				result.setText(SE());
			}
			else if(t1.equals("STEEL") && t2.equals("ROCK"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("STEEL") && t2.equals("FAIRY"))
			{
				result.setText(NVE());
			}
			//FAIRY TYPE
			else if(t1.equals("FAIRY") && t2.equals("NORMAL"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("WATER"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("ELECTRIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("GRASS"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("ICE"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("GROUND"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("FLYING"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("PSYCHIC"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("BUG"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("ROCK"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("GHOST"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("FAIRY"))
			{
				result.setText(N());
			}
			else if(t1.equals("FAIRY") && t2.equals("POISON"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FAIRY") && t2.equals("STEEL"))
			{
				result.setText(NVE());
			}
			else if(t1.equals("FAIRY") && t2.equals("FIGHTING"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FAIRY") && t2.equals("DRAGON"))
			{
				result.setText(SE());
			}
			else if(t1.equals("FAIRY") && t2.equals("DARK"))
			{
				result.setText(SE());
			}
			//END OF TYPES
			//END
			else
			{
				result.setText("No types to compare!");
				result.setForeground(Color.red);
			}
		}
	}
	public static void main(String[] args)
	{
		new PokeCalcu();
	}
	public String NE()
	{
		String statusEffect = "No effect (0%)";
		result.setBackground(new Color(96,96,96));
		result.setForeground(Color.white);
		return statusEffect;
	}
	public String NVE()
	{
		String statusEffect = "Not very effective (50%)";
		result.setBackground(Color.red);
		result.setForeground(Color.white);
		return statusEffect;
	}
	public String N()
	{
		String statusEffect = "Normal (100%)";
		result.setBackground(Color.white);
		result.setForeground(Color.black);
		return statusEffect;
	}
	public String SE()
	{
		String statusEffect = "Super-effective (200%)";
		result.setBackground(new Color(0,153,0));
		result.setForeground(Color.white);
		return statusEffect;
	}
}