package lesson12;

public class Matrix implements IMatrix {

    private double[][] numbers;

    public Matrix(){
        numbers = new double[IMatrix.DEFAULT_MATRIX_SIZE][IMatrix.DEFAULT_MATRIX_SIZE];
    }

    public Matrix(int row,int col){
        numbers = new double[row][col];
    }

    public Matrix(double[][]numbers){
        this.numbers = numbers;
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if(rowIndex<0 || rowIndex>=getRows() ){
            System.out.println("неверный индекс строки");
            return -1;
        }
        if(colIndex<0 || colIndex>=getColumns()){
            System.out.println("неверный индекс колонки");
            return -1;
        }
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if(rowIndex<0 || rowIndex>=getRows() ){
            System.out.println("неверный индекс строки");
            return;
        }
        if(colIndex<0 || colIndex>=getColumns()){
            System.out.println("неверный индекс колонки");
            return;
        }
        numbers[rowIndex][colIndex]=value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //this - a матрица
        //otherMatrix - b матрица

        if(this.getRows()!=otherMatrix.getRows()){
            System.out.println("Ошибка! Параметры матрицы не равны по строкам");
            return null;
        }
        if(this.getColumns()!= otherMatrix.getColumns()){
            System.out.println("Ошибка! Параметры матрицы не равны по колонкам");
            return null;
        }
        Matrix result = new Matrix(this.getRows(),this.getColumns());
        for(int i = 0;i< result.getRows();i++){
            for(int j = 0;j<result.getColumns();j++){
                result.setValueAt(i,j, this.getValueAt(i,j)+otherMatrix.getValueAt(i,j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        for(int i = 0;i< numbers.length;i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix after transpose");
        for(int i = 0;i< numbers.length;i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                new[i][j] = 0;
                for (int k = 0; k < numbers.length; k++) {
                    new[i][j] = numbers[j][i];
                }
                System.out.println(new[i][j] + " ");
            }
            System.out.println();
        }
        return null;
    }

    @Override
    public void fillMatrix(double value) {
        for(int i = 0;i<getRows();i++){
            for(int j = 0;j<getColumns();j++){
                numbers[i][j] = value;
            }
        }

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        if(getRows()==0 && getColumns()==0){
            System.out.println("нулевая матрица");
        }
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {

        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        if(getRows()==getColumns()){
            System.out.println("Матрица квадратная");
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for(int i = 0;i< numbers.length;i++){
            for(int j = 0;j<numbers[i].length;j++){
                System.out.println(numbers[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
