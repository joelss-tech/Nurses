<% ui.decorateWith("appui", "standardEmrPage") %>

Hello, world.

<% if (context.authenticated) { %>
    joel, $context.authenticatedUser.personName.fullName.
    Your roles are:
    <% context.authenticatedUser.roles.findAll { !it.retired }.each { %>
        $it.role ($it.description)
    <% } %>
<% } else { %>
    You are not logged in.
<% } %>

${ ui.includeFragment("nurses", "nurse") }