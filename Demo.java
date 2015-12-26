package test;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Demo extends javax.swing.JFrame {
	private JButton jButton1;
	private JButton jButton26;
	private JButton jButton28;
	private JButton jButton32;
	private JButton jButton31;
	private JButton jButton30;
	private JButton jButton29;
	private JButton jButton27;
	private JButton jButton25;
	private JButton jButton15;
	private JButton jButton16;
	private JButton jButton24;
	private JButton jButton23;
	private JButton jButton22;
	private JButton jButton21;
	private JButton jButton20;
	private JButton jButton19;
	private JButton jButton18;
	private JButton jButton17;
	private JButton jButton14;
	private JButton jButton13;
	private JButton jButton12;
	private JButton jButton11;
	private JButton jButton10;
	private JButton jButton9;
	private JButton jButton8;
	private JButton jButton7;
	private JButton jButton6;
	private JButton jButton5;
	private JButton jButton4;
	private JTextField jTextField1;
	private JButton jButton3;
	private JButton jButton2;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Demo inst = new Demo();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Demo() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("test/1.jpg")).getImage());
			this.setTitle("\u8ba1\u7b97\u5668");
			getContentPane().setLayout(null);
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("\u67e5\u770b(V)");
				jButton1.setBounds(0, 0, 81, 24);
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("\u7f16\u8f91(E)");
				jButton2.setBounds(79, 0, 77, 24);
			}
			{
				jButton3 = new JButton();
				getContentPane().add(jButton3);
				jButton3.setText("\u5e2e\u52a9(H)");
				jButton3.setBounds(156, 0, 87, 24);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(12, 35, 344, 50);
			}
			{
				jButton4 = new JButton();
				getContentPane().add(jButton4);
				jButton4.setText("MC");
				jButton4.setBounds(12, 105, 60, 24);
			}
			{
				jButton5 = new JButton();
				getContentPane().add(jButton5);
				jButton5.setText("MR");
				jButton5.setBounds(83, 105, 60, 24);
			}
			{
				jButton6 = new JButton();
				getContentPane().add(jButton6);
				jButton6.setText("MS");
				jButton6.setBounds(154, 105, 60, 24);
			}
			{
				jButton7 = new JButton();
				getContentPane().add(jButton7);
				jButton7.setText("M+");
				jButton7.setBounds(225, 105, 60, 24);
			}
			{
				jButton8 = new JButton();
				getContentPane().add(jButton8);
				jButton8.setText("M-");
				jButton8.setBounds(296, 105, 60, 24);
			}
			{
				jButton9 = new JButton();
				getContentPane().add(jButton9);
				jButton9.setText("\u2190");
				jButton9.setBounds(12, 140, 60, 24);
			}
			{
				jButton10 = new JButton();
				getContentPane().add(jButton10);
				jButton10.setText("CE");
				jButton10.setBounds(83, 140, 60, 24);
			}
			{
				jButton11 = new JButton();
				getContentPane().add(jButton11);
				jButton11.setText("C");
				jButton11.setBounds(154, 140, 60, 24);
			}
			{
				jButton12 = new JButton();
				getContentPane().add(jButton12);
				jButton12.setText("±");
				jButton12.setBounds(225, 140, 60, 24);
			}
			{
				jButton13 = new JButton();
				getContentPane().add(jButton13);
				jButton13.setText("\u221a");
				jButton13.setBounds(296, 140, 60, 24);
			}
			{
				jButton14 = new JButton();
				getContentPane().add(jButton14);
				jButton14.setText("7");
				jButton14.setBounds(12, 175, 60, 24);
			}
			{
				jButton15 = new JButton();
				getContentPane().add(jButton15);
				jButton15.setText("8");
				jButton15.setBounds(83, 175, 60, 24);
			}
			{
				jButton16 = new JButton();
				getContentPane().add(jButton16);
				jButton16.setText("9");
				jButton16.setBounds(154, 175, 60, 24);
			}
			{
				jButton17 = new JButton();
				getContentPane().add(jButton17);
				jButton17.setText("/");
				jButton17.setBounds(225, 175, 60, 24);
			}
			{
				jButton18 = new JButton();
				getContentPane().add(jButton18);
				jButton18.setText("%");
				jButton18.setBounds(296, 175, 60, 24);
			}
			{
				jButton19 = new JButton();
				getContentPane().add(jButton19);
				jButton19.setText("4");
				jButton19.setBounds(12, 210, 60, 24);
			}
			{
				jButton20 = new JButton();
				getContentPane().add(jButton20);
				jButton20.setText("5");
				jButton20.setBounds(83, 210, 60, 24);
			}
			{
				jButton21 = new JButton();
				getContentPane().add(jButton21);
				jButton21.setText("6");
				jButton21.setBounds(154, 210, 60, 24);
			}
			{
				jButton22 = new JButton();
				getContentPane().add(jButton22);
				jButton22.setText("*");
				jButton22.setBounds(225, 210, 60, 24);
			}
			{
				jButton23 = new JButton();
				getContentPane().add(jButton23);
				jButton23.setText("1/x");
				jButton23.setBounds(296, 210, 60, 24);
			}
			{
				jButton24 = new JButton();
				getContentPane().add(jButton24);
				jButton24.setText("4");
				jButton24.setBounds(12, 210, 60, 24);
			}
			{
				jButton25 = new JButton();
				getContentPane().add(jButton25);
				jButton25.setText("1");
				jButton25.setBounds(12, 245, 60, 24);
			}
			{
				jButton26 = new JButton();
				getContentPane().add(jButton26);
				jButton26.setText("2");
				jButton26.setBounds(83, 245, 60, 24);
			}
			{
				jButton27 = new JButton();
				getContentPane().add(jButton27);
				jButton27.setText("3");
				jButton27.setBounds(154, 245, 60, 24);
			}
			{
				jButton28 = new JButton();
				getContentPane().add(jButton28);
				jButton28.setText("-");
				jButton28.setBounds(225, 245, 60, 24);
			}
			{
				jButton29 = new JButton();
				getContentPane().add(jButton29);
				jButton29.setText(".");
				jButton29.setBounds(154, 280, 60, 24);
			}
			{
				jButton30 = new JButton();
				getContentPane().add(jButton30);
				jButton30.setText("+");
				jButton30.setBounds(225, 280, 60, 24);
			}
			{
				jButton31 = new JButton();
				getContentPane().add(jButton31);
				jButton31.setText("0");
				jButton31.setBounds(12, 280, 131, 24);
			}
			{
				jButton32 = new JButton();
				getContentPane().add(jButton32);
				jButton32.setText("=");
				jButton32.setBounds(296, 245, 60, 59);
			}

			pack();
			this.setSize(384, 359);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
