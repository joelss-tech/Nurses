

<div>
<form id="nurseForm" method="post">
<fieldset id="editNurse" >
<legend>
<p> Edit Nurse </P>
</legend>

<input id='Nurse_id' hidden='true' name='NurseId' value='${nurse.id}'/>
<p>
     First Name <input id='firstName' name='firstName' value='${nurse.firstName}'/>
</p>

<p>
     First Name <input id='lastName' name='lastName' value='${nurse.lastName}'/>
</p>
<p>
     First Name <input id='Email' name='Email' value='${nurse.Email}'/>
</p>
<p>
     First Name <input id='Nin' name='Nin' value='${nurse.Nin}'/>
</p>

<button id="submit" type="submit">update Nurse</button>
</fieldset>
</form>

</div>