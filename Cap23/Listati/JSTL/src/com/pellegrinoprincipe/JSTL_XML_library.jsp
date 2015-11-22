<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="DataManagementError.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"></meta>
    <title>:: Library ::</title>
</head>
<body>
    <table border="1"> 
        <tr> 
            <th>Titolo</th> 
            <th>Linguaggio</th>
            <th>Prezzo</th> 
            <th>Autore</th> 
        </tr> 

        <%-- importo il documento XML --%>
        <c:import url="Library.xml" var="library"/> 

        <%-- parserizzo  il documento XML --%>
        <x:parse doc="${library}" var="_doc_"/> 

        <%-- seleziono tutti i libri --%>
        <x:forEach var="b" select="$_doc_/library/book"> 
            <tr> 
                <td><x:out select="$b/title"/></td> 
                <td><x:out select="$b/title/@lang"/></td> 
                <td><x:out select="$b/price"/></td> 
                <td><x:out select="$b/author"/></td> 
            </tr> 
        </x:forEach> 
    </table>
</body>
</html>
