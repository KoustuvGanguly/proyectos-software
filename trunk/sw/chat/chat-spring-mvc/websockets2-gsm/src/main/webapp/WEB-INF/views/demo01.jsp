<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>Ejemplo de panel deslizante con CSS3 - www.lewebmonster.com</title>
<%-- 		<link type="text/css" href="<c:url value="resources/css/default.css?123" ></c:url>" rel="stylesheet" /> --%>
	    <link type="text/css" href="<c:url value="resources/css/smoothness/jquery-ui-1.8.22.custom.css" ></c:url>" rel="stylesheet" />
	    <script type="text/javascript" src="<c:url value="resources/js/jquery-1.7.2.min.js" ></c:url>"></script>
	    <script type="text/javascript" src="<c:url value="resources/js/jquery-ui-1.8.22.custom.min.js"></c:url>"></script>
	    <script type="text/javascript" src="<c:url value="resources/js/wsclient.js?2032"></c:url>"></script>
		<link type="text/css" href="<c:url value="resources/css/paneles.css" ></c:url>" rel="stylesheet" />
    
<!-- 		<link rel="stylesheet" type="text/css" href="css/paneles.css"> -->
	</head>
	<body>
		<div id="divContenedor">
			<div id="divInfo">
				<h1>Paneles deslizantes con CSS3</h1>
				<p>Ejemplo por Cali Rojas - <a href="http://www.lewebmonster.com">www.lewebmonster.com</a></p>
			</div>
			<div class="clsImagen">
<!-- 				<img src="img/laptop.png"> -->
				<div class="clsContenedor">
					<div class="clsTitulo">
						<h2>Laptop</h2>
					</div>
					<div class="clsContenido">
						<p>
							Una computadora port&aacute;til es un ordenador personal m&oacute;vil o transportable, que
							pesa normalmente entre 1 y 3 kg. Los ordenadores port&aacute;tiles son capaces de realizar
							la mayor parte de las tareas que realizan los ordenadores de escritorio, con similar
							capacidad y con la ventaja de su peso y tama&ntilde;o reducidos; sumado tambi&eacute;n a que
							tienen la capacidad de operar por un per&iacute;odo determinado sin estar conectadas a una red
							el&eacute;ctrica.
						</p>
					</div>
				</div>
			</div>
			<div class="clsImagen">
<!-- 				<img src="img/monitor.png"> -->
				<div class="clsContenedor">
					<div class="clsTitulo">
						<h2>Monitor</h2>
					</div>
					<div class="clsContenido">
						<p>
							El monitor de computadora es un visualizador que muestra al usuario los resultados del procesamiento
							de una computadora mediante una interfaz.
						</p>
					</div>
				</div>
			</div>
			<div class="clsImagen">
<!-- 				<img src="img/pc.png"> -->
				<div class="clsContenedor">
					<div class="clsTitulo">
						<h2>Hello world</h2>
					</div>
					<div class="clsContenido">
						<p>
							Computadora de escritorio (en Hispanoam&eacute;rica) u ordenador de sobremesa (en Espa&ntilde;a) es una
							computadora personal que es dise&ntilde;ada para ser usada en una ubicaci&oacute;n fija, como un
							escritorio -como su nombre indica-, a diferencia de otros equipos personales como las computadoras
							port&aacute;tiles.
						</p>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>