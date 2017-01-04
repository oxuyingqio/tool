package cn.xuyingqi.tool.view.main;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import cn.xuyingqi.tool.config.FunctionXml;
import cn.xuyingqi.tool.config.FunctionXml.FunctionConfig;

/**
 * 内容面板
 * 
 * @author XuYQ
 *
 */
public class ContentPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 内容面板
	 */
	public ContentPanel() {

		// 初始化内容面板
		this.init();
	}

	/**
	 * 初始化内容面板
	 */
	private void init() {

		// 设置布局
		this.setLayout(new BorderLayout());

		// 添加tab页
		JTabbedPane tab = new JTabbedPane();

		// 功能配置集合
		List<FunctionConfig> configs = FunctionXml.getInstance().getFunctionConfigs();
		for (int i = 0, length = configs.size(); i < length; i++) {

			try {

				tab.add(configs.get(i).getDesc(), (JPanel) this.getClass().getClassLoader()
						.loadClass(configs.get(i).getClassName()).newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		this.add(tab, BorderLayout.CENTER);
	}
}
