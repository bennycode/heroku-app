import heroku.app.Book
import heroku.app.Category
import heroku.app.Topic
import heroku.app.User

class BootStrap {

    def init = { servletContext ->

        // Test
        new Book(author: "Stephen King", title: "The Shining").save()
        new Book(author: "James Patterson", title: "Along Came a Spider").save()

        // User
        new User(login: "bennyn", password: "bennyn", name: "Benny Neugebauer").save()

        // Categories & Topics
        def topic = new Topic(name: "Multiplikation von Brüchen")
        topic.addToContent("Man multipliziert einen Bruch mit einer Zahl, indem man den Zähler mit der Zahl multipliziert.")
        topic.addToContent("../Images/Formulas/6.png")

        def category = new Category(grade: 6, name: 'Bruchrechnung')
        category.addToTopics(topic)
        category.save()
    }
    def destroy = {
    }
}
