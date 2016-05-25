package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
	
	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		//��ȡҳ���ύ���������Լ�������ֵ
		Map<String, Object> parameters = ai.getInvocationContext().getParameters();
		//��ÿ�����ԡ�����ֵ�ֱ���й��ˣ������˺�������ٱ��浽��������
		for(String key : parameters.keySet()) {
			Object value = parameters.get(key);
			if(value != null && value instanceof String[]) {
				String[] valueArray = (String[]) value;
				for(int i = 0; i < valueArray.length; i++) {
					if(valueArray[i] != null) {
						//�ж��û��ύ�����������Ƿ���Ҫ���˵�����
						if(valueArray[i].contains("����")) {
							//�ԡ�ϲ��������Ҫ���˵����ݡ����ᡱ
							valueArray[i] = valueArray[i].replaceAll("����", "ϲ��");
							//��������������������ΪAction����������
							parameters.put(key, valueArray);
						}
					}
				}
			}
		}
		return ai.invoke();
	}

}
