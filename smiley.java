<!DOCTYPE html>

<head>
  <meta name="description" content="nettside">
  <meta name="author" content="Haidas Alekna">
</head>

<body>

  <svg height="400" width="400">

    <circle cx="200" cy="200" r="150" fill="#9c5641" id="faceShape"/>

    <circle cx="100" cy="200" r="40" fill="#ffffff"/>
    <circle cx="300" cy="200" r="40" fill="#ffffff"/>
    <circle cx="100" cy="200" r="30" fill="#000000"/>
    <circle cx="300" cy="200" r="30" fill="#000000"/>

    <path d="M 170,220 q 30,120 60,0" stroke="#000000" stroke-width="3" fill-opacity="0"/>

    <path d="M 125,280 q 75,50 150,0" stroke="#000000" stroke-width="3" fill-opacity="0"/>


  </svg>

<script type="text/javascript">

var faceShape = document.getElementById("faceShape");

var isSick = false;

faceShape.onclick = function(){

  if (isSick == true){
    faceShape.setAttribute("fill", "#9c5641");
    isSick = false;
  } else {
    faceShape.setAttribute("fill", "#e3b1b1");
    isSick = true;
  }
  alert("transform!!");
};




</script>





</body>
