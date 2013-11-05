<%@ page import="heroku.app.Item" %>



<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="item.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="type" from="${heroku.app.Item$ItemType?.values()}" keys="${heroku.app.Item$ItemType.values()*.name()}" required="" value="${itemInstance?.type?.name()}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'content', 'error')} required">
	<label for="content">
		<g:message code="item.content.label" default="Content" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="content" required="" value="${itemInstance?.content}"/>
</div>

