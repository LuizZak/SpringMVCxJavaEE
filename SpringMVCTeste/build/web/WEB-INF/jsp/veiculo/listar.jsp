<%-- 
    Document   : listar
    Created on : 10/05/2014, 20:29:03
    Author     : Luiz Fernando
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/theme/css/theme.css" />" type="text/css">
        <title>Listar Veículos</title>
    </head>
    <body>
        <div id="container">
            <div id="listBox">
                <table>
                    <tr>
                        <th>Marca</th>
                        <th>Modelo</th>
                        <th>Preco</th>
                        <th>Cor</th>
                        <th>Fabricante</th>
                    </tr>
                    <c:forEach items="${veiculos}" var="veiculo">
                        <tr>
                            <td>
                                ${veiculo.marca}
                            </td>
                            <td>
                                ${veiculo.modelo}
                            </td>
                            <td>
                                ${veiculo.preco}
                            </td>
                            <td>
                                ${veiculo.cor}
                            </td>
                            <td>
                                ${veiculo.fabricante}
                            </td>
                        </tr>
                    </c:forEach>
                </table>
                <a href="principal.htm">Voltar</a>
            </div>
        </div>
    </body>
</html>