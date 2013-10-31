<%@ page import="heroku.app.Category" %>



<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'grade', 'error')} required">
	<label for="grade">
		<g:message code="category.grade.label" default="Grade" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="grade" from="${1..13}" class="range" required="" value="${fieldValue(bean: categoryInstance, field: 'grade')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="category.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${categoryInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'topics', 'error')} ">
	<label for="topics">
		<g:message code="category.topics.label" default="Topics" />
		
	</label>
	<g:select name="topics" from="${heroku.app.Topic.list()}" multiple="multiple" optionKey="id" size="5" value="${categoryInstance?.topics*.id}" class="many-to-many"/>
</div>

