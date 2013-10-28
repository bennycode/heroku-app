package heroku.app

class UserController {
    def scaffold = User

    def beforeInterceptor = [action: this.&auth, except: ["login"]]

    def auth() {
        if (!session.user) {
            redirect(controller: "user", action: "login")
            return false
        }
    }

    def login = {

    }

    def authenticate = {
        // GORM method: findByLoginAndPassword
        def user = User.findByLoginAndPassword(params.login, params.password)
        if (user) {
            session.user = user
            flash.message = "Hello ${user.name}!"
            redirect(controller: "entry", action: "list")
        } else {
            flash.message = "Sorry, ${params.login}. Please try again."
            redirect(action: "login")
        }
    }

    def logout = {
        flash.message = "Goodbye ${session.user.name}"
        session.user = null
        redirect(controller: "entry", action: "list")
    }
}
