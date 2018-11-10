/*****************************************************************************
               Name: Jeffrey Ignatius
               Date: October 2, 2003
       Program Name: TicTacToe
Program Description: TicTacToe Game on a GUI Interface
    Lesson/Lab Name: None
    Book/Lab Manual: None
        Input Files: None
       Output Files: None
*****************************************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TicTacToe extends JFrame
{
	static int player;
	static int comp;

	static String name;

	static int[] tic = new int[9];			//vector of 9 full of 0"s
	static String[] toe = new String[9];	//vector of 9 full of blanks
	static String[] tac = new String[9];	//vector of 9 for display
	static int player_score=0;
	static int comp_score=0;
	static String player_dummy;
	static String comp_dummy;

	private static final int WIDTH  = 150;
	private static final int HEIGHT = 150;

	private JButton pos0, pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8;

	public TicTacToe()
	{
		for(int x=0;x<9;x++)
			tic[x]=0;

		if(player_dummy.toLowerCase().equals("x")==true)
		{
			player=1;
			comp=-1;
			player_dummy = "X";
			comp_dummy = "O";
		}
		else
		{
			player=-1;
			comp=1;
			player_dummy = "O";
			comp_dummy = "X";
		}

		//Setting the title of the window
		setTitle("Gameboard");

		//Get the container
		Container pane = getContentPane();

		//Setting the Layout for the container
		pane.setLayout(new GridLayout(3,3));

		//Creating four text labels
		pos0 = new JButton("");
		pos0.addActionListener(new pos0ButtonHandler());
		pane.add(pos0);

		pos1 = new JButton("");
		pos1.addActionListener(new pos1ButtonHandler());
		pane.add(pos1);

		pos2 = new JButton("");
		pos2.addActionListener(new pos2ButtonHandler());
		pane.add(pos2);

		pos3 = new JButton("");
		pos3.addActionListener(new pos3ButtonHandler());
		pane.add(pos3);

		pos4 = new JButton("");
		pos4.addActionListener(new pos4ButtonHandler());
		pane.add(pos4);

		pos5 = new JButton("");
		pos5.addActionListener(new pos5ButtonHandler());
		pane.add(pos5);

		pos6 = new JButton("");
		pos6.addActionListener(new pos6ButtonHandler());
		pane.add(pos6);

		pos7 = new JButton("");
		pos7.addActionListener(new pos7ButtonHandler());
		pane.add(pos7);

		pos8 = new JButton("");
		pos8.addActionListener(new pos8ButtonHandler());
		pane.add(pos8);

		//set the size of the window and display it
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class pos0ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(tic[0]!=0)
				JOptionPane.showMessageDialog(null,"Invalid Move!",null,JOptionPane.ERROR_MESSAGE);
			else
			{
				tic[0]=player;

				if(tic[0]==-1)
					pos0.setText("O");
				if(tic[0]==1)
					pos0.setText("X");
				if(tic[1]==-1)
					pos1.setText("O");
				if(tic[1]==1)
					pos1.setText("X");
				if(tic[2]==-1)
					pos2.setText("O");
				if(tic[2]==1)
					pos2.setText("X");
				if(tic[3]==-1)
					pos3.setText("O");
				if(tic[3]==1)
					pos3.setText("X");
				if(tic[4]==-1)
					pos4.setText("O");
				if(tic[4]==1)
					pos4.setText("X");
				if(tic[5]==-1)
					pos5.setText("O");
				if(tic[5]==1)
					pos5.setText("X");
				if(tic[6]==-1)
					pos6.setText("O");
				if(tic[6]==1)
					pos6.setText("X");
				if(tic[7]==-1)
					pos7.setText("O");
				if(tic[7]==1)
					pos7.setText("X");
				if(tic[8]==-1)
					pos8.setText("O");
				if(tic[8]==1)
					pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}

				int comp_pos=comp_move();

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}

			}
		}
	}

	private class pos1ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(tic[1]!=0)
				JOptionPane.showMessageDialog(null,"Invalid Move!",null,JOptionPane.ERROR_MESSAGE);
			else
			{
				tic[1]=player;

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}

				int comp_pos=comp_move();

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}


			}
		}
	}

	private class pos2ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(tic[2]!=0)
				JOptionPane.showMessageDialog(null,"Invalid Move!",null,JOptionPane.ERROR_MESSAGE);
			else
			{
				tic[2]=player;

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}

				int comp_pos=comp_move();

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}


			}
		}
	}
	private class pos3ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(tic[3]!=0)
				JOptionPane.showMessageDialog(null,"Invalid Move!",null,JOptionPane.ERROR_MESSAGE);
			else
			{
				tic[3]=player;

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}

				int comp_pos=comp_move();

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}


			}
		}
	}
	private class pos4ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(tic[4]!=0)
				JOptionPane.showMessageDialog(null,"Invalid Move!",null,JOptionPane.ERROR_MESSAGE);
			else
			{
				tic[4]=player;

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}

				int comp_pos=comp_move();

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}


			}
		}
	}
	private class pos5ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(tic[5]!=0)
				JOptionPane.showMessageDialog(null,"Invalid Move!",null,JOptionPane.ERROR_MESSAGE);
			else
			{
				tic[5]=player;

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}

				int comp_pos=comp_move();

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}


			}
		}
	}
	private class pos6ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(tic[6]!=0)
				JOptionPane.showMessageDialog(null,"Invalid Move!",null,JOptionPane.ERROR_MESSAGE);
			else
			{
				tic[6]=player;

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}

				int comp_pos=comp_move();

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}


			}
		}
	}
	private class pos7ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(tic[7]!=0)
				JOptionPane.showMessageDialog(null,"Invalid Move!",null,JOptionPane.ERROR_MESSAGE);
			else
			{
				tic[7]=player;

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}

				int comp_pos=comp_move();

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}


			}
		}
	}
	private class pos8ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(tic[8]!=0)
				JOptionPane.showMessageDialog(null,"Invalid Move!",null,JOptionPane.ERROR_MESSAGE);
			else
			{
				tic[8]=player;

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())				{					pos0.setText("");						pos1.setText("");					pos2.setText("");					pos3.setText("");					pos4.setText("");					pos5.setText("");					pos6.setText("");					pos7.setText("");					pos8.setText("");					for(int i=0;i<9;i++)						tic[i]=0;				}

				int comp_pos=comp_move();

								if(tic[0]==-1)
									pos0.setText("O");
								if(tic[0]==1)
									pos0.setText("X");
								if(tic[1]==-1)
									pos1.setText("O");
								if(tic[1]==1)
									pos1.setText("X");
								if(tic[2]==-1)
									pos2.setText("O");
								if(tic[2]==1)
									pos2.setText("X");
								if(tic[3]==-1)
									pos3.setText("O");
								if(tic[3]==1)
									pos3.setText("X");
								if(tic[4]==-1)
									pos4.setText("O");
								if(tic[4]==1)
									pos4.setText("X");
								if(tic[5]==-1)
									pos5.setText("O");
								if(tic[5]==1)
									pos5.setText("X");
								if(tic[6]==-1)
									pos6.setText("O");
								if(tic[6]==1)
									pos6.setText("X");
								if(tic[7]==-1)
									pos7.setText("O");
								if(tic[7]==1)
									pos7.setText("X");
								if(tic[8]==-1)
									pos8.setText("O");
								if(tic[8]==1)
									pos8.setText("X");

				if(check_win())
				{
					pos0.setText("");
					pos1.setText("");
					pos2.setText("");
					pos3.setText("");
					pos4.setText("");
					pos5.setText("");
					pos6.setText("");
					pos7.setText("");
					pos8.setText("");
					for(int i=0;i<9;i++)
						tic[i]=0;
				}


			}
		}
	}

	public static void main(String[] args)
	{
		name = JOptionPane.showInputDialog("What is your name?");

		if(name==null)
			System.exit(0);

		player_dummy = JOptionPane.showInputDialog("What would you like "+name+", X's or O's?");

		if(player_dummy==null)
			System.exit(0);

		TicTacToe gameboard = new TicTacToe();
	}
	public int comp_move()
	{
		int random, x=0;
		do
		{
			if((tic[0]+tic[1]+tic[2]==comp*2))
				random=((int)(Math.random()*10000)%3);
			else if((tic[3]+tic[4]+tic[5]==comp*2))
				random=((int)(Math.random()*10000)%3)+3;
			else if((tic[6]+tic[7]+tic[8]==comp*2))
				random=((int)(Math.random()*10000)%3)+6;
			else if((tic[0]+tic[3]+tic[6]==comp*2))
				random=((int)(Math.random()*10000)%3)*3;
			else if((tic[1]+tic[4]+tic[7]==comp*2))
				random=(((int)(Math.random()*10000)%3)*3)+1;
			else if((tic[2]+tic[5]+tic[8]==comp*2))
				random=(((int)(Math.random()*10000)%3)*3)+2;
			else if((tic[0]+tic[4]+tic[8]==comp*2))
				random=((int)(Math.random()*10000)%3)*4;
			else if((tic[2]+tic[4]+tic[6]==comp*2))
				random=(((int)(Math.random()*10000)%3)+1)*2;
			else if((tic[0]+tic[1]+tic[2]==player*2))
				random=((int)(Math.random()*10000)%3);
			else if((tic[3]+tic[4]+tic[5]==player*2))
				random=((int)(Math.random()*10000)%3)+3;
			else if((tic[6]+tic[7]+tic[8]==player*2))
				random=((int)(Math.random()*10000)%3)+6;
			else if((tic[0]+tic[3]+tic[6]==player*2))
				random=((int)(Math.random()*10000)%3)*3;
			else if((tic[1]+tic[4]+tic[7]==player*2))
				random=(((int)(Math.random()*10000)%3)*3)+1;
			else if((tic[2]+tic[5]+tic[8]==player*2))
				random=(((int)(Math.random()*10000)%3)*3)+2;
			else if((tic[0]+tic[4]+tic[8]==player*2))
				random=((int)(Math.random()*10000)%3)*4;
			else if((tic[2]+tic[4]+tic[6]==player*2))
				random=(((int)(Math.random()*10000)%3)+1)*2;
			else
				random=((int)(Math.random()*10000)%9);
			x++;
		}while(tic[random]!=0 && x<50);
		tic[random]=comp;
		return random;
	}

	public boolean check_win()
	{
		//Scoreboard
		if((tic[0]+tic[1]+tic[2]==player*3))
		{
			player_score++;
			JOptionPane.showMessageDialog(null,"Player Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[3]+tic[4]+tic[5]==player*3))
		{
			player_score++;
			JOptionPane.showMessageDialog(null,"Player Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[6]+tic[7]+tic[8]==player*3))
		{
			player_score++;
			JOptionPane.showMessageDialog(null,"Player Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[0]+tic[3]+tic[6]==player*3))
		{
			player_score++;
			JOptionPane.showMessageDialog(null,"Player Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[1]+tic[4]+tic[7]==player*3))
		{
			player_score++;
			JOptionPane.showMessageDialog(null,"Player Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[2]+tic[5]+tic[8]==player*3))
		{
			player_score++;
			JOptionPane.showMessageDialog(null,"Player Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[0]+tic[4]+tic[8]==player*3))
		{
			player_score++;
			JOptionPane.showMessageDialog(null,"Player Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[2]+tic[4]+tic[6]==player*3))
		{
			player_score++;
			JOptionPane.showMessageDialog(null,"Player Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[0]+tic[1]+tic[2]==comp*3))
		{
			comp_score++;
			JOptionPane.showMessageDialog(null,"Computer Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[3]+tic[4]+tic[5]==comp*3))
		{
			comp_score++;
			JOptionPane.showMessageDialog(null,"Computer Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[6]+tic[7]+tic[8]==comp*3))
		{
			comp_score++;
			JOptionPane.showMessageDialog(null,"Computer Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[0]+tic[3]+tic[6]==comp*3))
		{
			comp_score++;
			JOptionPane.showMessageDialog(null,"Computer Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[1]+tic[4]+tic[7]==comp*3))
		{
			comp_score++;
			JOptionPane.showMessageDialog(null,"Computer Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[2]+tic[5]+tic[8]==comp*3))
		{
			comp_score++;
			JOptionPane.showMessageDialog(null,"Computer Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[0]+tic[4]+tic[8]==comp*3))
		{
			comp_score++;
			JOptionPane.showMessageDialog(null,"Computer Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		else if((tic[2]+tic[4]+tic[6]==comp*3))
		{
			comp_score++;
			JOptionPane.showMessageDialog(null,"Computer Wins!\n\nScore\n--------\n"+name+"("+player_dummy+"): "+player_score+"\nComputer("+comp_dummy+"): "+comp_score,"Scoreboard",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
		boolean flag=true;
		for(int x=0;x<9;x++)
		{
			if(tic[x]==0) flag=false;
		}
		if(flag)
			JOptionPane.showMessageDialog(null,"Draw Match!","Scoreboard",JOptionPane.PLAIN_MESSAGE);
		return flag;
	}
}

/*
@echo off
cd C:\Java Class\TicTacToe
java TicTacToe
exit
*/