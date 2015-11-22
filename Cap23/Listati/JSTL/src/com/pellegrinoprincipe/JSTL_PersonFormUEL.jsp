<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="DataManagementError.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>:: Info su di una persona ::</title>
        <style type="text/css">
            .style1
            {
                width: 171px;
            }
            .style2
            {
                width: 289px;
            }
            table
            {
                font-family: Tahoma;
                font-size: 12px;
            }
        </style>
    </head>
    <body style="width: 619px; height: 207px">

        <%-- bean per la data --%>  
        <jsp:useBean id="now" class="java.util.Date" />

        <%-- Ottengo l'header del linguaggio locale --%>  
        <c:set var="locale" value="${header['accept-language']}" />

        <%-- imposto un contesto di localizzazione --%>  
        <fmt:setBundle basename="com.pellegrinoprincipe.PersonInfos" var="PI" />

        <%-- ricerca ed utilizzo del corrente locale --%>  
        <c:forTokens var="l" items="${locale}" delims="," varStatus="status">
            <c:if test="${status.count == 1}">
                <c:set var="locale_mf" value="${l}" />
                <fmt:setLocale value="${locale_mf}" />
                <c:choose>
                    <c:when test="${locale_mf == 'it-IT'}">
                        <c:set var="tzone" value="Europe/Rome" />
                    </c:when>
                    <c:when test="${locale_mf == 'en-US'}">
                        <c:set var="tzone" value="America/New_York" />
                    </c:when>
                </c:choose>
            </c:if>
        </c:forTokens>

        <fmt:formatDate value="${now}" type="both" timeZone="${tzone}" var="dt" />

        <form id="f" name="f" method="post" action="PersonSetInfosUEL.jsp">
            <fieldset>
                <legend>Info --> [${dt}]</legend>
                <table style="width: 79%;">
                    <tr>
                        <td class="style1">
                            <fmt:message key="first_name" bundle="${PI}" />
                        </td>
                        <td class="style2">
                            <input id="txt_fn" name="first_name" type="text" />
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            <fmt:message key="last_name" bundle="${PI}" />
                        </td>
                        <td class="style2">
                            <input id="txt_ln" name="last_name" type="text" />
                        </td>    
                    </tr>
                    <tr>
                        <td class="style1">
                            <fmt:message key="age" bundle="${PI}" />
                        </td>
                        <td class="style2">
                            <input id="txt_age" name="age" type="text" />
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            <fmt:message key="address" bundle="${PI}" />
                        </td>
                        <td class="style2">
                            <input id="txt_add" name="address" type="text" />
                        </td>    
                    </tr>
                    <tr>
                        <td class="style1">
                            <fmt:message key="job" bundle="${PI}" />
                        </td>
                        <td class="style2">
                            <input id="txt_jb" name="job" type="text" />
                        </td>    
                    </tr>
                    <tr>
                        <td class="style1">
                            &nbsp;
                        </td>
                        <td class="style2">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            &nbsp;
                        </td>
                        <td class="style2">
                            <fmt:message key="button" bundle="${PI}" var="bmsg" />
                            <input id="sub" name="submit" type="submit" value="${bmsg}" />
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>