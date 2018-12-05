<%-- 
    Document   : Calculadora
    Created on : 04/12/2018, 20:23:36
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CALCULADORA</title>
    </head>
    <body>
        <h1>Calculadora!</h1>
        <form method="GET" action="/Calculadoras/Calculadora">
            Valor 1: <input type="text" name="valor1"/><br/> 
            Valor 2: <input type="text" name="valor2"/>
            <br/><br/>
            
            <button type="submit" name="operacao" value="soma">Somar</button>
            <button type="submit" name="operacao" value="subtracao">Subtrair</button>
            <button type="submit" name="operacao" value="multiplicacao">Multiplicar</button>
            <button type="submit" name="operacao" value="divisao">Dividir</button>
            
        </form>
    </body>
</html>
        
