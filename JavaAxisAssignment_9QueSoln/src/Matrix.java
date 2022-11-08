public class Matrix {

    //declaring two matrix
    int[][] myMatrix1 = new int[2][2];
    int[][] myMatrix2 = new int[2][2];


    //creating a method to find no of rows in a matrix
    void getNoOfRows(int[][] matrix){
        System.out.println("No of Rows in Matrix is : " + matrix.length);
    }

    //creating a method to find no of cols in a matrix
    void getNoOfCols(int[][] matrix){
        System.out.println("No of Columns in Matrix is : " + matrix[0].length);
    }

    //creating a method to add two Matrix
    void addTwoMatrix(int[][] matrix1,int[][] matrix2){

        if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            System.out.println("Matrices cannot be added");
        }
        else{
            int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];

            for(int i=0;i<matrix1.length;i++){
                for(int j=0;j<matrix1[0].length;j++){
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println("Result Matrix after Adding : ");
            for(int i=0;i<resultMatrix.length;i++){
                for(int j=0;j<resultMatrix[0].length;j++){
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

    //creating a method to multiply two Matrix
    void multiplyTwoMatrix(int[][]matrix1, int[][] matrix2){
        if(matrix1[0].length != matrix2.length){
            System.out.println("Matrices cannot be multiplied");
        }
        else{
            int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];

            for(int i=0;i<matrix1.length;i++){
                for(int j=0;j<matrix2[0].length;j++){
                    for(int k=0;k<matrix2.length;k++){

                        resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println("Result Matrix after Multiplying : ");
            for(int i=0;i<resultMatrix.length;i++){
                for(int j=0;j<resultMatrix[0].length;j++){
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    //creating a method to set data in Matrix
    void setElementAtIndex(int[][] matrix,int i, int j,int data){
        try{
            matrix[i][j]=data;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Exception is : " + e);
        }
    }

    //creating a main method to create object of class
    public static void main(String[] args){

        Matrix obj = new Matrix();  //creating object of class "Matrix"

        //fill the data in myMatrix1
        obj.setElementAtIndex(obj.myMatrix1, 0,0,3);
        obj.setElementAtIndex(obj.myMatrix1, 0,1,4);
        obj.setElementAtIndex(obj.myMatrix1, 1,0,2);
        obj.setElementAtIndex(obj.myMatrix1, 1,1,1);

        //fill the data in myMatrix2
        obj.setElementAtIndex(obj.myMatrix2, 0,0,1);
        obj.setElementAtIndex(obj.myMatrix2, 0,1,5);
        obj.setElementAtIndex(obj.myMatrix2, 1,0,3);
        obj.setElementAtIndex(obj.myMatrix2, 1,1,7);

        //get the no of rows in myMatrix1
        obj.getNoOfRows(obj.myMatrix1);
        //get the no of cols in myMatrix1
        obj.getNoOfCols(obj.myMatrix1);


        //get the no of rows in myMatrix2
        obj.getNoOfRows(obj.myMatrix2);
        //get the no of cols in myMatrix2
        obj.getNoOfCols(obj.myMatrix2);

        //adding two matrix
        obj.addTwoMatrix(obj.myMatrix1,obj.myMatrix2);

        //multiply two matrix
        obj.multiplyTwoMatrix(obj.myMatrix1,obj.myMatrix2);
    }
}
