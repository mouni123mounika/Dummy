function checkMandatory()
{
 var fn= document.getElementById("txtFN").value;
 var sn = document.getElementById("txtSN").value;
 if(fn!="" && sn!="")
 return true;
 else{
 alert('Both numbers are mandatory');
 return false;
 }
 }
function AddNum()
{
alert('hi1');
 var fn = document.getElementById("txtFN").value;
 var sn = document.getElementById("txtSN").value;
 if(checkMandatory()){
 var result=parseInt(fn)+parseInt(sn);
 document.getElementById("txtResult").value=result;
 }
}
function SubNum()
{
alert('hi1');
 var fn = document.getElementById("txtFN").value;
 var sn = document.getElementById("txtSN").value;
 if(checkMandatory()){
 var result=parseInt(fn)-parseInt(sn);
 document.getElementById("txtResult").value=result;
 }
}
function MulNum()
{
alert('hi1');
 var fn = document.getElementById("txtFN").value;
 var sn = document.getElementById("txtSN").value;
 if(checkMandatory()){
 var result=parseInt(fn)*parseInt(sn);
 document.getElementById("txtResult").value=result;
 }
}
function DivNum()
{
alert('hi1');
 var fn = document.getElementById("txtFN").value;
 var sn = document.getElementById("txtSN").value;
 if(checkMandatory()){
 var result=parseInt(fn)/parseInt(sn);
 document.getElementById("txtResult").value=result;
 }
}
function PowNum()
{
alert('hi1');
 var fn = document.getElementById("txtFN").value;
 var sn = document.getElementById("txtSN").value;
 var result=1;
 for (i=1;i<=parseInt(sn);i++){
 result=result*fn;
 }
 if(checkMandatory()){
 document.getElementById("txtResult").value=result;
 }
}
function ClearValues()
{
 document.getElementById("txtFN").value="";
 document.getElementById("txtSN").value="";
 document.getElementById("txtResult").value="";
}