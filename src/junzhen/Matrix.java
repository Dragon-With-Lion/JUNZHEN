package junzhen;
import java.util.Matrix;
public class Matrix {
    double[][] inputArray;

    Matrix(double[][] Array) {
        this.inputArray = Array;
    }

   double multiply(Matrix a) {

        int N = this.inputArray.length;
        int n = a.inputArray[0].length;
      double[][] c = new double [N][n];
       for(int i = 0;i<this.inputArray[i].length;i++)
       {
    	   for(int j = 0;j<this.inputArray[0].length;j++)
    	   {
    		   for(int k = 0;k<this.inputArray[0].length;k++)
    		   {
    			   c[i][j] += this.inputArray[i][k]*a.inputArray.length[k][j];
    		   }
    	   } Matrix s = new Matrix(c);
       }

        return(Matrix.toString(s));

}}