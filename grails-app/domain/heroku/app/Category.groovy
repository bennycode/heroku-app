package heroku.app

class Category {

  String name
  int grade

  static constraints = {
    name blank: false, nullable: false
    grade range: 1..13
  }

  static hasMany = [topics: Topic]
}