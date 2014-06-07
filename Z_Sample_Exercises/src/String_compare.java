
public class String_compare {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String response="<licenseQueryVO><installDate xsi:nil='true'/><softwareKey>9zyQbSybdA0zRcx</softwareKey><productLine/></licenseQueryVO><licenseQueryVO><softwareKey>G94tWCtfTJSB9GmMg3RfPaYSHC4GJPLQBJfrJ</softwareKey><transactionKey xsi:nil='true'/></licenseQueryVO>";
		String expResponse="<licenseQueryVO><installDate xsi:nil='true'/>";
		response = response.replaceAll(" ", "");
		expResponse = expResponse.replaceAll(" ", "");
		System.out.println(expResponse);
		boolean compare = response.contains(expResponse);
		System.out.println(response.indexOf("<softwareKey>"));
		System.out.println(response.indexOf("</softwareKey>"));
		int i = response.indexOf("<softwareKey>");
		int j=response.indexOf("</softwareKey>");
		StringBuffer sb= new StringBuffer(response);;
		while(i!=-1)
		{
			sb.delete(i, j+14);
			i = sb.indexOf("<softwareKey>");
			j =sb.indexOf("</softwareKey>");
			System.out.println(sb);
		}
		response = new String (sb);
		boolean comparision = response.contains(expResponse);
		System.out.println(comparision);
		System.out.println(response.charAt(j+13));
		 
		
		System.out.println(sb);
		System.out.println(response);
		
	}

}
