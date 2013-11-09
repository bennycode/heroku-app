import heroku.app.Book
import heroku.app.Category
import heroku.app.Topic
import heroku.app.User

import static grails.util.Environment.*

class BootStrap {

  def init = { servletContext ->
    switch (current.name) {
      case "development":
        // Test
        new Book(author: "Stephen King", title: "The Development").save()
        new Book(author: "James Patterson", title: "Along Came a Spider").save()

        // User
        new User(login: "bennyn", password: "bennyn", name: "Benny Neugebauer").save()

        // Category > Topic > Item
        // def item = new Item(content: "{\\color{Red} \\mathbf{a \\cdot (b+c)= a \\cdot b + a \\cdot c}}")
        // item.type = Item$ItemType.IMAGE

        def topic = new Topic(name: "Distributivgesetz")
        // topic.addToItems(item)

        def category = new Category(grade: 7, name: "Rechengesetze")
        category.addToTopics(topic)
        category.save()
        break
    }
  }

  def destroy = {
  }
}
