<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/javascript">
	$(function(){
		$("button:contains('등록')").on("click",function(){
			self.location.href="/board/addBoard.jsp";
		});
	});
	
	$(function(){
		$("button:contains('추가등록')").on("click",function(){
			self.location.href="/product/addProductView.jsp";
		});
	});
	
</script>

<title>게시글 등록</title>
</head>
<body>
	
</body>
</html>