<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Hello world Example</title></head>
<body>
<c:forEach items="${articleList}" var="article">
    <tr>
        <td>Employee ID: <c:out value="${article.title}"/></td>
        <td>Employee Pass: <c:out value="${article.comments}"/></td>
    </tr>
</c:forEach>
</body>
</html>