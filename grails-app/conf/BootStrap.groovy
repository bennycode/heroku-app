import heroku.app.Book
import heroku.app.Category
import heroku.app.Item
import heroku.app.Item$ItemType
import heroku.app.Topic
import heroku.app.User

class BootStrap {

    def init = { servletContext ->

        // Test
        new Book(author: "Stephen King", title: "The Shining").save()
        new Book(author: "James Patterson", title: "Along Came a Spider").save()

        // User
        new User(login: "bennyn", password: "bennyn", name: "Benny Neugebauer").save()

        // Category > Topic > Item
        def item = new Item(content: "../Images/Formulas/6.png")
        item.type = Item$ItemType.IMAGE
        
        def topic = new Topic(name: "Multiplikation von Brüchen")
        topic.addToItems(item)
        
        def category = new Category(grade: 6, name: "Bruchrechnung")
        category.addToTopics(topic)        
        category.save()
        
    }
    
    def destroy = {
    }
}
