package com.mercedesme.utils;

import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;

public class MessageUtil {
	private static final Map<Class<?>, XStream> XSTREAM_INSTANCE = new HashMap<>();

	/**
	 * xml转换为对象
	 */
	 @SuppressWarnings("unchecked")
	public static <T> T fromXml(Class<T> clazz, String xml) {
		if (!XSTREAM_INSTANCE.containsKey(clazz)) {
			putStreamByClass(clazz);
		}
		T object = (T) XSTREAM_INSTANCE.get(clazz).fromXML(xml);
		return object;
	}

	/**
	 * 对象转换为 xml
	 * 
	 * @param <T>
	 */
	public static <T> String toXml(Class<T> clazz, T object) {
		if (!XSTREAM_INSTANCE.containsKey(clazz)) {
			putStreamByClass(clazz);
		}
		return XSTREAM_INSTANCE.get(clazz).toXML(object);
	}

	private static <T> void putStreamByClass(Class<T> clazz) {
		XStream xstream = getInstance();
		xstream.processAnnotations(clazz);
		if (clazz.isAssignableFrom(Map.class)) {
			xstream.alias("xml", Map.class);
			xstream.registerConverter(new MapEntryConverter());
		}
		XSTREAM_INSTANCE.put(clazz, xstream);
	}

	public static XStream getInstance() {
		XStream xstream = new XStream(new XppDriver() {

			@Override
			public HierarchicalStreamWriter createWriter(Writer out) {
				return new PrettyPrintWriter(out, getNameCoder()) {
					protected String PREFIX_CDATA = "<![CDATA[";
					protected String SUFFIX_CDATA = "]]>";
					protected String PREFIX_MEDIA_ID = "<MediaId>";
					protected String SUFFIX_MEDIA_ID = "</MediaId>";

					@Override
					protected void writeText(QuickWriter writer, String text) {
						if (text.startsWith(this.PREFIX_CDATA) && text.endsWith(this.SUFFIX_CDATA)) {
							writer.write(text);
						} else if (text.startsWith(this.PREFIX_MEDIA_ID) && text.endsWith(this.SUFFIX_MEDIA_ID)) {
							writer.write(text);
						} else {
							super.writeText(writer, text);
						}

					}

					@Override
					public String encodeNode(String name) {
						return name;
					}
				};
			}
		});
		xstream.ignoreUnknownElements();
		xstream.setMode(XStream.NO_REFERENCES);
		xstream.addPermission(NullPermission.NULL);
		xstream.addPermission(PrimitiveTypePermission.PRIMITIVES);
		return xstream;
	}
}
