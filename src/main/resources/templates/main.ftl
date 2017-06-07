<!DOCTYPE html>
<html><head><title>Login Page</title></head><body onload='document.f.username.focus();'>

<div>This is the dashboard page,please login in first
	<table>
	<tr><td>test:</td><td><input type='text' name='username' value=''></td></tr>
	</table>
</div>


<h3>Login with Username and Password</h3><form name='f' action='/boot/login' method='POST'>

<table>
	<tr><td>User:</td><td><input type='text' name='id' value=''></td></tr>
	<tr><td>Password:</td><td><input type='password' name='password'/></td></tr>
	<tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
	<input name="_csrf" type="hidden" value="b8350a88-14f7-480d-950d-7efb45ed4af3" />
</table>
</form></body></html>