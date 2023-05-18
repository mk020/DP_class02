package ch22.Sample;

import ch22.Sample.command.*;
import ch22.Sample.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements MouseMotionListener, WindowListener {
    // 그리기 이력 
    private MacroCommand history = new MacroCommand();
    // 그리는 영역 
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 삭제 버튼
    private JButton clearButton  = new JButton("clear");

    // 생성자 
    public Main(String title) {
        super(title);

        // 리스너 등록
        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);

        // ActionListener는 functional interface(actionPerfomed 한개만 선언되어 있음)
        // functional interface 들어갈 자리에 람다식을 넣어줄 수 있다.
        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint(); // 1) canvas 내용이 사라짐 2) 자동으로 paint() 호출됨
            // history를 다 지우고 repaint하니, 아무것도 없음
        });

        // GUI 컴포넌트 추가
        Box buttonBox = new Box(BoxLayout.X_AXIS); // 가로 배치
        buttonBox.add(clearButton);

        Box mainBox = new Box(BoxLayout.Y_AXIS); // 세로 배치
        mainBox.add(buttonBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    // MouseMotionListener용
    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint() /* , 현재시각 */);
        //System.out.println("마우스 이벤트: x 좌표 : "+e.getPoint().getX());
        //System.out.println("마우스 이벤트: y 좌표 : "+e.getPoint().getY());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener용 
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("프로그램이 종료됩니다.");
        System.exit(0);
    }

    @Override public void windowActivated(WindowEvent e) {}
    @Override public void windowClosed(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowIconified(WindowEvent e) {
        System.out.println("미니마이즈 되었습니다.");
    }
    @Override public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
