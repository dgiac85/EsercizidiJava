<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="DataManagementError.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: Set delle informazioni ::</title>
    </head>
    <%-- uso il bean --%>  
    <jsp:useBean id="person" class="com.pellegrinoprincipe.PersonInfos" scope="session"></jsp:useBean>
    <%-- imposto tutte le proprietà del bean --%> 
    <jsp:setProperty name="person" property="*"></jsp:setProperty>
    <body>
        <h3>Informazioni memorizzate:</h3>
        <table style="border-style: dotted; border-width: 2px; width: 25%">
            <tr>
                <td>
                    Nome:
                </td>
                <td>
                    ${person.first_name}
                </td>
            </tr>
            <tr>
                <td>
                    Cognome:
                </td>
                <td>
                    ${person.last_name}
                </td>    
            <tr>
            <tr>
                <td>
                    Età:
                </td>
                <td>
                    ${person.age}
                </td>
            </tr>
            <tr>
                <td>
                    Indirizzo:
                </td>
                <td>
                    ${person.address}
                </td>    
            <tr>
            <tr>
                <td>
                    Lavoro:
                </td>
                <td>
                    ${person.job}
                </td>    
        </table>
    </body>
</html>
