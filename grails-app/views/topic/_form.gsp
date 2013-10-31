<%@ page import="heroku.app.Topic" %>



<div class="fieldcontain ${hasErrors(bean: topicInstance, field: 'content', 'error')} ">
	<label for="content">
		<g:message code="topic.content.label" default="Content" />
		
	</label>
	
</div>

<div class="fieldcontain ${hasErrors(bean: topicInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="topic.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${topicInstance?.name}"/>
</div>

