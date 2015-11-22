<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true" %>
<%@page import="java.io.StringWriter, java.io.PrintWriter "%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: ERROR!!! ::</title>
    </head>
    <body>
        <h2>Attenzione l'applicazione ha generato la seguente eccezione:</h2>
        <pre>
            <%
                StringWriter s_writer = new StringWriter();
                PrintWriter p_writer = new PrintWriter(s_writer);
                exception.printStackTrace(p_writer);
                out.write(s_writer.toString());            
            %>
        </pre>
    </body>
</html>
