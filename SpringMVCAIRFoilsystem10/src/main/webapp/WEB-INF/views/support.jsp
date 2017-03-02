<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Support</title>


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
<body id="page3">
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
						<li><a href="${pageContext.request.contextPath}/experiment"><span><span>Experiment</span></span></a></li>
						<li id="menu_active" class="nav3"><a href="${pageContext.request.contextPath}/support"><span><span>Support</span></span></a></li>
						<li class="nav4"><a href="${pageContext.request.contextPath}/downloads"><span><span>Downloads</span></span></a></li>
						<li class="nav5"><a href="${pageContext.request.contextPath}/contacts"><span><span>Contacts</span></span></a></li>
					</ul>
				</nav>
			</div>
		</header>
<!-- content -->
		<article id="content">
			<section class="col1">
				<h2 class="pad_bot1">Famous airfoils wings in aircraft</h2>
				<p class="color1 pad_top1 pad_bot3">Below the picture - in the flow profile wings.</p>
				<div class="wrapper">
					<figure class="left marg_right1"><img  src="images/page3_img1.jpg" alt=""></figure>
					<p class="pad_top1">Profile wings - is the official language of words, one of the main components that form the aircraft and the aircraft including a wing as it is an integral part. </p>
				</div>
				<p>The combination of a certain number of profiles make the whole wing, with around wingspan they may be different. And from what they are depends Airplanes and how it will fly. For example, high-speed and high-altitude aircraft always thin airfoil with a sharp leading edge. Known representatives of this class - the MiG-25 and MiG-31. At the same time, most passenger liners have a profile with a large relative thickness and rounded front edge.</p>
				<a href="#" class="button">See examples</a>
      		</section>
			<section class="col2">
				<h2 class="pad_bot1">NACA airfoils</h2>
				<p class="pad_bot1 pad_top1"><strong class="color1">General</strong></p>
				<p>The NACA airfoils are airfoil shapes for aircraft wings developed by the National Advisory Committee for Aeronautics (NACA). The shape of the NACA airfoils is described using a series of digits following the word "NACA". The parameters in the numerical code can be entered into equations to precisely generate the cross-section of the airfoil and calculate its properties.</p>
				<p class="pad_bot1"><strong class="color1">Four-digit series</strong></p>
				<p> The NACA four-digit wing sections define the profile by:</p> 
				<p> For example, the NACA 2412 airfoil has a maximum camber of 2% located 40% (0.4 chords) from the leading edge with a maximum thickness of 12% of the chord. Four-digit series airfoils by default have maximum thickness at 30% of the chord (0.3 chords) from the leading edge.</p>
				<p> The NACA 0015 airfoil is symmetrical, the 00 indicating that it has no camber. The 15 indicates that the airfoil has a 15% thickness to chord length ratio: it is 15% as thick as it is long. </p>
				<p class="pad_bot1"><strong class="color1">Modifications</strong></p>
				<p>Four- and five-digit series airfoils can be modified with a two-digit code preceded by a hyphen in the following sequence:</p>
				<p>One digit describing the roundness of the leading edge with 0 being sharp, 6 being the same as the original airfoil, and larger values indicating a more rounded leading edge.</p>
    			<p>One digit describing the distance of maximum thickness from the leading edge in tens of percent of the chord.</p>
				<p>For example, the NACA 1234-05 is a NACA 1234 airfoil with a sharp leading edge and maximum thickness 50% of the chord (0.5 chords) from the leading edge.</p>
				<p>In addition, for a more precise description of the airfoil all numbers can be presented as decimals.</p>
				<p class="pad_bot1"><strong class="color1">7-series</strong></p>
				   Further advancement in maximizing laminar flow achieved by separately identifying the low pressure zones on upper and lower surfaces of the airfoil. The airfoil is described by seven digits in the following sequence:
				The number "7" indicating the series.
    			One digit describing the distance of the minimum pressure area on the upper surface in tens of percent of chord.
    			One digit describing the distance of the minimum pressure area on the lower surface in tens of percent of chord.
    			One letter referring to a standard profile from the earlier NACA series.
    			One digit describing the lift coefficient in tenths.
    			Two digits describing the maximum thickness as percent of chord.
    			"a=" followed by a decimal number describing the fraction of chord over which laminar flow is maintained. a=1 is the default if no value is given.
				For example, the NACA 712A315 has the area of minimum pressure 10% of the chord back on the upper surface and 20% of the chord back on the lower surface, uses the standard "A" profile, has a lift coefficient of 0.3, and has a maximum thickness of 15% of the chord.
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