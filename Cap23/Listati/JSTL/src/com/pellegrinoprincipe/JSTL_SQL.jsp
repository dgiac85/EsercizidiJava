<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="DataManagementError.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"></meta>
    <title>:: Library ::</title>
</head>
<body>

    <%-- imposto il datasource --%>
    <sql:setDataSource url="jdbc:mysql://localhost:3306/articoli" driver="com.mysql.jdbc.Driver"
                       user="java8" password="java8" var="ds"/>

    <c:set var="desc" value="Lingua%" />

    <%-- effettuo la query parametrizzata --%>   
    <sql:query var="result" dataSource="${ds}">
        select * from genere where descrizione like ?;
        <sql:param value="${desc}" />
    </sql:query>
 
    <%-- mostro il risultato --%>
    <table border="1">
        <tr>
            <c:forEach var="column_name" items="${result.columnNames}">
                <th><c:out value="${column_name}"/></th>
            </c:forEach>
        </tr>
        <c:forEach var="row" items="${result.rows}">
            <tr>
                <td><c:out value="${row.id_genere}"/></td>
                <td><c:out value="${row.descrizione}"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>