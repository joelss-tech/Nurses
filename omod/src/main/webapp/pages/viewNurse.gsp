<%
    ui.decorateWith("appui", "standardEmrPage")
%>

<script type="text/javascript">
var breadcrumbs =[
       {icon: "icon-home", link: '/' + OPENMRS_CONTEXT_PATH + '/index.htm' }
         { label: "${ ui.message("Nurse details ")}" }
];
</script>

<script>
     function printDiv(divName) {
     var printContents =document.getElementById(divName).innerHTML;
     var originalContents =document.body.innerHTML;
     document.body.innerHTML=printContents
     window.print();
     document.body.innerHTML =originalContents;

     }
     
</script>

<div id='print'>
<div style="margin-right:40px">
<p> First Name : <b>${nurse.firstName}<b> </p>
<p> Last Name : <b>${nurse.lastName}<b> </p>
<p> Email : <b>${nurse.Email}<b> </p>
<p> Nin : <b>${nurse.Nin}<b> </p>

</div>
<button onclick="printDiv('print')"> Print Nurse Details</button>
