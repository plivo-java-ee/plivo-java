package org.plivo.ee.helper.xml.elements;

import java.util.ArrayList;
import java.util.HashMap;

import org.plivo.ee.helper.exception.PlivoException;


// TODO: Auto-generated Javadoc
/**
 * The Class PlivoElement.
 */
public class PlivoElement {

	protected String tag;

	protected String body;

	protected HashMap<String, String> attributes;

	protected ArrayList<PlivoElement> childTags;

	protected ArrayList<String> nestableElements;

	public static final String O_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

	public static final String E_RESPONSE = "Response";

	public static final String E_CONFERENCE = "Conference";

	public static final String E_DIAL = "Dial";

	public static final String E_NUMBER = "Number";

	public static final String E_USER = "User";

	public static final String E_GETDIGITS = "GetDigits";

	public static final String E_HANGUP = "Hangup";

	public static final String E_MESSAGE = "Message";

	public static final String E_PLAY = "Play";

	public static final String E_PREANSWER = "PreAnswer";

	public static final String E_RECORD = "Record";

	public static final String E_REDIRECT = "Redirect";

	public static final String E_SPEAK = "Speak";

	public static final String E_WAIT = "Wait";

	public static final String E_DTMF = "DTMF";

	public static final String O_TAG = "<";

	public static final String C_TAG = ">";

	public static final String SLASH = "/";

	public static final String DBL = "\"";

	public static final String EQU = "=";

	public static final String SPACE = " ";

	/**
	 * Instantiates a new verb.
	 * 
	 * @param tag
	 *            the tag
	 * @param body
	 *            the body
	 */
	public PlivoElement(String tag, String body)
	// TODO Auto-generated constructor stub
	{
		this.tag = tag;
		this.body = body;
		this.attributes = new HashMap<String, String>();
		this.childTags = new ArrayList<PlivoElement>();
	}

	/**
	 * Append.
	 * 
	 * @param nestable
	 *            element
	 * @return element
	 * @throws PlivoException
	 *             the plivo exception
	 */
	public PlivoElement append(PlivoElement element) throws PlivoException {
		if (this.nestableElements != null
				&& this.nestableElements.contains(element.getTag())) {
			this.childTags.add(element);
			return element;
		} else {
			throw new PlivoException(String.format(
					"<%1s> is not nestable in <%2s>.", element.getTag(),
					this.getTag()));
		}
	}

	/**
	 * To xml.
	 * 
	 * @return the string
	 */

	public String toXML() {
		StringBuffer xml;
		if (E_RESPONSE.equals(this.tag)) {
			xml = new StringBuffer(O_XML).append(O_TAG);
		} else {
			xml = new StringBuffer(O_TAG);
		}
		xml.append(this.tag);
		for (String key : attributes.keySet()) {
			xml.append(SPACE).append(key).append(EQU).append(DBL)
					.append(attributes.get(key)).append(DBL);
		}

		if (this.body != null) {
			xml.append(C_TAG).append(this.body).append(O_TAG).append(SLASH)
					.append(this.tag).append(C_TAG);
		} else if (!this.childTags.isEmpty()) {
			xml.append(C_TAG);
			for (PlivoElement child : childTags) {
				xml.append(child.toXML());
			}
			xml.append(O_TAG).append(SLASH).append(this.tag).append(C_TAG);
		} else {
			xml.append(SLASH).append(C_TAG);
		}
		return xml.toString();
	}

	/**
	 * Sets the attributes for XML element.
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public void set(String key, String value) {
		attributes.put(key, value);
	}

	/**
	 * Gets the body.
	 * 
	 * @return the body
	 */
	public String getBody() {
		return this.body;
	}

	/**
	 * Gets the tag.
	 * 
	 * @return the tag
	 */
	public String getTag() {
		return this.tag;
	}

	/**
	 * Gets the children.
	 * 
	 * @return the children
	 */
	public ArrayList<PlivoElement> getChildren() {
		return this.childTags;
	}

	/**
	 * Gets the attributes.
	 * 
	 * @return the attributes
	 */
	public HashMap<String, String> getAttributes() {
		return this.attributes;
	}

}
