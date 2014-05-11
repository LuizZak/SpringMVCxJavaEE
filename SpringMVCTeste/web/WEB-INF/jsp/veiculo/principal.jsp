<%-- 
    Document   : principal
    Created on : 10/05/2014, 19:56:32
    Author     : Luiz Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/theme/css/theme.css" />" type="text/css">
        <title>Veículos</title>
    </head>
    <body>
        <div id="container">
            <div id="listBox">
                <a class="button" href="./novo.htm">Adicionar Veículo</a>
                <a class="button" href="./listar.htm">Listar Veículos</a>
            </div>
        </div>
    </body>
</html>