<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<title>John Linder</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<body>
<div class="w3-bar w3-white w3-wide w3-padding w3-card">
  <a href="index.jsp" class="w3-bar-item w3-button"><b>JL</b> Webbutveckling </a>
  <a href="#home" class="w3-bar-item w3-button w3-theme-l1">Applikation</a>
</div>
</div>
<p th:text="'Hello, ' + ${name} + '!'" />

</body>

</html>
