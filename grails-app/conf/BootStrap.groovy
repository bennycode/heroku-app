import heroku.app.Book
import heroku.app.User

class BootStrap {

    def init = { servletContext ->
        new User(login: "bennyn", password: "bennyn", name: "Benny Neugebauer").save()
        new Book(author: "Stephen King", title: "The Shining").save()
        new Book(author: "James Patterson", title: "Along Came a Spider").save()
    }
    def destroy = {
    }
}
