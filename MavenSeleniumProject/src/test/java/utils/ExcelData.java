package utils;
public class ExcelData {

    private String opreat;

    private String element;

    private String value;

	public String getOpreat() {
		return opreat;
	}

	public void setOpreat(String opreat) {
		this.opreat = opreat;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ExcelData [opreat=" + opreat + ", element=" + element + ", value=" + value + "]";
	}
	
	

    
}