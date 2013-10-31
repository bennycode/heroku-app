<%@ page import="heroku.app.Topic" %>



<div class="fieldcontain ${hasErrors(bean: topicInstance, field: 'contents', 'error')} ">
	<label for="contents">
		<g:message code="topic.contents.label" default="Contents" />
		
	</label>
	
</div>

<div class="fieldcontain ${hasErrors(bean: topicInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="topic.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${topicInstance?.name}"/>
</div>

