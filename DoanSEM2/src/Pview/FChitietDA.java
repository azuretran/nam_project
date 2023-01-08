package Pview;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FChitietDA extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblMDn;
	private JLabel lblKinhPhD;
	private JLabel lblVTrD;
	private JLabel lblDnSThnh;
	private JLabel lblVTrD_1_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FChitietDA frame = new FChitietDA();
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
	public FChitietDA() {
		setTitle("Project details");
		setBackground(SystemColor.inactiveCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 310);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(SystemColor.inactiveCaption);
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "TH\u00D4NG TIN D\u1EF0 \u00C1N", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 10, 340, 253);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getTextField());
			panel.add(getLblMDn());
			panel.add(getLblKinhPhD());
			panel.add(getLblVTrD());
			panel.add(getLblDnSThnh());
			panel.add(getLblVTrD_1_1());
			panel.add(getTextField_1());
			panel.add(getTextField_2());
			panel.add(getTextField_3());
			panel.add(getTextField_4());
			panel.add(getTextField_5());
			panel.add(getBtnNewButton());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("TÊN DỰ ÁN");
			lblNewLabel.setBounds(10, 20, 69, 24);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(125, 23, 200, 19);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblMDn() {
		if (lblMDn == null) {
			lblMDn = new JLabel("MÃ DỰ ÁN");
			lblMDn.setBounds(10, 54, 69, 24);
		}
		return lblMDn;
	}
	private JLabel getLblKinhPhD() {
		if (lblKinhPhD == null) {
			lblKinhPhD = new JLabel("KINH PHÍ DỰ TOÁN");
			lblKinhPhD.setBounds(10, 88, 107, 24);
		}
		return lblKinhPhD;
	}
	private JLabel getLblVTrD() {
		if (lblVTrD == null) {
			lblVTrD = new JLabel("VỊ TRÍ DỰ ÁN ");
			lblVTrD.setBounds(10, 122, 107, 24);
		}
		return lblVTrD;
	}
	private JLabel getLblDnSThnh() {
		if (lblDnSThnh == null) {
			lblDnSThnh = new JLabel("DÂN SỐ THÀNH PHỐ");
			lblDnSThnh.setBounds(10, 156, 107, 24);
		}
		return lblDnSThnh;
	}
	private JLabel getLblVTrD_1_1() {
		if (lblVTrD_1_1 == null) {
			lblVTrD_1_1 = new JLabel("KỸ NĂNG ĐÃ DÙNG");
			lblVTrD_1_1.setBounds(10, 190, 107, 24);
		}
		return lblVTrD_1_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(125, 57, 200, 19);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(125, 91, 198, 19);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(125, 125, 198, 19);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(125, 159, 198, 19);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(125, 193, 198, 19);
		}
		return textField_5;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("THOÁT");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnNewButton.setBounds(245, 222, 85, 21);
		}
		return btnNewButton;
	}
}
