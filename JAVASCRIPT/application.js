clock =new Object(),

//EXERCISE 1

//Q1.

clock.q1=function(){
var d =new Date();
document.write(d.toLocaleString());
},

//Q2.

clock.q2=function(){
mon=["January","Feburary","March","April","May","June","July","August","September","October","November","December"];
var d =new Date();
document.write(d.getDate()+" ");
document.write(mon[d.getMonth()-1]+" ");
document.write( d.getFullYear()+" ");
document.write( d.toTimeString());
},
//EXERCISE 2

//Q1.

clock.q3=function(a,b)
{
 document.getElementById(a).innerHTML=b;

},

//Q2.
clock.q4=function(a){
 var d=new Date();
 document.getElementById(a).innerHTML=d.toLocaleString();
},

//EXERCISE - 4

//Q1. 
clock.q5=function(){
i=0;
var si=setInterval(function(){document.write("time updated")
document.write("<BR>");
i++;
if(i>9)
clearInterval(si);},1000);
};



		//FINAL EXERCISE

one=new Object();

//Q4-form1


one.press=function(){
  var name=prompt("Enter name");
  document.getElementById("name").value=name;
},

//Q5-form2

one.change=function(){
document.getElementById("t2").value=document.getElementById("t1").value;;
},


//Q6-form3

one.validate=function(){
if(document.getElementById("name").validity.valueMissing || document.getElementById("age").validity.rangeUnderflow)

document.write("Form not submitted");
else
document.write("Form Submitted");
};



//Q7-form4

function over(elem){
 elem.style.background='red';
 
}
function out(elem){
elem.style.background='white';
}







