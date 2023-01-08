package Pview;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pcontrols.QLnhansuControl;
import Pmodels.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class FQLnhansu extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField txtNhpTm;
	private JButton btnNewButton;
	private JButton btnChiTiet;
	private JLabel lblNewLabel;
	private JLabel lblVTr;
	private JLabel lblVTr_2;
	private JLabel lblVTr_2_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton_2;
	private JButton btnNewButton_2_1;
	private JButton btnNewButton_2_1_1;
	private JButton btnNewButton_2_1_1_1;
	JList<QLnhansu> list_nhansu = new JList<QLnhansu>();

	/**
	 * Launch the application.
	 */
	private DefaultListModel<QLnhansu> lstModelLnhansu = new DefaultListModel<QLnhansu>();
	// Khai báo biến bsung
	QLnhansuControl qLnhansuControl = new QLnhansuControl();
	List<QLnhansu> nhansus = new ArrayList<>();
	

	void LoadLoaiSach() {
		for (QLnhansu nhansu : nhansus) {
			lstModelLnhansu.addElement(nhansu);
		}
	}

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FQLnhansu frame = new FQLnhansu();
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
	public FQLnhansu() {
		setTitle("SEM_2 FINAL PROJECT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 516);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(SystemColor.inactiveCaption);
			panel.setForeground(SystemColor.info);
			panel.setBounds(20, 10, 1051, 459);
			panel.setLayout(null);
			panel.add(getScrollPane());
			panel.add(getPanel_1());
			panel.add(getPanel_2());
			panel.add(getBtnNewButton_2());
			panel.add(getBtnNewButton_2_1());
			panel.add(getBtnNewButton_2_1_1());
			panel.add(getBtnNewButton_2_1_1_1());
		}
		return panel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 10, 644, 439);
			
			
			scrollPane.setViewportView(getListLoaiSach());
		}
		return scrollPane;
	}
	
	private JList<QLnhansu> getListLoaiSach() {
		if (list_nhansu == null) {
			list_nhansu = new JList<QLnhansu>();
			list_nhansu.setBackground(SystemColor.inactiveCaptionBorder);
			list_nhansu.setModel(lstModelLnhansu);
		}
		return list_nhansu;
	}
	

	/**
	 * @wbp.nonvisual location=126,244
	 */
	private DefaultListModel<QLnhansu> getDefaultListModel() {
		if (lstModelLnhansu == null) {
			lstModelLnhansu = new DefaultListModel<QLnhansu>();
		}
		return lstModelLnhansu;
	}
	/**
	 * @wbp.nonvisual location=126,244
	 */
	
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(SystemColor.activeCaption);
			panel_1.setForeground(SystemColor.info);
			panel_1.setBounds(664, 147, 377, 130);
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel());
			panel_1.add(getLblVTr());
			panel_1.add(getLblVTr_2());
			panel_1.add(getLblVTr_2_1());
			panel_1.add(getTextField_1());
			panel_1.add(getTextField_2());
			panel_1.add(getTextField_3());
			panel_1.add(getTextField_4());
			panel_1.add(getBtnChiTiet());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBackground(SystemColor.inactiveCaption);
			panel_2.setBounds(664, 10, 377, 97);
			panel_2.setLayout(null);
			panel_2.add(getTxtNhpTm());
			panel_2.add(getBtnNewButton());
		}
		return panel_2;
	}
	private JTextField getTxtNhpTm() {
		if (txtNhpTm == null) {
			txtNhpTm = new JTextField();
			txtNhpTm.setText("     Nhập để tìm kiếm");
			txtNhpTm.setBounds(10, 10, 357, 39);
			txtNhpTm.setColumns(10);
		}
		return txtNhpTm;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("TÌM KIẾM");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnNewButton.setBounds(129, 57, 133, 21);
		}
		return btnNewButton;
	}
	private JButton getBtnChiTiet() {
		if (btnChiTiet == null) {
			btnChiTiet = new JButton("CHI TIẾT");
			btnChiTiet.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnChiTiet.setBounds(255, 103, 112, 21);
			btnChiTiet.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FTTchitiet TTchitiet = new FTTchitiet();
					TTchitiet.setVisible(true);
				}
			});
		}
		return btnChiTiet;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("HỌ VÀ TÊN");
			lblNewLabel.setBounds(10, 10, 63, 13);
		}
		return lblNewLabel;
	}
	private JLabel getLblVTr() {
		if (lblVTr == null) {
			lblVTr = new JLabel("MÃ NHÂN VIÊN");
			lblVTr.setBounds(10, 33, 82, 13);
		}
		return lblVTr;
	}
	private JLabel getLblVTr_2() {
		if (lblVTr_2 == null) {
			lblVTr_2 = new JLabel("VỊ TRÍ");
			lblVTr_2.setBounds(10, 56, 82, 13);
		}
		return lblVTr_2;
	}
	private JLabel getLblVTr_2_1() {
		if (lblVTr_2_1 == null) {
			lblVTr_2_1 = new JLabel("PHÒNG BAN");
			lblVTr_2_1.setBounds(10, 79, 82, 13);
		}
		return lblVTr_2_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(97, 7, 270, 19);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(97, 30, 270, 19);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(97, 53, 270, 19);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(97, 76, 270, 19);
		}
		return textField_4;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("THÊM");
			btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnNewButton_2.setBounds(727, 309, 112, 37);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_2_1() {
		if (btnNewButton_2_1 == null) {
			btnNewButton_2_1 = new JButton("XÓA");
			btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnNewButton_2_1.setBounds(873, 309, 112, 37);
		}
		return btnNewButton_2_1;
	}
	private JButton getBtnNewButton_2_1_1() {
		if (btnNewButton_2_1_1 == null) {
			btnNewButton_2_1_1 = new JButton("SỬA");
			btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnNewButton_2_1_1.setBounds(727, 356, 112, 37);
		}
		return btnNewButton_2_1_1;
	}
	private JButton getBtnNewButton_2_1_1_1() {
		if (btnNewButton_2_1_1_1 == null) {
			btnNewButton_2_1_1_1 = new JButton("LƯU");
			btnNewButton_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnNewButton_2_1_1_1.setBounds(873, 356, 112, 37);
		}
		return btnNewButton_2_1_1_1;
	}
}
