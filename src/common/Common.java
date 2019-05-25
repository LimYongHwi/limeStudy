package common;

import org.springframework.beans.factory.annotation.Autowired;

import common.service.CommonService;

/*
 * 	 �����ڹټҽ� 
 */
public class Common {
	private CommonService commonService;
	/**
	 * ���ڰ��� ����ִ��� üũ ���鵵üũ
	 * �ӿ���
	 * @example  <if test="@common.Common@isEmpty(str)">
	 * @param str
	 * @return
	 */
	public boolean isEmpty(String str) {
		if(str!=null&&!str.equals("")) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * ���ڰ��� ������������� üũ ������ �ƴ�����üũ
	 * �ӿ���
	 * @example  <if test="@common.Common@isNotEmpty(str)">
	 * @param str
	 * @return
	 */
	public boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	/*
	 * ����ð� �����ȸ 
	 * �ӿ���
	 **/
	public String getTime() {
		return commonService.getTime();
	}
}
