package Pview;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import Pmodels.ChitietDA;
import Pmodels.TTchitiet;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class FTTchitiet extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblMNhnVin;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JScrollPane scrollPane;
	private JButton btnChiTietDA;
	private JList list;
	private JButton btnExit;
	private JButton btnChiTietPB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FTTchitiet frame = new FTTchitiet();
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
	public  FTTchitiet() {
		setTitle("Employee information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 535);
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
			panel.setBorder(new TitledBorder(null, "TH\u00D4NG TIN CHI TI\u1EBET", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 10, 335, 488);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblMNhnVin());
			panel.add(getTextField());
			panel.add(getTextField_1());
			panel.add(getPanel_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("HỌ VÀ TÊN");
			lblNewLabel.setBounds(10, 30, 64, 13);
		}
		return lblNewLabel;
	}
	private JLabel getLblMNhnVin() {
		if (lblMNhnVin == null) {
			lblMNhnVin = new JLabel("MÃ NHÂN VIÊN");
			lblMNhnVin.setBounds(10, 53, 92, 13);
		}
		return lblMNhnVin;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(112, 27, 213, 19);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(112, 50, 213, 19);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(SystemColor.inactiveCaption);
			panel_1.setBounds(10, 76, 315, 402);
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_1());
			panel_1.add(getLblNewLabel_1_1());
			panel_1.add(getLblNewLabel_1_2());
			panel_1.add(getTextField_2());
			panel_1.add(getTextField_3());
			panel_1.add(getScrollPane());
			panel_1.add(getBtnChiTietDA());
			panel_1.add(getBtnExit_1());
			panel_1.add(getBtnChiTietPB());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("PHÒNG BAN");
			lblNewLabel_1.setBounds(10, 40, 73, 20);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("VỊ TRÍ");
			lblNewLabel_1_1.setBounds(10, 10, 73, 20);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("DỰ ÁN ĐANG HOẠT ĐỘNG");
			lblNewLabel_1_2.setBounds(10, 70, 136, 20);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(102, 11, 203, 19);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(102, 41, 108, 19);
		}
		return textField_3;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportBorder(new TitledBorder(null, "K\u1EF8 N\u0102NG", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane.setBounds(10, 100, 295, 259);
			scrollPane.setViewportView(getList_1());
		}
		return scrollPane;
	}
	private JButton getBtnChiTietDA() {
		if (btnChiTietDA == null) {
			btnChiTietDA = new JButton("CHI TIẾT");
			btnChiTietDA.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FChitietDA ChitietDA = new FChitietDA();
					ChitietDA.setVisible(true);
				}
			});
			btnChiTietDA.setBounds(220, 70, 85, 21);
		}
		return btnChiTietDA;
	}
	private JList getList_1() {
		if (list == null) {
			list = new JList();
		}
		return list;
	}
	private JButton getBtnExit_1() {
		if (btnExit == null) {
			btnExit = new JButton("THOÁT");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FTTchitiet.DISPOSE_ON_CLOSE;
				}});
			btnExit.setBounds(220, 369, 85, 21);
		}
		return btnExit;
	}
	private JButton getBtnChiTietPB() {
		if (btnChiTietPB == null) {
			btnChiTietPB = new JButton("CHI TIẾT");
			btnChiTietPB.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FPhongban phongban = new FPhongban();
					phongban.setVisible(true);
				}
			});
			btnChiTietPB.setBounds(220, 40, 85, 21);
		}
		return btnChiTietPB;
	}
}
