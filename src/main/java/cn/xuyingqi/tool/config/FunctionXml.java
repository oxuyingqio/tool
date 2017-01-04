package cn.xuyingqi.tool.config;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import cn.xuyingqi.util.util.ListFactory;

/**
 * function.xml配置
 * 
 * @author XuYQ
 *
 */
@XmlRootElement(name = "function")
@XmlAccessorType(XmlAccessType.FIELD)
public final class FunctionXml {

	/**
	 * function.xml配置
	 */
	private static FunctionXml functionXml;

	/**
	 * 功能配置集合
	 */
	@XmlElements(value = { @XmlElement(name = "function", type = FunctionConfig.class) })
	private List<FunctionConfig> functionConfigs;

	/**
	 * 私有构造方法
	 */
	private FunctionXml() {

		// 初始化功能配置集合
		this.functionConfigs = ListFactory.newInstance();
	}

	/**
	 * 获取function.xml配置实例
	 * 
	 * @return
	 */
	public static final FunctionXml getInstance() {

		if (functionXml == null) {

			try {

				JAXBContext jc = JAXBContext.newInstance(FunctionXml.class);
				Unmarshaller u = jc.createUnmarshaller();
				functionXml = (FunctionXml) u.unmarshal(Class.class.getResourceAsStream(Constant.FUNCTION_FILE));
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}

		return functionXml;
	}

	/**
	 * 获取功能配置集合
	 * 
	 * @return
	 */
	public List<FunctionConfig> getFunctionConfigs() {

		return functionConfigs;
	}

	/**
	 * 功能配置
	 * 
	 * @author XuYQ
	 *
	 */
	public static final class FunctionConfig {

		/**
		 * 功能描述
		 */
		@XmlAttribute(name = "desc")
		private String desc;

		/**
		 * 功能类路径
		 */
		@XmlAttribute(name = "className")
		private String className;

		/**
		 * 获取功能描述
		 * 
		 * @return
		 */
		public String getDesc() {

			return desc;
		}

		/**
		 * 获取功能类路径
		 * 
		 * @return
		 */
		public String getClassName() {

			return className;
		}
	}
}
