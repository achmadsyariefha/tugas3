import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tictactoeGame {
  private Board board;
  private GameState currentState;
  private Seed currentPlayer;

  private static BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));

  public tictactoeGame() {
    bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		String dataInput = null;
		int choice = 0;
    board = new Board();

    intheGame();
    do {
			Menu();
			System.out.println("Masukkan Pilihan Anda : ");
			try {
				dataInput = bufferedreader.readLine();
				try {
					choice = Integer.parseInt(dataInput);
					if (choice > 0 && choice == 1) {
            do {
              playerMove(currentPlayer);
              board.paint();
              updateGame(currentPlayer);
              if (currentState == GameState.crossWon) {
                System.out.println("Pemenangnya adalah .... 'X'!");
              }
              else if (currentState == GameState.noughtWon) {
                System.out.println("Pemenangnya adalah .... 'O'!");
              }
              else if (currentState == GameState.draw) {
                System.out.println("Hasilnya Seri!");
              }
              currentPlayer = (currentPlayer == Seed.cross) ? Seed.nought : Seed.cross;
            }
            while (currentState == GameState.playing);
          }
          else if (choice > 0 && choice == 2){
						RulesAndInstructions();
					}
					else {
						System.out.println("Terima Kasih Telah Bermain!!!");
					}
				}
				catch (NumberFormatException e) {
                    System.out.println("Masukan Anda Tidak Sesuai");
				}
			}
			catch (IOException error) {
                System.out.println("Inputan anda Error " + error.getMessage());
            }
		}
		while (choice > 0);
	}

  public void Menu(){
		System.out.println ("Selamat Datang!!!");
		System.out.println ("Menu Utama");
		System.out.println ("[1] Mulai");
		System.out.println ("[2] Peraturan dan Cara Bermain");
		System.out.println ("[0] Keluar");
	}

	public void RulesAndInstructions(){
		System.out.println("Peraturan Permainan :");
		System.out.println("Terdiri atas dua pemain, setiap pemain memasukkan sebuah karakter kedalam 9 kotak dengan karakter masing masing 'X' atau 'O'");
		System.out.println("Bagi pemain yang memasukkan 3 karaker baik dari atas ke bawah, kiri ke kanan maupun secara diagonal adalah pemenangnya.");
		System.out.println();
		System.out.println("Cara bermain : ");
		System.out.println("Anda tinggal memasukkan 2 buah angka dari 1-3, masing masing untuk baris dan kolom");
	}

  public void intheGame(){
    board.init();
    currentPlayer = Seed.cross;
    currentState = GameState.playing;
  }

  public void playerMove(Seed theSeed) {
    boolean validInput = false;
		String RowDatainput = null;
		String ColoumnDatainput = null;
		do{
			if (theSeed == Seed.cross){
				System.out.print("Player 'X', giliranmu (baris[1-3] kolom[1-3]): ");
			}
			else {
				System.out.print("Player 'O', giliranmu (baris[1-3] kolom[1-3]): ");
			}
			try {
				RowDatainput = bufferedreader.readLine();
				ColoumnDatainput = bufferedreader.readLine();
				try {
					int row = Integer.parseInt(RowDatainput) - 1;
					int coloumn = Integer.parseInt (ColoumnDatainput) - 1;
					if (row >=0 && row < Board.rows && coloumn >= 0 && coloumn < Board.coloumns && board.cells[row][coloumn].content == Seed.empty){
            board.cells[row][coloumn].content = theSeed;
            board.currentRow = row;
						board.currentColoumn = coloumn;
						validInput = true;
					}
					else {
						System.out.println("Anda memilih (" + (row + 1) + "," + (coloumn + 1) + "), tapi sudah terisi. Coba Lagi...");
					}
				}
				catch (NumberFormatException error) {
                    System.out.println("Masukan Anda Tidak Sesuai");
                }
			}
			catch (IOException error) {
                System.out.println("Inputan anda Error " + error.getMessage());
            }
		}
		while (!validInput);
  }

  public void updateGame(Seed theSeed){
    if (board.hasWon(theSeed)) {
			currentState = (theSeed == Seed.cross) ? GameState.crossWon : GameState.noughtWon;
		}
		else if (board.isDraw()) {
			currentState = GameState.draw;
		}
  }

  public static void main (String[] args) {
    new tictactoeGame();
  }
}
