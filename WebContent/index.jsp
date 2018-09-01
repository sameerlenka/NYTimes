<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css"></link> 
<title>NYTime | Home</title>
<script type="text/javascript">
function call(){
	var e = document.getElementById("selectId").value;
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            window.open(data, "frame");
            var result = e.link(data,);
            document.getElementById("content").innerHTML = result;
            window.open(data,'_blank');
            //document.getElementById("content").innerHTML='<object type="text/html" data="'+data+'" ></object>';
        }
    }
    xhr.open('GET', 'TimeController?value='+ encodeURIComponent(e)+'', true);
    xhr.send(e);
	}
</script>
<style type="text/css">
body{
overflow: hidden;
}
#header{
	font-family: sans-serif;
	font-variant: small-caps;
	font-weight: bold;
	background-color:black;
	color:white;
	font-size: 36px;
	margin: -10px;
	text-align: center;
}
#nav{
margin-top: 20px;
text-align: center;
}
select{
	border: 1px solid black;
	height: 20px;
	width: 140px;
	font-family: Trajan;
	font-size: 16px;
}
span{
	font-family: Garamond;
	font-weight: bold;
	color:black;
	font-size: 16px;
	text-align: center;
}
iframe{
	border:1px solid red;
	height: 800px;
	width: 100%;
	margin-top: 10px;
}
</style>
</head>
<body>
<div id="header">New York Times</div>
<div id="nav">
<span>Select Type : </span><select id="selectId" onchange="call()">
<option value="world">Select</option>
<option value="world">world</option>
<option value="politics">politics</option>
<option value="science">science</option>
<option value="health">health</option>
<option value="sports">sports</option>
</select>
</div>
<div id="content"></div>
<iframe scrolling="auto" name="frame">

</iframe>
</body>
</html>