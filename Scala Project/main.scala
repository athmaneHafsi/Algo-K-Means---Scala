import scala.util.control.Breaks._

object Main extends Kmeans{
     def main(args: Array[String]) {
     var points : Array[Array[Int]] = Array(Array(2,5),Array(1,6),Array(5,1),Array(6,6),Array(7,5),Array(9,5),Array(2,5),Array(10,6),Array(3,8),Array(6,1));
     val a= new Kmeans;
     a.setPoints(points);
     a.setNombreClusters(3);
     var clusters : Array[Array[Int]] = a.creerClusters();
     var finish : Boolean = false;
     var i:Int =0;
     while(!finish)
     {
       a.miseAJourCentre(clusters);
       if (a.nombreItter < i){
         println("nombre d'itterations fini");
         finish = true;
       }
       i+=1;
     }

  
  }

}