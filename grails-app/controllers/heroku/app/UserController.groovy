package heroku.app

class UserController {
    def scaffold = User

    def authenticate = {
        // GORM method: findBy...
        // http://www.grails.org/OperatorNamesInDynamicMethods
        def user = User.findByLoginAndPassword(params.login, params.password)
        if (user) {
            session.user = user
            flash.message = "Hello ${user.name}!"
            def relativeUrl = params.test - request.contextPath
            log.info("relativeUrl: " + relativeUrl);
            redirect(uri: relativeUrl)

        } else {
            flash.message = "Sorry, ${params.login}. Please try again."
            redirect(controller: "user", action: "login")
        }
    }

    def index = {

    }

    def login = {

    }

    def logout = {
        flash.message = "Goodbye ${session.user.name}"
        session.user = null
        // http://stackoverflow.com/questions/11144775/grails-redirect-to-index-gsp-that-is-not-in-any-controller
        redirect(uri: '/')
    }
}
