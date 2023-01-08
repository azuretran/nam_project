package Pview;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FPhongban extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblMPhngBan;
	private JLabel lblSinThoi;
	private JLabel lblVTr;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblnVCung;
	private JLabel lblaChDvcc;
	private JLabel lblThiGianCng;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FPhongban frame = new FPhongban();
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
	public FPhongban() {
		setTitle("Department details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(SystemColor.inactiveCaption);
			panel.setBorder(new TitledBorder(null, "CHI TI\u1EBET PH\u00D2NG BAN", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel.setBounds(10, 10, 416, 316);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblMPhngBan());
			panel.add(getLblSinThoi());
			panel.add(getLblVTr());
			panel.add(getTextField());
			panel.add(getTextField_1());
			panel.add(getTextField_2());
			panel.add(getTextField_3());
			panel.add(getLblnVCung());
			panel.add(getLblaChDvcc());
			panel.add(getLblThiGianCng());
			panel.add(getTextField_4());
			panel.add(getTextField_5());
			panel.add(getTextField_6());
			panel.add(getBtnNewButton());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("TÊN PHÒNG BAN");
			lblNewLabel.setBounds(20, 8, 93, 32);
		}
		return lblNewLabel;
	}
	private JLabel getLblMPhngBan() {
		if (lblMPhngBan == null) {
			lblMPhngBan = new JLabel("MÃ PHÒNG BAN");
			lblMPhngBan.setBounds(20, 48, 93, 32);
		}
		return lblMPhngBan;
	}
	private JLabel getLblSinThoi() {
		if (lblSinThoi == null) {
			lblSinThoi = new JLabel("SỐ ĐIỆN THOẠI");
			lblSinThoi.setBounds(20, 88, 93, 32);
		}
		return lblSinThoi;
	}
	private JLabel getLblVTr() {
		if (lblVTr == null) {
			lblVTr = new JLabel("VỊ TRÍ LÀM VIỆC");
			lblVTr.setBounds(20, 128, 93, 32);
		}
		return lblVTr;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(157, 15, 249, 19);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(157, 55, 249, 19);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(157, 95, 249, 19);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(157, 135, 249, 19);
		}
		return textField_3;
	}
	private JLabel getLblnVCung() {
		if (lblnVCung == null) {
			lblnVCung = new JLabel("ĐƠN VỊ CUNG CẤP");
			lblnVCung.setBounds(20, 168, 93, 32);
		}
		return lblnVCung;
	}
	private JLabel getLblaChDvcc() {
		if (lblaChDvcc == null) {
			lblaChDvcc = new JLabel("ĐỊA CHỈ DVCC");
			lblaChDvcc.setBounds(20, 208, 93, 32);
		}
		return lblaChDvcc;
	}
	private JLabel getLblThiGianCng() {
		if (lblThiGianCng == null) {
			lblThiGianCng = new JLabel("THỜI GIAN CỘNG TÁC");
			lblThiGianCng.setBounds(20, 248, 121, 32);
		}
		return lblThiGianCng;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(157, 175, 249, 19);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(157, 215, 249, 19);
		}
		return textField_5;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(157, 255, 249, 19);
		}
		return textField_6;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("THOÁT");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnNewButton.setBounds(321, 284, 85, 21);
		}
		return btnNewButton;
	}
}
