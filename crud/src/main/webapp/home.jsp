<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<form action="adduser">
<h2>To add new student</h2>
 <div>
        <label for="id">ID:</label>
        <input type="number" name="id" id="id">
    </div>
    <div>
        <label for="name">name:</label>
        <input type="text" name="name" id="name">
    </div>
    <div>
        <label for="dept">dept:</label>
        <input type="text" name="dept" id="dept">
    </div>
    <input type="submit">
</form>
<form action="getuser">
<h2>To get student information</h2>
 <div>
        <label for="id">ID:</label>
        <input type="number" name="id" id="id">
    </div>
    <input type="submit">
</form>
<form action="delete">
<h2>To delete student information</h2>
 <div>
        <label for="id">ID:</label>
        <input type="number" name="id" id="id">
    </div>
    <input type="submit">
</form>

<form action="update" >
<h2>To update student information</h2>
 <div>
        <label for="id">ID:</label>
        <input type="number" name="id" id="id">
    </div>
    <div>
        <label for="name">name:</label>
        <input type="text" name="name" id="name">
    </div>
    <div>
        <label for="dept">dept:</label>
        <input type="text" name="dept" id="dept">
    </div>
    <input type="submit">
</form>
   
</body>
</html>