<%@ include file="/html/execactivity/test/admin/init.jsp" %>

  <liferay-util:include page="/html/questions/admin/editquestions.jsp" servletContext="<%=this.getServletContext() %>">
  	<liferay-util:param value="<%=Long.toString(learnact.getActId()) %>" name="resId"/>
  </liferay-util:include>
