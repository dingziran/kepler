package controllers

import play.api._
import play.api.mvc._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.functional.syntax._
import play.api.libs.json._
import scala.concurrent.Future

// Reactive Mongo imports
import reactivemongo.api._

// Reactive Mongo plugin, including the JSON-specialized collection
import play.modules.reactivemongo.MongoController
import play.modules.reactivemongo.json.collection.JSONCollection

object Application extends Controller with MongoController {
  def collection: JSONCollection = db.collection[JSONCollection]("activities")

  def index = Action {
    Ok(views.html.index())
  }

  def demoList=Action{
    Ok(views.html.demo.list())
  }

  def demoCreate=Action{
    Ok(views.html.demo.create())
  }

  def demoLogin=Action{
    Ok(views.html.demo.login())
  }

  def list( collection: String)=TODO
  def find(collection: String, id: String)=TODO
  def create(collection: String)=TODO
  def update(collection: String, id: String)=TODO
  def delete(collection: String, id: String)=TODO

}