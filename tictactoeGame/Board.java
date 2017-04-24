public class Board{
  public static final int rows = 3;
  public static final int coloumns = 3;

  Cell[][] cells;
  int currentRow, currentColoumn;

  public Board(){
    cells = new Cell[rows][coloumns];
    for (int row = 0; row < rows; ++row){
			for (int coloumn = 0; coloumn < coloumns; ++coloumn){
				cells[row][coloumn] = new Cell(row, coloumn);
			}
		}
  }

  public void init() {
    for (int row = 0; row < rows; ++row){
      for (int coloumn = 0; coloumn < coloumns; ++coloumn){
        cells[row][coloumn].clear();
      }
    }
  }

  public boolean isDraw() {
		for (int row = 0; row < rows; ++row){
			for (int coloumn = 0; coloumn < coloumns; ++coloumn){
				if (cells[row][coloumn].content == Seed.empty){
					return false;
				}
			}
		}
		return true;
	}

  public boolean hasWon(Seed theSeed) {
		return (cells[currentRow][0].content == theSeed && cells[currentRow][1].content == theSeed && cells[currentRow][2].content == theSeed || cells[0][currentColoumn].content == theSeed && cells[1][currentColoumn].content == theSeed && cells[2][currentColoumn].content == theSeed || currentRow == currentColoumn && cells[0][0].content == theSeed && cells[1][1].content == theSeed && cells[2][2].content == theSeed || currentRow + currentColoumn == 2 && cells[0][2].content == theSeed && cells[1][1].content == theSeed && cells[2][0].content == theSeed);
	}

  public void paint() {
		for (int row = 0; row < rows; ++row){
			for (int coloumn = 0; coloumn < coloumns; ++coloumn){
				cells[row][coloumn].paint();
				if (coloumn < coloumns - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (row < rows - 1) {
				System.out.println("----------");
			}
		}
		System.out.println();
	}
}
