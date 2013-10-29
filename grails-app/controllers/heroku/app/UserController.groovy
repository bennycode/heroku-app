package heroku.app

class UserController {
    def scaffold = User

    def beforeInterceptor = [action: this.&auth,  except:["login", "authenticate", "logout"]]

    def auth() {
        if (!session.user) {
            redirect(controller: "user", action: "login")
            return false
        }
    }

    def authenticate = {
        // GORM method: findBy...
        def user = User.findByLoginAndPassword(params.login, params.password)
        if (user) {
            session.user = user
            flash.message = "Hello ${user.name}!"
            redirect(controller: "user", action: "list")
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
        redirect(uri:'/index')
    }
}
