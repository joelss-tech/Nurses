<%
     ui.decorateWith("appui" ,"standardEmrPage")

%>

<script type="text/javascript">
var breadcrumbs =[
       {icon: "icon-home", link: '/' + OPENMRS_CONTEXT_PATH + '/index.htm' }
        { label: "${ ui.message("All nurses ")}" }
];
</script>
${ ui.includeFragment("nurses", "nurse") }