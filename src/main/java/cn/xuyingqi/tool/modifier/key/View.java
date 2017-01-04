package cn.xuyingqi.tool.modifier.key;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import cn.xuyingqi.util.util.ListFactory;

/**
 * 展示面板
 * 
 * @author XuYQ
 *
 */
public class View extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * S键
	 */
	private JCheckBox v_s;

	/**
	 * Alt键
	 */
	private JCheckBox v_alt;
	/**
	 * Tab键
	 */
	private JCheckBox v_tab;

	/**
	 * 是否连续点击
	 */
	private JCheckBox isConsecutiveClick;

	/**
	 * 执行按钮
	 */
	private JButton execute;

	/**
	 * 展示面板
	 */
	public View() {

		// S键
		this.v_s = new JCheckBox("S");
		this.v_s.setSelected(true);

		// Alt键
		this.v_alt = new JCheckBox("Alt");
		this.v_alt.setSelected(true);
		// Tab键
		this.v_tab = new JCheckBox("Tab");

		// 是否连续点击
		this.isConsecutiveClick = new JCheckBox("连续点击");

		// 执行按钮
		this.execute = new JButton("执行");

		// 添加点击事件
		this.execute.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// 按键集合
				List<Integer> keyCodes = ListFactory.newInstance();

				// S键
				if (v_s.isSelected()) {
					keyCodes.add(KeyEvent.VK_S);
				}

				// Alt键
				if (v_alt.isSelected()) {
					keyCodes.add(KeyEvent.VK_ALT);
				}
				// Tab键
				if (v_tab.isSelected()) {
					keyCodes.add(KeyEvent.VK_TAB);
				}

				// 执行
				Control.keyPress(0, keyCodes, isConsecutiveClick.isSelected());
			}
		});

		// 初始化展示面板
		this.init();
	}

	/**
	 * 初始化展示面板
	 */
	private void init() {

		// 设置布局
		this.setLayout(new FlowLayout());

		// S键
		this.add(this.v_s);

		// Alt键
		this.add(this.v_alt);
		// Tab键
		this.add(this.v_tab);

		// 是否连续点击
		this.add(this.isConsecutiveClick);

		// 执行按钮
		this.add(this.execute);
	}
}
