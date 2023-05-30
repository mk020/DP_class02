package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();
    private Deque<Command> commands2 = new ArrayDeque<>();

    // 실행 
    @Override
    public void execute() {
        // for (Command cmd: commands) { // 내부적으로는 iterator()를 호출해서 동작함 => 스택의 top에서부터 꺼내옴
        //     cmd.execute();
        // }
        
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            commands2.add(commands.pop());
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
    }
}
