package sample;
import org.apache.commons.lang.StringUtils;

public class StringUtil {
	
	public final String TRUN_STRING = " ... (truncated) ..."; 
	
	public  String truncate(String termsAndConditions,int maxLength){
		String truncatedStr = "";
		int truncatedLength = TRUN_STRING.length();
		int strLength = 0;
		boolean canBeTruncated = false;
		if(StringUtils.isNotBlank(termsAndConditions)){
			strLength = termsAndConditions.length();
			canBeTruncated = true;
		}
		//truncate has to happen only when the string is not null
		if(canBeTruncated && maxLength > 0){
			//if string length is less than the max length , then return whole string
			if(strLength <= maxLength){
				truncatedStr = termsAndConditions;
			}else if(strLength > maxLength){
				//if the maxLength is less than truncate constant, then return the whole string
				if(truncatedLength >= maxLength){
					truncatedStr = termsAndConditions;
				}else if(truncatedLength < maxLength){//if the maxlength is greater than truncate constant,then truncate the string 
					int toBeTruncated = (maxLength - truncatedLength) / 2 ;
					int modCount = (maxLength - truncatedLength) % 2 ;
					
					StringBuilder strBuilder = new StringBuilder();
					if(modCount == 0){
					strBuilder.append(termsAndConditions.substring(0, toBeTruncated)).append(TRUN_STRING).append(termsAndConditions.substring((strLength-toBeTruncated),strLength));
					}else{
						strBuilder.append(termsAndConditions.substring(0, toBeTruncated)).append(TRUN_STRING).append(termsAndConditions.substring((strLength-(toBeTruncated+modCount)),strLength));
					}
					truncatedStr  = strBuilder.toString();
				}
			}
		}
		return truncatedStr;
	}
	

}
