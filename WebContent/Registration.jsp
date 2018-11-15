<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<link rel = "stylesheet" href = "css/nav.css">
<body>
  <img src = "Images/pulse.jpg" height = "100" width = "100%">
<nav>
<h1 align = "center">NetMeds</h1>
    <ul>
    <li><a href="Home.jsp">HOME</a></li>
    <li><a href="About Us.jsp">ABOUT US</a></li>
    <li><a href="Registration.jsp">REGISTRATION</a></li>
    <li><a href="Login.jsp">LOGIN</a></li>
    <li><a href="Distributor.jsp">DISTRIBUTOR</a></li>
    <li><a href="Contact Us.jsp">CONTACT US</a></li>
    </ul>
</nav>
</body>
<div  class="bcr"> 

<form action = "RegistrationServlet" method = "post">
   <table  width="100%" cellspacing="2" cellpadding="3">
 	
				<tr><td><p>NAME:</td><td> <input type="text" name="name" required></p></td></tr>
				<tr><td><p>USER NAME:</td><td> <input type="text" name="username" required></p></td></tr>
				<tr><td><p>E-MAIL:</td><td> <input type="text" name="email" required></p></td></tr>
				<tr><td><p>PASSWORD:</td><td> <input type="password" name="password1" required></p></td></tr>
				<tr><td><p>RE-ENTER PASSWORD:</td><td> <input type="password" name="password2" required></p></td></tr>	 		
				
				
				<tr><td></td><td><input type="submit" value="Submit">
					
					<INPUT TYPE="RESET" VALUE="CLEAR"></td></tr>
   </table>
</form>
</div>

</html>


	<!--  <tr><td><p>ADDRESS:</td><td> <input type="text" name="Address" required></p></td></tr>
					-->