<%@page import ="java.util.Date"%>
<jsp:declaration>
Date d=null;
String date="";
</jsp:declaration>
<jsp:scriptlet>
d= new Date();
date=d.toString();
</jsp:scriptlet>
<h1>Current System Date and Time :<jsp:expression>date</jsp:expression></h1>


