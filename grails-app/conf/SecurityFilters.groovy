// http://grails.org/doc/latest/ref/Plug-ins/filters.html
class SecurityFilters {
    def filters = {       
        editFilter(controller: '*', action: '(create|edit)') {
            before = {
                if (!session.user) {
                    redirect(controller: 'user', action: 'login', params: [from: request.forwardURI])
                    return false                    
                }
            }
        }
        
        userFilter(controller: 'user', action: '(index|show)') {
            before = {
                if (!session.user) {
                    redirect(controller: 'user', action: 'login', params: [from: request.forwardURI])
                    return false                    
                }
            }
        }        
    }
}