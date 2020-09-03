<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
   <head></head>
 
   <body>
      <h1>This is the body of the sample view - ${msg} - <c:out value="${sessionScope.TEST}"/> -          />
      </h1>	
   </body>
</html>