<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache"> 
<meta http-equiv="cache-control" content="no-cache"> 
<meta http-equiv="expires" content="0"> 
<title>User Info</title>
<script src="http://code.jquery.com/jquery-2.1.3.min.js">
</script>
<!-- <script>
$(document).ready(function(){
  $("button").click(function(){
    $.post("/ssm/user/addUser",
    {   "id":123,
        "userName":"hh",
        "password":"11111",
        "age":32
    },
    function(data,status){
      alert("数据：" + data + "\n状态：" + status);
    });
  });
});
</script>

 -->
</head>
<body>
	<div>
		<span>id: ${user.id} </span><br>
		<span>userName: ${user.userName}</span>
	</div>
	
    	
    	
    
</body>


<!-- <button>向页面发送 HTTP POST 请求，并获得返回的结果</button>  -->
</html>