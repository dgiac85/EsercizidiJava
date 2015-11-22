<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="DataManagementError.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: JSTL Core ::</title>
    </head>
    <body>
        <table>
            <c:set var="start" value="1" />
            <c:set var="end" value="10" />
            <c:forEach var="ix" begin="${start}" end="${end}" varStatus="status">
                <c:choose>
                    <c:when test="${ix % 2 == 0}">
                        <tr>
                            <td style="background-color: red">
                                <c:out value="(${status.count}) sono una riga PARI" />                                
                            </td>
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <tr>
                            <td style="background-color: yellow">
                                <c:out value="(${status.count}) sono una riga DISPARI" />    
                            </td>
                        </tr>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </table>
    </body>
</html>
