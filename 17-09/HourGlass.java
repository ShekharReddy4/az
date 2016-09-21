public class HourGlass  {

	private static final int _MAX = 6; 
    private static final int _OFFSET = 2; 
    private static int matrix[][] = new int[_MAX][_MAX];
    private static int maxHourglass = -63; 
    
    private static void hourglass(int i, int j){
        int tmp = 0; 
        

        for(int k = j; k <= j + _OFFSET; k++){
            tmp += matrix[i][k]; 
            tmp += matrix[i + _OFFSET][k]; 
        }

        tmp += matrix[i + 1][j + 1]; 
        
        if(maxHourglass < tmp){
            maxHourglass = tmp;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        for(int i=0; i < _MAX; i++){
            for(int j=0; j < _MAX; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        scan.close();
        

        for(int i=0; i < _MAX - _OFFSET; i++){
            for(int j=0; j < _MAX - _OFFSET; j++){
                hourglass(i, j);
            }
        }
        

        System.out.println(maxHourglass);
    }
}