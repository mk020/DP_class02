package hw.ch12;

public class MultiSideBorder extends Border {

  private char borderChar;
  private int num;

  public MultiSideBorder(Display display, char ch, int num) {
    super(display);
    this.borderChar = ch;
    this.num = num;
  }

  @Override
  public int getColumns() {
      // 문자 수는 내용물의 양쪽에 장식 문자만큼 더한 것
      return num + display.getColumns() + num;
  }

  @Override
  public int getRows() {
      // 행수는 내용물의 행수와 같다
      return display.getRows();
  }

  @Override
  public String getRowText(int row) {
      // 지정 행의 내용은 내용물의 지정 행 양쪽에 장식 문자를 붙인 것
      StringBuilder line = new StringBuilder();
      for (int i = 0; i < num; i++) {
        line.append(borderChar);
      }
      return line.toString() + display.getRowText(row) + line.toString();
  }

}
