<%
     ui.decorateWith("appui" ,"standardEmrPage")

%>

<script type="text/javascript">
var breadcrumbs =[
       {icon: "icon-home", link: '/' + OPENMRS_CONTEXT_PATH + '/index.htm' }
        { label: "${ ui.message("edit Nurse")}" }
];
</script> 
    


${ ui.includeFragment("nurses", "updateNurse")}
${ ui.includeFragment("nurses", "nurse")}
