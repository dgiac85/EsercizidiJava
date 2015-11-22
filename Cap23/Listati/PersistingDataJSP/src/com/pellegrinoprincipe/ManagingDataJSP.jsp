<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="DataManagementError.jsp" %>
<%!
    // variabili e metodi d'istanza
    private String colore_back;
    private String colore_front;
    private int users;

    private void manageColorsSession(HttpSession session)
    {
        colore_back = (String) session.getAttribute("colore_back");
        colore_front = (String) session.getAttribute("colore_front");
    }
    
    private void manageContext(ServletContext application)
    {
        users = (Integer) application.getAttribute("users");                
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: Personal Web Page ::</title>
    </head>
    <%-- Invoco i metodi di gestione dei dati --%>  
    <% manageColorsSession(session); manageContext(application); %>
    <body style="background-color: <%= colore_back %>">
        <h1 style="color: <%= colore_front %>">Benvenuto nella tua personal home page [utenti online: <% out.print(users); %>]</h1>
    </body>
</html>
