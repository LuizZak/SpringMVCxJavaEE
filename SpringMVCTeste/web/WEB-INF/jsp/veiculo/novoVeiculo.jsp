<%-- 
    Document   : novoVeiculo
    Created on : 10/05/2014, 19:51:46
    Author     : Luiz Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/theme/css/theme.css" />" type="text/css">
        <title>Novo Veículo</title>
    </head>
    <body>
        <div id="container">
            <div id="listBox">
                <h3>Insira os dados do veículo:</h3>
                <form:form modelAttribute="veiculo" commandName="novoVeiculo" method="post" action="./adicionar.htm">
                    <table>
                        <tr>
                            <td><form:label path="id">Id</form:label></td>
                            <td><form:input path="id"/></td>
                        </tr>
                        <tr>
                            <td><form:label path="modelo">Modelo</form:label></td>
                            <td><form:input path="modelo"/></td>
                        </tr>
                        <tr>
                            <td><form:label path="preco">Preco</form:label></td>
                            <td><form:input path="preco"/></td>
                        </tr>
                        <tr>
                            <td><form:label path="cor">Cor</form:label></td>
                            <td><form:input path="cor"/></td>
                        </tr>
                        <tr>
                            <td><form:label path="marca">Marca</form:label></td>
                            <td><form:input path="marca"/></td>
                        </tr>
                        <tr>
                            <td><form:label path="fabricante">Fabricante</form:label></td>
                            <td><form:input path="fabricante"/></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input type="submit" value="Adicionar veículo"/>
                            </td>
                        </tr>
                    </table>
                </form:form>
            </div>
        </div>
    </body>
</html>