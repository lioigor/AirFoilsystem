<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Measurement results</title>

<style type="text/css">
		.list2  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.list2 td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.list2 th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.list .tg-4eph{background-color:#f9f9f9}
   		.block1 { 
   		 width: 200px; 
    	background: #f2f2f2;
    	padding: 5px;
    	padding-right: 20px; 
    	border: solid 1px #c2c2c2; 
     	top: 40px; 
    	left: -70px; 
   				}
	</style>

<meta charset="utf-8">

<link href="<c:url value="/css/style3.css" />" rel="stylesheet" type="text/css" />

<link href="<c:url value="/css/reset.css" />" rel="stylesheet" type="text/css" />
<link href="<c:url value="/css/style2.css" />" rel="stylesheet" type="text/css" />
<link href="<c:url value="/css/layout.css" />" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="<c:url value="/js/jquery-1.6.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/cufon-yui.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/cufon-replace.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/Didact_Gothic_400.font.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/Shanti_400.font.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/roundabout.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/roundabout_shapes.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/jquery.easing.1.2.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/script.js"/>" ></script>

<!--[if lt IE 9]>
	<script type="text/javascript" src="<c:url value="/js/html5.js"/>"></script>
	<style type="text/css">
		.bg {behavior:url(../../resources/js/PIE.htc)}
	</style>
<![endif]-->
<!--[if lt IE 7]>
	<div style=' clear: both; text-align:center; position: relative;'>
		<a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://www.theie6countdown.com/images/upgrade.jpg" border="0"  alt="" /></a>
	</div>
<![endif]-->
</head>
<body id="page2">
<div class="body1">
	<div class="main">
<!-- header -->
		<header>
			<div class="wrapper">
				<nav>
				<ul id="top_nav">					
		<c:if test="${pageContext.request.userPrincipal.name != null}">
        	<form id="logoutForm" method="POST" action="${pageContext.request.contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        	</form>
			<font color="green">${pageContext.request.userPrincipal.name}</font> | <a onclick="document.forms['logoutForm'].submit()"><font color="red">Sign out</font></a>
        	</c:if>
						<li><a href="${pageContext.request.contextPath}/support">Support</a></li>
						<li><a href="${pageContext.request.contextPath}/login">Log In</a></li>
						<li><a href="${pageContext.request.contextPath}/registration">Sign Up</a></li>

					</ul>
				</nav>
				<span class="date">Monday, June 6, 2011  &nbsp; &nbsp; 17:19</span>
			</div>
			<div class="wrapper">
				<h1><a href="${pageContext.request.contextPath}/home" id="logo">Pro Soft</a></h1>
				<nav>
					<ul id="menu">
						<li><a href="${pageContext.request.contextPath}/home"><span><span>Home</span></span></a></li>
						<li id="menu_active"><a href="${pageContext.request.contextPath}/experiment"><span><span>Experiment preview</span></span></a></li>
						<li class="nav3"><a href="${pageContext.request.contextPath}/support"><span><span>Support</span></span></a></li>
						<li class="nav4"><a href="${pageContext.request.contextPath}/downloads"><span><span>Downloads</span></span></a></li>
						<li class="nav5"><a href="${pageContext.request.contextPath}/contacts"><span><span>Contacts</span></span></a></li>
					</ul>
				</nav>
			</div>
		</header>
<!-- content -->
		<article id="content">
			<section class="col1">
			<div class="singlecol" align="center">
				<h2>Add new model:</h2>
				
				<ul class="list2">
				

<c:url var="addAction" value="/experiment/add" ></c:url>
<c:url var="viewAction" value="/experiments" ></c:url>

<form:form action="${addAction}" commandName="experiment">

<table>
	<c:if test="${!empty experiment.name}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="name">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="name" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="temperature">
				<spring:message text="Temperature"/>
			</form:label>
		</td>
		<td>
			<form:input path="temperature" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="pressure">
				<spring:message text="Pressure"/>
			</form:label>
		</td>
		<td>
			<form:input path="pressure" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="flowVelocity">
				<spring:message text="Flow Velocity"/>
			</form:label>
		</td>
		<td>
			<form:input path="flowVelocity" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="kinematicViscosity">
				<spring:message text="Kinematic Viscosity"/>
			</form:label>
		</td>
		<td>
			<form:input path="kinematicViscosity" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="diameterOfProbes">
				<spring:message text="Diameter Of Probes"/>
			</form:label>
		</td>
		<td>
			<form:input path="diameterOfProbes" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="tubeSize">
				<spring:message text="TubeSize"/>
			</form:label>
		</td>
		<td>
			<form:input path="tubeSize" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="powerEngine">
				<spring:message text="Power Engine"/>
			</form:label>
		</td>
		<td>
			<form:input path="powerEngine" />
		</td> 
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty experiment.name}">
				<input type="submit"
					value="<spring:message text="Edit Experiment"/>" />
			</c:if>
			<c:if test="${empty experiment.name}">
				<input type="submit"
					value="<spring:message text="Add Experiment"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>

<div class="block1">
<form:form action="${viewAction}" commandName="experiment">
			<input type="submit"
					value="<spring:message text="View existing experiments"/>" />
			</form:form>
			</div>
<br>

<c:if test="${!empty listExperiments}">
	<h2>Experiments Table: </h2>
	<table class="tg">
	<tr>
		<th width="80">Experiment ID</th>
		<th width="120">Experiment Name</th>
		<th width="120">Experiment Temperature</th>
		<th width="80">Experiment Pressure</th>
		<th width="80">Experiment Velocity</th>
		<th width="80">Experiment Viscosity</th>
		<th width="80">Experiment Diameter</th>
		<th width="80">Experiment Size</th>
		<th width="80">Experiment Power</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listExperiments}" var="experiment">
		<tr>
			<td>${experiment.id}</td>
			<td>${experiment.name}</td>
			<td>${experiment.temperature}</td>
			<td>${experiment.pressure}</td>
			<td>${experiment.flowVelocity}</td>
			<td>${experiment.kinematicViscosity}</td>
			<td>${experiment.diameterOfProbes}</td>
			<td>${experiment.tubeSize}</td>
			<td>${experiment.powerEngine}</td>
			<td><a href="<c:url value='/edit/${experiment.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${experiment.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
				</ul>
				</div>
				
       		</section>
		</article>
	</div>
</div>
<div class="body2">
		<div class="main">
			<article id="content2">
				<section class="col1">
					<h3>Newsletter</h3>
					<form id="newsletter">
						<div>
						<div class="bg">
							<input class="input" type="text" value="Type Your Email Here"  onblur="if(this.value=='') this.value='Type Your Email Here'" onFocus="if(this.value =='Type Your Email Here' ) this.value=''">
						</div>
						<a href="#" class="button" onClick="document.getElementById('ContactForm').submit()">Subscribe</a>
					</div>
				</form>
        	</section>
			<section class="col_1">
				<h3>Why Us?</h3>
				<ul class="list1">
					<li><a href="#">It's simple - watch Guide</a></li>
					<li><a href="#">Many graphs, pictures</a></li>
					<li><a href="#">Quickly and easily</a></li>
				</ul>
        	</section>
			<section class="col_2">
				<h3>Follow Us</h3>
				<ul id="icons">
					<li><a href="#"><img src="images/icon1.jpg" alt="">Facebook</a></li>
					<li><a href="#"><img src="images/icon2.jpg" alt="">Twitter</a></li>
					<li><a href="#"><img src="images/icon3.jpg" alt="">LinkedIn</a></li>
				</ul>
        	</section>
			<section class="col_1">
				<h3>Address</h3>
				<p class="address">
					<span>
						Country:<br>
						City:<br>
						Email:
					</span>
					Ukraine<br>
					Kyiv<br>
					<a href="mailto:">lioigor22@gmail.com</a>
				</p>
       		</section>
		</article>
<!-- / content -->
	</div>
</div>
<div class="main">
<!-- footer -->
	<footer>
		<colspan="3" align="center" valign="middle" bgcolor="#000000"><span class="text2">Copyright &copy; Igor Likarenko<br>
		</article>
<!-- / content -->
	</div>
</div>
<script type="text/javascript"> Cufon.now();</script>
</body>
</html>