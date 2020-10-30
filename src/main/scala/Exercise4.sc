import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession
Logger.getLogger("org").setLevel(Level.ERROR)
val session = SparkSession
  .builder()
  .master("local")
  .appName("WordCount")
  .getOrCreate()

val input = session.read.textFile("/home/reeta/Desktop/CEBD_1261_fall2020_course/Week5/TheHungerGames.txt")
import session.implicits._
val words = input.flatMap( x => x.split(" "))
val wordCounts = words.rdd.countByValue()

// print out the result
wordCounts.foreach(println)

val letterWords = words.filter(_.matches("[A-Za-z]+")).map(_.toLowerCase())
val mergedCounts = letterWords.rdd.countByValue().toList
val sortedWordCounts = mergedCounts.sortWith(_._2 >_._2)
sortedWordCounts.foreach(println)