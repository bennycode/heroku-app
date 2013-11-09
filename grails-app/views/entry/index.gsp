<%@ page import="heroku.app.Entry" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout"
              content="main">
        <g:set var="entityName"
               value="${message(code: 'entry.label', default: 'Entry')}" />
        <title><g:message code="default.list.label"
                          args="[entityName]" /></title>
    </head>

    <body>
        <a href="#list-entry"
           class="skip"
           tabindex="-1"><g:message code="default.link.skip.label"
                                    default="Skip to content&hellip;" /></a>

        <div class="nav"
             role="navigation">
            <ul>
                <li><a class="home"
                       href="${createLink(uri: '/')}"><g:message code="default.home.label" /></a></li>
                <li><g:link class="create"
                            action="create"><g:message code="default.new.label"
                                                       args="[entityName]" /></g:link></li>
            </ul>
        </div>

        <div class="list">
            <g:each in="${entryInstanceList}"
                    status="i"
                    var="entryInstance">
                <div class="entry">
                    <span class="entry-date"><g:longDate>${entryInstance.lastUpdated}</g:longDate></span>

                    <h2><g:link action="show"
                                id="${entryInstance.id}">${entryInstance.title}</g:link></h2>

                    <p>${entryInstance.summary}</p>
                </div>
            </g:each>
        </div>
    </body>
</html>
