package heroku.app

class Topic {

  String name
  Category category

  static constraints = {
    name blank: false, nullable: false
  }

  String toString() {
    return name;
  }

}