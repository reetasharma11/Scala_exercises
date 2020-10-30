import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
import org.apache.spark.sql.SparkSession
object wordCount {
  def main(args: Array[String]) {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val session = SparkSession
      .builder
      .master("local[2]")
      .appName("wordCount")
      .getOrCreate()
    val input = session.read.textFile("/home/reeta/Desktop/CEBD_1261_fall2020_course/Week5/TheHungerGames.txt")
    import session.implicits._
    val words = input.flatMap(x => x.split(" "))
    val wordCounts = words.rdd.countByValue()
    wordCounts.foreach(println)
  }
}




