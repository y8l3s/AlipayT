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
				<s:set var="books" value="#request.books"/>
				<s:if test="#books.size!=0">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<font color="blue"><h3>���з���������ͼ��</h3></font><br>
					<s:iterator value="#books" var="book">
						<table width="600" border="0">
							<tr>
								<td width="200" align="center">
									<img src="/bookstore/picture/<s:property value="#book.picture"/>" width="100">
								</td>
								<td valign="top" width="400">
									<table>
										<tr>
											<td>
												����:<s:property value="#book.bookname"/><br>
											</td>
										</tr>
										<tr>
											<td>
												�۸�:<s:property value="#book.price"/>Ԫ
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</s:iterator>
				</s:if>
				<s:else>
					�Բ���û�к��ʵ�ͼ�飡
				</s:else>
			</div>
		</div>
	</div>
	<jsp:include page="foot.jsp"/>
</body>
</html>
