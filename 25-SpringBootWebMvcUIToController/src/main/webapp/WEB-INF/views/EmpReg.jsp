<html>
<body>
<h3>Welcome to Employee Register Page</h3>
<form action="save" method="POST">
<pre>
EMPLOYEE ID   : <input type="text" name="empId"/>
EMPLOYEE NAME : <input type="text" name="empName"/>
EMPLOYEE SAL  : <input type="text" name="empSal"/>
EMPLOYEE GEN  : 
               <input type="radio" name="empGen" value="Male"> Male
               <input type="radio" name="empGen" value="Female"> Female
EMPLOYEE ADDR : <textarea name="empAddr"></textarea>
EMPLOYEE DEPT : <select name="empDept">
					<option value="DEV">DEV</option>
					<option value="QA">QA</option>
					<option value="BA">BA</option>
				</select>   
EMPLOYEE SHIFT: 
 			<input type="checkbox" name="empSlot" value="AM"> AM				            
 			<input type="checkbox" name="empSlot" value="NOON"> NOON				            
 			<input type="checkbox" name="empSlot" value="PM"> PM		
EMPLOYEE CLIENTS:
			<select name="empClient" multiple="multiple">
					<option>NIT</option>
					<option>HTC</option>
					<option>CRM</option>
					<option>ORCL</option>
			</select> 					            
EMPLOYEE JOD : <input type="date" name="empJod"/>     
EMPLOYEE PWD : <input type="password" name="empPwd"/>          
	<input type="submit" value="Register"/>
</pre>
</form>
</body>
</html>
