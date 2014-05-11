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
        <title>JSP Page</title>
    </head>
    <body>
        <div id="container">
            <h1>Hello World!</h1>
            <table>
                <th>
                    <td>Marca</td>
                    <td>Modelo</td>
                    <td>Preco</td>
                    <td>Cor</td>
                    <td>Fabricante</td>
                </th>
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
        </div>
    </body>
</html>