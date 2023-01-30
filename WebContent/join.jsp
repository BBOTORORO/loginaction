<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<link rel="stylesheet" href="../css/join.css">
</head>
<body>
<h3>회원 가입</h3>

<form action="" method="POST">
<table>
	<tr>
		<td>
			<label for="lblUid">아이디</label>
		</td>
		<td>
		<input type="text" id="lblUid" name="id">
		</td>
	</tr>
	<tr>
		<td>
			<label for="lblName">이름</label>
		</td>
		<td>
		<input type="text" id="lblName" name="name">
		</td>
	</tr>
	<tr>
		<td>
			<label for="lblPass">패스워드</label>
		</td>
		<td>
		<input type="password" id="lblPass" name="password">
		</td>
	</tr>
	<tr>
		<td>
			<label for="lblEmail">이메일</label>
		</td>
		<td>
		<input type="text" id="lblEmail" name="email">
		</td>
	</tr>
	<tr>
		<td>
			<label for="lblAge">나이</label>
		</td>
		<td>
		<input type="number" id="lblAge" name="age">
		</td>
	</tr>
	<tr>
		<td>
			<label>성별</label>
		</td>
		<td>
			<input type="radio" name="gender" id="lblMale" value="male">
			<label for="lblMale">남성</label>
			<input type="radio" name="gender" id="lblFemale" value="female">
			<label for="lblFemale">여성</label>
			<input type="radio" name="gender" id="lblNo" checked="checked"  value= "anknow">
			<label for="lblNo">모름</label>
		</td>
	</tr>
	<tr>
		<td>
			<label>취미</label>
		</td>
		<td>  
			<input type="checkbox" id="lblFootball" name="hobby" value ="축구">
			<label for="lblFootball">축구</label>
			<input type="checkbox" id="lblBaseball" checked="checked" name="hobby" value ="야구">
			<label for="lblBaseball">야구</label>
			<input type="checkbox" id="lblRun" name="hobby" value ="달리기">
			<label for="lblRun">달리기</label>
			<input type="checkbox" id="lblSwim" name="hobby" value ="수영">
			<label for="lblSwim">수영</label>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<button>가입하기</button>  
			<button type="reset" >다시쓰기</button>
			<button type="button" onclick="alert('hello!')">테스트</button>
		</td>
	</tr>
</table>
<a href="index.jsp">홈으로</a>
</form>	
</body>
</html>