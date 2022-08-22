

<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Nin</th>
</tr>

<% if (nurse) {%>
<%nurse.each {%>
     <tr>
      <td>${  ui.format(it.firstName) }</td>
      <td>${  ui.format(it.lastName) }</td>
      <td>${  ui.format(it.Email) }</td>
      <td>${  ui.format(it.Nin) }</td>
      <td><a target="_blank" href='${ ui.pageLink("nurses" ,"viewNurse") }?nurseId=${ ui.format(it.id)}' title="View Nurse"><i class="icon-eye-open edit-action" > </i><a></td>
      <td><a target="_blank" href='${ ui.pageLink("nurses" ,"editNurse") }?nurseId=${ ui.format(it.id)}' title="Edit Nurse"><i class="icon-edit edit-action" > </i><a></td>
      <td><a target="_blank" href='${ ui.pageLink("nurses" ,"deleteNurse") }?nurseId=${ ui.format(it.id)}' title="Delete Nurse"><i class="icon-remove edit-action" > </i><a></td>
     </tr>

<% }%>

<% } else {%>
<tr>
  <td colspan="4">${  ui.message("general.none") }</td>
</tr>
<% }%>
</table>