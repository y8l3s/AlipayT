<%@ page contentType="text/html;charset=gb2312" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
	<title>�������</title>
	<link href="css/bookstore.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<jsp:include page="head.jsp"/>
	<div class="content">
		<div class="left">
			<div class="list_box">
				<div class="list_bk">
					<s:action name="browseCatalog" executeResult="true"/>
				</div>
			</div>
		</div>
		<div class="right">
			<div class="right_box">
				<font face="����"></font><font face="����"></font><font face="����"></font><font face="����"></font>
				<div class="info_bk1">
					<div align="center">
						<h3>������ӳɹ���</h3>
						<s:property value="#session.user.username"/>�����Ķ����Ѿ��´������Ϊ
						<s:property value="#request.order.orderid"/>�����ǻ���3���ڼ���ͼ�������
						<br><br>
						<a href="logout.action">�˳���¼</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="foot.jsp"/>
</body>
</html>
