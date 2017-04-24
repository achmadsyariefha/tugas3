public class Cell{
  Seed content;

  int row, coloumn;

  public Cell(int row, int coloumn){
    this.row = row;
    this.coloumn = coloumn;
    clear();
  }

  public void clear() {
    content = Seed.empty;
  }

  public void paint() {
    switch (content) {
      case empty: System.out.print("   ");
      break;
      case nought: System.out.print(" O ");
      break;
      case cross: System.out.print(" X ");
      break;
      }
  }
}
