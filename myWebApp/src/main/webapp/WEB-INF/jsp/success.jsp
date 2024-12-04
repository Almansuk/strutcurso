<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado del Servicio</title>
</head>
<body>
    <h1>Servicio Ejecutado</h1>
    <!-- Mostrar el mensaje de la acción -->
    <p><s:property value="message" /></p>

    <!-- Botón para ejecutar de nuevo -->
    <form action="executeService">
        <button type="submit">Ejecutar de nuevo</button>
    </form>
</body>
</html>