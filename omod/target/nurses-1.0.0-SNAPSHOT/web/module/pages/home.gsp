



<%
     ui.decorateWith("appui" ,"standardEmrPage")

%>

<script type="text/javascript">
var breadcrumbs =[
       {icon: "icon-home", link: '/' + OPENMRS_CONTEXT_PATH + '/index.htm' }
        { label: "${ ui.message("Home Page")}" }
];
</script>

       

<script>
 if (window.history.replaceState ) {
    window.history.replaceState( null, null, window.location.href );
 }
</script>

 <div>

 <form id="nurseForm" method="post">

 <fieldset id="register_nurse" >
 <legend>
    <p> Register Nurse </p>
 </legend>

 <p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "firstName", "label": "FirstName","formFieldName": "firstName" ])}
 </p>
 <p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "lastName", "label": "LastName","formFieldName": "lastName" ])}
 </p>
 <p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "Email", "label": "Email","formFieldName": "Email" ])}
 </p>
 <p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "Nin", "label": "Nin","formFieldName": "Nin" ])}
 </p>



 <button id="submit" type="submit">Register Nurse </button>

 </fieldset>
 </form>
 ${ ui.includeFragment("nurses","nurse") }
 
 </div>