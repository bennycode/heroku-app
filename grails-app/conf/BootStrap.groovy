import heroku.app.Book
import heroku.app.User

class BootStrap {

    def init = { servletContext ->
        new Book(author: "Stephen King", title: "The Shining").save()
        new Book(author: "James Patterson", title: "Along Came a Spider").save()
        def jsmith = new User(login:"jsmith", password:"wordpass", name:"Jane Smith")
        jsmith.save();
    }
    def destroy = {
    }
}
