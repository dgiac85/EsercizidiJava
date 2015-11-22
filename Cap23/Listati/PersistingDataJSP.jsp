<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="DataManagementError.jsp"  %>
<%!
    // variabili e metodi d'istanza
    private String colore_back;
    private String colore_front;
    private int users;

    private void settingColorsFromParams(HttpServletRequest request)
    {
        colore_back = request.getParameter("colore_back") != null ? request.getParameter("colore_back") : "black";
        colore_front = request.getParameter("colore_front") != null ? request.getParameter("colore_front") : "white";
    }
    
    private void datastoraging(HttpSession session, ServletContext application)
    {
        session.setAttribute("colore_back", colore_back);
        session.setAttribute("colore_front", colore_front);

        Integer users = (Integer) application.getAttribute("users");
        application.setAttribute("users", users == null ? 1 : ++users);              
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: Personal Web Page ::</title>
    </head>
    <body>
        <%-- Invoco i metodi per la manipolazione dei dati --%>
        <% settingColorsFromParams(request); datastoraging(session, application);
          response.sendRedirect("ManagingDataJSP.jsp"); %>
    </body>
</html>
