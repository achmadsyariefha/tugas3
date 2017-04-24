import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Matrix {
  static BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
  public static void main(String[] args) {
		String InputChoice = null;
    int row1, coloumn1, row2, coloumn2;
		int choice = 0;
    Construct matrix = new Construct();

    do {
			System.out.println();
			matrix.Menu();
			System.out.println("Masukkan Pilihan Anda");
			try {
                InputChoice = bufferedReader.readLine();
                try  {
                    choice = Integer.parseInt(InputChoice);
                    if (choice > 0 && choice == 1) {
                        matrix.fillMatrix1();
						            System.out.println();
                        matrix.fillMatrix2();
						            System.out.println();
						            matrix.MatrixSum();
						            System.out.println();
						            matrix.Sumaddition();
                    }
                    else if (choice > 0 && choice == 2) {
                      matrix.fillMatrix1();
                      System.out.println();
                      matrix.fillMatrix2();
                      System.out.println();
						          matrix.Matrixreduce();
						          System.out.println();
						          matrix.Sumaddition();
                    }
					         else if (choice > 0 && choice == 3) {
                     matrix.fillMatrix1();
                     System.out.println();
                     matrix.fillMatrix2();
                     System.out.println();
						         matrix.MatrixProduct();
						         System.out.println();
						         matrix.Sumaddition();
                    }
					         else if (choice > 0 && choice == 4) {
                     matrix.fillMatrix1();
                     System.out.println();
                     matrix.fillMatrix2();
                     System.out.println();
						         matrix.MatrixDeterminant();
                    }
                    else {
                        System.out.println("Terimakasih telah menggunakan aplikasi ini!");
                    }
                }
                catch(NumberFormatException e) {
                    System.out.println("Masukan Anda Tidak Sesuai");
                }
            }
            catch (IOException error) {
                System.out.println("Inputan anda Error " + error.getMessage());
            }
		}
		while (choice > 0);
	}
}
