function validate(){
	var name=document.forms[0].userName.value;
	var pwd=document.forms[0].userPwd.value;
	var pwd1=document.forms[0].userPwd1.value;
	var email=document.forms[0].userEmail.value;
	var accept=document.forms[0].accept.checked;
	var reg1=/[a-zA-Z]\w*/;
	var reg2=/\w+([-+.']\w+)*@\w+([-.]\w+)*.\w+([-.]\w+)*/;
	if(name.length<=0)alert("�û�������Ϊ�գ�");
	else if(!reg1.test(name))alert("�û�����ʽ����ȷ��");
	else if(pwd.length<6)alert("���볤�ȱ�����ڵ���6��");
	else if(pwd!=pwd1)alert("�������벻һ�£�");
	else if(!reg2.test(email))alert("�ʼ���ʽ����ȷ��");
	else if(accept==false)alert("����Ҫ��ϸ�Ķ���ͬ������û�ʹ��Э�飡");
	else document.forms[0].submit();
}